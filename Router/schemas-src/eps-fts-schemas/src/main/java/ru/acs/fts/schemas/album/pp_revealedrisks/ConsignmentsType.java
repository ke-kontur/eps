
package ru.acs.fts.schemas.album.pp_revealedrisks;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������ �������, �� ������� ���� �������� �����
 */
public class ConsignmentsType
{
    private List<ProfileRefType> profileRefList = new ArrayList<ProfileRefType>();
    private List<ConsignmentType> consignmentList = new ArrayList<ConsignmentType>();

    /** 
     * Get the list of 'ProfileRef' element items. ������ �� ��/���, ������� ��������� �� �� � ����� (�.�. �� ��� ������ �������)
     * 
     * @return list
     */
    public List<ProfileRefType> getProfileRefList() {
        return profileRefList;
    }

    /** 
     * Set the list of 'ProfileRef' element items. ������ �� ��/���, ������� ��������� �� �� � ����� (�.�. �� ��� ������ �������)
     * 
     * @param list
     */
    public void setProfileRefList(List<ProfileRefType> list) {
        profileRefList = list;
    }

    /** 
     * Get the list of 'Consignment' element items. ������ �������, �� ������� ���� �������� �����
     * 
     * @return list
     */
    public List<ConsignmentType> getConsignmentList() {
        return consignmentList;
    }

    /** 
     * Set the list of 'Consignment' element items. ������ �������, �� ������� ���� �������� �����
     * 
     * @param list
     */
    public void setConsignmentList(List<ConsignmentType> list) {
        consignmentList = list;
    }
}
