
package ru.acs.fts.schemas.album.declchangedecision;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * �������� ����������� ��������� (����������)
 */
public class ChangesDescriptionType
{
    private GTDIDType declRegNumber;
    private List<ChangeDetailsType> changeDetailList = new ArrayList<ChangeDetailsType>();

    /** 
     * Get the 'DeclRegNumber' element value. ��������������� ����� ����������
     * 
     * @return value
     */
    public GTDIDType getDeclRegNumber() {
        return declRegNumber;
    }

    /** 
     * Set the 'DeclRegNumber' element value. ��������������� ����� ����������
     * 
     * @param declRegNumber
     */
    public void setDeclRegNumber(GTDIDType declRegNumber) {
        this.declRegNumber = declRegNumber;
    }

    /** 
     * Get the list of 'ChangeDetails' element items. ���������
     * 
     * @return list
     */
    public List<ChangeDetailsType> getChangeDetailList() {
        return changeDetailList;
    }

    /** 
     * Set the list of 'ChangeDetails' element items. ���������
     * 
     * @param list
     */
    public void setChangeDetailList(List<ChangeDetailsType> list) {
        changeDetailList = list;
    }
}
