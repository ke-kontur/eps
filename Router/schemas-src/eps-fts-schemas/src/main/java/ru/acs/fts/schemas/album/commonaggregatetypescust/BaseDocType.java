
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Базовый тип для электронного документа
 */
public class BaseDocType
{
    private String documentID;
    private String refDocumentID;

    /** 
     * Get the 'DocumentID' element value. Уникальный идентификатор документа
     * 
     * @return value
     */
    public String getDocumentID() {
        return documentID;
    }

    /** 
     * Set the 'DocumentID' element value. Уникальный идентификатор документа
     * 
     * @param documentID
     */
    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    /** 
     * Get the 'RefDocumentID' element value. Уникальный идентификатор исходного документа
     * 
     * @return value
     */
    public String getRefDocumentID() {
        return refDocumentID;
    }

    /** 
     * Set the 'RefDocumentID' element value. Уникальный идентификатор исходного документа
     * 
     * @param refDocumentID
     */
    public void setRefDocumentID(String refDocumentID) {
        this.refDocumentID = refDocumentID;
    }
}
