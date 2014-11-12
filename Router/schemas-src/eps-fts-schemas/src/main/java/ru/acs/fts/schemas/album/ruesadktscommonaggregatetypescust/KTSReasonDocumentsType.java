
package ru.acs.fts.schemas.album.ruesadktscommonaggregatetypescust;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.PresentedDocumentType;

/** 
 * ��������� ���������� �������� �� ������ ������� ����������� ���, ��������� ���������� � ����������� ������� ��.
 */
public class KTSReasonDocumentsType extends PresentedDocumentType
{
    private String presentedDocumentModeCode;

    /** 
     * Get the 'PresentedDocumentModeCode' element value. ��� ���� ��������������� ���������. ����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44.
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value. ��� ���� ��������������� ���������. ����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44.
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }
}
