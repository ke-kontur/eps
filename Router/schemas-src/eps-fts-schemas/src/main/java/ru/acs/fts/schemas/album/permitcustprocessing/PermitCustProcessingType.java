
package ru.acs.fts.schemas.album.permitcustprocessing;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.BaseTreatmentDocsType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.TreatmentOrganizationType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.TreatmentType;

/** 
 * Разрешение на переработку товаров на таможенной территории
 */
public class PermitCustProcessingType extends BaseDocType
{
    private String permitNumber;
    private LocalDate sendDate;
    private List<String> commentList = new ArrayList<String>();
    private String basicPermitNumber;
    private String treatmentProcedureCode;
    private LocalDate permitPeriodDate;
    private String supplyStatus;
    private List<String> custProcedureWasteList = new ArrayList<String>();
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private PermitPropertiesType permitProperties;
    private TreatmentOrganizationType declarant;
    private TreatmentType treatment;
    private CustomsType goodsInCustoms;
    private CustomsType goodsOutCustoms;
    private List<BaseTreatmentDocsType> contractList = new ArrayList<BaseTreatmentDocsType>();
    private DecisionTransferType decisionTransfer;
    private String documentModeID;

    /** 
     * Get the 'PermitNumber' element value. Номер разрешения на переработку на таможенной территории
     * 
     * @return value
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    /** 
     * Set the 'PermitNumber' element value. Номер разрешения на переработку на таможенной территории
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
     * Get the 'BasicPermitNumber' element value. Номер основного разрешения на переработку на таможенной территории (в случае подачи дополнения к разрешению)
     * 
     * @return value
     */
    public String getBasicPermitNumber() {
        return basicPermitNumber;
    }

    /** 
     * Set the 'BasicPermitNumber' element value. Номер основного разрешения на переработку на таможенной территории (в случае подачи дополнения к разрешению)
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
     * Get the 'SupplyStatus' element value. Опережающая поставка продуктов переработки.
     * 
     * @return value
     */
    public String getSupplyStatus() {
        return supplyStatus;
    }

    /** 
     * Set the 'SupplyStatus' element value. Опережающая поставка продуктов переработки.
     * 
     * @param supplyStatus
     */
    public void setSupplyStatus(String supplyStatus) {
        this.supplyStatus = supplyStatus;
    }

    /** 
     * Get the list of 'CustProcedureWaste' element items. Отходы подлежат помещению под таможенную процедуру
     * 
     * @return list
     */
    public List<String> getCustProcedureWasteList() {
        return custProcedureWasteList;
    }

    /** 
     * Set the list of 'CustProcedureWaste' element items. Отходы подлежат помещению под таможенную процедуру
     * 
     * @param list
     */
    public void setCustProcedureWasteList(List<String> list) {
        custProcedureWasteList = list;
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
     * Get the 'PermitProperties' element value. Реквизиты разрешения таможни на передачу разрешения на переработку иному лицу
     * 
     * @return value
     */
    public PermitPropertiesType getPermitProperties() {
        return permitProperties;
    }

    /** 
     * Set the 'PermitProperties' element value. Реквизиты разрешения таможни на передачу разрешения на переработку иному лицу
     * 
     * @param permitProperties
     */
    public void setPermitProperties(PermitPropertiesType permitProperties) {
        this.permitProperties = permitProperties;
    }

    /** 
     * Get the 'Declarant' element value. Организация, получившая разрешение на переработку
     * 
     * @return value
     */
    public TreatmentOrganizationType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Организация, получившая разрешение на переработку
     * 
     * @param declarant
     */
    public void setDeclarant(TreatmentOrganizationType declarant) {
        this.declarant = declarant;
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
     * Get the 'GoodsInCustoms' element value. Таможня ввоза товаров для переработки
     * 
     * @return value
     */
    public CustomsType getGoodsInCustoms() {
        return goodsInCustoms;
    }

    /** 
     * Set the 'GoodsInCustoms' element value. Таможня ввоза товаров для переработки
     * 
     * @param goodsInCustoms
     */
    public void setGoodsInCustoms(CustomsType goodsInCustoms) {
        this.goodsInCustoms = goodsInCustoms;
    }

    /** 
     * Get the 'GoodsOutCustoms' element value. Таможня вывоза  готовой продукции
     * 
     * @return value
     */
    public CustomsType getGoodsOutCustoms() {
        return goodsOutCustoms;
    }

    /** 
     * Set the 'GoodsOutCustoms' element value. Таможня вывоза  готовой продукции
     * 
     * @param goodsOutCustoms
     */
    public void setGoodsOutCustoms(CustomsType goodsOutCustoms) {
        this.goodsOutCustoms = goodsOutCustoms;
    }

    /** 
     * Get the list of 'Contract' element items. Контракт или иной документ на переработку
     * 
     * @return list
     */
    public List<BaseTreatmentDocsType> getContractList() {
        return contractList;
    }

    /** 
     * Set the list of 'Contract' element items. Контракт или иной документ на переработку
     * 
     * @param list
     */
    public void setContractList(List<BaseTreatmentDocsType> list) {
        contractList = list;
    }

    /** 
     * Get the 'DecisionTransfer' element value. Решение о передаче  разрешения на переработку товаров.
     * 
     * @return value
     */
    public DecisionTransferType getDecisionTransfer() {
        return decisionTransfer;
    }

    /** 
     * Set the 'DecisionTransfer' element value. Решение о передаче  разрешения на переработку товаров.
     * 
     * @param decisionTransfer
     */
    public void setDecisionTransfer(DecisionTransferType decisionTransfer) {
        this.decisionTransfer = decisionTransfer;
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
