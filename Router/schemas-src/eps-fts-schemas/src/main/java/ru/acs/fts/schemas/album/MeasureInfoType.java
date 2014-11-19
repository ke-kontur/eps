
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;

/** 
 * Тип, описывающий характеристики досмотра
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:DTRevealedRisks:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MeasureInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="MeasureAttributeCode"/>
 *     &lt;xs:element type="xs:string" name="MeasureAttributeValue" maxOccurs="unbounded"/>
 *     &lt;xs:element type="xs:string" name="MeasureAttributeNecessary"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MeasureInfoType
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
