
package ru.acs.fts.schemas.album.dtsin;

import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSFilledPersonType;

/** 
 * ���. ���������� ������. �������� � ����, ����������� ���.
 */
public class DTSinFilledPersonType extends DTSFilledPersonType
{
    private String LNP;

    /** 
     * Get the 'LNP' element value. ������ �������� ������ ������������ ���� ����������� ������.
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ������ �������� ������ ������������ ���� ����������� ������.
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }
}
