
package ru.acs.fts.schemas.album.documentregnumbernotif;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Уведомление о регистрации документа (пакета документов)
 */
public class DocumentRegNumberNotifType extends BaseDocType
{
    private String documentRegNumber;
    private String documentModeID;

    /** 
     * Get the 'DocumentRegNumber' element value. Уникальный номер документа (пакета документов)
     * 
     * @return value
     */
    public String getDocumentRegNumber() {
        return documentRegNumber;
    }

    /** 
     * Set the 'DocumentRegNumber' element value. Уникальный номер документа (пакета документов)
     * 
     * @param documentRegNumber
     */
    public void setDocumentRegNumber(String documentRegNumber) {
        this.documentRegNumber = documentRegNumber;
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
