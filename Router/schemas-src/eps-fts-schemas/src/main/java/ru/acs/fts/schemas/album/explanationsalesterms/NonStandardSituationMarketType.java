
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * ������� ������� ������������� ��������� �� �����
 */
public class NonStandardSituationMarketType
{
    private String dopRate;
    private String increaseRate;
    private String glutMarket;
    private String deficitMarket;
    private String other;
    private String countryType;
    private String comments;

    /** 
     * Get the 'DopRate' element value. ������� ����� ������� ������� ����� ������������ ������
     * 
     * @return value
     */
    public String getDopRate() {
        return dopRate;
    }

    /** 
     * Set the 'DopRate' element value. ������� ����� ������� ������� ����� ������������ ������
     * 
     * @param dopRate
     */
    public void setDopRate(String dopRate) {
        this.dopRate = dopRate;
    }

    /** 
     * Get the 'IncreaseRate' element value. ������� ����� ������� ��������� ����� ������������ ������
     * 
     * @return value
     */
    public String getIncreaseRate() {
        return increaseRate;
    }

    /** 
     * Set the 'IncreaseRate' element value. ������� ����� ������� ��������� ����� ������������ ������
     * 
     * @param increaseRate
     */
    public void setIncreaseRate(String increaseRate) {
        this.increaseRate = increaseRate;
    }

    /** 
     * Get the 'GlutMarket' element value. ������� ����� ������������� �����
     * 
     * @return value
     */
    public String getGlutMarket() {
        return glutMarket;
    }

    /** 
     * Set the 'GlutMarket' element value. ������� ����� ������������� �����
     * 
     * @param glutMarket
     */
    public void setGlutMarket(String glutMarket) {
        this.glutMarket = glutMarket;
    }

    /** 
     * Get the 'DeficitMarket' element value. ������� ����� �������� �� �����
     * 
     * @return value
     */
    public String getDeficitMarket() {
        return deficitMarket;
    }

    /** 
     * Set the 'DeficitMarket' element value. ������� ����� �������� �� �����
     * 
     * @param deficitMarket
     */
    public void setDeficitMarket(String deficitMarket) {
        this.deficitMarket = deficitMarket;
    }

    /** 
     * Get the 'Other' element value. ������� ����, ��� ������� ������� ���� ������������� ��������� �� �����
     * 
     * @return value
     */
    public String getOther() {
        return other;
    }

    /** 
     * Set the 'Other' element value. ������� ����, ��� ������� ������� ���� ������������� ��������� �� �����
     * 
     * @param other
     */
    public void setOther(String other) {
        this.other = other;
    }

    /** 
     * Get the 'CountryType' element value. ���������� ��������� � ������: 1 -  �����������, 0 - �������������
     * 
     * @return value
     */
    public String getCountryType() {
        return countryType;
    }

    /** 
     * Set the 'CountryType' element value. ���������� ��������� � ������: 1 -  �����������, 0 - �������������
     * 
     * @param countryType
     */
    public void setCountryType(String countryType) {
        this.countryType = countryType;
    }

    /** 
     * Get the 'Comments' element value. ���� (������� �����������)
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. ���� (������� �����������)
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}
