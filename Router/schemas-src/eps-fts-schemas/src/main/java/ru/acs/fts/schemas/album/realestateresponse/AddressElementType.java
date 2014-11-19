
package ru.acs.fts.schemas.album.realestateresponse;

/** 
 * Адресный элемент
 */
public class AddressElementType
{
    private String type;
    private String name;

    /** 
     * Get the 'Type' element value. Тип адресного элемента
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' element value. Тип адресного элемента
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'Name' element value. Наименование адресного элемента
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование адресного элемента
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
