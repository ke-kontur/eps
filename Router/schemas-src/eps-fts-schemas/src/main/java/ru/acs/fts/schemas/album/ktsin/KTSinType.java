
package ru.acs.fts.schemas.album.ktsin;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADCustomsRepresentativeType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADFilledPersonType;
import ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust.KTSPaymentsReCalcType;

/** 
 * Корректировка таможенной стоимости и таможенных платежей. Внутренний формат
 */
public class KTSinType extends BaseDocType
{
    private String GTDDocumentID;
    private LocalDate KTSPresentDate;
    private String decisionCode;
    private LocalDate deadLineDate;
    private String KTSNumber;
    private String adjustment;
    private String declarationKind;
    private String currencyCode;
    private String electronicDocumentSign;
    private LocalDate executionDate;
    private KTSinGoodsShipmentType KTSinGoodsShipment;
    private ESADFilledPersonType KTSinFilledPerson;
    private KTSinTechMarksType KTSinTechMarks;
    private List<KTSPaymentsReCalcType> KTSPaymentsReCalcList = new ArrayList<KTSPaymentsReCalcType>();
    private GTDIDType GTDNumber;
    private CUESADCustomsRepresentativeType customsRepresentative;
    private String documentModeID;

    /** 
     * Get the 'GTDDocumentID' element value. Уникальный идентификатор ДТ.  Используется для привязки к ДТ при представлении КТС отдельно от ДТ.
     * 
     * @return value
     */
    public String getGTDDocumentID() {
        return GTDDocumentID;
    }

    /** 
     * Set the 'GTDDocumentID' element value. Уникальный идентификатор ДТ.  Используется для привязки к ДТ при представлении КТС отдельно от ДТ.
     * 
     * @param GTDDocumentID
     */
    public void setGTDDocumentID(String GTDDocumentID) {
        this.GTDDocumentID = GTDDocumentID;
    }

    /** 
     * Get the 'KTSPresentDate' element value. Дата представления документов декларантом, срок корректировки.
     * 
     * @return value
     */
    public LocalDate getKTSPresentDate() {
        return KTSPresentDate;
    }

    /** 
     * Set the 'KTSPresentDate' element value. Дата представления документов декларантом, срок корректировки.
     * 
     * @param KTSPresentDate
     */
    public void setKTSPresentDate(LocalDate KTSPresentDate) {
        this.KTSPresentDate = KTSPresentDate;
    }

    /** 
     * Get the 'DecisionCode' element value. Код решения об аннулировании или отзыве КТС
     * 
     * @return value
     */
    public String getDecisionCode() {
        return decisionCode;
    }

    /** 
     * Set the 'DecisionCode' element value. Код решения об аннулировании или отзыве КТС
     * 
     * @param decisionCode
     */
    public void setDecisionCode(String decisionCode) {
        this.decisionCode = decisionCode;
    }

    /** 
     * Get the 'DeadLineDate' element value. Дата истечения срока предоставления дополнительных документов и сведений в соответствии с запросом таможенного органа.
     * 
     * @return value
     */
    public LocalDate getDeadLineDate() {
        return deadLineDate;
    }

    /** 
     * Set the 'DeadLineDate' element value. Дата истечения срока предоставления дополнительных документов и сведений в соответствии с запросом таможенного органа.
     * 
     * @param deadLineDate
     */
    public void setDeadLineDate(LocalDate deadLineDate) {
        this.deadLineDate = deadLineDate;
    }

    /** 
     * Get the 'KTSNumber' element value. Номер КТС по порядку
     * 
     * @return value
     */
    public String getKTSNumber() {
        return KTSNumber;
    }

    /** 
     * Set the 'KTSNumber' element value. Номер КТС по порядку
     * 
     * @param KTSNumber
     */
    public void setKTSNumber(String KTSNumber) {
        this.KTSNumber = KTSNumber;
    }

    /** 
     * Get the 'Adjustment' element value. Тип корректировки. 1- тип корректировки совпадает для всех товаров, 0 - не совпадает
     * 
     * @return value
     */
    public String getAdjustment() {
        return adjustment;
    }

    /** 
     * Set the 'Adjustment' element value. Тип корректировки. 1- тип корректировки совпадает для всех товаров, 0 - не совпадает
     * 
     * @param adjustment
     */
    public void setAdjustment(String adjustment) {
        this.adjustment = adjustment;
    }

    /** 
     * Get the 'DeclarationKind' element value. Код особенности декларирования товаров по Классификатору особенностей таможенного декларирования товаров. Гр.7 
     * 
     * @return value
     */
    public String getDeclarationKind() {
        return declarationKind;
    }

    /** 
     * Set the 'DeclarationKind' element value. Код особенности декларирования товаров по Классификатору особенностей таможенного декларирования товаров. Гр.7 
     * 
     * @param declarationKind
     */
    public void setDeclarationKind(String declarationKind) {
        this.declarationKind = declarationKind;
    }

    /** 
     * Get the 'CurrencyCode' element value. Буквенный код национальной валюты в соответствии с Классификатором валют.
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Буквенный код национальной валюты в соответствии с Классификатором валют.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'ElectronicDocumentSign' element value. Признак использования КТС в форме электронного документа. ЭД.
     * 
     * @return value
     */
    public String getElectronicDocumentSign() {
        return electronicDocumentSign;
    }

    /** 
     * Set the 'ElectronicDocumentSign' element value. Признак использования КТС в форме электронного документа. ЭД.
     * 
     * @param electronicDocumentSign
     */
    public void setElectronicDocumentSign(String electronicDocumentSign) {
        this.electronicDocumentSign = electronicDocumentSign;
    }

    /** 
     * Get the 'ExecutionDate' element value. Дата составления (представления)
     * 
     * @return value
     */
    public LocalDate getExecutionDate() {
        return executionDate;
    }

    /** 
     * Set the 'ExecutionDate' element value. Дата составления (представления)
     * 
     * @param executionDate
     */
    public void setExecutionDate(LocalDate executionDate) {
        this.executionDate = executionDate;
    }

    /** 
     * Get the 'KTSinGoodsShipment' element value. КТС. Внутренний формат. Сведения о товарной партии.
     * 
     * @return value
     */
    public KTSinGoodsShipmentType getKTSinGoodsShipment() {
        return KTSinGoodsShipment;
    }

    /** 
     * Set the 'KTSinGoodsShipment' element value. КТС. Внутренний формат. Сведения о товарной партии.
     * 
     * @param KTSinGoodsShipment
     */
    public void setKTSinGoodsShipment(KTSinGoodsShipmentType KTSinGoodsShipment) {
        this.KTSinGoodsShipment = KTSinGoodsShipment;
    }

    /** 
     * Get the 'KTSinFilledPerson' element value. КТС. Внутренний формат. Сведения о лице, заполнившем КТС.
     * 
     * @return value
     */
    public ESADFilledPersonType getKTSinFilledPerson() {
        return KTSinFilledPerson;
    }

    /** 
     * Set the 'KTSinFilledPerson' element value. КТС. Внутренний формат. Сведения о лице, заполнившем КТС.
     * 
     * @param KTSinFilledPerson
     */
    public void setKTSinFilledPerson(ESADFilledPersonType KTSinFilledPerson) {
        this.KTSinFilledPerson = KTSinFilledPerson;
    }

    /** 
     * Get the 'KTSinTechMarks' element value. КТС. Внутренний формат. Технологические отметки.
     * 
     * @return value
     */
    public KTSinTechMarksType getKTSinTechMarks() {
        return KTSinTechMarks;
    }

    /** 
     * Set the 'KTSinTechMarks' element value. КТС. Внутренний формат. Технологические отметки.
     * 
     * @param KTSinTechMarks
     */
    public void setKTSinTechMarks(KTSinTechMarksType KTSinTechMarks) {
        this.KTSinTechMarks = KTSinTechMarks;
    }

    /** 
     * Get the list of 'KTSPaymentsReCalc' element items. Перерасчет платежей
     * 
     * @return list
     */
    public List<KTSPaymentsReCalcType> getKTSPaymentsReCalcList() {
        return KTSPaymentsReCalcList;
    }

    /** 
     * Set the list of 'KTSPaymentsReCalc' element items. Перерасчет платежей
     * 
     * @param list
     */
    public void setKTSPaymentsReCalcList(List<KTSPaymentsReCalcType> list) {
        KTSPaymentsReCalcList = list;
    }

    /** 
     * Get the 'GTDNumber' element value. Регистрационный номер ДТ. Используется для привязки к ДТ при представлении КТС отдельно от ДТ.
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. Регистрационный номер ДТ. Используется для привязки к ДТ при представлении КТС отдельно от ДТ.
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }

    /** 
     * Get the 'CustomsRepresentative' element value. Таможенный представитель
     * 
     * @return value
     */
    public CUESADCustomsRepresentativeType getCustomsRepresentative() {
        return customsRepresentative;
    }

    /** 
     * Set the 'CustomsRepresentative' element value. Таможенный представитель
     * 
     * @param customsRepresentative
     */
    public void setCustomsRepresentative(
            CUESADCustomsRepresentativeType customsRepresentative) {
        this.customsRepresentative = customsRepresentative;
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
