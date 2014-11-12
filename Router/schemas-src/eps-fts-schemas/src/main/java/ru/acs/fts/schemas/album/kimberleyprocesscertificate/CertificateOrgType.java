
package ru.acs.fts.schemas.album.kimberleyprocesscertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ����� ������������
 */
public class CertificateOrgType extends OrganizationType
{
    private DocumentBaseType licenseDocument;

    /** 
     * Get the 'LicenseDocument' element value. ��������, �������������� ����� �� ������ ������������
     * 
     * @return value
     */
    public DocumentBaseType getLicenseDocument() {
        return licenseDocument;
    }

    /** 
     * Set the 'LicenseDocument' element value. ��������, �������������� ����� �� ������ ������������
     * 
     * @param licenseDocument
     */
    public void setLicenseDocument(DocumentBaseType licenseDocument) {
        this.licenseDocument = licenseDocument;
    }
}
