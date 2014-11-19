
package ru.acs.fts.schemas.album.commercialact;

/** 
 * Описание товаров, которые были заявлены в документах, присутствуют по факту, но отличаются по своим характеристикам от сведений, заявленных в товаросопроводительных документах
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
     * Get the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @return value
     */
    public GoodsTNVEDCodeType getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(GoodsTNVEDCodeType goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'GoodsDescription' element value. Описание товара
     * 
     * @return value
     */
    public GoodsDescriptionType getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. Описание товара
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(GoodsDescriptionType goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the 'InvoiceCost' element value. Сведения о фактурной стоимости
     * 
     * @return value
     */
    public InvoiceCostType getInvoiceCost() {
        return invoiceCost;
    }

    /** 
     * Set the 'InvoiceCost' element value. Сведения о фактурной стоимости
     * 
     * @param invoiceCost
     */
    public void setInvoiceCost(InvoiceCostType invoiceCost) {
        this.invoiceCost = invoiceCost;
    }

    /** 
     * Get the 'PlaceNumber' element value. Количество грузовых мест
     * 
     * @return value
     */
    public PlaceNumberType getPlaceNumber() {
        return placeNumber;
    }

    /** 
     * Set the 'PlaceNumber' element value. Количество грузовых мест
     * 
     * @param placeNumber
     */
    public void setPlaceNumber(PlaceNumberType placeNumber) {
        this.placeNumber = placeNumber;
    }

    /** 
     * Get the 'GoodsQuantity' element value. Количество товара в дополнительной единице измерения
     * 
     * @return value
     */
    public GoodsQuantityType getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. Количество товара в дополнительной единице измерения
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(GoodsQuantityType goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'BruttoVolQuant' element value. Вес брутто/объем
     * 
     * @return value
     */
    public BruttoVolQuantType getBruttoVolQuant() {
        return bruttoVolQuant;
    }

    /** 
     * Set the 'BruttoVolQuant' element value. Вес брутто/объем
     * 
     * @param bruttoVolQuant
     */
    public void setBruttoVolQuant(BruttoVolQuantType bruttoVolQuant) {
        this.bruttoVolQuant = bruttoVolQuant;
    }
}
