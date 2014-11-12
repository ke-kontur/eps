
package ru.acs.fts.schemas.album.railwaybill;

/** 
 * ������ �� ������������ ������� 
 */
public class CarriageType
{
    private String carriageID;
    private String power;
    private String axisQuantity;
    private String tare;
    private String goodsWeight;

    /** 
     * Get the 'CarriageID' element value. ����� ������
     * 
     * @return value
     */
    public String getCarriageID() {
        return carriageID;
    }

    /** 
     * Set the 'CarriageID' element value. ����� ������
     * 
     * @param carriageID
     */
    public void setCarriageID(String carriageID) {
        this.carriageID = carriageID;
    }

    /** 
     * Get the 'Power' element value. ��������� ���� ������ � ������
     * 
     * @return value
     */
    public String getPower() {
        return power;
    }

    /** 
     * Set the 'Power' element value. ��������� ���� ������ � ������
     * 
     * @param power
     */
    public void setPower(String power) {
        this.power = power;
    }

    /** 
     * Get the 'AxisQuantity' element value. ���������� ���� ������
     * 
     * @return value
     */
    public String getAxisQuantity() {
        return axisQuantity;
    }

    /** 
     * Set the 'AxisQuantity' element value. ���������� ���� ������
     * 
     * @param axisQuantity
     */
    public void setAxisQuantity(String axisQuantity) {
        this.axisQuantity = axisQuantity;
    }

    /** 
     * Get the 'Tare' element value. ��� ���� � ��.
     * 
     * @return value
     */
    public String getTare() {
        return tare;
    }

    /** 
     * Set the 'Tare' element value. ��� ���� � ��.
     * 
     * @param tare
     */
    public void setTare(String tare) {
        this.tare = tare;
    }

    /** 
     * Get the 'GoodsWeight' element value. ��� ����� ����� ����������
     * 
     * @return value
     */
    public String getGoodsWeight() {
        return goodsWeight;
    }

    /** 
     * Set the 'GoodsWeight' element value. ��� ����� ����� ����������
     * 
     * @param goodsWeight
     */
    public void setGoodsWeight(String goodsWeight) {
        this.goodsWeight = goodsWeight;
    }
}
