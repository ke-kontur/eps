
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о товаре для переработки.
 */
public class TreatProductsType
{
    private List<String> nameList = new ArrayList<String>();
    private String TNVED;
    private String rubCost;
    private String quantityKg;
    private String addUnit;
    private String addQuantity;
    private String goodsQuantity;
    private String measureUnitQualifierName;
    private String measureUnitQualifierCode;
    private String customsCode;
    private TreatmentCurrencyCostType currencyCost;
    private List<DocumentBaseType> contractList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the list of 'Name' element items. Наименование товаров
     * 
     * @return list
     */
    public List<String> getNameList() {
        return nameList;
    }

    /** 
     * Set the list of 'Name' element items. Наименование товаров
     * 
     * @param list
     */
    public void setNameList(List<String> list) {
        nameList = list;
    }

    /** 
     * Get the 'TNVED' element value. Код по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getTNVED() {
        return TNVED;
    }

    /** 
     * Set the 'TNVED' element value. Код по ТН ВЭД ТС
     * 
     * @param TNVED
     */
    public void setTNVED(String TNVED) {
        this.TNVED = TNVED;
    }

    /** 
     * Get the 'RubCost' element value. Стоимость, руб.
     * 
     * @return value
     */
    public String getRubCost() {
        return rubCost;
    }

    /** 
     * Set the 'RubCost' element value. Стоимость, руб.
     * 
     * @param rubCost
     */
    public void setRubCost(String rubCost) {
        this.rubCost = rubCost;
    }

    /** 
     * Get the 'QuantityKg' element value. Количество в кг 
     * 
     * @return value
     */
    public String getQuantityKg() {
        return quantityKg;
    }

    /** 
     * Set the 'QuantityKg' element value. Количество в кг 
     * 
     * @param quantityKg
     */
    public void setQuantityKg(String quantityKg) {
        this.quantityKg = quantityKg;
    }

    /** 
     * Get the 'AddUnit' element value. Код дополнительной нестандартной единицы измерения (980-комплект; 981-рулон; 982-ящик; 983-километр; 984-бобина; 985-упаковка)
     * 
     * @return value
     */
    public String getAddUnit() {
        return addUnit;
    }

    /** 
     * Set the 'AddUnit' element value. Код дополнительной нестандартной единицы измерения (980-комплект; 981-рулон; 982-ящик; 983-километр; 984-бобина; 985-упаковка)
     * 
     * @param addUnit
     */
    public void setAddUnit(String addUnit) {
        this.addUnit = addUnit;
    }

    /** 
     * Get the 'AddQuantity' element value. Количество товара в нестандартных дополнительных единицах измерения
     * 
     * @return value
     */
    public String getAddQuantity() {
        return addQuantity;
    }

    /** 
     * Set the 'AddQuantity' element value. Количество товара в нестандартных дополнительных единицах измерения
     * 
     * @param addQuantity
     */
    public void setAddQuantity(String addQuantity) {
        this.addQuantity = addQuantity;
    }

    /** 
     * Get the 'GoodsQuantity' element value. Количество товара в единице измерения.
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. Количество товара в единице измерения.
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'MeasureUnitQualifierName' element value. Краткое наименование единицы измерения.
     * 
     * @return value
     */
    public String getMeasureUnitQualifierName() {
        return measureUnitQualifierName;
    }

    /** 
     * Set the 'MeasureUnitQualifierName' element value. Краткое наименование единицы измерения.
     * 
     * @param measureUnitQualifierName
     */
    public void setMeasureUnitQualifierName(String measureUnitQualifierName) {
        this.measureUnitQualifierName = measureUnitQualifierName;
    }

    /** 
     * Get the 'MeasureUnitQualifierCode' element value. Код единицы измерения в соответствии с единицами измерения, применяемыми в Таможенном тарифе Российской Федерации..
     * 
     * @return value
     */
    public String getMeasureUnitQualifierCode() {
        return measureUnitQualifierCode;
    }

    /** 
     * Set the 'MeasureUnitQualifierCode' element value. Код единицы измерения в соответствии с единицами измерения, применяемыми в Таможенном тарифе Российской Федерации..
     * 
     * @param measureUnitQualifierCode
     */
    public void setMeasureUnitQualifierCode(String measureUnitQualifierCode) {
        this.measureUnitQualifierCode = measureUnitQualifierCode;
    }

    /** 
     * Get the 'CustomsCode' element value. Код  таможенного органа
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код  таможенного органа
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'CurrencyCost' element value. Сведения о стоимости в валюте
     * 
     * @return value
     */
    public TreatmentCurrencyCostType getCurrencyCost() {
        return currencyCost;
    }

    /** 
     * Set the 'CurrencyCost' element value. Сведения о стоимости в валюте
     * 
     * @param currencyCost
     */
    public void setCurrencyCost(TreatmentCurrencyCostType currencyCost) {
        this.currencyCost = currencyCost;
    }

    /** 
     * Get the list of 'Contract' element items. Сведения о контракте
     * 
     * @return list
     */
    public List<DocumentBaseType> getContractList() {
        return contractList;
    }

    /** 
     * Set the list of 'Contract' element items. Сведения о контракте
     * 
     * @param list
     */
    public void setContractList(List<DocumentBaseType> list) {
        contractList = list;
    }
}
