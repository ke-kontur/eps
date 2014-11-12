
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Сведения об обособленном подразделении.
 */
public class BranchDescriptionType
{
    private String organizationName;
    private String KPP;
    private AddressType address;

    /** 
     * Get the 'OrganizationName' element value. Краткое наименование обособленного подразделения.
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Краткое наименование обособленного подразделения.
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'KPP' element value. КПП (Код причины постановки на учет) обособленного подразделения.
     * 
     * @return value
     */
    public String getKPP() {
        return KPP;
    }

    /** 
     * Set the 'KPP' element value. КПП (Код причины постановки на учет) обособленного подразделения.
     * 
     * @param KPP
     */
    public void setKPP(String KPP) {
        this.KPP = KPP;
    }

    /** 
     * Get the 'Address' element value. Адрес обособленного подразделения
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес обособленного подразделения
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
