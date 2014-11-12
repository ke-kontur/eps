
package ru.acs.fts.schemas.album.transitrevealedrisks;

import java.util.ArrayList;
import java.util.List;

/** 
 * Характеристики досмотра/осмотра
 */
public class MeasureAttributeType
{
    private String measureAttributeCode;
    private List<String> measureAttributeValueList = new ArrayList<String>();
    private String measureAttributeNecessary;

    /** 
     * Get the 'MeasureAttributeCode' element value. Код характеристики досмотра/осмотра. Для досмотра указывается в соответствии со значениями классификатора "Характеристик таможенного досмотра товаров" - rskxdosm.dbf.
     * 
     * @return value
     */
    public String getMeasureAttributeCode() {
        return measureAttributeCode;
    }

    /** 
     * Set the 'MeasureAttributeCode' element value. Код характеристики досмотра/осмотра. Для досмотра указывается в соответствии со значениями классификатора "Характеристик таможенного досмотра товаров" - rskxdosm.dbf.
     * 
     * @param measureAttributeCode
     */
    public void setMeasureAttributeCode(String measureAttributeCode) {
        this.measureAttributeCode = measureAttributeCode;
    }

    /** 
     * Get the list of 'MeasureAttributeValue' element items. Значение характеристики досмотра/осмотра. Для досмотра указывается в соответствии со значениями классификатора "Допустимых значений характеристик таможенного досмотра товаров" - rskzdosm.dbf.
     * 
     * @return list
     */
    public List<String> getMeasureAttributeValueList() {
        return measureAttributeValueList;
    }

    /** 
     * Set the list of 'MeasureAttributeValue' element items. Значение характеристики досмотра/осмотра. Для досмотра указывается в соответствии со значениями классификатора "Допустимых значений характеристик таможенного досмотра товаров" - rskzdosm.dbf.
     * 
     * @param list
     */
    public void setMeasureAttributeValueList(List<String> list) {
        measureAttributeValueList = list;
    }

    /** 
     * Get the 'MeasureAttributeNecessary' element value. Признак, определяющий возможность выбора значения характеристики таможенного досмотра. 0 - возможно выбирать значения характеристик таможенного досмотра, 1 - возможность выбора отсутствует (досмотр применяется в соответствии со значениями характеристик, установленных профилем риска)
     * 
     * @return value
     */
    public String getMeasureAttributeNecessary() {
        return measureAttributeNecessary;
    }

    /** 
     * Set the 'MeasureAttributeNecessary' element value. Признак, определяющий возможность выбора значения характеристики таможенного досмотра. 0 - возможно выбирать значения характеристик таможенного досмотра, 1 - возможность выбора отсутствует (досмотр применяется в соответствии со значениями характеристик, установленных профилем риска)
     * 
     * @param measureAttributeNecessary
     */
    public void setMeasureAttributeNecessary(String measureAttributeNecessary) {
        this.measureAttributeNecessary = measureAttributeNecessary;
    }
}
