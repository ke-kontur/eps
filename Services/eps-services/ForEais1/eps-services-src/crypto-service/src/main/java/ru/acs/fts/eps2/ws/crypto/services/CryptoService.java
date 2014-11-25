package ru.acs.fts.eps2.ws.crypto.services;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import ru.acs.fts.eps2.ws.crypto.helpers.ResultProcessor;
import ru.acs.fts.eps2.ws.model.serviceModel.crypto.DoSign;
import ru.acs.fts.eps2.ws.model.serviceModel.shared.DocumentCheckResult;
import ru.acs.fts.eps2.ws.model.serviceModel.shared.DocumentToCheck;
import ru.acs.fts.eps2.ws.utils.helpers.DocumentProcessor;
import ru.acs.fts.eps2.ws.utils.helpers.SignatureProcessor;
import ru.quorus.cryptography.Exception.CryptographyException;
import ru.quorus.cryptography.certificateChecker.impl.CertificateCheckerFactoryImpl;
import ru.quorus.cryptography.certificateChecker.impl.CertificateCheckerImpl;
import ru.quorus.cryptography.certificateChecker.impl.CertificateCheckerParamsImpl;
import ru.quorus.cryptography.signature.DocumentSigner;
import ru.quorus.cryptography.signature.SignatureFactory;
import ru.quorus.cryptography.signature.SignedDocument;
import ru.quorus.cryptography.signature.SignedDocumentParser;
import ru.quorus.cryptography.signature.SignedDocumentSerializer;
import ru.quorus.cryptography.signature.fts.SignatureFactoryImpl;
import ru.quorus.cryptography.signature.fts.impl.SignedDocumentReader;
import ru.quorus.cryptography.unification.Base64Decoder;
import ru.quorus.cryptography.unification.Certificate;
import ru.quorus.cryptography.unification.CertificateParams;
import ru.quorus.cryptography.unification.CertificateStore;
import ru.quorus.cryptography.unification.CertificateStoreParams;
import ru.quorus.cryptography.unification.CryptoProvider;
import ru.quorus.cryptography.unification.CryptoProviderParams;
import ru.quorus.cryptography.unification.UnificationFactory;
import ru.quorus.cryptography.unification.impl.UnificationFactoryImpl;
import ru.quorus.helpers.SignedDocumentObject;

public class CryptoService
{
	private static final Logger log = LoggerFactory.getLogger(CryptoService.class);

	// private String _certificateId = "EPSTest2011";
	private String _certificateId = "Скворцова Наталья Александровна";
    
    private String _needUseCCSForSign = "true";
	private String _needUseCCSForCheck = "true";
	private String _needUseTTS = "true";
	
	private String _ccsAddress = "";
	private String _ccsUserName = "";
	private String _ccsPassword = "";
	private String _ccsProxyAddress = "";
	private String _ccsProxyUserName = "";
	private String _ccsProxyPassword = "";
	private String _needCheckCertOids = "true";


	private String _timeServerAddress = "";
	private String _timeServerProxyAddress = "";
	private String _timeServerProxyUserName = "";
	private String _timeServerProxyUserPassword= "";

	public void setNeedCheckCertOids(String needCheckCertOids)
	{
		this._needCheckCertOids = needCheckCertOids;
	}

	public String getNeedCheckCertOids()
	{
		return this._needCheckCertOids;
	}

	// @formatter:off
	public void setCertificateId( String certificateId ) { _certificateId = certificateId; }
	public String getCertificateId( ) { return _certificateId; }
	
	public void setNeedUseCCSForSign( String needUseCCSForSign ) { _needUseCCSForSign = needUseCCSForSign; }
	public String getNeedUserCCSForSign( ) { return _needUseCCSForSign; }
	
	public void setNeedUseCCSForCheck( String needUseCCSForCheck ) { _needUseCCSForCheck = needUseCCSForCheck; }
	public String getNeedUseCCSForCheck( ) { return _needUseCCSForCheck; }
	
	public void setNeedUseTTS( String needUseTTS ) { _needUseTTS = needUseTTS; }
	public String getNeedUseTTS( ) { return _needUseTTS; }

	public void setCcsAddress( String ccsAddress ) { _ccsAddress = ccsAddress; }
	public String getCcsAddress( ) { return _ccsAddress; }
	
	public void setCcsUserName( String ccsUserName ) { _ccsUserName = ccsUserName; }
	public String getCcsUserName( ) { return _ccsUserName; }
	
	public void setCcsPassword( String ccsPassword ) { _ccsPassword = ccsPassword; }
	public String getCcsPassword( ) { return _ccsPassword; }

	public void setCcsProxyAddress( String ccsProxyAddress ) { _ccsProxyAddress = ccsProxyAddress; }
	public String getCcsProxyAddress( ) { return _ccsProxyAddress; }
	
	public void setCcsProxyUserName( String ccsProxyUserName ) { _ccsProxyUserName = ccsProxyUserName; }
	public String getCcsProxyUserName( ) { return _ccsProxyUserName; }

	public void setCcsProxyPassword( String ccsProxyPassword ) { _ccsProxyPassword = ccsProxyPassword; }
	public String getCcsProxyPassword( ) { return _ccsProxyPassword; }

	public void setTimeServerAddress( String timeServerAddress ) { _timeServerAddress = timeServerAddress; }
	public String getTimeServerAddress( ) { return _timeServerAddress; }

	public void setTimeServerProxyAddress( String timeServerProxyAddress ) { _timeServerProxyAddress = timeServerProxyAddress; }
	public String getTimeServerProxyAddress( ) { return _timeServerProxyAddress; }
	
	public void setTimeServerProxyUserName( String timeServerProxyUserName ) { _timeServerProxyUserName = timeServerProxyUserName; }
	public String getTimeServerProxyUserName( ) { return _timeServerProxyUserName; }

	public void setTimeServerProxyUserPassword( String timeServerProxyUserPassword ) { _timeServerProxyUserPassword = timeServerProxyUserPassword; }
	public String getTimeServerProxyUserPassword( ) { return _timeServerProxyUserPassword; }
	// @formatter:on
	
	public List< DocumentCheckResult > checkSignature( DocumentToCheck document ) 
		throws XPathExpressionException, ParserConfigurationException, SAXException, IOException, CryptographyException
	{
		if ( document.getIsContainer( ) )
			return checkSignatureContainer( document );
		else
			return checkSignatureDocument( document );
	}
	
	public DoSign sign( DoSign document ) 
		throws UnsupportedEncodingException, CryptographyException
	{
		String xmlDocStr = DocumentProcessor.unpackFromBase64( document.getBytes( ) );
		
		String signed = sign( xmlDocStr );
		
		DoSign res = new DoSign( );
		res.setBytes( DocumentProcessor.packToBase64( signed ) );
		
		return res;
	}
	
	private List< DocumentCheckResult > checkSignatureContainer( DocumentToCheck document ) 
		throws SAXException, IOException, ParserConfigurationException, XPathExpressionException, CryptographyException
	{
		List< DocumentCheckResult > results = new ArrayList< DocumentCheckResult >( );
		
		String xmlDocStr = DocumentProcessor.unpackFromBase64( document.getDocument( ) );
		Document xmlSignDoc = DocumentProcessor.parse( xmlDocStr );
		
		checkSignature( xmlDocStr, xmlSignDoc.getDocumentElement( ), results );
		
		Document container = SignatureProcessor.getDocumentWithoutSignature( 
			xmlSignDoc.getDocumentElement( ), 
			DocumentProcessor.getDocumentBuilder( ).newDocument( ) 
		);
		for ( String xPath : document.getXPath( ) )
		{
			List< Element > innerDocs = DocumentProcessor.getInnerDocuments( container, xPath );
			for ( Element innerDoc : innerDocs )
			{
				checkSignature( null, innerDoc, results );
			}
		}

		return results;
	}
	
	private List< DocumentCheckResult > checkSignatureDocument( DocumentToCheck document ) 
		throws XPathExpressionException, ParserConfigurationException, SAXException, IOException, CryptographyException
	{
		List< DocumentCheckResult > results = new ArrayList< DocumentCheckResult >( );
		
		String xmlDocStr = DocumentProcessor.unpackFromBase64( document.getDocument( ) );
		Document xmlSignDoc = DocumentProcessor.parse( xmlDocStr );
		
		checkSignature( xmlDocStr, xmlSignDoc.getDocumentElement( ), results );
		
		return results;		
	}
	
	private void checkSignature( String xmlDocStr, Element signDoc, List< DocumentCheckResult > results ) 
		throws ParserConfigurationException, XPathExpressionException
	{
		Document doc = SignatureProcessor.getDocumentWithoutSignature( signDoc, DocumentProcessor.getDocumentBuilder( ).newDocument( ) );
		String documentId = DocumentProcessor.getDocumentID( doc );
		
		if ( null == xmlDocStr )
		{
			try
			{
				StringWriter sw = new StringWriter( );
				Transformer t = TransformerFactory.newInstance( ).newTransformer( );
				t.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "yes" );
				t.setOutputProperty( OutputKeys.INDENT, "no" );
				t.transform( new DOMSource( signDoc ), new StreamResult( sw ) );
				xmlDocStr = sw.toString( );
			}
			catch ( Exception exc )
			{
				results.add( ResultProcessor.createResult( ResultProcessor.SIGNATURE_NOT_VALID, documentId ) );
				return ;
			}
		}
		
		try
		{
			new CertificateCheckerFactoryImpl( );
			
			SignatureFactory f = SignatureFactory.newInstance( SignatureFactory.URN_QUORUS_SIGNATURE_1_0 );

			f.setCertificationCheckerProperty( "Address", _ccsAddress );
			f.setCertificationCheckerProperty( "UserName", _ccsUserName );
			f.setCertificationCheckerProperty( "Password", _ccsPassword );
			f.setCertificationCheckerProperty( "ProxyAddress", _ccsProxyAddress );
			f.setCertificationCheckerProperty( "ProxyUserName", _ccsProxyUserName );
			f.setCertificationCheckerProperty( "ProxyPassword", _ccsProxyPassword );

			new SignedDocumentReader( ( SignatureFactoryImpl )f );

			SignedDocumentParser parser = f.newSignedDocumentParser( );
			SignedDocument signedDocument = parser.parse( SignedDocumentObject.getSignedDocumentObject( xmlDocStr.getBytes( "UTF-8" ) ) );

			if(this._needCheckCertOids.equals("true")) {
				ByteArrayInputStream bas = new ByteArrayInputStream(signedDocument.getCertificateBytes());

				CertificateFactory cf = CertificateFactory.getInstance("X.509");
				java.security.cert.Certificate c = cf.generateCertificate(bas);

				X509Certificate t = (X509Certificate) c;
				Collection keys = t.getExtendedKeyUsage();
				String result = StringUtils.join(keys, ", ");
				log.info("Проверка документа подписанного сертификатом " + result + " " + t.getSubjectDN());
			}

			int verify = signedDocument.verifyCert( );
			f.getSignatureCheckerFactory( ).destroy( );
			
			if ( 0 == verify )
			{
				results.add( ResultProcessor.createResult( ResultProcessor.SIGNATURE_VALID, documentId ) );
			}
			else
			{
				results.add( ResultProcessor.createResult( ResultProcessor.SIGNATURE_NOT_VALID, documentId ) );
			}
		}
		catch ( Throwable t )
		{
			results.add( ResultProcessor.createResult( ResultProcessor.SIGNATURE_NOT_VALID, documentId ) );
		}		
	}
	
	/** EAIS Signature 2.0.1 */
	/*
	private void checkSignature( String xmlDocStr, Element signDoc, List< DocumentCheckResult > results ) 
		throws XPathExpressionException, ParserConfigurationException, CryptographyException, UnsupportedEncodingException
	{		
		Document doc = SignatureProcessor.getDocumentWithoutSignature( signDoc, DocumentProcessor.getDocumentBuilder( ).newDocument( ) );
		String documentId = DocumentProcessor.getDocumentID( doc );
		
		if ( null == xmlDocStr )
		{
			try
			{
				StringWriter sw = new StringWriter( );
				Transformer t = TransformerFactory.newInstance( ).newTransformer( );
				t.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "yes" );
				t.setOutputProperty( OutputKeys.INDENT, "no" );
				t.transform( new DOMSource( signDoc ), new StreamResult( sw ) );
				xmlDocStr = sw.toString( );
			}
			catch ( Exception exc )
			{
				results.add( ResultProcessor.createResult( ResultProcessor.SIGNATURE_NOT_VALID, documentId ) );
				return ;
			}
		}
		
		// SignatureFactory f =
		SignatureFactory.newInstance( SignatureFactory.URN_QUORUS_SIGNATURE_1_0 );
		
		String[ ] props = getVerifierProps( _needUseCCSForCheck );
		
		QuickValidatorImpl validator = new QuickValidatorImpl( );		  
		InputStream is = new ByteArrayInputStream( xmlDocStr.getBytes( "UTF-8" ) );
		try
		{
			int res = validator.verify( is, props );
			if ( 0 == res )
			{
				results.add( ResultProcessor.createResult( ResultProcessor.SIGNATURE_VALID, documentId ) );
			}
			else
			{
				results.add( ResultProcessor.createResult( ResultProcessor.SIGNATURE_NOT_VALID, documentId ) );
			}
		}
		catch ( Throwable t )
		{
			results.add( ResultProcessor.createResult( ResultProcessor.SIGNATURE_NOT_VALID, documentId ) );
		}
	}	
	*/
	
	private String sign( String xmlDocStr ) 
		throws CryptographyException, UnsupportedEncodingException 
	{						
		// String[ ] verifierProps = getVerifierProps( _needUseCCSForSign );
		// String[ ] signerProps = getSignerProps( );
		
		// byte[ ] certBytes = getCertificateValue( _certificateId ).toByteArray( );
		
		try
		{
			SignatureFactory f = SignatureFactory.newInstance( SignatureFactory.URN_QUORUS_SIGNATURE_1_0 );
			
			UnificationFactory uf = f.getUnificationFactory( );
			uf.setProperty( "TimeServerAddress", _timeServerAddress );
			uf.setProperty( "TimeServerProxyAddress", _timeServerProxyAddress );
			uf.setProperty( "TimeServerProxyUserName", _timeServerProxyUserName );
			uf.setProperty( "TimeServerProxyUserPassword", _timeServerProxyUserPassword );
			uf.setProperty( "UseRSASigningTime", "true" );

			if ( true ) // SignCheckCertificate
			{
				Certificate certificate = getCertificate( _certificateId );
				SignatureFactoryImpl sf = ( SignatureFactoryImpl )f;
				sf.setCertificationCheckerProperty( "Address", _ccsAddress );
				sf.setCertificationCheckerProperty( "UserName", _ccsUserName );
				sf.setCertificationCheckerProperty( "Password", _ccsPassword );
				sf.setCertificationCheckerProperty( "ProxyAddress", _ccsProxyAddress );
				sf.setCertificationCheckerProperty( "ProxyUserName", _ccsProxyUserName );
				sf.setCertificationCheckerProperty( "ProxyPassword", _ccsProxyPassword );

				CertificateCheckerFactoryImpl certificateCheckerFactory = sf.getSignatureCheckerFactory( );
				CertificateCheckerParamsImpl certificateCheckerParams = sf.getCertificateCheckerParams( );
				CertificateCheckerImpl checker = certificateCheckerFactory.newCertificateChecker( certificateCheckerParams );
				certificateCheckerParams.destroy( ); 
				certificateCheckerParams = null;
				
				int resCheckCertificateProperty = checker.check( certificate );
				certificate.close( );
				checker.destroy( ); 
				checker = null;
				
				if ( 0 != resCheckCertificateProperty )
				{
					throw new CryptographyException( resCheckCertificateProperty, String.format( "Сертификат не валиден. Подписыватель ЭЦП вернул %d", resCheckCertificateProperty ) );
				}
			}

			DocumentSigner signer = f.newDocumentSigner( );
			signer.setCertificateBytes( getCertificateValue( _certificateId ).toByteArray( ) );
			signer.setObject( SignedDocumentObject.getSignedDocumentObject( xmlDocStr.getBytes( "UTF-8" ) ) );
			
			SignedDocumentSerializer serializer = f.newSignedDocumentSerializer( );
			ByteArrayOutputStream output = new ByteArrayOutputStream( );
			serializer.serialize( signer.getSignedDocument( ), output );
			f.getSignatureCheckerFactory( ).destroy( );
			
			return new String( output.toByteArray( ), "UTF-8" );
		} 
		catch ( Throwable e ) 
		{
			String err = e.getMessage( );
			int index = err.indexOf( "Error code (CryptographyException)" );
			if ( index >= 0 )
			{
				String err1 = err.substring( 0, index );
				
				UnificationFactory factory = new UnificationFactoryImpl( );
				Base64Decoder decoder = factory.newBase64Decoder( );
				ByteArrayOutputStream output = new ByteArrayOutputStream( );
				decoder.decode( new ByteArrayInputStream( err1.getBytes( ) ), output );
				err = output.toString( ) + err.substring( index + 6 );
			}

			throw new CryptographyException( e );
	    }		
	}
	
	/** EAIS Signature v2.0.1 */
	/*
	private String sign( String xmlDocStr ) 
		throws CryptographyException, UnsupportedEncodingException 
	{						
		// SignatureFactory f = 
		SignatureFactory.newInstance( SignatureFactory.URN_QUORUS_SIGNATURE_1_0 );
		
		String[ ] verifierProps = getVerifierProps( _needUseCCSForSign );
		String[ ] signerProps = getSignerProps( );
		
		byte[ ] certBytes = getCertificateValue( _certificateId ).toByteArray( );
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream( );
		
		QuickSignerImpl signer = new QuickSignerImpl( );
		InputStream is = new ByteArrayInputStream( xmlDocStr.getBytes( "UTF-8" ) );
		InputStream isCert = new ByteArrayInputStream( certBytes );
		int res = signer.sign( is, isCert, signerProps, verifierProps, baos );
		if ( 0 != res )
			throw new CryptographyException( res, String.format( "Подписыватель ЭЦП вернул %d", res ) );
		
		return new String( baos.toByteArray( ), "UTF-8" );
	}
	*/

	/** EAIS Signature v2.0.1 */
	/*
	private String[ ] getVerifierProps( String needUseCCSForWhat )
	{
		boolean needCcs = needUseCCSForWhat.equalsIgnoreCase( "true" );
		
		String[ ] props = new String[ 8 ];
		props[ 0 ] = needCcs ? _ccsAddress : null;
		props[ 1 ] = needCcs ? _ccsUserName : null;
		props[ 2 ] = needCcs ? _ccsPassword : null;
		props[ 3 ] = needCcs ? _ccsProxyAddress : null;
		props[ 4 ] = needCcs ? _ccsProxyUserName : null;
		props[ 5 ] = needCcs ? _ccsProxyPassword : null;
		props[ 6 ] = null; // localRevListVerify
		props[ 7 ] = null; // rootCertificateRevListVerify
		
		return props;
	}
	*/
	
	/** EAIS Signature v2.0.1 */
	/*
	private String[ ] getSignerProps( )
	{
		boolean needTts = _needUseTTS.equalsIgnoreCase( "true" );		
		
		String[ ] props = new String[ 6 ];
		
		props[ 0 ] = needTts ? _timeServerAddress : null;
		props[ 1 ] = needTts ? _timeServerProxyAddress : null;
		props[ 2 ] = needTts ? _timeServerProxyUserName : null;
		props[ 3 ] = needTts ? _timeServerProxyUserPassword : null;
		props[ 4 ] = "yes"; // SignCheckCertificate
		props[ 5 ] = null; // UseRSASigningTime
		
		return props;
	}
	*/	
	
	private Certificate getCertificate( String certificateName ) 
	{
		UnificationFactoryImpl unificationFactory = new UnificationFactoryImpl( );
		
		CryptoProviderParams cryptoProviderParams = unificationFactory.newCryptoProviderParams( );
		CryptoProvider cryptoProvider = unificationFactory.newCryptoProvider( cryptoProviderParams );
		
		CertificateStoreParams certificateStoreParams = unificationFactory.newCertificateStoreParams( "MY" );
		CertificateStore certificateStore = cryptoProvider.getCertificateStore( certificateStoreParams );
		cryptoProvider.destroy( );
		
		CertificateParams certificateParams = unificationFactory.newCertificateParams( certificateName );
		Certificate certificate = certificateStore.getCertificate( certificateParams );
		certificateStore.destroy( );
		
		return certificate;
	}	
	
	private ByteArrayOutputStream getCertificateValue( String certificateName ) 
	{
		UnificationFactoryImpl unificationFactory = new UnificationFactoryImpl( );
		CryptoProviderParams cryptoProviderParams = unificationFactory.newCryptoProviderParams( );
		CryptoProvider cryptoProvider = unificationFactory.newCryptoProvider( cryptoProviderParams );

		CertificateStoreParams certificateStoreParams = unificationFactory.newCertificateStoreParams( "MY" );
		CertificateStore certificateStore = cryptoProvider.getCertificateStore( certificateStoreParams );
		cryptoProvider.destroy( );
		
		CertificateParams certificateParams = unificationFactory.newCertificateParams( certificateName );
		Certificate certificate = certificateStore.getCertificate( certificateParams );
		certificateStore.destroy();
		
		ByteArrayOutputStream certificateValue = new ByteArrayOutputStream( );
		certificate.exportPublicKey( certificateValue );
		certificate.close( );
		
		return certificateValue;
	}
}
