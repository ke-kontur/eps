
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

public class AUDEmbeddedDocumentArchiveInfoSyncType
        extends
            AUDAppliedDocumentInfoType
{
    private String documenVersionChaintId;
    private boolean isActualDocumentIndicator;
    private AUDArchiveDocumentIdWithVersionType archiveDocumentIdWithVersion;

    /** 
     * Get the 'DocumenVersionChaintId' element value. �������� ������������� ��������� ������� ������. ����������� � ������, ���� �������� ������������ ����� ����� (���������) ������ ��� ��������� ���������.
     * 
     * @return value
     */
    public String getDocumenVersionChaintId() {
        return documenVersionChaintId;
    }

    /** 
     * Set the 'DocumenVersionChaintId' element value. �������� ������������� ��������� ������� ������. ����������� � ������, ���� �������� ������������ ����� ����� (���������) ������ ��� ��������� ���������.
     * 
     * @param documenVersionChaintId
     */
    public void setDocumenVersionChaintId(String documenVersionChaintId) {
        this.documenVersionChaintId = documenVersionChaintId;
    }

    /** 
     * Get the 'IsActualDocumentIndicator' element value. �������: �������� �� �������� ���������� (true) ��� ��� (false).
     * 
     * @return value
     */
    public boolean isIsActualDocumentIndicator() {
        return isActualDocumentIndicator;
    }

    /** 
     * Set the 'IsActualDocumentIndicator' element value. �������: �������� �� �������� ���������� (true) ��� ��� (false).
     * 
     * @param isActualDocumentIndicator
     */
    public void setIsActualDocumentIndicator(boolean isActualDocumentIndicator) {
        this.isActualDocumentIndicator = isActualDocumentIndicator;
    }

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
