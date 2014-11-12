
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Информация о документе архива, без тела документа.
 */
public class AUDArchiveDocumentInfoType extends AUDArchivePutInfoType
{
    private AUDArchiveDocumentIdWithVersionType archiveDocumentIdWithVersion;

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
