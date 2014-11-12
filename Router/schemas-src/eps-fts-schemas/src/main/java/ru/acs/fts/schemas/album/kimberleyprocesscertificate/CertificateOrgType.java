
package ru.acs.fts.schemas.album.kimberleyprocesscertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Орган сертификации
 */
public class CertificateOrgType extends OrganizationType
{
    private DocumentBaseType licenseDocument;

    /** 
     * Get the 'LicenseDocument' element value. Документ, подтверждающий право на выдачу сертификатов
     * 
     * @return value
     */
    public DocumentBaseType getLicenseDocument() {
        return licenseDocument;
    }

    /** 
     * Set the 'LicenseDocument' element value. Документ, подтверждающий право на выдачу сертификатов
     * 
     * @param licenseDocument
     */
    public void setLicenseDocument(DocumentBaseType licenseDocument) {
        this.licenseDocument = licenseDocument;
    }
}
