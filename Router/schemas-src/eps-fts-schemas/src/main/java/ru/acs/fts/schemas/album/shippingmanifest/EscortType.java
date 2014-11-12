
package ru.acs.fts.schemas.album.shippingmanifest;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сопровождение 
 */
public class EscortType
{
    private String purpose;
    private List<String> personList = new ArrayList<String>();

    /** 
     * Get the 'Purpose' element value. Цель сопровождения 
     * 
     * @return value
     */
    public String getPurpose() {
        return purpose;
    }

    /** 
     * Set the 'Purpose' element value. Цель сопровождения 
     * 
     * @param purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /** 
     * Get the list of 'Person' element items. Сопровождающие лица 
     * 
     * @return list
     */
    public List<String> getPersonList() {
        return personList;
    }

    /** 
     * Set the list of 'Person' element items. Сопровождающие лица 
     * 
     * @param list
     */
    public void setPersonList(List<String> list) {
        personList = list;
    }
}
