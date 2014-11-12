
package ru.acs.fts.schemas.album.exportdiamondscertificate;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сертификат вывоза необработанных природных алмазов
 */
public class ExportDiamondsCertificateType extends BaseDocType
{
    private String BDRDID;
    private LocalDate issueDate;
    private List<String> noteList = new ArrayList<String>();
    private LocalDate expiryDate;
    private OrganizationInfoType exporterInfo;
    private OrganizationInfoType recipient;
    private DocumentBaseType contractInfo;
    private CustomsPersonType customsControler;
    private DiamondsInfoType diamondsInfo;
    private CertificateNumberType certificateNumber;
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
     * Get the 'IssueDate' element value. Дата выдачи сертификата
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата выдачи сертификата
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the list of 'Note' element items. Дополнительные отметки
     * 
     * @return list
     */
    public List<String> getNoteList() {
        return noteList;
    }

    /** 
     * Set the list of 'Note' element items. Дополнительные отметки
     * 
     * @param list
     */
    public void setNoteList(List<String> list) {
        noteList = list;
    }

    /** 
     * Get the 'ExpiryDate' element value. Срок действия сертификата
     * 
     * @return value
     */
    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    /** 
     * Set the 'ExpiryDate' element value. Срок действия сертификата
     * 
     * @param expiryDate
     */
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    /** 
     * Get the 'ExporterInfo' element value. Сведения о предприятии-экспортере
     * 
     * @return value
     */
    public OrganizationInfoType getExporterInfo() {
        return exporterInfo;
    }

    /** 
     * Set the 'ExporterInfo' element value. Сведения о предприятии-экспортере
     * 
     * @param exporterInfo
     */
    public void setExporterInfo(OrganizationInfoType exporterInfo) {
        this.exporterInfo = exporterInfo;
    }

    /** 
     * Get the 'Recipient' element value. Сведения о получателе
     * 
     * @return value
     */
    public OrganizationInfoType getRecipient() {
        return recipient;
    }

    /** 
     * Set the 'Recipient' element value. Сведения о получателе
     * 
     * @param recipient
     */
    public void setRecipient(OrganizationInfoType recipient) {
        this.recipient = recipient;
    }

    /** 
     * Get the 'ContractInfo' element value. Контракт
     * 
     * @return value
     */
    public DocumentBaseType getContractInfo() {
        return contractInfo;
    }

    /** 
     * Set the 'ContractInfo' element value. Контракт
     * 
     * @param contractInfo
     */
    public void setContractInfo(DocumentBaseType contractInfo) {
        this.contractInfo = contractInfo;
    }

    /** 
     * Get the 'CustomsControler' element value. Государственный контролер
     * 
     * @return value
     */
    public CustomsPersonType getCustomsControler() {
        return customsControler;
    }

    /** 
     * Set the 'CustomsControler' element value. Государственный контролер
     * 
     * @param customsControler
     */
    public void setCustomsControler(CustomsPersonType customsControler) {
        this.customsControler = customsControler;
    }

    /** 
     * Get the 'DiamondsInfo' element value. Сведения об экспортируемых алмазах
     * 
     * @return value
     */
    public DiamondsInfoType getDiamondsInfo() {
        return diamondsInfo;
    }

    /** 
     * Set the 'DiamondsInfo' element value. Сведения об экспортируемых алмазах
     * 
     * @param diamondsInfo
     */
    public void setDiamondsInfo(DiamondsInfoType diamondsInfo) {
        this.diamondsInfo = diamondsInfo;
    }

    /** 
     * Get the 'CertificateNumber' element value. Уникальный номер сертификата
     * 
     * @return value
     */
    public CertificateNumberType getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. Уникальный номер сертификата
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(CertificateNumberType certificateNumber) {
        this.certificateNumber = certificateNumber;
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
