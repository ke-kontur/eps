
package ru.acs.fts.schemas.album.shippingspecification;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ����������� ������������
 */
public class ShippingSpecificationType extends BaseDocType
{
    private DocumentBaseType specification;
    private DocumentBaseType activitiesAgreement;
    private OrganizationBaseType sender;
    private OrganizationBaseType receiver;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private String documentModeID;

    /** 
     * Get the 'Specification' element value. ����� � ���� ������������
     * 
     * @return value
     */
    public DocumentBaseType getSpecification() {
        return specification;
    }

    /** 
     * Set the 'Specification' element value. ����� � ���� ������������
     * 
     * @param specification
     */
    public void setSpecification(DocumentBaseType specification) {
        this.specification = specification;
    }

    /** 
     * Get the 'ActivitiesAgreement' element value. �������� � �������� ������������������� ������
     * 
     * @return value
     */
    public DocumentBaseType getActivitiesAgreement() {
        return activitiesAgreement;
    }

    /** 
     * Set the 'ActivitiesAgreement' element value. �������� � �������� ������������������� ������
     * 
     * @param activitiesAgreement
     */
    public void setActivitiesAgreement(DocumentBaseType activitiesAgreement) {
        this.activitiesAgreement = activitiesAgreement;
    }

    /** 
     * Get the 'Sender' element value. ��������/�����������
     * 
     * @return value
     */
    public OrganizationBaseType getSender() {
        return sender;
    }

    /** 
     * Set the 'Sender' element value. ��������/�����������
     * 
     * @param sender
     */
    public void setSender(OrganizationBaseType sender) {
        this.sender = sender;
    }

    /** 
     * Get the 'Receiver' element value. ����������/����������
     * 
     * @return value
     */
    public OrganizationBaseType getReceiver() {
        return receiver;
    }

    /** 
     * Set the 'Receiver' element value. ����������/����������
     * 
     * @param receiver
     */
    public void setReceiver(OrganizationBaseType receiver) {
        this.receiver = receiver;
    }

    /** 
     * Get the list of 'Goods' element items. ����� ����������� ������������
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. ����� ����������� ������������
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
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
