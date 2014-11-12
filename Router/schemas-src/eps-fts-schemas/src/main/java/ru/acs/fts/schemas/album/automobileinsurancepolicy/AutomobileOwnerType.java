
package ru.acs.fts.schemas.album.automobileinsurancepolicy;

/** 
 * Сведения о собственнике транспортного средства
 */
public class AutomobileOwnerType
{
    private String name;
    private String naturalPersonIndicator;

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
}
