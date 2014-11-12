
package ru.acs.fts.schemas.album.transitrevealedrisks;

import java.util.ArrayList;
import java.util.List;

/** 
 * Набор информации о каждой мере по минимизации рисков
 */
public class MinimizeMeasuresInfoType
{
    private String minimizeMeasureCode;
    private String minimizeMeasureNecessary;
    private String takeMeasuresSign;
    private String measureDescription;
    private String mainActionCode;
    private List<MeasureAttributeType> measureAttributeList = new ArrayList<MeasureAttributeType>();

    /** 
     * Get the 'MinimizeMeasureCode' element value. Код прямых мер по минимизации рисков (значение указывается в соответствии с классификатором "Прямых мер по минимизации рисков" rsk_mera.dbf)
     * 
     * @return value
     */
    public String getMinimizeMeasureCode() {
        return minimizeMeasureCode;
    }

    /** 
     * Set the 'MinimizeMeasureCode' element value. Код прямых мер по минимизации рисков (значение указывается в соответствии с классификатором "Прямых мер по минимизации рисков" rsk_mera.dbf)
     * 
     * @param minimizeMeasureCode
     */
    public void setMinimizeMeasureCode(String minimizeMeasureCode) {
        this.minimizeMeasureCode = minimizeMeasureCode;
    }

    /** 
     * Get the 'MinimizeMeasureNecessary' element value. Обязательность применения меры. Возможные значения: 0 - необязательное применение меры, 1 - обязательное применение меры
     * 
     * @return value
     */
    public String getMinimizeMeasureNecessary() {
        return minimizeMeasureNecessary;
    }

    /** 
     * Set the 'MinimizeMeasureNecessary' element value. Обязательность применения меры. Возможные значения: 0 - необязательное применение меры, 1 - обязательное применение меры
     * 
     * @param minimizeMeasureNecessary
     */
    public void setMinimizeMeasureNecessary(String minimizeMeasureNecessary) {
        this.minimizeMeasureNecessary = minimizeMeasureNecessary;
    }

    /** 
     * Get the 'TakeMeasuresSign' element value. Признак применения мер по минимизации рисков: "0" - мера (досмотр/осмотр) не применяется согласно результатам случайной выборки; "1" - мера должна быть применена согласно ПР; "3" - мера не применяется, поскольку субъект ВЭД включен в перечень лиц, перемещающих товары, в отношении которых не применяются меры по минимизации рисков, содержащиеся в ПР.
     * 
     * @return value
     */
    public String getTakeMeasuresSign() {
        return takeMeasuresSign;
    }

    /** 
     * Set the 'TakeMeasuresSign' element value. Признак применения мер по минимизации рисков: "0" - мера (досмотр/осмотр) не применяется согласно результатам случайной выборки; "1" - мера должна быть применена согласно ПР; "3" - мера не применяется, поскольку субъект ВЭД включен в перечень лиц, перемещающих товары, в отношении которых не применяются меры по минимизации рисков, содержащиеся в ПР.
     * 
     * @param takeMeasuresSign
     */
    public void setTakeMeasuresSign(String takeMeasuresSign) {
        this.takeMeasuresSign = takeMeasuresSign;
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
     * Get the 'MainActionCode' element value. Код главной меры по минимизации рисков
     * 
     * @return value
     */
    public String getMainActionCode() {
        return mainActionCode;
    }

    /** 
     * Set the 'MainActionCode' element value. Код главной меры по минимизации рисков
     * 
     * @param mainActionCode
     */
    public void setMainActionCode(String mainActionCode) {
        this.mainActionCode = mainActionCode;
    }

    /** 
     * Get the list of 'MeasureAttribute' element items. Характеристики досмотра/осмотра
     * 
     * @return list
     */
    public List<MeasureAttributeType> getMeasureAttributeList() {
        return measureAttributeList;
    }

    /** 
     * Set the list of 'MeasureAttribute' element items. Характеристики досмотра/осмотра
     * 
     * @param list
     */
    public void setMeasureAttributeList(List<MeasureAttributeType> list) {
        measureAttributeList = list;
    }
}
