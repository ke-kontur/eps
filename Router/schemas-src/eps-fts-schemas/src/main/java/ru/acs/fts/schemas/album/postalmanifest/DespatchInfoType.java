
package ru.acs.fts.schemas.album.postalmanifest;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о почтовом отправлении
 */
public class DespatchInfoType
{
    private String despatchNumber;
    private String filingAgency;
    private String destinationAgency;
    private List<String> commentList = new ArrayList<String>();
    private DespatchMeasuresType emptyContainers;
    private DespatchMeasuresType writtenCorrespondence;
    private DespatchMeasuresType uncapacityParcels;
    private DespatchMeasuresType EMS;

    /** 
     * Get the 'DespatchNumber' element value. Номер депеши
     * 
     * @return value
     */
    public String getDespatchNumber() {
        return despatchNumber;
    }

    /** 
     * Set the 'DespatchNumber' element value. Номер депеши
     * 
     * @param despatchNumber
     */
    public void setDespatchNumber(String despatchNumber) {
        this.despatchNumber = despatchNumber;
    }

    /** 
     * Get the 'FilingAgency' element value. Учреждение подачи
     * 
     * @return value
     */
    public String getFilingAgency() {
        return filingAgency;
    }

    /** 
     * Set the 'FilingAgency' element value. Учреждение подачи
     * 
     * @param filingAgency
     */
    public void setFilingAgency(String filingAgency) {
        this.filingAgency = filingAgency;
    }

    /** 
     * Get the 'DestinationAgency' element value. Учреждение назначения
     * 
     * @return value
     */
    public String getDestinationAgency() {
        return destinationAgency;
    }

    /** 
     * Set the 'DestinationAgency' element value. Учреждение назначения
     * 
     * @param destinationAgency
     */
    public void setDestinationAgency(String destinationAgency) {
        this.destinationAgency = destinationAgency;
    }

    /** 
     * Get the list of 'Comments' element items. Примечания
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comments' element items. Примечания
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }

    /** 
     * Get the 'EmptyContainers' element value. Сведения о количественных показателях порожних мешков и других возвращаемых порожних емкостей
     * 
     * @return value
     */
    public DespatchMeasuresType getEmptyContainers() {
        return emptyContainers;
    }

    /** 
     * Set the 'EmptyContainers' element value. Сведения о количественных показателях порожних мешков и других возвращаемых порожних емкостей
     * 
     * @param emptyContainers
     */
    public void setEmptyContainers(DespatchMeasuresType emptyContainers) {
        this.emptyContainers = emptyContainers;
    }

    /** 
     * Get the 'WrittenCorrespondence' element value. Сведения о количественных показателях письменной корреспонденции
     * 
     * @return value
     */
    public DespatchMeasuresType getWrittenCorrespondence() {
        return writtenCorrespondence;
    }

    /** 
     * Set the 'WrittenCorrespondence' element value. Сведения о количественных показателях письменной корреспонденции
     * 
     * @param writtenCorrespondence
     */
    public void setWrittenCorrespondence(
            DespatchMeasuresType writtenCorrespondence) {
        this.writtenCorrespondence = writtenCorrespondence;
    }

    /** 
     * Get the 'UncapacityParcels' element value. Сведения о количественных показателях СР 
     * 
     * @return value
     */
    public DespatchMeasuresType getUncapacityParcels() {
        return uncapacityParcels;
    }

    /** 
     * Set the 'UncapacityParcels' element value. Сведения о количественных показателях СР 
     * 
     * @param uncapacityParcels
     */
    public void setUncapacityParcels(DespatchMeasuresType uncapacityParcels) {
        this.uncapacityParcels = uncapacityParcels;
    }

    /** 
     * Get the 'EMS' element value. Сведения о количественных показателях EMS
     * 
     * @return value
     */
    public DespatchMeasuresType getEMS() {
        return EMS;
    }

    /** 
     * Set the 'EMS' element value. Сведения о количественных показателях EMS
     * 
     * @param EMS
     */
    public void setEMS(DespatchMeasuresType EMS) {
        this.EMS = EMS;
    }
}
