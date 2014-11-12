
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Реквизиты гарантии
 */
public class GuaranteeDocumentType
{
    private String documentNumber;
    private String GRN;
    private LocalDate issueDate;
    private String notValid4EC;
    private List<LimitationNonECType> limitationNonECList = new ArrayList<LimitationNonECType>();

    /** 
     * Get the 'DocumentNumber' element value. Номер документа
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Номер документа
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'GRN' element value. Регистрационный номер гарантии (GRN) заполняется в случае использования гарантии NCTS.
     * 
     * @return value
     */
    public String getGRN() {
        return GRN;
    }

    /** 
     * Set the 'GRN' element value. Регистрационный номер гарантии (GRN) заполняется в случае использования гарантии NCTS.
     * 
     * @param GRN
     */
    public void setGRN(String GRN) {
        this.GRN = GRN;
    }

    /** 
     * Get the 'IssueDate' element value. Дата документа
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата документа
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'NotValid4EC' element value. Признак наличия ограничения для стран ЕС, заполняется в случае использования гарантии NCTS
     * 
     * @return value
     */
    public String getNotValid4EC() {
        return notValid4EC;
    }

    /** 
     * Set the 'NotValid4EC' element value. Признак наличия ограничения для стран ЕС, заполняется в случае использования гарантии NCTS
     * 
     * @param notValid4EC
     */
    public void setNotValid4EC(String notValid4EC) {
        this.notValid4EC = notValid4EC;
    }

    /** 
     * Get the list of 'LimitationNonEC' element items. Ограничение действия гарантии вне ЕС
     * 
     * @return list
     */
    public List<LimitationNonECType> getLimitationNonECList() {
        return limitationNonECList;
    }

    /** 
     * Set the list of 'LimitationNonEC' element items. Ограничение действия гарантии вне ЕС
     * 
     * @param list
     */
    public void setLimitationNonECList(List<LimitationNonECType> list) {
        limitationNonECList = list;
    }
}
