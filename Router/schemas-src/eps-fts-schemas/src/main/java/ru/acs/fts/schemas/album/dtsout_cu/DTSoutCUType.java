
package ru.acs.fts.schemas.album.dtsout_cu;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DeliveryTermsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSAdditionalPaymentsType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSBuyerSellerDependenceType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSFilledPersonType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSPresentedDocumentsType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSSellingLimitationType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.ReasonApplyMethodType;

/** 
 * Электронная копия ДТС
 */
public class DTSoutCUType extends BaseDocType
{
    private String additionalSheetNumber;
    private String GTDDocumentID;
    private LocalDate currencyDate;
    private String currencyCode;
    private String currencyRate;
    private String electronicDocumentSign;
    private String currencyQuantity;
    private String formDTS;
    private String customsCostMethodCode;
    private String baseMethodCode;
    private CUOrganizationType DTSoutSeller;
    private CUOrganizationType DTSoutBuyer;
    private List<DTSPresentedDocumentsType> DTSInvoiceDocumentList = new ArrayList<DTSPresentedDocumentsType>();
    private DTSBuyerSellerDependenceType DTSBuyerSellerDependence;
    private DTSSellingLimitationType DTSSellingLimitation;
    private DTSAdditionalPaymentsType DTSAdditionalPayments;
    private List<GoodsCustomsCostType> DTSoutCUGoodsCustomsCostList = new ArrayList<GoodsCustomsCostType>();
    private GTDIDType GTDNumber;
    private DTSFilledPersonType DTSoutCUFilledPerson;
    private CUOrganizationType DTSoutDeclarant;
    private List<DeliveryTermsType> deliveryTermList = new ArrayList<DeliveryTermsType>();
    private ReasonApplyMethodType reasonApplyMethod;
    private String documentModeID;

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
     * Get the 'GTDDocumentID' element value. Уникальный идентификатор ДТ.  Используется для привязки к ДТ при представлении ДТС
     * 
     * @return value
     */
    public String getGTDDocumentID() {
        return GTDDocumentID;
    }

    /** 
     * Set the 'GTDDocumentID' element value. Уникальный идентификатор ДТ.  Используется для привязки к ДТ при представлении ДТС
     * 
     * @param GTDDocumentID
     */
    public void setGTDDocumentID(String GTDDocumentID) {
        this.GTDDocumentID = GTDDocumentID;
    }

    /** 
     * Get the 'CurrencyDate' element value. Дата применения курса валюты
     * 
     * @return value
     */
    public LocalDate getCurrencyDate() {
        return currencyDate;
    }

    /** 
     * Set the 'CurrencyDate' element value. Дата применения курса валюты
     * 
     * @param currencyDate
     */
    public void setCurrencyDate(LocalDate currencyDate) {
        this.currencyDate = currencyDate;
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
     * Get the 'CurrencyRate' element value. Курс доллара США к национальной валюте
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. Курс доллара США к национальной валюте
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'ElectronicDocumentSign' element value. Признак использования ДТС в форме электронного документа. ЭД
     * 
     * @return value
     */
    public String getElectronicDocumentSign() {
        return electronicDocumentSign;
    }

    /** 
     * Set the 'ElectronicDocumentSign' element value. Признак использования ДТС в форме электронного документа. ЭД
     * 
     * @param electronicDocumentSign
     */
    public void setElectronicDocumentSign(String electronicDocumentSign) {
        this.electronicDocumentSign = electronicDocumentSign;
    }

    /** 
     * Get the 'CurrencyQuantity' element value. Количество единиц валюты, для которой указан курс для РБ
     * 
     * @return value
     */
    public String getCurrencyQuantity() {
        return currencyQuantity;
    }

    /** 
     * Set the 'CurrencyQuantity' element value. Количество единиц валюты, для которой указан курс для РБ
     * 
     * @param currencyQuantity
     */
    public void setCurrencyQuantity(String currencyQuantity) {
        this.currencyQuantity = currencyQuantity;
    }

    /** 
     * Get the 'FormDTS' element value. Форма ДТС: 1 - ДТС-1; 2 - ДТС-2
     * 
     * @return value
     */
    public String getFormDTS() {
        return formDTS;
    }

    /** 
     * Set the 'FormDTS' element value. Форма ДТС: 1 - ДТС-1; 2 - ДТС-2
     * 
     * @param formDTS
     */
    public void setFormDTS(String formDTS) {
        this.formDTS = formDTS;
    }

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
     * Get the 'DTSoutSeller' element value. Сведения о продавце.гр 1
     * 
     * @return value
     */
    public CUOrganizationType getDTSoutSeller() {
        return DTSoutSeller;
    }

    /** 
     * Set the 'DTSoutSeller' element value. Сведения о продавце.гр 1
     * 
     * @param DTSoutSeller
     */
    public void setDTSoutSeller(CUOrganizationType DTSoutSeller) {
        this.DTSoutSeller = DTSoutSeller;
    }

    /** 
     * Get the 'DTSoutBuyer' element value. Сведения о покупателе. Гр 2а
     * 
     * @return value
     */
    public CUOrganizationType getDTSoutBuyer() {
        return DTSoutBuyer;
    }

    /** 
     * Set the 'DTSoutBuyer' element value. Сведения о покупателе. Гр 2а
     * 
     * @param DTSoutBuyer
     */
    public void setDTSoutBuyer(CUOrganizationType DTSoutBuyer) {
        this.DTSoutBuyer = DTSoutBuyer;
    }

    /** 
     * Get the list of 'DTSInvoiceDocuments' element items. Сведения о документах. ДТС-1, гр. 4,5.6; ДТС-2, гр. 4,5,8
     * 
     * @return list
     */
    public List<DTSPresentedDocumentsType> getDTSInvoiceDocumentList() {
        return DTSInvoiceDocumentList;
    }

    /** 
     * Set the list of 'DTSInvoiceDocuments' element items. Сведения о документах. ДТС-1, гр. 4,5.6; ДТС-2, гр. 4,5,8
     * 
     * @param list
     */
    public void setDTSInvoiceDocumentList(List<DTSPresentedDocumentsType> list) {
        DTSInvoiceDocumentList = list;
    }

    /** 
     * Get the 'DTSBuyerSellerDependence' element value. Взаимосвязь между покупателем и продавцом. ДТС-1, гр.7
     * 
     * @return value
     */
    public DTSBuyerSellerDependenceType getDTSBuyerSellerDependence() {
        return DTSBuyerSellerDependence;
    }

    /** 
     * Set the 'DTSBuyerSellerDependence' element value. Взаимосвязь между покупателем и продавцом. ДТС-1, гр.7
     * 
     * @param DTSBuyerSellerDependence
     */
    public void setDTSBuyerSellerDependence(
            DTSBuyerSellerDependenceType DTSBuyerSellerDependence) {
        this.DTSBuyerSellerDependence = DTSBuyerSellerDependence;
    }

    /** 
     * Get the 'DTSSellingLimitation' element value. Ограничения на пользование товарами  и обязательства при продаже товаров. ДТС-1, гр.8
     * 
     * @return value
     */
    public DTSSellingLimitationType getDTSSellingLimitation() {
        return DTSSellingLimitation;
    }

    /** 
     * Set the 'DTSSellingLimitation' element value. Ограничения на пользование товарами  и обязательства при продаже товаров. ДТС-1, гр.8
     * 
     * @param DTSSellingLimitation
     */
    public void setDTSSellingLimitation(
            DTSSellingLimitationType DTSSellingLimitation) {
        this.DTSSellingLimitation = DTSSellingLimitation;
    }

    /** 
     * Get the 'DTSAdditionalPayments' element value. Платежи за использование интеллектуальной собственности и условия передачи части дохода продавцу. ДТС-1,  гр.9
     * 
     * @return value
     */
    public DTSAdditionalPaymentsType getDTSAdditionalPayments() {
        return DTSAdditionalPayments;
    }

    /** 
     * Set the 'DTSAdditionalPayments' element value. Платежи за использование интеллектуальной собственности и условия передачи части дохода продавцу. ДТС-1,  гр.9
     * 
     * @param DTSAdditionalPayments
     */
    public void setDTSAdditionalPayments(
            DTSAdditionalPaymentsType DTSAdditionalPayments) {
        this.DTSAdditionalPayments = DTSAdditionalPayments;
    }

    /** 
     * Get the list of 'DTSout_CUGoodsCustomsCost' element items. Составляющие таможенной стоимости по товару
     * 
     * @return list
     */
    public List<GoodsCustomsCostType> getDTSoutCUGoodsCustomsCostList() {
        return DTSoutCUGoodsCustomsCostList;
    }

    /** 
     * Set the list of 'DTSout_CUGoodsCustomsCost' element items. Составляющие таможенной стоимости по товару
     * 
     * @param list
     */
    public void setDTSoutCUGoodsCustomsCostList(List<GoodsCustomsCostType> list) {
        DTSoutCUGoodsCustomsCostList = list;
    }

    /** 
     * Get the 'GTDNumber' element value. Регистрационный номер ДТ. Используется при предоставлении ДТС отдельно от ДТ
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. Регистрационный номер ДТ. Используется при предоставлении ДТС отдельно от ДТ
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }

    /** 
     * Get the 'DTSout_CUFilledPerson' element value. Дата заполнения и лицо, заполнившее ДТС
     * 
     * @return value
     */
    public DTSFilledPersonType getDTSoutCUFilledPerson() {
        return DTSoutCUFilledPerson;
    }

    /** 
     * Set the 'DTSout_CUFilledPerson' element value. Дата заполнения и лицо, заполнившее ДТС
     * 
     * @param DTSoutCUFilledPerson
     */
    public void setDTSoutCUFilledPerson(DTSFilledPersonType DTSoutCUFilledPerson) {
        this.DTSoutCUFilledPerson = DTSoutCUFilledPerson;
    }

    /** 
     * Get the 'DTSoutDeclarant' element value. Сведения о декларанте. Гр 2б
     * 
     * @return value
     */
    public CUOrganizationType getDTSoutDeclarant() {
        return DTSoutDeclarant;
    }

    /** 
     * Set the 'DTSoutDeclarant' element value. Сведения о декларанте. Гр 2б
     * 
     * @param DTSoutDeclarant
     */
    public void setDTSoutDeclarant(CUOrganizationType DTSoutDeclarant) {
        this.DTSoutDeclarant = DTSoutDeclarant;
    }

    /** 
     * Get the list of 'DeliveryTerms' element items. Условия поставки товаров
     * 
     * @return list
     */
    public List<DeliveryTermsType> getDeliveryTermList() {
        return deliveryTermList;
    }

    /** 
     * Set the list of 'DeliveryTerms' element items. Условия поставки товаров
     * 
     * @param list
     */
    public void setDeliveryTermList(List<DeliveryTermsType> list) {
        deliveryTermList = list;
    }

    /** 
     * Get the 'ReasonApplyMethod' element value. Причина, по которой предшествующие методы определения стоимости не применимы. ДТС-2 гр. 7
     * 
     * @return value
     */
    public ReasonApplyMethodType getReasonApplyMethod() {
        return reasonApplyMethod;
    }

    /** 
     * Set the 'ReasonApplyMethod' element value. Причина, по которой предшествующие методы определения стоимости не применимы. ДТС-2 гр. 7
     * 
     * @param reasonApplyMethod
     */
    public void setReasonApplyMethod(ReasonApplyMethodType reasonApplyMethod) {
        this.reasonApplyMethod = reasonApplyMethod;
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
