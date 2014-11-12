
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.math.BigInteger;

/** 
 * Информация об архивном идентификаторе документа и номере версии.
 */
public class AUDArchiveDocumentIdWithVersionType
{
    private String archiveDocumentId;
    private BigInteger documentVersionNumber;

    /** 
     * Get the 'ArchiveDocumentId' element value. Архивный идентификатор документа.
     * 
     * @return value
     */
    public String getArchiveDocumentId() {
        return archiveDocumentId;
    }

    /** 
     * Set the 'ArchiveDocumentId' element value. Архивный идентификатор документа.
     * 
     * @param archiveDocumentId
     */
    public void setArchiveDocumentId(String archiveDocumentId) {
        this.archiveDocumentId = archiveDocumentId;
    }

    /** 
     * Get the 'DocumentVersionNumber' element value. Номер версии документа.
     * 
     * @return value
     */
    public BigInteger getDocumentVersionNumber() {
        return documentVersionNumber;
    }

    /** 
     * Set the 'DocumentVersionNumber' element value. Номер версии документа.
     * 
     * @param documentVersionNumber
     */
    public void setDocumentVersionNumber(BigInteger documentVersionNumber) {
        this.documentVersionNumber = documentVersionNumber;
    }
}
