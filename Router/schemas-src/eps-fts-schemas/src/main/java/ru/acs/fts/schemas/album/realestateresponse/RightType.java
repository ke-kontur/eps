
package ru.acs.fts.schemas.album.realestateresponse;

import java.util.ArrayList;
import java.util.List;

/** 
 * Права
 */
public class RightType
{
    private List<OwnerType> ownerList = new ArrayList<OwnerType>();
    private RightRegistrationType rightRegistration;
    private List<EncumbranceType> encumbranceList = new ArrayList<EncumbranceType>();

    /** 
     * Get the list of 'Owner' element items. Правообладатель
     * 
     * @return list
     */
    public List<OwnerType> getOwnerList() {
        return ownerList;
    }

    /** 
     * Set the list of 'Owner' element items. Правообладатель
     * 
     * @param list
     */
    public void setOwnerList(List<OwnerType> list) {
        ownerList = list;
    }

    /** 
     * Get the 'RightRegistration' element value. Зарегистрированное право
     * 
     * @return value
     */
    public RightRegistrationType getRightRegistration() {
        return rightRegistration;
    }

    /** 
     * Set the 'RightRegistration' element value. Зарегистрированное право
     * 
     * @param rightRegistration
     */
    public void setRightRegistration(RightRegistrationType rightRegistration) {
        this.rightRegistration = rightRegistration;
    }

    /** 
     * Get the list of 'Encumbrance' element items. Ограничение права
     * 
     * @return list
     */
    public List<EncumbranceType> getEncumbranceList() {
        return encumbranceList;
    }

    /** 
     * Set the list of 'Encumbrance' element items. Ограничение права
     * 
     * @param list
     */
    public void setEncumbranceList(List<EncumbranceType> list) {
        encumbranceList = list;
    }
}
