
package ru.acs.fts.schemas.album.pi_airarrive;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Сведения об авиаперевозчике
 */
public class AirCarrierInfoType
{
    private String nameAirCarrier;
    private String IATACode;
    private PersonBaseType representativeCarrier;

    /** 
     * Get the 'NameAirCarrier' element value. Полное наименование перевозчика
     * 
     * @return value
     */
    public String getNameAirCarrier() {
        return nameAirCarrier;
    }

    /** 
     * Set the 'NameAirCarrier' element value. Полное наименование перевозчика
     * 
     * @param nameAirCarrier
     */
    public void setNameAirCarrier(String nameAirCarrier) {
        this.nameAirCarrier = nameAirCarrier;
    }

    /** 
     * Get the 'IATACode' element value. Код ИАТА перевозчика
     * 
     * @return value
     */
    public String getIATACode() {
        return IATACode;
    }

    /** 
     * Set the 'IATACode' element value. Код ИАТА перевозчика
     * 
     * @param IATACode
     */
    public void setIATACode(String IATACode) {
        this.IATACode = IATACode;
    }

    /** 
     * Get the 'RepresentativeCarrier' element value. Представитель авиаперевозчика
     * 
     * @return value
     */
    public PersonBaseType getRepresentativeCarrier() {
        return representativeCarrier;
    }

    /** 
     * Set the 'RepresentativeCarrier' element value. Представитель авиаперевозчика
     * 
     * @param representativeCarrier
     */
    public void setRepresentativeCarrier(PersonBaseType representativeCarrier) {
        this.representativeCarrier = representativeCarrier;
    }
}
