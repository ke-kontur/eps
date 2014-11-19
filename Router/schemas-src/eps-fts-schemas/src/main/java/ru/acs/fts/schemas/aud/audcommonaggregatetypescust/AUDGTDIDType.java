
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import ru.acs.fts.schemas.aud.commonaggregatetypescust.GTDIDType;

/** 
 * ��������������� ����� ���
 */
public class AUDGTDIDType extends GTDIDType
{
    private String GTDIDState;

    /** 
     * Get the 'GTDIDState' element value. ������ ������ ��� 01 - ����������, 99 - ����� ���  �������
     * 
     * @return value
     */
    public String getGTDIDState() {
        return GTDIDState;
    }

    /** 
     * Set the 'GTDIDState' element value. ������ ������ ��� 01 - ����������, 99 - ����� ���  �������
     * 
     * @param GTDIDState
     */
    public void setGTDIDState(String GTDIDState) {
        this.GTDIDState = GTDIDState;
    }
}
