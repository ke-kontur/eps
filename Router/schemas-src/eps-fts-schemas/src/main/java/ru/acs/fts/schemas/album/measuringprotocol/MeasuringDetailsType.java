
package ru.acs.fts.schemas.album.measuringprotocol;

/** 
 * ���������� ���������
 */
public class MeasuringDetailsType
{
    private String barkSign;
    private String measureSign;
    private String firstMeasureValue;
    private String secondMeasureValue;
    private String averageValue;

    /** 
     * Get the 'BarkSign' element value. ������� ���������� ��������� �������������� � �����
     * 
     * @return value
     */
    public String getBarkSign() {
        return barkSign;
    }

    /** 
     * Set the 'BarkSign' element value. ������� ���������� ��������� �������������� � �����
     * 
     * @param barkSign
     */
    public void setBarkSign(String barkSign) {
        this.barkSign = barkSign;
    }

    /** 
     * Get the 'MeasureSign' element value. ��������� ��������: 1 - ��������; 2 - ����������; 3 - �������
     * 
     * @return value
     */
    public String getMeasureSign() {
        return measureSign;
    }

    /** 
     * Set the 'MeasureSign' element value. ��������� ��������: 1 - ��������; 2 - ����������; 3 - �������
     * 
     * @param measureSign
     */
    public void setMeasureSign(String measureSign) {
        this.measureSign = measureSign;
    }

    /** 
     * Get the 'FirstMeasureValue' element value. �������� ���������� ������� ���������
     * 
     * @return value
     */
    public String getFirstMeasureValue() {
        return firstMeasureValue;
    }

    /** 
     * Set the 'FirstMeasureValue' element value. �������� ���������� ������� ���������
     * 
     * @param firstMeasureValue
     */
    public void setFirstMeasureValue(String firstMeasureValue) {
        this.firstMeasureValue = firstMeasureValue;
    }

    /** 
     * Get the 'SecondMeasureValue' element value. �������� ���������� ������� ���������
     * 
     * @return value
     */
    public String getSecondMeasureValue() {
        return secondMeasureValue;
    }

    /** 
     * Set the 'SecondMeasureValue' element value. �������� ���������� ������� ���������
     * 
     * @param secondMeasureValue
     */
    public void setSecondMeasureValue(String secondMeasureValue) {
        this.secondMeasureValue = secondMeasureValue;
    }

    /** 
     * Get the 'AverageValue' element value. ������� �������� (������� ������)
     * 
     * @return value
     */
    public String getAverageValue() {
        return averageValue;
    }

    /** 
     * Set the 'AverageValue' element value. ������� �������� (������� ������)
     * 
     * @param averageValue
     */
    public void setAverageValue(String averageValue) {
        this.averageValue = averageValue;
    }
}
