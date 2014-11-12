
package ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust;

/** 
 * Идентификатор книжки МДП
 */
public class TIRIdentifierType
{
    private String TIRID;
    private String TIRSeries;
    private String TIRWhitePageNumber;

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
}
