
package ru.acs.fts.schemas.album.oez_exportnotif;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Предварительное уведомление о вывозе товаров с территории ОЭЗ/ПОЭЗ
 */
public class OEZExportNotifType extends BaseDocType
{
    private LocalDate exportDate;
    private String addInformation;
    private LocalDate provisionalDateBegin;
    private LocalDate provisionalDateEnd;
    private String docSign;
    private IncidentNotifType incidentNotif;
    private CustomsType customs;
    private ConsignorType consignor;
    private RegistrationNumberType registrationNumber;
    private TransportMeansType transportMeans;
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private String documentModeID;

    /** 
     * Get the 'ExportDate' element value. Планируемая дата вывоза товаров
     * 
     * @return value
     */
    public LocalDate getExportDate() {
        return exportDate;
    }

    /** 
     * Set the 'ExportDate' element value. Планируемая дата вывоза товаров
     * 
     * @param exportDate
     */
    public void setExportDate(LocalDate exportDate) {
        this.exportDate = exportDate;
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
     * Get the 'ProvisionalDateBegin' element value. Предварительная дата вывоза с
     * 
     * @return value
     */
    public LocalDate getProvisionalDateBegin() {
        return provisionalDateBegin;
    }

    /** 
     * Set the 'ProvisionalDateBegin' element value. Предварительная дата вывоза с
     * 
     * @param provisionalDateBegin
     */
    public void setProvisionalDateBegin(LocalDate provisionalDateBegin) {
        this.provisionalDateBegin = provisionalDateBegin;
    }

    /** 
     * Get the 'ProvisionalDateEnd' element value. Предварительная дата вывоза по
     * 
     * @return value
     */
    public LocalDate getProvisionalDateEnd() {
        return provisionalDateEnd;
    }

    /** 
     * Set the 'ProvisionalDateEnd' element value. Предварительная дата вывоза по
     * 
     * @param provisionalDateEnd
     */
    public void setProvisionalDateEnd(LocalDate provisionalDateEnd) {
        this.provisionalDateEnd = provisionalDateEnd;
    }

    /** 
     * Get the 'DocSign' element value. Признак уведомления о вывозе товаров с территории: 0 - ОЭЗ; 1 - ПОЭЗ
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак уведомления о вывозе товаров с территории: 0 - ОЭЗ; 1 - ПОЭЗ
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'IncidentNotif' element value. Лицо, подающее уведомление (Резидент/нерезидент)
     * 
     * @return value
     */
    public IncidentNotifType getIncidentNotif() {
        return incidentNotif;
    }

    /** 
     * Set the 'IncidentNotif' element value. Лицо, подающее уведомление (Резидент/нерезидент)
     * 
     * @param incidentNotif
     */
    public void setIncidentNotif(IncidentNotifType incidentNotif) {
        this.incidentNotif = incidentNotif;
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
     * Get the 'Consignor' element value. Отправитель
     * 
     * @return value
     */
    public ConsignorType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Отправитель
     * 
     * @param consignor
     */
    public void setConsignor(ConsignorType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'RegistrationNumber' element value. Регистрационный номер предварительного уведомления
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. Регистрационный номер предварительного уведомления
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
