
package ru.acs.fts.schemas.album.actinspection;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ���������� �������
 */
public class ConsigneeType extends OrganizationType
{
    private String destinCountry;
    private IdentityCardType physicalPersonIdCard;

    /** 
     * Get the 'DestinCountry' element value. ������ ����������
     * 
     * @return value
     */
    public String getDestinCountry() {
        return destinCountry;
    }

    /** 
     * Set the 'DestinCountry' element value. ������ ����������
     * 
     * @param destinCountry
     */
    public void setDestinCountry(String destinCountry) {
        this.destinCountry = destinCountry;
    }

    /** 
     * Get the 'PhysicalPersonIdCard' element value. ��������, �������������� �������� - � ������, ���� ���������� �������� ���������� �����
     * 
     * @return value
     */
    public IdentityCardType getPhysicalPersonIdCard() {
        return physicalPersonIdCard;
    }

    /** 
     * Set the 'PhysicalPersonIdCard' element value. ��������, �������������� �������� - � ������, ���� ���������� �������� ���������� �����
     * 
     * @param physicalPersonIdCard
     */
    public void setPhysicalPersonIdCard(IdentityCardType physicalPersonIdCard) {
        this.physicalPersonIdCard = physicalPersonIdCard;
    }
}
