
package ru.acs.fts.schemas.album.mvdtransitweapon;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ����������
 */
public class PermissionType extends DocumentBaseType
{
    private String series;

    /** 
     * Get the 'Series' element value. �����
     * 
     * @return value
     */
    public String getSeries() {
        return series;
    }

    /** 
     * Set the 'Series' element value. �����
     * 
     * @param series
     */
    public void setSeries(String series) {
        this.series = series;
    }
}
