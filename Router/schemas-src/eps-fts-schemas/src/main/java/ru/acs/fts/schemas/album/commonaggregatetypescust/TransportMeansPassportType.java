
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Серия и номер Паспорта транспортного средства
 */
public class TransportMeansPassportType
{
    private String series;
    private String PTSNumber;
    private String regionCode;

    /** 
     * Get the 'Series' element value. Серия Паспорта транспортного средства
     * 
     * @return value
     */
    public String getSeries() {
        return series;
    }

    /** 
     * Set the 'Series' element value. Серия Паспорта транспортного средства
     * 
     * @param series
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /** 
     * Get the 'PTSNumber' element value. Номер Паспорта транспортного средства
     * 
     * @return value
     */
    public String getPTSNumber() {
        return PTSNumber;
    }

    /** 
     * Set the 'PTSNumber' element value. Номер Паспорта транспортного средства
     * 
     * @param PTSNumber
     */
    public void setPTSNumber(String PTSNumber) {
        this.PTSNumber = PTSNumber;
    }

    /** 
     * Get the 'RegionCode' element value. Код региона
     * 
     * @return value
     */
    public String getRegionCode() {
        return regionCode;
    }

    /** 
     * Set the 'RegionCode' element value. Код региона
     * 
     * @param regionCode
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
}
