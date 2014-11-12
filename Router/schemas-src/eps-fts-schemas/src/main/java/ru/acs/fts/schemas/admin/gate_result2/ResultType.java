
package ru.acs.fts.schemas.admin.gate_result2;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

/** 
 * Результат обработки сообщения  на  внешнем шлюзе
 */
public class ResultType
{
    private String documentID;
    private LocalDate createDate;
    private LocalTime createTime;
    private String resultInformationResultCode;
    private String resultInformationResultDescription;
    private String documentModeID;

    /** 
     * Get the 'DocumentID' element value.
     * 
     * @return value
     */
    public String getDocumentID() {
        return documentID;
    }

    /** 
     * Set the 'DocumentID' element value.
     * 
     * @param documentID
     */
    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    /** 
     * Get the 'CreateDate' element value.
     * 
     * @return value
     */
    public LocalDate getCreateDate() {
        return createDate;
    }

    /** 
     * Set the 'CreateDate' element value.
     * 
     * @param createDate
     */
    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    /** 
     * Get the 'CreateTime' element value.
     * 
     * @return value
     */
    public LocalTime getCreateTime() {
        return createTime;
    }

    /** 
     * Set the 'CreateTime' element value.
     * 
     * @param createTime
     */
    public void setCreateTime(LocalTime createTime) {
        this.createTime = createTime;
    }

    /** 
     * Get the 'ResultCode' element value.
     * 
     * @return value
     */
    public String getResultInformationResultCode() {
        return resultInformationResultCode;
    }

    /** 
     * Set the 'ResultCode' element value.
     * 
     * @param resultInformationResultCode
     */
    public void setResultInformationResultCode(
            String resultInformationResultCode) {
        this.resultInformationResultCode = resultInformationResultCode;
    }

    /** 
     * Get the 'ResultDescription' element value.
     * 
     * @return value
     */
    public String getResultInformationResultDescription() {
        return resultInformationResultDescription;
    }

    /** 
     * Set the 'ResultDescription' element value.
     * 
     * @param resultInformationResultDescription
     */
    public void setResultInformationResultDescription(
            String resultInformationResultDescription) {
        this.resultInformationResultDescription = resultInformationResultDescription;
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
