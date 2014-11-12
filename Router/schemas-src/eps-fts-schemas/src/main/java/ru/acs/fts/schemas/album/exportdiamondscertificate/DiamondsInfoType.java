
package ru.acs.fts.schemas.album.exportdiamondscertificate;

/** 
 * �������� �� �������������� �������
 */
public class DiamondsInfoType
{
    private String goodsTNVEDCode;
    private String totalDiamodsCost;
    private String totalDiamondsWeight;
    private String placeNumber;
    private String numeric;

    /** 
     * Get the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'TotalDiamodsCost' element value. ��������� ������� 
     * 
     * @return value
     */
    public String getTotalDiamodsCost() {
        return totalDiamodsCost;
    }

    /** 
     * Set the 'TotalDiamodsCost' element value. ��������� ������� 
     * 
     * @param totalDiamodsCost
     */
    public void setTotalDiamodsCost(String totalDiamodsCost) {
        this.totalDiamodsCost = totalDiamodsCost;
    }

    /** 
     * Get the 'TotalDiamondsWeight' element value. ����� ����� �������
     * 
     * @return value
     */
    public String getTotalDiamondsWeight() {
        return totalDiamondsWeight;
    }

    /** 
     * Set the 'TotalDiamondsWeight' element value. ����� ����� �������
     * 
     * @param totalDiamondsWeight
     */
    public void setTotalDiamondsWeight(String totalDiamondsWeight) {
        this.totalDiamondsWeight = totalDiamondsWeight;
    }

    /** 
     * Get the 'PlaceNumber' element value. ���������� �������� ����, �������� � ������ ��������� ������
     * 
     * @return value
     */
    public String getPlaceNumber() {
        return placeNumber;
    }

    /** 
     * Set the 'PlaceNumber' element value. ���������� �������� ����, �������� � ������ ��������� ������
     * 
     * @param placeNumber
     */
    public void setPlaceNumber(String placeNumber) {
        this.placeNumber = placeNumber;
    }

    /** 
     * Get the 'Numeric' element value. ����� �������
     * 
     * @return value
     */
    public String getNumeric() {
        return numeric;
    }

    /** 
     * Set the 'Numeric' element value. ����� �������
     * 
     * @param numeric
     */
    public void setNumeric(String numeric) {
        this.numeric = numeric;
    }
}
