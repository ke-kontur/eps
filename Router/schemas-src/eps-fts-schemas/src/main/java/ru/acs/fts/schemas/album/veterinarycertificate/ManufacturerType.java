
package ru.acs.fts.schemas.album.veterinarycertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Производитель продукции
 */
public class ManufacturerType extends OrganizationType
{
    private String ownersManufacturer;

    /** 
     * Get the 'OwnersManufacturer' element value. Ф.И.О. владельца предприятия выработки
     * 
     * @return value
     */
    public String getOwnersManufacturer() {
        return ownersManufacturer;
    }

    /** 
     * Set the 'OwnersManufacturer' element value. Ф.И.О. владельца предприятия выработки
     * 
     * @param ownersManufacturer
     */
    public void setOwnersManufacturer(String ownersManufacturer) {
        this.ownersManufacturer = ownersManufacturer;
    }
}
