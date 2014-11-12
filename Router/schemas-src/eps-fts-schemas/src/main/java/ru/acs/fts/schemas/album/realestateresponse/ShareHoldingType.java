
package ru.acs.fts.schemas.album.realestateresponse;

import java.util.ArrayList;
import java.util.List;

/** 
 * Описание объектов долевого строительства
 */
public class ShareHoldingType
{
    private List<String> shareObjectList = new ArrayList<String>();
    private List<OwnerType> ownerList = new ArrayList<OwnerType>();
    private List<EncumbranceType> encumbranceList = new ArrayList<EncumbranceType>();

    /** 
     * Get the list of 'ShareObject' element items. Описание объекта долевого строительства
     * 
     * @return list
     */
    public List<String> getShareObjectList() {
        return shareObjectList;
    }

    /** 
     * Set the list of 'ShareObject' element items. Описание объекта долевого строительства
     * 
     * @param list
     */
    public void setShareObjectList(List<String> list) {
        shareObjectList = list;
    }

    /** 
     * Get the list of 'Owner' element items. Участник долевого строительства
     * 
     * @return list
     */
    public List<OwnerType> getOwnerList() {
        return ownerList;
    }

    /** 
     * Set the list of 'Owner' element items. Участник долевого строительства
     * 
     * @param list
     */
    public void setOwnerList(List<OwnerType> list) {
        ownerList = list;
    }

    /** 
     * Get the list of 'Encumbrance' element items. Описание ипотеки
     * 
     * @return list
     */
    public List<EncumbranceType> getEncumbranceList() {
        return encumbranceList;
    }

    /** 
     * Set the list of 'Encumbrance' element items. Описание ипотеки
     * 
     * @param list
     */
    public void setEncumbranceList(List<EncumbranceType> list) {
        encumbranceList = list;
    }
}
