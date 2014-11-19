
package ru.acs.fts.schemas.album.cmr;

/** 
 * �������� � ����������� (��.16)
 */
public class CMRCarrierType extends CarrierType
{
    private String licenseID;

    /** 
     * Get the 'LicenseID' element value. ����� �������� �����������
     * 
     * @return value
     */
    public String getLicenseID() {
        return licenseID;
    }

    /** 
     * Set the 'LicenseID' element value. ����� �������� �����������
     * 
     * @param licenseID
     */
    public void setLicenseID(String licenseID) {
        this.licenseID = licenseID;
    }
}
