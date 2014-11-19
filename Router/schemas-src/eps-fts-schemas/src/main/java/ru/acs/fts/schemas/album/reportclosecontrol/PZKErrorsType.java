
package ru.acs.fts.schemas.album.reportclosecontrol;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������
 */
public class PZKErrorsType
{
    private String GTDGoodsNumber;
    private GTDinTableType GTDinTable;
    private ErrorType error;
    private CheckNormativeDocumentType checkNormativeDoc;
    private List<CloseReasonType> closeReasonList = new ArrayList<CloseReasonType>();

    /** 
     * Get the 'GTDGoodsNumber' element value. ����� ������ �� ��
     * 
     * @return value
     */
    public String getGTDGoodsNumber() {
        return GTDGoodsNumber;
    }

    /** 
     * Set the 'GTDGoodsNumber' element value. ����� ������ �� ��
     * 
     * @param GTDGoodsNumber
     */
    public void setGTDGoodsNumber(String GTDGoodsNumber) {
        this.GTDGoodsNumber = GTDGoodsNumber;
    }

    /** 
     * Get the 'GTDinTable' element value. ���������� � ������� ����������� ������� ����������� ����� �� (������ DBF)
     * 
     * @return value
     */
    public GTDinTableType getGTDinTable() {
        return GTDinTable;
    }

    /** 
     * Set the 'GTDinTable' element value. ���������� � ������� ����������� ������� ����������� ����� �� (������ DBF)
     * 
     * @param GTDinTable
     */
    public void setGTDinTable(GTDinTableType GTDinTable) {
        this.GTDinTable = GTDinTable;
    }

    /** 
     * Get the 'Error' element value. ������ ���
     * 
     * @return value
     */
    public ErrorType getError() {
        return error;
    }

    /** 
     * Set the 'Error' element value. ������ ���
     * 
     * @param error
     */
    public void setError(ErrorType error) {
        this.error = error;
    }

    /** 
     * Get the 'CheckNormativeDoc' element value. ����������� ��������, � ������������ � ������� ����������� ��������
     * 
     * @return value
     */
    public CheckNormativeDocumentType getCheckNormativeDoc() {
        return checkNormativeDoc;
    }

    /** 
     * Set the 'CheckNormativeDoc' element value. ����������� ��������, � ������������ � ������� ����������� ��������
     * 
     * @param checkNormativeDoc
     */
    public void setCheckNormativeDoc(
            CheckNormativeDocumentType checkNormativeDoc) {
        this.checkNormativeDoc = checkNormativeDoc;
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
