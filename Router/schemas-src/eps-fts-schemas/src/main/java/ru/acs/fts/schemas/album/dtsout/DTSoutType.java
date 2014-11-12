
package ru.acs.fts.schemas.album.dtsout;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DeliveryTermsRUType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.CostConfirmationDocumentType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSAdditionalPaymentsType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSBuyerSellerDependenceType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSPresentedDocumentsType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSSellingLimitationType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.ReasonApplyMethodType;
import ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust.DTSGoodsCustomsCostType;

/** 
 * Декларация таможенной стоимости. Внешний формат
 */
public class DTSoutType extends BaseDocType
{
    private String customsCostMethodCode;
    private String baseMethodCode;
    private String additionalSheetNumber;
    private String GTDDocumentID;
    private LocalDate currencyDate;
    private String currencyCode;
    private String currencyRate;
    private String formDTS;
    private CUOrganizationType DTSoutSeller;
    private CUOrganizationType DTSoutBuyer;
    private List<DTSPresentedDocumentsType> DTSInvoiceDocumentList = new ArrayList<DTSPresentedDocumentsType>();
    private DTSBuyerSellerDependenceType DTSBuyerSellerDependence;
    private DTSSellingLimitationType DTSSellingLimitation;
    private DTSAdditionalPaymentsType DTSAdditionalPayments;
    private ReasonApplyMethodType reasonApplyMethod;
    private List<DTSGoodsCustomsCostType> DTSGoodsCustomsCostList = new ArrayList<DTSGoodsCustomsCostType>();
    private DTSoutFilledPersonType DTSoutFilledPerson;
    private CUOrganizationType DTSoutDeclarant;
    private List<CostConfirmationDocumentType> costConfirmationDocumentList = new ArrayList<CostConfirmationDocumentType>();
    private List<DeliveryTermsRUType> deliveryTermList = new ArrayList<DeliveryTermsRUType>();
    private GTDIDType GTDNumber;
    private String documentModeID;

    /** 
     * Get the 'CustomsCostMethodCode' element value. Номер метода (заполняется в соответствии с классификатором методов определения таможенной стоимости товаров, помещаемых под таможенные режимы, применяемые к ввозимым и вывозимым товарам. В случае применения разных методов, указывается "*"-разные)
     * 
     * @return value
     */
    public String getCustomsCostMethodCode() {
        return customsCostMethodCode;
    }

    /** 
     * Set the 'CustomsCostMethodCode' element value. Номер метода (заполняется в соответствии с классификатором методов определения таможенной стоимости товаров, помещаемых под таможенные режимы, применяемые к ввозимым и вывозимым товарам. В случае применения разных методов, указывается "*"-разные)
     * 
     * @param customsCostMethodCode
     */
    public void setCustomsCostMethodCode(String customsCostMethodCode) {
        this.customsCostMethodCode = customsCostMethodCode;
    }

    /** 
     * Get the 'BaseMethodCode' element value. Номер базового метода  (заполняется при определении таможенной стоимости по методам 6)
     * 
     * @return value
     */
    public String getBaseMethodCode() {
        return baseMethodCode;
    }

    /** 
     * Set the 'BaseMethodCode' element value. Номер базового метода  (заполняется при определении таможенной стоимости по методам 6)
     * 
     * @param baseMethodCode
     */
    public void setBaseMethodCode(String baseMethodCode) {
        this.baseMethodCode = baseMethodCode;
    }

    /** 
     * Get the 'AdditionalSheetNumber' element value. Число дополнительных листов
     * 
     * @return value
     */
    public String getAdditionalSheetNumber() {
        return additionalSheetNumber;
    }

    /** 
     * Set the 'AdditionalSheetNumber' element value. Число дополнительных листов
     * 
     * @param additionalSheetNumber
     */
    public void setAdditionalSheetNumber(String additionalSheetNumber) {
        this.additionalSheetNumber = additionalSheetNumber;
    }

    /** 
     * Get the 'GTDDocumentID' element value. Уникальный идентификатор ДТ.  Используется для привязки к ДТ при представлении ДТС отдельно от ДТ.
     * 
     * @return value
     */
    public String getGTDDocumentID() {
        return GTDDocumentID;
    }

    /** 
     * Set the 'GTDDocumentID' element value. Уникальный идентификатор ДТ.  Используется для привязки к ДТ при представлении ДТС отдельно от ДТ.
     * 
     * @param GTDDocumentID
     */
    public void setGTDDocumentID(String GTDDocumentID) {
        this.GTDDocumentID = GTDDocumentID;
    }

    /** 
     * Get the 'CurrencyDate' element value. Дата применения курса валюты.
     * 
     * @return value
     */
    public LocalDate getCurrencyDate() {
        return currencyDate;
    }

    /** 
     * Set the 'CurrencyDate' element value. Дата применения курса валюты.
     * 
     * @param currencyDate
     */
    public void setCurrencyDate(LocalDate currencyDate) {
        this.currencyDate = currencyDate;
    }

    /** 
     * Get the 'CurrencyCode' element value. Буквенный код валюты графы "Заявленная таможенная стоимость"
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Буквенный код валюты графы "Заявленная таможенная стоимость"
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'CurrencyRate' element value. Курс валюты графы "Заявленная таможенная стоимость (б)"
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. Курс валюты графы "Заявленная таможенная стоимость (б)"
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'FormDTS' element value. Форма ДТС: 3 - ДТС-3; 4 - ДТС-4.
     * 
     * @return value
     */
    public String getFormDTS() {
        return formDTS;
    }

    /** 
     * Set the 'FormDTS' element value. Форма ДТС: 3 - ДТС-3; 4 - ДТС-4.
     * 
     * @param formDTS
     */
    public void setFormDTS(String formDTS) {
        this.formDTS = formDTS;
    }

    /** 
     * Get the 'DTSoutSeller' element value. Внешняя ДТС. Сведения о продавце.
     * 
     * @return value
     */
    public CUOrganizationType getDTSoutSeller() {
        return DTSoutSeller;
    }

    /** 
     * Set the 'DTSoutSeller' element value. Внешняя ДТС. Сведения о продавце.
     * 
     * @param DTSoutSeller
     */
    public void setDTSoutSeller(CUOrganizationType DTSoutSeller) {
        this.DTSoutSeller = DTSoutSeller;
    }

    /** 
     * Get the 'DTSoutBuyer' element value. Внешняя ДТС. Сведения о покупателе.
     * 
     * @return value
     */
    public CUOrganizationType getDTSoutBuyer() {
        return DTSoutBuyer;
    }

    /** 
     * Set the 'DTSoutBuyer' element value. Внешняя ДТС. Сведения о покупателе.
     * 
     * @param DTSoutBuyer
     */
    public void setDTSoutBuyer(CUOrganizationType DTSoutBuyer) {
        this.DTSoutBuyer = DTSoutBuyer;
    }

    /** 
     * Get the list of 'DTSInvoiceDocuments' element items. Сведения о документах. ДТС-3  гр. 4,5,6; ДТС-4 гр. 4,5,8
     * 
     * @return list
     */
    public List<DTSPresentedDocumentsType> getDTSInvoiceDocumentList() {
        return DTSInvoiceDocumentList;
    }

    /** 
     * Set the list of 'DTSInvoiceDocuments' element items. Сведения о документах. ДТС-3  гр. 4,5,6; ДТС-4 гр. 4,5,8
     * 
     * @param list
     */
    public void setDTSInvoiceDocumentList(List<DTSPresentedDocumentsType> list) {
        DTSInvoiceDocumentList = list;
    }

    /** 
     * Get the 'DTSBuyerSellerDependence' element value. Взаимосвязь между покупателем и продавцом. ДТС-3 гр.7.
     * 
     * @return value
     */
    public DTSBuyerSellerDependenceType getDTSBuyerSellerDependence() {
        return DTSBuyerSellerDependence;
    }

    /** 
     * Set the 'DTSBuyerSellerDependence' element value. Взаимосвязь между покупателем и продавцом. ДТС-3 гр.7.
     * 
     * @param DTSBuyerSellerDependence
     */
    public void setDTSBuyerSellerDependence(
            DTSBuyerSellerDependenceType DTSBuyerSellerDependence) {
        this.DTSBuyerSellerDependence = DTSBuyerSellerDependence;
    }

    /** 
     * Get the 'DTSSellingLimitation' element value. Ограничения на пользование товарами  и обязательства при продаже товаров. ДТС-3 гр.8.
     * 
     * @return value
     */
    public DTSSellingLimitationType getDTSSellingLimitation() {
        return DTSSellingLimitation;
    }

    /** 
     * Set the 'DTSSellingLimitation' element value. Ограничения на пользование товарами  и обязательства при продаже товаров. ДТС-3 гр.8.
     * 
     * @param DTSSellingLimitation
     */
    public void setDTSSellingLimitation(
            DTSSellingLimitationType DTSSellingLimitation) {
        this.DTSSellingLimitation = DTSSellingLimitation;
    }

    /** 
     * Get the 'DTSAdditionalPayments' element value. Платежи за использование интеллектуальной собственности и условия передачи части дохода продавцу. ДТС-3  гр.9.
     * 
     * @return value
     */
    public DTSAdditionalPaymentsType getDTSAdditionalPayments() {
        return DTSAdditionalPayments;
    }

    /** 
     * Set the 'DTSAdditionalPayments' element value. Платежи за использование интеллектуальной собственности и условия передачи части дохода продавцу. ДТС-3  гр.9.
     * 
     * @param DTSAdditionalPayments
     */
    public void setDTSAdditionalPayments(
            DTSAdditionalPaymentsType DTSAdditionalPayments) {
        this.DTSAdditionalPayments = DTSAdditionalPayments;
    }

    /** 
     * Get the 'ReasonApplyMethod' element value. Причина, по которой предшествующие методы определения стоимости не применимы. ДТС-4 гр. 7.
     * 
     * @return value
     */
    public ReasonApplyMethodType getReasonApplyMethod() {
        return reasonApplyMethod;
    }

    /** 
     * Set the 'ReasonApplyMethod' element value. Причина, по которой предшествующие методы определения стоимости не применимы. ДТС-4 гр. 7.
     * 
     * @param reasonApplyMethod
     */
    public void setReasonApplyMethod(ReasonApplyMethodType reasonApplyMethod) {
        this.reasonApplyMethod = reasonApplyMethod;
    }

    /** 
     * Get the list of 'DTSGoodsCustomsCost' element items. Составляющие таможенной стоимости по товару.
     * 
     * @return list
     */
    public List<DTSGoodsCustomsCostType> getDTSGoodsCustomsCostList() {
        return DTSGoodsCustomsCostList;
    }

    /** 
     * Set the list of 'DTSGoodsCustomsCost' element items. Составляющие таможенной стоимости по товару.
     * 
     * @param list
     */
    public void setDTSGoodsCustomsCostList(List<DTSGoodsCustomsCostType> list) {
        DTSGoodsCustomsCostList = list;
    }

    /** 
     * Get the 'DTSoutFilledPerson' element value. Дата заполнения и лицо, заполнившее ДТС. 
     * 
     * @return value
     */
    public DTSoutFilledPersonType getDTSoutFilledPerson() {
        return DTSoutFilledPerson;
    }

    /** 
     * Set the 'DTSoutFilledPerson' element value. Дата заполнения и лицо, заполнившее ДТС. 
     * 
     * @param DTSoutFilledPerson
     */
    public void setDTSoutFilledPerson(DTSoutFilledPersonType DTSoutFilledPerson) {
        this.DTSoutFilledPerson = DTSoutFilledPerson;
    }

    /** 
     * Get the 'DTSoutDeclarant' element value. Внешняя ДТС. Сведения о декларанте.
     * 
     * @return value
     */
    public CUOrganizationType getDTSoutDeclarant() {
        return DTSoutDeclarant;
    }

    /** 
     * Set the 'DTSoutDeclarant' element value. Внешняя ДТС. Сведения о декларанте.
     * 
     * @param DTSoutDeclarant
     */
    public void setDTSoutDeclarant(CUOrganizationType DTSoutDeclarant) {
        this.DTSoutDeclarant = DTSoutDeclarant;
    }

    /** 
     * Get the list of 'CostConfirmationDocument' element items. Документы, подтверждающие заявленные сведения. ДТС-4 гр.8.
     * 
     * @return list
     */
    public List<CostConfirmationDocumentType> getCostConfirmationDocumentList() {
        return costConfirmationDocumentList;
    }

    /** 
     * Set the list of 'CostConfirmationDocument' element items. Документы, подтверждающие заявленные сведения. ДТС-4 гр.8.
     * 
     * @param list
     */
    public void setCostConfirmationDocumentList(
            List<CostConfirmationDocumentType> list) {
        costConfirmationDocumentList = list;
    }

    /** 
     * Get the list of 'DeliveryTerms' element items. Условие поставки товаров.
     * 
     * @return list
     */
    public List<DeliveryTermsRUType> getDeliveryTermList() {
        return deliveryTermList;
    }

    /** 
     * Set the list of 'DeliveryTerms' element items. Условие поставки товаров.
     * 
     * @param list
     */
    public void setDeliveryTermList(List<DeliveryTermsRUType> list) {
        deliveryTermList = list;
    }

    /** 
     * Get the 'GTDNumber' element value. Регистрационный номер ДТ. Используется при предоставлении ДТС отдельно от ДТ.
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. Регистрационный номер ДТ. Используется при предоставлении ДТС отдельно от ДТ.
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
