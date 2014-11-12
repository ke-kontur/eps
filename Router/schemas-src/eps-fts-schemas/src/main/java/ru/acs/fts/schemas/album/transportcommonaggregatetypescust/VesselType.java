
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

/** 
 * Реквизиты судна
 */
public class VesselType
{
    private String name;
    private String shipmaster;
    private String nationalityCode;

    /** 
     * Get the 'Name' element value. Наименование судна
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование судна
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Shipmaster' element value. Фамилия капитана судна
     * 
     * @return value
     */
    public String getShipmaster() {
        return shipmaster;
    }

    /** 
     * Set the 'Shipmaster' element value. Фамилия капитана судна
     * 
     * @param shipmaster
     */
    public void setShipmaster(String shipmaster) {
        this.shipmaster = shipmaster;
    }

    /** 
     * Get the 'NationalityCode' element value. Код страны принадлежности судна
     * 
     * @return value
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /** 
     * Set the 'NationalityCode' element value. Код страны принадлежности судна
     * 
     * @param nationalityCode
     */
    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }
}
