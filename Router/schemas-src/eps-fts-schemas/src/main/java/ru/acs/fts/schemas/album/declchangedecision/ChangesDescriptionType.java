
package ru.acs.fts.schemas.album.declchangedecision;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Описание необходимых изменений (дополнений)
 */
public class ChangesDescriptionType
{
    private GTDIDType declRegNumber;
    private List<ChangeDetailsType> changeDetailList = new ArrayList<ChangeDetailsType>();

    /** 
     * Get the 'DeclRegNumber' element value. Регистрационный номер декларации
     * 
     * @return value
     */
    public GTDIDType getDeclRegNumber() {
        return declRegNumber;
    }

    /** 
     * Set the 'DeclRegNumber' element value. Регистрационный номер декларации
     * 
     * @param declRegNumber
     */
    public void setDeclRegNumber(GTDIDType declRegNumber) {
        this.declRegNumber = declRegNumber;
    }

    /** 
     * Get the list of 'ChangeDetails' element items. Изменение
     * 
     * @return list
     */
    public List<ChangeDetailsType> getChangeDetailList() {
        return changeDetailList;
    }

    /** 
     * Set the list of 'ChangeDetails' element items. Изменение
     * 
     * @param list
     */
    public void setChangeDetailList(List<ChangeDetailsType> list) {
        changeDetailList = list;
    }
}
