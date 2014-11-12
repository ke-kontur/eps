
package ru.acs.fts.schemas.album.notifconsult;

/** 
 * Структурное подразделение таможни
 */
public class CustomsSubUnitType
{
    private String name;
    private String action;

    /** 
     * Get the 'Name' element value. Наименование структурного подразделения таможни
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование структурного подразделения таможни
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Action' element value. Код действия структурного подразделения: "0" - согласование, "1" - принятие решения
     * 
     * @return value
     */
    public String getAction() {
        return action;
    }

    /** 
     * Set the 'Action' element value. Код действия структурного подразделения: "0" - согласование, "1" - принятие решения
     * 
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }
}
