
package ru.acs.fts.schemas.album.whgoodsdeadline;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ��������� �����������
 */
public class OrganizationType extends OrganizationBaseType
{
    private AddressType address;
    private PersonBaseType directorInfo;

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
     * Get the 'DirectorInfo' element value. �������� � ������������
     * 
     * @return value
     */
    public PersonBaseType getDirectorInfo() {
        return directorInfo;
    }

    /** 
     * Set the 'DirectorInfo' element value. �������� � ������������
     * 
     * @param directorInfo
     */
    public void setDirectorInfo(PersonBaseType directorInfo) {
        this.directorInfo = directorInfo;
    }
}
