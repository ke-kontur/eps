
package ru.acs.fts.schemas.album.commonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� � ���������� ������
 */
public class BankInformationType
{
    private List<String> bankAccountList = new ArrayList<String>();
    private List<String> bankAccountDescriptionList = new ArrayList<String>();
    private String bankName;
    private String bankMFO;
    private String OKPOID;
    private String BICID;
    private String SWIFTID;
    private String corrAccount;
    private List<String> transitCurrencyAccountList = new ArrayList<String>();
    private List<String> specialTransitCurrencyAccountList = new ArrayList<String>();

    /** 
     * Get the list of 'BankAccount' element items. ����� ����������� �����
     * 
     * @return list
     */
    public List<String> getBankAccountList() {
        return bankAccountList;
    }

    /** 
     * Set the list of 'BankAccount' element items. ����� ����������� �����
     * 
     * @param list
     */
    public void setBankAccountList(List<String> list) {
        bankAccountList = list;
    }

    /** 
     * Get the list of 'BankAccountDescription' element items. �������� ���� �����: ���������, ��������
     * 
     * @return list
     */
    public List<String> getBankAccountDescriptionList() {
        return bankAccountDescriptionList;
    }

    /** 
     * Set the list of 'BankAccountDescription' element items. �������� ���� �����: ���������, ��������
     * 
     * @param list
     */
    public void setBankAccountDescriptionList(List<String> list) {
        bankAccountDescriptionList = list;
    }

    /** 
     * Get the 'BankName' element value. �������� �����
     * 
     * @return value
     */
    public String getBankName() {
        return bankName;
    }

    /** 
     * Set the 'BankName' element value. �������� �����
     * 
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /** 
     * Get the 'BankMFO' element value. ��� �����
     * 
     * @return value
     */
    public String getBankMFO() {
        return bankMFO;
    }

    /** 
     * Set the 'BankMFO' element value. ��� �����
     * 
     * @param bankMFO
     */
    public void setBankMFO(String bankMFO) {
        this.bankMFO = bankMFO;
    }

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
     * Get the 'CorrAccount' element value. ����� ������������������ ����� �����
     * 
     * @return value
     */
    public String getCorrAccount() {
        return corrAccount;
    }

    /** 
     * Set the 'CorrAccount' element value. ����� ������������������ ����� �����
     * 
     * @param corrAccount
     */
    public void setCorrAccount(String corrAccount) {
        this.corrAccount = corrAccount;
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
}
