
package ru.acs.fts.schemas.album.representativeapplication;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * ���������� �������������
 */
public class RepresentativeType extends CUOrganizationType
{
    private String licenseNumber;
    private String OKPOID;

    /** 
     * Get the 'LicenseNumber' element value. ����� ��������
     * 
     * @return value
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /** 
     * Set the 'LicenseNumber' element value. ����� ��������
     * 
     * @param licenseNumber
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    /** 
     * Get the 'OKPOID' element value. ��� ����������� �� ����
     * 
     * @return value
     */
    public String getOKPOID() {
        return OKPOID;
    }

    /** 
     * Set the 'OKPOID' element value. ��� ����������� �� ����
     * 
     * @param OKPOID
     */
    public void setOKPOID(String OKPOID) {
        this.OKPOID = OKPOID;
    }
}
