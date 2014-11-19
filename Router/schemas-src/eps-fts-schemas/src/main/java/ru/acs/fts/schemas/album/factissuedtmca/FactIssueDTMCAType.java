
package ru.acs.fts.schemas.album.factissuedtmca;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Сообщение о факте выпуска ДТ
 */
public class FactIssueDTMCAType extends BaseDocType
{
    private String issueDecisionCode;
    private LocalDate issueDecisionDate;
    private String issueDecisionTime;
    private GTDIDType DTRegNumber;
    private String documentModeID;

    /** 
     * Get the 'IssueDecisionCode' element value. Код решения о выпуске ДТ
     * 
     * @return value
     */
    public String getIssueDecisionCode() {
        return issueDecisionCode;
    }

    /** 
     * Set the 'IssueDecisionCode' element value. Код решения о выпуске ДТ
     * 
     * @param issueDecisionCode
     */
    public void setIssueDecisionCode(String issueDecisionCode) {
        this.issueDecisionCode = issueDecisionCode;
    }

    /** 
     * Get the 'IssueDecisionDate' element value. Дата выпуска ДТ
     * 
     * @return value
     */
    public LocalDate getIssueDecisionDate() {
        return issueDecisionDate;
    }

    /** 
     * Set the 'IssueDecisionDate' element value. Дата выпуска ДТ
     * 
     * @param issueDecisionDate
     */
    public void setIssueDecisionDate(LocalDate issueDecisionDate) {
        this.issueDecisionDate = issueDecisionDate;
    }

    /** 
     * Get the 'IssueDecisionTime' element value. Время выпуска ДТ
     * 
     * @return value
     */
    public String getIssueDecisionTime() {
        return issueDecisionTime;
    }

    /** 
     * Set the 'IssueDecisionTime' element value. Время выпуска ДТ
     * 
     * @param issueDecisionTime
     */
    public void setIssueDecisionTime(String issueDecisionTime) {
        this.issueDecisionTime = issueDecisionTime;
    }

    /** 
     * Get the 'DTRegNumber' element value. Регистрационные номер ДТ
     * 
     * @return value
     */
    public GTDIDType getDTRegNumber() {
        return DTRegNumber;
    }

    /** 
     * Set the 'DTRegNumber' element value. Регистрационные номер ДТ
     * 
     * @param DTRegNumber
     */
    public void setDTRegNumber(GTDIDType DTRegNumber) {
        this.DTRegNumber = DTRegNumber;
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
