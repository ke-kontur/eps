
package ru.acs.fts.schemas.album.automobileinsurancepolicy;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ��������� ����� ������������ ���������������
 */
public class AutomobileInsurancePolicyType extends BaseDocType
{
    private List<String> specialCommentList = new ArrayList<String>();
    private String insurerName;
    private String signSeriesCode;
    private String insuranceTermBegin;
    private String insuranceTermEnd;
    private String signID;
    private String sumInsured;
    private String insurancePremium;
    private RegistrationType registration;
    private InsurerType insurer;
    private AutomobileOwnerType automobileOwner;
    private AIPTransportMeansType AIPTransportMeans;
    private List<AllowedPersonsType> allowedPersonsInformationList = new ArrayList<AllowedPersonsType>();
    private List<UseTransportTermType> useTransportTermList = new ArrayList<UseTransportTermType>();
    private List<DocumentBaseType> automobileDocList = new ArrayList<DocumentBaseType>();
    private PersonBaseType insuranceAgent;
    private PersonBaseType insurerSign;
    private String documentModeID;

    /** 
     * Get the list of 'SpecialComments' element items. ������ ������� 
     * 
     * @return list
     */
    public List<String> getSpecialCommentList() {
        return specialCommentList;
    }

    /** 
     * Set the list of 'SpecialComments' element items. ������ ������� 
     * 
     * @param list
     */
    public void setSpecialCommentList(List<String> list) {
        specialCommentList = list;
    }

    /** 
     * Get the 'InsurerName' element value. ������������ �����������
     * 
     * @return value
     */
    public String getInsurerName() {
        return insurerName;
    }

    /** 
     * Set the 'InsurerName' element value. ������������ �����������
     * 
     * @param insurerName
     */
    public void setInsurerName(String insurerName) {
        this.insurerName = insurerName;
    }

    /** 
     * Get the 'SignSeriesCode' element value. ����� ����� ���������������� �������
     * 
     * @return value
     */
    public String getSignSeriesCode() {
        return signSeriesCode;
    }

    /** 
     * Set the 'SignSeriesCode' element value. ����� ����� ���������������� �������
     * 
     * @param signSeriesCode
     */
    public void setSignSeriesCode(String signSeriesCode) {
        this.signSeriesCode = signSeriesCode;
    }

    /** 
     * Get the 'InsuranceTermBegin' element value. ������ ����� �����������
     * 
     * @return value
     */
    public String getInsuranceTermBegin() {
        return insuranceTermBegin;
    }

    /** 
     * Set the 'InsuranceTermBegin' element value. ������ ����� �����������
     * 
     * @param insuranceTermBegin
     */
    public void setInsuranceTermBegin(String insuranceTermBegin) {
        this.insuranceTermBegin = insuranceTermBegin;
    }

    /** 
     * Get the 'InsuranceTermEnd' element value. ����� ����� �����������
     * 
     * @return value
     */
    public String getInsuranceTermEnd() {
        return insuranceTermEnd;
    }

    /** 
     * Set the 'InsuranceTermEnd' element value. ����� ����� �����������
     * 
     * @param insuranceTermEnd
     */
    public void setInsuranceTermEnd(String insuranceTermEnd) {
        this.insuranceTermEnd = insuranceTermEnd;
    }

    /** 
     * Get the 'SignID' element value. ����� ����� ���������������� �������
     * 
     * @return value
     */
    public String getSignID() {
        return signID;
    }

    /** 
     * Set the 'SignID' element value. ����� ����� ���������������� �������
     * 
     * @param signID
     */
    public void setSignID(String signID) {
        this.signID = signID;
    }

    /** 
     * Get the 'SumInsured' element value. ������. ��������� �����
     * 
     * @return value
     */
    public String getSumInsured() {
        return sumInsured;
    }

    /** 
     * Set the 'SumInsured' element value. ������. ��������� �����
     * 
     * @param sumInsured
     */
    public void setSumInsured(String sumInsured) {
        this.sumInsured = sumInsured;
    }

    /** 
     * Get the 'InsurancePremium' element value. ��������� ������
     * 
     * @return value
     */
    public String getInsurancePremium() {
        return insurancePremium;
    }

    /** 
     * Set the 'InsurancePremium' element value. ��������� ������
     * 
     * @param insurancePremium
     */
    public void setInsurancePremium(String insurancePremium) {
        this.insurancePremium = insurancePremium;
    }

    /** 
     * Get the 'Registration' element value. ��������������� ������ ������
     * 
     * @return value
     */
    public RegistrationType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. ��������������� ������ ������
     * 
     * @param registration
     */
    public void setRegistration(RegistrationType registration) {
        this.registration = registration;
    }

    /** 
     * Get the 'Insurer' element value. �������� � ������������
     * 
     * @return value
     */
    public InsurerType getInsurer() {
        return insurer;
    }

    /** 
     * Set the 'Insurer' element value. �������� � ������������
     * 
     * @param insurer
     */
    public void setInsurer(InsurerType insurer) {
        this.insurer = insurer;
    }

    /** 
     * Get the 'AutomobileOwner' element value. �������� � ������������ ������������� ��������
     * 
     * @return value
     */
    public AutomobileOwnerType getAutomobileOwner() {
        return automobileOwner;
    }

    /** 
     * Set the 'AutomobileOwner' element value. �������� � ������������ ������������� ��������
     * 
     * @param automobileOwner
     */
    public void setAutomobileOwner(AutomobileOwnerType automobileOwner) {
        this.automobileOwner = automobileOwner;
    }

    /** 
     * Get the 'AIPTransportMeans' element value. C������� � ������������ �������� 
     * 
     * @return value
     */
    public AIPTransportMeansType getAIPTransportMeans() {
        return AIPTransportMeans;
    }

    /** 
     * Set the 'AIPTransportMeans' element value. C������� � ������������ �������� 
     * 
     * @param AIPTransportMeans
     */
    public void setAIPTransportMeans(AIPTransportMeansType AIPTransportMeans) {
        this.AIPTransportMeans = AIPTransportMeans;
    }

    /** 
     * Get the list of 'AllowedPersonsInformation' element items. �������� � �����, ���������� � ���������� ������������� ��������
     * 
     * @return list
     */
    public List<AllowedPersonsType> getAllowedPersonsInformationList() {
        return allowedPersonsInformationList;
    }

    /** 
     * Set the list of 'AllowedPersonsInformation' element items. �������� � �����, ���������� � ���������� ������������� ��������
     * 
     * @param list
     */
    public void setAllowedPersonsInformationList(List<AllowedPersonsType> list) {
        allowedPersonsInformationList = list;
    }

    /** 
     * Get the list of 'UseTransportTerm' element items. ������ ������������� ��
     * 
     * @return list
     */
    public List<UseTransportTermType> getUseTransportTermList() {
        return useTransportTermList;
    }

    /** 
     * Set the list of 'UseTransportTerm' element items. ������ ������������� ��
     * 
     * @param list
     */
    public void setUseTransportTermList(List<UseTransportTermType> list) {
        useTransportTermList = list;
    }

    /** 
     * Get the list of 'AutomobileDoc' element items. ��������������� ��������� �� ����������
     * 
     * @return list
     */
    public List<DocumentBaseType> getAutomobileDocList() {
        return automobileDocList;
    }

    /** 
     * Set the list of 'AutomobileDoc' element items. ��������������� ��������� �� ����������
     * 
     * @param list
     */
    public void setAutomobileDocList(List<DocumentBaseType> list) {
        automobileDocList = list;
    }

    /** 
     * Get the 'InsuranceAgent' element value. ��������� �����
     * 
     * @return value
     */
    public PersonBaseType getInsuranceAgent() {
        return insuranceAgent;
    }

    /** 
     * Set the 'InsuranceAgent' element value. ��������� �����
     * 
     * @param insuranceAgent
     */
    public void setInsuranceAgent(PersonBaseType insuranceAgent) {
        this.insuranceAgent = insuranceAgent;
    }

    /** 
     * Get the 'InsurerSign' element value. ������� �����������/������������� �����������
     * 
     * @return value
     */
    public PersonBaseType getInsurerSign() {
        return insurerSign;
    }

    /** 
     * Set the 'InsurerSign' element value. ������� �����������/������������� �����������
     * 
     * @param insurerSign
     */
    public void setInsurerSign(PersonBaseType insurerSign) {
        this.insurerSign = insurerSign;
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
