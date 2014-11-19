
package ru.acs.fts.schemas.album.dtsin;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DeliveryTermsRUType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.CostConfirmationDocumentType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSAdditionalPaymentsType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSBuyerSellerDependenceType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSPresentedDocumentsType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSSellingLimitationType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.ReasonApplyMethodType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.ESADOrganizationInType;
import ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust.CustomsCostDecisionType;

/** 
 * Декларация таможенной стоимости. Внутренний формат.
 */
public class DTSinType extends BaseDocType
{
    private String customsCostMethodCode;
    private String baseMethodCode;
    private String additionalSheetNumber;
    private String GTDDocumentID;
    private String DTSSequenceNumber;
    private LocalDate currencyDate;
    private String currencyCode;
    private String currencyRate;
    private String formDTS;
    private ESADOrganizationInType DTSinBuyer;
    private ESADOrganizationInType DTSinSeller;
    private ESADOrganizationInType DTSinDeclarant;
    private DTSinFilledPersonType DTSinFilledPerson;
    private List<DTSPresentedDocumentsType> DTSInvoiceDocumentList = new ArrayList<DTSPresentedDocumentsType>();
    private DTSSellingLimitationType DTSSellingLimitation;
    private DTSBuyerSellerDependenceType DTSBuyerSellerDependence;
    private DTSAdditionalPaymentsType DTSAdditionalPayments;
    private ReasonApplyMethodType reasonApplyMethod;
    private List<DTSinGoodsCustomsCostType> DTSinGoodsCustomsCostList = new ArrayList<DTSinGoodsCustomsCostType>();
    private IntermediateCustomsCostDecisionType intermediateCustomsCostDecision;
    private CustomsCostDecisionType finalCustomsCostDecision;
    private CustomsCostDecisionType cancelingDecision;
    private List<DTSinOfficialMarksType> DTSinOfficialMarkList = new ArrayList<DTSinOfficialMarksType>();
    private DTSinTechMarksType DTSinTechMarks;
    private List<CostConfirmationDocumentType> costConfirmationDocumentList = new ArrayList<CostConfirmationDocumentType>();
    private List<DeliveryTermsRUType> deliveryTermList = new ArrayList<DeliveryTermsRUType>();
    private GTDIDType GTDNumber;
    private String documentModeID;

    /** 
     * Get the 'CustomsCostMethodCode' element value. Номер метода (заполняется в соответствии с классификатором методов определения таможенной стоимости товаров, помещаемых под таможенные процедуры, применяемые к ввозимым и вывозимым товарам. В случае применения разных методов, указывается "*"-разные)
     * 
     * @return value
     */
    public String getCustomsCostMethodCode() {
        return customsCostMethodCode;
    }

    /** 
     * Set the 'CustomsCostMethodCode' element value. Номер метода (заполняется в соответствии с классификатором методов определения таможенной стоимости товаров, помещаемых под таможенные процедуры, применяемые к ввозимым и вывозимым товарам. В случае применения разных методов, указывается "*"-разные)
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
     * Get the 'AdditionalSheetNumber' element value. Количество дополнительных листов
     * 
     * @return value
     */
    public String getAdditionalSheetNumber() {
        return additionalSheetNumber;
    }

    /** 
     * Set the 'AdditionalSheetNumber' element value. Количество дополнительных листов
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
     * Get the 'DTSSequenceNumber' element value. Номер ДТС по порядку. 1 - для первой ДТС, поданной декларантом, 2,3... - для последующих, в случае принятия решения "ТС подлежит корректировке" 
     * 
     * @return value
     */
    public String getDTSSequenceNumber() {
        return DTSSequenceNumber;
    }

    /** 
     * Set the 'DTSSequenceNumber' element value. Номер ДТС по порядку. 1 - для первой ДТС, поданной декларантом, 2,3... - для последующих, в случае принятия решения "ТС подлежит корректировке" 
     * 
     * @param DTSSequenceNumber
     */
    public void setDTSSequenceNumber(String DTSSequenceNumber) {
        this.DTSSequenceNumber = DTSSequenceNumber;
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
     * Get the 'FormDTS' element value. Форма ДТС: 1 - ДТС-1; 2 - ДТС-2; 3 - ДТС-3; 4 - ДТС-4.
     * 
     * @return value
     */
    public String getFormDTS() {
        return formDTS;
    }

    /** 
     * Set the 'FormDTS' element value. Форма ДТС: 1 - ДТС-1; 2 - ДТС-2; 3 - ДТС-3; 4 - ДТС-4.
     * 
     * @param formDTS
     */
    public void setFormDTS(String formDTS) {
        this.formDTS = formDTS;
    }

    /** 
     * Get the 'DTSinBuyer' element value. Внутренняя ДТС. Сведения о покупателе.
     * 
     * @return value
     */
    public ESADOrganizationInType getDTSinBuyer() {
        return DTSinBuyer;
    }

    /** 
     * Set the 'DTSinBuyer' element value. Внутренняя ДТС. Сведения о покупателе.
     * 
     * @param DTSinBuyer
     */
    public void setDTSinBuyer(ESADOrganizationInType DTSinBuyer) {
        this.DTSinBuyer = DTSinBuyer;
    }

    /** 
     * Get the 'DTSinSeller' element value. Внутренняя ДТС. Сведения о продавце.
     * 
     * @return value
     */
    public ESADOrganizationInType getDTSinSeller() {
        return DTSinSeller;
    }

    /** 
     * Set the 'DTSinSeller' element value. Внутренняя ДТС. Сведения о продавце.
     * 
     * @param DTSinSeller
     */
    public void setDTSinSeller(ESADOrganizationInType DTSinSeller) {
        this.DTSinSeller = DTSinSeller;
    }

    /** 
     * Get the 'DTSinDeclarant' element value. Внутренний формат ДТС. Сведения о декларанте.
     * 
     * @return value
     */
    public ESADOrganizationInType getDTSinDeclarant() {
        return DTSinDeclarant;
    }

    /** 
     * Set the 'DTSinDeclarant' element value. Внутренний формат ДТС. Сведения о декларанте.
     * 
     * @param DTSinDeclarant
     */
    public void setDTSinDeclarant(ESADOrganizationInType DTSinDeclarant) {
        this.DTSinDeclarant = DTSinDeclarant;
    }

    /** 
     * Get the 'DTSinFilledPerson' element value. Внутренний формат ДТС. Дата заполнения и лицо, заполнившее ДТС.
     * 
     * @return value
     */
    public DTSinFilledPersonType getDTSinFilledPerson() {
        return DTSinFilledPerson;
    }

    /** 
     * Set the 'DTSinFilledPerson' element value. Внутренний формат ДТС. Дата заполнения и лицо, заполнившее ДТС.
     * 
     * @param DTSinFilledPerson
     */
    public void setDTSinFilledPerson(DTSinFilledPersonType DTSinFilledPerson) {
        this.DTSinFilledPerson = DTSinFilledPerson;
    }

    /** 
     * Get the list of 'DTSInvoiceDocuments' element items. Сведения о документах. ДТС- 1 гр. 4,5,6; ДТС-2 гр. 4,5,8; ДТС-3  гр. 4,5,6; ДТС-4 гр. 4,5
     * 
     * @return list
     */
    public List<DTSPresentedDocumentsType> getDTSInvoiceDocumentList() {
        return DTSInvoiceDocumentList;
    }

    /** 
     * Set the list of 'DTSInvoiceDocuments' element items. Сведения о документах. ДТС- 1 гр. 4,5,6; ДТС-2 гр. 4,5,8; ДТС-3  гр. 4,5,6; ДТС-4 гр. 4,5
     * 
     * @param list
     */
    public void setDTSInvoiceDocumentList(List<DTSPresentedDocumentsType> list) {
        DTSInvoiceDocumentList = list;
    }

    /** 
     * Get the 'DTSSellingLimitation' element value. Ограничения на пользование товарами  и обязательства при продаже товаров. ДТС-1, ДТС-3 гр.8. 
     * 
     * @return value
     */
    public DTSSellingLimitationType getDTSSellingLimitation() {
        return DTSSellingLimitation;
    }

    /** 
     * Set the 'DTSSellingLimitation' element value. Ограничения на пользование товарами  и обязательства при продаже товаров. ДТС-1, ДТС-3 гр.8. 
     * 
     * @param DTSSellingLimitation
     */
    public void setDTSSellingLimitation(
            DTSSellingLimitationType DTSSellingLimitation) {
        this.DTSSellingLimitation = DTSSellingLimitation;
    }

    /** 
     * Get the 'DTSBuyerSellerDependence' element value. Взаимосвязь между покупателем и продавцом. ДТС-1, ДТС-3 гр.7.
     * 
     * @return value
     */
    public DTSBuyerSellerDependenceType getDTSBuyerSellerDependence() {
        return DTSBuyerSellerDependence;
    }

    /** 
     * Set the 'DTSBuyerSellerDependence' element value. Взаимосвязь между покупателем и продавцом. ДТС-1, ДТС-3 гр.7.
     * 
     * @param DTSBuyerSellerDependence
     */
    public void setDTSBuyerSellerDependence(
            DTSBuyerSellerDependenceType DTSBuyerSellerDependence) {
        this.DTSBuyerSellerDependence = DTSBuyerSellerDependence;
    }

    /** 
     * Get the 'DTSAdditionalPayments' element value. Платежи за использование интеллектуальной собственности и условия передачи части дохода продавцу. ДТС-1, ДТС-3 гр.9.
     * 
     * @return value
     */
    public DTSAdditionalPaymentsType getDTSAdditionalPayments() {
        return DTSAdditionalPayments;
    }

    /** 
     * Set the 'DTSAdditionalPayments' element value. Платежи за использование интеллектуальной собственности и условия передачи части дохода продавцу. ДТС-1, ДТС-3 гр.9.
     * 
     * @param DTSAdditionalPayments
     */
    public void setDTSAdditionalPayments(
            DTSAdditionalPaymentsType DTSAdditionalPayments) {
        this.DTSAdditionalPayments = DTSAdditionalPayments;
    }

    /** 
     * Get the 'ReasonApplyMethod' element value. Причина, по которой предшествующие методы определения стоимости не применимы. ДТС-2, ДТС-4 гр. 7.
     * 
     * @return value
     */
    public ReasonApplyMethodType getReasonApplyMethod() {
        return reasonApplyMethod;
    }

    /** 
     * Set the 'ReasonApplyMethod' element value. Причина, по которой предшествующие методы определения стоимости не применимы. ДТС-2, ДТС-4 гр. 7.
     * 
     * @param reasonApplyMethod
     */
    public void setReasonApplyMethod(ReasonApplyMethodType reasonApplyMethod) {
        this.reasonApplyMethod = reasonApplyMethod;
    }

    /** 
     * Get the list of 'DTSinGoodsCustomsCost' element items. Внутренний формат ДТС. Расчет таможенной стоимости по товару.
     * 
     * @return list
     */
    public List<DTSinGoodsCustomsCostType> getDTSinGoodsCustomsCostList() {
        return DTSinGoodsCustomsCostList;
    }

    /** 
     * Set the list of 'DTSinGoodsCustomsCost' element items. Внутренний формат ДТС. Расчет таможенной стоимости по товару.
     * 
     * @param list
     */
    public void setDTSinGoodsCustomsCostList(
            List<DTSinGoodsCustomsCostType> list) {
        DTSinGoodsCustomsCostList = list;
    }

    /** 
     * Get the 'IntermediateCustomsCostDecision' element value. Принятие промежуточного решения по ТС.
     * 
     * @return value
     */
    public IntermediateCustomsCostDecisionType getIntermediateCustomsCostDecision() {
        return intermediateCustomsCostDecision;
    }

    /** 
     * Set the 'IntermediateCustomsCostDecision' element value. Принятие промежуточного решения по ТС.
     * 
     * @param intermediateCustomsCostDecision
     */
    public void setIntermediateCustomsCostDecision(
            IntermediateCustomsCostDecisionType intermediateCustomsCostDecision) {
        this.intermediateCustomsCostDecision = intermediateCustomsCostDecision;
    }

    /** 
     * Get the 'FinalCustomsCostDecision' element value. Принятие окончательного решения по ТС.
     * 
     * @return value
     */
    public CustomsCostDecisionType getFinalCustomsCostDecision() {
        return finalCustomsCostDecision;
    }

    /** 
     * Set the 'FinalCustomsCostDecision' element value. Принятие окончательного решения по ТС.
     * 
     * @param finalCustomsCostDecision
     */
    public void setFinalCustomsCostDecision(
            CustomsCostDecisionType finalCustomsCostDecision) {
        this.finalCustomsCostDecision = finalCustomsCostDecision;
    }

    /** 
     * Get the 'CancelingDecision' element value. Решение об аннулировании или отзыве ДТС.
     * 
     * @return value
     */
    public CustomsCostDecisionType getCancelingDecision() {
        return cancelingDecision;
    }

    /** 
     * Set the 'CancelingDecision' element value. Решение об аннулировании или отзыве ДТС.
     * 
     * @param cancelingDecision
     */
    public void setCancelingDecision(CustomsCostDecisionType cancelingDecision) {
        this.cancelingDecision = cancelingDecision;
    }

    /** 
     * Get the list of 'DTSinOfficialMark' element items. Внутренний формат  ДТС. Служебные отметки.
     * 
     * @return list
     */
    public List<DTSinOfficialMarksType> getDTSinOfficialMarkList() {
        return DTSinOfficialMarkList;
    }

    /** 
     * Set the list of 'DTSinOfficialMark' element items. Внутренний формат  ДТС. Служебные отметки.
     * 
     * @param list
     */
    public void setDTSinOfficialMarkList(List<DTSinOfficialMarksType> list) {
        DTSinOfficialMarkList = list;
    }

    /** 
     * Get the 'DTSinTechMarks' element value. Технологические отметки.
     * 
     * @return value
     */
    public DTSinTechMarksType getDTSinTechMarks() {
        return DTSinTechMarks;
    }

    /** 
     * Set the 'DTSinTechMarks' element value. Технологические отметки.
     * 
     * @param DTSinTechMarks
     */
    public void setDTSinTechMarks(DTSinTechMarksType DTSinTechMarks) {
        this.DTSinTechMarks = DTSinTechMarks;
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
     * Get the 'GTDNumber' element value. Регистрационный номер ДТ.
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. Регистрационный номер ДТ.
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
