
package ru.acs.fts.schemas.album.cardcommonaggregatetypes;

/** 
 * Ѕазовый тип дл€ электронного документа
 */
public class BaseDocType
{
    private String documentID;
    private String refDocumentID;

    /** 
     * Get the 'DocumentID' element value. ”никальный идентификатор документа
     * 
     * @return value
     */
    public String getDocumentID() {
        return documentID;
    }

    /** 
     * Set the 'DocumentID' element value. ”никальный идентификатор документа
     * 
     * @param documentID
     */
    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    /** 
     * Get the 'RefDocumentID' element value. ”никальный идентификатор исходного документа
     * 
     * @return value
     */
    public String getRefDocumentID() {
        return refDocumentID;
    }

    /** 
     * Set the 'RefDocumentID' element value. ”никальный идентификатор исходного документа
     * 
     * @param refDocumentID
     */
    public void setRefDocumentID(String refDocumentID) {
        this.refDocumentID = refDocumentID;
    }
}
