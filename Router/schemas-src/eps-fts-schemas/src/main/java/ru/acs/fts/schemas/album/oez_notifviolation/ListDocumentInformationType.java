
package ru.acs.fts.schemas.album.oez_notifviolation;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ��������� � ��������, �������������� � �������������� ���������� �����
 */
public class ListDocumentInformationType extends DocumentBaseType
{
    private List<String> addInformationList = new ArrayList<String>();

    /** 
     * Get the list of 'AddInformation' element items. ��������
     * 
     * @return list
     */
    public List<String> getAddInformationList() {
        return addInformationList;
    }

    /** 
     * Set the list of 'AddInformation' element items. ��������
     * 
     * @param list
     */
    public void setAddInformationList(List<String> list) {
        addInformationList = list;
    }
}
