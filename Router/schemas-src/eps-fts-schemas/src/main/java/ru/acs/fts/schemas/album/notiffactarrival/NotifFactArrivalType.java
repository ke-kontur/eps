
package ru.acs.fts.schemas.album.notiffactarrival;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Уведомление о фактической подаче железнодорожного состава на ЖДПП
 */
public class NotifFactArrivalType extends BaseDocType
{
    private String documentSign;
    private String URN;
    private LocalDate notifDate;
    private CUCustomsType customs;
    private RailwayStationType destinationStation;
    private RailwayStationType departureStation;
    private List<TransportMeansBaseType> transportList = new ArrayList<TransportMeansBaseType>();
    private List<SealType> sealList = new ArrayList<SealType>();
    private GTDIDType TD;
    private String documentModeID;

    /** 
     * Get the 'DocumentSign' element value. Признак документа: 0 - уведомление об убытии; 1 - уведомление о прибытии
     * 
     * @return value
     */
    public String getDocumentSign() {
        return documentSign;
    }

    /** 
     * Set the 'DocumentSign' element value. Признак документа: 0 - уведомление об убытии; 1 - уведомление о прибытии
     * 
     * @param documentSign
     */
    public void setDocumentSign(String documentSign) {
        this.documentSign = documentSign;
    }

    /** 
     * Get the 'URN' element value. Уникальный идентификационный номер пакета электронных документов
     * 
     * @return value
     */
    public String getURN() {
        return URN;
    }

    /** 
     * Set the 'URN' element value. Уникальный идентификационный номер пакета электронных документов
     * 
     * @param URN
     */
    public void setURN(String URN) {
        this.URN = URN;
    }

    /** 
     * Get the 'NotifDate' element value. Дата прибытия/убытия железнодорожного состава
     * 
     * @return value
     */
    public LocalDate getNotifDate() {
        return notifDate;
    }

    /** 
     * Set the 'NotifDate' element value. Дата прибытия/убытия железнодорожного состава
     * 
     * @param notifDate
     */
    public void setNotifDate(LocalDate notifDate) {
        this.notifDate = notifDate;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе убытия/прибытия
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе убытия/прибытия
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'DestinationStation' element value. Станция назначения
     * 
     * @return value
     */
    public RailwayStationType getDestinationStation() {
        return destinationStation;
    }

    /** 
     * Set the 'DestinationStation' element value. Станция назначения
     * 
     * @param destinationStation
     */
    public void setDestinationStation(RailwayStationType destinationStation) {
        this.destinationStation = destinationStation;
    }

    /** 
     * Get the 'DepartureStation' element value. Станция отправления
     * 
     * @return value
     */
    public RailwayStationType getDepartureStation() {
        return departureStation;
    }

    /** 
     * Set the 'DepartureStation' element value. Станция отправления
     * 
     * @param departureStation
     */
    public void setDepartureStation(RailwayStationType departureStation) {
        this.departureStation = departureStation;
    }

    /** 
     * Get the list of 'Transport' element items. Сведения о транспортных средствах
     * 
     * @return list
     */
    public List<TransportMeansBaseType> getTransportList() {
        return transportList;
    }

    /** 
     * Set the list of 'Transport' element items. Сведения о транспортных средствах
     * 
     * @param list
     */
    public void setTransportList(List<TransportMeansBaseType> list) {
        transportList = list;
    }

    /** 
     * Get the list of 'Seal' element items. Сведения о средствах идентификации
     * 
     * @return list
     */
    public List<SealType> getSealList() {
        return sealList;
    }

    /** 
     * Set the list of 'Seal' element items. Сведения о средствах идентификации
     * 
     * @param list
     */
    public void setSealList(List<SealType> list) {
        sealList = list;
    }

    /** 
     * Get the 'TD' element value. Номер транзитной декларации
     * 
     * @return value
     */
    public GTDIDType getTD() {
        return TD;
    }

    /** 
     * Set the 'TD' element value. Номер транзитной декларации
     * 
     * @param TD
     */
    public void setTD(GTDIDType TD) {
        this.TD = TD;
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
