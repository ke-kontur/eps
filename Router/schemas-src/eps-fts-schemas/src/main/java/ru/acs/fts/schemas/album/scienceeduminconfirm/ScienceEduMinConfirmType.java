
package ru.acs.fts.schemas.album.scienceeduminconfirm;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ������������� ����������� ������
 */
public class ScienceEduMinConfirmType extends BaseDocType
{
    private String documentAttachment;
    private String additionalInfo;
    private ConfirmationInfoType confirmationInfo;
    private DocumentBaseType contract;
    private ParticipantType confirmationPerson;
    private ParticipantType consignee;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private PersonBaseType authorizedPerson;
    private String documentModeID;

    /** 
     * Get the 'DocumentAttachment' element value. ����� (��������) ���������� � ���������� � (���) ���������
     * 
     * @return value
     */
    public String getDocumentAttachment() {
        return documentAttachment;
    }

    /** 
     * Set the 'DocumentAttachment' element value. ����� (��������) ���������� � ���������� � (���) ���������
     * 
     * @param documentAttachment
     */
    public void setDocumentAttachment(String documentAttachment) {
        this.documentAttachment = documentAttachment;
    }

    /** 
     * Get the 'AdditionalInfo' element value. �������������� ����������
     * 
     * @return value
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /** 
     * Set the 'AdditionalInfo' element value. �������������� ����������
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /** 
     * Get the 'ConfirmationInfo' element value. �������� � �������������
     * 
     * @return value
     */
    public ConfirmationInfoType getConfirmationInfo() {
        return confirmationInfo;
    }

    /** 
     * Set the 'ConfirmationInfo' element value. �������� � �������������
     * 
     * @param confirmationInfo
     */
    public void setConfirmationInfo(ConfirmationInfoType confirmationInfo) {
        this.confirmationInfo = confirmationInfo;
    }

    /** 
     * Get the 'Contract' element value. ��������� ���������
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. ��������� ���������
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the 'ConfirmationPerson' element value. �������� � ����, �������� ������ �������������
     * 
     * @return value
     */
    public ParticipantType getConfirmationPerson() {
        return confirmationPerson;
    }

    /** 
     * Set the 'ConfirmationPerson' element value. �������� � ����, �������� ������ �������������
     * 
     * @param confirmationPerson
     */
    public void setConfirmationPerson(ParticipantType confirmationPerson) {
        this.confirmationPerson = confirmationPerson;
    }

    /** 
     * Get the 'Consignee' element value. ���������� ������
     * 
     * @return value
     */
    public ParticipantType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ���������� ������
     * 
     * @param consignee
     */
    public void setConsignee(ParticipantType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the list of 'Goods' element items. �������� � ������
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� � ������
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. �������������� ����
     * 
     * @return value
     */
    public PersonBaseType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. �������������� ����
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(PersonBaseType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
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
