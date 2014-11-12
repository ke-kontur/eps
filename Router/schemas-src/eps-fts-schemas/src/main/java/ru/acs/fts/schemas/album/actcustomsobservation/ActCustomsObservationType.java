
package ru.acs.fts.schemas.album.actcustomsobservation;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Акт таможенного наблюдения
 */
public class ActCustomsObservationType extends BaseDocType
{
    private LocalDate actDate;
    private LocalDate beginDate;
    private String beginTime;
    private LocalDate endDate;
    private String endTime;
    private String reason;
    private String observationKind;
    private String operationsCustObservation;
    private List<String> processDescriptionResultList = new ArrayList<String>();
    private String addiSheetsNumber;
    private String application;
    private CUCustomsType customs;
    private ObservationPlaceType observationPlace;
    private List<ApplicationTMCCType> applicationTMCCList = new ArrayList<ApplicationTMCCType>();
    private List<CustomsPersonType> customsPersonList = new ArrayList<CustomsPersonType>();
    private List<PersonBaseType> personsInvolvedOperationList = new ArrayList<PersonBaseType>();
    private List<AddSheetType> addSheetList = new ArrayList<AddSheetType>();
    private String documentModeID;

    /** 
     * Get the 'ActDate' element value. Дата составления акта
     * 
     * @return value
     */
    public LocalDate getActDate() {
        return actDate;
    }

    /** 
     * Set the 'ActDate' element value. Дата составления акта
     * 
     * @param actDate
     */
    public void setActDate(LocalDate actDate) {
        this.actDate = actDate;
    }

    /** 
     * Get the 'BeginDate' element value. Дата начала таможенного наблюдения
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. Дата начала таможенного наблюдения
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'BeginTime' element value. Время начала таможенного наблюдения
     * 
     * @return value
     */
    public String getBeginTime() {
        return beginTime;
    }

    /** 
     * Set the 'BeginTime' element value. Время начала таможенного наблюдения
     * 
     * @param beginTime
     */
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    /** 
     * Get the 'EndDate' element value. Дата окончания таможенного наблюдения
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата окончания таможенного наблюдения
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'EndTime' element value. Время окончания таможенного наблюдения
     * 
     * @return value
     */
    public String getEndTime() {
        return endTime;
    }

    /** 
     * Set the 'EndTime' element value. Время окончания таможенного наблюдения
     * 
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /** 
     * Get the 'Reason' element value. Основание для проведения таможенного наблюдения 
     * 
     * @return value
     */
    public String getReason() {
        return reason;
    }

    /** 
     * Set the 'Reason' element value. Основание для проведения таможенного наблюдения 
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /** 
     * Get the 'ObservationKind' element value. Признак проведения опосредованного наблюдения (с применением ТСТК)
     * 
     * @return value
     */
    public String getObservationKind() {
        return observationKind;
    }

    /** 
     * Set the 'ObservationKind' element value. Признак проведения опосредованного наблюдения (с применением ТСТК)
     * 
     * @param observationKind
     */
    public void setObservationKind(String observationKind) {
        this.observationKind = observationKind;
    }

    /** 
     * Get the 'OperationsCustObservation' element value. Операции, при которых осуществляется таможенное наблюдение.1 - перевозка товаров и транспортных средств, 2 - грузовые операции, 3 - прочее
     * 
     * @return value
     */
    public String getOperationsCustObservation() {
        return operationsCustObservation;
    }

    /** 
     * Set the 'OperationsCustObservation' element value. Операции, при которых осуществляется таможенное наблюдение.1 - перевозка товаров и транспортных средств, 2 - грузовые операции, 3 - прочее
     * 
     * @param operationsCustObservation
     */
    public void setOperationsCustObservation(String operationsCustObservation) {
        this.operationsCustObservation = operationsCustObservation;
    }

    /** 
     * Get the list of 'ProcessDescriptionResults' element items. Описание процесса таможенного наблюдения и его результаты
     * 
     * @return list
     */
    public List<String> getProcessDescriptionResultList() {
        return processDescriptionResultList;
    }

    /** 
     * Set the list of 'ProcessDescriptionResults' element items. Описание процесса таможенного наблюдения и его результаты
     * 
     * @param list
     */
    public void setProcessDescriptionResultList(List<String> list) {
        processDescriptionResultList = list;
    }

    /** 
     * Get the 'AddiSheetsNumber' element value. Количество дополнительных листов
     * 
     * @return value
     */
    public String getAddiSheetsNumber() {
        return addiSheetsNumber;
    }

    /** 
     * Set the 'AddiSheetsNumber' element value. Количество дополнительных листов
     * 
     * @param addiSheetsNumber
     */
    public void setAddiSheetsNumber(String addiSheetsNumber) {
        this.addiSheetsNumber = addiSheetsNumber;
    }

    /** 
     * Get the 'Application' element value. Описание приложений к акту
     * 
     * @return value
     */
    public String getApplication() {
        return application;
    }

    /** 
     * Set the 'Application' element value. Описание приложений к акту
     * 
     * @param application
     */
    public void setApplication(String application) {
        this.application = application;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'ObservationPlace' element value. Место проведения таможенного наблюдения 
     * 
     * @return value
     */
    public ObservationPlaceType getObservationPlace() {
        return observationPlace;
    }

    /** 
     * Set the 'ObservationPlace' element value. Место проведения таможенного наблюдения 
     * 
     * @param observationPlace
     */
    public void setObservationPlace(ObservationPlaceType observationPlace) {
        this.observationPlace = observationPlace;
    }

    /** 
     * Get the list of 'ApplicationTMCC' element items. Применяемые ТСТК
     * 
     * @return list
     */
    public List<ApplicationTMCCType> getApplicationTMCCList() {
        return applicationTMCCList;
    }

    /** 
     * Set the list of 'ApplicationTMCC' element items. Применяемые ТСТК
     * 
     * @param list
     */
    public void setApplicationTMCCList(List<ApplicationTMCCType> list) {
        applicationTMCCList = list;
    }

    /** 
     * Get the list of 'CustomsPerson' element items. Должностное лицо таможенного органа
     * 
     * @return list
     */
    public List<CustomsPersonType> getCustomsPersonList() {
        return customsPersonList;
    }

    /** 
     * Set the list of 'CustomsPerson' element items. Должностное лицо таможенного органа
     * 
     * @param list
     */
    public void setCustomsPersonList(List<CustomsPersonType> list) {
        customsPersonList = list;
    }

    /** 
     * Get the list of 'PersonsInvolvedOperation' element items. Лица, осуществляющие операции 
     * 
     * @return list
     */
    public List<PersonBaseType> getPersonsInvolvedOperationList() {
        return personsInvolvedOperationList;
    }

    /** 
     * Set the list of 'PersonsInvolvedOperation' element items. Лица, осуществляющие операции 
     * 
     * @param list
     */
    public void setPersonsInvolvedOperationList(List<PersonBaseType> list) {
        personsInvolvedOperationList = list;
    }

    /** 
     * Get the list of 'AddSheet' element items. Дополнительный лист к акту таможенного наблюдения
     * 
     * @return list
     */
    public List<AddSheetType> getAddSheetList() {
        return addSheetList;
    }

    /** 
     * Set the list of 'AddSheet' element items. Дополнительный лист к акту таможенного наблюдения
     * 
     * @param list
     */
    public void setAddSheetList(List<AddSheetType> list) {
        addSheetList = list;
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
