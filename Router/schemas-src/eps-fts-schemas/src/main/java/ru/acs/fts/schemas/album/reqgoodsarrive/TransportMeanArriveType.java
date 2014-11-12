
package ru.acs.fts.schemas.album.reqgoodsarrive;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Описание транспортного средства
 */
public class TransportMeanArriveType extends TransportMeansBaseType
{
    private String transportMeanArriveFlag;
    private LocalDate date;
    private String note;

    /** 
     * Get the 'TransportMeanArriveFlag' element value. Индикатор нахождения транспортного средства в зоне таможенного контроля
     * 
     * @return value
     */
    public String getTransportMeanArriveFlag() {
        return transportMeanArriveFlag;
    }

    /** 
     * Set the 'TransportMeanArriveFlag' element value. Индикатор нахождения транспортного средства в зоне таможенного контроля
     * 
     * @param transportMeanArriveFlag
     */
    public void setTransportMeanArriveFlag(String transportMeanArriveFlag) {
        this.transportMeanArriveFlag = transportMeanArriveFlag;
    }

    /** 
     * Get the 'Date' element value. Дата пересечения таможенной границы
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата пересечения таможенной границы
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Note' element value. Примечание
     * 
     * @return value
     */
    public String getNote() {
        return note;
    }

    /** 
     * Set the 'Note' element value. Примечание
     * 
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }
}
