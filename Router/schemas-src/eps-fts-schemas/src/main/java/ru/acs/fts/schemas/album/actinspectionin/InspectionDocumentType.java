
package ru.acs.fts.schemas.album.actinspectionin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ��� - �������� �� �������� �������� ���������� �������
 */
public class InspectionDocumentType extends DocumentBaseType
{
    private String presentedDocumentModeCode;
    private String custWaybillNumber;
    private String recordNumber;

    /** 
     * Get the 'PresentedDocumentModeCode' element value. ��� ���� ���������. ����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44.
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value. ��� ���� ���������. ����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44.
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }

    /** 
     * Get the 'CustWaybillNumber' element value. ���������� ����� ���������
     * 
     * @return value
     */
    public String getCustWaybillNumber() {
        return custWaybillNumber;
    }

    /** 
     * Set the 'CustWaybillNumber' element value. ���������� ����� ���������
     * 
     * @param custWaybillNumber
     */
    public void setCustWaybillNumber(String custWaybillNumber) {
        this.custWaybillNumber = custWaybillNumber;
    }

    /** 
     * Get the 'RecordNumber' element value. ���������� ����� ������ � ������� ��
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. ���������� ����� ������ � ������� ��
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }
}
