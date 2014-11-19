
package ru.acs.fts.schemas.album.ktsout_cu;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADCustomsRepresentativeType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADFilledPersonType;
import ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust.KTSPaymentsReCalcType;

/** 
 * Электронная копия формы корректировки таможенной стоимости и таможенных платежей
 */
public class KTSoutCUType extends BaseDocType
{
    private String DTDocumentID;
    private String declarationKind;
    private String subsoilSign;
    private String KTSNumber;
    private String currencyCode;
    private String electronicDocumentSign;
    private String adjustment;
    private String regNumberDoc;
    private LocalDate executionDate;
    private String securityLabelCode;
    private KTSoutCUGoodsShipmentType KTSoutCUGoodsShipment;
    private GTDIDType DTNumber;
    private List<KTSPaymentsReCalcType> KTSoutPaymentsReCalcList = new ArrayList<KTSPaymentsReCalcType>();
    private KTSCUConsignorType KTSCUConsignor;
    private KTSCUConsigneeType KTSCUConsignee;
    private KTSCUDeclarantType KTSCUDeclarant;
    private ESADFilledPersonType filledPerson;
    private CUESADCustomsRepresentativeType customsRepresentative;
    private String documentModeID;

    /** 
     * Get the 'DTDocumentID' element value. Уникальный идентификатор ДТ.  Используется для привязки к ДТ при представлении КТС отдельно от ДТ
     * 
     * @return value
     */
    public String getDTDocumentID() {
        return DTDocumentID;
    }

    /** 
     * Set the 'DTDocumentID' element value. Уникальный идентификатор ДТ.  Используется для привязки к ДТ при представлении КТС отдельно от ДТ
     * 
     * @param DTDocumentID
     */
    public void setDTDocumentID(String DTDocumentID) {
        this.DTDocumentID = DTDocumentID;
    }

    /** 
     * Get the 'DeclarationKind' element value. Код особенности декларирования товаров по классификатору особенностей таможенного декларирования товаров. Гр.7 
     * 
     * @return value
     */
    public String getDeclarationKind() {
        return declarationKind;
    }

    /** 
     * Set the 'DeclarationKind' element value. Код особенности декларирования товаров по классификатору особенностей таможенного декларирования товаров. Гр.7 
     * 
     * @param declarationKind
     */
    public void setDeclarationKind(String declarationKind) {
        this.declarationKind = declarationKind;
    }

    /** 
     * Get the 'SubsoilSign' element value. Признак недропользователя. для РК
     * 
     * @return value
     */
    public String getSubsoilSign() {
        return subsoilSign;
    }

    /** 
     * Set the 'SubsoilSign' element value. Признак недропользователя. для РК
     * 
     * @param subsoilSign
     */
    public void setSubsoilSign(String subsoilSign) {
        this.subsoilSign = subsoilSign;
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
     * Get the 'CurrencyCode' element value. Буквенный код национальной валюты в соответствии с классификатором валют
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Буквенный код национальной валюты в соответствии с классификатором валют
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'ElectronicDocumentSign' element value. Признак использования КТС в форме электронного документа. ЭД
     * 
     * @return value
     */
    public String getElectronicDocumentSign() {
        return electronicDocumentSign;
    }

    /** 
     * Set the 'ElectronicDocumentSign' element value. Признак использования КТС в форме электронного документа. ЭД
     * 
     * @param electronicDocumentSign
     */
    public void setElectronicDocumentSign(String electronicDocumentSign) {
        this.electronicDocumentSign = electronicDocumentSign;
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
     * Get the 'RegNumberDoc' element value. Исходящий номер регистрации документов в соответствии с системой (регламентом) учета исходящих документов декларанта или таможенного представителя  в Республике Беларусь
     * 
     * @return value
     */
    public String getRegNumberDoc() {
        return regNumberDoc;
    }

    /** 
     * Set the 'RegNumberDoc' element value. Исходящий номер регистрации документов в соответствии с системой (регламентом) учета исходящих документов декларанта или таможенного представителя  в Республике Беларусь
     * 
     * @param regNumberDoc
     */
    public void setRegNumberDoc(String regNumberDoc) {
        this.regNumberDoc = regNumberDoc;
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
     * Get the 'SecurityLabelCode' element value. Код защитной наклейки для РК
     * 
     * @return value
     */
    public String getSecurityLabelCode() {
        return securityLabelCode;
    }

    /** 
     * Set the 'SecurityLabelCode' element value. Код защитной наклейки для РК
     * 
     * @param securityLabelCode
     */
    public void setSecurityLabelCode(String securityLabelCode) {
        this.securityLabelCode = securityLabelCode;
    }

    /** 
     * Get the 'KTSout_CUGoodsShipment' element value. Сведения о товарной партии
     * 
     * @return value
     */
    public KTSoutCUGoodsShipmentType getKTSoutCUGoodsShipment() {
        return KTSoutCUGoodsShipment;
    }

    /** 
     * Set the 'KTSout_CUGoodsShipment' element value. Сведения о товарной партии
     * 
     * @param KTSoutCUGoodsShipment
     */
    public void setKTSoutCUGoodsShipment(
            KTSoutCUGoodsShipmentType KTSoutCUGoodsShipment) {
        this.KTSoutCUGoodsShipment = KTSoutCUGoodsShipment;
    }

    /** 
     * Get the 'DTNumber' element value. Регистрационный номер ДТ. Используется для привязки к ДТ при представлении КТС отдельно от ДТ
     * 
     * @return value
     */
    public GTDIDType getDTNumber() {
        return DTNumber;
    }

    /** 
     * Set the 'DTNumber' element value. Регистрационный номер ДТ. Используется для привязки к ДТ при представлении КТС отдельно от ДТ
     * 
     * @param DTNumber
     */
    public void setDTNumber(GTDIDType DTNumber) {
        this.DTNumber = DTNumber;
    }

    /** 
     * Get the list of 'KTSoutPaymentsReCalc' element items. Перерасчет платежей гр В
     * 
     * @return list
     */
    public List<KTSPaymentsReCalcType> getKTSoutPaymentsReCalcList() {
        return KTSoutPaymentsReCalcList;
    }

    /** 
     * Set the list of 'KTSoutPaymentsReCalc' element items. Перерасчет платежей гр В
     * 
     * @param list
     */
    public void setKTSoutPaymentsReCalcList(List<KTSPaymentsReCalcType> list) {
        KTSoutPaymentsReCalcList = list;
    }

    /** 
     * Get the 'KTSCUConsignor' element value. Сведения об отправителе товаров.(за исключением РФ) гр 2
     * 
     * @return value
     */
    public KTSCUConsignorType getKTSCUConsignor() {
        return KTSCUConsignor;
    }

    /** 
     * Set the 'KTSCUConsignor' element value. Сведения об отправителе товаров.(за исключением РФ) гр 2
     * 
     * @param KTSCUConsignor
     */
    public void setKTSCUConsignor(KTSCUConsignorType KTSCUConsignor) {
        this.KTSCUConsignor = KTSCUConsignor;
    }

    /** 
     * Get the 'KTSCUConsignee' element value. Сведения о получателе товаров.(за исключением РФ) гр 8
     * 
     * @return value
     */
    public KTSCUConsigneeType getKTSCUConsignee() {
        return KTSCUConsignee;
    }

    /** 
     * Set the 'KTSCUConsignee' element value. Сведения о получателе товаров.(за исключением РФ) гр 8
     * 
     * @param KTSCUConsignee
     */
    public void setKTSCUConsignee(KTSCUConsigneeType KTSCUConsignee) {
        this.KTSCUConsignee = KTSCUConsignee;
    }

    /** 
     * Get the 'KTSCUDeclarant' element value. Сведения о декларанте товаров.(за исключением РФ) гр 14
     * 
     * @return value
     */
    public KTSCUDeclarantType getKTSCUDeclarant() {
        return KTSCUDeclarant;
    }

    /** 
     * Set the 'KTSCUDeclarant' element value. Сведения о декларанте товаров.(за исключением РФ) гр 14
     * 
     * @param KTSCUDeclarant
     */
    public void setKTSCUDeclarant(KTSCUDeclarantType KTSCUDeclarant) {
        this.KTSCUDeclarant = KTSCUDeclarant;
    }

    /** 
     * Get the 'FilledPerson' element value. Сведения о лице, заполнившем документ
     * 
     * @return value
     */
    public ESADFilledPersonType getFilledPerson() {
        return filledPerson;
    }

    /** 
     * Set the 'FilledPerson' element value. Сведения о лице, заполнившем документ
     * 
     * @param filledPerson
     */
    public void setFilledPerson(ESADFilledPersonType filledPerson) {
        this.filledPerson = filledPerson;
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
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа (код документа по Альбому форматов)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа (код документа по Альбому форматов)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
