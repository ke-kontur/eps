
package ru.acs.fts.schemas.album.oez_exportpass;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Статус товара
 */
public class GoodsStatusType
{
    private String statusSymbolicValue;
    private String customsModeCode;
    private String goodsNumeric;
    private String netWeightQuantity;
    private GTDIDType GTDID;
    private SupplementaryQuantityType supplementaryQuantity;

    /** 
     * Get the 'StatusSymbolicValue' element value. Символьное значение статуса товара
     * 
     * @return value
     */
    public String getStatusSymbolicValue() {
        return statusSymbolicValue;
    }

    /** 
     * Set the 'StatusSymbolicValue' element value. Символьное значение статуса товара
     * 
     * @param statusSymbolicValue
     */
    public void setStatusSymbolicValue(String statusSymbolicValue) {
        this.statusSymbolicValue = statusSymbolicValue;
    }

    /** 
     * Get the 'CustomsModeCode' element value. Код таможенной процедуры
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. Код таможенной процедуры
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

    /** 
     * Get the 'GoodsNumeric' element value. Порядковый номер товара гр 32
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Порядковый номер товара гр 32
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. Масса товара, нетто (кг)
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. Масса товара, нетто (кг)
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'GTDID' element value. Регистрационный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Регистрационный номер ДТ
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
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
}
