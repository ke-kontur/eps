
package ru.acs.fts.schemas.album.transportdeclaration;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ����, �������������� ��������� �������
 */
public class CarrierType extends OrganizationBaseType
{
    private AddressType carrierAddress;
    private PersonBaseType representative;

    /** 
     * Get the 'CarrierAddress' element value. ����� ���������� ����������� � ������������ � ������������� (�������������) �����������
     * 
     * @return value
     */
    public AddressType getCarrierAddress() {
        return carrierAddress;
    }

    /** 
     * Set the 'CarrierAddress' element value. ����� ���������� ����������� � ������������ � ������������� (�������������) �����������
     * 
     * @param carrierAddress
     */
    public void setCarrierAddress(AddressType carrierAddress) {
        this.carrierAddress = carrierAddress;
    }

    /** 
     * Get the 'Representative' element value. ������������� �����������
     * 
     * @return value
     */
    public PersonBaseType getRepresentative() {
        return representative;
    }

    /** 
     * Set the 'Representative' element value. ������������� �����������
     * 
     * @param representative
     */
    public void setRepresentative(PersonBaseType representative) {
        this.representative = representative;
    }
}
