
package ru.acs.fts.schemas.album.mediacertificate;

/** 
 * Сведения о СМИ
 */
public class MediaInfoType
{
    private String code;
    private String name;

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
     * Get the 'Name' element value. Наименование
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
