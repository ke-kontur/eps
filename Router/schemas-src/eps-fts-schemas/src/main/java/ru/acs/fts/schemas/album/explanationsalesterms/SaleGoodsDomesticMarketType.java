
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * ���������� ������� �� ���������� �����
 */
public class SaleGoodsDomesticMarketType
{
    private String finalSellingPrice;
    private String unitSellingPriceGoods;
    private String cost;
    private String profitability;
    private BuyerGoodsType buyerGoods;
    private ExcessCustomsCostType excessCustomsCost;
    private MarketPriceType marketPrice;

    /** 
     * Get the 'FinalSellingPrice' element value. ������� ����, ��� ���� ���������� ������ �������� ��������� ����������� �� ���������� �����
     * 
     * @return value
     */
    public String getFinalSellingPrice() {
        return finalSellingPrice;
    }

    /** 
     * Set the 'FinalSellingPrice' element value. ������� ����, ��� ���� ���������� ������ �������� ��������� ����������� �� ���������� �����
     * 
     * @param finalSellingPrice
     */
    public void setFinalSellingPrice(String finalSellingPrice) {
        this.finalSellingPrice = finalSellingPrice;
    }

    /** 
     * Get the 'UnitSellingPriceGoods' element value. ������� ���� ���������� ������� ������ �� ���������� ����� (� �.�. �����������)
     * 
     * @return value
     */
    public String getUnitSellingPriceGoods() {
        return unitSellingPriceGoods;
    }

    /** 
     * Set the 'UnitSellingPriceGoods' element value. ������� ���� ���������� ������� ������ �� ���������� ����� (� �.�. �����������)
     * 
     * @param unitSellingPriceGoods
     */
    public void setUnitSellingPriceGoods(String unitSellingPriceGoods) {
        this.unitSellingPriceGoods = unitSellingPriceGoods;
    }

    /** 
     * Get the 'Cost' element value. ������� ����� ������ �������� ���������� ��� ���������� ������� �� ���������� �����,������� ������ ���� �������� � ���� ���������� ��� �� ��������
     * 
     * @return value
     */
    public String getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. ������� ����� ������ �������� ���������� ��� ���������� ������� �� ���������� �����,������� ������ ���� �������� � ���� ���������� ��� �� ��������
     * 
     * @param cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /** 
     * Get the 'Profitability' element value. ������� ������� ����������� �������������� ������
     * 
     * @return value
     */
    public String getProfitability() {
        return profitability;
    }

    /** 
     * Set the 'Profitability' element value. ������� ������� ����������� �������������� ������
     * 
     * @param profitability
     */
    public void setProfitability(String profitability) {
        this.profitability = profitability;
    }

    /** 
     * Get the 'BuyerGoods' element value. ���������� �������
     * 
     * @return value
     */
    public BuyerGoodsType getBuyerGoods() {
        return buyerGoods;
    }

    /** 
     * Set the 'BuyerGoods' element value. ���������� �������
     * 
     * @param buyerGoods
     */
    public void setBuyerGoods(BuyerGoodsType buyerGoods) {
        this.buyerGoods = buyerGoods;
    }

    /** 
     * Get the 'ExcessCustomsCost' element value. ���� ������ �� ���������� ����� ���������� ��������� ��������� ���������� ���������� ���������, ����������� �� ������ ���������� ��������
     * 
     * @return value
     */
    public ExcessCustomsCostType getExcessCustomsCost() {
        return excessCustomsCost;
    }

    /** 
     * Set the 'ExcessCustomsCost' element value. ���� ������ �� ���������� ����� ���������� ��������� ��������� ���������� ���������� ���������, ����������� �� ������ ���������� ��������
     * 
     * @param excessCustomsCost
     */
    public void setExcessCustomsCost(ExcessCustomsCostType excessCustomsCost) {
        this.excessCustomsCost = excessCustomsCost;
    }

    /** 
     * Get the 'MarketPrice' element value. �������� �� ���������� �������� ���� � ���������� ��������� ������� ���� �� ������ ��� ���� ��� ������� �� ��������� �����������.
     * 
     * @return value
     */
    public MarketPriceType getMarketPrice() {
        return marketPrice;
    }

    /** 
     * Set the 'MarketPrice' element value. �������� �� ���������� �������� ���� � ���������� ��������� ������� ���� �� ������ ��� ���� ��� ������� �� ��������� �����������.
     * 
     * @param marketPrice
     */
    public void setMarketPrice(MarketPriceType marketPrice) {
        this.marketPrice = marketPrice;
    }
}
