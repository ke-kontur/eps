
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * ѕредставленные документы. √р. 44. п.1 - 7.0, п.10 включительно.
 */
public class ESADBasicPresentedDocumentType extends PresentedDocumentType
{
    private String presentedDocumentModeCode;
    private String actNumber;
    private LocalDate actDate;
    private String temporaryImportCode;

    /** 
     * Get the 'PresentedDocumentModeCode' element value.  од вида представл€емого документа. «аполн€етс€ в соответствии с классификатором видов документов, используемых при за€влении сведений в графе 44.
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value.  од вида представл€емого документа. «аполн€етс€ в соответствии с классификатором видов документов, используемых при за€влении сведений в графе 44.
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }

    /** 
     * Get the 'ActNumber' element value. Ќомер акта о фактическом перемещении товаром таможенной границы
     * 
     * @return value
     */
    public String getActNumber() {
        return actNumber;
    }

    /** 
     * Set the 'ActNumber' element value. Ќомер акта о фактическом перемещении товаром таможенной границы
     * 
     * @param actNumber
     */
    public void setActNumber(String actNumber) {
        this.actNumber = actNumber;
    }

    /** 
     * Get the 'ActDate' element value. ƒата акта о фактическом перемещении товаром таможенной границы / дата фактического вывоза
     * 
     * @return value
     */
    public LocalDate getActDate() {
        return actDate;
    }

    /** 
     * Set the 'ActDate' element value. ƒата акта о фактическом перемещении товаром таможенной границы / дата фактического вывоза
     * 
     * @param actDate
     */
    public void setActDate(LocalDate actDate) {
        this.actDate = actDate;
    }

    /** 
     * Get the 'TemporaryImportCode' element value.  од срока временного ввоза. 1- если срок временного ввоз/вывоза менее 1 года, 2- если срок временного ввоз/вывоза более 1 года.
     * 
     * @return value
     */
    public String getTemporaryImportCode() {
        return temporaryImportCode;
    }

    /** 
     * Set the 'TemporaryImportCode' element value.  од срока временного ввоза. 1- если срок временного ввоз/вывоза менее 1 года, 2- если срок временного ввоз/вывоза более 1 года.
     * 
     * @param temporaryImportCode
     */
    public void setTemporaryImportCode(String temporaryImportCode) {
        this.temporaryImportCode = temporaryImportCode;
    }
}
