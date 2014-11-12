
package ru.acs.fts.schemas.album.revealeddirections;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Информация о владельце оперативной ориентировки
 */
public class ContactInfoType extends PersonBaseType
{
    private String contactPhone;
    private String contactDepartament;

    /** 
     * Get the 'ContactPhone' element value. Контактный телефон пользователя, разработавшего оперативную ориентировку
     * 
     * @return value
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /** 
     * Set the 'ContactPhone' element value. Контактный телефон пользователя, разработавшего оперативную ориентировку
     * 
     * @param contactPhone
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /** 
     * Get the 'ContactDepartament' element value. Наименование отдела пользователя, разработавшего оперативную ориентировку
     * 
     * @return value
     */
    public String getContactDepartament() {
        return contactDepartament;
    }

    /** 
     * Set the 'ContactDepartament' element value. Наименование отдела пользователя, разработавшего оперативную ориентировку
     * 
     * @param contactDepartament
     */
    public void setContactDepartament(String contactDepartament) {
        this.contactDepartament = contactDepartament;
    }
}
