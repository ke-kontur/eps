
package ru.acs.fts.schemas.album.certificateaccountsorgan;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ������� � ������� ������ � ����� � �����������
 */
public class CertificateAccountsOrganType extends BaseDocType
{
    private LocalDate dateIssue;
    private BankInfoType bankInfo;
    private DocumentBaseType requestTax;
    private OrganizationType taxInfo;
    private OrganizationBaseType organization;
    private List<AccountInfoType> accountInfoList = new ArrayList<AccountInfoType>();
    private PersonSignatureType bankRepresentative;
    private String documentModeID;

    /** 
     * Get the 'DateIssue' element value. ���� ������ �������
     * 
     * @return value
     */
    public LocalDate getDateIssue() {
        return dateIssue;
    }

    /** 
     * Set the 'DateIssue' element value. ���� ������ �������
     * 
     * @param dateIssue
     */
    public void setDateIssue(LocalDate dateIssue) {
        this.dateIssue = dateIssue;
    }

    /** 
     * Get the 'BankInfo' element value. �������� � �����
     * 
     * @return value
     */
    public BankInfoType getBankInfo() {
        return bankInfo;
    }

    /** 
     * Set the 'BankInfo' element value. �������� � �����
     * 
     * @param bankInfo
     */
    public void setBankInfo(BankInfoType bankInfo) {
        this.bankInfo = bankInfo;
    }

    /** 
     * Get the 'RequestTax' element value. �������� � ������� ���������� ������
     * 
     * @return value
     */
    public DocumentBaseType getRequestTax() {
        return requestTax;
    }

    /** 
     * Set the 'RequestTax' element value. �������� � ������� ���������� ������
     * 
     * @param requestTax
     */
    public void setRequestTax(DocumentBaseType requestTax) {
        this.requestTax = requestTax;
    }

    /** 
     * Get the 'TaxInfo' element value. �������� � ��������� ������
     * 
     * @return value
     */
    public OrganizationType getTaxInfo() {
        return taxInfo;
    }

    /** 
     * Set the 'TaxInfo' element value. �������� � ��������� ������
     * 
     * @param taxInfo
     */
    public void setTaxInfo(OrganizationType taxInfo) {
        this.taxInfo = taxInfo;
    }

    /** 
     * Get the 'Organization' element value. ������������ ����������� / ��� ����������� ����
     * 
     * @return value
     */
    public OrganizationBaseType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. ������������ ����������� / ��� ����������� ����
     * 
     * @param organization
     */
    public void setOrganization(OrganizationBaseType organization) {
        this.organization = organization;
    }

    /** 
     * Get the list of 'AccountInfo' element items. �������� � ������
     * 
     * @return list
     */
    public List<AccountInfoType> getAccountInfoList() {
        return accountInfoList;
    }

    /** 
     * Set the list of 'AccountInfo' element items. �������� � ������
     * 
     * @param list
     */
    public void setAccountInfoList(List<AccountInfoType> list) {
        accountInfoList = list;
    }

    /** 
     * Get the 'BankRepresentative' element value. ������������� �����
     * 
     * @return value
     */
    public PersonSignatureType getBankRepresentative() {
        return bankRepresentative;
    }

    /** 
     * Set the 'BankRepresentative' element value. ������������� �����
     * 
     * @param bankRepresentative
     */
    public void setBankRepresentative(PersonSignatureType bankRepresentative) {
        this.bankRepresentative = bankRepresentative;
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
