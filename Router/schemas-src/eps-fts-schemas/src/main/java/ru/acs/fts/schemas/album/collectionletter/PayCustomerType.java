
package ru.acs.fts.schemas.album.collectionletter;

import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.CustomerType;

/** 
 * Реквизиты организации
 */
public class PayCustomerType extends CustomerType
{
    private String addInformation;

    /** 
     * Get the 'AddInformation' element value. Дополнительная информация
     * 
     * @return value
     */
    public String getAddInformation() {
        return addInformation;
    }

    /** 
     * Set the 'AddInformation' element value. Дополнительная информация
     * 
     * @param addInformation
     */
    public void setAddInformation(String addInformation) {
        this.addInformation = addInformation;
    }
}
