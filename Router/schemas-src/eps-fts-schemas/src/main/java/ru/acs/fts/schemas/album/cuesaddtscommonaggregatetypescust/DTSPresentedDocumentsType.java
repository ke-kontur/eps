
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������������� ���������
 */
public class DTSPresentedDocumentsType extends DocumentBaseType
{
    private String presentedDocumentModeCode;
    private String positionNumber;

    /** 
     * Get the 'PresentedDocumentModeCode' element value. ��� ���� ��������������� ��������� (����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44)
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value. ��� ���� ��������������� ��������� (����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44)
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }

    /** 
     * Get the 'PositionNumber' element value. ����� ����� ���: 4,5,6,8
     * 
     * @return value
     */
    public String getPositionNumber() {
        return positionNumber;
    }

    /** 
     * Set the 'PositionNumber' element value. ����� ����� ���: 4,5,6,8
     * 
     * @param positionNumber
     */
    public void setPositionNumber(String positionNumber) {
        this.positionNumber = positionNumber;
    }
}
