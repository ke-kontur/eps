
package ru.acs.fts.schemas.album.pi_rwarrive;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * ���������(�����)
 */
public class TrainType
{
    private String trainNumber;
    private String trainIndex;
    private String PPVNumber;
    private LocalDate arrivalDate;
    private List<WagonType> wagonList = new ArrayList<WagonType>();

    /** 
     * Get the 'TrainNumber' element value. ����� ������
     * 
     * @return value
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /** 
     * Set the 'TrainNumber' element value. ����� ������
     * 
     * @param trainNumber
     */
    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    /** 
     * Get the 'TrainIndex' element value. ������ ������
     * 
     * @return value
     */
    public String getTrainIndex() {
        return trainIndex;
    }

    /** 
     * Set the 'TrainIndex' element value. ������ ������
     * 
     * @param trainIndex
     */
    public void setTrainIndex(String trainIndex) {
        this.trainIndex = trainIndex;
    }

    /** 
     * Get the 'PPVNumber' element value. ����� ���
     * 
     * @return value
     */
    public String getPPVNumber() {
        return PPVNumber;
    }

    /** 
     * Set the 'PPVNumber' element value. ����� ���
     * 
     * @param PPVNumber
     */
    public void setPPVNumber(String PPVNumber) {
        this.PPVNumber = PPVNumber;
    }

    /** 
     * Get the 'ArrivalDate' element value. ��������������� ���� ��������
     * 
     * @return value
     */
    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    /** 
     * Set the 'ArrivalDate' element value. ��������������� ���� ��������
     * 
     * @param arrivalDate
     */
    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /** 
     * Get the list of 'Wagon' element items. �����
     * 
     * @return list
     */
    public List<WagonType> getWagonList() {
        return wagonList;
    }

    /** 
     * Set the list of 'Wagon' element items. �����
     * 
     * @param list
     */
    public void setWagonList(List<WagonType> list) {
        wagonList = list;
    }
}
