
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * ��������� ��������� �����������
 */
public class PaymentRequisitionsType
{
    private String OKPOID;
    private String bankName;
    private String BICID;
    private String SWIFTID;
    private String accountNumeric;
    private List<String> currentCurrencyAccountList = new ArrayList<String>();
    private List<String> transitCurrencyAccountList = new ArrayList<String>();
    private List<String> specialTransitCurrencyAccountList = new ArrayList<String>();
    private String roubleCurrencyAccount;
    private AddressType bankPostalAddress;

    /** 
     * Get the 'OKPOID' element value. ��� ����� �� ����
     * 
     * @return value
     */
    public String getOKPOID() {
        return OKPOID;
    }

    /** 
     * Set the 'OKPOID' element value. ��� ����� �� ����
     * 
     * @param OKPOID
     */
    public void setOKPOID(String OKPOID) {
        this.OKPOID = OKPOID;
    }

    /** 
     * Get the 'BankName' element value. ������������ �����
     * 
     * @return value
     */
    public String getBankName() {
        return bankName;
    }

    /** 
     * Set the 'BankName' element value. ������������ �����
     * 
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /** 
     * Get the 'BICID' element value. ��� �����
     * 
     * @return value
     */
    public String getBICID() {
        return BICID;
    }

    /** 
     * Set the 'BICID' element value. ��� �����
     * 
     * @param BICID
     */
    public void setBICID(String BICID) {
        this.BICID = BICID;
    }

    /** 
     * Get the 'SWIFTID' element value. SWIFT ��� �����
     * 
     * @return value
     */
    public String getSWIFTID() {
        return SWIFTID;
    }

    /** 
     * Set the 'SWIFTID' element value. SWIFT ��� �����
     * 
     * @param SWIFTID
     */
    public void setSWIFTID(String SWIFTID) {
        this.SWIFTID = SWIFTID;
    }

    /** 
     * Get the 'AccountNumeric' element value. ����� ������������������ ����� �����
     * 
     * @return value
     */
    public String getAccountNumeric() {
        return accountNumeric;
    }

    /** 
     * Set the 'AccountNumeric' element value. ����� ������������������ ����� �����
     * 
     * @param accountNumeric
     */
    public void setAccountNumeric(String accountNumeric) {
        this.accountNumeric = accountNumeric;
    }

    /** 
     * Get the list of 'CurrentCurrencyAccount' element items. �������� ���� ����������� (�������)
     * 
     * @return list
     */
    public List<String> getCurrentCurrencyAccountList() {
        return currentCurrencyAccountList;
    }

    /** 
     * Set the list of 'CurrentCurrencyAccount' element items. �������� ���� ����������� (�������)
     * 
     * @param list
     */
    public void setCurrentCurrencyAccountList(List<String> list) {
        currentCurrencyAccountList = list;
    }

    /** 
     * Get the list of 'TransitCurrencyAccount' element items. �������� ���� ����������� (����������)
     * 
     * @return list
     */
    public List<String> getTransitCurrencyAccountList() {
        return transitCurrencyAccountList;
    }

    /** 
     * Set the list of 'TransitCurrencyAccount' element items. �������� ���� ����������� (����������)
     * 
     * @param list
     */
    public void setTransitCurrencyAccountList(List<String> list) {
        transitCurrencyAccountList = list;
    }

    /** 
     * Get the list of 'SpecialTransitCurrencyAccount' element items. �������� ���� ����������� (����������� ����������)
     * 
     * @return list
     */
    public List<String> getSpecialTransitCurrencyAccountList() {
        return specialTransitCurrencyAccountList;
    }

    /** 
     * Set the list of 'SpecialTransitCurrencyAccount' element items. �������� ���� ����������� (����������� ����������)
     * 
     * @param list
     */
    public void setSpecialTransitCurrencyAccountList(List<String> list) {
        specialTransitCurrencyAccountList = list;
    }

    /** 
     * Get the 'RoubleCurrencyAccount' element value. �������� ��������� ���� �����������
     * 
     * @return value
     */
    public String getRoubleCurrencyAccount() {
        return roubleCurrencyAccount;
    }

    /** 
     * Set the 'RoubleCurrencyAccount' element value. �������� ��������� ���� �����������
     * 
     * @param roubleCurrencyAccount
     */
    public void setRoubleCurrencyAccount(String roubleCurrencyAccount) {
        this.roubleCurrencyAccount = roubleCurrencyAccount;
    }

    /** 
     * Get the 'BankPostalAddress' element value. �������� ������ ����� (����� �������� �������� ���������������)
     * 
     * @return value
     */
    public AddressType getBankPostalAddress() {
        return bankPostalAddress;
    }

    /** 
     * Set the 'BankPostalAddress' element value. �������� ������ ����� (����� �������� �������� ���������������)
     * 
     * @param bankPostalAddress
     */
    public void setBankPostalAddress(AddressType bankPostalAddress) {
        this.bankPostalAddress = bankPostalAddress;
    }
}
