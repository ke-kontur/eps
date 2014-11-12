
package ru.acs.fts.schemas.album.paymentconfirmation;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Сведения о таможни
 */
public class CustomInfoType
{
    private String customsName;
    private String postName;
    private AddressType address;

    /** 
     * Get the 'CustomsName' element value. Наименование таможни
     * 
     * @return value
     */
    public String getCustomsName() {
        return customsName;
    }

    /** 
     * Set the 'CustomsName' element value. Наименование таможни
     * 
     * @param customsName
     */
    public void setCustomsName(String customsName) {
        this.customsName = customsName;
    }

    /** 
     * Get the 'PostName' element value. Наименование поста
     * 
     * @return value
     */
    public String getPostName() {
        return postName;
    }

    /** 
     * Set the 'PostName' element value. Наименование поста
     * 
     * @param postName
     */
    public void setPostName(String postName) {
        this.postName = postName;
    }

    /** 
     * Get the 'Address' element value. Адрес таможни
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес таможни
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
