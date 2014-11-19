
package ru.acs.fts.schemas.album.customsregistrycertificate;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUBranchDescriptionType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * �������� �� �����������, ������������������ � �������� ���/����������� �����������/��������� ���/��������� ���/��������� ����������� ������
 */
public class RegisteredOrganizationType extends CUOrganizationType
{
    private List<CUBranchDescriptionType> branchDescriptionList = new ArrayList<CUBranchDescriptionType>();

    /** 
     * Get the list of 'BranchDescription' element items. �������� �� ������������ �������������
     * 
     * @return list
     */
    public List<CUBranchDescriptionType> getBranchDescriptionList() {
        return branchDescriptionList;
    }

    /** 
     * Set the list of 'BranchDescription' element items. �������� �� ������������ �������������
     * 
     * @param list
     */
    public void setBranchDescriptionList(List<CUBranchDescriptionType> list) {
        branchDescriptionList = list;
    }
}
