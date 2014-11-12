
package ru.acs.fts.schemas.album.goodstranshipment;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * ����� ���������� �������� � ���� ��������.
 */
public class ReloadPlaceType extends CustomsType
{
    private String borderPointCode;
    private RWStationType RWStation;

    /** 
     * Get the 'BorderPointCode' element value. ��� ������ ��������
     * 
     * @return value
     */
    public String getBorderPointCode() {
        return borderPointCode;
    }

    /** 
     * Set the 'BorderPointCode' element value. ��� ������ ��������
     * 
     * @param borderPointCode
     */
    public void setBorderPointCode(String borderPointCode) {
        this.borderPointCode = borderPointCode;
    }

    /** 
     * Get the 'RWStation' element value. �� ������� �� ������� �������������� �������� ��������
     * 
     * @return value
     */
    public RWStationType getRWStation() {
        return RWStation;
    }

    /** 
     * Set the 'RWStation' element value. �� ������� �� ������� �������������� �������� ��������
     * 
     * @param RWStation
     */
    public void setRWStation(RWStationType RWStation) {
        this.RWStation = RWStation;
    }
}
