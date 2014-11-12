
package ru.acs.fts.schemas.album.archdocstatusrequest;

import ru.acs.fts.schemas.album.electronicarchivecommonaggregatetypescust.ArchBaseDocType;

/** 
 * Запрос статуса документа в архиве декларанта
 */
public class ArchDocStatusRequestType extends ArchBaseDocType
{
    private String documentModeID;

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
