
package ru.acs.fts.schemas.album.packinglist;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.TransportMeansType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Упаковочный лист
 */
public class PackingListType extends BaseDocType
{
    private String grossWeightQuantity;
    private String netWeightQuantity;
    private OrganizationType consignor;
    private OrganizationType consignee;
    private PackingListDeliveryTermsType deliveryTerms;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private List<TransportMeansType> transportMeanList = new ArrayList<TransportMeansType>();
    private List<PlacesQuantityType> totalPlacesQuantityList = new ArrayList<PlacesQuantityType>();
    private String documentModeID;

    /** 
     * Get the 'GrossWeightQuantity' element value. Общий вес брутто товаров (если в описании товаров нет данных, то значение вводится вручную - иначе - сумма веса брутто по товарам)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. Общий вес брутто товаров (если в описании товаров нет данных, то значение вводится вручную - иначе - сумма веса брутто по товарам)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. Общий вес нетто товаров (если в описании товаров нет данных, то значение вводится вручную - иначе - сумма веса нетто по товарам)
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. Общий вес нетто товаров (если в описании товаров нет данных, то значение вводится вручную - иначе - сумма веса нетто по товарам)
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'Consignor' element value. Сведения о грузоотправителе
     * 
     * @return value
     */
    public OrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Сведения о грузоотправителе
     * 
     * @param consignor
     */
    public void setConsignor(OrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. Информация о грузополучателе
     * 
     * @return value
     */
    public OrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Информация о грузополучателе
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'DeliveryTerms' element value. Описание условий поставки контракта
     * 
     * @return value
     */
    public PackingListDeliveryTermsType getDeliveryTerms() {
        return deliveryTerms;
    }

    /** 
     * Set the 'DeliveryTerms' element value. Описание условий поставки контракта
     * 
     * @param deliveryTerms
     */
    public void setDeliveryTerms(PackingListDeliveryTermsType deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }

    /** 
     * Get the list of 'Goods' element items. Описание грузовых мест товаров
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Описание грузовых мест товаров
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the list of 'TransportMeans' element items. Описание транспортного средства для перевозки товаров
     * 
     * @return list
     */
    public List<TransportMeansType> getTransportMeanList() {
        return transportMeanList;
    }

    /** 
     * Set the list of 'TransportMeans' element items. Описание транспортного средства для перевозки товаров
     * 
     * @param list
     */
    public void setTransportMeanList(List<TransportMeansType> list) {
        transportMeanList = list;
    }

    /** 
     * Get the list of 'TotalPlacesQuantity' element items. Общее количество мест по видам грузовых  мест
     * 
     * @return list
     */
    public List<PlacesQuantityType> getTotalPlacesQuantityList() {
        return totalPlacesQuantityList;
    }

    /** 
     * Set the list of 'TotalPlacesQuantity' element items. Общее количество мест по видам грузовых  мест
     * 
     * @param list
     */
    public void setTotalPlacesQuantityList(List<PlacesQuantityType> list) {
        totalPlacesQuantityList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
