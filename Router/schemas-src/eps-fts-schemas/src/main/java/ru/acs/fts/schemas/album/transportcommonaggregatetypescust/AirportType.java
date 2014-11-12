
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

/** 
 * Сведения об аэропорте (городе)
 */
public class AirportType
{
    private String name;
    private String IATACode;

    /** 
     * Get the 'Name' element value. Название
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Название
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
