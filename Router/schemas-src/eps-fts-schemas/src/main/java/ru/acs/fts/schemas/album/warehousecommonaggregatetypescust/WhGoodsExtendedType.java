
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Комплексный тип для расширенного описания сведений о товарах
 */
public class WhGoodsExtendedType extends WhGoodType
{
    private String goodsWHNumber;
    private String comments;
    private String MPOCaseNumder;
    private WHSuppQuantityType mpoBillBruttoVolQuant;
    private WHAngarType keepingPlace;
    private WHKeepingLimitType keepingLimit;
    private List<WHCustomsControlType> customsControlList = new ArrayList<WHCustomsControlType>();

    /** 
     * Get the 'GoodsWHNumber' element value. Складской номер товара (графа 5 отчета)
     * 
     * @return value
     */
    public String getGoodsWHNumber() {
        return goodsWHNumber;
    }

    /** 
     * Set the 'GoodsWHNumber' element value. Складской номер товара (графа 5 отчета)
     * 
     * @param goodsWHNumber
     */
    public void setGoodsWHNumber(String goodsWHNumber) {
        this.goodsWHNumber = goodsWHNumber;
    }

    /** 
     * Get the 'Comments' element value. Примечание по условиям хранения (графа 11 отчета)
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Примечание по условиям хранения (графа 11 отчета)
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'MPOCaseNumder' element value. Номер емкости МПО, 29 знаков
     * 
     * @return value
     */
    public String getMPOCaseNumder() {
        return MPOCaseNumder;
    }

    /** 
     * Set the 'MPOCaseNumder' element value. Номер емкости МПО, 29 знаков
     * 
     * @param MPOCaseNumder
     */
    public void setMPOCaseNumder(String MPOCaseNumder) {
        this.MPOCaseNumder = MPOCaseNumder;
    }

    /** 
     * Get the 'MpoBillBruttoVolQuant' element value. Вес брутто МПО (емкости МПО) по сопроводительным документам. Заполняется в случае выявления при принятии на временное хранение несоответствия веса, сведениям, указанным в документах сопровождающих МПО
     * 
     * @return value
     */
    public WHSuppQuantityType getMpoBillBruttoVolQuant() {
        return mpoBillBruttoVolQuant;
    }

    /** 
     * Set the 'MpoBillBruttoVolQuant' element value. Вес брутто МПО (емкости МПО) по сопроводительным документам. Заполняется в случае выявления при принятии на временное хранение несоответствия веса, сведениям, указанным в документах сопровождающих МПО
     * 
     * @param mpoBillBruttoVolQuant
     */
    public void setMpoBillBruttoVolQuant(
            WHSuppQuantityType mpoBillBruttoVolQuant) {
        this.mpoBillBruttoVolQuant = mpoBillBruttoVolQuant;
    }

    /** 
     * Get the 'KeepingPlace' element value. Описание места хранения товаров
     * 
     * @return value
     */
    public WHAngarType getKeepingPlace() {
        return keepingPlace;
    }

    /** 
     * Set the 'KeepingPlace' element value. Описание места хранения товаров
     * 
     * @param keepingPlace
     */
    public void setKeepingPlace(WHAngarType keepingPlace) {
        this.keepingPlace = keepingPlace;
    }

    /** 
     * Get the 'KeepingLimit' element value. Сведения о сроке хранения товара
     * 
     * @return value
     */
    public WHKeepingLimitType getKeepingLimit() {
        return keepingLimit;
    }

    /** 
     * Set the 'KeepingLimit' element value. Сведения о сроке хранения товара
     * 
     * @param keepingLimit
     */
    public void setKeepingLimit(WHKeepingLimitType keepingLimit) {
        this.keepingLimit = keepingLimit;
    }

    /** 
     * Get the list of 'CustomsControls' element items. Сведения о принятых мерах таможенного контроля
     * 
     * @return list
     */
    public List<WHCustomsControlType> getCustomsControlList() {
        return customsControlList;
    }

    /** 
     * Set the list of 'CustomsControls' element items. Сведения о принятых мерах таможенного контроля
     * 
     * @param list
     */
    public void setCustomsControlList(List<WHCustomsControlType> list) {
        customsControlList = list;
    }
}
