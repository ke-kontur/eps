
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Сведения о товарной партии
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:IDKDocuments:IDKCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IDKShipmentInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="GrossWeight"/>
 *     &lt;xs:element type="ns:SupplementaryQuantityType" name="SupplementaryGoodsQuantity" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="MaxWeightIndicator" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="DispatchCountryCode"/>
 *     &lt;xs:element type="ns1:IDKOrganizationType" name="Consignor"/>
 *     &lt;xs:element type="xs:string" name="DestinationCountryCode"/>
 *     &lt;xs:element type="ns1:IDKOrganizationType" name="Consignee"/>
 *     &lt;xs:element type="ns1:IDKOrganizationType" name="Declarant" minOccurs="0"/>
 *     &lt;xs:element type="ns1:IDKGoodsType" name="GoodsInfo" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns1:IDKShippingDocumentsType" name="ShipmentDocuments" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="Comments" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IDKShipmentInfoType
{
    private String grossWeight;
    private SupplementaryQuantityType supplementaryGoodsQuantity;
    private String maxWeightIndicator;
    private String dispatchCountryCode;
    private IDKOrganizationType consignor;
    private String destinationCountryCode;
    private IDKOrganizationType consignee;
    private IDKOrganizationType declarant;
    private List<IDKGoodsType> goodsInfoList = new ArrayList<IDKGoodsType>();
    private IDKShippingDocumentsType shipmentDocuments;
    private String comments;

    /** 
     * Get the 'GrossWeight' element value. Общий вес брутто, кг.
     * 
     * @return value
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. Общий вес брутто, кг.
     * 
     * @param grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. Количество товара в ДЕИ
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. Количество товара в ДЕИ
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(
            SupplementaryQuantityType supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }

    /** 
     * Get the 'MaxWeightIndicator' element value. Признак ввода товаров по максимальному весу
     * 
     * @return value
     */
    public String getMaxWeightIndicator() {
        return maxWeightIndicator;
    }

    /** 
     * Set the 'MaxWeightIndicator' element value. Признак ввода товаров по максимальному весу
     * 
     * @param maxWeightIndicator
     */
    public void setMaxWeightIndicator(String maxWeightIndicator) {
        this.maxWeightIndicator = maxWeightIndicator;
    }

    /** 
     * Get the 'DispatchCountryCode' element value. Страна отправления
     * 
     * @return value
     */
    public String getDispatchCountryCode() {
        return dispatchCountryCode;
    }

    /** 
     * Set the 'DispatchCountryCode' element value. Страна отправления
     * 
     * @param dispatchCountryCode
     */
    public void setDispatchCountryCode(String dispatchCountryCode) {
        this.dispatchCountryCode = dispatchCountryCode;
    }

    /** 
     * Get the 'Consignor' element value. Отправитель
     * 
     * @return value
     */
    public IDKOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Отправитель
     * 
     * @param consignor
     */
    public void setConsignor(IDKOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'DestinationCountryCode' element value. Страна назначения
     * 
     * @return value
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /** 
     * Set the 'DestinationCountryCode' element value. Страна назначения
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    /** 
     * Get the 'Consignee' element value. Получатель
     * 
     * @return value
     */
    public IDKOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Получатель
     * 
     * @param consignee
     */
    public void setConsignee(IDKOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Declarant' element value. Сведения о декларанте
     * 
     * @return value
     */
    public IDKOrganizationType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Сведения о декларанте
     * 
     * @param declarant
     */
    public void setDeclarant(IDKOrganizationType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. Сведения о товарах
     * 
     * @return list
     */
    public List<IDKGoodsType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. Сведения о товарах
     * 
     * @param list
     */
    public void setGoodsInfoList(List<IDKGoodsType> list) {
        goodsInfoList = list;
    }

    /** 
     * Get the 'ShipmentDocuments' element value. Сведения о предоставляемых документах если на каждую поставку свой комплект документов
     * 
     * @return value
     */
    public IDKShippingDocumentsType getShipmentDocuments() {
        return shipmentDocuments;
    }

    /** 
     * Set the 'ShipmentDocuments' element value. Сведения о предоставляемых документах если на каждую поставку свой комплект документов
     * 
     * @param shipmentDocuments
     */
    public void setShipmentDocuments(IDKShippingDocumentsType shipmentDocuments) {
        this.shipmentDocuments = shipmentDocuments;
    }

    /** 
     * Get the 'Comments' element value. Примечания
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Примечания
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}
