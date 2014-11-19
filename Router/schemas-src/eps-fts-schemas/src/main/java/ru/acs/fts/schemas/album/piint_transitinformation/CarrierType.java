
package ru.acs.fts.schemas.album.piint_transitinformation;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.DriverInformationType;

/** 
 * ����������
 */
public class CarrierType extends OrganizationBaseType
{
    private String ITN;
    private List<DriverInformationType> driverInformationList = new ArrayList<DriverInformationType>();
    private IdentityCardType identityCard;
    private AddressType address;

    /** 
     * Get the 'ITN' element value. ���
     * 
     * @return value
     */
    public String getITN() {
        return ITN;
    }

    /** 
     * Set the 'ITN' element value. ���
     * 
     * @param ITN
     */
    public void setITN(String ITN) {
        this.ITN = ITN;
    }

    /** 
     * Get the list of 'DriverInformation' element items. ���������� � ���������
     * 
     * @return list
     */
    public List<DriverInformationType> getDriverInformationList() {
        return driverInformationList;
    }

    /** 
     * Set the list of 'DriverInformation' element items. ���������� � ���������
     * 
     * @param list
     */
    public void setDriverInformationList(List<DriverInformationType> list) {
        driverInformationList = list;
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
}
