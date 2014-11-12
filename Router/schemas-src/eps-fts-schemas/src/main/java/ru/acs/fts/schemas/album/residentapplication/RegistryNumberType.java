
package ru.acs.fts.schemas.album.residentapplication;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Регистрационный номер заявления вида ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХ
 */
public class RegistryNumberType extends GTDIDType
{
    private String revisionNumber;

    /** 
     * Get the 'RevisionNumber' element value. Номер редакции заявления : 01 - для первичной подачи, при каждом внесении изменений и (или) дополнений номер должен быть увеличен на единицу
     * 
     * @return value
     */
    public String getRevisionNumber() {
        return revisionNumber;
    }

    /** 
     * Set the 'RevisionNumber' element value. Номер редакции заявления : 01 - для первичной подачи, при каждом внесении изменений и (или) дополнений номер должен быть увеличен на единицу
     * 
     * @param revisionNumber
     */
    public void setRevisionNumber(String revisionNumber) {
        this.revisionNumber = revisionNumber;
    }
}
