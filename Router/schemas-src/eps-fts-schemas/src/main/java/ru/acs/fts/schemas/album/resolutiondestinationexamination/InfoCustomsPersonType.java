
package ru.acs.fts.schemas.album.resolutiondestinationexamination;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * �������� � ����������� ����, ������������ ����������.
 */
public class InfoCustomsPersonType
{
    private String officialTelephone;
    private CustomsPersonType customsPerson;
    private AddressType address;

    /** 
     * Get the 'OfficialTelephone' element value. ��������� ����� �������� ������������ ����
     * 
     * @return value
     */
    public String getOfficialTelephone() {
        return officialTelephone;
    }

    /** 
     * Set the 'OfficialTelephone' element value. ��������� ����� �������� ������������ ����
     * 
     * @param officialTelephone
     */
    public void setOfficialTelephone(String officialTelephone) {
        this.officialTelephone = officialTelephone;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Address' element value. ����� ����������� ������
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� ����������� ������
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
