
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * ���������� � ��������� ������, ��� ���� ���������.
 */
public class AUDArchiveDocumentInfoType extends AUDArchivePutInfoType
{
    private AUDArchiveDocumentIdWithVersionType archiveDocumentIdWithVersion;

    /** 
     * Get the 'ArchiveDocumentIdWithVersion' element value. ���������� �� �������� �������������� ��������� � ������ ������.
     * 
     * @return value
     */
    public AUDArchiveDocumentIdWithVersionType getArchiveDocumentIdWithVersion() {
        return archiveDocumentIdWithVersion;
    }

    /** 
     * Set the 'ArchiveDocumentIdWithVersion' element value. ���������� �� �������� �������������� ��������� � ������ ������.
     * 
     * @param archiveDocumentIdWithVersion
     */
    public void setArchiveDocumentIdWithVersion(
            AUDArchiveDocumentIdWithVersionType archiveDocumentIdWithVersion) {
        this.archiveDocumentIdWithVersion = archiveDocumentIdWithVersion;
    }
}
