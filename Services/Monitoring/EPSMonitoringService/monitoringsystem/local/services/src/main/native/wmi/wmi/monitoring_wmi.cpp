// wmi.cpp : Defines the entry point for the DLL application.
//
#include "monitoring_wmi.h"
#include <iostream>
#define _WIN32_DCOM
#define FORCE_UNICODE
using namespace std;
#include <comdef.h>
#include <Wbemidl.h>
#include <tchar.h>
#include <jni.h>
#include <list>
#include "monitoring_utils.h"

# pragma comment(lib, "wbemuuid.lib")

void throwException(JNIEnv* env, char* szMsg)
{
	jclass excClazz = env->FindClass("ru/acs/monitoring/utils/exceptions/WMIException");
	env->ThrowNew(excClazz, szMsg);
	throw "internal";
}



JNIEXPORT jint JNICALL Java_ru_acs_monitoring_utils_WMI_ConnectServer
(JNIEnv *env, jobject obj, jstring serverAndNamespace, jstring userName, jstring password) {
try
	{
		HRESULT hres;

		// Extract parameters
		const wchar_t *wszServerAndNamespace = NULL;
		if (serverAndNamespace != NULL)
			wszServerAndNamespace = (wchar_t *)env->GetStringChars(serverAndNamespace, 0);		

		const wchar_t *wszUserName = NULL;
		if (userName != NULL)
			wszUserName = (wchar_t *)env->GetStringChars(userName, 0);

		const wchar_t *wszPassword = NULL;
		if (password != NULL)
			wszPassword = (wchar_t *)env->GetStringChars(password, 0);

		StringFromJavaReleaser str1(env, serverAndNamespace, wszServerAndNamespace);
		StringFromJavaReleaser str2(env, userName, wszUserName);
		StringFromJavaReleaser str3(env, password, wszPassword);

		// Step 1: --------------------------------------------------
		// Initialize COM. ------------------------------------------

		hres =  CoInitializeEx(0, COINIT_MULTITHREADED);
		if (FAILED(hres))
			throwException(env, "Error calling CoInitializeEx");

		// Step 2: --------------------------------------------------
		// Set general COM security levels --------------------------
		// Note: If you are using Windows 2000, you need to specify -
		// the default authentication credentials for a user by using
		// a SOLE_AUTHENTICATION_LIST structure in the pAuthList ----
		// parameter of CoInitializeSecurity ------------------------

		hres =  CoInitializeSecurity(
			NULL,
			-1,                          // COM authentication
			NULL,                        // Authentication services
			NULL,                        // Reserved
			RPC_C_AUTHN_LEVEL_DEFAULT,   // Default authentication
			RPC_C_IMP_LEVEL_IMPERSONATE, // Default Impersonation
			NULL,                        // Authentication info
			EOAC_NONE,                   // Additional capabilities
			NULL                         // Reserved
			);

		// Step 3: ---------------------------------------------------
		// Obtain the initial locator to WMI -------------------------

		IWbemLocator *pLoc = NULL;

		hres = CoCreateInstance(
			CLSID_WbemLocator,
			0,
			CLSCTX_INPROC_SERVER,
			IID_IWbemLocator, (LPVOID *) &pLoc);

		IUnknownHandlerReleaser pLockReleaser(pLoc);

		if (FAILED(hres))
			throwException(env, "Error creating IWbemLocator");

		// Step 4: -----------------------------------------------------
		// Connect to WMI through the IWbemLocator::ConnectServer method

		IWbemServices *pSvc = NULL;

		// Connect to the root\cimv2 namespace with
		// the current user and obtain pointer pSvc
		// to make IWbemServices calls.
		hres = pLoc->ConnectServer(
			 (wchar_t* const)wszServerAndNamespace, // Object path of WMI namespace
			 (wchar_t* const)(wcslen(wszUserName) > 0 ? wszUserName : NULL), // User name. NULL = current user
			 (wchar_t* const)(wcslen(wszPassword) > 0 ? wszPassword : NULL), // User password. NULL = current
			 0,                       // Locale. NULL indicates current
			 NULL,                    // Security flags.
			 0,                       // Authority (e.g. Kerberos)
			 0,                       // Context object
			 &pSvc                    // pointer to IWbemServices proxy
			 );

		if (FAILED(hres))
		{
			pLoc->Release();
			throwException(env, "Failed to connect");
		}


		// Step 5: --------------------------------------------------
		// Set security levels on the proxy -------------------------

		hres = CoSetProxyBlanket(
		   pSvc,                        // Indicates the proxy to set
		   RPC_C_AUTHN_WINNT,           // RPC_C_AUTHN_xxx
		   RPC_C_AUTHZ_NONE,            // RPC_C_AUTHZ_xxx
		   NULL,                        // Server principal name
		   RPC_C_AUTHN_LEVEL_CALL,      // RPC_C_AUTHN_LEVEL_xxx
		   RPC_C_IMP_LEVEL_IMPERSONATE, // RPC_C_IMP_LEVEL_xxx
		   NULL,                        // client identity
		   EOAC_NONE                    // proxy capabilities
		);

		if (FAILED(hres))
		{
			pSvc->Release();
			pLoc->Release();
			throwException(env, "Error setting security levels on the proxy");
		}

		// Return the pointer to IWbemServices, it will be passed back to us later
		return (DWORD)pSvc;
	}
	catch (...)
	{
		// If this is a Java exception we threw, just let it through
		// Otherwise it's an access violation or something: convert to Java exception
		if (!env->ExceptionOccurred())		
			throwException(env, "Сбой при подключении");					

		return 0;
	}
}

JNIEXPORT jint JNICALL Java_ru_acs_monitoring_utils_WMI_GetEventLogErrorsCount
(JNIEnv * env, jobject, jint nativeHandle, jstring logName, jstring source, jstring begin, jstring end) {
    try
	{
		HRESULT hres;

		// The handle is actually the IWbemServices pointer
		IWbemServices *pSvc = (IWbemServices *)nativeHandle;

		// Extract parameters
		const wchar_t *wszLogName = NULL;
		if (logName != NULL)
			wszLogName = (wchar_t *)env->GetStringChars(logName, 0);

		const wchar_t *wszSource = NULL;
		if (source != NULL)
			wszSource = (wchar_t *)env->GetStringChars(source, 0);

		const wchar_t *wszBegin = NULL;
		if (begin != NULL)
			wszBegin = (wchar_t *)env->GetStringChars(begin, 0);

		const wchar_t *wszEnd = NULL;
		if (end != NULL)
			wszEnd = (wchar_t *)env->GetStringChars(end, 0);

		StringFromJavaReleaser str1(env, logName, wszLogName);
		StringFromJavaReleaser str2(env, source, wszSource);
		StringFromJavaReleaser str3(env, begin, wszBegin);
		StringFromJavaReleaser str4(env, end, wszEnd);

		// Enumerate instances of the specified class
		IEnumWbemClassObject* pEnumerator = NULL;
		hres = pSvc->ExecQuery(
			bstr_t("WQL"),
			bstr_t("SELECT EventIdentifier FROM Win32_NTLogEvent WHERE Logfile = '") +
			_bstr_t(wszLogName) + 
			bstr_t("' AND SourceName = '") +
			_bstr_t(wszSource) + 
			bstr_t("' AND TimeWritten > '") +
			_bstr_t(wszBegin) + 
			//Not used now
			//bstr_t("' AND TimeWritten < '") +
			//_bstr_t(wszEnd) + 
			bstr_t("' AND EventType = 1"),
			WBEM_FLAG_FORWARD_ONLY | WBEM_FLAG_RETURN_IMMEDIATELY,
			NULL,
			&pEnumerator);

		IUnknownHandlerReleaser keeper(pEnumerator);

		if (FAILED(hres))
			throwException(env, "Error while calling ExecQuery");

		// Get the data from the query

		IWbemClassObject *pclsObj = NULL;
		ULONG uReturn = 0;

		jint result = 0;

		// Limit maximum results to 1000 to avoid huge delays
		while (pEnumerator)
		{
			HRESULT hr = pEnumerator->Next(WBEM_INFINITE, 1,
				&pclsObj, &uReturn);

			if(0 == uReturn)
			{
				break;
			}
			IUnknownHandlerReleaser releaser(pclsObj);

			result++;
		}	

		return result;
	}
	catch (...)
	{
		// If this is a Java exception we threw, just let it through
		// Otherwise it's an access violation or something: convert to Java exception
		if (!env->ExceptionOccurred())		
			throwException(env, "Internal error");
		

		return 0;
	} 
}

/*
 * Class:     ru_acs_monitoring_utils_WMI
 * Method:    GetTotalMemorySize
 * Signature: (I)J
 */
JNIEXPORT jlong JNICALL Java_ru_acs_monitoring_utils_WMI_GetTotalMemorySize
(JNIEnv * env, jobject, jint nativeHandle) {
	try
	{
		HRESULT hres;

		// The handle is actually the IWbemServices pointer
		IWbemServices *pSvc = (IWbemServices *)nativeHandle;

		// Enumerate instances of the specified class
		IEnumWbemClassObject* pEnumerator = NULL;
		hres = pSvc->ExecQuery(
			bstr_t("WQL"),
			bstr_t("SELECT Capacity FROM Win32_PhysicalMemory"),
			WBEM_FLAG_FORWARD_ONLY | WBEM_FLAG_RETURN_IMMEDIATELY,
			NULL,
			&pEnumerator);

		IUnknownHandlerReleaser keeper(pEnumerator);

		if (FAILED(hres))
			throwException(env, "Error while calling ExecQuery");

		// Get the data from the query

		IWbemClassObject *pclsObj = NULL;
		ULONG uReturn = 0;

		jlong result = 0;

		// Limit maximum results to 1000 to avoid huge delays
		while (pEnumerator)
		{
			HRESULT hr = pEnumerator->Next(WBEM_INFINITE, 1,
				&pclsObj, &uReturn);

			if(0 == uReturn)
			{
				break;
			}

			IUnknownHandlerReleaser releaser(pclsObj);

			VARIANT vtProp;
			VariantInit(&vtProp);

			// Get the value of the search field property
			hr = pclsObj->Get(L"Capacity", 0, &vtProp, 0, 0);
			
			if (vtProp.bstrVal != NULL)
				result += _wtoi64(vtProp.bstrVal);			

			VariantClear(&vtProp);
		}		

		// Cleanup

		return result;
	}
	catch (...)
	{
		// If this is a Java exception we threw, just let it through
		// Otherwise it's an access violation or something: convert to Java exception
		if (!env->ExceptionOccurred())		
			throwException(env, "Internal error");
		

		return NULL;
	}
}

/*
 * Class:     ru_acs_monitoring_utils_WMI
 * Method:    GetFreeMemorySize
 * Signature: (I)J
 */
JNIEXPORT jlong JNICALL Java_ru_acs_monitoring_utils_WMI_GetFreeMemorySize
(JNIEnv * env, jobject, jint nativeHandle) {
	try
	{
		HRESULT hres;

		// The handle is actually the IWbemServices pointer
		IWbemServices *pSvc = (IWbemServices *)nativeHandle;

		// Enumerate instances of the specified class
		IEnumWbemClassObject* pEnumerator = NULL;
		hres = pSvc->ExecQuery(
			bstr_t("WQL"),
			bstr_t("SELECT FreePhysicalMemory FROM Win32_OperatingSystem"),
			WBEM_FLAG_FORWARD_ONLY | WBEM_FLAG_RETURN_IMMEDIATELY,
			NULL,
			&pEnumerator);

		IUnknownHandlerReleaser keeper(pEnumerator);

		if (FAILED(hres))
			throwException(env, "Error while calling ExecQuery");

		// Get the data from the query

		IWbemClassObject *pclsObj = NULL;
		ULONG uReturn = 0;

		jlong result = 0;

		// Limit maximum results to 1000 to avoid huge delays
		while (pEnumerator)
		{
			HRESULT hr = pEnumerator->Next(WBEM_INFINITE, 1,
				&pclsObj, &uReturn);	

			if(0 == uReturn)
			{
				break;
			}

			IUnknownHandlerReleaser releaser(pclsObj);

			VARIANT vtProp;
			VariantInit(&vtProp);

			// Get the value of the search field property
			hr = pclsObj->Get(L"FreePhysicalMemory", 0, &vtProp, 0, 0);

			if (vtProp.bstrVal != NULL)
				result += _wtoi64(vtProp.bstrVal);			

			VariantClear(&vtProp);			
		}		

		// Cleanup

		return result;
	}
	catch (...)
	{
		// If this is a Java exception we threw, just let it through
		// Otherwise it's an access violation or something: convert to Java exception
		if (!env->ExceptionOccurred())		
			throwException(env, "Internal error");
		

		return NULL;
	}
}

JNIEXPORT jobjectArray JNICALL Java_ru_acs_monitoring_utils_WMI_GetRunningServicesNames
(JNIEnv * env, jobject, jint nativeHandle) {
	try
	{
		HRESULT hres;

		// The handle is actually the IWbemServices pointer
		IWbemServices *pSvc = (IWbemServices *)nativeHandle;

		// Enumerate instances of the specified class		
		IEnumWbemClassObject* pEnumerator = NULL;
		hres = pSvc->ExecQuery(
			bstr_t("WQL"),
			bstr_t("SELECT NAME FROM Win32_Service WHERE State = 'Running'"),
			WBEM_FLAG_FORWARD_ONLY | WBEM_FLAG_RETURN_IMMEDIATELY,
			NULL,
			&pEnumerator);

		IUnknownHandlerReleaser keeper(pEnumerator);

		if (FAILED(hres))
			throwException(env, "Error while calling ExecQuery");

		// Get the data from the query

		IWbemClassObject *pclsObj = NULL;
		ULONG uReturn = 0;

		std::list<jstring>	listInstances;

		// Limit maximum results to 1000 to avoid huge delays
		while (pEnumerator && listInstances.size() < 1000)
		{
			HRESULT hr = pEnumerator->Next(WBEM_INFINITE, 1,
				&pclsObj, &uReturn);

			if(0 == uReturn)
			{
				break;
			}

			IUnknownHandlerReleaser releaser(pclsObj);

			VARIANT vtProp;
			VariantInit(&vtProp);

			// Get the value of the search field property
			hr = pclsObj->Get(L"NAME", 0, &vtProp, 0, 0);

			// Put it in the ouput vector
			if (vtProp.vt == VT_BSTR)
				listInstances.push_back(
					env->NewString((jchar *)vtProp.bstrVal, wcslen(vtProp.bstrVal)));

			VariantClear(&vtProp);
		}

		// Make output vector from the list of instance names
		jobjectArray arrayObjects = env->NewObjectArray(listInstances.size(),
			env->FindClass("java/lang/String"), NULL);

		int i = 0;
		for (std::list<jstring>::iterator it = listInstances.begin();
			it != listInstances.end(); ++it, ++i)
		{
			env->SetObjectArrayElement(arrayObjects, i, *it);
		}


		// Cleanup
		return arrayObjects;
	}
	catch (...)
	{
		// If this is a Java exception we threw, just let it through
		// Otherwise it's an access violation or something: convert to Java exception
		if (!env->ExceptionOccurred())		
			throwException(env, "Internal error");
		

		return NULL;
	}
}

JNIEXPORT void JNICALL Java_ru_acs_monitoring_utils_WMI_CloseHandle
  (JNIEnv *env, jobject, jint nativeHandle)
{
	try
	{
		// The handle is actually the IWbemServices pointer
		IWbemServices *pSvc = (IWbemServices *)nativeHandle;
		if (pSvc)
			pSvc->Release();
	}
	catch (...)
	{
		// If this is a Java exception we threw, just let it through
		// Otherwise it's an access violation or something: convert to Java exception
		if (!env->ExceptionOccurred())		
			throwException(env, "Internal error");
	}
}

#ifdef _MANAGED
#pragma managed(push, off)
#endif

BOOL APIENTRY DllMain( HMODULE hModule,
                       DWORD  ul_reason_for_call,
                       LPVOID lpReserved
					 )
{
    return TRUE;
}

#ifdef _MANAGED
#pragma managed(pop)
#endif

