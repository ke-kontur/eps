
package ru.acs.fts.schemas.album.cmr;

/** 
 * ���������� � ��������, ��������� � ���������� ����� (������������ ��� ���������� ����� 19).
 */
public class CMRTransportCostType
{
    private String transportCost;
    private String additionalCharges;
    private String otherCharges;
    private String totalCost;
    private String currencyCode;

    /** 
     * Get the 'TransportCost' element value. ��������� ����� �� ���������
     * 
     * @return value
     */
    public String getTransportCost() {
        return transportCost;
    }

    /** 
     * Set the 'TransportCost' element value. ��������� ����� �� ���������
     * 
     * @param transportCost
     */
    public void setTransportCost(String transportCost) {
        this.transportCost = transportCost;
    }

    /** 
     * Get the 'AdditionalCharges' element value. �������������� �������, ��������� � ���������� ������
     * 
     * @return value
     */
    public String getAdditionalCharges() {
        return additionalCharges;
    }

    /** 
     * Set the 'AdditionalCharges' element value. �������������� �������, ��������� � ���������� ������
     * 
     * @param additionalCharges
     */
    public void setAdditionalCharges(String additionalCharges) {
        this.additionalCharges = additionalCharges;
    }

    /** 
     * Get the 'OtherCharges' element value. ������ �������, ��������� � ���������������� �����
     * 
     * @return value
     */
    public String getOtherCharges() {
        return otherCharges;
    }

    /** 
     * Set the 'OtherCharges' element value. ������ �������, ��������� � ���������������� �����
     * 
     * @param otherCharges
     */
    public void setOtherCharges(String otherCharges) {
        this.otherCharges = otherCharges;
    }

    /** 
     * Get the 'TotalCost' element value. ����� ����� ��������, ��������� � ���������������� �����
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. ����� ����� ��������, ��������� � ���������������� �����
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������ . �����������, ���� ��������� ����� �������� � ����������� ������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������ . �����������, ���� ��������� ����� �������� � ����������� ������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
