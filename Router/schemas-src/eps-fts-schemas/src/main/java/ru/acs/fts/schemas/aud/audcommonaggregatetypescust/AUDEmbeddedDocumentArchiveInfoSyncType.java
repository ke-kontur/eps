
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

public class AUDEmbeddedDocumentArchiveInfoSyncType
        extends
            AUDAppliedDocumentInfoType
{
    private String documenVersionChaintId;
    private boolean isActualDocumentIndicator;
    private AUDArchiveDocumentIdWithVersionType archiveDocumentIdWithVersion;

    /** 
     * Get the 'DocumenVersionChaintId' element value. Архивный идентификатор документа прежней версии. Указывается в случае, если документ представляет собой новую (следующую) версию уже хранимого документа.
     * 
     * @return value
     */
    public String getDocumenVersionChaintId() {
        return documenVersionChaintId;
    }

    /** 
     * Set the 'DocumenVersionChaintId' element value. Архивный идентификатор документа прежней версии. Указывается в случае, если документ представляет собой новую (следующую) версию уже хранимого документа.
     * 
     * @param documenVersionChaintId
     */
    public void setDocumenVersionChaintId(String documenVersionChaintId) {
        this.documenVersionChaintId = documenVersionChaintId;
    }

    /** 
     * Get the 'IsActualDocumentIndicator' element value. Признак: является ли документ актуальным (true) или нет (false).
     * 
     * @return value
     */
    public boolean isIsActualDocumentIndicator() {
        return isActualDocumentIndicator;
    }

    /** 
     * Set the 'IsActualDocumentIndicator' element value. Признак: является ли документ актуальным (true) или нет (false).
     * 
     * @param isActualDocumentIndicator
     */
    public void setIsActualDocumentIndicator(boolean isActualDocumentIndicator) {
        this.isActualDocumentIndicator = isActualDocumentIndicator;
    }

    /** 
     * Get the 'ArchiveDocumentIdWithVersion' element value. Информация об архивном идентификаторе документа и номере версии.
     * 
     * @return value
     */
    public AUDArchiveDocumentIdWithVersionType getArchiveDocumentIdWithVersion() {
        return archiveDocumentIdWithVersion;
    }

    /** 
     * Set the 'ArchiveDocumentIdWithVersion' element value. Информация об архивном идентификаторе документа и номере версии.
     * 
     * @param archiveDocumentIdWithVersion
     */
    public void setArchiveDocumentIdWithVersion(
            AUDArchiveDocumentIdWithVersionType archiveDocumentIdWithVersion) {
        this.archiveDocumentIdWithVersion = archiveDocumentIdWithVersion;
    }
}
