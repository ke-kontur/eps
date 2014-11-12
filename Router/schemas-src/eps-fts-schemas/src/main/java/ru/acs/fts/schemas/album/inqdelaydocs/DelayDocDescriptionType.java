
package ru.acs.fts.schemas.album.inqdelaydocs;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.DocumentDescriptionType;

/** 
 * Описание документов, которые предполагается представить в определенный срок
 */
public class DelayDocDescriptionType extends DocumentDescriptionType
{
    private String delayReason;
    private String documentFormSign;
    private String requestPositionID;

    /** 
     * Get the 'DelayReason' element value. Причина, по которой документ не может быть представлен немедленно
     * 
     * @return value
     */
    public String getDelayReason() {
        return delayReason;
    }

    /** 
     * Set the 'DelayReason' element value. Причина, по которой документ не может быть представлен немедленно
     * 
     * @param delayReason
     */
    public void setDelayReason(String delayReason) {
        this.delayReason = delayReason;
    }

    /** 
     * Get the 'DocumentFormSign' element value. Признак формы представления документа: 0 - в электронной форме, 1 - в виде бумажного документа
     * 
     * @return value
     */
    public String getDocumentFormSign() {
        return documentFormSign;
    }

    /** 
     * Set the 'DocumentFormSign' element value. Признак формы представления документа: 0 - в электронной форме, 1 - в виде бумажного документа
     * 
     * @param documentFormSign
     */
    public void setDocumentFormSign(String documentFormSign) {
        this.documentFormSign = documentFormSign;
    }

    /** 
     * Get the 'RequestPositionID' element value. Идентификатор позиции в запросе
     * 
     * @return value
     */
    public String getRequestPositionID() {
        return requestPositionID;
    }

    /** 
     * Set the 'RequestPositionID' element value. Идентификатор позиции в запросе
     * 
     * @param requestPositionID
     */
    public void setRequestPositionID(String requestPositionID) {
        this.requestPositionID = requestPositionID;
    }
}
