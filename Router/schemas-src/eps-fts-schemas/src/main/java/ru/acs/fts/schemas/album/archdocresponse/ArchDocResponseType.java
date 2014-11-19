
package ru.acs.fts.schemas.album.archdocresponse;

import ru.acs.fts.schemas.album.electronicarchivecommonaggregatetypescust.ArchBaseType;

/** 
 * Электронный документ из архива декларанта
 */
public class ArchDocResponseType extends ArchBaseType
{
    private String archDocStatus;
    private String archDocID;
    private ArchDocumentType archDocument;
    private String documentModeID;

    /** 
     * Get the 'ArchDocStatus' element value. Статус документа в архиве
     * 
     * @return value
     */
    public String getArchDocStatus() {
        return archDocStatus;
    }

    /** 
     * Set the 'ArchDocStatus' element value. Статус документа в архиве
     * 
     * @param archDocStatus
     */
    public void setArchDocStatus(String archDocStatus) {
        this.archDocStatus = archDocStatus;
    }

    /** 
     * Get the 'ArchDocID' element value. Архивный идентификатор документа
     * 
     * @return value
     */
    public String getArchDocID() {
        return archDocID;
    }

    /** 
     * Set the 'ArchDocID' element value. Архивный идентификатор документа
     * 
     * @param archDocID
     */
    public void setArchDocID(String archDocID) {
        this.archDocID = archDocID;
    }

    /** 
     * Get the 'ArchDocument' element value. Документ из архива
     * 
     * @return value
     */
    public ArchDocumentType getArchDocument() {
        return archDocument;
    }

    /** 
     * Set the 'ArchDocument' element value. Документ из архива
     * 
     * @param archDocument
     */
    public void setArchDocument(ArchDocumentType archDocument) {
        this.archDocument = archDocument;
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
