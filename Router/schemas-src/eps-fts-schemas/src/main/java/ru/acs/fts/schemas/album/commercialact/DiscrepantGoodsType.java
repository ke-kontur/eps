
package ru.acs.fts.schemas.album.commercialact;

/** 
 * �������� �������, ������� ���� �������� � ����������, ������������ �� �����, �� ���������� �� ����� ��������������� �� ��������, ���������� � ���������������������� ����������
 */
public class DiscrepantGoodsType extends ActGoodsType
{
    private GoodsTNVEDCodeType goodsTNVEDCode;
    private GoodsDescriptionType goodsDescription;
    private InvoiceCostType invoiceCost;
    private PlaceNumberType placeNumber;
    private GoodsQuantityType goodsQuantity;
    private BruttoVolQuantType bruttoVolQuant;

    /** 
     * Get the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @return value
     */
    public GoodsTNVEDCodeType getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(GoodsTNVEDCodeType goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'GoodsDescription' element value. �������� ������
     * 
     * @return value
     */
    public GoodsDescriptionType getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. �������� ������
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(GoodsDescriptionType goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the 'InvoiceCost' element value. �������� � ��������� ���������
     * 
     * @return value
     */
    public InvoiceCostType getInvoiceCost() {
        return invoiceCost;
    }

    /** 
     * Set the 'InvoiceCost' element value. �������� � ��������� ���������
     * 
     * @param invoiceCost
     */
    public void setInvoiceCost(InvoiceCostType invoiceCost) {
        this.invoiceCost = invoiceCost;
    }

    /** 
     * Get the 'PlaceNumber' element value. ���������� �������� ����
     * 
     * @return value
     */
    public PlaceNumberType getPlaceNumber() {
        return placeNumber;
    }

    /** 
     * Set the 'PlaceNumber' element value. ���������� �������� ����
     * 
     * @param placeNumber
     */
    public void setPlaceNumber(PlaceNumberType placeNumber) {
        this.placeNumber = placeNumber;
    }

    /** 
     * Get the 'GoodsQuantity' element value. ���������� ������ � �������������� ������� ���������
     * 
     * @return value
     */
    public GoodsQuantityType getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. ���������� ������ � �������������� ������� ���������
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(GoodsQuantityType goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'BruttoVolQuant' element value. ��� ������/�����
     * 
     * @return value
     */
    public BruttoVolQuantType getBruttoVolQuant() {
        return bruttoVolQuant;
    }

    /** 
     * Set the 'BruttoVolQuant' element value. ��� ������/�����
     * 
     * @param bruttoVolQuant
     */
    public void setBruttoVolQuant(BruttoVolQuantType bruttoVolQuant) {
        this.bruttoVolQuant = bruttoVolQuant;
    }
}
