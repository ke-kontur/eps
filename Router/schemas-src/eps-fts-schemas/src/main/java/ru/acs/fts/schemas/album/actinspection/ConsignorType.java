
package ru.acs.fts.schemas.album.actinspection;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ����������� �������
 */
public class ConsignorType extends OrganizationType
{
    private String departCountry;
    private IdentityCardType physicalPersonIdCard;

    /** 
     * Get the 'DepartCountry' element value. ������ �����������
     * 
     * @return value
     */
    public String getDepartCountry() {
        return departCountry;
    }

    /** 
     * Set the 'DepartCountry' element value. ������ �����������
     * 
     * @param departCountry
     */
    public void setDepartCountry(String departCountry) {
        this.departCountry = departCountry;
    }

    /** 
     * Get the 'PhysicalPersonIdCard' element value. ��������, �������������� �������� - � ������, ���� ����������� �������� ���������� �����
     * 
     * @return value
     */
    public IdentityCardType getPhysicalPersonIdCard() {
        return physicalPersonIdCard;
    }

    /** 
     * Set the 'PhysicalPersonIdCard' element value. ��������, �������������� �������� - � ������, ���� ����������� �������� ���������� �����
     * 
     * @param physicalPersonIdCard
     */
    public void setPhysicalPersonIdCard(IdentityCardType physicalPersonIdCard) {
        this.physicalPersonIdCard = physicalPersonIdCard;
    }
}
