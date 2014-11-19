
package ru.acs.fts.schemas.album.legalentityinfo;

/** 
 * ���� � �������� ��������
 */
public class ShareType
{
    private String numerator;
    private String denumerator;
    private String percent;
    private String decimalFraction;
    private String nominalCost;
    private String pledgeSign;
    private RecordDataType recordData;

    /** 
     * Get the 'Numerator' element value. ������ ���� � ������� ������. ���������
     * 
     * @return value
     */
    public String getNumerator() {
        return numerator;
    }

    /** 
     * Set the 'Numerator' element value. ������ ���� � ������� ������. ���������
     * 
     * @param numerator
     */
    public void setNumerator(String numerator) {
        this.numerator = numerator;
    }

    /** 
     * Get the 'Denumerator' element value. ������ ���� � ������� ������. �����������
     * 
     * @return value
     */
    public String getDenumerator() {
        return denumerator;
    }

    /** 
     * Set the 'Denumerator' element value. ������ ���� � ������� ������. �����������
     * 
     * @param denumerator
     */
    public void setDenumerator(String denumerator) {
        this.denumerator = denumerator;
    }

    /** 
     * Get the 'Percent' element value. ������ ���� � ���������, %
     * 
     * @return value
     */
    public String getPercent() {
        return percent;
    }

    /** 
     * Set the 'Percent' element value. ������ ���� � ���������, %
     * 
     * @param percent
     */
    public void setPercent(String percent) {
        this.percent = percent;
    }

    /** 
     * Get the 'DecimalFraction' element value. ������ ���� � ���������� ������
     * 
     * @return value
     */
    public String getDecimalFraction() {
        return decimalFraction;
    }

    /** 
     * Set the 'DecimalFraction' element value. ������ ���� � ���������� ������
     * 
     * @param decimalFraction
     */
    public void setDecimalFraction(String decimalFraction) {
        this.decimalFraction = decimalFraction;
    }

    /** 
     * Get the 'NominalCost' element value. ����������� ��������� � ������
     * 
     * @return value
     */
    public String getNominalCost() {
        return nominalCost;
    }

    /** 
     * Set the 'NominalCost' element value. ����������� ��������� � ������
     * 
     * @param nominalCost
     */
    public void setNominalCost(String nominalCost) {
        this.nominalCost = nominalCost;
    }

    /** 
     * Get the 'PledgeSign' element value. ������� ���������� ���� � ������ ��� � ���� �����������
     * 
     * @return value
     */
    public String getPledgeSign() {
        return pledgeSign;
    }

    /** 
     * Set the 'PledgeSign' element value. ������� ���������� ���� � ������ ��� � ���� �����������
     * 
     * @param pledgeSign
     */
    public void setPledgeSign(String pledgeSign) {
        this.pledgeSign = pledgeSign;
    }

    /** 
     * Get the 'RecordData' element value. �������� � ������
     * 
     * @return value
     */
    public RecordDataType getRecordData() {
        return recordData;
    }

    /** 
     * Set the 'RecordData' element value. �������� � ������
     * 
     * @param recordData
     */
    public void setRecordData(RecordDataType recordData) {
        this.recordData = recordData;
    }
}
