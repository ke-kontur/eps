
package ru.acs.fts.schemas.album.classdecisionchange;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � �������
 */
public class GoodsType
{
    private List<String> goodDescriptionList = new ArrayList<String>();
    private List<ChangesDescriptionType> changesDescriptionList = new ArrayList<ChangesDescriptionType>();

    /** 
     * Get the list of 'GoodDescription' element items. ������������ ������
     * 
     * @return list
     */
    public List<String> getGoodDescriptionList() {
        return goodDescriptionList;
    }

    /** 
     * Set the list of 'GoodDescription' element items. ������������ ������
     * 
     * @param list
     */
    public void setGoodDescriptionList(List<String> list) {
        goodDescriptionList = list;
    }

    /** 
     * Get the list of 'ChangesDescription' element items. �������� ���������
     * 
     * @return list
     */
    public List<ChangesDescriptionType> getChangesDescriptionList() {
        return changesDescriptionList;
    }

    /** 
     * Set the list of 'ChangesDescription' element items. �������� ���������
     * 
     * @param list
     */
    public void setChangesDescriptionList(List<ChangesDescriptionType> list) {
        changesDescriptionList = list;
    }
}
