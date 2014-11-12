
package ru.acs.fts.schemas.album.guaranteecontractaddition;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Дополнение к договору поручительства
 */
public class GuaranteeContractAdditionType extends BaseDocType
{
    private String dutyAmount;
    private String currencyCode;
    private LocalDate validityDate;
    private OrganizationInfoType guarantor;
    private OrganizationInfoType paymentProvider;
    private OrganizationInfoType declarant;
    private DocumentInfoType transportDocument;
    private DocumentBaseType guaranteeDocument;
    private List<DocumentInfoType> commercialDocumentList = new ArrayList<DocumentInfoType>();
    private CUCustomsType arrivalCustoms;
    private CUCustomsType depatureCustoms;
    private GTDIDType regNumberDT;
    private String documentModeID;

    /** 
     * Get the 'DutyAmount' element value. Сумма обеспечения таможенных пошлин и налогов
     * 
     * @return value
     */
    public String getDutyAmount() {
        return dutyAmount;
    }

    /** 
     * Set the 'DutyAmount' element value. Сумма обеспечения таможенных пошлин и налогов
     * 
     * @param dutyAmount
     */
    public void setDutyAmount(String dutyAmount) {
        this.dutyAmount = dutyAmount;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты обеспечения
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты обеспечения
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'ValidityDate' element value. Cрок, до истечения которого возможно использование дополнения в целях обеспечения уплаты таможенных пошлин, налогов при таможенном транзите товаров.
     * 
     * @return value
     */
    public LocalDate getValidityDate() {
        return validityDate;
    }

    /** 
     * Set the 'ValidityDate' element value. Cрок, до истечения которого возможно использование дополнения в целях обеспечения уплаты таможенных пошлин, налогов при таможенном транзите товаров.
     * 
     * @param validityDate
     */
    public void setValidityDate(LocalDate validityDate) {
        this.validityDate = validityDate;
    }

    /** 
     * Get the 'Guarantor' element value. Сведения о поручителе
     * 
     * @return value
     */
    public OrganizationInfoType getGuarantor() {
        return guarantor;
    }

    /** 
     * Set the 'Guarantor' element value. Сведения о поручителе
     * 
     * @param guarantor
     */
    public void setGuarantor(OrganizationInfoType guarantor) {
        this.guarantor = guarantor;
    }

    /** 
     * Get the 'PaymentProvider' element value. Сведения о лице, предоставившем обеспечение уплаты таможенных пошлин, налогов 
     * 
     * @return value
     */
    public OrganizationInfoType getPaymentProvider() {
        return paymentProvider;
    }

    /** 
     * Set the 'PaymentProvider' element value. Сведения о лице, предоставившем обеспечение уплаты таможенных пошлин, налогов 
     * 
     * @param paymentProvider
     */
    public void setPaymentProvider(OrganizationInfoType paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    /** 
     * Get the 'Declarant' element value. Сведения о декларанте
     * 
     * @return value
     */
    public OrganizationInfoType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Сведения о декларанте
     * 
     * @param declarant
     */
    public void setDeclarant(OrganizationInfoType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'TransportDocument' element value. Сведения о транспортном (перевозочном) документе
     * 
     * @return value
     */
    public DocumentInfoType getTransportDocument() {
        return transportDocument;
    }

    /** 
     * Set the 'TransportDocument' element value. Сведения о транспортном (перевозочном) документе
     * 
     * @param transportDocument
     */
    public void setTransportDocument(DocumentInfoType transportDocument) {
        this.transportDocument = transportDocument;
    }

    /** 
     * Get the 'GuaranteeDocument' element value. Cведения о договоре поручительства
     * 
     * @return value
     */
    public DocumentBaseType getGuaranteeDocument() {
        return guaranteeDocument;
    }

    /** 
     * Set the 'GuaranteeDocument' element value. Cведения о договоре поручительства
     * 
     * @param guaranteeDocument
     */
    public void setGuaranteeDocument(DocumentBaseType guaranteeDocument) {
        this.guaranteeDocument = guaranteeDocument;
    }

    /** 
     * Get the list of 'CommercialDocument' element items. Сведения о коммерческом документе
     * 
     * @return list
     */
    public List<DocumentInfoType> getCommercialDocumentList() {
        return commercialDocumentList;
    }

    /** 
     * Set the list of 'CommercialDocument' element items. Сведения о коммерческом документе
     * 
     * @param list
     */
    public void setCommercialDocumentList(List<DocumentInfoType> list) {
        commercialDocumentList = list;
    }

    /** 
     * Get the 'ArrivalCustoms' element value. Таможенный орган назначения
     * 
     * @return value
     */
    public CUCustomsType getArrivalCustoms() {
        return arrivalCustoms;
    }

    /** 
     * Set the 'ArrivalCustoms' element value. Таможенный орган назначения
     * 
     * @param arrivalCustoms
     */
    public void setArrivalCustoms(CUCustomsType arrivalCustoms) {
        this.arrivalCustoms = arrivalCustoms;
    }

    /** 
     * Get the 'DepatureCustoms' element value. Таможенный орган отправления
     * 
     * @return value
     */
    public CUCustomsType getDepatureCustoms() {
        return depatureCustoms;
    }

    /** 
     * Set the 'DepatureCustoms' element value. Таможенный орган отправления
     * 
     * @param depatureCustoms
     */
    public void setDepatureCustoms(CUCustomsType depatureCustoms) {
        this.depatureCustoms = depatureCustoms;
    }

    /** 
     * Get the 'RegNumberDT' element value. Регистрационный номер таможенной декларации
     * 
     * @return value
     */
    public GTDIDType getRegNumberDT() {
        return regNumberDT;
    }

    /** 
     * Set the 'RegNumberDT' element value. Регистрационный номер таможенной декларации
     * 
     * @param regNumberDT
     */
    public void setRegNumberDT(GTDIDType regNumberDT) {
        this.regNumberDT = regNumberDT;
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
