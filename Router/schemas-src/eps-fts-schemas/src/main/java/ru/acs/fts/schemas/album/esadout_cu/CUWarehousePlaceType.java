
package ru.acs.fts.schemas.album.esadout_cu;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ��������������� �������: ���������� ����������� ������ �� ��������� �������� �������, ����� ���������� ��������, ���������� �����, ��������� �����, ������� ������������ ��������, ���������, �������� �������� � ���� ���������� ��������������� �������������� ���������, ����� �������� ����������� �������, ����� ���������� �������
 */
public class CUWarehousePlaceType extends DocumentBaseType
{
    private String documentModeCode;

    /** 
     * Get the 'DocumentModeCode' element value. ��� ���������:1-�������� 2-�������������
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. ��� ���������:1-�������� 2-�������������
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }
}
