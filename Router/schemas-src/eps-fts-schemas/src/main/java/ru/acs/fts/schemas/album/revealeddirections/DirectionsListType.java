
package ru.acs.fts.schemas.album.revealeddirections;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������ ����������� ����������� ������������
 */
public class DirectionsListType
{
    private String directionKind;
    private List<String> informationTextList = new ArrayList<String>();
    private DirectionRegNumberType directionRegNumber;
    private ContactInfoType contactInfo;

    /** 
     * Get the 'DirectionKind' element value. ��� ���� ����������� ������������: 1 - ��������������, 2- �������, 3 -�����������
     * 
     * @return value
     */
    public String getDirectionKind() {
        return directionKind;
    }

    /** 
     * Set the 'DirectionKind' element value. ��� ���� ����������� ������������: 1 - ��������������, 2- �������, 3 -�����������
     * 
     * @param directionKind
     */
    public void setDirectionKind(String directionKind) {
        this.directionKind = directionKind;
    }

    /** 
     * Get the list of 'InformationText' element items. �������������� ��������� ��� ������������ ���� ������ ��������
     * 
     * @return list
     */
    public List<String> getInformationTextList() {
        return informationTextList;
    }

    /** 
     * Set the list of 'InformationText' element items. �������������� ��������� ��� ������������ ���� ������ ��������
     * 
     * @param list
     */
    public void setInformationTextList(List<String> list) {
        informationTextList = list;
    }

    /** 
     * Get the 'DirectionRegNumber' element value. ��������������� ����� ����������� ������������
     * 
     * @return value
     */
    public DirectionRegNumberType getDirectionRegNumber() {
        return directionRegNumber;
    }

    /** 
     * Set the 'DirectionRegNumber' element value. ��������������� ����� ����������� ������������
     * 
     * @param directionRegNumber
     */
    public void setDirectionRegNumber(DirectionRegNumberType directionRegNumber) {
        this.directionRegNumber = directionRegNumber;
    }

    /** 
     * Get the 'ContactInfo' element value. ���������� � ��������� ����������� ������������
     * 
     * @return value
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /** 
     * Set the 'ContactInfo' element value. ���������� � ��������� ����������� ������������
     * 
     * @param contactInfo
     */
    public void setContactInfo(ContactInfoType contactInfo) {
        this.contactInfo = contactInfo;
    }
}
