
package ru.acs.fts.schemas.album.esadoutp;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Информация о транспортных документах
 */
public class TransportDocumentType extends DocumentBaseType
{
    private String holder;

    /** 
     * Get the 'Holder' element value. Держатель накладной
     * 
     * @return value
     */
    public String getHolder() {
        return holder;
    }

    /** 
     * Set the 'Holder' element value. Держатель накладной
     * 
     * @param holder
     */
    public void setHolder(String holder) {
        this.holder = holder;
    }
}
