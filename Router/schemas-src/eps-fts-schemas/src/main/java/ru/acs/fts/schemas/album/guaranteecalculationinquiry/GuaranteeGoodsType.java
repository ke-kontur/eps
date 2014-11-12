
package ru.acs.fts.schemas.album.guaranteecalculationinquiry;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.guaranteecommonaggregatetypescust.AmountType;

/** 
 * Информация о товаре для расчета сумм обеспечения
 */
public class GuaranteeGoodsType
{
    private String numeric;
    private String TNVEDCode;
    private String originCountry;
    private String weightQuantity;
    private String privilegeCode;
    private SupplementaryQuantityType supplementaryQuantity;
    private SupplementaryQuantityType addSupplementaryQuantity;
    private AmountType cost;

    /** 
     * Get the 'Numeric' element value. Номер товара по порядку
     * 
     * @return value
     */
    public String getNumeric() {
        return numeric;
    }

    /** 
     * Set the 'Numeric' element value. Номер товара по порядку
     * 
     * @param numeric
     */
    public void setNumeric(String numeric) {
        this.numeric = numeric;
    }

    /** 
     * Get the 'TNVEDCode' element value. Код товара по ТН ВЭД ТС (указывается от 6 до 10 знаков)
     * 
     * @return value
     */
    public String getTNVEDCode() {
        return TNVEDCode;
    }

    /** 
     * Set the 'TNVEDCode' element value. Код товара по ТН ВЭД ТС (указывается от 6 до 10 знаков)
     * 
     * @param TNVEDCode
     */
    public void setTNVEDCode(String TNVEDCode) {
        this.TNVEDCode = TNVEDCode;
    }

    /** 
     * Get the 'OriginCountry' element value. Код страны происхождения товара
     * 
     * @return value
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /** 
     * Set the 'OriginCountry' element value. Код страны происхождения товара
     * 
     * @param originCountry
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    /** 
     * Get the 'WeightQuantity' element value. Вес товара
     * 
     * @return value
     */
    public String getWeightQuantity() {
        return weightQuantity;
    }

    /** 
     * Set the 'WeightQuantity' element value. Вес товара
     * 
     * @param weightQuantity
     */
    public void setWeightQuantity(String weightQuantity) {
        this.weightQuantity = weightQuantity;
    }

    /** 
     * Get the 'PrivilegeCode' element value. Код льготы
     * 
     * @return value
     */
    public String getPrivilegeCode() {
        return privilegeCode;
    }

    /** 
     * Set the 'PrivilegeCode' element value. Код льготы
     * 
     * @param privilegeCode
     */
    public void setPrivilegeCode(String privilegeCode) {
        this.privilegeCode = privilegeCode;
    }

    /** 
     * Get the 'SupplementaryQuantity' element value. Количество товара в дополнительной единице измерения
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value. Количество товара в дополнительной единице измерения
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
    }

    /** 
     * Get the 'AddSupplementaryQuantity' element value. Количество товара в единице измерения, отличной от основной и дополнительной
     * 
     * @return value
     */
    public SupplementaryQuantityType getAddSupplementaryQuantity() {
        return addSupplementaryQuantity;
    }

    /** 
     * Set the 'AddSupplementaryQuantity' element value. Количество товара в единице измерения, отличной от основной и дополнительной
     * 
     * @param addSupplementaryQuantity
     */
    public void setAddSupplementaryQuantity(
            SupplementaryQuantityType addSupplementaryQuantity) {
        this.addSupplementaryQuantity = addSupplementaryQuantity;
    }

    /** 
     * Get the 'Cost' element value. Стоимость товара
     * 
     * @return value
     */
    public AmountType getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. Стоимость товара
     * 
     * @param cost
     */
    public void setCost(AmountType cost) {
        this.cost = cost;
    }
}
