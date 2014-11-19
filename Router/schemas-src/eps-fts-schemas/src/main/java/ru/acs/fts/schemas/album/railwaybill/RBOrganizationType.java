
package ru.acs.fts.schemas.album.railwaybill;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * �������� � ���������������/���������������� 
 */
public class RBOrganizationType extends OrganizationType
{
    private String RBCode;

    /** 
     * Get the 'RBCode' element value. ��� ���������������/����������������
     * 
     * @return value
     */
    public String getRBCode() {
        return RBCode;
    }

    /** 
     * Set the 'RBCode' element value. ��� ���������������/����������������
     * 
     * @param RBCode
     */
    public void setRBCode(String RBCode) {
        this.RBCode = RBCode;
    }
}
