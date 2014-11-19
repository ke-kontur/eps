
package ru.acs.fts.schemas.album.actinspection;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������
 */
public class SeizeType
{
    private String presence;
    private DocumentBaseType seizeAct;

    /** 
     * Get the 'Presence' element value. "0" - ������� �� �������������, "1" - ����������� ������ ���� � �������� �� ����
     * 
     * @return value
     */
    public String getPresence() {
        return presence;
    }

    /** 
     * Set the 'Presence' element value. "0" - ������� �� �������������, "1" - ����������� ������ ���� � �������� �� ����
     * 
     * @param presence
     */
    public void setPresence(String presence) {
        this.presence = presence;
    }

    /** 
     * Get the 'SeizeAct' element value. ��� ������ ���� � ��������
     * 
     * @return value
     */
    public DocumentBaseType getSeizeAct() {
        return seizeAct;
    }

    /** 
     * Set the 'SeizeAct' element value. ��� ������ ���� � ��������
     * 
     * @param seizeAct
     */
    public void setSeizeAct(DocumentBaseType seizeAct) {
        this.seizeAct = seizeAct;
    }
}
