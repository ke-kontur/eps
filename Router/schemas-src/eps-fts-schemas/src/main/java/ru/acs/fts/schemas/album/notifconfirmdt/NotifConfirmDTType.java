
package ru.acs.fts.schemas.album.notifconfirmdt;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Уведомление о получении ДТ/Обязательства о подаче ДТ в таможенный  орган
 */
public class NotifConfirmDTType extends BaseDocType
{
    private String docRecieptTime;
    private String obligationDeadline;
    private CustomsType customs;
    private String documentModeID;

    /** 
     * Get the 'DocRecieptTime' element value. Дата/время подачи документов в системе ТО
     * 
     * @return value
     */
    public String getDocRecieptTime() {
        return docRecieptTime;
    }

    /** 
     * Set the 'DocRecieptTime' element value. Дата/время подачи документов в системе ТО
     * 
     * @param docRecieptTime
     */
    public void setDocRecieptTime(String docRecieptTime) {
        this.docRecieptTime = docRecieptTime;
    }

    /** 
     * Get the 'ObligationDeadline' element value. Предельная дата и время принятия решения по снятию средств идентификации
     * 
     * @return value
     */
    public String getObligationDeadline() {
        return obligationDeadline;
    }

    /** 
     * Set the 'ObligationDeadline' element value. Предельная дата и время принятия решения по снятию средств идентификации
     * 
     * @param obligationDeadline
     */
    public void setObligationDeadline(String obligationDeadline) {
        this.obligationDeadline = obligationDeadline;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
