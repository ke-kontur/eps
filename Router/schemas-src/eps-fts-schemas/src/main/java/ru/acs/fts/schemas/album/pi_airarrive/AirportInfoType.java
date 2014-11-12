
package ru.acs.fts.schemas.album.pi_airarrive;

/** 
 * Сведения об аэропорте
 */
public class AirportInfoType
{
    private String airportName;
    private String IATACode;

    /** 
     * Get the 'AirportName' element value. Название 
     * 
     * @return value
     */
    public String getAirportName() {
        return airportName;
    }

    /** 
     * Set the 'AirportName' element value. Название 
     * 
     * @param airportName
     */
    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    /** 
     * Get the 'IATACode' element value. Код ИАТА
     * 
     * @return value
     */
    public String getIATACode() {
        return IATACode;
    }

    /** 
     * Set the 'IATACode' element value. Код ИАТА
     * 
     * @param IATACode
     */
    public void setIATACode(String IATACode) {
        this.IATACode = IATACode;
    }
}
