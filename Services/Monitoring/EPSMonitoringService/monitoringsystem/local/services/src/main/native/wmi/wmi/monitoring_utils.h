/**
* Utility classes
*/
class StringFromJavaReleaser {
private:
	const wchar_t * gotten;
	jstring initial;
	JNIEnv *env;
public:
	StringFromJavaReleaser(JNIEnv *env, jstring initial, const wchar_t * gotten) {
		this->env = env;
		this->initial = initial;
		this->gotten = gotten;
	}

	~StringFromJavaReleaser() {
		if (initial != NULL)
			env->ReleaseStringChars(initial, (jchar*)gotten);
	}
};

class IUnknownHandlerReleaser {
private:
	IUnknown * iunknoun;
public:
	IUnknownHandlerReleaser(IUnknown * iunknoun) {
		this->iunknoun = iunknoun;
	}

	~IUnknownHandlerReleaser() {
		if (iunknoun != NULL)
			iunknoun->Release();
	}
};