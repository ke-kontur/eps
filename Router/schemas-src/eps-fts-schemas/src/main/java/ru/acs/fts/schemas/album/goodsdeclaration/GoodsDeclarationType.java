
package ru.acs.fts.schemas.album.goodsdeclaration;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ������ ���������� �� ������
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
     * Get the 'GTDID' element value. ��������������� ����� ��
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. ��������������� ����� ��
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'Consignee' element value. ���������������
     * 
     * @return value
     */
    public OrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ���������������
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Consigner' element value. ����������������
     * 
     * @return value
     */
    public OrganizationType getConsigner() {
        return consigner;
    }

    /** 
     * Set the 'Consigner' element value. ����������������
     * 
     * @param consigner
     */
    public void setConsigner(OrganizationType consigner) {
        this.consigner = consigner;
    }

    /** 
     * Get the list of 'GoodsList' element items. �������� � ������
     * 
     * @return list
     */
    public List<GoodsListType> getGoodsList() {
        return goodsList;
    }

    /** 
     * Set the list of 'GoodsList' element items. �������� � ������
     * 
     * @param list
     */
    public void setGoodsList(List<GoodsListType> list) {
        goodsList = list;
    }

    /** 
     * Get the 'Customs' element value. �������� � ���������� ������  ������
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. �������� � ���������� ������  ������
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'DepartureStation' element value. ������� �����������
     * 
     * @return value
     */
    public RailwayStationType getDepartureStation() {
        return departureStation;
    }

    /** 
     * Set the 'DepartureStation' element value. ������� �����������
     * 
     * @param departureStation
     */
    public void setDepartureStation(RailwayStationType departureStation) {
        this.departureStation = departureStation;
    }

    /** 
     * Get the 'DestinationStation' element value. ������� ����������
     * 
     * @return value
     */
    public RailwayStationType getDestinationStation() {
        return destinationStation;
    }

    /** 
     * Set the 'DestinationStation' element value. ������� ����������
     * 
     * @param destinationStation
     */
    public void setDestinationStation(RailwayStationType destinationStation) {
        this.destinationStation = destinationStation;
    }

    /** 
     * Get the 'BorderStation' element value. ����������� �������
     * 
     * @return value
     */
    public RailwayStationType getBorderStation() {
        return borderStation;
    }

    /** 
     * Set the 'BorderStation' element value. ����������� �������
     * 
     * @param borderStation
     */
    public void setBorderStation(RailwayStationType borderStation) {
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
