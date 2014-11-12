
package ru.acs.fts.schemas.album.cashmemorandum;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * �������� �� ��������� � ��������� ����
 */
public class CashMemorandumType extends BaseDocType
{
    private String number;
    private String createDateTime;
    private String cashDeskNumber;
    private String cashPayment;
    private String currencyCode;
    private String sum;
    private String change;
    private String customer;
    private SellerType seller;
    private PersonSignatureType sellerSignature;
    private PersonSignatureType customerSignature;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private String documentModeID;

    /** 
     * Get the 'Number' element value. ����� ����
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. ����� ����
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'CreateDateTime' element value. ���� � ����� ����������� ����
     * 
     * @return value
     */
    public String getCreateDateTime() {
        return createDateTime;
    }

    /** 
     * Set the 'CreateDateTime' element value. ���� � ����� ����������� ����
     * 
     * @param createDateTime
     */
    public void setCreateDateTime(String createDateTime) {
        this.createDateTime = createDateTime;
    }

    /** 
     * Get the 'CashDeskNumber' element value. ����� �����
     * 
     * @return value
     */
    public String getCashDeskNumber() {
        return cashDeskNumber;
    }

    /** 
     * Set the 'CashDeskNumber' element value. ����� �����
     * 
     * @param cashDeskNumber
     */
    public void setCashDeskNumber(String cashDeskNumber) {
        this.cashDeskNumber = cashDeskNumber;
    }

    /** 
     * Get the 'CashPayment' element value. ������� ����, ��� ������ �������� ��������
     * 
     * @return value
     */
    public String getCashPayment() {
        return cashPayment;
    }

    /** 
     * Set the 'CashPayment' element value. ������� ����, ��� ������ �������� ��������
     * 
     * @param cashPayment
     */
    public void setCashPayment(String cashPayment) {
        this.cashPayment = cashPayment;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������ ����
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������ ����
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'Sum' element value. ����� �����, ���������� �����������
     * 
     * @return value
     */
    public String getSum() {
        return sum;
    }

    /** 
     * Set the 'Sum' element value. ����� �����, ���������� �����������
     * 
     * @param sum
     */
    public void setSum(String sum) {
        this.sum = sum;
    }

    /** 
     * Get the 'Change' element value. �����
     * 
     * @return value
     */
    public String getChange() {
        return change;
    }

    /** 
     * Set the 'Change' element value. �����
     * 
     * @param change
     */
    public void setChange(String change) {
        this.change = change;
    }

    /** 
     * Get the 'Customer' element value. ����������
     * 
     * @return value
     */
    public String getCustomer() {
        return customer;
    }

    /** 
     * Set the 'Customer' element value. ����������
     * 
     * @param customer
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /** 
     * Get the 'Seller' element value. ��������
     * 
     * @return value
     */
    public SellerType getSeller() {
        return seller;
    }

    /** 
     * Set the 'Seller' element value. ��������
     * 
     * @param seller
     */
    public void setSeller(SellerType seller) {
        this.seller = seller;
    }

    /** 
     * Get the 'SellerSignature' element value. ������� �������� (�������)
     * 
     * @return value
     */
    public PersonSignatureType getSellerSignature() {
        return sellerSignature;
    }

    /** 
     * Set the 'SellerSignature' element value. ������� �������� (�������)
     * 
     * @param sellerSignature
     */
    public void setSellerSignature(PersonSignatureType sellerSignature) {
        this.sellerSignature = sellerSignature;
    }

    /** 
     * Get the 'CustomerSignature' element value. ������� ����������
     * 
     * @return value
     */
    public PersonSignatureType getCustomerSignature() {
        return customerSignature;
    }

    /** 
     * Set the 'CustomerSignature' element value. ������� ����������
     * 
     * @param customerSignature
     */
    public void setCustomerSignature(PersonSignatureType customerSignature) {
        this.customerSignature = customerSignature;
    }

    /** 
     * Get the list of 'Goods' element items. �����
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �����
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
