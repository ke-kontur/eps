
package ru.acs.fts.schemas.album.transportmeanspassport;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Документ по которому ТС обращено в федеральную  собственность
 */
public class FederalDocType extends DocumentBaseType
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
