
package ru.acs.fts.schemas.album.sertifst1form;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Информация о лице, которое является отправителем/экспортером
 */
public class ExporterSenderInformationType
{
    private String senderName;
    private String phone;
    private AddressType postalAddress;

    /** 
     * Get the 'SenderName' element value. Наименование лица, которое является отправителем
     * 
     * @return value
     */
    public String getSenderName() {
        return senderName;
    }

    /** 
     * Set the 'SenderName' element value. Наименование лица, которое является отправителем
     * 
     * @param senderName
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /** 
     * Get the 'Phone' element value. Телефон
     * 
     * @return value
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * Set the 'Phone' element value. Телефон
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /** 
     * Get the 'PostalAddress' element value.
     * 
     * @return value
     */
    public AddressType getPostalAddress() {
        return postalAddress;
    }

    /** 
     * Set the 'PostalAddress' element value.
     * 
     * @param postalAddress
     */
    public void setPostalAddress(AddressType postalAddress) {
        this.postalAddress = postalAddress;
    }
}
