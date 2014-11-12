
package ru.acs.fts.schemas.album.goodsoperationrequest;

import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AWBNumberType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.FlightInfoType;

/** 
 * Сведения об операциях с грузом по накладной
 */
public class WayBillOperationType
{
    private String operation;
    private String reasons;
    private FlightInfoType newFlightInfo;
    private AWBNumberType wayBillNumber;

    /** 
     * Get the 'Operation' element value. Операция с грузом: 1 - выгрузка; 2 - перегрузка (перевалка); 3 - погрузка; 4 - отсутствие операций с грузом
     * 
     * @return value
     */
    public String getOperation() {
        return operation;
    }

    /** 
     * Set the 'Operation' element value. Операция с грузом: 1 - выгрузка; 2 - перегрузка (перевалка); 3 - погрузка; 4 - отсутствие операций с грузом
     * 
     * @param operation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /** 
     * Get the 'Reasons' element value. Основание
     * 
     * @return value
     */
    public String getReasons() {
        return reasons;
    }

    /** 
     * Set the 'Reasons' element value. Основание
     * 
     * @param reasons
     */
    public void setReasons(String reasons) {
        this.reasons = reasons;
    }

    /** 
     * Get the 'NewFlightInfo' element value. Сведения о новом рейсе
     * 
     * @return value
     */
    public FlightInfoType getNewFlightInfo() {
        return newFlightInfo;
    }

    /** 
     * Set the 'NewFlightInfo' element value. Сведения о новом рейсе
     * 
     * @param newFlightInfo
     */
    public void setNewFlightInfo(FlightInfoType newFlightInfo) {
        this.newFlightInfo = newFlightInfo;
    }

    /** 
     * Get the 'WayBillNumber' element value. Номер накладной
     * 
     * @return value
     */
    public AWBNumberType getWayBillNumber() {
        return wayBillNumber;
    }

    /** 
     * Set the 'WayBillNumber' element value. Номер накладной
     * 
     * @param wayBillNumber
     */
    public void setWayBillNumber(AWBNumberType wayBillNumber) {
        this.wayBillNumber = wayBillNumber;
    }
}
