
package ru.acs.fts.schemas.album.shippingmanifest;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������������� 
 */
public class EscortType
{
    private String purpose;
    private List<String> personList = new ArrayList<String>();

    /** 
     * Get the 'Purpose' element value. ���� ������������� 
     * 
     * @return value
     */
    public String getPurpose() {
        return purpose;
    }

    /** 
     * Set the 'Purpose' element value. ���� ������������� 
     * 
     * @param purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /** 
     * Get the list of 'Person' element items. �������������� ���� 
     * 
     * @return list
     */
    public List<String> getPersonList() {
        return personList;
    }

    /** 
     * Set the list of 'Person' element items. �������������� ���� 
     * 
     * @param list
     */
    public void setPersonList(List<String> list) {
        personList = list;
    }
}
