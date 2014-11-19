
package ru.acs.fts.schemas.album;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� � ������
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:IDKDocuments:IDKCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IDKGoodsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="GoodsNumber"/>
 *     &lt;xs:element type="xs:string" name="GoodsTNVEDCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="GoodsDescription"/>
 *     &lt;xs:element type="xs:string" name="OriginalCountryCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="NetWeight" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="GrossWeigh" minOccurs="0"/>
 *     &lt;xs:element type="ns:SupplementaryQuantityType" name="SupplementaryGoodsQuantity" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="QuantityPlaces" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="PlaceNumber" minOccurs="0"/>
 *     &lt;xs:element type="ns1:IDKContainerType" name="ContainerInfo" minOccurs="0"/>
 *     &lt;xs:element type="ns1:IDKCostType" name="InvoiceCost" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="Comments" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IDKGoodsType
{
    private String goodsNumber;
    private String goodsTNVEDCode;
    private String goodsDescription;
    private String originalCountryCode;
    private String netWeight;
    private String grossWeigh;
    private SupplementaryQuantityType supplementaryGoodsQuantity;
    private String quantityPlaces;
    private String placeNumber;
    private IDKContainerType containerInfo;
    private IDKCostType invoiceCost;
    private String comments;

    /** 
     * Get the 'GoodsNumber' element value. ���������� ����� ������
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. ���������� ����� ������
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� 
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� 
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'GoodsDescription' element value. �������� ������
     * 
     * @return value
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. �������� ������
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the 'OriginalCountryCode' element value. ������ �������������
     * 
     * @return value
     */
    public String getOriginalCountryCode() {
        return originalCountryCode;
    }

    /** 
     * Set the 'OriginalCountryCode' element value. ������ �������������
     * 
     * @param originalCountryCode
     */
    public void setOriginalCountryCode(String originalCountryCode) {
        this.originalCountryCode = originalCountryCode;
    }

    /** 
     * Get the 'NetWeight' element value. ��� �����
     * 
     * @return value
     */
    public String getNetWeight() {
        return netWeight;
    }

    /** 
     * Set the 'NetWeight' element value. ��� �����
     * 
     * @param netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    /** 
     * Get the 'GrossWeigh' element value. ��� ������
     * 
     * @return value
     */
    public String getGrossWeigh() {
        return grossWeigh;
    }

    /** 
     * Set the 'GrossWeigh' element value. ��� ������
     * 
     * @param grossWeigh
     */
    public void setGrossWeigh(String grossWeigh) {
        this.grossWeigh = grossWeigh;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. ���������� ������ � ���
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. ���������� ������ � ���
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(
            SupplementaryQuantityType supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }

    /** 
     * Get the 'QuantityPlaces' element value. ���������� �������� ����
     * 
     * @return value
     */
    public String getQuantityPlaces() {
        return quantityPlaces;
    }

    /** 
     * Set the 'QuantityPlaces' element value. ���������� �������� ����
     * 
     * @param quantityPlaces
     */
    public void setQuantityPlaces(String quantityPlaces) {
        this.quantityPlaces = quantityPlaces;
    }

    /** 
     * Get the 'PlaceNumber' element value. ����� ��������� �����
     * 
     * @return value
     */
    public String getPlaceNumber() {
        return placeNumber;
    }

    /** 
     * Set the 'PlaceNumber' element value. ����� ��������� �����
     * 
     * @param placeNumber
     */
    public void setPlaceNumber(String placeNumber) {
        this.placeNumber = placeNumber;
    }

    /** 
     * Get the 'ContainerInfo' element value. �������� � �����������
     * 
     * @return value
     */
    public IDKContainerType getContainerInfo() {
        return containerInfo;
    }

    /** 
     * Set the 'ContainerInfo' element value. �������� � �����������
     * 
     * @param containerInfo
     */
    public void setContainerInfo(IDKContainerType containerInfo) {
        this.containerInfo = containerInfo;
    }

    /** 
     * Get the 'InvoiceCost' element value. ��������� ��������� ������
     * 
     * @return value
     */
    public IDKCostType getInvoiceCost() {
        return invoiceCost;
    }

    /** 
     * Set the 'InvoiceCost' element value. ��������� ��������� ������
     * 
     * @param invoiceCost
     */
    public void setInvoiceCost(IDKCostType invoiceCost) {
        this.invoiceCost = invoiceCost;
    }

    /** 
     * Get the 'Comments' element value. ����������
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. ����������
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}
