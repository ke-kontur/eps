
package ru.acs.fts.schemas.album.checkresultdata;

/** 
 * Ошибки по результатам проверки
 */
public class ResultType
{
    private String code;
    private String description;

    /** 
     * Get the 'Code' element value. Код ошибки
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' element value. Код ошибки
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'Description' element value. Описание ошибки
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. Описание ошибки
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
