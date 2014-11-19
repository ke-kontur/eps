
package ru.acs.fts.schemas.album.oez_goodsidentify;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ����������
 */
public class ConsigneeType extends OrganizationBaseType
{
    private String sertificateNumberOEZ;
    private AddressType address;
    private IdentityCardType identityCard;

    /** 
     * Get the 'SertificateNumberOEZ' element value. ����� �������������, ��������������� ����������� ���� � �������� ��������� ���
     * 
     * @return value
     */
    public String getSertificateNumberOEZ() {
        return sertificateNumberOEZ;
    }

    /** 
     * Set the 'SertificateNumberOEZ' element value. ����� �������������, ��������������� ����������� ���� � �������� ��������� ���
     * 
     * @param sertificateNumberOEZ
     */
    public void setSertificateNumberOEZ(String sertificateNumberOEZ) {
        this.sertificateNumberOEZ = sertificateNumberOEZ;
    }

    /** 
     * Get the 'Address' element value. ����� ����������� / ����������� ����
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� ����������� / ����������� ����
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }

    /** 
     * Get the 'IdentityCard' element value. ��������, �������������� ��������
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. ��������, �������������� ��������
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }
}
