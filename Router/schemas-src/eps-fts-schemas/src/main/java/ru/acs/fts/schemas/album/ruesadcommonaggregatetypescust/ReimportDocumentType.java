
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * �������� ����������� ��� ��������� ������� ��� ���������� ����� ���������. ��. 44 �.9.6.
 */
public class ReimportDocumentType extends PresentedDocumentType
{
    private String symbolSubLineNumber;
    private String goodsStatus;
    private String repairStatus;
    private LocalDate exportDate;

    /** 
     * Get the 'SymbolSubLineNumber' element value. ��� ����������  A-���������� ��������� ������ �� ��������� . B - �� ��� ������. �- ������ ������� ��� ������ � ���������� ��, D - �������� � �������� �� ��������� ��
     * 
     * @return value
     */
    public String getSymbolSubLineNumber() {
        return symbolSubLineNumber;
    }

    /** 
     * Set the 'SymbolSubLineNumber' element value. ��� ����������  A-���������� ��������� ������ �� ��������� . B - �� ��� ������. �- ������ ������� ��� ������ � ���������� ��, D - �������� � �������� �� ��������� ��
     * 
     * @param symbolSubLineNumber
     */
    public void setSymbolSubLineNumber(String symbolSubLineNumber) {
        this.symbolSubLineNumber = symbolSubLineNumber;
    }

    /** 
     * Get the 'GoodsStatus' element value. ������ ������� ��� ������ 21- ����������, 22 - �������� �����������
     * 
     * @return value
     */
    public String getGoodsStatus() {
        return goodsStatus;
    }

    /** 
     * Set the 'GoodsStatus' element value. ������ ������� ��� ������ 21- ����������, 22 - �������� �����������
     * 
     * @param goodsStatus
     */
    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    /** 
     * Get the 'RepairStatus' element value. ������� ������� �� ��������� ���������� ���������� ��. 30 - �������� �� ������� �� �������������, 31 - �������� �� ������� �������������.
     * 
     * @return value
     */
    public String getRepairStatus() {
        return repairStatus;
    }

    /** 
     * Set the 'RepairStatus' element value. ������� ������� �� ��������� ���������� ���������� ��. 30 - �������� �� ������� �� �������������, 31 - �������� �� ������� �������������.
     * 
     * @param repairStatus
     */
    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus;
    }

    /** 
     * Get the 'ExportDate' element value. ���� ������������ ������.
     * 
     * @return value
     */
    public LocalDate getExportDate() {
        return exportDate;
    }

    /** 
     * Set the 'ExportDate' element value. ���� ������������ ������.
     * 
     * @param exportDate
     */
    public void setExportDate(LocalDate exportDate) {
        this.exportDate = exportDate;
    }
}
