
package ru.acs.fts.schemas.album.rosprirodcollectionmaterial;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * ������ ��������� � �� ����������
 */
public class ItemType
{
    private List<String> itemDescriptionList = new ArrayList<String>();
    private SupplementaryQuantityType quantity;

    /** 
     * Get the list of 'ItemDescription' element items. ������������
     * 
     * @return list
     */
    public List<String> getItemDescriptionList() {
        return itemDescriptionList;
    }

    /** 
     * Set the list of 'ItemDescription' element items. ������������
     * 
     * @param list
     */
    public void setItemDescriptionList(List<String> list) {
        itemDescriptionList = list;
    }

    /** 
     * Get the 'Quantity' element value. ����������
     * 
     * @return value
     */
    public SupplementaryQuantityType getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ����������
     * 
     * @param quantity
     */
    public void setQuantity(SupplementaryQuantityType quantity) {
        this.quantity = quantity;
    }
}
