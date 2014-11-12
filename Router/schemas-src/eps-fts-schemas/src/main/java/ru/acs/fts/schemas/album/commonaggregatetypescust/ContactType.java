
package ru.acs.fts.schemas.album.commonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Контактная информация
 */
public class ContactType
{
    private List<String> phoneList = new ArrayList<String>();
    private String fax;
    private String telex;
    private List<String> EMailList = new ArrayList<String>();

    /** 
     * Get the list of 'Phone' element items. Номер телефона
     * 
     * @return list
     */
    public List<String> getPhoneList() {
        return phoneList;
    }

    /** 
     * Set the list of 'Phone' element items. Номер телефона
     * 
     * @param list
     */
    public void setPhoneList(List<String> list) {
        phoneList = list;
    }

    /** 
     * Get the 'Fax' element value. Номер факса
     * 
     * @return value
     */
    public String getFax() {
        return fax;
    }

    /** 
     * Set the 'Fax' element value. Номер факса
     * 
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /** 
     * Get the 'Telex' element value. Номер телекса
     * 
     * @return value
     */
    public String getTelex() {
        return telex;
    }

    /** 
     * Set the 'Telex' element value. Номер телекса
     * 
     * @param telex
     */
    public void setTelex(String telex) {
        this.telex = telex;
    }

    /** 
     * Get the list of 'E_mail' element items. Адрес электронной почты
     * 
     * @return list
     */
    public List<String> getEMailList() {
        return EMailList;
    }

    /** 
     * Set the list of 'E_mail' element items. Адрес электронной почты
     * 
     * @param list
     */
    public void setEMailList(List<String> list) {
        EMailList = list;
    }
}
