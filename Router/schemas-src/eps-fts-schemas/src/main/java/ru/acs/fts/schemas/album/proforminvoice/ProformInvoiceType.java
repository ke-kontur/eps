
package ru.acs.fts.schemas.album.proforminvoice;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.InvoiceParticipantType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.MarkType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.RussianInvoiceGoodsType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.ShortCompanyDescType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DeliveryTermsRUType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ���� ��������
 */
public class ProformInvoiceType extends BaseDocType
{
    private String currencyCode;
    private String currencyRate;
    private String placesQuantity;
    private String grossWeightQuantity;
    private String netWeightQuantity;
    private OrganizationType consignor;
    private List<RussianInvoiceGoodsType> invoiceGoodList = new ArrayList<RussianInvoiceGoodsType>();
    private OrganizationType consignee;
    private InvoiceParticipantType buyer;
    private InvoiceParticipantType seler;
    private PersonSignatureType signature;
    private ShortCompanyDescType carier;
    private DocumentBaseType registration;
    private DeliveryTermsRUType deliveryTerms;
    private MarkType mark;
    private String documentModeID;

    /** 
     * Get the 'CurrencyCode' element value. ��� ����������� ������ �����-��������. �����������, ���� �����, ����������� � �����-�������, �������� � ����������� ������.
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ����������� ������ �����-��������. �����������, ���� �����, ����������� � �����-�������, �������� � ����������� ������.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'CurrencyRate' element value. ������������� ���� ����������� ������ �����-�������� �� ���� �����-��������. �����������, ���� ����-�������� � ����������� ������, ����  ������� �� ����� ����� ��.
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. ������������� ���� ����������� ������ �����-�������� �� ���� �����-��������. �����������, ���� ����-�������� � ����������� ������, ����  ������� �� ����� ����� ��.
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'PlacesQuantity' element value. ���������� ���� ������
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. ���������� ���� ������
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ��� ������, ������ (��)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ��� ������, ������ (��)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. ��� ������, ����� (��)
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. ��� ������, ����� (��)
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
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
     * Get the list of 'InvoiceGoods' element items. �������� � ������� �����-��������
     * 
     * @return list
     */
    public List<RussianInvoiceGoodsType> getInvoiceGoodList() {
        return invoiceGoodList;
    }

    /** 
     * Set the list of 'InvoiceGoods' element items. �������� � ������� �����-��������
     * 
     * @param list
     */
    public void setInvoiceGoodList(List<RussianInvoiceGoodsType> list) {
        invoiceGoodList = list;
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
     * Get the 'Buyer' element value. �������� � ����������
     * 
     * @return value
     */
    public InvoiceParticipantType getBuyer() {
        return buyer;
    }

    /** 
     * Set the 'Buyer' element value. �������� � ����������
     * 
     * @param buyer
     */
    public void setBuyer(InvoiceParticipantType buyer) {
        this.buyer = buyer;
    }

    /** 
     * Get the 'Seler' element value. �������� � ��������
     * 
     * @return value
     */
    public InvoiceParticipantType getSeler() {
        return seler;
    }

    /** 
     * Set the 'Seler' element value. �������� � ��������
     * 
     * @param seler
     */
    public void setSeler(InvoiceParticipantType seler) {
        this.seler = seler;
    }

    /** 
     * Get the 'Signature' element value. �������
     * 
     * @return value
     */
    public PersonSignatureType getSignature() {
        return signature;
    }

    /** 
     * Set the 'Signature' element value. �������
     * 
     * @param signature
     */
    public void setSignature(PersonSignatureType signature) {
        this.signature = signature;
    }

    /** 
     * Get the 'Carier' element value. ����������
     * 
     * @return value
     */
    public ShortCompanyDescType getCarier() {
        return carier;
    }

    /** 
     * Set the 'Carier' element value. ����������
     * 
     * @param carier
     */
    public void setCarier(ShortCompanyDescType carier) {
        this.carier = carier;
    }

    /** 
     * Get the 'Registration' element value. ��������������� ������ �����-��������.
     * 
     * @return value
     */
    public DocumentBaseType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. ��������������� ������ �����-��������.
     * 
     * @param registration
     */
    public void setRegistration(DocumentBaseType registration) {
        this.registration = registration;
    }

    /** 
     * Get the 'DeliveryTerms' element value. ������� ��������
     * 
     * @return value
     */
    public DeliveryTermsRUType getDeliveryTerms() {
        return deliveryTerms;
    }

    /** 
     * Set the 'DeliveryTerms' element value. ������� ��������
     * 
     * @param deliveryTerms
     */
    public void setDeliveryTerms(DeliveryTermsRUType deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
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
