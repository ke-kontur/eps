
package ru.acs.fts.schemas.album.permitinotreatment;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.BaseTreatmentDocsType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.TreatmentType;

/** 
 * Разрешение на переработку товаров вне таможенной территории
 */
public class PermitInoTreatmentType extends BaseDocType
{
    private String permitNumber;
    private LocalDate sendDate;
    private List<String> commentList = new ArrayList<String>();
    private String basicPermitNumber;
    private String treatmentProcedureCode;
    private LocalDate permitPeriodDate;
    private String treatmentCountry;
    private String regionalCustoms;
    private PermitHolderType permitHolder;
    private TreatmentType treatment;
    private List<BaseTreatmentDocsType> baseTreatmentDocList = new ArrayList<BaseTreatmentDocsType>();
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private CustomsType customsInWaste;
    private CustomsType customsInHells;
    private List<DocumentBaseType> documentIDInfoList = new ArrayList<DocumentBaseType>();
    private PersonSignatureType signature;
    private String documentModeID;

    /** 
     * Get the 'PermitNumber' element value. Номер разрешения на переработку вне таможенной территории
     * 
     * @return value
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    /** 
     * Set the 'PermitNumber' element value. Номер разрешения на переработку вне таможенной территории
     * 
     * @param permitNumber
     */
    public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }

    /** 
     * Get the 'SendDate' element value. Дата направления
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. Дата направления
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the list of 'Comments' element items. Особые отметки таможни
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comments' element items. Особые отметки таможни
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }

    /** 
     * Get the 'BasicPermitNumber' element value. Номер основного разрешения на переработку вне таможенной территории (в случае подачи дополнения к разрешению)
     * 
     * @return value
     */
    public String getBasicPermitNumber() {
        return basicPermitNumber;
    }

    /** 
     * Set the 'BasicPermitNumber' element value. Номер основного разрешения на переработку вне таможенной территории (в случае подачи дополнения к разрешению)
     * 
     * @param basicPermitNumber
     */
    public void setBasicPermitNumber(String basicPermitNumber) {
        this.basicPermitNumber = basicPermitNumber;
    }

    /** 
     * Get the 'TreatmentProcedureCode' element value. Код режима переработки
     * 
     * @return value
     */
    public String getTreatmentProcedureCode() {
        return treatmentProcedureCode;
    }

    /** 
     * Set the 'TreatmentProcedureCode' element value. Код режима переработки
     * 
     * @param treatmentProcedureCode
     */
    public void setTreatmentProcedureCode(String treatmentProcedureCode) {
        this.treatmentProcedureCode = treatmentProcedureCode;
    }

    /** 
     * Get the 'PermitPeriodDate' element value. Дата действия разрешения
     * 
     * @return value
     */
    public LocalDate getPermitPeriodDate() {
        return permitPeriodDate;
    }

    /** 
     * Set the 'PermitPeriodDate' element value. Дата действия разрешения
     * 
     * @param permitPeriodDate
     */
    public void setPermitPeriodDate(LocalDate permitPeriodDate) {
        this.permitPeriodDate = permitPeriodDate;
    }

    /** 
     * Get the 'TreatmentCountry' element value. Цифровой код страны переработки
     * 
     * @return value
     */
    public String getTreatmentCountry() {
        return treatmentCountry;
    }

    /** 
     * Set the 'TreatmentCountry' element value. Цифровой код страны переработки
     * 
     * @param treatmentCountry
     */
    public void setTreatmentCountry(String treatmentCountry) {
        this.treatmentCountry = treatmentCountry;
    }

    /** 
     * Get the 'RegionalCustoms' element value. Наименование регионального таможенного управления
     * 
     * @return value
     */
    public String getRegionalCustoms() {
        return regionalCustoms;
    }

    /** 
     * Set the 'RegionalCustoms' element value. Наименование регионального таможенного управления
     * 
     * @param regionalCustoms
     */
    public void setRegionalCustoms(String regionalCustoms) {
        this.regionalCustoms = regionalCustoms;
    }

    /** 
     * Get the 'PermitHolder' element value. Лицо, которому выдано разрешение
     * 
     * @return value
     */
    public PermitHolderType getPermitHolder() {
        return permitHolder;
    }

    /** 
     * Set the 'PermitHolder' element value. Лицо, которому выдано разрешение
     * 
     * @param permitHolder
     */
    public void setPermitHolder(PermitHolderType permitHolder) {
        this.permitHolder = permitHolder;
    }

    /** 
     * Get the 'Treatment' element value. Описание переработки
     * 
     * @return value
     */
    public TreatmentType getTreatment() {
        return treatment;
    }

    /** 
     * Set the 'Treatment' element value. Описание переработки
     * 
     * @param treatment
     */
    public void setTreatment(TreatmentType treatment) {
        this.treatment = treatment;
    }

    /** 
     * Get the list of 'BaseTreatmentDocs' element items. Контракт или иные документы, в соответствии с которыми вывозятся на переработку товары
     * 
     * @return list
     */
    public List<BaseTreatmentDocsType> getBaseTreatmentDocList() {
        return baseTreatmentDocList;
    }

    /** 
     * Set the list of 'BaseTreatmentDocs' element items. Контракт или иные документы, в соответствии с которыми вывозятся на переработку товары
     * 
     * @param list
     */
    public void setBaseTreatmentDocList(List<BaseTreatmentDocsType> list) {
        baseTreatmentDocList = list;
    }

    /** 
     * Get the 'Customs' element value. Таможенный орган
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Таможенный орган
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'CustomsInWaste' element value. Таможня ввоза отходов
     * 
     * @return value
     */
    public CustomsType getCustomsInWaste() {
        return customsInWaste;
    }

    /** 
     * Set the 'CustomsInWaste' element value. Таможня ввоза отходов
     * 
     * @param customsInWaste
     */
    public void setCustomsInWaste(CustomsType customsInWaste) {
        this.customsInWaste = customsInWaste;
    }

    /** 
     * Get the 'CustomsInHells' element value. Таможня ввоза остатков
     * 
     * @return value
     */
    public CustomsType getCustomsInHells() {
        return customsInHells;
    }

    /** 
     * Set the 'CustomsInHells' element value. Таможня ввоза остатков
     * 
     * @param customsInHells
     */
    public void setCustomsInHells(CustomsType customsInHells) {
        this.customsInHells = customsInHells;
    }

    /** 
     * Get the list of 'DocumentIDInfo' element items. Сведения о документах,  подтверждающих совершение операций по переработке
     * 
     * @return list
     */
    public List<DocumentBaseType> getDocumentIDInfoList() {
        return documentIDInfoList;
    }

    /** 
     * Set the list of 'DocumentIDInfo' element items. Сведения о документах,  подтверждающих совершение операций по переработке
     * 
     * @param list
     */
    public void setDocumentIDInfoList(List<DocumentBaseType> list) {
        documentIDInfoList = list;
    }

    /** 
     * Get the 'Signature' element value. ФИО начальника таможни, куда передается заявление 
     * 
     * @return value
     */
    public PersonSignatureType getSignature() {
        return signature;
    }

    /** 
     * Set the 'Signature' element value. ФИО начальника таможни, куда передается заявление 
     * 
     * @param signature
     */
    public void setSignature(PersonSignatureType signature) {
        this.signature = signature;
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
