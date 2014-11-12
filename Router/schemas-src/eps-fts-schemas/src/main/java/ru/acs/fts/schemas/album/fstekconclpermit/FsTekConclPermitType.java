
package ru.acs.fts.schemas.album.fstekconclpermit;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� � ����������� �������� �� ����������� �������� �� �� ��������� ����� �� �� �������������� ������� � ����������/�� ������������� ������������������� ��������/ � ����������� ����� ������ � ���������� ��� ����������� �������������/ � ����������� �����������, ���������� ����������� ���������� �� ���������� ����������� ����������������� ���������� ������� � ���������� � ����� ����������� ��������
 */
public class FsTekConclPermitType extends BaseDocType
{
    private String BDRDID;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String destinationCountry;
    private LocalDate termReturns;
    private String conslusions;
    private AuthorizationType authorization;
    private DocumentBaseType contract;
    private PersonBaseType authorizedPerson;
    private CUOrganizationType releaseOrg;
    private CUOrganizationType consignee;
    private CUOrganizationType applicant;
    private String documentModeID;

    /** 
     * Get the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. �������� ������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. �������� ������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'DestinationCountry' element value. ������ ����������
     * 
     * @return value
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. ������ ����������
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the 'TermReturns' element value. ����  �������� ������
     * 
     * @return value
     */
    public LocalDate getTermReturns() {
        return termReturns;
    }

    /** 
     * Set the 'TermReturns' element value. ����  �������� ������
     * 
     * @param termReturns
     */
    public void setTermReturns(LocalDate termReturns) {
        this.termReturns = termReturns;
    }

    /** 
     * Get the 'Conslusions' element value. ������, ������������ � ����������
     * 
     * @return value
     */
    public String getConslusions() {
        return conslusions;
    }

    /** 
     * Set the 'Conslusions' element value. ������, ������������ � ����������
     * 
     * @param conslusions
     */
    public void setConslusions(String conslusions) {
        this.conslusions = conslusions;
    }

    /** 
     * Get the 'Authorization' element value. ����������/����������
     * 
     * @return value
     */
    public AuthorizationType getAuthorization() {
        return authorization;
    }

    /** 
     * Set the 'Authorization' element value. ����������/����������
     * 
     * @param authorization
     */
    public void setAuthorization(AuthorizationType authorization) {
        this.authorization = authorization;
    }

    /** 
     * Get the 'Contract' element value. ��������
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. ��������
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. �������������� ����������� ����, ����������� ����������/����������
     * 
     * @return value
     */
    public PersonBaseType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. �������������� ����������� ����, ����������� ����������/����������
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(PersonBaseType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }

    /** 
     * Get the 'ReleaseOrg' element value. ������������ �����������, �������� ����������
     * 
     * @return value
     */
    public CUOrganizationType getReleaseOrg() {
        return releaseOrg;
    }

    /** 
     * Set the 'ReleaseOrg' element value. ������������ �����������, �������� ����������
     * 
     * @param releaseOrg
     */
    public void setReleaseOrg(CUOrganizationType releaseOrg) {
        this.releaseOrg = releaseOrg;
    }

    /** 
     * Get the 'Consignee' element value. ������������ ������������ ���������� ������
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ������������ ������������ ���������� ������
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Applicant' element value. ���������
     * 
     * @return value
     */
    public CUOrganizationType getApplicant() {
        return applicant;
    }

    /** 
     * Set the 'Applicant' element value. ���������
     * 
     * @param applicant
     */
    public void setApplicant(CUOrganizationType applicant) {
        this.applicant = applicant;
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
