
package ru.acs.fts.schemas.album.applicationstore;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Сведения о перевозчике
 */
public class CarrierType extends CUOrganizationType
{
    private String airlineIATACode;
    private CUOrganizationType carrierRepresentative;

    /** 
     * Get the 'AirlineIATACode' element value. Код ИАТА
     * 
     * @return value
     */
    public String getAirlineIATACode() {
        return airlineIATACode;
    }

    /** 
     * Set the 'AirlineIATACode' element value. Код ИАТА
     * 
     * @param airlineIATACode
     */
    public void setAirlineIATACode(String airlineIATACode) {
        this.airlineIATACode = airlineIATACode;
    }

    /** 
     * Get the 'CarrierRepresentative' element value. Представитель авиакомпании
     * 
     * @return value
     */
    public CUOrganizationType getCarrierRepresentative() {
        return carrierRepresentative;
    }

    /** 
     * Set the 'CarrierRepresentative' element value. Представитель авиакомпании
     * 
     * @param carrierRepresentative
     */
    public void setCarrierRepresentative(
            CUOrganizationType carrierRepresentative) {
        this.carrierRepresentative = carrierRepresentative;
    }
}
