
package ru.acs.fts.schemas.album.conformancesertif;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �����, ��������������� ����� ������������
 */
public class CertificateOrgType extends OrganizationBaseType
{
    private String phone;
    private String fax;

    /** 
     * Get the 'Phone' element value. �������
     * 
     * @return value
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * Set the 'Phone' element value. �������
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /** 
     * Get the 'Fax' element value. �������
     * 
     * @return value
     */
    public String getFax() {
        return fax;
    }

    /** 
     * Set the 'Fax' element value. �������
     * 
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }
}
