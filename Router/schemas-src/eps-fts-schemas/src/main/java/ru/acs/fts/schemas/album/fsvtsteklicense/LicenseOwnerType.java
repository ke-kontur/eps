
package ru.acs.fts.schemas.album.fsvtsteklicense;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Сведения о владельце лицензии
 */
public class LicenseOwnerType extends CUOrganizationType
{
    private String status;
    private String OKPOID;

    /** 
     * Get the 'Status' element value. Статус: 0 - физическое лицо, 1 - юридическое лицо
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. Статус: 0 - физическое лицо, 1 - юридическое лицо
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'OKPOID' element value. Код организации по ОКПО.
     * 
     * @return value
     */
    public String getOKPOID() {
        return OKPOID;
    }

    /** 
     * Set the 'OKPOID' element value. Код организации по ОКПО.
     * 
     * @param OKPOID
     */
    public void setOKPOID(String OKPOID) {
        this.OKPOID = OKPOID;
    }
}
