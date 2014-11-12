
package ru.acs.fts.schemas.album.guaranteecontractaddition;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ���������
 */
public class DocumentInfoType extends DocumentBaseType
{
    private String documentCode;

    /** 
     * Get the 'DocumentCode' element value. ��� ���a  ��������� � ������������ � ��������������� ����� ����������, ������������ ��� ���������� ��������������
     * 
     * @return value
     */
    public String getDocumentCode() {
        return documentCode;
    }

    /** 
     * Set the 'DocumentCode' element value. ��� ���a  ��������� � ������������ � ��������������� ����� ����������, ������������ ��� ���������� ��������������
     * 
     * @param documentCode
     */
    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }
}
