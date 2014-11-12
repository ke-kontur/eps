
package ru.acs.fts.schemas.album.oez_report;

/** 
 * Таблица 3. Раздел 2. Товар, полученный в результате переработки товаров, помещенных под таможенный режим свободной таможенной зоны, и распоряжение такими товарами
 */
public class Table3Section2GoodsType extends GoodsWithoutStatusBaseType
{
    private String goodsSign;
    private String STZGoodsProduct;
    private String quantity;
    private String residentsGoodsQuantity;
    private Table3Section2WasteProductsUsageType wasteProductsUsage;

    /** 
     * Get the 'GoodsSign' element value. Тип: 1 - товары изготовленные(полученные) из иностранных товаров, 2 - товары изготовленные(полученные) с использованием иностранных товаров, 3 - товары изготовленные(полученные) из товаров ТС
     * 
     * @return value
     */
    public String getGoodsSign() {
        return goodsSign;
    }

    /** 
     * Set the 'GoodsSign' element value. Тип: 1 - товары изготовленные(полученные) из иностранных товаров, 2 - товары изготовленные(полученные) с использованием иностранных товаров, 3 - товары изготовленные(полученные) из товаров ТС
     * 
     * @param goodsSign
     */
    public void setGoodsSign(String goodsSign) {
        this.goodsSign = goodsSign;
    }

    /** 
     * Get the 'STZGoodsProduct' element value. Товары, изготовленные из товаров, помещенных под таможенную процедуру СТЗ
     * 
     * @return value
     */
    public String getSTZGoodsProduct() {
        return STZGoodsProduct;
    }

    /** 
     * Set the 'STZGoodsProduct' element value. Товары, изготовленные из товаров, помещенных под таможенную процедуру СТЗ
     * 
     * @param STZGoodsProduct
     */
    public void setSTZGoodsProduct(String STZGoodsProduct) {
        this.STZGoodsProduct = STZGoodsProduct;
    }

    /** 
     * Get the 'Quantity' element value. Количество товара
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество товара
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'ResidentsGoodsQuantity' element value. Товары находящиеся у резидента ОЭЗ в отношении которых осуществляется хранение(складирование) на территории ОЭЗ
     * 
     * @return value
     */
    public String getResidentsGoodsQuantity() {
        return residentsGoodsQuantity;
    }

    /** 
     * Set the 'ResidentsGoodsQuantity' element value. Товары находящиеся у резидента ОЭЗ в отношении которых осуществляется хранение(складирование) на территории ОЭЗ
     * 
     * @param residentsGoodsQuantity
     */
    public void setResidentsGoodsQuantity(String residentsGoodsQuantity) {
        this.residentsGoodsQuantity = residentsGoodsQuantity;
    }

    /** 
     * Get the 'WasteProductsUsage' element value. Распоряжение продуктами переработки и отходами
     * 
     * @return value
     */
    public Table3Section2WasteProductsUsageType getWasteProductsUsage() {
        return wasteProductsUsage;
    }

    /** 
     * Set the 'WasteProductsUsage' element value. Распоряжение продуктами переработки и отходами
     * 
     * @param wasteProductsUsage
     */
    public void setWasteProductsUsage(
            Table3Section2WasteProductsUsageType wasteProductsUsage) {
        this.wasteProductsUsage = wasteProductsUsage;
    }
}
