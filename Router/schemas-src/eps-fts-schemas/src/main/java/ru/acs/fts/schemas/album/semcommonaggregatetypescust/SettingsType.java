
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

/** 
 * ��������������� ������������
 */
public class SettingsType
{
    private String name;
    private String value;
    private String type;

    /** 
     * Get the 'Name' element value. ������������ ������������
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ������������ ������������
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Value' element value. �������� ������������
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'Value' element value. �������� ������������
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /** 
     * Get the 'Type' element value. ��� ������������
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' element value. ��� ������������
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
