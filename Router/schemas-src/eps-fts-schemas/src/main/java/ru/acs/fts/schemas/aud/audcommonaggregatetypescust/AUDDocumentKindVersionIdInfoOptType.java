
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

public class AUDDocumentKindVersionIdInfoOptType
        extends
            AUDDocumentKindIdInfoType
{
    private String appliedDocumentKindVersionId;

    /** 
     * Get the 'AppliedDocumentKindVersionId' element value. ������������� ������ ���� ���������� ����������. �������� ������ ���� ����� �������������� ������������ ���� XML ����������� ��������� (��������� �������� ���������).
     * 
     * @return value
     */
    public String getAppliedDocumentKindVersionId() {
        return appliedDocumentKindVersionId;
    }

    /** 
     * Set the 'AppliedDocumentKindVersionId' element value. ������������� ������ ���� ���������� ����������. �������� ������ ���� ����� �������������� ������������ ���� XML ����������� ��������� (��������� �������� ���������).
     * 
     * @param appliedDocumentKindVersionId
     */
    public void setAppliedDocumentKindVersionId(
            String appliedDocumentKindVersionId) {
        this.appliedDocumentKindVersionId = appliedDocumentKindVersionId;
    }
}
