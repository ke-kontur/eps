
package ru.acs.fts.schemas.album.mvdtransitweapon;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Разрешение
 */
public class PermissionType extends DocumentBaseType
{
    private String series;

    /** 
     * Get the 'Series' element value. Серия
     * 
     * @return value
     */
    public String getSeries() {
        return series;
    }

    /** 
     * Set the 'Series' element value. Серия
     * 
     * @param series
     */
    public void setSeries(String series) {
        this.series = series;
    }
}
