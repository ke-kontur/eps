
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * ������� �������� �������
 */
public class DeliveryTermsType
{
    private String deliveryPlace;
    private String deliveryTermsStringCode;
    private String deliveryTermsRBCode;
    private String transferPlace;

    /** 
     * Get the 'DeliveryPlace' element value. �������� / �������� ��������������� ������
     * 
     * @return value
     */
    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    /** 
     * Set the 'DeliveryPlace' element value. �������� / �������� ��������������� ������
     * 
     * @param deliveryPlace
     */
    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    /** 
     * Get the 'DeliveryTermsStringCode' element value. ��� ������� �������� � ������������ � ��������������� ������� ��������
     * 
     * @return value
     */
    public String getDeliveryTermsStringCode() {
        return deliveryTermsStringCode;
    }

    /** 
     * Set the 'DeliveryTermsStringCode' element value. ��� ������� �������� � ������������ � ��������������� ������� ��������
     * 
     * @param deliveryTermsStringCode
     */
    public void setDeliveryTermsStringCode(String deliveryTermsStringCode) {
        this.deliveryTermsStringCode = deliveryTermsStringCode;
    }

    /** 
     * Get the 'DeliveryTermsRBCode' element value. ��� ���� �������� ������� � ������������ � ��������������� ����� �������� �������, ���������� ����� ��� ������������� ���������� ��������, ����������� � ���������� ��������
     * 
     * @return value
     */
    public String getDeliveryTermsRBCode() {
        return deliveryTermsRBCode;
    }

    /** 
     * Set the 'DeliveryTermsRBCode' element value. ��� ���� �������� ������� � ������������ � ��������������� ����� �������� �������, ���������� ����� ��� ������������� ���������� ��������, ����������� � ���������� ��������
     * 
     * @param deliveryTermsRBCode
     */
    public void setDeliveryTermsRBCode(String deliveryTermsRBCode) {
        this.deliveryTermsRBCode = deliveryTermsRBCode;
    }

    /** 
     * Get the 'TransferPlace' element value. ����� �������� ������ � ������������ � ��������� �������� (���������)
     * 
     * @return value
     */
    public String getTransferPlace() {
        return transferPlace;
    }

    /** 
     * Set the 'TransferPlace' element value. ����� �������� ������ � ������������ � ��������� �������� (���������)
     * 
     * @param transferPlace
     */
    public void setTransferPlace(String transferPlace) {
        this.transferPlace = transferPlace;
    }
}
