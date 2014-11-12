
package ru.acs.fts.schemas.album.goodsdeclaration;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Данные декларации на товары
 */
public class GoodsDeclarationType extends BaseDocType
{
    private GTDIDType GTDID;
    private OrganizationType consignee;
    private OrganizationType consigner;
    private List<GoodsListType> goodsList = new ArrayList<GoodsListType>();
    private CUCustomsType customs;
    private RailwayStationType departureStation;
    private RailwayStationType destinationStation;
    private RailwayStationType borderStation;
    private String documentModeID;

    /** 
     * Get the 'GTDID' element value. Регистрационный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Регистрационный номер ДТ
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'Consignee' element value. Грузополучатель
     * 
     * @return value
     */
    public OrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Грузополучатель
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Consigner' element value. Грузоотправитель
     * 
     * @return value
     */
    public OrganizationType getConsigner() {
        return consigner;
    }

    /** 
     * Set the 'Consigner' element value. Грузоотправитель
     * 
     * @param consigner
     */
    public void setConsigner(OrganizationType consigner) {
        this.consigner = consigner;
    }

    /** 
     * Get the list of 'GoodsList' element items. Сведения о товаре
     * 
     * @return list
     */
    public List<GoodsListType> getGoodsList() {
        return goodsList;
    }

    /** 
     * Set the list of 'GoodsList' element items. Сведения о товаре
     * 
     * @param list
     */
    public void setGoodsList(List<GoodsListType> list) {
        goodsList = list;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе  убытия
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе  убытия
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
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
     * Get the 'BorderStation' element value. Пограничная станция
     * 
     * @return value
     */
    public RailwayStationType getBorderStation() {
        return borderStation;
    }

    /** 
     * Set the 'BorderStation' element value. Пограничная станция
     * 
     * @param borderStation
     */
    public void setBorderStation(RailwayStationType borderStation) {
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
