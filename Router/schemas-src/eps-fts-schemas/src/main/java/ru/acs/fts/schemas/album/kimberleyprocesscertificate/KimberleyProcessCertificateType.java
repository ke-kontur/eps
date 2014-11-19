
package ru.acs.fts.schemas.album.kimberleyprocesscertificate;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.sertifcommonaggregatetypescust.SertifOrgBaseType;

/** 
 * Сертификат Кимберлийского процесса на необработанные природные алмазы
 */
public class KimberleyProcessCertificateType extends BaseDocType
{
    private String BDRDID;
    private LocalDate issueDate;
    private LocalDate validityDateEnd;
    private String packageNumber;
    private String extractingCountry;
    private List<String> noteList = new ArrayList<String>();
    private CertificateOrgType certificateOrg;
    private SertifOrgBaseType exporter;
    private SertifOrgBaseType importer;
    private List<DiamonsInfoType> diamondsInfoList = new ArrayList<DiamonsInfoType>();
    private OrganizationBaseType authenticateOrg;
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
     * Get the 'ValidityDateEnd' element value. Дата окончания срока действия сертификата
     * 
     * @return value
     */
    public LocalDate getValidityDateEnd() {
        return validityDateEnd;
    }

    /** 
     * Set the 'ValidityDateEnd' element value. Дата окончания срока действия сертификата
     * 
     * @param validityDateEnd
     */
    public void setValidityDateEnd(LocalDate validityDateEnd) {
        this.validityDateEnd = validityDateEnd;
    }

    /** 
     * Get the 'PackageNumber' element value. Число посылок в поставке
     * 
     * @return value
     */
    public String getPackageNumber() {
        return packageNumber;
    }

    /** 
     * Set the 'PackageNumber' element value. Число посылок в поставке
     * 
     * @param packageNumber
     */
    public void setPackageNumber(String packageNumber) {
        this.packageNumber = packageNumber;
    }

    /** 
     * Get the 'ExtractingCountry' element value. Добывающая страна
     * 
     * @return value
     */
    public String getExtractingCountry() {
        return extractingCountry;
    }

    /** 
     * Set the 'ExtractingCountry' element value. Добывающая страна
     * 
     * @param extractingCountry
     */
    public void setExtractingCountry(String extractingCountry) {
        this.extractingCountry = extractingCountry;
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
     * Get the 'CertificateOrg' element value. Орган сертификации
     * 
     * @return value
     */
    public CertificateOrgType getCertificateOrg() {
        return certificateOrg;
    }

    /** 
     * Set the 'CertificateOrg' element value. Орган сертификации
     * 
     * @param certificateOrg
     */
    public void setCertificateOrg(CertificateOrgType certificateOrg) {
        this.certificateOrg = certificateOrg;
    }

    /** 
     * Get the 'Exporter' element value. Сведения об экспортере
     * 
     * @return value
     */
    public SertifOrgBaseType getExporter() {
        return exporter;
    }

    /** 
     * Set the 'Exporter' element value. Сведения об экспортере
     * 
     * @param exporter
     */
    public void setExporter(SertifOrgBaseType exporter) {
        this.exporter = exporter;
    }

    /** 
     * Get the 'Importer' element value. Сведения об импортере
     * 
     * @return value
     */
    public SertifOrgBaseType getImporter() {
        return importer;
    }

    /** 
     * Set the 'Importer' element value. Сведения об импортере
     * 
     * @param importer
     */
    public void setImporter(SertifOrgBaseType importer) {
        this.importer = importer;
    }

    /** 
     * Get the list of 'DiamondsInfo' element items. Сведения об алмазах
     * 
     * @return list
     */
    public List<DiamonsInfoType> getDiamondsInfoList() {
        return diamondsInfoList;
    }

    /** 
     * Set the list of 'DiamondsInfo' element items. Сведения об алмазах
     * 
     * @param list
     */
    public void setDiamondsInfoList(List<DiamonsInfoType> list) {
        diamondsInfoList = list;
    }

    /** 
     * Get the 'AuthenticateOrg' element value. Орган, подтверждающий аутентичность сертификата
     * 
     * @return value
     */
    public OrganizationBaseType getAuthenticateOrg() {
        return authenticateOrg;
    }

    /** 
     * Set the 'AuthenticateOrg' element value. Орган, подтверждающий аутентичность сертификата
     * 
     * @param authenticateOrg
     */
    public void setAuthenticateOrg(OrganizationBaseType authenticateOrg) {
        this.authenticateOrg = authenticateOrg;
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
