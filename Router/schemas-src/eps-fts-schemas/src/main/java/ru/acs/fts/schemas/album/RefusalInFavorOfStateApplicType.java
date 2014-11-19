
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * ��������� �� ��������� ������� ��� ���������� ��������� ������ � ������ �����������
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:CustomsDocuments:RefusalInFavorOfStateApplic:5.4.3" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RefusalInFavorOfStateApplicType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:BaseDocType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:string" name="TotalCost" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="Reasons" maxOccurs="unbounded"/>
 *         &lt;xs:element type="ns:CUOrganizationType" name="Declarant"/>
 *         &lt;xs:element type="ns1:GoodsType" name="Goods" maxOccurs="unbounded"/>
 *         &lt;xs:element type="ns:AddressType" name="GoodsPlace"/>
 *         &lt;xs:element type="ns:CustomsType" name="Customs"/>
 *         &lt;xs:element type="ns:AddressType" name="StoragePlace"/>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="required" fixed="1006215E" name="DocumentModeID"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RefusalInFavorOfStateApplicType extends BaseDocType
{
    private String totalCost;
    private List<String> reasonList = new ArrayList<String>();
    private CUOrganizationType declarant;
    private List<GoodsType2> goodList = new ArrayList<GoodsType2>();
    private AddressType goodsPlace;
    private CustomsType customs;
    private AddressType storagePlace;
    private String documentModeID;

    /** 
     * Get the 'TotalCost' element value. ����� ��������� �������
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. ����� ��������� �������
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /** 
     * Get the list of 'Reasons' element items. ������� ������ �� ������� � ������ �����������
     * 
     * @return list
     */
    public List<String> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reasons' element items. ������� ������ �� ������� � ������ �����������
     * 
     * @param list
     */
    public void setReasonList(List<String> list) {
        reasonList = list;
    }

    /** 
     * Get the 'Declarant' element value. ���������
     * 
     * @return value
     */
    public CUOrganizationType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. ���������
     * 
     * @param declarant
     */
    public void setDeclarant(CUOrganizationType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the list of 'Goods' element items. �������� � �������
     * 
     * @return list
     */
    public List<GoodsType2> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� � �������
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType2> list) {
        goodList = list;
    }

    /** 
     * Get the 'GoodsPlace' element value. ��������������� �������
     * 
     * @return value
     */
    public AddressType getGoodsPlace() {
        return goodsPlace;
    }

    /** 
     * Set the 'GoodsPlace' element value. ��������������� �������
     * 
     * @param goodsPlace
     */
    public void setGoodsPlace(AddressType goodsPlace) {
        this.goodsPlace = goodsPlace;
    }

    /** 
     * Get the 'Customs' element value. �������� � ���������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. �������� � ���������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'StoragePlace' element value. �����, ������������ ��� ���������� �������
     * 
     * @return value
     */
    public AddressType getStoragePlace() {
        return storagePlace;
    }

    /** 
     * Set the 'StoragePlace' element value. �����, ������������ ��� ���������� �������
     * 
     * @param storagePlace
     */
    public void setStoragePlace(AddressType storagePlace) {
        this.storagePlace = storagePlace;
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
