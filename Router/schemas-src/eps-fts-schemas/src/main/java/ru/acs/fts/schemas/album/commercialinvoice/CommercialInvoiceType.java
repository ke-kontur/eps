
package ru.acs.fts.schemas.album.commercialinvoice;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.MarkType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.RussianInvoiceGoodsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ���� �������
 */
public class CommercialInvoiceType extends BaseDocType
{
    private String currencyCode;
    private String currencyRate;
    private String totalCost;
    private String taxSum;
    private OrganizationType buyer;
    private OrganizationType seller;
    private OrganizationType consignee;
    private OrganizationType consignor;
    private List<RussianInvoiceGoodsType> invoiceGoodList = new ArrayList<RussianInvoiceGoodsType>();
    private List<DocumentBaseType> payDocsRegistrationList = new ArrayList<DocumentBaseType>();
    private DocumentBaseType registration;
    private int choiceSelect = -1;
    private static final int INDIVIDUAL_ENTREPRENEUR_CHOICE = 0;
    private static final int SIGNATURE_DIRECTOR_CHIEF_ACCOUNTANT_CHOICE = 1;
    private IndividualEntrepreneurType individualEntrepreneur;
    private SignatureDirectorChiefAccountantType signatureDirectorChiefAccountant;
    private MarkType mark;
    private String documentModeID;

    /** 
     * Get the 'CurrencyCode' element value. ��� ����������� ������ �����-�������. �����������, ���� �����, ����������� � �����-�������, �������� � ����������� ������.
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ����������� ������ �����-�������. �����������, ���� �����, ����������� � �����-�������, �������� � ����������� ������.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'CurrencyRate' element value. ������������� ���� ����������� ������ �����-������� �� ���� �����-�������. �����������, ���� ����-������� � ����������� ������, ����  ������� �� ����� ����� ��.
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. ������������� ���� ����������� ������ �����-������� �� ���� �����-�������. �����������, ���� ����-������� � ����������� ������, ����  ������� �� ����� ����� ��.
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'TotalCost' element value. ����� ��������� ���� �������, � ������ �������.
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. ����� ��������� ���� �������, � ������ �������.
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /** 
     * Get the 'TaxSum' element value. ����� ����� ��������� ������.
     * 
     * @return value
     */
    public String getTaxSum() {
        return taxSum;
    }

    /** 
     * Set the 'TaxSum' element value. ����� ����� ��������� ������.
     * 
     * @param taxSum
     */
    public void setTaxSum(String taxSum) {
        this.taxSum = taxSum;
    }

    /** 
     * Get the 'Buyer' element value. �������� � ����������
     * 
     * @return value
     */
    public OrganizationType getBuyer() {
        return buyer;
    }

    /** 
     * Set the 'Buyer' element value. �������� � ����������
     * 
     * @param buyer
     */
    public void setBuyer(OrganizationType buyer) {
        this.buyer = buyer;
    }

    /** 
     * Get the 'Seller' element value. �������� � ��������
     * 
     * @return value
     */
    public OrganizationType getSeller() {
        return seller;
    }

    /** 
     * Set the 'Seller' element value. �������� � ��������
     * 
     * @param seller
     */
    public void setSeller(OrganizationType seller) {
        this.seller = seller;
    }

    /** 
     * Get the 'Consignee' element value. ��������������� � ��� �����
     * 
     * @return value
     */
    public OrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ��������������� � ��� �����
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Consignor' element value. ���������������� � ��� �����
     * 
     * @return value
     */
    public OrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. ���������������� � ��� �����
     * 
     * @param consignor
     */
    public void setConsignor(OrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the list of 'InvoiceGoods' element items. �������� � ������� �����-�������
     * 
     * @return list
     */
    public List<RussianInvoiceGoodsType> getInvoiceGoodList() {
        return invoiceGoodList;
    }

    /** 
     * Set the list of 'InvoiceGoods' element items. �������� � ������� �����-�������
     * 
     * @param list
     */
    public void setInvoiceGoodList(List<RussianInvoiceGoodsType> list) {
        invoiceGoodList = list;
    }

    /** 
     * Get the list of 'PayDocsRegistration' element items. ��������-��������� ��������� � �����-�������.
     * 
     * @return list
     */
    public List<DocumentBaseType> getPayDocsRegistrationList() {
        return payDocsRegistrationList;
    }

    /** 
     * Set the list of 'PayDocsRegistration' element items. ��������-��������� ��������� � �����-�������.
     * 
     * @param list
     */
    public void setPayDocsRegistrationList(List<DocumentBaseType> list) {
        payDocsRegistrationList = list;
    }

    /** 
     * Get the 'Registration' element value. ��������������� ������ �����-�������.
     * 
     * @return value
     */
    public DocumentBaseType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. ��������������� ������ �����-�������.
     * 
     * @param registration
     */
    public void setRegistration(DocumentBaseType registration) {
        this.registration = registration;
    }

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if IndividualEntrepreneur is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifIndividualEntrepreneur() {
        return choiceSelect == INDIVIDUAL_ENTREPRENEUR_CHOICE;
    }

    /** 
     * Get the 'IndividualEntrepreneur' element value. �������������� ���������������
     * 
     * @return value
     */
    public IndividualEntrepreneurType getIndividualEntrepreneur() {
        return individualEntrepreneur;
    }

    /** 
     * Set the 'IndividualEntrepreneur' element value. �������������� ���������������
     * 
     * @param individualEntrepreneur
     */
    public void setIndividualEntrepreneur(
            IndividualEntrepreneurType individualEntrepreneur) {
        setChoiceSelect(INDIVIDUAL_ENTREPRENEUR_CHOICE);
        this.individualEntrepreneur = individualEntrepreneur;
    }

    /** 
     * Check if SignatureDirectorChiefAccountant is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifSignatureDirectorChiefAccountant() {
        return choiceSelect == SIGNATURE_DIRECTOR_CHIEF_ACCOUNTANT_CHOICE;
    }

    /** 
     * Get the 'SignatureDirectorChiefAccountant' element value. ������� ������������ ����������� � �������� ����������.
     * 
     * @return value
     */
    public SignatureDirectorChiefAccountantType getSignatureDirectorChiefAccountant() {
        return signatureDirectorChiefAccountant;
    }

    /** 
     * Set the 'SignatureDirectorChiefAccountant' element value. ������� ������������ ����������� � �������� ����������.
     * 
     * @param signatureDirectorChiefAccountant
     */
    public void setSignatureDirectorChiefAccountant(
            SignatureDirectorChiefAccountantType signatureDirectorChiefAccountant) {
        setChoiceSelect(SIGNATURE_DIRECTOR_CHIEF_ACCOUNTANT_CHOICE);
        this.signatureDirectorChiefAccountant = signatureDirectorChiefAccountant;
    }

    /** 
     * Get the 'Mark' element value. ������� � ����������� �������� ����������� � ���� ����� ���������������� ��������.
     * 
     * @return value
     */
    public MarkType getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. ������� � ����������� �������� ����������� � ���� ����� ���������������� ��������.
     * 
     * @param mark
     */
    public void setMark(MarkType mark) {
        this.mark = mark;
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
