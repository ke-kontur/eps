
package ru.acs.fts.schemas.album.gtdobligationin;

/** 
 * Сведения о стране
 */
public class CountryType
{
    private String code;
    private String name;

    /** 
     * Get the 'Code' element value. Код страны
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' element value. Код страны
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'Name' element value. Краткое название страны
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Краткое название страны
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
