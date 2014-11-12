
package ru.acs.fts.schemas.album.conformancesertif;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;
import ru.acs.fts.schemas.album.sertifcommonaggregatetypescust.SertifOrgBaseType;

/** 
 * Сертификат соответствия - документ, подтверждающий соответствие продукции определенным требованиям качества и безопасности.
 */
public class ConformanceSertifType extends BaseDocType
{
    private String BDRDID;
    private LocalDate beginDate;
    private LocalDate endDate;
    private List<String> addSertifInfList = new ArrayList<String>();
    private String documentSignature;
    private String certificateSign;
    private SertifOrganizationType sertifOrganization;
    private ManufacturerOrgType manufacturerInf;
    private SertifOrgBaseType sertifRecipient;
    private List<GroundDocsType> groundDocList = new ArrayList<GroundDocsType>();
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private List<PersonSignatureType> expertSignatureList = new ArrayList<PersonSignatureType>();
    private CertifNormDocType certifNormDoc;
    private List<ProlongCertificateType> prolongCertificateList = new ArrayList<ProlongCertificateType>();
    private CertifNormDocType federalDocs;
    private List<AppendsType> appendList = new ArrayList<AppendsType>();
    private RegistrationNumberType registrationNumber;
    private FormNumberType formNumber;
    private String documentModeID;

    /** 
     * Get the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'BeginDate' element value. Дата начала действия сертификата (совпадает с датой регистрации документа)
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. Дата начала действия сертификата (совпадает с датой регистрации документа)
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'EndDate' element value. Дата окончания действия сертификата (необязателен при сертификации партии)
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата окончания действия сертификата (необязателен при сертификации партии)
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the list of 'AddSertifInf' element items. Дополнительные сведения о сертификации (документы, о стабильности производства, маркировка, место нанесения знака соответствия)
     * 
     * @return list
     */
    public List<String> getAddSertifInfList() {
        return addSertifInfList;
    }

    /** 
     * Set the list of 'AddSertifInf' element items. Дополнительные сведения о сертификации (документы, о стабильности производства, маркировка, место нанесения знака соответствия)
     * 
     * @param list
     */
    public void setAddSertifInfList(List<String> list) {
        addSertifInfList = list;
    }

    /** 
     * Get the 'DocumentSignature' element value. Подпись руководителя
     * 
     * @return value
     */
    public String getDocumentSignature() {
        return documentSignature;
    }

    /** 
     * Set the 'DocumentSignature' element value. Подпись руководителя
     * 
     * @param documentSignature
     */
    public void setDocumentSignature(String documentSignature) {
        this.documentSignature = documentSignature;
    }

    /** 
     * Get the 'CertificateSign' element value. Сертификат соответствия: 0 - Таможенного союза; 1 - Росстандарта
     * 
     * @return value
     */
    public String getCertificateSign() {
        return certificateSign;
    }

    /** 
     * Set the 'CertificateSign' element value. Сертификат соответствия: 0 - Таможенного союза; 1 - Росстандарта
     * 
     * @param certificateSign
     */
    public void setCertificateSign(String certificateSign) {
        this.certificateSign = certificateSign;
    }

    /** 
     * Get the 'SertifOrganization' element value. Сведения об органе сертификации
     * 
     * @return value
     */
    public SertifOrganizationType getSertifOrganization() {
        return sertifOrganization;
    }

    /** 
     * Set the 'SertifOrganization' element value. Сведения об органе сертификации
     * 
     * @param sertifOrganization
     */
    public void setSertifOrganization(SertifOrganizationType sertifOrganization) {
        this.sertifOrganization = sertifOrganization;
    }

    /** 
     * Get the 'ManufacturerInf' element value. Информация об изготовителе/индивидуальном предпринимателе.
     * 
     * @return value
     */
    public ManufacturerOrgType getManufacturerInf() {
        return manufacturerInf;
    }

    /** 
     * Set the 'ManufacturerInf' element value. Информация об изготовителе/индивидуальном предпринимателе.
     * 
     * @param manufacturerInf
     */
    public void setManufacturerInf(ManufacturerOrgType manufacturerInf) {
        this.manufacturerInf = manufacturerInf;
    }

    /** 
     * Get the 'SertifRecipient' element value. Информация о лице, которому выдан сертификат / Заявитель
     * 
     * @return value
     */
    public SertifOrgBaseType getSertifRecipient() {
        return sertifRecipient;
    }

    /** 
     * Set the 'SertifRecipient' element value. Информация о лице, которому выдан сертификат / Заявитель
     * 
     * @param sertifRecipient
     */
    public void setSertifRecipient(SertifOrgBaseType sertifRecipient) {
        this.sertifRecipient = sertifRecipient;
    }

    /** 
     * Get the list of 'GroundDocs' element items. Описание  документов на основании которых выдан сертификат
     * 
     * @return list
     */
    public List<GroundDocsType> getGroundDocList() {
        return groundDocList;
    }

    /** 
     * Set the list of 'GroundDocs' element items. Описание  документов на основании которых выдан сертификат
     * 
     * @param list
     */
    public void setGroundDocList(List<GroundDocsType> list) {
        groundDocList = list;
    }

    /** 
     * Get the list of 'Goods' element items. Сведения о продукции
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Сведения о продукции
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the list of 'ExpertSignature' element items. Подпись эксперта
     * 
     * @return list
     */
    public List<PersonSignatureType> getExpertSignatureList() {
        return expertSignatureList;
    }

    /** 
     * Set the list of 'ExpertSignature' element items. Подпись эксперта
     * 
     * @param list
     */
    public void setExpertSignatureList(List<PersonSignatureType> list) {
        expertSignatureList = list;
    }

    /** 
     * Get the 'CertifNormDoc' element value. Обозначение нормативных документов, на соответствие которым произведена сертификация (ГОСТЫ, пункты ГОСТов)
     * 
     * @return value
     */
    public CertifNormDocType getCertifNormDoc() {
        return certifNormDoc;
    }

    /** 
     * Set the 'CertifNormDoc' element value. Обозначение нормативных документов, на соответствие которым произведена сертификация (ГОСТЫ, пункты ГОСТов)
     * 
     * @param certifNormDoc
     */
    public void setCertifNormDoc(CertifNormDocType certifNormDoc) {
        this.certifNormDoc = certifNormDoc;
    }

    /** 
     * Get the list of 'ProlongCertificate' element items. Сведения о продлении сертификата
     * 
     * @return list
     */
    public List<ProlongCertificateType> getProlongCertificateList() {
        return prolongCertificateList;
    }

    /** 
     * Set the list of 'ProlongCertificate' element items. Сведения о продлении сертификата
     * 
     * @param list
     */
    public void setProlongCertificateList(List<ProlongCertificateType> list) {
        prolongCertificateList = list;
    }

    /** 
     * Get the 'FederalDocs' element value. Описание документов федеральных  органов, устанавливающих  требования для военной продукции
     * 
     * @return value
     */
    public CertifNormDocType getFederalDocs() {
        return federalDocs;
    }

    /** 
     * Set the 'FederalDocs' element value. Описание документов федеральных  органов, устанавливающих  требования для военной продукции
     * 
     * @param federalDocs
     */
    public void setFederalDocs(CertifNormDocType federalDocs) {
        this.federalDocs = federalDocs;
    }

    /** 
     * Get the list of 'Append' element items. Сведения о приложениях
     * 
     * @return list
     */
    public List<AppendsType> getAppendList() {
        return appendList;
    }

    /** 
     * Set the list of 'Append' element items. Сведения о приложениях
     * 
     * @param list
     */
    public void setAppendList(List<AppendsType> list) {
        appendList = list;
    }

    /** 
     * Get the 'RegistrationNumber' element value. Регистрационный номер
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. Регистрационный номер
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(RegistrationNumberType registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'FormNumber' element value. Номер бланка сертификата
     * 
     * @return value
     */
    public FormNumberType getFormNumber() {
        return formNumber;
    }

    /** 
     * Set the 'FormNumber' element value. Номер бланка сертификата
     * 
     * @param formNumber
     */
    public void setFormNumber(FormNumberType formNumber) {
        this.formNumber = formNumber;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
