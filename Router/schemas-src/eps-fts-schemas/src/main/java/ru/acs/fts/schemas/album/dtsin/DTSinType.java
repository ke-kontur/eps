
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
 * ���������� ���������� ���������. ���������� ������.
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
     * Get the 'CustomsCostMethodCode' element value. ����� ������ (����������� � ������������ � ��������������� ������� ����������� ���������� ��������� �������, ���������� ��� ���������� ���������, ����������� � �������� � ��������� �������. � ������ ���������� ������ �������, ����������� "*"-������)
     * 
     * @return value
     */
    public String getCustomsCostMethodCode() {
        return customsCostMethodCode;
    }

    /** 
     * Set the 'CustomsCostMethodCode' element value. ����� ������ (����������� � ������������ � ��������������� ������� ����������� ���������� ��������� �������, ���������� ��� ���������� ���������, ����������� � �������� � ��������� �������. � ������ ���������� ������ �������, ����������� "*"-������)
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
     * Get the 'AdditionalSheetNumber' element value. ���������� �������������� ������
     * 
     * @return value
     */
    public String getAdditionalSheetNumber() {
        return additionalSheetNumber;
    }

    /** 
     * Set the 'AdditionalSheetNumber' element value. ���������� �������������� ������
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
     * Get the 'DTSSequenceNumber' element value. ����� ��� �� �������. 1 - ��� ������ ���, �������� �����������, 2,3... - ��� �����������, � ������ �������� ������� "�� �������� �������������" 
     * 
     * @return value
     */
    public String getDTSSequenceNumber() {
        return DTSSequenceNumber;
    }

    /** 
     * Set the 'DTSSequenceNumber' element value. ����� ��� �� �������. 1 - ��� ������ ���, �������� �����������, 2,3... - ��� �����������, � ������ �������� ������� "�� �������� �������������" 
     * 
     * @param DTSSequenceNumber
     */
    public void setDTSSequenceNumber(String DTSSequenceNumber) {
        this.DTSSequenceNumber = DTSSequenceNumber;
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
     * Get the 'FormDTS' element value. ����� ���: 1 - ���-1; 2 - ���-2; 3 - ���-3; 4 - ���-4.
     * 
     * @return value
     */
    public String getFormDTS() {
        return formDTS;
    }

    /** 
     * Set the 'FormDTS' element value. ����� ���: 1 - ���-1; 2 - ���-2; 3 - ���-3; 4 - ���-4.
     * 
     * @param formDTS
     */
    public void setFormDTS(String formDTS) {
        this.formDTS = formDTS;
    }

    /** 
     * Get the 'DTSinBuyer' element value. ���������� ���. �������� � ����������.
     * 
     * @return value
     */
    public ESADOrganizationInType getDTSinBuyer() {
        return DTSinBuyer;
    }

    /** 
     * Set the 'DTSinBuyer' element value. ���������� ���. �������� � ����������.
     * 
     * @param DTSinBuyer
     */
    public void setDTSinBuyer(ESADOrganizationInType DTSinBuyer) {
        this.DTSinBuyer = DTSinBuyer;
    }

    /** 
     * Get the 'DTSinSeller' element value. ���������� ���. �������� � ��������.
     * 
     * @return value
     */
    public ESADOrganizationInType getDTSinSeller() {
        return DTSinSeller;
    }

    /** 
     * Set the 'DTSinSeller' element value. ���������� ���. �������� � ��������.
     * 
     * @param DTSinSeller
     */
    public void setDTSinSeller(ESADOrganizationInType DTSinSeller) {
        this.DTSinSeller = DTSinSeller;
    }

    /** 
     * Get the 'DTSinDeclarant' element value. ���������� ������ ���. �������� � ����������.
     * 
     * @return value
     */
    public ESADOrganizationInType getDTSinDeclarant() {
        return DTSinDeclarant;
    }

    /** 
     * Set the 'DTSinDeclarant' element value. ���������� ������ ���. �������� � ����������.
     * 
     * @param DTSinDeclarant
     */
    public void setDTSinDeclarant(ESADOrganizationInType DTSinDeclarant) {
        this.DTSinDeclarant = DTSinDeclarant;
    }

    /** 
     * Get the 'DTSinFilledPerson' element value. ���������� ������ ���. ���� ���������� � ����, ����������� ���.
     * 
     * @return value
     */
    public DTSinFilledPersonType getDTSinFilledPerson() {
        return DTSinFilledPerson;
    }

    /** 
     * Set the 'DTSinFilledPerson' element value. ���������� ������ ���. ���� ���������� � ����, ����������� ���.
     * 
     * @param DTSinFilledPerson
     */
    public void setDTSinFilledPerson(DTSinFilledPersonType DTSinFilledPerson) {
        this.DTSinFilledPerson = DTSinFilledPerson;
    }

    /** 
     * Get the list of 'DTSInvoiceDocuments' element items. �������� � ����������. ���- 1 ��. 4,5,6; ���-2 ��. 4,5,8; ���-3  ��. 4,5,6; ���-4 ��. 4,5
     * 
     * @return list
     */
    public List<DTSPresentedDocumentsType> getDTSInvoiceDocumentList() {
        return DTSInvoiceDocumentList;
    }

    /** 
     * Set the list of 'DTSInvoiceDocuments' element items. �������� � ����������. ���- 1 ��. 4,5,6; ���-2 ��. 4,5,8; ���-3  ��. 4,5,6; ���-4 ��. 4,5
     * 
     * @param list
     */
    public void setDTSInvoiceDocumentList(List<DTSPresentedDocumentsType> list) {
        DTSInvoiceDocumentList = list;
    }

    /** 
     * Get the 'DTSSellingLimitation' element value. ����������� �� ����������� ��������  � ������������� ��� ������� �������. ���-1, ���-3 ��.8. 
     * 
     * @return value
     */
    public DTSSellingLimitationType getDTSSellingLimitation() {
        return DTSSellingLimitation;
    }

    /** 
     * Set the 'DTSSellingLimitation' element value. ����������� �� ����������� ��������  � ������������� ��� ������� �������. ���-1, ���-3 ��.8. 
     * 
     * @param DTSSellingLimitation
     */
    public void setDTSSellingLimitation(
            DTSSellingLimitationType DTSSellingLimitation) {
        this.DTSSellingLimitation = DTSSellingLimitation;
    }

    /** 
     * Get the 'DTSBuyerSellerDependence' element value. ����������� ����� ����������� � ���������. ���-1, ���-3 ��.7.
     * 
     * @return value
     */
    public DTSBuyerSellerDependenceType getDTSBuyerSellerDependence() {
        return DTSBuyerSellerDependence;
    }

    /** 
     * Set the 'DTSBuyerSellerDependence' element value. ����������� ����� ����������� � ���������. ���-1, ���-3 ��.7.
     * 
     * @param DTSBuyerSellerDependence
     */
    public void setDTSBuyerSellerDependence(
            DTSBuyerSellerDependenceType DTSBuyerSellerDependence) {
        this.DTSBuyerSellerDependence = DTSBuyerSellerDependence;
    }

    /** 
     * Get the 'DTSAdditionalPayments' element value. ������� �� ������������� ���������������� ������������� � ������� �������� ����� ������ ��������. ���-1, ���-3 ��.9.
     * 
     * @return value
     */
    public DTSAdditionalPaymentsType getDTSAdditionalPayments() {
        return DTSAdditionalPayments;
    }

    /** 
     * Set the 'DTSAdditionalPayments' element value. ������� �� ������������� ���������������� ������������� � ������� �������� ����� ������ ��������. ���-1, ���-3 ��.9.
     * 
     * @param DTSAdditionalPayments
     */
    public void setDTSAdditionalPayments(
            DTSAdditionalPaymentsType DTSAdditionalPayments) {
        this.DTSAdditionalPayments = DTSAdditionalPayments;
    }

    /** 
     * Get the 'ReasonApplyMethod' element value. �������, �� ������� �������������� ������ ����������� ��������� �� ���������. ���-2, ���-4 ��. 7.
     * 
     * @return value
     */
    public ReasonApplyMethodType getReasonApplyMethod() {
        return reasonApplyMethod;
    }

    /** 
     * Set the 'ReasonApplyMethod' element value. �������, �� ������� �������������� ������ ����������� ��������� �� ���������. ���-2, ���-4 ��. 7.
     * 
     * @param reasonApplyMethod
     */
    public void setReasonApplyMethod(ReasonApplyMethodType reasonApplyMethod) {
        this.reasonApplyMethod = reasonApplyMethod;
    }

    /** 
     * Get the list of 'DTSinGoodsCustomsCost' element items. ���������� ������ ���. ������ ���������� ��������� �� ������.
     * 
     * @return list
     */
    public List<DTSinGoodsCustomsCostType> getDTSinGoodsCustomsCostList() {
        return DTSinGoodsCustomsCostList;
    }

    /** 
     * Set the list of 'DTSinGoodsCustomsCost' element items. ���������� ������ ���. ������ ���������� ��������� �� ������.
     * 
     * @param list
     */
    public void setDTSinGoodsCustomsCostList(
            List<DTSinGoodsCustomsCostType> list) {
        DTSinGoodsCustomsCostList = list;
    }

    /** 
     * Get the 'IntermediateCustomsCostDecision' element value. �������� �������������� ������� �� ��.
     * 
     * @return value
     */
    public IntermediateCustomsCostDecisionType getIntermediateCustomsCostDecision() {
        return intermediateCustomsCostDecision;
    }

    /** 
     * Set the 'IntermediateCustomsCostDecision' element value. �������� �������������� ������� �� ��.
     * 
     * @param intermediateCustomsCostDecision
     */
    public void setIntermediateCustomsCostDecision(
            IntermediateCustomsCostDecisionType intermediateCustomsCostDecision) {
        this.intermediateCustomsCostDecision = intermediateCustomsCostDecision;
    }

    /** 
     * Get the 'FinalCustomsCostDecision' element value. �������� �������������� ������� �� ��.
     * 
     * @return value
     */
    public CustomsCostDecisionType getFinalCustomsCostDecision() {
        return finalCustomsCostDecision;
    }

    /** 
     * Set the 'FinalCustomsCostDecision' element value. �������� �������������� ������� �� ��.
     * 
     * @param finalCustomsCostDecision
     */
    public void setFinalCustomsCostDecision(
            CustomsCostDecisionType finalCustomsCostDecision) {
        this.finalCustomsCostDecision = finalCustomsCostDecision;
    }

    /** 
     * Get the 'CancelingDecision' element value. ������� �� ������������� ��� ������ ���.
     * 
     * @return value
     */
    public CustomsCostDecisionType getCancelingDecision() {
        return cancelingDecision;
    }

    /** 
     * Set the 'CancelingDecision' element value. ������� �� ������������� ��� ������ ���.
     * 
     * @param cancelingDecision
     */
    public void setCancelingDecision(CustomsCostDecisionType cancelingDecision) {
        this.cancelingDecision = cancelingDecision;
    }

    /** 
     * Get the list of 'DTSinOfficialMark' element items. ���������� ������  ���. ��������� �������.
     * 
     * @return list
     */
    public List<DTSinOfficialMarksType> getDTSinOfficialMarkList() {
        return DTSinOfficialMarkList;
    }

    /** 
     * Set the list of 'DTSinOfficialMark' element items. ���������� ������  ���. ��������� �������.
     * 
     * @param list
     */
    public void setDTSinOfficialMarkList(List<DTSinOfficialMarksType> list) {
        DTSinOfficialMarkList = list;
    }

    /** 
     * Get the 'DTSinTechMarks' element value. ��������������� �������.
     * 
     * @return value
     */
    public DTSinTechMarksType getDTSinTechMarks() {
        return DTSinTechMarks;
    }

    /** 
     * Set the 'DTSinTechMarks' element value. ��������������� �������.
     * 
     * @param DTSinTechMarks
     */
    public void setDTSinTechMarks(DTSinTechMarksType DTSinTechMarks) {
        this.DTSinTechMarks = DTSinTechMarks;
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
     * Get the 'GTDNumber' element value. ��������������� ����� ��.
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ��������������� ����� ��.
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
