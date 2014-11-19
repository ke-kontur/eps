
package ru.acs.fts.schemas.album.certificatdimmatriculation;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Сведения о собственнике транспортного средства
 */
public class CDIAutomobileownerType
{
    private String name;
    private String naturalPersonIndicator;
    private AddressType postalAdress;

    /** 
     * Get the 'Name' element value. ФИО физического лица/Наименование организации
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ФИО физического лица/Наименование организации
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'NaturalPersonIndicator' element value. Индикатор, заполняется в случае, если страхователь - физическое лицо
     * 
     * @return value
     */
    public String getNaturalPersonIndicator() {
        return naturalPersonIndicator;
    }

    /** 
     * Set the 'NaturalPersonIndicator' element value. Индикатор, заполняется в случае, если страхователь - физическое лицо
     * 
     * @param naturalPersonIndicator
     */
    public void setNaturalPersonIndicator(String naturalPersonIndicator) {
        this.naturalPersonIndicator = naturalPersonIndicator;
    }

    /** 
     * Get the 'PostalAdress' element value. Адрес владельца ТС
     * 
     * @return value
     */
    public AddressType getPostalAdress() {
        return postalAdress;
    }

    /** 
     * Set the 'PostalAdress' element value. Адрес владельца ТС
     * 
     * @param postalAdress
     */
    public void setPostalAdress(AddressType postalAdress) {
        this.postalAdress = postalAdress;
    }
}
