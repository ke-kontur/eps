
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
 * ����������� ����� ���
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
     * Get the 'GTDDocumentID' element value. ���������� ������������� ��.  ������������ ��� �������� � �� ��� ������������� ���
     * 
     * @return value
     */
    public String getGTDDocumentID() {
        return GTDDocumentID;
    }

    /** 
     * Set the 'GTDDocumentID' element value. ���������� ������������� ��.  ������������ ��� �������� � �� ��� ������������� ���
     * 
     * @param GTDDocumentID
     */
    public void setGTDDocumentID(String GTDDocumentID) {
        this.GTDDocumentID = GTDDocumentID;
    }

    /** 
     * Get the 'CurrencyDate' element value. ���� ���������� ����� ������
     * 
     * @return value
     */
    public LocalDate getCurrencyDate() {
        return currencyDate;
    }

    /** 
     * Set the 'CurrencyDate' element value. ���� ���������� ����� ������
     * 
     * @param currencyDate
     */
    public void setCurrencyDate(LocalDate currencyDate) {
        this.currencyDate = currencyDate;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��������� ��� ������������ ������ � ������������ � ��������������� �����
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��������� ��� ������������ ������ � ������������ � ��������������� �����
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'CurrencyRate' element value. ���� ������� ��� � ������������ ������
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. ���� ������� ��� � ������������ ������
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'ElectronicDocumentSign' element value. ������� ������������� ��� � ����� ������������ ���������. ��
     * 
     * @return value
     */
    public String getElectronicDocumentSign() {
        return electronicDocumentSign;
    }

    /** 
     * Set the 'ElectronicDocumentSign' element value. ������� ������������� ��� � ����� ������������ ���������. ��
     * 
     * @param electronicDocumentSign
     */
    public void setElectronicDocumentSign(String electronicDocumentSign) {
        this.electronicDocumentSign = electronicDocumentSign;
    }

    /** 
     * Get the 'CurrencyQuantity' element value. ���������� ������ ������, ��� ������� ������ ���� ��� ��
     * 
     * @return value
     */
    public String getCurrencyQuantity() {
        return currencyQuantity;
    }

    /** 
     * Set the 'CurrencyQuantity' element value. ���������� ������ ������, ��� ������� ������ ���� ��� ��
     * 
     * @param currencyQuantity
     */
    public void setCurrencyQuantity(String currencyQuantity) {
        this.currencyQuantity = currencyQuantity;
    }

    /** 
     * Get the 'FormDTS' element value. ����� ���: 1 - ���-1; 2 - ���-2
     * 
     * @return value
     */
    public String getFormDTS() {
        return formDTS;
    }

    /** 
     * Set the 'FormDTS' element value. ����� ���: 1 - ���-1; 2 - ���-2
     * 
     * @param formDTS
     */
    public void setFormDTS(String formDTS) {
        this.formDTS = formDTS;
    }

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
     * Get the 'DTSoutSeller' element value. �������� � ��������.�� 1
     * 
     * @return value
     */
    public CUOrganizationType getDTSoutSeller() {
        return DTSoutSeller;
    }

    /** 
     * Set the 'DTSoutSeller' element value. �������� � ��������.�� 1
     * 
     * @param DTSoutSeller
     */
    public void setDTSoutSeller(CUOrganizationType DTSoutSeller) {
        this.DTSoutSeller = DTSoutSeller;
    }

    /** 
     * Get the 'DTSoutBuyer' element value. �������� � ����������. �� 2�
     * 
     * @return value
     */
    public CUOrganizationType getDTSoutBuyer() {
        return DTSoutBuyer;
    }

    /** 
     * Set the 'DTSoutBuyer' element value. �������� � ����������. �� 2�
     * 
     * @param DTSoutBuyer
     */
    public void setDTSoutBuyer(CUOrganizationType DTSoutBuyer) {
        this.DTSoutBuyer = DTSoutBuyer;
    }

    /** 
     * Get the list of 'DTSInvoiceDocuments' element items. �������� � ����������. ���-1, ��. 4,5.6; ���-2, ��. 4,5,8
     * 
     * @return list
     */
    public List<DTSPresentedDocumentsType> getDTSInvoiceDocumentList() {
        return DTSInvoiceDocumentList;
    }

    /** 
     * Set the list of 'DTSInvoiceDocuments' element items. �������� � ����������. ���-1, ��. 4,5.6; ���-2, ��. 4,5,8
     * 
     * @param list
     */
    public void setDTSInvoiceDocumentList(List<DTSPresentedDocumentsType> list) {
        DTSInvoiceDocumentList = list;
    }

    /** 
     * Get the 'DTSBuyerSellerDependence' element value. ����������� ����� ����������� � ���������. ���-1, ��.7
     * 
     * @return value
     */
    public DTSBuyerSellerDependenceType getDTSBuyerSellerDependence() {
        return DTSBuyerSellerDependence;
    }

    /** 
     * Set the 'DTSBuyerSellerDependence' element value. ����������� ����� ����������� � ���������. ���-1, ��.7
     * 
     * @param DTSBuyerSellerDependence
     */
    public void setDTSBuyerSellerDependence(
            DTSBuyerSellerDependenceType DTSBuyerSellerDependence) {
        this.DTSBuyerSellerDependence = DTSBuyerSellerDependence;
    }

    /** 
     * Get the 'DTSSellingLimitation' element value. ����������� �� ����������� ��������  � ������������� ��� ������� �������. ���-1, ��.8
     * 
     * @return value
     */
    public DTSSellingLimitationType getDTSSellingLimitation() {
        return DTSSellingLimitation;
    }

    /** 
     * Set the 'DTSSellingLimitation' element value. ����������� �� ����������� ��������  � ������������� ��� ������� �������. ���-1, ��.8
     * 
     * @param DTSSellingLimitation
     */
    public void setDTSSellingLimitation(
            DTSSellingLimitationType DTSSellingLimitation) {
        this.DTSSellingLimitation = DTSSellingLimitation;
    }

    /** 
     * Get the 'DTSAdditionalPayments' element value. ������� �� ������������� ���������������� ������������� � ������� �������� ����� ������ ��������. ���-1,  ��.9
     * 
     * @return value
     */
    public DTSAdditionalPaymentsType getDTSAdditionalPayments() {
        return DTSAdditionalPayments;
    }

    /** 
     * Set the 'DTSAdditionalPayments' element value. ������� �� ������������� ���������������� ������������� � ������� �������� ����� ������ ��������. ���-1,  ��.9
     * 
     * @param DTSAdditionalPayments
     */
    public void setDTSAdditionalPayments(
            DTSAdditionalPaymentsType DTSAdditionalPayments) {
        this.DTSAdditionalPayments = DTSAdditionalPayments;
    }

    /** 
     * Get the list of 'DTSout_CUGoodsCustomsCost' element items. ������������ ���������� ��������� �� ������
     * 
     * @return list
     */
    public List<GoodsCustomsCostType> getDTSoutCUGoodsCustomsCostList() {
        return DTSoutCUGoodsCustomsCostList;
    }

    /** 
     * Set the list of 'DTSout_CUGoodsCustomsCost' element items. ������������ ���������� ��������� �� ������
     * 
     * @param list
     */
    public void setDTSoutCUGoodsCustomsCostList(List<GoodsCustomsCostType> list) {
        DTSoutCUGoodsCustomsCostList = list;
    }

    /** 
     * Get the 'GTDNumber' element value. ��������������� ����� ��. ������������ ��� �������������� ��� �������� �� ��
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ��������������� ����� ��. ������������ ��� �������������� ��� �������� �� ��
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }

    /** 
     * Get the 'DTSout_CUFilledPerson' element value. ���� ���������� � ����, ����������� ���
     * 
     * @return value
     */
    public DTSFilledPersonType getDTSoutCUFilledPerson() {
        return DTSoutCUFilledPerson;
    }

    /** 
     * Set the 'DTSout_CUFilledPerson' element value. ���� ���������� � ����, ����������� ���
     * 
     * @param DTSoutCUFilledPerson
     */
    public void setDTSoutCUFilledPerson(DTSFilledPersonType DTSoutCUFilledPerson) {
        this.DTSoutCUFilledPerson = DTSoutCUFilledPerson;
    }

    /** 
     * Get the 'DTSoutDeclarant' element value. �������� � ����������. �� 2�
     * 
     * @return value
     */
    public CUOrganizationType getDTSoutDeclarant() {
        return DTSoutDeclarant;
    }

    /** 
     * Set the 'DTSoutDeclarant' element value. �������� � ����������. �� 2�
     * 
     * @param DTSoutDeclarant
     */
    public void setDTSoutDeclarant(CUOrganizationType DTSoutDeclarant) {
        this.DTSoutDeclarant = DTSoutDeclarant;
    }

    /** 
     * Get the list of 'DeliveryTerms' element items. ������� �������� �������
     * 
     * @return list
     */
    public List<DeliveryTermsType> getDeliveryTermList() {
        return deliveryTermList;
    }

    /** 
     * Set the list of 'DeliveryTerms' element items. ������� �������� �������
     * 
     * @param list
     */
    public void setDeliveryTermList(List<DeliveryTermsType> list) {
        deliveryTermList = list;
    }

    /** 
     * Get the 'ReasonApplyMethod' element value. �������, �� ������� �������������� ������ ����������� ��������� �� ���������. ���-2 ��. 7
     * 
     * @return value
     */
    public ReasonApplyMethodType getReasonApplyMethod() {
        return reasonApplyMethod;
    }

    /** 
     * Set the 'ReasonApplyMethod' element value. �������, �� ������� �������������� ������ ����������� ��������� �� ���������. ���-2 ��. 7
     * 
     * @param reasonApplyMethod
     */
    public void setReasonApplyMethod(ReasonApplyMethodType reasonApplyMethod) {
        this.reasonApplyMethod = reasonApplyMethod;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ��������� (��� ��������� �� ������� ��������)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ��������� (��� ��������� �� ������� ��������)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
