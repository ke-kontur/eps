
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

/** 
 * ������� ��������
 */
public class TransitRouteType
{
    private String transitPointNumber;
    private String transitRoutePlace;

    /** 
     * Get the 'TransitPointNumber' element value. ���������� ����� ����� ��������
     * 
     * @return value
     */
    public String getTransitPointNumber() {
        return transitPointNumber;
    }

    /** 
     * Set the 'TransitPointNumber' element value. ���������� ����� ����� ��������
     * 
     * @param transitPointNumber
     */
    public void setTransitPointNumber(String transitPointNumber) {
        this.transitPointNumber = transitPointNumber;
    }

    /** 
     * Get the 'TransitRoutePlace' element value. ������������ ����� ��������
     * 
     * @return value
     */
    public String getTransitRoutePlace() {
        return transitRoutePlace;
    }

    /** 
     * Set the 'TransitRoutePlace' element value. ������������ ����� ��������
     * 
     * @param transitRoutePlace
     */
    public void setTransitRoutePlace(String transitRoutePlace) {
        this.transitRoutePlace = transitRoutePlace;
    }
}
