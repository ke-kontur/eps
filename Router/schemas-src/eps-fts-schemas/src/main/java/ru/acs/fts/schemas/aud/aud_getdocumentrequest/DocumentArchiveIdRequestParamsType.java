
package ru.acs.fts.schemas.aud.aud_getdocumentrequest;

import ru.acs.fts.schemas.aud.audcommonleaftypescust.AUDDocumentVersionsRequestType;

/** 
 * ��������� ������� ��������� �� ��������� ��������������.
 */
public class DocumentArchiveIdRequestParamsType
{
    private String archiveDocumentId;
    private AUDDocumentVersionsRequestType documentVersionsRequirements;

    /** 
     * Get the 'ArchiveDocumentId' element value. �������� ������������� ���������.
     * 
     * @return value
     */
    public String getArchiveDocumentId() {
        return archiveDocumentId;
    }

    /** 
     * Set the 'ArchiveDocumentId' element value. �������� ������������� ���������.
     * 
     * @param archiveDocumentId
     */
    public void setArchiveDocumentId(String archiveDocumentId) {
        this.archiveDocumentId = archiveDocumentId;
    }

    /** 
     * Get the 'DocumentVersionsRequirements' element value. ���������, ����� ������ ��������� � �������� �������� ��������������� ��������� ������������. ���� �������� �� ������� - ��������������� ������ �������� � �������� ���������������, ��������� � �������� ArchiveDocumentId. ���� ������� �������� 'all_versions' - ��������������� ��� ������ ���������, ������� � ����� �����. ���� ������� �������� 'last_version' - ��������������� ������ ��������� (����������) ������.
     * 
     * @return value
     */
    public AUDDocumentVersionsRequestType getDocumentVersionsRequirements() {
        return documentVersionsRequirements;
    }

    /** 
     * Set the 'DocumentVersionsRequirements' element value. ���������, ����� ������ ��������� � �������� �������� ��������������� ��������� ������������. ���� �������� �� ������� - ��������������� ������ �������� � �������� ���������������, ��������� � �������� ArchiveDocumentId. ���� ������� �������� 'all_versions' - ��������������� ��� ������ ���������, ������� � ����� �����. ���� ������� �������� 'last_version' - ��������������� ������ ��������� (����������) ������.
     * 
     * @param documentVersionsRequirements
     */
    public void setDocumentVersionsRequirements(
            AUDDocumentVersionsRequestType documentVersionsRequirements) {
        this.documentVersionsRequirements = documentVersionsRequirements;
    }
}
