
package ru.acs.fts.schemas.album.revealingtransportpp;

/** 
 * Информация о книжке МДП
 */
public class MDPInfoType
{
    private String MDPSeriesNumber;
    private String MDPNumber;
    private String MDPHolder;

    /** 
     * Get the 'MDPSeriesNumber' element value. Серия МДП
     * 
     * @return value
     */
    public String getMDPSeriesNumber() {
        return MDPSeriesNumber;
    }

    /** 
     * Set the 'MDPSeriesNumber' element value. Серия МДП
     * 
     * @param MDPSeriesNumber
     */
    public void setMDPSeriesNumber(String MDPSeriesNumber) {
        this.MDPSeriesNumber = MDPSeriesNumber;
    }

    /** 
     * Get the 'MDPNumber' element value. Номер книжки МДП
     * 
     * @return value
     */
    public String getMDPNumber() {
        return MDPNumber;
    }

    /** 
     * Set the 'MDPNumber' element value. Номер книжки МДП
     * 
     * @param MDPNumber
     */
    public void setMDPNumber(String MDPNumber) {
        this.MDPNumber = MDPNumber;
    }

    /** 
     * Get the 'MDPHolder' element value. Номер держателя книжки МДП
     * 
     * @return value
     */
    public String getMDPHolder() {
        return MDPHolder;
    }

    /** 
     * Set the 'MDPHolder' element value. Номер держателя книжки МДП
     * 
     * @param MDPHolder
     */
    public void setMDPHolder(String MDPHolder) {
        this.MDPHolder = MDPHolder;
    }
}
