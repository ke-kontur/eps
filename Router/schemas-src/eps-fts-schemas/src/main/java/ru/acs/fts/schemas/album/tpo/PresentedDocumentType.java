
package ru.acs.fts.schemas.album.tpo;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������������� ���������/�������������� ����������
 */
public class PresentedDocumentType extends DocumentBaseType
{
    private String presentedDocumentModeCode;

    /** 
     * Get the 'PresentedDocumentModeCode' element value. ��� ���� ��������������� ���������. ����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value. ��� ���� ��������������� ���������. ����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }
}
