
package ru.acs.fts.schemas.album.paymentconfirmation;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * �������� � �������
 */
public class CustomInfoType
{
    private String customsName;
    private String postName;
    private AddressType address;

    /** 
     * Get the 'CustomsName' element value. ������������ �������
     * 
     * @return value
     */
    public String getCustomsName() {
        return customsName;
    }

    /** 
     * Set the 'CustomsName' element value. ������������ �������
     * 
     * @param customsName
     */
    public void setCustomsName(String customsName) {
        this.customsName = customsName;
    }

    /** 
     * Get the 'PostName' element value. ������������ �����
     * 
     * @return value
     */
    public String getPostName() {
        return postName;
    }

    /** 
     * Set the 'PostName' element value. ������������ �����
     * 
     * @param postName
     */
    public void setPostName(String postName) {
        this.postName = postName;
    }

    /** 
     * Get the 'Address' element value. ����� �������
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� �������
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
