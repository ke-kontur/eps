
package ru.acs.fts.schemas.album.cmr;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ������� �������� 
 */
public class CMRDeliveryTermsType
{
    private List<String> deliveryPlaceList = new ArrayList<String>();
    private String deliveryTermsStringCode;
    private String termsDescription;

    /** 
     * Get the list of 'DeliveryPlace' element items. ������������ ������ ��������
     * 
     * @return list
     */
    public List<String> getDeliveryPlaceList() {
        return deliveryPlaceList;
    }

    /** 
     * Set the list of 'DeliveryPlace' element items. ������������ ������ ��������
     * 
     * @param list
     */
    public void setDeliveryPlaceList(List<String> list) {
        deliveryPlaceList = list;
    }

    /** 
     * Get the 'DeliveryTermsStringCode' element value. ��� ������� �������� �� ���������
     * 
     * @return value
     */
    public String getDeliveryTermsStringCode() {
        return deliveryTermsStringCode;
    }

    /** 
     * Set the 'DeliveryTermsStringCode' element value. ��� ������� �������� �� ���������
     * 
     * @param deliveryTermsStringCode
     */
    public void setDeliveryTermsStringCode(String deliveryTermsStringCode) {
        this.deliveryTermsStringCode = deliveryTermsStringCode;
    }

    /** 
     * Get the 'TermsDescription' element value. ��������, ����������� �� �������� ��������
     * 
     * @return value
     */
    public String getTermsDescription() {
        return termsDescription;
    }

    /** 
     * Set the 'TermsDescription' element value. ��������, ����������� �� �������� ��������
     * 
     * @param termsDescription
     */
    public void setTermsDescription(String termsDescription) {
        this.termsDescription = termsDescription;
    }
}
