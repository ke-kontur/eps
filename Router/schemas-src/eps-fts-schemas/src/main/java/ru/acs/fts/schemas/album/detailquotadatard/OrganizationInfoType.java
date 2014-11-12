
package ru.acs.fts.schemas.album.detailquotadatard;

/** 
 * Сведения о продавце (покупателе)
 */
public class OrganizationInfoType
{
    private String organizationName;
    private String address;

    /** 
     * Get the 'OrganizationName' element value. Наименование 
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Наименование 
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'Address' element value. Адрес 
     * 
     * @return value
     */
    public String getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес 
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
