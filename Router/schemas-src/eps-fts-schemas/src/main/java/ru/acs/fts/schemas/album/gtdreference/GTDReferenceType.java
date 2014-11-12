
package ru.acs.fts.schemas.album.gtdreference;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * �������, ����������� � �������� ���������� ����������
 */
public class GTDReferenceType extends BaseDocType
{
    private GoodsInformationType goodsInformation;
    private GTDIDType GTDNumber;
    private CUOrganizationType russianContractPart;
    private CUOrganizationType contractor;
    private CUOrganizationType recipient;
    private CUOrganizationType goodsOwner;
    private CustomsType destinationCustoms;
    private CustomsType floatingCustoms;
    private PersonSignatureType fillingPerson;
    private List<BSideDealInfoType> BSideDealInfoList = new ArrayList<BSideDealInfoType>();
    private String documentModeID;

    /** 
     * Get the 'GoodsInformation' element value. ���������� � ������
     * 
     * @return value
     */
    public GoodsInformationType getGoodsInformation() {
        return goodsInformation;
    }

    /** 
     * Set the 'GoodsInformation' element value. ���������� � ������
     * 
     * @param goodsInformation
     */
    public void setGoodsInformation(GoodsInformationType goodsInformation) {
        this.goodsInformation = goodsInformation;
    }

    /** 
     * Get the 'GTDNumber' element value. ����� ���, � ������� ����������� �������
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ����� ���, � ������� ����������� �������
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }

    /** 
     * Get the 'RussianContractPart' element value. ���������� ������� ��������
     * 
     * @return value
     */
    public CUOrganizationType getRussianContractPart() {
        return russianContractPart;
    }

    /** 
     * Set the 'RussianContractPart' element value. ���������� ������� ��������
     * 
     * @param russianContractPart
     */
    public void setRussianContractPart(CUOrganizationType russianContractPart) {
        this.russianContractPart = russianContractPart;
    }

    /** 
     * Get the 'Contractor' element value. ����������
     * 
     * @return value
     */
    public CUOrganizationType getContractor() {
        return contractor;
    }

    /** 
     * Set the 'Contractor' element value. ����������
     * 
     * @param contractor
     */
    public void setContractor(CUOrganizationType contractor) {
        this.contractor = contractor;
    }

    /** 
     * Get the 'Recipient' element value. ���������� ������
     * 
     * @return value
     */
    public CUOrganizationType getRecipient() {
        return recipient;
    }

    /** 
     * Set the 'Recipient' element value. ���������� ������
     * 
     * @param recipient
     */
    public void setRecipient(CUOrganizationType recipient) {
        this.recipient = recipient;
    }

    /** 
     * Get the 'GoodsOwner' element value. ����������� ������
     * 
     * @return value
     */
    public CUOrganizationType getGoodsOwner() {
        return goodsOwner;
    }

    /** 
     * Set the 'GoodsOwner' element value. ����������� ������
     * 
     * @param goodsOwner
     */
    public void setGoodsOwner(CUOrganizationType goodsOwner) {
        this.goodsOwner = goodsOwner;
    }

    /** 
     * Get the 'DestinationCustoms' element value. ���������� �����, ������������� � ����� �������� �������
     * 
     * @return value
     */
    public CustomsType getDestinationCustoms() {
        return destinationCustoms;
    }

    /** 
     * Set the 'DestinationCustoms' element value. ���������� �����, ������������� � ����� �������� �������
     * 
     * @param destinationCustoms
     */
    public void setDestinationCustoms(CustomsType destinationCustoms) {
        this.destinationCustoms = destinationCustoms;
    }

    /** 
     * Get the 'FloatingCustoms' element value. ���������� �����, ������������� ������ ������
     * 
     * @return value
     */
    public CustomsType getFloatingCustoms() {
        return floatingCustoms;
    }

    /** 
     * Set the 'FloatingCustoms' element value. ���������� �����, ������������� ������ ������
     * 
     * @param floatingCustoms
     */
    public void setFloatingCustoms(CustomsType floatingCustoms) {
        this.floatingCustoms = floatingCustoms;
    }

    /** 
     * Get the 'FillingPerson' element value. ����, ����������� �������
     * 
     * @return value
     */
    public PersonSignatureType getFillingPerson() {
        return fillingPerson;
    }

    /** 
     * Set the 'FillingPerson' element value. ����, ����������� �������
     * 
     * @param fillingPerson
     */
    public void setFillingPerson(PersonSignatureType fillingPerson) {
        this.fillingPerson = fillingPerson;
    }

    /** 
     * Get the list of 'BSideDealInfo' element items. ������ �.�������� � �������
     * 
     * @return list
     */
    public List<BSideDealInfoType> getBSideDealInfoList() {
        return BSideDealInfoList;
    }

    /** 
     * Set the list of 'BSideDealInfo' element items. ������ �.�������� � �������
     * 
     * @param list
     */
    public void setBSideDealInfoList(List<BSideDealInfoType> list) {
        BSideDealInfoList = list;
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
