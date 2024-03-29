
package ru.acs.fts.schemas.album.notifgoodspresent;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ���������� � ��������������� �������/����������� � �������������� �������
 */
public class NotifGoodsPresentType extends BaseDocType
{
    private LocalDate notifDate;
    private String notifTime;
    private String docSign;
    private CustomsType customs;
    private PersonBaseType personBase;
    private GTDIDType GTDID;
    private GoodsLocationType goodsLocation;
    private String documentModeID;

    /** 
     * Get the 'NotifDate' element value. ���� ������������ �����������
     * 
     * @return value
     */
    public LocalDate getNotifDate() {
        return notifDate;
    }

    /** 
     * Set the 'NotifDate' element value. ���� ������������ �����������
     * 
     * @param notifDate
     */
    public void setNotifDate(LocalDate notifDate) {
        this.notifDate = notifDate;
    }

    /** 
     * Get the 'NotifTime' element value. ����� ������������ �����������
     * 
     * @return value
     */
    public String getNotifTime() {
        return notifTime;
    }

    /** 
     * Set the 'NotifTime' element value. ����� ������������ �����������
     * 
     * @param notifTime
     */
    public void setNotifTime(String notifTime) {
        this.notifTime = notifTime;
    }

    /** 
     * Get the 'DocSign' element value. ������� ���������: 0 - ���������� � ��������������� �������; 1- ����������� � �������������� �������
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ���������: 0 - ���������� � ��������������� �������; 1- ����������� � �������������� �������
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
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
     * Get the 'PersonBase' element value. ��� ����������
     * 
     * @return value
     */
    public PersonBaseType getPersonBase() {
        return personBase;
    }

    /** 
     * Set the 'PersonBase' element value. ��� ����������
     * 
     * @param personBase
     */
    public void setPersonBase(PersonBaseType personBase) {
        this.personBase = personBase;
    }

    /** 
     * Get the 'GTDID' element value. ����� ��
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. ����� ��
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'GoodsLocation' element value. ��������������� ������
     * 
     * @return value
     */
    public GoodsLocationType getGoodsLocation() {
        return goodsLocation;
    }

    /** 
     * Set the 'GoodsLocation' element value. ��������������� ������
     * 
     * @param goodsLocation
     */
    public void setGoodsLocation(GoodsLocationType goodsLocation) {
        this.goodsLocation = goodsLocation;
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
