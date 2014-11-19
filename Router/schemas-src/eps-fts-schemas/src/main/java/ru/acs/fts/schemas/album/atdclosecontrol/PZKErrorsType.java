
package ru.acs.fts.schemas.album.atdclosecontrol;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������
 */
public class PZKErrorsType
{
    private String ATDGoodsNumber;
    private ATDinTableType ATDinTable;
    private ErrorType error;
    private CheckNormativeDocumentType checkNormativeDocument;
    private List<CloseReasonType> closeReasonList = new ArrayList<CloseReasonType>();

    /** 
     * Get the 'ATDGoodsNumber' element value. ����� ������ �� ���
     * 
     * @return value
     */
    public String getATDGoodsNumber() {
        return ATDGoodsNumber;
    }

    /** 
     * Set the 'ATDGoodsNumber' element value. ����� ������ �� ���
     * 
     * @param ATDGoodsNumber
     */
    public void setATDGoodsNumber(String ATDGoodsNumber) {
        this.ATDGoodsNumber = ATDGoodsNumber;
    }

    /** 
     * Get the 'ATDinTable' element value. ���������� � ������� ����������� ������� ����������� ����� ��� (������ DBF)
     * 
     * @return value
     */
    public ATDinTableType getATDinTable() {
        return ATDinTable;
    }

    /** 
     * Set the 'ATDinTable' element value. ���������� � ������� ����������� ������� ����������� ����� ��� (������ DBF)
     * 
     * @param ATDinTable
     */
    public void setATDinTable(ATDinTableType ATDinTable) {
        this.ATDinTable = ATDinTable;
    }

    /** 
     * Get the 'Error' element value. �������� ������.
     * 
     * @return value
     */
    public ErrorType getError() {
        return error;
    }

    /** 
     * Set the 'Error' element value. �������� ������.
     * 
     * @param error
     */
    public void setError(ErrorType error) {
        this.error = error;
    }

    /** 
     * Get the 'CheckNormativeDocument' element value. ����������� ��������, � ������������ � ������� ����������� ��������
     * 
     * @return value
     */
    public CheckNormativeDocumentType getCheckNormativeDocument() {
        return checkNormativeDocument;
    }

    /** 
     * Set the 'CheckNormativeDocument' element value. ����������� ��������, � ������������ � ������� ����������� ��������
     * 
     * @param checkNormativeDocument
     */
    public void setCheckNormativeDocument(
            CheckNormativeDocumentType checkNormativeDocument) {
        this.checkNormativeDocument = checkNormativeDocument;
    }

    /** 
     * Get the list of 'CloseReason' element items. ������� ��������
     * 
     * @return list
     */
    public List<CloseReasonType> getCloseReasonList() {
        return closeReasonList;
    }

    /** 
     * Set the list of 'CloseReason' element items. ������� ��������
     * 
     * @param list
     */
    public void setCloseReasonList(List<CloseReasonType> list) {
        closeReasonList = list;
    }
}
