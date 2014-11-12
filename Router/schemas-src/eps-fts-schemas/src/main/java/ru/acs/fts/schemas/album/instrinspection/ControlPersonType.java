
package ru.acs.fts.schemas.album.instrinspection;

import ru.acs.fts.schemas.album.commonaggregatetypescust.ContactType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� � ����������� ����
 */
public class ControlPersonType extends PersonBaseType
{
    private ContactType contact;

    /** 
     * Get the 'Contact' element value. ���������� ����������
     * 
     * @return value
     */
    public ContactType getContact() {
        return contact;
    }

    /** 
     * Set the 'Contact' element value. ���������� ����������
     * 
     * @param contact
     */
    public void setContact(ContactType contact) {
        this.contact = contact;
    }
}
