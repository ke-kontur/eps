
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Комплексный тип для адреса организации
 */
public class WHAddressType extends AddressType
{
    private String addressLine;

    /** 
     * Get the 'AddressLine' element value. Информация об адресе организации в виде одной строки
     * 
     * @return value
     */
    public String getAddressLine() {
        return addressLine;
    }

    /** 
     * Set the 'AddressLine' element value. Информация об адресе организации в виде одной строки
     * 
     * @param addressLine
     */
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }
}
