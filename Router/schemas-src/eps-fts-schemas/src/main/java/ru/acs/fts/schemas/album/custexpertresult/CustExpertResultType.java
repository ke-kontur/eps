
package ru.acs.fts.schemas.album.custexpertresult;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * �������� �� ����������� ����������� ���������� ����������
 */
public class CustExpertResultType extends BaseDocType
{
    private String customsName;
    private String controlNumber;
    private String adminInfractionNumber;
    private String criminalCaseNumber;
    private String otherCases;
    private List<String> decisionList = new ArrayList<String>();
    private DocumentBaseType expert;
    private GTDIDType GTDID;
    private List<RecEconomicEffectType> recEconomicEffectList = new ArrayList<RecEconomicEffectType>();
    private List<ConventionalEconomicEffectType> conventionalEconomicEffectList = new ArrayList<ConventionalEconomicEffectType>();
    private CustomsPersonType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'CustomsName' element value. ���������� �����
     * 
     * @return value
     */
    public String getCustomsName() {
        return customsName;
    }

    /** 
     * Set the 'CustomsName' element value. ���������� �����
     * 
     * @param customsName
     */
    public void setCustomsName(String customsName) {
        this.customsName = customsName;
    }

    /** 
     * Get the 'ControlNumber' element value. ����� ����������� ��������
     * 
     * @return value
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /** 
     * Set the 'ControlNumber' element value. ����� ����������� ��������
     * 
     * @param controlNumber
     */
    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }

    /** 
     * Get the 'AdminInfractionNumber' element value. ����� ���� �� ���������������� ��������������
     * 
     * @return value
     */
    public String getAdminInfractionNumber() {
        return adminInfractionNumber;
    }

    /** 
     * Set the 'AdminInfractionNumber' element value. ����� ���� �� ���������������� ��������������
     * 
     * @param adminInfractionNumber
     */
    public void setAdminInfractionNumber(String adminInfractionNumber) {
        this.adminInfractionNumber = adminInfractionNumber;
    }

    /** 
     * Get the 'CriminalCaseNumber' element value. ����� ���������� ����
     * 
     * @return value
     */
    public String getCriminalCaseNumber() {
        return criminalCaseNumber;
    }

    /** 
     * Set the 'CriminalCaseNumber' element value. ����� ���������� ����
     * 
     * @param criminalCaseNumber
     */
    public void setCriminalCaseNumber(String criminalCaseNumber) {
        this.criminalCaseNumber = criminalCaseNumber;
    }

    /** 
     * Get the 'OtherCases' element value. ������ ������
     * 
     * @return value
     */
    public String getOtherCases() {
        return otherCases;
    }

    /** 
     * Set the 'OtherCases' element value. ������ ������
     * 
     * @param otherCases
     */
    public void setOtherCases(String otherCases) {
        this.otherCases = otherCases;
    }

    /** 
     * Get the list of 'Decision' element items. �������� �������
     * 
     * @return list
     */
    public List<String> getDecisionList() {
        return decisionList;
    }

    /** 
     * Set the list of 'Decision' element items. �������� �������
     * 
     * @param list
     */
    public void setDecisionList(List<String> list) {
        decisionList = list;
    }

    /** 
     * Get the 'Expert' element value. ����������
     * 
     * @return value
     */
    public DocumentBaseType getExpert() {
        return expert;
    }

    /** 
     * Set the 'Expert' element value. ����������
     * 
     * @param expert
     */
    public void setExpert(DocumentBaseType expert) {
        this.expert = expert;
    }

    /** 
     * Get the 'GTDID' element value. ��������������� �����  ��
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. ��������������� �����  ��
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the list of 'RecEconomicEffect' element items. ���������� ������������� ������
     * 
     * @return list
     */
    public List<RecEconomicEffectType> getRecEconomicEffectList() {
        return recEconomicEffectList;
    }

    /** 
     * Set the list of 'RecEconomicEffect' element items. ���������� ������������� ������
     * 
     * @param list
     */
    public void setRecEconomicEffectList(List<RecEconomicEffectType> list) {
        recEconomicEffectList = list;
    }

    /** 
     * Get the list of 'ConventionalEconomicEffect' element items. �������� ������������� ������
     * 
     * @return list
     */
    public List<ConventionalEconomicEffectType> getConventionalEconomicEffectList() {
        return conventionalEconomicEffectList;
    }

    /** 
     * Set the list of 'ConventionalEconomicEffect' element items. �������� ������������� ������
     * 
     * @param list
     */
    public void setConventionalEconomicEffectList(
            List<ConventionalEconomicEffectType> list) {
        conventionalEconomicEffectList = list;
    }

    /** 
     * Get the 'CustomsPerson' element value. ������� ������������ ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ������� ������������ ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
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
