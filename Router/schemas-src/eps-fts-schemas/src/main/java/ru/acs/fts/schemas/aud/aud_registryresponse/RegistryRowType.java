
package ru.acs.fts.schemas.aud.aud_registryresponse;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDArchiveDocumentIdWithVersionType;

/** 
 * �������� � ����������  ������
 */
public class RegistryRowType
{
    private boolean isActualDocumentIndicator;
    private String archiveContainerDocumentId;
    private AUDArchiveDocumentIdWithVersionType archiveDocInfo;
    private AUDAppliedDocumentInfoType appliedDocInfo;

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
     * Get the 'ArchiveContainerDocumentId' element value. �������� ������������� ���������-����������, ����������� ������ ��������. ����������� � ������, ���� �������� ��� ������� � ����� �� �������� �� � ���� ���������������� ���������, � � ������� ���������-���������� (��������� ���� 'ED_Container').
     * 
     * @return value
     */
    public String getArchiveContainerDocumentId() {
        return archiveContainerDocumentId;
    }

    /** 
     * Set the 'ArchiveContainerDocumentId' element value. �������� ������������� ���������-����������, ����������� ������ ��������. ����������� � ������, ���� �������� ��� ������� � ����� �� �������� �� � ���� ���������������� ���������, � � ������� ���������-���������� (��������� ���� 'ED_Container').
     * 
     * @param archiveContainerDocumentId
     */
    public void setArchiveContainerDocumentId(String archiveContainerDocumentId) {
        this.archiveContainerDocumentId = archiveContainerDocumentId;
    }

    /** 
     * Get the 'ArchiveDocInfo' element value. ��������  ��������������  ���������
     * 
     * @return value
     */
    public AUDArchiveDocumentIdWithVersionType getArchiveDocInfo() {
        return archiveDocInfo;
    }

    /** 
     * Set the 'ArchiveDocInfo' element value. ��������  ��������������  ���������
     * 
     * @param archiveDocInfo
     */
    public void setArchiveDocInfo(
            AUDArchiveDocumentIdWithVersionType archiveDocInfo) {
        this.archiveDocInfo = archiveDocInfo;
    }

    /** 
     * Get the 'AppliedDocInfo' element value. ����������  ����������  � ���������
     * 
     * @return value
     */
    public AUDAppliedDocumentInfoType getAppliedDocInfo() {
        return appliedDocInfo;
    }

    /** 
     * Set the 'AppliedDocInfo' element value. ����������  ����������  � ���������
     * 
     * @param appliedDocInfo
     */
    public void setAppliedDocInfo(AUDAppliedDocumentInfoType appliedDocInfo) {
        this.appliedDocInfo = appliedDocInfo;
    }
}
