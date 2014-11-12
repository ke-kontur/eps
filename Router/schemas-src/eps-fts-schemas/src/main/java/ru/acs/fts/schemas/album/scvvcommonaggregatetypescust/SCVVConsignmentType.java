
package ru.acs.fts.schemas.album.scvvcommonaggregatetypescust;

/** 
 * Информация о фактическом вывозе по товарной партии
 */
public class SCVVConsignmentType extends SCVVShipmentFactInfoType
{
    private GTDInqType DTID;

    /** 
     * Get the 'DTID' element value. Регистрационный номер ДТ.
     * 
     * @return value
     */
    public GTDInqType getDTID() {
        return DTID;
    }

    /** 
     * Set the 'DTID' element value. Регистрационный номер ДТ.
     * 
     * @param DTID
     */
    public void setDTID(GTDInqType DTID) {
        this.DTID = DTID;
    }
}
