
package ru.acs.fts.schemas.album.do2report;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.ConsigneeType;

/** 
 * ����������� ��� ��� �������� ��������������� ��� ����������� ������ ��2
 */
public class DO2ConsigneeType extends ConsigneeType
{
    private PersonBaseType consigneePerson;

    /** 
     * Get the 'ConsigneePerson' element value. ������������� ����������
     * 
     * @return value
     */
    public PersonBaseType getConsigneePerson() {
        return consigneePerson;
    }

    /** 
     * Set the 'ConsigneePerson' element value. ������������� ����������
     * 
     * @param consigneePerson
     */
    public void setConsigneePerson(PersonBaseType consigneePerson) {
        this.consigneePerson = consigneePerson;
    }
}
