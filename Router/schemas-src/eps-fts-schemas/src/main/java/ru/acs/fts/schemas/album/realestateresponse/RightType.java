
package ru.acs.fts.schemas.album.realestateresponse;

import java.util.ArrayList;
import java.util.List;

/** 
 * �����
 */
public class RightType
{
    private List<OwnerType> ownerList = new ArrayList<OwnerType>();
    private RightRegistrationType rightRegistration;
    private List<EncumbranceType> encumbranceList = new ArrayList<EncumbranceType>();

    /** 
     * Get the list of 'Owner' element items. ���������������
     * 
     * @return list
     */
    public List<OwnerType> getOwnerList() {
        return ownerList;
    }

    /** 
     * Set the list of 'Owner' element items. ���������������
     * 
     * @param list
     */
    public void setOwnerList(List<OwnerType> list) {
        ownerList = list;
    }

    /** 
     * Get the 'RightRegistration' element value. ������������������ �����
     * 
     * @return value
     */
    public RightRegistrationType getRightRegistration() {
        return rightRegistration;
    }

    /** 
     * Set the 'RightRegistration' element value. ������������������ �����
     * 
     * @param rightRegistration
     */
    public void setRightRegistration(RightRegistrationType rightRegistration) {
        this.rightRegistration = rightRegistration;
    }

    /** 
     * Get the list of 'Encumbrance' element items. ����������� �����
     * 
     * @return list
     */
    public List<EncumbranceType> getEncumbranceList() {
        return encumbranceList;
    }

    /** 
     * Set the list of 'Encumbrance' element items. ����������� �����
     * 
     * @param list
     */
    public void setEncumbranceList(List<EncumbranceType> list) {
        encumbranceList = list;
    }
}
