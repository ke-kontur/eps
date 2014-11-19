
package ru.acs.fts.schemas.album.notif_piresult;

import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.TIRIDType;

/** 
 * ���������� �� ������ ���
 */
public class TIRDocResultType extends TIRIDType
{
    private String PIStatus;

    /** 
     * Get the 'PI_Status' element value. ������ ��������������� ����������
     * 
     * @return value
     */
    public String getPIStatus() {
        return PIStatus;
    }

    /** 
     * Set the 'PI_Status' element value. ������ ��������������� ����������
     * 
     * @param PIStatus
     */
    public void setPIStatus(String PIStatus) {
        this.PIStatus = PIStatus;
    }
}
