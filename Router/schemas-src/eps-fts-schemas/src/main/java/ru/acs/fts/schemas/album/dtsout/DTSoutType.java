
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
 * ���������� ���������� ���������. ������� ������
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
     * Get the 'CustomsCostMethodCode' element value. ����� ������ (����������� � ������������ � ��������������� ������� ����������� ���������� ��������� �������, ���������� ��� ���������� ������, ����������� � �������� � ��������� �������. � ������ ���������� ������ �������, ����������� "*"-������)
     * 
     * @return value
     */
    public String getCustomsCostMethodCode() {
        return customsCostMethodCode;
    }

    /** 
     * Set the 'CustomsCostMethodCode' element value. ����� ������ (����������� � ������������ � ��������������� ������� ����������� ���������� ��������� �������, ���������� ��� ���������� ������, ����������� � �������� � ��������� �������. � ������ ���������� ������ �������, ����������� "*"-������)
     * 
     * @param customsCostMethodCode
     */
    public void setCustomsCostMethodCode(String customsCostMethodCode) {
        this.customsCostMethodCode = customsCostMethodCode;
    }

    /** 
     * Get the 'BaseMethodCode' element value. ����� �������� ������  (����������� ��� ����������� ���������� ��������� �� ������� 6)
     * 
     * @return value
     */
    public String getBaseMethodCode() {
        return baseMethodCode;
    }

    /** 
     * Set the 'BaseMethodCode' element value. ����� �������� ������  (����������� ��� ����������� ���������� ��������� �� ������� 6)
     * 
     * @param baseMethodCode
     */
    public void setBaseMethodCode(String baseMethodCode) {
        this.baseMethodCode = baseMethodCode;
    }

    /** 
     * Get the 'AdditionalSheetNumber' element value. ����� �������������� ������
     * 
     * @return value
     */
    public String getAdditionalSheetNumber() {
        return additionalSheetNumber;
    }

    /** 
     * Set the 'AdditionalSheetNumber' element value. ����� �������������� ������
     * 
     * @param additionalSheetNumber
     */
    public void setAdditionalSheetNumber(String additionalSheetNumber) {
        this.additionalSheetNumber = additionalSheetNumber;
    }

    /** 
     * Get the 'GTDDocumentID' element value. ���������� ������������� ��.  ������������ ��� �������� � �� ��� ������������� ��� �������� �� ��.
     * 
     * @return value
     */
    public String getGTDDocumentID() {
        return GTDDocumentID;
    }

    /** 
     * Set the 'GTDDocumentID' element value. ���������� ������������� ��.  ������������ ��� �������� � �� ��� ������������� ��� �������� �� ��.
     * 
     * @param GTDDocumentID
     */
    public void setGTDDocumentID(String GTDDocumentID) {
        this.GTDDocumentID = GTDDocumentID;
    }

    /** 
     * Get the 'CurrencyDate' element value. ���� ���������� ����� ������.
     * 
     * @return value
     */
    public LocalDate getCurrencyDate() {
        return currencyDate;
    }

    /** 
     * Set the 'CurrencyDate' element value. ���� ���������� ����� ������.
     * 
     * @param currencyDate
     */
    public void setCurrencyDate(LocalDate currencyDate) {
        this.currencyDate = currencyDate;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��������� ��� ������ ����� "���������� ���������� ���������"
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��������� ��� ������ ����� "���������� ���������� ���������"
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'CurrencyRate' element value. ���� ������ ����� "���������� ���������� ��������� (�)"
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. ���� ������ ����� "���������� ���������� ��������� (�)"
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'FormDTS' element value. ����� ���: 3 - ���-3; 4 - ���-4.
     * 
     * @return value
     */
    public String getFormDTS() {
        return formDTS;
    }

    /** 
     * Set the 'FormDTS' element value. ����� ���: 3 - ���-3; 4 - ���-4.
     * 
     * @param formDTS
     */
    public void setFormDTS(String formDTS) {
        this.formDTS = formDTS;
    }

    /** 
     * Get the 'DTSoutSeller' element value. ������� ���. �������� � ��������.
     * 
     * @return value
     */
    public CUOrganizationType getDTSoutSeller() {
        return DTSoutSeller;
    }

    /** 
     * Set the 'DTSoutSeller' element value. ������� ���. �������� � ��������.
     * 
     * @param DTSoutSeller
     */
    public void setDTSoutSeller(CUOrganizationType DTSoutSeller) {
        this.DTSoutSeller = DTSoutSeller;
    }

    /** 
     * Get the 'DTSoutBuyer' element value. ������� ���. �������� � ����������.
     * 
     * @return value
     */
    public CUOrganizationType getDTSoutBuyer() {
        return DTSoutBuyer;
    }

    /** 
     * Set the 'DTSoutBuyer' element value. ������� ���. �������� � ����������.
     * 
     * @param DTSoutBuyer
     */
    public void setDTSoutBuyer(CUOrganizationType DTSoutBuyer) {
        this.DTSoutBuyer = DTSoutBuyer;
    }

    /** 
     * Get the list of 'DTSInvoiceDocuments' element items. �������� � ����������. ���-3  ��. 4,5,6; ���-4 ��. 4,5,8
     * 
     * @return list
     */
    public List<DTSPresentedDocumentsType> getDTSInvoiceDocumentList() {
        return DTSInvoiceDocumentList;
    }

    /** 
     * Set the list of 'DTSInvoiceDocuments' element items. �������� � ����������. ���-3  ��. 4,5,6; ���-4 ��. 4,5,8
     * 
     * @param list
     */
    public void setDTSInvoiceDocumentList(List<DTSPresentedDocumentsType> list) {
        DTSInvoiceDocumentList = list;
    }

    /** 
     * Get the 'DTSBuyerSellerDependence' element value. ����������� ����� ����������� � ���������. ���-3 ��.7.
     * 
     * @return value
     */
    public DTSBuyerSellerDependenceType getDTSBuyerSellerDependence() {
        return DTSBuyerSellerDependence;
    }

    /** 
     * Set the 'DTSBuyerSellerDependence' element value. ����������� ����� ����������� � ���������. ���-3 ��.7.
     * 
     * @param DTSBuyerSellerDependence
     */
    public void setDTSBuyerSellerDependence(
            DTSBuyerSellerDependenceType DTSBuyerSellerDependence) {
        this.DTSBuyerSellerDependence = DTSBuyerSellerDependence;
    }

    /** 
     * Get the 'DTSSellingLimitation' element value. ����������� �� ����������� ��������  � ������������� ��� ������� �������. ���-3 ��.8.
     * 
     * @return value
     */
    public DTSSellingLimitationType getDTSSellingLimitation() {
        return DTSSellingLimitation;
    }

    /** 
     * Set the 'DTSSellingLimitation' element value. ����������� �� ����������� ��������  � ������������� ��� ������� �������. ���-3 ��.8.
     * 
     * @param DTSSellingLimitation
     */
    public void setDTSSellingLimitation(
            DTSSellingLimitationType DTSSellingLimitation) {
        this.DTSSellingLimitation = DTSSellingLimitation;
    }

    /** 
     * Get the 'DTSAdditionalPayments' element value. ������� �� ������������� ���������������� ������������� � ������� �������� ����� ������ ��������. ���-3  ��.9.
     * 
     * @return value
     */
    public DTSAdditionalPaymentsType getDTSAdditionalPayments() {
        return DTSAdditionalPayments;
    }

    /** 
     * Set the 'DTSAdditionalPayments' element value. ������� �� ������������� ���������������� ������������� � ������� �������� ����� ������ ��������. ���-3  ��.9.
     * 
     * @param DTSAdditionalPayments
     */
    public void setDTSAdditionalPayments(
            DTSAdditionalPaymentsType DTSAdditionalPayments) {
        this.DTSAdditionalPayments = DTSAdditionalPayments;
    }

    /** 
     * Get the 'ReasonApplyMethod' element value. �������, �� ������� �������������� ������ ����������� ��������� �� ���������. ���-4 ��. 7.
     * 
     * @return value
     */
    public ReasonApplyMethodType getReasonApplyMethod() {
        return reasonApplyMethod;
    }

    /** 
     * Set the 'ReasonApplyMethod' element value. �������, �� ������� �������������� ������ ����������� ��������� �� ���������. ���-4 ��. 7.
     * 
     * @param reasonApplyMethod
     */
    public void setReasonApplyMethod(ReasonApplyMethodType reasonApplyMethod) {
        this.reasonApplyMethod = reasonApplyMethod;
    }

    /** 
     * Get the list of 'DTSGoodsCustomsCost' element items. ������������ ���������� ��������� �� ������.
     * 
     * @return list
     */
    public List<DTSGoodsCustomsCostType> getDTSGoodsCustomsCostList() {
        return DTSGoodsCustomsCostList;
    }

    /** 
     * Set the list of 'DTSGoodsCustomsCost' element items. ������������ ���������� ��������� �� ������.
     * 
     * @param list
     */
    public void setDTSGoodsCustomsCostList(List<DTSGoodsCustomsCostType> list) {
        DTSGoodsCustomsCostList = list;
    }

    /** 
     * Get the 'DTSoutFilledPerson' element value. ���� ���������� � ����, ����������� ���. 
     * 
     * @return value
     */
    public DTSoutFilledPersonType getDTSoutFilledPerson() {
        return DTSoutFilledPerson;
    }

    /** 
     * Set the 'DTSoutFilledPerson' element value. ���� ���������� � ����, ����������� ���. 
     * 
     * @param DTSoutFilledPerson
     */
    public void setDTSoutFilledPerson(DTSoutFilledPersonType DTSoutFilledPerson) {
        this.DTSoutFilledPerson = DTSoutFilledPerson;
    }

    /** 
     * Get the 'DTSoutDeclarant' element value. ������� ���. �������� � ����������.
     * 
     * @return value
     */
    public CUOrganizationType getDTSoutDeclarant() {
        return DTSoutDeclarant;
    }

    /** 
     * Set the 'DTSoutDeclarant' element value. ������� ���. �������� � ����������.
     * 
     * @param DTSoutDeclarant
     */
    public void setDTSoutDeclarant(CUOrganizationType DTSoutDeclarant) {
        this.DTSoutDeclarant = DTSoutDeclarant;
    }

    /** 
     * Get the list of 'CostConfirmationDocument' element items. ���������, �������������� ���������� ��������. ���-4 ��.8.
     * 
     * @return list
     */
    public List<CostConfirmationDocumentType> getCostConfirmationDocumentList() {
        return costConfirmationDocumentList;
    }

    /** 
     * Set the list of 'CostConfirmationDocument' element items. ���������, �������������� ���������� ��������. ���-4 ��.8.
     * 
     * @param list
     */
    public void setCostConfirmationDocumentList(
            List<CostConfirmationDocumentType> list) {
        costConfirmationDocumentList = list;
    }

    /** 
     * Get the list of 'DeliveryTerms' element items. ������� �������� �������.
     * 
     * @return list
     */
    public List<DeliveryTermsRUType> getDeliveryTermList() {
        return deliveryTermList;
    }

    /** 
     * Set the list of 'DeliveryTerms' element items. ������� �������� �������.
     * 
     * @param list
     */
    public void setDeliveryTermList(List<DeliveryTermsRUType> list) {
        deliveryTermList = list;
    }

    /** 
     * Get the 'GTDNumber' element value. ��������������� ����� ��. ������������ ��� �������������� ��� �������� �� ��.
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ��������������� ����� ��. ������������ ��� �������������� ��� �������� �� ��.
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
