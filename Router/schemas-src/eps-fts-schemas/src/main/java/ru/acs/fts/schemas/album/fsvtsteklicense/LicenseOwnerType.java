
package ru.acs.fts.schemas.album.fsvtsteklicense;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * �������� � ��������� ��������
 */
public class LicenseOwnerType extends CUOrganizationType
{
    private String status;
    private String OKPOID;

    /** 
     * Get the 'Status' element value. ������: 0 - ���������� ����, 1 - ����������� ����
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. ������: 0 - ���������� ����, 1 - ����������� ����
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'OKPOID' element value. ��� ����������� �� ����.
     * 
     * @return value
     */
    public String getOKPOID() {
        return OKPOID;
    }

    /** 
     * Set the 'OKPOID' element value. ��� ����������� �� ����.
     * 
     * @param OKPOID
     */
    public void setOKPOID(String OKPOID) {
        this.OKPOID = OKPOID;
    }
}
