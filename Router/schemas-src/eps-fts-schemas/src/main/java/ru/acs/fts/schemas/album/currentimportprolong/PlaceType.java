
package ru.acs.fts.schemas.album.currentimportprolong;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * �������� � ����� ������������ ���������� ������������ �������
 */
public class PlaceType
{
    private CustomsType customs;
    private AddressType factTSAddress;
    private RWstationType RWstation;

    /** 
     * Get the 'Customs' element value. ���������� �����, � ������� ������������ �������� ��������� ������������ ��������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ���������� �����, � ������� ������������ �������� ��������� ������������ ��������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'FactTSAddress' element value. �������� � ����� ������������ ���������� ������������ �������
     * 
     * @return value
     */
    public AddressType getFactTSAddress() {
        return factTSAddress;
    }

    /** 
     * Set the 'FactTSAddress' element value. �������� � ����� ������������ ���������� ������������ �������
     * 
     * @param factTSAddress
     */
    public void setFactTSAddress(AddressType factTSAddress) {
        this.factTSAddress = factTSAddress;
    }

    /** 
     * Get the 'RWstation' element value. �������
     * 
     * @return value
     */
    public RWstationType getRWstation() {
        return RWstation;
    }

    /** 
     * Set the 'RWstation' element value. �������
     * 
     * @param RWstation
     */
    public void setRWstation(RWstationType RWstation) {
        this.RWstation = RWstation;
    }
}
