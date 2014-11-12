
package ru.acs.fts.schemas.album.ownershiptransferdoc;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������� � ����������, �������������� �������� ���� �� ������� ���������������� �������������.
 */
public class OwnershipTransferDocType extends BaseDocType
{
    private String regCertifNum;
    private LocalDate regExpiretionDate;
    private String movementDirection;
    private List<String> descriptionList = new ArrayList<String>();
    private String transportationMethod;
    private OrganizationBaseType rightHolder;
    private OrganizationBaseType goodsOwner;
    private OwnershipDocInfoType ownershipDocInfo;
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private OrganizationInfoType sender;
    private OrganizationInfoType recipient;
    private String documentModeID;

    /** 
     * Get the 'RegCertifNum' element value. ����� ������������� � ����������� ������� ���������������� �������������
     * 
     * @return value
     */
    public String getRegCertifNum() {
        return regCertifNum;
    }

    /** 
     * Set the 'RegCertifNum' element value. ����� ������������� � ����������� ������� ���������������� �������������
     * 
     * @param regCertifNum
     */
    public void setRegCertifNum(String regCertifNum) {
        this.regCertifNum = regCertifNum;
    }

    /** 
     * Get the 'RegExpiretionDate' element value. ���� �������� �����������
     * 
     * @return value
     */
    public LocalDate getRegExpiretionDate() {
        return regExpiretionDate;
    }

    /** 
     * Set the 'RegExpiretionDate' element value. ���� �������� �����������
     * 
     * @param regExpiretionDate
     */
    public void setRegExpiretionDate(LocalDate regExpiretionDate) {
        this.regExpiretionDate = regExpiretionDate;
    }

    /** 
     * Get the 'MovementDirection' element value. ����������� ����������� �� ��������
     * 
     * @return value
     */
    public String getMovementDirection() {
        return movementDirection;
    }

    /** 
     * Set the 'MovementDirection' element value. ����������� ����������� �� ��������
     * 
     * @param movementDirection
     */
    public void setMovementDirection(String movementDirection) {
        this.movementDirection = movementDirection;
    }

    /** 
     * Get the list of 'Description' element items. ��������
     * 
     * @return list
     */
    public List<String> getDescriptionList() {
        return descriptionList;
    }

    /** 
     * Set the list of 'Description' element items. ��������
     * 
     * @param list
     */
    public void setDescriptionList(List<String> list) {
        descriptionList = list;
    }

    /** 
     * Get the 'TransportationMethod' element value. ������ ��������������� �� ��������
     * 
     * @return value
     */
    public String getTransportationMethod() {
        return transportationMethod;
    }

    /** 
     * Set the 'TransportationMethod' element value. ������ ��������������� �� ��������
     * 
     * @param transportationMethod
     */
    public void setTransportationMethod(String transportationMethod) {
        this.transportationMethod = transportationMethod;
    }

    /** 
     * Get the 'RightHolder' element value. �������� � ���������������
     * 
     * @return value
     */
    public OrganizationBaseType getRightHolder() {
        return rightHolder;
    }

    /** 
     * Set the 'RightHolder' element value. �������� � ���������������
     * 
     * @param rightHolder
     */
    public void setRightHolder(OrganizationBaseType rightHolder) {
        this.rightHolder = rightHolder;
    }

    /** 
     * Get the 'GoodsOwner' element value. �������� � ��������� ������
     * 
     * @return value
     */
    public OrganizationBaseType getGoodsOwner() {
        return goodsOwner;
    }

    /** 
     * Set the 'GoodsOwner' element value. �������� � ��������� ������
     * 
     * @param goodsOwner
     */
    public void setGoodsOwner(OrganizationBaseType goodsOwner) {
        this.goodsOwner = goodsOwner;
    }

    /** 
     * Get the 'OwnershipDocInfo' element value. ���������� � ����������, �������������� ����� �������������
     * 
     * @return value
     */
    public OwnershipDocInfoType getOwnershipDocInfo() {
        return ownershipDocInfo;
    }

    /** 
     * Set the 'OwnershipDocInfo' element value. ���������� � ����������, �������������� ����� �������������
     * 
     * @param ownershipDocInfo
     */
    public void setOwnershipDocInfo(OwnershipDocInfoType ownershipDocInfo) {
        this.ownershipDocInfo = ownershipDocInfo;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. �������� � ������
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. �������� � ������
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
    }

    /** 
     * Get the 'Sender' element value. ����������� �� ��������
     * 
     * @return value
     */
    public OrganizationInfoType getSender() {
        return sender;
    }

    /** 
     * Set the 'Sender' element value. ����������� �� ��������
     * 
     * @param sender
     */
    public void setSender(OrganizationInfoType sender) {
        this.sender = sender;
    }

    /** 
     * Get the 'Recipient' element value. ���������� �� ��������
     * 
     * @return value
     */
    public OrganizationInfoType getRecipient() {
        return recipient;
    }

    /** 
     * Set the 'Recipient' element value. ���������� �� ��������
     * 
     * @param recipient
     */
    public void setRecipient(OrganizationInfoType recipient) {
        this.recipient = recipient;
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
