
package ru.acs.fts.schemas.album.goodsarrivereport;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * ���������� � �������� �������
 */
public class GoodsArriveReportType extends BaseDocType
{
    private LocalDate reqDate;
    private String reqTime;
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private List<TransportMeanArriveType> transportMeanArriveList = new ArrayList<TransportMeanArriveType>();
    private String documentModeID;

    /** 
     * Get the 'ReqDate' element value. ���� ������������ �������
     * 
     * @return value
     */
    public LocalDate getReqDate() {
        return reqDate;
    }

    /** 
     * Set the 'ReqDate' element value. ���� ������������ �������
     * 
     * @param reqDate
     */
    public void setReqDate(LocalDate reqDate) {
        this.reqDate = reqDate;
    }

    /** 
     * Get the 'ReqTime' element value. ����� ������������ �������
     * 
     * @return value
     */
    public String getReqTime() {
        return reqTime;
    }

    /** 
     * Set the 'ReqTime' element value. ����� ������������ �������
     * 
     * @param reqTime
     */
    public void setReqTime(String reqTime) {
        this.reqTime = reqTime;
    }

    /** 
     * Get the 'Customs' element value. ��� � ������������ ����������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ��� � ������������ ����������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. �������� � �������
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. �������� � �������
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
    }

    /** 
     * Get the list of 'TransportMeanArrive' element items. �������� ������������� ��������
     * 
     * @return list
     */
    public List<TransportMeanArriveType> getTransportMeanArriveList() {
        return transportMeanArriveList;
    }

    /** 
     * Set the list of 'TransportMeanArrive' element items. �������� ������������� ��������
     * 
     * @param list
     */
    public void setTransportMeanArriveList(List<TransportMeanArriveType> list) {
        transportMeanArriveList = list;
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
