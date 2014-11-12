
package ru.acs.fts.schemas.album.contractdealpassport;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � �������������� ��
 */
public class UpdatingInfoType
{
    private DocumentBaseType restructuring;
    private DocumentBaseType reasonsDocuments;

    /** 
     * Get the 'Restructuring' element value. �������������� �� (���������� ����� � ���� ��������������)
     * 
     * @return value
     */
    public DocumentBaseType getRestructuring() {
        return restructuring;
    }

    /** 
     * Set the 'Restructuring' element value. �������������� �� (���������� ����� � ���� ��������������)
     * 
     * @param restructuring
     */
    public void setRestructuring(DocumentBaseType restructuring) {
        this.restructuring = restructuring;
    }

    /** 
     * Get the 'ReasonsDocuments' element value. �������� � ���������, �� ��������� �������� ������� ��������� � �� (����� � ����)
     * 
     * @return value
     */
    public DocumentBaseType getReasonsDocuments() {
        return reasonsDocuments;
    }

    /** 
     * Set the 'ReasonsDocuments' element value. �������� � ���������, �� ��������� �������� ������� ��������� � �� (����� � ����)
     * 
     * @param reasonsDocuments
     */
    public void setReasonsDocuments(DocumentBaseType reasonsDocuments) {
        this.reasonsDocuments = reasonsDocuments;
    }
}
