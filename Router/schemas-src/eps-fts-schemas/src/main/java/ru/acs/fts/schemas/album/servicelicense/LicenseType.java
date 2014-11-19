
package ru.acs.fts.schemas.album.servicelicense;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о лицензии/сертификате
 */
public class LicenseType extends DocumentBaseType
{
    private LocalDate beginDate;
    private LocalDate expirationDate;
    private String docReestrNum;
    private LocalDate originalIssueDate;
    private String licenseSeries;
    private String licensedServiceName;
    private String licensedServiceCode;
    private LocalDate prolongDate;
    private String append;

    /** 
     * Get the 'BeginDate' element value. Дата начала действия документа
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. Дата начала действия документа
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'ExpirationDate' element value. Дата окончания действия документа
     * 
     * @return value
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /** 
     * Set the 'ExpirationDate' element value. Дата окончания действия документа
     * 
     * @param expirationDate
     */
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    /** 
     * Get the 'DocReestrNum' element value. Номер документа (сертификата) в госреестре
     * 
     * @return value
     */
    public String getDocReestrNum() {
        return docReestrNum;
    }

    /** 
     * Set the 'DocReestrNum' element value. Номер документа (сертификата) в госреестре
     * 
     * @param docReestrNum
     */
    public void setDocReestrNum(String docReestrNum) {
        this.docReestrNum = docReestrNum;
    }

    /** 
     * Get the 'OriginalIssueDate' element value. Дата первоначальной выдачи (сертификата)
     * 
     * @return value
     */
    public LocalDate getOriginalIssueDate() {
        return originalIssueDate;
    }

    /** 
     * Set the 'OriginalIssueDate' element value. Дата первоначальной выдачи (сертификата)
     * 
     * @param originalIssueDate
     */
    public void setOriginalIssueDate(LocalDate originalIssueDate) {
        this.originalIssueDate = originalIssueDate;
    }

    /** 
     * Get the 'LicenseSeries' element value. Серия документа
     * 
     * @return value
     */
    public String getLicenseSeries() {
        return licenseSeries;
    }

    /** 
     * Set the 'LicenseSeries' element value. Серия документа
     * 
     * @param licenseSeries
     */
    public void setLicenseSeries(String licenseSeries) {
        this.licenseSeries = licenseSeries;
    }

    /** 
     * Get the 'LicensedServiceName' element value. Наименование лицензируемого вида деятельности
     * 
     * @return value
     */
    public String getLicensedServiceName() {
        return licensedServiceName;
    }

    /** 
     * Set the 'LicensedServiceName' element value. Наименование лицензируемого вида деятельности
     * 
     * @param licensedServiceName
     */
    public void setLicensedServiceName(String licensedServiceName) {
        this.licensedServiceName = licensedServiceName;
    }

    /** 
     * Get the 'LicensedServiceCode' element value. Код лицензируемого вида деятельности
     * 
     * @return value
     */
    public String getLicensedServiceCode() {
        return licensedServiceCode;
    }

    /** 
     * Set the 'LicensedServiceCode' element value. Код лицензируемого вида деятельности
     * 
     * @param licensedServiceCode
     */
    public void setLicensedServiceCode(String licensedServiceCode) {
        this.licensedServiceCode = licensedServiceCode;
    }

    /** 
     * Get the 'ProlongDate' element value. Информация о продлении документа
     * 
     * @return value
     */
    public LocalDate getProlongDate() {
        return prolongDate;
    }

    /** 
     * Set the 'ProlongDate' element value. Информация о продлении документа
     * 
     * @param prolongDate
     */
    public void setProlongDate(LocalDate prolongDate) {
        this.prolongDate = prolongDate;
    }

    /** 
     * Get the 'Append' element value. Признак наличия приложения к документу
     * 
     * @return value
     */
    public String getAppend() {
        return append;
    }

    /** 
     * Set the 'Append' element value. Признак наличия приложения к документу
     * 
     * @param append
     */
    public void setAppend(String append) {
        this.append = append;
    }
}
