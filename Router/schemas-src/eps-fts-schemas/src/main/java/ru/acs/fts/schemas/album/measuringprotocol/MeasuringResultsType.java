
package ru.acs.fts.schemas.album.measuringprotocol;

/** 
 * �������� �������� ���������
 */
public class MeasuringResultsType
{
    private String barkSign;
    private String measureValue;
    private String absoluteError;
    private String resultMeasureValue;

    /** 
     * Get the 'BarkSign' element value. ������� ��������� �������������� � �����
     * 
     * @return value
     */
    public String getBarkSign() {
        return barkSign;
    }

    /** 
     * Set the 'BarkSign' element value. ������� ��������� �������������� � �����
     * 
     * @param barkSign
     */
    public void setBarkSign(String barkSign) {
        this.barkSign = barkSign;
    }

    /** 
     * Get the 'MeasureValue' element value. ����� �������, ���. �
     * 
     * @return value
     */
    public String getMeasureValue() {
        return measureValue;
    }

    /** 
     * Set the 'MeasureValue' element value. ����� �������, ���. �
     * 
     * @param measureValue
     */
    public void setMeasureValue(String measureValue) {
        this.measureValue = measureValue;
    }

    /** 
     * Get the 'AbsoluteError' element value. ���������� �����������, ���. �
     * 
     * @return value
     */
    public String getAbsoluteError() {
        return absoluteError;
    }

    /** 
     * Set the 'AbsoluteError' element value. ���������� �����������, ���. �
     * 
     * @param absoluteError
     */
    public void setAbsoluteError(String absoluteError) {
        this.absoluteError = absoluteError;
    }

    /** 
     * Get the 'ResultMeasureValue' element value. ��������� ��������� � ������ �����������
     * 
     * @return value
     */
    public String getResultMeasureValue() {
        return resultMeasureValue;
    }

    /** 
     * Set the 'ResultMeasureValue' element value. ��������� ��������� � ������ �����������
     * 
     * @param resultMeasureValue
     */
    public void setResultMeasureValue(String resultMeasureValue) {
        this.resultMeasureValue = resultMeasureValue;
    }
}
