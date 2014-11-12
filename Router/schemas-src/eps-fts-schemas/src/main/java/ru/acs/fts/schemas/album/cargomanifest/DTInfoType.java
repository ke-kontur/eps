
package ru.acs.fts.schemas.album.cargomanifest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * �������� � ��
 */
public class DTInfoType
{
    private String goodNumber;
    private GTDIDType DTNumber;

    /** 
     * Get the 'GoodNumber' element value. ����� ������ �� ��
     * 
     * @return value
     */
    public String getGoodNumber() {
        return goodNumber;
    }

    /** 
     * Set the 'GoodNumber' element value. ����� ������ �� ��
     * 
     * @param goodNumber
     */
    public void setGoodNumber(String goodNumber) {
        this.goodNumber = goodNumber;
    }

    /** 
     * Get the 'DTNumber' element value. ����� ���������� �� ������
     * 
     * @return value
     */
    public GTDIDType getDTNumber() {
        return DTNumber;
    }

    /** 
     * Set the 'DTNumber' element value. ����� ���������� �� ������
     * 
     * @param DTNumber
     */
    public void setDTNumber(GTDIDType DTNumber) {
        this.DTNumber = DTNumber;
    }
}
