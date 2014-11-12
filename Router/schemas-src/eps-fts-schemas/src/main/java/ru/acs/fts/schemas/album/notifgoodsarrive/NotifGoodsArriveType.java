
package ru.acs.fts.schemas.album.notifgoodsarrive;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.GoodsLoadingPlaceType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHOrganizationBaseType;

/** 
 * ����������� � �������� �������� ������
 */
public class NotifGoodsArriveType extends BaseDocType
{
    private LocalDate notifDate;
    private String notifTime;
    private CustomsType customs;
    private WHOrganizationBaseType declarant;
    private GoodsLoadingPlaceType goodsLoadingPlace;
    private ArriveShipmentType arriveShipment;
    private GTDIDType GTDNumber;
    private String documentModeID;

    /** 
     * Get the 'NotifDate' element value. ���� �����������
     * 
     * @return value
     */
    public LocalDate getNotifDate() {
        return notifDate;
    }

    /** 
     * Set the 'NotifDate' element value. ���� �����������
     * 
     * @param notifDate
     */
    public void setNotifDate(LocalDate notifDate) {
        this.notifDate = notifDate;
    }

    /** 
     * Get the 'NotifTime' element value. ����� ����������� �����������
     * 
     * @return value
     */
    public String getNotifTime() {
        return notifTime;
    }

    /** 
     * Set the 'NotifTime' element value. ����� ����������� �����������
     * 
     * @param notifTime
     */
    public void setNotifTime(String notifTime) {
        this.notifTime = notifTime;
    }

    /** 
     * Get the 'Customs' element value. ��� � ������������ ����������� ������ � ������� �������� �����������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ��� � ������������ ����������� ������ � ������� �������� �����������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Declarant' element value. �������� � ����������
     * 
     * @return value
     */
    public WHOrganizationBaseType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. �������� � ����������
     * 
     * @param declarant
     */
    public void setDeclarant(WHOrganizationBaseType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'GoodsLoadingPlace' element value. ��������������� �������
     * 
     * @return value
     */
    public GoodsLoadingPlaceType getGoodsLoadingPlace() {
        return goodsLoadingPlace;
    }

    /** 
     * Set the 'GoodsLoadingPlace' element value. ��������������� �������
     * 
     * @param goodsLoadingPlace
     */
    public void setGoodsLoadingPlace(GoodsLoadingPlaceType goodsLoadingPlace) {
        this.goodsLoadingPlace = goodsLoadingPlace;
    }

    /** 
     * Get the 'ArriveShipment' element value. �������� � �������� ������
     * 
     * @return value
     */
    public ArriveShipmentType getArriveShipment() {
        return arriveShipment;
    }

    /** 
     * Set the 'ArriveShipment' element value. �������� � �������� ������
     * 
     * @param arriveShipment
     */
    public void setArriveShipment(ArriveShipmentType arriveShipment) {
        this.arriveShipment = arriveShipment;
    }

    /** 
     * Get the 'GTDNumber' element value. ��������������� ����� ��
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ��������������� ����� ��
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
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
