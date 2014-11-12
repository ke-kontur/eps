
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

/** 
 * Ограничительные коэффициенты
 */
public class SettingsType
{
    private String name;
    private String value;
    private String type;

    /** 
     * Get the 'Name' element value. Наименование коэффициента
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование коэффициента
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Value' element value. Значение коэффициента
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'Value' element value. Значение коэффициента
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /** 
     * Get the 'Type' element value. Тип коэффициента
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' element value. Тип коэффициента
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
