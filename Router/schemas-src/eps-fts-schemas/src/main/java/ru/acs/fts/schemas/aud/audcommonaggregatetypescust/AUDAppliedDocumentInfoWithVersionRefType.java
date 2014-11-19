
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * ���������� � ��������� �� ���������� �������, � ��������� ������ �� ������� ������ ���������.
 */
public class AUDAppliedDocumentInfoWithVersionRefType
        extends
            AUDAppliedDocumentInfoType
{
    private String prevVersionArchiveDocumentId;

    /** 
     * Get the 'PrevVersionArchiveDocumentId' element value. �������� ������������� ��������� ������� ������. ����������� � ������, ���� �������� ������������ ����� ����� (���������) ������ ��� ��������� ���������.
     * 
     * @return value
     */
    public String getPrevVersionArchiveDocumentId() {
        return prevVersionArchiveDocumentId;
    }

    /** 
     * Set the 'PrevVersionArchiveDocumentId' element value. �������� ������������� ��������� ������� ������. ����������� � ������, ���� �������� ������������ ����� ����� (���������) ������ ��� ��������� ���������.
     * 
     * @param prevVersionArchiveDocumentId
     */
    public void setPrevVersionArchiveDocumentId(
            String prevVersionArchiveDocumentId) {
        this.prevVersionArchiveDocumentId = prevVersionArchiveDocumentId;
    }
}
