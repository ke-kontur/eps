
package ru.acs.fts.schemas.album.applicationstore;

/** 
 * Строка списка товаров
 */
public class StrListGoodsType
{
    private String nameGoods;
    private String numberGoods;
    private String priceUnit;
    private String totalCostGoods;
    private String currency;
    private String unitName;
    private String unitCode;
    private String goodsNomenclatureCode;
    private String customsCostGoods;
    private String norm;

    /** 
     * Get the 'NameGoods' element value. Наименование припасов
     * 
     * @return value
     */
    public String getNameGoods() {
        return nameGoods;
    }

    /** 
     * Set the 'NameGoods' element value. Наименование припасов
     * 
     * @param nameGoods
     */
    public void setNameGoods(String nameGoods) {
        this.nameGoods = nameGoods;
    }

    /** 
     * Get the 'NumberGoods' element value. Количество припасов
     * 
     * @return value
     */
    public String getNumberGoods() {
        return numberGoods;
    }

    /** 
     * Set the 'NumberGoods' element value. Количество припасов
     * 
     * @param numberGoods
     */
    public void setNumberGoods(String numberGoods) {
        this.numberGoods = numberGoods;
    }

    /** 
     * Get the 'PriceUnit' element value. Стоимость за единицу товара
     * 
     * @return value
     */
    public String getPriceUnit() {
        return priceUnit;
    }

    /** 
     * Set the 'PriceUnit' element value. Стоимость за единицу товара
     * 
     * @param priceUnit
     */
    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }

    /** 
     * Get the 'TotalCostGoods' element value. Стоимость товара.
     * 
     * @return value
     */
    public String getTotalCostGoods() {
        return totalCostGoods;
    }

    /** 
     * Set the 'TotalCostGoods' element value. Стоимость товара.
     * 
     * @param totalCostGoods
     */
    public void setTotalCostGoods(String totalCostGoods) {
        this.totalCostGoods = totalCostGoods;
    }

    /** 
     * Get the 'Currency' element value. Валюта 
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. Валюта 
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'UnitName' element value. Наименование единицы измерения
     * 
     * @return value
     */
    public String getUnitName() {
        return unitName;
    }

    /** 
     * Set the 'UnitName' element value. Наименование единицы измерения
     * 
     * @param unitName
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /** 
     * Get the 'UnitCode' element value. Код единицы измерения
     * 
     * @return value
     */
    public String getUnitCode() {
        return unitCode;
    }

    /** 
     * Set the 'UnitCode' element value. Код единицы измерения
     * 
     * @param unitCode
     */
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    /** 
     * Get the 'GoodsNomenclatureCode' element value. Код ТН ВЭД ТС
     * 
     * @return value
     */
    public String getGoodsNomenclatureCode() {
        return goodsNomenclatureCode;
    }

    /** 
     * Set the 'GoodsNomenclatureCode' element value. Код ТН ВЭД ТС
     * 
     * @param goodsNomenclatureCode
     */
    public void setGoodsNomenclatureCode(String goodsNomenclatureCode) {
        this.goodsNomenclatureCode = goodsNomenclatureCode;
    }

    /** 
     * Get the 'CustomsCostGoods' element value. Таможенная стоимость товара
     * 
     * @return value
     */
    public String getCustomsCostGoods() {
        return customsCostGoods;
    }

    /** 
     * Set the 'CustomsCostGoods' element value. Таможенная стоимость товара
     * 
     * @param customsCostGoods
     */
    public void setCustomsCostGoods(String customsCostGoods) {
        this.customsCostGoods = customsCostGoods;
    }

    /** 
     * Get the 'Norm' element value. Норма припасов
     * 
     * @return value
     */
    public String getNorm() {
        return norm;
    }

    /** 
     * Set the 'Norm' element value. Норма припасов
     * 
     * @param norm
     */
    public void setNorm(String norm) {
        this.norm = norm;
    }
}
