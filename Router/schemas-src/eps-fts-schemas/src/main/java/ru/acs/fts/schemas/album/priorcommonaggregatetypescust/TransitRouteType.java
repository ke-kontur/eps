
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

/** 
 * Маршрут транзита
 */
public class TransitRouteType
{
    private String transitPointNumber;
    private String transitRoutePlace;

    /** 
     * Get the 'TransitPointNumber' element value. Порядковый номер точки транзита
     * 
     * @return value
     */
    public String getTransitPointNumber() {
        return transitPointNumber;
    }

    /** 
     * Set the 'TransitPointNumber' element value. Порядковый номер точки транзита
     * 
     * @param transitPointNumber
     */
    public void setTransitPointNumber(String transitPointNumber) {
        this.transitPointNumber = transitPointNumber;
    }

    /** 
     * Get the 'TransitRoutePlace' element value. Наименование точки маршрута
     * 
     * @return value
     */
    public String getTransitRoutePlace() {
        return transitRoutePlace;
    }

    /** 
     * Set the 'TransitRoutePlace' element value. Наименование точки маршрута
     * 
     * @param transitRoutePlace
     */
    public void setTransitRoutePlace(String transitRoutePlace) {
        this.transitRoutePlace = transitRoutePlace;
    }
}
