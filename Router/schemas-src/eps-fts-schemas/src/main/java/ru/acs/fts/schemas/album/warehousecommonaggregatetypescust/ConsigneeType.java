
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ����������� ��� ��� �������� ���������������
 */
public class ConsigneeType extends OrganizationBaseType
{
    private WHAddressType address;
    private IdentityCardType identityCard;

    /** 
     * Get the 'Address' element value. ����� ����������
     * 
     * @return value
     */
    public WHAddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� ����������
     * 
     * @param address
     */
    public void setAddress(WHAddressType address) {
        this.address = address;
    }

    /** 
     * Get the 'IdentityCard' element value. ��������, �������������� �������� ����������. ����������� � ������, ���� ���������� - ���. ����
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. ��������, �������������� �������� ����������. ����������� � ������, ���� ���������� - ���. ����
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }
}
