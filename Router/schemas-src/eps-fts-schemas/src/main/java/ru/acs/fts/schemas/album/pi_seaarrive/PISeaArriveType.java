
package ru.acs.fts.schemas.album.pi_seaarrive;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Предварительная информация о товарах, перевозимых  водным транспортом
 */
public class PISeaArriveType extends BaseDocType
{
    private String PIURN;
    private String MPOSign;
    private String dangerGoodsSing;
    private ShipDetailsType shipDetails;
    private PassengersType passengers;
    private CrewInfoType crewInfo;
    private List<ConsignmentsType> consignmentList = new ArrayList<ConsignmentsType>();
    private List<StoresType> storeList = new ArrayList<StoresType>();
    private String documentModeID;

    /** 
     * Get the 'PI_URN' element value. Уникальный идентификатор товарной партии. Формат - URN
     * 
     * @return value
     */
    public String getPIURN() {
        return PIURN;
    }

    /** 
     * Set the 'PI_URN' element value. Уникальный идентификатор товарной партии. Формат - URN
     * 
     * @param PIURN
     */
    public void setPIURN(String PIURN) {
        this.PIURN = PIURN;
    }

    /** 
     * Get the 'MPOSign' element value. Признак оформления МПО
     * 
     * @return value
     */
    public String getMPOSign() {
        return MPOSign;
    }

    /** 
     * Set the 'MPOSign' element value. Признак оформления МПО
     * 
     * @param MPOSign
     */
    public void setMPOSign(String MPOSign) {
        this.MPOSign = MPOSign;
    }

    /** 
     * Get the 'DangerGoodsSing' element value. Признак наличия опасных товаров
     * 
     * @return value
     */
    public String getDangerGoodsSing() {
        return dangerGoodsSing;
    }

    /** 
     * Set the 'DangerGoodsSing' element value. Признак наличия опасных товаров
     * 
     * @param dangerGoodsSing
     */
    public void setDangerGoodsSing(String dangerGoodsSing) {
        this.dangerGoodsSing = dangerGoodsSing;
    }

    /** 
     * Get the 'ShipDetails' element value. Реквизиты и характеристики судна
     * 
     * @return value
     */
    public ShipDetailsType getShipDetails() {
        return shipDetails;
    }

    /** 
     * Set the 'ShipDetails' element value. Реквизиты и характеристики судна
     * 
     * @param shipDetails
     */
    public void setShipDetails(ShipDetailsType shipDetails) {
        this.shipDetails = shipDetails;
    }

    /** 
     * Get the 'Passengers' element value. Сведения о пассажирах
     * 
     * @return value
     */
    public PassengersType getPassengers() {
        return passengers;
    }

    /** 
     * Set the 'Passengers' element value. Сведения о пассажирах
     * 
     * @param passengers
     */
    public void setPassengers(PassengersType passengers) {
        this.passengers = passengers;
    }

    /** 
     * Get the 'CrewInfo' element value. Сведения об экипаже
     * 
     * @return value
     */
    public CrewInfoType getCrewInfo() {
        return crewInfo;
    }

    /** 
     * Set the 'CrewInfo' element value. Сведения об экипаже
     * 
     * @param crewInfo
     */
    public void setCrewInfo(CrewInfoType crewInfo) {
        this.crewInfo = crewInfo;
    }

    /** 
     * Get the list of 'Consignments' element items. Перечень товарных партий
     * 
     * @return list
     */
    public List<ConsignmentsType> getConsignmentList() {
        return consignmentList;
    }

    /** 
     * Set the list of 'Consignments' element items. Перечень товарных партий
     * 
     * @param list
     */
    public void setConsignmentList(List<ConsignmentsType> list) {
        consignmentList = list;
    }

    /** 
     * Get the list of 'Stores' element items. Сведения о судовых припасах
     * 
     * @return list
     */
    public List<StoresType> getStoreList() {
        return storeList;
    }

    /** 
     * Set the list of 'Stores' element items. Сведения о судовых припасах
     * 
     * @param list
     */
    public void setStoreList(List<StoresType> list) {
        storeList = list;
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
