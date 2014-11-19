
package ru.acs.fts.schemas.album.conformancesertif;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.sertifcommonaggregatetypescust.SertifOrgBaseType;

/** 
 * �������� �� ����������� -  �������������
 */
public class ManufacturerOrgType extends SertifOrgBaseType
{
    private List<SubdivisionInfoType> subdivisionInfoList = new ArrayList<SubdivisionInfoType>();

    /** 
     * Get the list of 'SubdivisionInfo' element items. �������� � �������������� �����������
     * 
     * @return list
     */
    public List<SubdivisionInfoType> getSubdivisionInfoList() {
        return subdivisionInfoList;
    }

    /** 
     * Set the list of 'SubdivisionInfo' element items. �������� � �������������� �����������
     * 
     * @param list
     */
    public void setSubdivisionInfoList(List<SubdivisionInfoType> list) {
        subdivisionInfoList = list;
    }
}
