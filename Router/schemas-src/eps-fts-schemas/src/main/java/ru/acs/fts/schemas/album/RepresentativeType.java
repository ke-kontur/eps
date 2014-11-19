
package ru.acs.fts.schemas.album;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Таможенный представитель
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RepresApplicChange:5.4.3" xmlns:ns1="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RepresentativeType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:CUOrganizationType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:string" name="LicenseNumber"/>
 *         &lt;xs:element type="xs:string" name="OKPOID" minOccurs="0"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RepresentativeType extends CUOrganizationType
{
    private String licenseNumber;
    private String OKPOID;

    /** 
     * Get the 'LicenseNumber' element value. Номер лицензии
     * 
     * @return value
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /** 
     * Set the 'LicenseNumber' element value. Номер лицензии
     * 
     * @param licenseNumber
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    /** 
     * Get the 'OKPOID' element value. Код организации по ОКПО
     * 
     * @return value
     */
    public String getOKPOID() {
        return OKPOID;
    }

    /** 
     * Set the 'OKPOID' element value. Код организации по ОКПО
     * 
     * @param OKPOID
     */
    public void setOKPOID(String OKPOID) {
        this.OKPOID = OKPOID;
    }
}
