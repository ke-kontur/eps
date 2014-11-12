
package ru.acs.fts.schemas.album.archdocdeleterequest;

import ru.acs.fts.schemas.album.electronicarchivecommonaggregatetypescust.ArchBaseDocType;

/** 
 * Запрос на удаление документа из архива
 */
public class ArchDocDeleteRequestType extends ArchBaseDocType
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
