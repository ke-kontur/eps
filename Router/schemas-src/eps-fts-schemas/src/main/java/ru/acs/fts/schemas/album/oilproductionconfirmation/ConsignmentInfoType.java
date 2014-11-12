
package ru.acs.fts.schemas.album.oilproductionconfirmation;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Сведения о поставке
 */
public class ConsignmentInfoType
{
    private String oilDescription;
    private String productionYear;
    private String oilField;
    private SupplementaryQuantityType oilQuantity;

    /** 
     * Get the 'OilDescription' element value. Физико-химические характеристики нефти сырой
     * 
     * @return value
     */
    public String getOilDescription() {
        return oilDescription;
    }

    /** 
     * Set the 'OilDescription' element value. Физико-химические характеристики нефти сырой
     * 
     * @param oilDescription
     */
    public void setOilDescription(String oilDescription) {
        this.oilDescription = oilDescription;
    }

    /** 
     * Get the 'ProductionYear' element value. Год добычи нефти
     * 
     * @return value
     */
    public String getProductionYear() {
        return productionYear;
    }

    /** 
     * Set the 'ProductionYear' element value. Год добычи нефти
     * 
     * @param productionYear
     */
    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    /** 
     * Get the 'OilField' element value. Наименование месторождения
     * 
     * @return value
     */
    public String getOilField() {
        return oilField;
    }

    /** 
     * Set the 'OilField' element value. Наименование месторождения
     * 
     * @param oilField
     */
    public void setOilField(String oilField) {
        this.oilField = oilField;
    }

    /** 
     * Get the 'OilQuantity' element value. Объем поставки
     * 
     * @return value
     */
    public SupplementaryQuantityType getOilQuantity() {
        return oilQuantity;
    }

    /** 
     * Set the 'OilQuantity' element value. Объем поставки
     * 
     * @param oilQuantity
     */
    public void setOilQuantity(SupplementaryQuantityType oilQuantity) {
        this.oilQuantity = oilQuantity;
    }
}
