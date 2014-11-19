
package ru.acs.fts.schemas.album.realestateresponse;

/** 
 * Описание характеристик
 */
public class AddDescriptionType
{
    private String code;
    private String textDescription;

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
     * Get the 'TextDescription' element value. Текстовое описание (Вид)
     * 
     * @return value
     */
    public String getTextDescription() {
        return textDescription;
    }

    /** 
     * Set the 'TextDescription' element value. Текстовое описание (Вид)
     * 
     * @param textDescription
     */
    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }
}
