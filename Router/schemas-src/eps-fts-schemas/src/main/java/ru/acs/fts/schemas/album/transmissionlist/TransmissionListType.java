
package ru.acs.fts.schemas.album.transmissionlist;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ������������ ���������
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
     * Get the 'TransmissionDate' element value. ���� ����������� ���
     * 
     * @return value
     */
    public LocalDate getTransmissionDate() {
        return transmissionDate;
    }

    /** 
     * Set the 'TransmissionDate' element value. ���� ����������� ���
     * 
     * @param transmissionDate
     */
    public void setTransmissionDate(LocalDate transmissionDate) {
        this.transmissionDate = transmissionDate;
    }

    /** 
     * Get the 'Number' element value. ����� ���
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. ����� ���
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
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
     * Get the list of 'UIN' element items. ��������������� ������������� ��������������� ����������
     * 
     * @return list
     */
    public List<String> getUINList() {
        return UINList;
    }

    /** 
     * Set the list of 'UIN' element items. ��������������� ������������� ��������������� ����������
     * 
     * @param list
     */
    public void setUINList(List<String> list) {
        UINList = list;
    }

    /** 
     * Get the 'DirectionalRailwayStation' element value. ���������� ���� �.�. �������
     * 
     * @return value
     */
    public RailwayStationType getDirectionalRailwayStation() {
        return directionalRailwayStation;
    }

    /** 
     * Set the 'DirectionalRailwayStation' element value. ���������� ���� �.�. �������
     * 
     * @param directionalRailwayStation
     */
    public void setDirectionalRailwayStation(
            RailwayStationType directionalRailwayStation) {
        this.directionalRailwayStation = directionalRailwayStation;
    }

    /** 
     * Get the list of 'List' element items. �������� ������
     * 
     * @return list
     */
    public List<ListType> getListList() {
        return listList;
    }

    /** 
     * Set the list of 'List' element items. �������� ������
     * 
     * @param list
     */
    public void setListList(List<ListType> list) {
        listList = list;
    }

    /** 
     * Get the 'Person' element value. ����, ������� ������������� � ��������� ��������� �����, ��������� � ����
     * 
     * @return value
     */
    public PersonBaseType getPerson() {
        return person;
    }

    /** 
     * Set the 'Person' element value. ����, ������� ������������� � ��������� ��������� �����, ��������� � ����
     * 
     * @param person
     */
    public void setPerson(PersonBaseType person) {
        this.person = person;
    }

    /** 
     * Get the 'Customs' element value. �������� � ���������� ������
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. �������� � ���������� ������
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the list of 'CarriageInfo' element items. �������� � �������
     * 
     * @return list
     */
    public List<CarriageInfoType> getCarriageInfoList() {
        return carriageInfoList;
    }

    /** 
     * Set the list of 'CarriageInfo' element items. �������� � �������
     * 
     * @param list
     */
    public void setCarriageInfoList(List<CarriageInfoType> list) {
        carriageInfoList = list;
    }

    /** 
     * Get the list of 'Container' element items. �������� � �����������
     * 
     * @return list
     */
    public List<ContainerType> getContainerList() {
        return containerList;
    }

    /** 
     * Set the list of 'Container' element items. �������� � �����������
     * 
     * @param list
     */
    public void setContainerList(List<ContainerType> list) {
        containerList = list;
    }

    /** 
     * Get the 'BorderStation' element value. ����������� ����
     * 
     * @return value
     */
    public StationType getBorderStation() {
        return borderStation;
    }

    /** 
     * Set the 'BorderStation' element value. ����������� ����
     * 
     * @param borderStation
     */
    public void setBorderStation(StationType borderStation) {
        this.borderStation = borderStation;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
