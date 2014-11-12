
package ru.acs.fts.schemas.album.oez_importnotif;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Уведомление о ввозе товаров на территорию ОЭЗ/ПОЭЗ и въезде средства транспорта/Разрешение на ввоз товаров на территорию ПОЭЗ
 */
public class OEZImportNotifType extends BaseDocType
{
    private LocalDate importDate;
    private String addInformation;
    private String docSign;
    private CustomsType customs;
    private ConsigneeType consignee;
    private RegistrationNumberType registrationNumber;
    private TransportMeansType transportMeans;
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private String documentModeID;

    /** 
     * Get the 'ImportDate' element value. Дата ввоза товаров
     * 
     * @return value
     */
    public LocalDate getImportDate() {
        return importDate;
    }

    /** 
     * Set the 'ImportDate' element value. Дата ввоза товаров
     * 
     * @param importDate
     */
    public void setImportDate(LocalDate importDate) {
        this.importDate = importDate;
    }

    /** 
     * Get the 'AddInformation' element value. Дополнительная информация
     * 
     * @return value
     */
    public String getAddInformation() {
        return addInformation;
    }

    /** 
     * Set the 'AddInformation' element value. Дополнительная информация
     * 
     * @param addInformation
     */
    public void setAddInformation(String addInformation) {
        this.addInformation = addInformation;
    }

    /** 
     * Get the 'DocSign' element value. Признак документа: 1 - уведомление о ввозе товаров на территорию ОЭЗ и въезде средства транспорта; 2 - уведомление о ввозе товаров на территорию ПОЭЗ; 3 - разрешение на ввоз товаров на территорию ПОЭЗ
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак документа: 1 - уведомление о ввозе товаров на территорию ОЭЗ и въезде средства транспорта; 2 - уведомление о ввозе товаров на территорию ПОЭЗ; 3 - разрешение на ввоз товаров на территорию ПОЭЗ
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Consignee' element value. Резидент/нерезидент
     * 
     * @return value
     */
    public ConsigneeType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Резидент/нерезидент
     * 
     * @param consignee
     */
    public void setConsignee(ConsigneeType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'RegistrationNumber' element value. Регистрационный номер разрешения
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. Регистрационный номер разрешения
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(RegistrationNumberType registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'TransportMeans' element value. Описания транспортного средства 
     * 
     * @return value
     */
    public TransportMeansType getTransportMeans() {
        return transportMeans;
    }

    /** 
     * Set the 'TransportMeans' element value. Описания транспортного средства 
     * 
     * @param transportMeans
     */
    public void setTransportMeans(TransportMeansType transportMeans) {
        this.transportMeans = transportMeans;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. Сведения о товаре
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. Сведения о товаре
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
