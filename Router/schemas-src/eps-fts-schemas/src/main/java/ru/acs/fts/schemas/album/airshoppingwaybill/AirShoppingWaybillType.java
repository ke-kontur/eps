
package ru.acs.fts.schemas.album.airshoppingwaybill;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������-������������ ��������� �������� �� ����� ��
 */
public class AirShoppingWaybillType extends BaseDocType
{
    private String regNumberWaybill;
    private List<RateListCurrencyType> rateListCurrencyList = new ArrayList<RateListCurrencyType>();
    private List<ContainerInfoType> containerInfoList = new ArrayList<ContainerInfoType>();
    private OrganizationBaseType carrier;
    private GoodsMovementType goodsMovement;
    private PersonScheduledNumberType person;
    private GoodsInfoType goodsInfo;
    private CommentsType comments;
    private CheckingItemFightingDamageType checkingItemFightingDamage;
    private String documentModeID;

    /** 
     * Get the 'RegNumberWaybill' element value. ��������������� ����� ��������� ��������
     * 
     * @return value
     */
    public String getRegNumberWaybill() {
        return regNumberWaybill;
    }

    /** 
     * Set the 'RegNumberWaybill' element value. ��������������� ����� ��������� ��������
     * 
     * @param regNumberWaybill
     */
    public void setRegNumberWaybill(String regNumberWaybill) {
        this.regNumberWaybill = regNumberWaybill;
    }

    /** 
     * Get the list of 'RateListCurrency' element items. ������ ������ �����
     * 
     * @return list
     */
    public List<RateListCurrencyType> getRateListCurrencyList() {
        return rateListCurrencyList;
    }

    /** 
     * Set the list of 'RateListCurrency' element items. ������ ������ �����
     * 
     * @param list
     */
    public void setRateListCurrencyList(List<RateListCurrencyType> list) {
        rateListCurrencyList = list;
    }

    /** 
     * Get the list of 'ContainerInfo' element items. �������� � ����������
     * 
     * @return list
     */
    public List<ContainerInfoType> getContainerInfoList() {
        return containerInfoList;
    }

    /** 
     * Set the list of 'ContainerInfo' element items. �������� � ����������
     * 
     * @param list
     */
    public void setContainerInfoList(List<ContainerInfoType> list) {
        containerInfoList = list;
    }

    /** 
     * Get the 'Carrier' element value. �������� � �����������
     * 
     * @return value
     */
    public OrganizationBaseType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. �������� � �����������
     * 
     * @param carrier
     */
    public void setCarrier(OrganizationBaseType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'GoodsMovement' element value. �������� ����������� ������
     * 
     * @return value
     */
    public GoodsMovementType getGoodsMovement() {
        return goodsMovement;
    }

    /** 
     * Set the 'GoodsMovement' element value. �������� ����������� ������
     * 
     * @param goodsMovement
     */
    public void setGoodsMovement(GoodsMovementType goodsMovement) {
        this.goodsMovement = goodsMovement;
    }

    /** 
     * Get the 'Person' element value. ��������  � ���� ������������ ���������
     * 
     * @return value
     */
    public PersonScheduledNumberType getPerson() {
        return person;
    }

    /** 
     * Set the 'Person' element value. ��������  � ���� ������������ ���������
     * 
     * @param person
     */
    public void setPerson(PersonScheduledNumberType person) {
        this.person = person;
    }

    /** 
     * Get the 'GoodsInfo' element value. �������� � ������
     * 
     * @return value
     */
    public GoodsInfoType getGoodsInfo() {
        return goodsInfo;
    }

    /** 
     * Set the 'GoodsInfo' element value. �������� � ������
     * 
     * @param goodsInfo
     */
    public void setGoodsInfo(GoodsInfoType goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    /** 
     * Get the 'Comments' element value. ����������
     * 
     * @return value
     */
    public CommentsType getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. ����������
     * 
     * @param comments
     */
    public void setComments(CommentsType comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'CheckingItemFightingDamage' element value. �������� �� ������� ��� � �����
     * 
     * @return value
     */
    public CheckingItemFightingDamageType getCheckingItemFightingDamage() {
        return checkingItemFightingDamage;
    }

    /** 
     * Set the 'CheckingItemFightingDamage' element value. �������� �� ������� ��� � �����
     * 
     * @param checkingItemFightingDamage
     */
    public void setCheckingItemFightingDamage(
            CheckingItemFightingDamageType checkingItemFightingDamage) {
        this.checkingItemFightingDamage = checkingItemFightingDamage;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
