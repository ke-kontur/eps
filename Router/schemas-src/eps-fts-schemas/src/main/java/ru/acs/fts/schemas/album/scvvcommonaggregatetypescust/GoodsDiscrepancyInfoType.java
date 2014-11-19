
package ru.acs.fts.schemas.album.scvvcommonaggregatetypescust;

/** 
 * ���������� � ��������� ������������ � ������
 */
public class GoodsDiscrepancyInfoType
{
    private String goodsDiscrepancyIndicator;
    private SCVVGoodsType planFactGoodsInfo;
    private SCVVGoodsType balance;

    /** 
     * Get the 'GoodsDiscrepancyIndicator' element value. ��� ��������� ����������� (� ������������ �� ������������� ������)
     * 
     * @return value
     */
    public String getGoodsDiscrepancyIndicator() {
        return goodsDiscrepancyIndicator;
    }

    /** 
     * Set the 'GoodsDiscrepancyIndicator' element value. ��� ��������� ����������� (� ������������ �� ������������� ������)
     * 
     * @param goodsDiscrepancyIndicator
     */
    public void setGoodsDiscrepancyIndicator(String goodsDiscrepancyIndicator) {
        this.goodsDiscrepancyIndicator = goodsDiscrepancyIndicator;
    }

    /** 
     * Get the 'PlanFactGoodsInfo' element value. ���������� � ����������� � ������ �������
     * 
     * @return value
     */
    public SCVVGoodsType getPlanFactGoodsInfo() {
        return planFactGoodsInfo;
    }

    /** 
     * Set the 'PlanFactGoodsInfo' element value. ���������� � ����������� � ������ �������
     * 
     * @param planFactGoodsInfo
     */
    public void setPlanFactGoodsInfo(SCVVGoodsType planFactGoodsInfo) {
        this.planFactGoodsInfo = planFactGoodsInfo;
    }

    /** 
     * Get the 'Balance' element value. ������� �� �� �� ������� ������.
     * 
     * @return value
     */
    public SCVVGoodsType getBalance() {
        return balance;
    }

    /** 
     * Set the 'Balance' element value. ������� �� �� �� ������� ������.
     * 
     * @param balance
     */
    public void setBalance(SCVVGoodsType balance) {
        this.balance = balance;
    }
}
