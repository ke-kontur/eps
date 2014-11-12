
package ru.acs.fts.schemas.album.applicationadmintransport;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Заявка от администрации транспортного средства 
 */
public class ApplicationAdminTransportType extends BaseDocType
{
    private String aim;
    private String volume;
    private String measureUnitQualifierName;
    private String quantityStore;
    private List<String> routeList = new ArrayList<String>();
    private String quantityOperation;
    private LocalDate filingDate;
    private String measureUnitOperation;
    private String measureUnitStore;
    private PersonBaseType adminTransport;
    private TransportMeansBaseType transportMeans;
    private OrganizationBaseType foreignCustomer;
    private OrganizationBaseType translator;
    private String documentModeID;

    /** 
     * Get the 'Aim' element value. Цель прибытия на таможенную территорию Российской Федерации
     * 
     * @return value
     */
    public String getAim() {
        return aim;
    }

    /** 
     * Set the 'Aim' element value. Цель прибытия на таможенную территорию Российской Федерации
     * 
     * @param aim
     */
    public void setAim(String aim) {
        this.aim = aim;
    }

    /** 
     * Get the 'Volume' element value. Объем (в основных единицах измерения) технологических конструктивных емкостей и площади специально выделенных штатных мест, предназначенных для хранения припасов на транспортном средстве
     * 
     * @return value
     */
    public String getVolume() {
        return volume;
    }

    /** 
     * Set the 'Volume' element value. Объем (в основных единицах измерения) технологических конструктивных емкостей и площади специально выделенных штатных мест, предназначенных для хранения припасов на транспортном средстве
     * 
     * @param volume
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /** 
     * Get the 'MeasureUnitQualifierName' element value. Наименование единицы измерения объема
     * 
     * @return value
     */
    public String getMeasureUnitQualifierName() {
        return measureUnitQualifierName;
    }

    /** 
     * Set the 'MeasureUnitQualifierName' element value. Наименование единицы измерения объема
     * 
     * @param measureUnitQualifierName
     */
    public void setMeasureUnitQualifierName(String measureUnitQualifierName) {
        this.measureUnitQualifierName = measureUnitQualifierName;
    }

    /** 
     * Get the 'QuantityStore' element value. Количество припасов, находящихся на борту транспортного средства на момент подачи заявления;
     * 
     * @return value
     */
    public String getQuantityStore() {
        return quantityStore;
    }

    /** 
     * Set the 'QuantityStore' element value. Количество припасов, находящихся на борту транспортного средства на момент подачи заявления;
     * 
     * @param quantityStore
     */
    public void setQuantityStore(String quantityStore) {
        this.quantityStore = quantityStore;
    }

    /** 
     * Get the list of 'Route' element items. Предполагаемого маршрута следования транспортного средства после убытия с таможенной территории Российской Федерации
     * 
     * @return list
     */
    public List<String> getRouteList() {
        return routeList;
    }

    /** 
     * Set the list of 'Route' element items. Предполагаемого маршрута следования транспортного средства после убытия с таможенной территории Российской Федерации
     * 
     * @param list
     */
    public void setRouteList(List<String> list) {
        routeList = list;
    }

    /** 
     * Get the 'QuantityOperation' element value. Количество припасов, необходимых для обеспечения эксплуатации транспортного средства
     * 
     * @return value
     */
    public String getQuantityOperation() {
        return quantityOperation;
    }

    /** 
     * Set the 'QuantityOperation' element value. Количество припасов, необходимых для обеспечения эксплуатации транспортного средства
     * 
     * @param quantityOperation
     */
    public void setQuantityOperation(String quantityOperation) {
        this.quantityOperation = quantityOperation;
    }

    /** 
     * Get the 'FilingDate' element value. Дата подачи заявки
     * 
     * @return value
     */
    public LocalDate getFilingDate() {
        return filingDate;
    }

    /** 
     * Set the 'FilingDate' element value. Дата подачи заявки
     * 
     * @param filingDate
     */
    public void setFilingDate(LocalDate filingDate) {
        this.filingDate = filingDate;
    }

    /** 
     * Get the 'MeasureUnitOperation' element value. Наименование единицы измерения количества припасов, необходимых для обеспечения эксплуатации транспортного средства
     * 
     * @return value
     */
    public String getMeasureUnitOperation() {
        return measureUnitOperation;
    }

    /** 
     * Set the 'MeasureUnitOperation' element value. Наименование единицы измерения количества припасов, необходимых для обеспечения эксплуатации транспортного средства
     * 
     * @param measureUnitOperation
     */
    public void setMeasureUnitOperation(String measureUnitOperation) {
        this.measureUnitOperation = measureUnitOperation;
    }

    /** 
     * Get the 'MeasureUnitStore' element value. Наименование единицы измерения количество припасов, находящихся на борту транспортного средства на момент подачи заявления
     * 
     * @return value
     */
    public String getMeasureUnitStore() {
        return measureUnitStore;
    }

    /** 
     * Set the 'MeasureUnitStore' element value. Наименование единицы измерения количество припасов, находящихся на борту транспортного средства на момент подачи заявления
     * 
     * @param measureUnitStore
     */
    public void setMeasureUnitStore(String measureUnitStore) {
        this.measureUnitStore = measureUnitStore;
    }

    /** 
     * Get the 'AdminTransport' element value. Сведения об администрации транспорта
     * 
     * @return value
     */
    public PersonBaseType getAdminTransport() {
        return adminTransport;
    }

    /** 
     * Set the 'AdminTransport' element value. Сведения об администрации транспорта
     * 
     * @param adminTransport
     */
    public void setAdminTransport(PersonBaseType adminTransport) {
        this.adminTransport = adminTransport;
    }

    /** 
     * Get the 'TransportMeans' element value. Сведения о транспортном средстве
     * 
     * @return value
     */
    public TransportMeansBaseType getTransportMeans() {
        return transportMeans;
    }

    /** 
     * Set the 'TransportMeans' element value. Сведения о транспортном средстве
     * 
     * @param transportMeans
     */
    public void setTransportMeans(TransportMeansBaseType transportMeans) {
        this.transportMeans = transportMeans;
    }

    /** 
     * Get the 'ForeignCustomer' element value. Лицо, номинированное иностранным заказчиком на поставку припасов
     * 
     * @return value
     */
    public OrganizationBaseType getForeignCustomer() {
        return foreignCustomer;
    }

    /** 
     * Set the 'ForeignCustomer' element value. Лицо, номинированное иностранным заказчиком на поставку припасов
     * 
     * @param foreignCustomer
     */
    public void setForeignCustomer(OrganizationBaseType foreignCustomer) {
        this.foreignCustomer = foreignCustomer;
    }

    /** 
     * Get the 'Translator' element value. Сведения о лице, осуществившем перевод заявки на русский язык в случае, если она представлена на иностранном языке
     * 
     * @return value
     */
    public OrganizationBaseType getTranslator() {
        return translator;
    }

    /** 
     * Set the 'Translator' element value. Сведения о лице, осуществившем перевод заявки на русский язык в случае, если она представлена на иностранном языке
     * 
     * @param translator
     */
    public void setTranslator(OrganizationBaseType translator) {
        this.translator = translator;
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
