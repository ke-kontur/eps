
package ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust;

/** 
 * ���. ����� �������� � �������� ������
 */
public class KTSGoodsShipmentType
{
    private String totalGoodsNumber;
    private String totalSheetNumber;
    private String totalCustomsAmount;
    private String previousTotalCustomsAmount;
    private String debtReturnSumm;

    /** 
     * Get the 'TotalGoodsNumber' element value. ����� ���������� ������� ���. ��. 5
     * 
     * @return value
     */
    public String getTotalGoodsNumber() {
        return totalGoodsNumber;
    }

    /** 
     * Set the 'TotalGoodsNumber' element value. ����� ���������� ������� ���. ��. 5
     * 
     * @param totalGoodsNumber
     */
    public void setTotalGoodsNumber(String totalGoodsNumber) {
        this.totalGoodsNumber = totalGoodsNumber;
    }

    /** 
     * Get the 'TotalSheetNumber' element value. ����� ���������� ���������� ���-1 � ���-2. �� 3
     * 
     * @return value
     */
    public String getTotalSheetNumber() {
        return totalSheetNumber;
    }

    /** 
     * Set the 'TotalSheetNumber' element value. ����� ���������� ���������� ���-1 � ���-2. �� 3
     * 
     * @param totalSheetNumber
     */
    public void setTotalSheetNumber(String totalSheetNumber) {
        this.totalSheetNumber = totalSheetNumber;
    }

    /** 
     * Get the 'TotalCustomsAmount' element value. �������� � ���������/����� ���������� ���������.�� 12 ����� ���������
     * 
     * @return value
     */
    public String getTotalCustomsAmount() {
        return totalCustomsAmount;
    }

    /** 
     * Set the 'TotalCustomsAmount' element value. �������� � ���������/����� ���������� ���������.�� 12 ����� ���������
     * 
     * @param totalCustomsAmount
     */
    public void setTotalCustomsAmount(String totalCustomsAmount) {
        this.totalCustomsAmount = totalCustomsAmount;
    }

    /** 
     * Get the 'PreviousTotalCustomsAmount' element value. ���������� ��������  ����� ���������� ���������
     * 
     * @return value
     */
    public String getPreviousTotalCustomsAmount() {
        return previousTotalCustomsAmount;
    }

    /** 
     * Set the 'PreviousTotalCustomsAmount' element value. ���������� ��������  ����� ���������� ���������
     * 
     * @param previousTotalCustomsAmount
     */
    public void setPreviousTotalCustomsAmount(String previousTotalCustomsAmount) {
        this.previousTotalCustomsAmount = previousTotalCustomsAmount;
    }

    /** 
     * Get the 'DebtReturnSumm' element value. ����� �����, ���������� �������� (���������)
     * 
     * @return value
     */
    public String getDebtReturnSumm() {
        return debtReturnSumm;
    }

    /** 
     * Set the 'DebtReturnSumm' element value. ����� �����, ���������� �������� (���������)
     * 
     * @param debtReturnSumm
     */
    public void setDebtReturnSumm(String debtReturnSumm) {
        this.debtReturnSumm = debtReturnSumm;
    }
}
