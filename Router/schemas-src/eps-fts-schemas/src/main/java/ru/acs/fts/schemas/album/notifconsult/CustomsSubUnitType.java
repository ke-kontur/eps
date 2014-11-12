
package ru.acs.fts.schemas.album.notifconsult;

/** 
 * ����������� ������������� �������
 */
public class CustomsSubUnitType
{
    private String name;
    private String action;

    /** 
     * Get the 'Name' element value. ������������ ������������ ������������� �������
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ������������ ������������ ������������� �������
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Action' element value. ��� �������� ������������ �������������: "0" - ������������, "1" - �������� �������
     * 
     * @return value
     */
    public String getAction() {
        return action;
    }

    /** 
     * Set the 'Action' element value. ��� �������� ������������ �������������: "0" - ������������, "1" - �������� �������
     * 
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }
}
