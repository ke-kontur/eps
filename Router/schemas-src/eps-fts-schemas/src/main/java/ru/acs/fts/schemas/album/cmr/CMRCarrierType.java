
package ru.acs.fts.schemas.album.cmr;

/** 
 * Сведения о перевозчике (гр.16)
 */
public class CMRCarrierType extends CarrierType
{
    private String licenseID;

    /** 
     * Get the 'LicenseID' element value. Номер лицензии перевозчика
     * 
     * @return value
     */
    public String getLicenseID() {
        return licenseID;
    }

    /** 
     * Set the 'LicenseID' element value. Номер лицензии перевозчика
     * 
     * @param licenseID
     */
    public void setLicenseID(String licenseID) {
        this.licenseID = licenseID;
    }
}
