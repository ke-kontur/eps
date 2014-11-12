
package ru.acs.fts.schemas.album.actinspection;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Изъятие
 */
public class SeizeType
{
    private String presence;
    private DocumentBaseType seizeAct;

    /** 
     * Get the 'Presence' element value. "0" - изъятие не производилось, "1" - произведено взятие проб и образцов по акту
     * 
     * @return value
     */
    public String getPresence() {
        return presence;
    }

    /** 
     * Set the 'Presence' element value. "0" - изъятие не производилось, "1" - произведено взятие проб и образцов по акту
     * 
     * @param presence
     */
    public void setPresence(String presence) {
        this.presence = presence;
    }

    /** 
     * Get the 'SeizeAct' element value. Акт взятие проб и образцов
     * 
     * @return value
     */
    public DocumentBaseType getSeizeAct() {
        return seizeAct;
    }

    /** 
     * Set the 'SeizeAct' element value. Акт взятие проб и образцов
     * 
     * @param seizeAct
     */
    public void setSeizeAct(DocumentBaseType seizeAct) {
        this.seizeAct = seizeAct;
    }
}
