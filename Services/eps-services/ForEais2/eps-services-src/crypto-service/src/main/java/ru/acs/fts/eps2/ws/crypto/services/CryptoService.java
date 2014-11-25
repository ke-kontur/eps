package ru.acs.fts.eps2.ws.crypto.services;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.acs.fts.eps2.ws.crypto.helpers.ResultProcessor;
import ru.acs.fts.eps2.ws.model.serviceModel.crypto.DoSign;
import ru.acs.fts.eps2.ws.model.serviceModel.shared.DocumentCheckResult;
import ru.acs.fts.eps2.ws.model.serviceModel.shared.DocumentToCheck;
import ru.acs.fts.eps2.ws.utils.helpers.Base64Coder;
import ru.acs.fts.eps2.ws.utils.helpers.DocumentProcessor;
import ru.acs.fts.eps2.ws.utils.helpers.SignatureProcessor;
import ru.quorus.cryptography.Exception.CryptographyException;
import ru.quorus.cryptography.certificateChecker.impl.CertificateCheckerFactoryImpl;
import ru.quorus.cryptography.signature.SignatureFactory;
import ru.quorus.cryptography.signature.SignedDocument;
import ru.quorus.cryptography.signature.SignedDocumentParser;
import ru.quorus.cryptography.signature.fts.SignatureFactoryImpl;
import ru.quorus.cryptography.signature.fts.impl.SignedDocumentReader;
import ru.quorus.cryptography.unification.Certificate;
import ru.quorus.cryptography.unification.CertificateParams;
import ru.quorus.cryptography.unification.CertificateStore;
import ru.quorus.cryptography.unification.CertificateStoreParams;
import ru.quorus.cryptography.unification.CryptoProvider;
import ru.quorus.cryptography.unification.CryptoProviderParams;
import ru.quorus.cryptography.unification.impl.QuickSignerImpl;
import ru.quorus.cryptography.unification.impl.QuickValidatorImpl;
import ru.quorus.cryptography.unification.impl.UnificationFactoryImpl;
import ru.quorus.helpers.SignedDocumentObject;

public class CryptoService
{
    private static final Logger log = LoggerFactory.getLogger(CryptoService.class);
    private String _certificateId = "Скворцова Наталья Александровна";
    private String _needUseCCSForSign = "true";
    private String _needCheckCertOids = "true";
    private String _needUseCCSForCheck = "true";
    private String _needUseTTS = "true";
    private String _ccsAddress = "";
    private String _ccsUserName = "";
    private String _ccsPassword = "";
    private String _ccsProxyAddress = "";
    private String _ccsProxyUserName = "";
    private String _ccsProxyPassword = "";
    private String _timeServerAddress = "";
    private String _timeServerProxyAddress = "";
    private String _timeServerProxyUserName = "";
    private String _timeServerProxyUserPassword = "";

    public void setCertificateId(String certificateId)
    {
        this._certificateId = certificateId;
    }

    public String getCertificateId()
    {
        return this._certificateId;
    }

    public void setNeedUseCCSForSign(String needUseCCSForSign)
    {
        this._needUseCCSForSign = needUseCCSForSign;
    }

    public String getNeedUserCCSForSign()
    {
        return this._needUseCCSForSign;
    }

    public void setNeedCheckCertOids(String needCheckCertOids)
    {
        this._needCheckCertOids = needCheckCertOids;
    }

    public String getNeedCheckCertOids()
    {
        return this._needCheckCertOids;
    }

    public void setNeedUseCCSForCheck(String needUseCCSForCheck)
    {
        this._needUseCCSForCheck = needUseCCSForCheck;
    }

    public String getNeedUseCCSForCheck()
    {
        return this._needUseCCSForCheck;
    }

    public void setNeedUseTTS(String needUseTTS)
    {
        this._needUseTTS = needUseTTS;
    }

    public String getNeedUseTTS()
    {
        return this._needUseTTS;
    }

    public void setCcsAddress(String ccsAddress)
    {
        this._ccsAddress = ccsAddress;
    }

    public String getCcsAddress()
    {
        return this._ccsAddress;
    }

    public void setCcsUserName(String ccsUserName)
    {
        this._ccsUserName = ccsUserName;
    }

    public String getCcsUserName()
    {
        return this._ccsUserName;
    }

    public void setCcsPassword(String ccsPassword)
    {
        this._ccsPassword = ccsPassword;
    }

    public String getCcsPassword()
    {
        return this._ccsPassword;
    }

    public void setCcsProxyAddress(String ccsProxyAddress)
    {
        this._ccsProxyAddress = ccsProxyAddress;
    }

    public String getCcsProxyAddress()
    {
        return this._ccsProxyAddress;
    }

    public void setCcsProxyUserName(String ccsProxyUserName)
    {
        this._ccsProxyUserName = ccsProxyUserName;
    }

    public String getCcsProxyUserName()
    {
        return this._ccsProxyUserName;
    }

    public void setCcsProxyPassword(String ccsProxyPassword)
    {
        this._ccsProxyPassword = ccsProxyPassword;
    }

    public String getCcsProxyPassword()
    {
        return this._ccsProxyPassword;
    }

    public void setTimeServerAddress(String timeServerAddress)
    {
        this._timeServerAddress = timeServerAddress;
    }

    public String getTimeServerAddress()
    {
        return this._timeServerAddress;
    }

    public void setTimeServerProxyAddress(String timeServerProxyAddress)
    {
        this._timeServerProxyAddress = timeServerProxyAddress;
    }

    public String getTimeServerProxyAddress()
    {
        return this._timeServerProxyAddress;
    }

    public void setTimeServerProxyUserName(String timeServerProxyUserName)
    {
        this._timeServerProxyUserName = timeServerProxyUserName;
    }

    public String getTimeServerProxyUserName()
    {
        return this._timeServerProxyUserName;
    }

    public void setTimeServerProxyUserPassword(String timeServerProxyUserPassword)
    {
        this._timeServerProxyUserPassword = timeServerProxyUserPassword;
    }

    public String getTimeServerProxyUserPassword()
    {
        return this._timeServerProxyUserPassword;
    }

    public List<DocumentCheckResult> checkSignature(DocumentToCheck document)
            throws XPathExpressionException, ParserConfigurationException, SAXException, IOException, CryptographyException
    {
        if (document.getIsContainer()) {
            return checkSignatureContainer(document);
        }
        return checkSignatureDocument(document);
    }

    public DoSign sign(DoSign document)
            throws UnsupportedEncodingException, CryptographyException
    {
        String xmlDocStr = DocumentProcessor.unpackFromBase64(document.getBytes());

        String signed = sign(xmlDocStr);

        DoSign res = new DoSign();
        res.setBytes(DocumentProcessor.packToBase64(signed));

        return res;
    }

    private List<DocumentCheckResult> checkSignatureContainer(DocumentToCheck document)
            throws SAXException, IOException, ParserConfigurationException, XPathExpressionException, CryptographyException
    {
        List<DocumentCheckResult> results = new ArrayList();

        String xmlDocStr = DocumentProcessor.unpackFromBase64(document.getDocument());
        Document xmlSignDoc = DocumentProcessor.parse(xmlDocStr);
        if (!checkSignatureValueLength(xmlSignDoc.getDocumentElement(), results)) {
            return results;
        }
        checkSignature(xmlDocStr, xmlSignDoc.getDocumentElement(), results);

        Document container = SignatureProcessor.getDocumentWithoutSignature(xmlSignDoc.getDocumentElement(), DocumentProcessor.getDocumentBuilder().newDocument());
        for (String xPath : document.getXPath())
        {
            List<Element> innerDocs = DocumentProcessor.getInnerDocuments(container, xPath);
            for (Element innerDoc : innerDocs) {
                checkSignature(null, innerDoc, results);
            }
        }
        return results;
    }

    private List<DocumentCheckResult> checkSignatureDocument(DocumentToCheck document)
            throws XPathExpressionException, ParserConfigurationException, SAXException, IOException, CryptographyException
    {
        List<DocumentCheckResult> results = new ArrayList();

        String xmlDocStr = DocumentProcessor.unpackFromBase64(document.getDocument());
        Document xmlSignDoc = DocumentProcessor.parse(xmlDocStr);
        if (!checkSignatureValueLength(xmlSignDoc.getDocumentElement(), results)) {
            return results;
        }
        checkSignature(xmlDocStr, xmlSignDoc.getDocumentElement(), results);

        return results;
    }

    private void checkSignature(String xmlDocStr, Element signDoc, List<DocumentCheckResult> results)
            throws XPathExpressionException, ParserConfigurationException, CryptographyException, UnsupportedEncodingException
    {
        Document doc = SignatureProcessor.getDocumentWithoutSignature(signDoc, DocumentProcessor.getDocumentBuilder().newDocument());

        String documentId = DocumentProcessor.getDocumentID(doc);
        if (null == xmlDocStr) {
            try
            {
                StringWriter sw = new StringWriter();
                Transformer t = TransformerFactory.newInstance().newTransformer();
                t.setOutputProperty("omit-xml-declaration", "yes");
                t.setOutputProperty("indent", "no");
                t.transform(new DOMSource(signDoc), new StreamResult(sw));
                xmlDocStr = sw.toString();
            }
            catch (Exception exc)
            {
                results.add(ResultProcessor.createResult("01.00051.01", documentId));
                return;
            }
        }
        String[] props = getVerifierProps(this._needUseCCSForCheck);

        if(this._needCheckCertOids.equals("true")) {
            try {
                //TODO: переделать
                new CertificateCheckerFactoryImpl();

                SignatureFactory f = SignatureFactory.newInstance(SignatureFactory.URN_QUORUS_SIGNATURE_1_0);
                new SignedDocumentReader((SignatureFactoryImpl) f);

                SignedDocumentParser parser = f.newSignedDocumentParser();
                SignedDocument signedDocument = parser.parse(SignedDocumentObject.getSignedDocumentObject(xmlDocStr.getBytes("UTF-8")));
                ByteArrayInputStream bas = new ByteArrayInputStream(signedDocument.getCertificateBytes());

                CertificateFactory cf = CertificateFactory.getInstance("X.509");
                java.security.cert.Certificate c = cf.generateCertificate(bas);

                X509Certificate t = (X509Certificate) c;
                Collection keys = t.getExtendedKeyUsage();
                String result = StringUtils.join(keys, ", ");
                log.info("Проверка документа подписанного сертификатом " + result + " " + t.getSubjectDN());
                //TODO: обрабатываем
            } catch (Throwable t) {
                if ((t instanceof CryptographyException)) {
                    CryptographyException ex = (CryptographyException) t;
                    results.add(ResultProcessor.createResult(ResultProcessor.parseCheckSignCryptoCode(ex.getCode()), documentId));
                } else {
                    results.add(ResultProcessor.createResult("01.00051.01", documentId));
                }
            }
        }

        QuickValidatorImpl validator = new QuickValidatorImpl();
        InputStream is = new ByteArrayInputStream(xmlDocStr.getBytes("UTF-8"));
        try
        {
            int res = validator.verify(is, props);
            if (0 == res) {
                results.add(ResultProcessor.createResult("00.00000.00", documentId));
            } else {
                results.add(ResultProcessor.createResult("01.00051.01", documentId));
            }
        }
        catch (Throwable t)
        {
            if ((t instanceof CryptographyException))
            {
                CryptographyException ex = (CryptographyException)t;
                results.add(ResultProcessor.createResult(ResultProcessor.parseCheckSignCryptoCode(ex.getCode()), documentId));
            }
            else
            {
                results.add(ResultProcessor.createResult("01.00051.01", documentId));
            }
        }
    }

    private String sign(String xmlDocStr)
            throws CryptographyException, UnsupportedEncodingException
    {
        String[] verifierProps = getVerifierProps(this._needUseCCSForSign);
        String[] signerProps = getSignerProps();

        byte[] certBytes = getCertificateValue(this._certificateId).toByteArray();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        QuickSignerImpl signer = new QuickSignerImpl();
        InputStream is = new ByteArrayInputStream(xmlDocStr.getBytes("UTF-8"));
        InputStream isCert = new ByteArrayInputStream(certBytes);
        int res = signer.sign(is, isCert, signerProps, verifierProps, baos);
        if (0 != res) {
            throw new CryptographyException(res, ResultProcessor.getErrorDescription(res));
        }
        return new String(baos.toByteArray(), "UTF-8");
    }

    private String[] getVerifierProps(String needUseCCSForWhat)
    {
        boolean needCcs = needUseCCSForWhat.equalsIgnoreCase("true");

        String[] props = new String[8];
        props[0] = (needCcs ? this._ccsAddress : null);
        props[1] = (needCcs ? this._ccsUserName : null);
        props[2] = (needCcs ? this._ccsPassword : null);
        props[3] = (needCcs ? this._ccsProxyAddress : null);
        props[4] = (needCcs ? this._ccsProxyUserName : null);
        props[5] = (needCcs ? this._ccsProxyPassword : null);
        props[6] = null;
        props[7] = null;

        return props;
    }

    private String[] getSignerProps()
    {
        boolean needTts = this._needUseTTS.equalsIgnoreCase("true");

        String[] props = new String[6];

        props[0] = (needTts ? this._timeServerAddress : null);
        props[1] = (needTts ? this._timeServerProxyAddress : null);
        props[2] = (needTts ? this._timeServerProxyUserName : null);
        props[3] = (needTts ? this._timeServerProxyUserPassword : null);
        props[4] = "yes";
        props[5] = null;

        return props;
    }

    private ByteArrayOutputStream getCertificateValue(String certificateName)
    {
        UnificationFactoryImpl unificationFactory = new UnificationFactoryImpl();
        CryptoProviderParams cryptoProviderParams = unificationFactory.newCryptoProviderParams();
        CryptoProvider cryptoProvider = unificationFactory.newCryptoProvider(cryptoProviderParams);

        CertificateStoreParams certificateStoreParams = unificationFactory.newCertificateStoreParams("MY");
        CertificateStore certificateStore = cryptoProvider.getCertificateStore(certificateStoreParams);
        cryptoProvider.destroy();

        CertificateParams certificateParams = unificationFactory.newCertificateParams(certificateName);
        Certificate certificate = certificateStore.getCertificate(certificateParams);
        certificateStore.destroy();

        ByteArrayOutputStream certificateValue = new ByteArrayOutputStream();
        certificate.exportPublicKey(certificateValue);
        certificate.close();

        return certificateValue;
    }

    private boolean checkSignatureValueLength(Element sigDoc, List<DocumentCheckResult> results)
    {
        try
        {
            XPathFactory xpf = XPathFactory.newInstance();
            XPath xp = xpf.newXPath();
            XPathExpression xpe = xp.compile("//*[local-name()='SignatureValue']");
            XPathExpression xpe2 = xp.compile(".//*[local-name()='DocumentID']/text()");

            List<DocumentCheckResult> rs = new ArrayList();
            boolean failed = false;

            NodeList values = (NodeList)xpe.evaluate(sigDoc, XPathConstants.NODESET);
            for (int i = 0; i < values.getLength(); i++)
            {
                Node value = values.item(i);

                Node docIdNode = (Node)xpe2.evaluate(value.getParentNode(), XPathConstants.NODE);
                String documentId = "<unknown>";
                if (null != docIdNode) {
                    documentId = docIdNode.getTextContent();
                }
                byte[] signature = Base64Coder.decodeAsBytes(value.getTextContent(), "US-ASCII");
                if (signature.length <= 0)
                {
                    failed = true;
                    rs.add(ResultProcessor.createResult("01.00051.01", documentId));
                }
                else
                {
                    rs.add(ResultProcessor.createResult("00.00000.00", documentId));
                }
            }
            if (failed)
            {
                results.addAll(rs);
                throw new Exception();
            }
            return true;
        }
        catch (Exception exc) {}
        return false;
    }
}
