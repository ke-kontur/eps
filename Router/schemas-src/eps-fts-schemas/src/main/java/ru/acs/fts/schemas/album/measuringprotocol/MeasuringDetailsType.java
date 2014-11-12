
package ru.acs.fts.schemas.album.measuringprotocol;

/** 
 * Результаты измерений
 */
public class MeasuringDetailsType
{
    private String barkSign;
    private String measureSign;
    private String firstMeasureValue;
    private String secondMeasureValue;
    private String averageValue;

    /** 
     * Get the 'BarkSign' element value. Признак проведения измерений лесоматериалов с корой
     * 
     * @return value
     */
    public String getBarkSign() {
        return barkSign;
    }

    /** 
     * Set the 'BarkSign' element value. Признак проведения измерений лесоматериалов с корой
     * 
     * @param barkSign
     */
    public void setBarkSign(String barkSign) {
        this.barkSign = barkSign;
    }

    /** 
     * Get the 'MeasureSign' element value. Измерение диаметра: 1 - верхнего; 2 - срединного; 3 - нижнего
     * 
     * @return value
     */
    public String getMeasureSign() {
        return measureSign;
    }

    /** 
     * Set the 'MeasureSign' element value. Измерение диаметра: 1 - верхнего; 2 - срединного; 3 - нижнего
     * 
     * @param measureSign
     */
    public void setMeasureSign(String measureSign) {
        this.measureSign = measureSign;
    }

    /** 
     * Get the 'FirstMeasureValue' element value. Значение результата первого измерения
     * 
     * @return value
     */
    public String getFirstMeasureValue() {
        return firstMeasureValue;
    }

    /** 
     * Set the 'FirstMeasureValue' element value. Значение результата первого измерения
     * 
     * @param firstMeasureValue
     */
    public void setFirstMeasureValue(String firstMeasureValue) {
        this.firstMeasureValue = firstMeasureValue;
    }

    /** 
     * Get the 'SecondMeasureValue' element value. Значение результата второго измерения
     * 
     * @return value
     */
    public String getSecondMeasureValue() {
        return secondMeasureValue;
    }

    /** 
     * Set the 'SecondMeasureValue' element value. Значение результата второго измерения
     * 
     * @param secondMeasureValue
     */
    public void setSecondMeasureValue(String secondMeasureValue) {
        this.secondMeasureValue = secondMeasureValue;
    }

    /** 
     * Get the 'AverageValue' element value. Среднее значение (толщина бревна)
     * 
     * @return value
     */
    public String getAverageValue() {
        return averageValue;
    }

    /** 
     * Set the 'AverageValue' element value. Среднее значение (толщина бревна)
     * 
     * @param averageValue
     */
    public void setAverageValue(String averageValue) {
        this.averageValue = averageValue;
    }
}
