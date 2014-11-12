
package ru.acs.fts.schemas.album.resulttk;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * �������� �� ������ ������
 */
public class PenaltyType
{
    private String penaltyCreateDateTime;
    private String payDateTime;
    private String organization;
    private DocumentBaseType payDoc;
    private CUOrganizationType payer;
    private BankRequisType bankRequis;
    private TransportMeansBaseType TSInfo;

    /** 
     * Get the 'PenaltyCreateDateTime' element value. ����/����� �������� �������
     * 
     * @return value
     */
    public String getPenaltyCreateDateTime() {
        return penaltyCreateDateTime;
    }

    /** 
     * Set the 'PenaltyCreateDateTime' element value. ����/����� �������� �������
     * 
     * @param penaltyCreateDateTime
     */
    public void setPenaltyCreateDateTime(String penaltyCreateDateTime) {
        this.penaltyCreateDateTime = penaltyCreateDateTime;
    }

    /** 
     * Get the 'PayDateTime' element value. ����/����� ������
     * 
     * @return value
     */
    public String getPayDateTime() {
        return payDateTime;
    }

    /** 
     * Set the 'PayDateTime' element value. ����/����� ������
     * 
     * @param payDateTime
     */
    public void setPayDateTime(String payDateTime) {
        this.payDateTime = payDateTime;
    }

    /** 
     * Get the 'Organization' element value. ��� ��, ��� ���� ������� ������ �� ������
     * 
     * @return value
     */
    public String getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. ��� ��, ��� ���� ������� ������ �� ������
     * 
     * @param organization
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /** 
     * Get the 'PayDoc' element value. ��������� ��������
     * 
     * @return value
     */
    public DocumentBaseType getPayDoc() {
        return payDoc;
    }

    /** 
     * Set the 'PayDoc' element value. ��������� ��������
     * 
     * @param payDoc
     */
    public void setPayDoc(DocumentBaseType payDoc) {
        this.payDoc = payDoc;
    }

    /** 
     * Get the 'Payer' element value. ����������
     * 
     * @return value
     */
    public CUOrganizationType getPayer() {
        return payer;
    }

    /** 
     * Set the 'Payer' element value. ����������
     * 
     * @param payer
     */
    public void setPayer(CUOrganizationType payer) {
        this.payer = payer;
    }

    /** 
     * Get the 'BankRequis' element value. ��������� �����
     * 
     * @return value
     */
    public BankRequisType getBankRequis() {
        return bankRequis;
    }

    /** 
     * Set the 'BankRequis' element value. ��������� �����
     * 
     * @param bankRequis
     */
    public void setBankRequis(BankRequisType bankRequis) {
        this.bankRequis = bankRequis;
    }

    /** 
     * Get the 'TSInfo' element value. �������� � ������������ ��������
     * 
     * @return value
     */
    public TransportMeansBaseType getTSInfo() {
        return TSInfo;
    }

    /** 
     * Set the 'TSInfo' element value. �������� � ������������ ��������
     * 
     * @param TSInfo
     */
    public void setTSInfo(TransportMeansBaseType TSInfo) {
        this.TSInfo = TSInfo;
    }
}
