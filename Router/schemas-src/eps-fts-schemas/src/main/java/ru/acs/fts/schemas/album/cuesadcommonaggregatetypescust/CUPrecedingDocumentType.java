
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Предшествующие документы
 */
public class CUPrecedingDocumentType extends PrecedingDocumentType
{
    private String netWeightQuantity;
    private String customsCountryCode;
    private String addNumberPart;
    private String customsCost;
    private String netWeight;
    private SupplementaryQuantityType supplementaryGoodsQuantity;

    /** 
     * Get the 'NetWeightQuantity' element value. Масса нетто товара, вошедшего в состав декларируемого товара. для РБ/Масса нетто товара, использованного при изготовлении декларируемого товара
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. Масса нетто товара, вошедшего в состав декларируемого товара. для РБ/Масса нетто товара, использованного при изготовлении декларируемого товара
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'CustomsCountryCode' element value. Код страны таможенного органа
     * 
     * @return value
     */
    public String getCustomsCountryCode() {
        return customsCountryCode;
    }

    /** 
     * Set the 'CustomsCountryCode' element value. Код страны таможенного органа
     * 
     * @param customsCountryCode
     */
    public void setCustomsCountryCode(String customsCountryCode) {
        this.customsCountryCode = customsCountryCode;
    }

    /** 
     * Get the 'AddNumberPart' element value. Предшествующий документ - дополнительная составляющая номера (заполняется при указании номера обязательства о подачи таможенной декларации ("ОБ") ). Для РФ
     * 
     * @return value
     */
    public String getAddNumberPart() {
        return addNumberPart;
    }

    /** 
     * Set the 'AddNumberPart' element value. Предшествующий документ - дополнительная составляющая номера (заполняется при указании номера обязательства о подачи таможенной декларации ("ОБ") ). Для РФ
     * 
     * @param addNumberPart
     */
    public void setAddNumberPart(String addNumberPart) {
        this.addNumberPart = addNumberPart;
    }

    /** 
     * Get the 'CustomsCost' element value. Таможенная стоимость товара, указанная в гр 45 предшествующей ДТ
     * 
     * @return value
     */
    public String getCustomsCost() {
        return customsCost;
    }

    /** 
     * Set the 'CustomsCost' element value. Таможенная стоимость товара, указанная в гр 45 предшествующей ДТ
     * 
     * @param customsCost
     */
    public void setCustomsCost(String customsCost) {
        this.customsCost = customsCost;
    }

    /** 
     * Get the 'NetWeight' element value. Масса нетто товара, указанная в гр 38 предшествующей ДТ
     * 
     * @return value
     */
    public String getNetWeight() {
        return netWeight;
    }

    /** 
     * Set the 'NetWeight' element value. Масса нетто товара, указанная в гр 38 предшествующей ДТ
     * 
     * @param netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. Количество товара в дополнительной единице измерения
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. Количество товара в дополнительной единице измерения
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(
            SupplementaryQuantityType supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }
}
