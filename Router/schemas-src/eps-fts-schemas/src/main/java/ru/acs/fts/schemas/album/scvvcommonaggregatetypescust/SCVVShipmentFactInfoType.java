
package ru.acs.fts.schemas.album.scvvcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Информация о фактическом вывозе
 */
public class SCVVShipmentFactInfoType
{
    private LocalDate exportDate;
    private List<String> addInfoList = new ArrayList<String>();
    private String dispatchCountryCode;
    private String destinationCountryCode;
    private String totalGoodsWeight;
    private String borderPointCode;
    private String customsNumber;
    private OrganizationBaseType consignee;
    private OrganizationBaseType consignor;
    private List<SCVVPresentedDocumentType> presentedDocumentList = new ArrayList<SCVVPresentedDocumentType>();
    private List<SCVVGoodsType> goodsFactInfoList = new ArrayList<SCVVGoodsType>();
    private List<SCVVTransportMeansType> departureTransportList = new ArrayList<SCVVTransportMeansType>();
    private CustomsType customs;
    private CustomsPersonType customsPerson;

    /** 
     * Get the 'ExportDate' element value. Дата убытия
     * 
     * @return value
     */
    public LocalDate getExportDate() {
        return exportDate;
    }

    /** 
     * Set the 'ExportDate' element value. Дата убытия
     * 
     * @param exportDate
     */
    public void setExportDate(LocalDate exportDate) {
        this.exportDate = exportDate;
    }

    /** 
     * Get the list of 'AddInfo' element items. Примечания
     * 
     * @return list
     */
    public List<String> getAddInfoList() {
        return addInfoList;
    }

    /** 
     * Set the list of 'AddInfo' element items. Примечания
     * 
     * @param list
     */
    public void setAddInfoList(List<String> list) {
        addInfoList = list;
    }

    /** 
     * Get the 'DispatchCountryCode' element value. Страна отправления. Буквенный код по общероссийскому классификатору стран мира либо по классификатору экономических союзов и сообществ.
     * 
     * @return value
     */
    public String getDispatchCountryCode() {
        return dispatchCountryCode;
    }

    /** 
     * Set the 'DispatchCountryCode' element value. Страна отправления. Буквенный код по общероссийскому классификатору стран мира либо по классификатору экономических союзов и сообществ.
     * 
     * @param dispatchCountryCode
     */
    public void setDispatchCountryCode(String dispatchCountryCode) {
        this.dispatchCountryCode = dispatchCountryCode;
    }

    /** 
     * Get the 'DestinationCountryCode' element value. Страна назначения. Буквенный код по общероссийскому классификатору стран мира либо по классификатору экономических союзов и сообществ / 00 (неизвестна)
     * 
     * @return value
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /** 
     * Set the 'DestinationCountryCode' element value. Страна назначения. Буквенный код по общероссийскому классификатору стран мира либо по классификатору экономических союзов и сообществ / 00 (неизвестна)
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    /** 
     * Get the 'TotalGoodsWeight' element value. Общий вес брутто (кг) вывезенного товара 
     * 
     * @return value
     */
    public String getTotalGoodsWeight() {
        return totalGoodsWeight;
    }

    /** 
     * Set the 'TotalGoodsWeight' element value. Общий вес брутто (кг) вывезенного товара 
     * 
     * @param totalGoodsWeight
     */
    public void setTotalGoodsWeight(String totalGoodsWeight) {
        this.totalGoodsWeight = totalGoodsWeight;
    }

    /** 
     * Get the 'BorderPointCode' element value. Код пограничного пункта пропуска.
     * 
     * @return value
     */
    public String getBorderPointCode() {
        return borderPointCode;
    }

    /** 
     * Set the 'BorderPointCode' element value. Код пограничного пункта пропуска.
     * 
     * @param borderPointCode
     */
    public void setBorderPointCode(String borderPointCode) {
        this.borderPointCode = borderPointCode;
    }

    /** 
     * Get the 'CustomsNumber' element value. Таможенный номер накладной
     * 
     * @return value
     */
    public String getCustomsNumber() {
        return customsNumber;
    }

    /** 
     * Set the 'CustomsNumber' element value. Таможенный номер накладной
     * 
     * @param customsNumber
     */
    public void setCustomsNumber(String customsNumber) {
        this.customsNumber = customsNumber;
    }

    /** 
     * Get the 'Consignee' element value. Сведения о получателе товаров
     * 
     * @return value
     */
    public OrganizationBaseType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Сведения о получателе товаров
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationBaseType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Consignor' element value. Сведения об отправителе товаров
     * 
     * @return value
     */
    public OrganizationBaseType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Сведения об отправителе товаров
     * 
     * @param consignor
     */
    public void setConsignor(OrganizationBaseType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the list of 'PresentedDocument' element items. Транспортный документ
     * 
     * @return list
     */
    public List<SCVVPresentedDocumentType> getPresentedDocumentList() {
        return presentedDocumentList;
    }

    /** 
     * Set the list of 'PresentedDocument' element items. Транспортный документ
     * 
     * @param list
     */
    public void setPresentedDocumentList(List<SCVVPresentedDocumentType> list) {
        presentedDocumentList = list;
    }

    /** 
     * Get the list of 'GoodsFactInfo' element items. Сведения о товаре
     * 
     * @return list
     */
    public List<SCVVGoodsType> getGoodsFactInfoList() {
        return goodsFactInfoList;
    }

    /** 
     * Set the list of 'GoodsFactInfo' element items. Сведения о товаре
     * 
     * @param list
     */
    public void setGoodsFactInfoList(List<SCVVGoodsType> list) {
        goodsFactInfoList = list;
    }

    /** 
     * Get the list of 'DepartureTransport' element items. Транспортные средства при убытии
     * 
     * @return list
     */
    public List<SCVVTransportMeansType> getDepartureTransportList() {
        return departureTransportList;
    }

    /** 
     * Set the list of 'DepartureTransport' element items. Транспортные средства при убытии
     * 
     * @param list
     */
    public void setDepartureTransportList(List<SCVVTransportMeansType> list) {
        departureTransportList = list;
    }

    /** 
     * Get the 'Customs' element value. Таможенный орган убытия
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Таможенный орган убытия
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPerson' element value. Инспектор, зарегистрировавший убытие 
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Инспектор, зарегистрировавший убытие 
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }
}
