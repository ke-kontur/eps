
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * ���������� � ���������� � ��������� ������� ��������� ���������.
 */
public class AUDArchiveDocumentIdWithVersionsRefType
{
    private String prevVersionArchiveDocumentId;
    private String nextVersionArchiveDocumentId;

    /** 
     * Get the 'PrevVersionArchiveDocumentId' element value. �������� ������������� ��������� ������� ������. ����������� � ������, ���� ������ �������� ������� ����� ������ �������� ��������, ������� ������.
     * 
     * @return value
     */
    public String getPrevVersionArchiveDocumentId() {
        return prevVersionArchiveDocumentId;
    }

    /** 
     * Set the 'PrevVersionArchiveDocumentId' element value. �������� ������������� ��������� ������� ������. ����������� � ������, ���� ������ �������� ������� ����� ������ �������� ��������, ������� ������.
     * 
     * @param prevVersionArchiveDocumentId
     */
    public void setPrevVersionArchiveDocumentId(
            String prevVersionArchiveDocumentId) {
        this.prevVersionArchiveDocumentId = prevVersionArchiveDocumentId;
    }

    /** 
     * Get the 'NextVersionArchiveDocumentId' element value. �������� ������������� ��������� ��������� ������. ����������� � ������, ���� ������ �������� ��� ������� ������ �������� ����������, ��������� ������.
     * 
     * @return value
     */
    public String getNextVersionArchiveDocumentId() {
        return nextVersionArchiveDocumentId;
    }

    /** 
     * Set the 'NextVersionArchiveDocumentId' element value. �������� ������������� ��������� ��������� ������. ����������� � ������, ���� ������ �������� ��� ������� ������ �������� ����������, ��������� ������.
     * 
     * @param nextVersionArchiveDocumentId
     */
    public void setNextVersionArchiveDocumentId(
            String nextVersionArchiveDocumentId) {
        this.nextVersionArchiveDocumentId = nextVersionArchiveDocumentId;
    }
}
