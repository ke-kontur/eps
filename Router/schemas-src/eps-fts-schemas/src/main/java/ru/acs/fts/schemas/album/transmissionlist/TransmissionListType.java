
package ru.acs.fts.schemas.album.transmissionlist;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Передаточная ведомость
 */
public class TransmissionListType extends BaseDocType
{
    private LocalDate transmissionDate;
    private String number;
    private String trainIndex;
    private String trainNumber;
    private List<String> UINList = new ArrayList<String>();
    private RailwayStationType directionalRailwayStation;
    private List<ListType> listList = new ArrayList<ListType>();
    private PersonBaseType person;
    private CUCustomsType customs;
    private List<CarriageInfoType> carriageInfoList = new ArrayList<CarriageInfoType>();
    private List<ContainerType> containerList = new ArrayList<ContainerType>();
    private StationType borderStation;
    private String documentModeID;

    /** 
     * Get the 'TransmissionDate' element value. Дата составления ППВ
     * 
     * @return value
     */
    public LocalDate getTransmissionDate() {
        return transmissionDate;
    }

    /** 
     * Set the 'TransmissionDate' element value. Дата составления ППВ
     * 
     * @param transmissionDate
     */
    public void setTransmissionDate(LocalDate transmissionDate) {
        this.transmissionDate = transmissionDate;
    }

    /** 
     * Get the 'Number' element value. Номер ППВ
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер ППВ
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
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
     * Get the list of 'UIN' element items. Регистрационный идентификатор предварительной информации
     * 
     * @return list
     */
    public List<String> getUINList() {
        return UINList;
    }

    /** 
     * Set the list of 'UIN' element items. Регистрационный идентификатор предварительной информации
     * 
     * @param list
     */
    public void setUINList(List<String> list) {
        UINList = list;
    }

    /** 
     * Get the 'DirectionalRailwayStation' element value. Передающая груз ж.д. станция
     * 
     * @return value
     */
    public RailwayStationType getDirectionalRailwayStation() {
        return directionalRailwayStation;
    }

    /** 
     * Set the 'DirectionalRailwayStation' element value. Передающая груз ж.д. станция
     * 
     * @param directionalRailwayStation
     */
    public void setDirectionalRailwayStation(
            RailwayStationType directionalRailwayStation) {
        this.directionalRailwayStation = directionalRailwayStation;
    }

    /** 
     * Get the list of 'List' element items. Перечень грузов
     * 
     * @return list
     */
    public List<ListType> getListList() {
        return listList;
    }

    /** 
     * Set the list of 'List' element items. Перечень грузов
     * 
     * @param list
     */
    public void setListList(List<ListType> list) {
        listList = list;
    }

    /** 
     * Get the 'Person' element value. Лицо, сдавшее перечисленные в настоящей ведомости грузы, накладные и акты
     * 
     * @return value
     */
    public PersonBaseType getPerson() {
        return person;
    }

    /** 
     * Set the 'Person' element value. Лицо, сдавшее перечисленные в настоящей ведомости грузы, накладные и акты
     * 
     * @param person
     */
    public void setPerson(PersonBaseType person) {
        this.person = person;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the list of 'CarriageInfo' element items. Сведения о вагонах
     * 
     * @return list
     */
    public List<CarriageInfoType> getCarriageInfoList() {
        return carriageInfoList;
    }

    /** 
     * Set the list of 'CarriageInfo' element items. Сведения о вагонах
     * 
     * @param list
     */
    public void setCarriageInfoList(List<CarriageInfoType> list) {
        carriageInfoList = list;
    }

    /** 
     * Get the list of 'Container' element items. Сведения о контейнерах
     * 
     * @return list
     */
    public List<ContainerType> getContainerList() {
        return containerList;
    }

    /** 
     * Set the list of 'Container' element items. Сведения о контейнерах
     * 
     * @param list
     */
    public void setContainerList(List<ContainerType> list) {
        containerList = list;
    }

    /** 
     * Get the 'BorderStation' element value. Пограничный пост
     * 
     * @return value
     */
    public StationType getBorderStation() {
        return borderStation;
    }

    /** 
     * Set the 'BorderStation' element value. Пограничный пост
     * 
     * @param borderStation
     */
    public void setBorderStation(StationType borderStation) {
        this.borderStation = borderStation;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
