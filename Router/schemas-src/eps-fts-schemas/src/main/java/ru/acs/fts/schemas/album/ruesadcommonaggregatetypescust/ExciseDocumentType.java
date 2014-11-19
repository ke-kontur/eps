
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * ��������� �� ��������� �������� ����� / �������� � ������������ � ������� ������ �� �������� ����������. ��. 44 �.8.
 */
public class ExciseDocumentType extends PresentedDocumentType
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
