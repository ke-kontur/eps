
package ru.acs.fts.schemas.album.pi_rwarrive;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Транспорт(поезд)
 */
public class TrainType
{
    private String trainNumber;
    private String trainIndex;
    private String PPVNumber;
    private LocalDate arrivalDate;
    private List<WagonType> wagonList = new ArrayList<WagonType>();

    /** 
     * Get the 'TrainNumber' element value. Номер поезда
     * 
     * @return value
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /** 
     * Set the 'TrainNumber' element value. Номер поезда
     * 
     * @param trainNumber
     */
    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    /** 
     * Get the 'TrainIndex' element value. Индекс поезда
     * 
     * @return value
     */
    public String getTrainIndex() {
        return trainIndex;
    }

    /** 
     * Set the 'TrainIndex' element value. Индекс поезда
     * 
     * @param trainIndex
     */
    public void setTrainIndex(String trainIndex) {
        this.trainIndex = trainIndex;
    }

    /** 
     * Get the 'PPVNumber' element value. Номер ППВ
     * 
     * @return value
     */
    public String getPPVNumber() {
        return PPVNumber;
    }

    /** 
     * Set the 'PPVNumber' element value. Номер ППВ
     * 
     * @param PPVNumber
     */
    public void setPPVNumber(String PPVNumber) {
        this.PPVNumber = PPVNumber;
    }

    /** 
     * Get the 'ArrivalDate' element value. Ориентировочная дата прибытия
     * 
     * @return value
     */
    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    /** 
     * Set the 'ArrivalDate' element value. Ориентировочная дата прибытия
     * 
     * @param arrivalDate
     */
    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /** 
     * Get the list of 'Wagon' element items. Вагон
     * 
     * @return list
     */
    public List<WagonType> getWagonList() {
        return wagonList;
    }

    /** 
     * Set the list of 'Wagon' element items. Вагон
     * 
     * @param list
     */
    public void setWagonList(List<WagonType> list) {
        wagonList = list;
    }
}
