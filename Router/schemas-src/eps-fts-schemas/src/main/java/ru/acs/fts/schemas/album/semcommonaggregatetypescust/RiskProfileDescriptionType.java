
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

/** 
 * Неформализованные индикаторы профиля риска
 */
public class RiskProfileDescriptionType
{
    private String code;
    private String description;

    /** 
     * Get the 'Code' element value. Код неформализованного признака
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' element value. Код неформализованного признака
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'Description' element value. Описание (значение) неформализованного признака
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. Описание (значение) неформализованного признака
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
