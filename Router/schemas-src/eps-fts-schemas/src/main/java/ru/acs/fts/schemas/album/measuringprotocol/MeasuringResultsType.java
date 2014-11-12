
package ru.acs.fts.schemas.album.measuringprotocol;

/** 
 * Итоговые значения измерений
 */
public class MeasuringResultsType
{
    private String barkSign;
    private String measureValue;
    private String absoluteError;
    private String resultMeasureValue;

    /** 
     * Get the 'BarkSign' element value. Признак измерений лесоматериалов с корой
     * 
     * @return value
     */
    public String getBarkSign() {
        return barkSign;
    }

    /** 
     * Set the 'BarkSign' element value. Признак измерений лесоматериалов с корой
     * 
     * @param barkSign
     */
    public void setBarkSign(String barkSign) {
        this.barkSign = barkSign;
    }

    /** 
     * Get the 'MeasureValue' element value. Сумма объемов, куб. м
     * 
     * @return value
     */
    public String getMeasureValue() {
        return measureValue;
    }

    /** 
     * Set the 'MeasureValue' element value. Сумма объемов, куб. м
     * 
     * @param measureValue
     */
    public void setMeasureValue(String measureValue) {
        this.measureValue = measureValue;
    }

    /** 
     * Get the 'AbsoluteError' element value. Абсолютная погрешность, куб. м
     * 
     * @return value
     */
    public String getAbsoluteError() {
        return absoluteError;
    }

    /** 
     * Set the 'AbsoluteError' element value. Абсолютная погрешность, куб. м
     * 
     * @param absoluteError
     */
    public void setAbsoluteError(String absoluteError) {
        this.absoluteError = absoluteError;
    }

    /** 
     * Get the 'ResultMeasureValue' element value. Результат измерения с учетом погрешности
     * 
     * @return value
     */
    public String getResultMeasureValue() {
        return resultMeasureValue;
    }

    /** 
     * Set the 'ResultMeasureValue' element value. Результат измерения с учетом погрешности
     * 
     * @param resultMeasureValue
     */
    public void setResultMeasureValue(String resultMeasureValue) {
        this.resultMeasureValue = resultMeasureValue;
    }
}
