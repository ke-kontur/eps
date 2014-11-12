
package ru.acs.fts.schemas.admin.ipsdbupdate;

import java.math.BigDecimal;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/** 
 * Сведения  о технологиях, поддерживаемых ИПС
 */
public class IPSTechType
{
    private String techID;
    private LocalDate startDate;
    private LocalDate endDate;
    private String comments;
    private String IPSCertNumber;
    private LocalDate IPSCertDate;
    private LocalDate createDate;
    private BigDecimal closeFlag;
    private String recordID;
    private DateTime chDateTime;

    /** 
     * Get the 'TechID' element value. Идентификатор технологии
     * 
     * @return value
     */
    public String getTechID() {
        return techID;
    }

    /** 
     * Set the 'TechID' element value. Идентификатор технологии
     * 
     * @param techID
     */
    public void setTechID(String techID) {
        this.techID = techID;
    }

    /** 
     * Get the 'StartDate' element value. Дата начала действия 
     * 
     * @return value
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** 
     * Set the 'StartDate' element value. Дата начала действия 
     * 
     * @param startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /** 
     * Get the 'EndDate' element value. Дата  окончания действия  
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата  окончания действия  
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'Comments' element value. Комментарий
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарий
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'IPS_CertNumber' element value. Номер сертификата ИПС ВЭД
     * 
     * @return value
     */
    public String getIPSCertNumber() {
        return IPSCertNumber;
    }

    /** 
     * Set the 'IPS_CertNumber' element value. Номер сертификата ИПС ВЭД
     * 
     * @param IPSCertNumber
     */
    public void setIPSCertNumber(String IPSCertNumber) {
        this.IPSCertNumber = IPSCertNumber;
    }

    /** 
     * Get the 'IPS_CertDate' element value. Дата сертификата  ИПС ВЭД
     * 
     * @return value
     */
    public LocalDate getIPSCertDate() {
        return IPSCertDate;
    }

    /** 
     * Set the 'IPS_CertDate' element value. Дата сертификата  ИПС ВЭД
     * 
     * @param IPSCertDate
     */
    public void setIPSCertDate(LocalDate IPSCertDate) {
        this.IPSCertDate = IPSCertDate;
    }

    /** 
     * Get the 'CreateDate' element value. Дата создания записи
     * 
     * @return value
     */
    public LocalDate getCreateDate() {
        return createDate;
    }

    /** 
     * Set the 'CreateDate' element value. Дата создания записи
     * 
     * @param createDate
     */
    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    /** 
     * Get the 'CloseFlag' element value. Признак аннулирования записи. 1- аннулирована, 0 - не аннулирована.
     * 
     * @return value
     */
    public BigDecimal getCloseFlag() {
        return closeFlag;
    }

    /** 
     * Set the 'CloseFlag' element value. Признак аннулирования записи. 1- аннулирована, 0 - не аннулирована.
     * 
     * @param closeFlag
     */
    public void setCloseFlag(BigDecimal closeFlag) {
        this.closeFlag = closeFlag;
    }

    /** 
     * Get the 'Record_ID' element value. Идентификатор записи
     * 
     * @return value
     */
    public String getRecordID() {
        return recordID;
    }

    /** 
     * Set the 'Record_ID' element value. Идентификатор записи
     * 
     * @param recordID
     */
    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    /** 
     * Get the 'ChDateTime' element value. Дата/время последнего изменения записи
     * 
     * @return value
     */
    public DateTime getChDateTime() {
        return chDateTime;
    }

    /** 
     * Set the 'ChDateTime' element value. Дата/время последнего изменения записи
     * 
     * @param chDateTime
     */
    public void setChDateTime(DateTime chDateTime) {
        this.chDateTime = chDateTime;
    }
}
