
package ru.acs.fts.schemas.album.rznmedizd;

/** 
 * Код ОКП / Категория ИМН
 */
public class ItemType
{
    private String code;
    private String description;

    /** 
     * Get the 'Code' element value. Код
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' element value. Код
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'Description' element value. Расшифровка кода
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. Расшифровка кода
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
