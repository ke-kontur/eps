
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * ������� �������� �������. ��� ������
 */
public class DeliveryTermsRUType
{
    private String deliveryPlace;
    private String deliveryTermsStringCode;

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
}
