
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

/** 
 * Реквизиты книжки МДП
 */
public class TIRIDType
{
    private String TIRID;
    private String TIRSeries;
    private String TIRWhitePageNumber;
    private String TIRGreenPageNumber;
    private String TIRHolder;

    /** 
     * Get the 'TIRID' element value. Номер книжки МДП
     * 
     * @return value
     */
    public String getTIRID() {
        return TIRID;
    }

    /** 
     * Set the 'TIRID' element value. Номер книжки МДП
     * 
     * @param TIRID
     */
    public void setTIRID(String TIRID) {
        this.TIRID = TIRID;
    }

    /** 
     * Get the 'TIRSeries' element value. Серия книжки МДП
     * 
     * @return value
     */
    public String getTIRSeries() {
        return TIRSeries;
    }

    /** 
     * Set the 'TIRSeries' element value. Серия книжки МДП
     * 
     * @param TIRSeries
     */
    public void setTIRSeries(String TIRSeries) {
        this.TIRSeries = TIRSeries;
    }

    /** 
     * Get the 'TIRWhitePageNumber' element value. Порядковый номер белого листа книжки МДП
     * 
     * @return value
     */
    public String getTIRWhitePageNumber() {
        return TIRWhitePageNumber;
    }

    /** 
     * Set the 'TIRWhitePageNumber' element value. Порядковый номер белого листа книжки МДП
     * 
     * @param TIRWhitePageNumber
     */
    public void setTIRWhitePageNumber(String TIRWhitePageNumber) {
        this.TIRWhitePageNumber = TIRWhitePageNumber;
    }

    /** 
     * Get the 'TIRGreenPageNumber' element value. Порядковый номер зеленого листа книжки МДП
     * 
     * @return value
     */
    public String getTIRGreenPageNumber() {
        return TIRGreenPageNumber;
    }

    /** 
     * Set the 'TIRGreenPageNumber' element value. Порядковый номер зеленого листа книжки МДП
     * 
     * @param TIRGreenPageNumber
     */
    public void setTIRGreenPageNumber(String TIRGreenPageNumber) {
        this.TIRGreenPageNumber = TIRGreenPageNumber;
    }

    /** 
     * Get the 'TIRHolder' element value. Идентификационный номер держателя книжки МДП
     * 
     * @return value
     */
    public String getTIRHolder() {
        return TIRHolder;
    }

    /** 
     * Set the 'TIRHolder' element value. Идентификационный номер держателя книжки МДП
     * 
     * @param TIRHolder
     */
    public void setTIRHolder(String TIRHolder) {
        this.TIRHolder = TIRHolder;
    }
}
