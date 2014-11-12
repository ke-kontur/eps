
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Комплексный тип для описания подробностей для морского/речного транспорта
 */
public class SeaParticularsType
{
    private String entryNumber;
    private String countryCode;
    private PersonBaseType captain;

    /** 
     * Get the 'EntryNumber' element value. Номер прихода/ухода
     * 
     * @return value
     */
    public String getEntryNumber() {
        return entryNumber;
    }

    /** 
     * Set the 'EntryNumber' element value. Номер прихода/ухода
     * 
     * @param entryNumber
     */
    public void setEntryNumber(String entryNumber) {
        this.entryNumber = entryNumber;
    }

    /** 
     * Get the 'CountryCode' element value. Данные о стране принадлежности судна
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Данные о стране принадлежности судна
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'Captain' element value. Данные о капитане
     * 
     * @return value
     */
    public PersonBaseType getCaptain() {
        return captain;
    }

    /** 
     * Set the 'Captain' element value. Данные о капитане
     * 
     * @param captain
     */
    public void setCaptain(PersonBaseType captain) {
        this.captain = captain;
    }
}
