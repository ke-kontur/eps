
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;

/** 
 * Тип, описывающий меру по минимизации рисков (ММР)
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:DTRevealedRisks:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MinimizeInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="MinimizeMeasureCode"/>
 *     &lt;xs:element type="xs:string" name="MinimizeMeasureMainCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="MinimizeMeasureNecessity"/>
 *     &lt;xs:element type="xs:string" name="MinimizeMeasureUse"/>
 *     &lt;xs:element type="xs:string" name="MeasureDescription" minOccurs="0"/>
 *     &lt;xs:element type="ns:MeasureInfoType" name="MeasureAttribute" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MinimizeInfoType
{
    private String minimizeMeasureCode;
    private String minimizeMeasureMainCode;
    private String minimizeMeasureNecessity;
    private String minimizeMeasureUse;
    private String measureDescription;
    private List<MeasureInfoType> measureAttributeList = new ArrayList<MeasureInfoType>();

    /** 
     * Get the 'MinimizeMeasureCode' element value. Код прямой меры по минимизации рисков (значение указывается в соответствии с классификатором "Прямых мер по минимизации рисков" rsk_mera.dbf)
     * 
     * @return value
     */
    public String getMinimizeMeasureCode() {
        return minimizeMeasureCode;
    }

    /** 
     * Set the 'MinimizeMeasureCode' element value. Код прямой меры по минимизации рисков (значение указывается в соответствии с классификатором "Прямых мер по минимизации рисков" rsk_mera.dbf)
     * 
     * @param minimizeMeasureCode
     */
    public void setMinimizeMeasureCode(String minimizeMeasureCode) {
        this.minimizeMeasureCode = minimizeMeasureCode;
    }

    /** 
     * Get the 'MinimizeMeasureMainCode' element value. Код главной меры по минимизации рисков (значение указывается в соответствии с классификатором "Прямых мер по минимизации рисков" rsk_mera.dbf)
     * 
     * @return value
     */
    public String getMinimizeMeasureMainCode() {
        return minimizeMeasureMainCode;
    }

    /** 
     * Set the 'MinimizeMeasureMainCode' element value. Код главной меры по минимизации рисков (значение указывается в соответствии с классификатором "Прямых мер по минимизации рисков" rsk_mera.dbf)
     * 
     * @param minimizeMeasureMainCode
     */
    public void setMinimizeMeasureMainCode(String minimizeMeasureMainCode) {
        this.minimizeMeasureMainCode = minimizeMeasureMainCode;
    }

    /** 
     * Get the 'MinimizeMeasureNecessity' element value. Признак обязательности применения меры по минимизации риска. Возможные значения: 0 - применять меру не обязательно. 1 - мера должна быть применена обязательно.
     * 
     * @return value
     */
    public String getMinimizeMeasureNecessity() {
        return minimizeMeasureNecessity;
    }

    /** 
     * Set the 'MinimizeMeasureNecessity' element value. Признак обязательности применения меры по минимизации риска. Возможные значения: 0 - применять меру не обязательно. 1 - мера должна быть применена обязательно.
     * 
     * @param minimizeMeasureNecessity
     */
    public void setMinimizeMeasureNecessity(String minimizeMeasureNecessity) {
        this.minimizeMeasureNecessity = minimizeMeasureNecessity;
    }

    /** 
     * Get the 'MinimizeMeasureUse' element value. Признак применения мер по минимизации рисков:
    «0» - мера не применяется согласно результатам случайной выборки;
    «1» – мера должна быть применена согласно профилю риска;
    «2» - мера не применялась из-за несоответствия этапа, на котором была проведена проверка на наличие рисков, и этапа, на котором мера по минимизации рисков должна применяться согласно условиям профиля риска;
    «4» - «мера не применяется, поскольку субъект ВЭД включен в перечень лиц, в отношении которых определена степень выборочности применения мер по минимизации рисков, содержащихся в профилях рисков»

     * 
     * @return value
     */
    public String getMinimizeMeasureUse() {
        return minimizeMeasureUse;
    }

    /** 
     * Set the 'MinimizeMeasureUse' element value. Признак применения мер по минимизации рисков:
    «0» - мера не применяется согласно результатам случайной выборки;
    «1» – мера должна быть применена согласно профилю риска;
    «2» - мера не применялась из-за несоответствия этапа, на котором была проведена проверка на наличие рисков, и этапа, на котором мера по минимизации рисков должна применяться согласно условиям профиля риска;
    «4» - «мера не применяется, поскольку субъект ВЭД включен в перечень лиц, в отношении которых определена степень выборочности применения мер по минимизации рисков, содержащихся в профилях рисков»

     * 
     * @param minimizeMeasureUse
     */
    public void setMinimizeMeasureUse(String minimizeMeasureUse) {
        this.minimizeMeasureUse = minimizeMeasureUse;
    }

    /** 
     * Get the 'MeasureDescription' element value. Примечание к мере по минимизации рисков
     * 
     * @return value
     */
    public String getMeasureDescription() {
        return measureDescription;
    }

    /** 
     * Set the 'MeasureDescription' element value. Примечание к мере по минимизации рисков
     * 
     * @param measureDescription
     */
    public void setMeasureDescription(String measureDescription) {
        this.measureDescription = measureDescription;
    }

    /** 
     * Get the list of 'MeasureAttribute' element items. Характеристики досмотра/осмотра
     * 
     * @return list
     */
    public List<MeasureInfoType> getMeasureAttributeList() {
        return measureAttributeList;
    }

    /** 
     * Set the list of 'MeasureAttribute' element items. Характеристики досмотра/осмотра
     * 
     * @param list
     */
    public void setMeasureAttributeList(List<MeasureInfoType> list) {
        measureAttributeList = list;
    }
}
