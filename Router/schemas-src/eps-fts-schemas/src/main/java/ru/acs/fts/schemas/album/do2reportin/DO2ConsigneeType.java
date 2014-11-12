
package ru.acs.fts.schemas.album.do2reportin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.ConsigneeType;

/** 
 * Комплексный тип для описания грузополучателя при составлении отчета ДО2
 */
public class DO2ConsigneeType extends ConsigneeType
{
    private PersonBaseType consigneePerson;

    /** 
     * Get the 'ConsigneePerson' element value. Представитель получателя
     * 
     * @return value
     */
    public PersonBaseType getConsigneePerson() {
        return consigneePerson;
    }

    /** 
     * Set the 'ConsigneePerson' element value. Представитель получателя
     * 
     * @param consigneePerson
     */
    public void setConsigneePerson(PersonBaseType consigneePerson) {
        this.consigneePerson = consigneePerson;
    }
}
