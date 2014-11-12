
package ru.acs.fts.schemas.album.revealedrisks;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * �������� ���� �� ���������� ������
 */
public class RiskActionType
{
    private LocalDate riskActionDate;
    private String riskActionTime;
    private String LNPID;
    private String customsPersonName;
    private String customsCode;
    private String actionCode;
    private String mandatoryAction;
    private String mandatoryActionCount;
    private String systemActionIndicator;
    private String personActionIndicator;
    private String actionFoundation;
    private String nonActionCode;
    private String mainActionCode;
    private List<InspectionCharacterType> inspectionCharacterList = new ArrayList<InspectionCharacterType>();
    private NumberDefinitionsType numberDefinitions;
    private List<AdministrativeInfractionType> administrativeInfractionList = new ArrayList<AdministrativeInfractionType>();
    private List<AddNonFormInfoActionType> addNonFormInfoActionList = new ArrayList<AddNonFormInfoActionType>();
    private List<ActionResultType> actionResultList = new ArrayList<ActionResultType>();

    /** 
     * Get the 'RiskActionDate' element value. ���� �������� ��� �� �����
     * 
     * @return value
     */
    public LocalDate getRiskActionDate() {
        return riskActionDate;
    }

    /** 
     * Set the 'RiskActionDate' element value. ���� �������� ��� �� �����
     * 
     * @param riskActionDate
     */
    public void setRiskActionDate(LocalDate riskActionDate) {
        this.riskActionDate = riskActionDate;
    }

    /** 
     * Get the 'RiskActionTime' element value. ����� �������� ��� �� �����
     * 
     * @return value
     */
    public String getRiskActionTime() {
        return riskActionTime;
    }

    /** 
     * Set the 'RiskActionTime' element value. ����� �������� ��� �� �����
     * 
     * @param riskActionTime
     */
    public void setRiskActionTime(String riskActionTime) {
        this.riskActionTime = riskActionTime;
    }

    /** 
     * Get the 'LNPID' element value. ��� ������������ ���� ����������� ������, ������������ ���� �� ����������� �����
     * 
     * @return value
     */
    public String getLNPID() {
        return LNPID;
    }

    /** 
     * Set the 'LNPID' element value. ��� ������������ ���� ����������� ������, ������������ ���� �� ����������� �����
     * 
     * @param LNPID
     */
    public void setLNPID(String LNPID) {
        this.LNPID = LNPID;
    }

    /** 
     * Get the 'CustomsPersonName' element value. ��� ������������ ���� ����������� ������, ������������ ���� �� ����������� �����
     * 
     * @return value
     */
    public String getCustomsPersonName() {
        return customsPersonName;
    }

    /** 
     * Set the 'CustomsPersonName' element value. ��� ������������ ���� ����������� ������, ������������ ���� �� ����������� �����
     * 
     * @param customsPersonName
     */
    public void setCustomsPersonName(String customsPersonName) {
        this.customsPersonName = customsPersonName;
    }

    /** 
     * Get the 'CustomsCode' element value. ��� ����������� ������, ������������ ���� �� ����������� �����
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ��� ����������� ������, ������������ ���� �� ����������� �����
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'ActionCode' element value. ��� ��� �� ����������� ������ (�������� ����������� � ������������ � ��������������� "������ ��� �� ����������� ������" rsk_mera.dbf )
     * 
     * @return value
     */
    public String getActionCode() {
        return actionCode;
    }

    /** 
     * Set the 'ActionCode' element value. ��� ��� �� ����������� ������ (�������� ����������� � ������������ � ��������������� "������ ��� �� ����������� ������" rsk_mera.dbf )
     * 
     * @param actionCode
     */
    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    /** 
     * Get the 'MandatoryAction' element value. ������� �������������� ���������� ��� �� ����������� ������: 0 - �������������� ���������� ����; 1 - ������������ ���������� ����.
     * 
     * @return value
     */
    public String getMandatoryAction() {
        return mandatoryAction;
    }

    /** 
     * Set the 'MandatoryAction' element value. ������� �������������� ���������� ��� �� ����������� ������: 0 - �������������� ���������� ����; 1 - ������������ ���������� ����.
     * 
     * @param mandatoryAction
     */
    public void setMandatoryAction(String mandatoryAction) {
        this.mandatoryAction = mandatoryAction;
    }

    /** 
     * Get the 'MandatoryActionCount' element value. ���������� ����� ���� �� ����������� ������ (������)
     * 
     * @return value
     */
    public String getMandatoryActionCount() {
        return mandatoryActionCount;
    }

    /** 
     * Set the 'MandatoryActionCount' element value. ���������� ����� ���� �� ����������� ������ (������)
     * 
     * @param mandatoryActionCount
     */
    public void setMandatoryActionCount(String mandatoryActionCount) {
        this.mandatoryActionCount = mandatoryActionCount;
    }

    /** 
     * Get the 'SystemActionIndicator' element value. ������� ���������� ��� �� ����������� ������ (������� �������): " " - ���� �� �����������, ���� ��� ����������� ����� (���� DCLVRSK.GR010 =  "1" (�������������� ����������); "0"  - ���� �� ����������� �������� ����������� ��������� �������; "1" - ���� ������ ���� ��������� �������� ������� �����; "2" - ���� �� ����������� ��-�� �������������� �����, �� ������� ���� ��������� �������� �� ������� ������, � �����, �� ������� ���� �� ����������� ������ ������ ����������� �������� �������� ������� �����; "3" - ������; "4" - ���� �� ����������� � ����� � ���������� �������� ��� � �������� ���, � ��������� ������� ������� ������� �� ����������� ������� ������������ ���������� ��� �� ����������� ������; 5 - ���� �� ����������� � ����� � ������������� ������� ����; 6 - ���� �� ����������� �� ������� ����������� �������� ���������� ��������� ���������� �������
     * 
     * @return value
     */
    public String getSystemActionIndicator() {
        return systemActionIndicator;
    }

    /** 
     * Set the 'SystemActionIndicator' element value. ������� ���������� ��� �� ����������� ������ (������� �������): " " - ���� �� �����������, ���� ��� ����������� ����� (���� DCLVRSK.GR010 =  "1" (�������������� ����������); "0"  - ���� �� ����������� �������� ����������� ��������� �������; "1" - ���� ������ ���� ��������� �������� ������� �����; "2" - ���� �� ����������� ��-�� �������������� �����, �� ������� ���� ��������� �������� �� ������� ������, � �����, �� ������� ���� �� ����������� ������ ������ ����������� �������� �������� ������� �����; "3" - ������; "4" - ���� �� ����������� � ����� � ���������� �������� ��� � �������� ���, � ��������� ������� ������� ������� �� ����������� ������� ������������ ���������� ��� �� ����������� ������; 5 - ���� �� ����������� � ����� � ������������� ������� ����; 6 - ���� �� ����������� �� ������� ����������� �������� ���������� ��������� ���������� �������
     * 
     * @param systemActionIndicator
     */
    public void setSystemActionIndicator(String systemActionIndicator) {
        this.systemActionIndicator = systemActionIndicator;
    }

    /** 
     * Get the 'PersonActionIndicator' element value. ������� ���������� ��� �� ����������� ������ (������� ������������): "0" - ���� �� ���� ��������� "1" -  ������� ���� � ������������ � �������� ����� ��� �� ���������������� ������� ������������ ����; "2" - ���� ����������� �� � ������������ � ����������������, ������������� � ������� �����, ���� �� � ������ ������ � ���� ����������� ������.
     * 
     * @return value
     */
    public String getPersonActionIndicator() {
        return personActionIndicator;
    }

    /** 
     * Set the 'PersonActionIndicator' element value. ������� ���������� ��� �� ����������� ������ (������� ������������): "0" - ���� �� ���� ��������� "1" -  ������� ���� � ������������ � �������� ����� ��� �� ���������������� ������� ������������ ����; "2" - ���� ����������� �� � ������������ � ����������������, ������������� � ������� �����, ���� �� � ������ ������ � ���� ����������� ������.
     * 
     * @param personActionIndicator
     */
    public void setPersonActionIndicator(String personActionIndicator) {
        this.personActionIndicator = personActionIndicator;
    }

    /** 
     * Get the 'ActionFoundation' element value. ����������� ������ ������������ ����, ���� ���������� �� � ������������ � ����������������, ������������� � ������� �����, ���� �� � ������ ������: "00" - ���� ����������� (�������� �� ���������); "02" -  ������� ����� �� ����������� �������� �. 36 ���������� (������); "03" - ���� �� ����������� ������ �� ����������� �� �������� ������� �����; "04" - ������� ����� �������, �� ���� �� ����������� ������ �� ����������� � ���� ����������� ������, ���� ����������� �� � ������������ � ����������������, ������������� � ������� �����, ���� �� � ������ ������; "05" - ���� �� ����������� �������� ����������� ��������� �������.
     * 
     * @return value
     */
    public String getActionFoundation() {
        return actionFoundation;
    }

    /** 
     * Set the 'ActionFoundation' element value. ����������� ������ ������������ ����, ���� ���������� �� � ������������ � ����������������, ������������� � ������� �����, ���� �� � ������ ������: "00" - ���� ����������� (�������� �� ���������); "02" -  ������� ����� �� ����������� �������� �. 36 ���������� (������); "03" - ���� �� ����������� ������ �� ����������� �� �������� ������� �����; "04" - ������� ����� �������, �� ���� �� ����������� ������ �� ����������� � ���� ����������� ������, ���� ����������� �� � ������������ � ����������������, ������������� � ������� �����, ���� �� � ������ ������; "05" - ���� �� ����������� �������� ����������� ��������� �������.
     * 
     * @param actionFoundation
     */
    public void setActionFoundation(String actionFoundation) {
        this.actionFoundation = actionFoundation;
    }

    /** 
     * Get the 'NonActionCode' element value. ��� ������� ������������ ����, ���� ���������� �� � ������������ � ����������������, ������������� � ������� �����, ���� �� � ������ ������ (����������� ��� ������ ����������� ������� ����������� ������ ������������ ���� (���� GR054='04')) (RSK_NPM.DBF)
     * 
     * @return value
     */
    public String getNonActionCode() {
        return nonActionCode;
    }

    /** 
     * Set the 'NonActionCode' element value. ��� ������� ������������ ����, ���� ���������� �� � ������������ � ����������������, ������������� � ������� �����, ���� �� � ������ ������ (����������� ��� ������ ����������� ������� ����������� ������ ������������ ���� (���� GR054='04')) (RSK_NPM.DBF)
     * 
     * @param nonActionCode
     */
    public void setNonActionCode(String nonActionCode) {
        this.nonActionCode = nonActionCode;
    }

    /** 
     * Get the 'MainActionCode' element value. ��� ������� ���� �� ����������� ������ (�������� ����������� � ������������ � ��������������� "������ ��� �� ����������� ������" rsk_mera.dbf)
     * 
     * @return value
     */
    public String getMainActionCode() {
        return mainActionCode;
    }

    /** 
     * Set the 'MainActionCode' element value. ��� ������� ���� �� ����������� ������ (�������� ����������� � ������������ � ��������������� "������ ��� �� ����������� ������" rsk_mera.dbf)
     * 
     * @param mainActionCode
     */
    public void setMainActionCode(String mainActionCode) {
        this.mainActionCode = mainActionCode;
    }

    /** 
     * Get the list of 'InspectionCharacter' element items. �������������� ��������/�������
     * 
     * @return list
     */
    public List<InspectionCharacterType> getInspectionCharacterList() {
        return inspectionCharacterList;
    }

    /** 
     * Set the list of 'InspectionCharacter' element items. �������������� ��������/�������
     * 
     * @param list
     */
    public void setInspectionCharacterList(List<InspectionCharacterType> list) {
        inspectionCharacterList = list;
    }

    /** 
     * Get the 'NumberDefinitions' element value. ����� ����������� � ����������� ���� �� �� (��) �� ������� ����� � ������������ � �������� ��� ������ �� 24.04.2007 �524 
     * 
     * @return value
     */
    public NumberDefinitionsType getNumberDefinitions() {
        return numberDefinitions;
    }

    /** 
     * Set the 'NumberDefinitions' element value. ����� ����������� � ����������� ���� �� �� (��) �� ������� ����� � ������������ � �������� ��� ������ �� 24.04.2007 �524 
     * 
     * @param numberDefinitions
     */
    public void setNumberDefinitions(NumberDefinitionsType numberDefinitions) {
        this.numberDefinitions = numberDefinitions;
    }

    /** 
     * Get the list of 'AdministrativeInfraction' element items. ���� �� ���������������� ���������������, ��������� ����
     * 
     * @return list
     */
    public List<AdministrativeInfractionType> getAdministrativeInfractionList() {
        return administrativeInfractionList;
    }

    /** 
     * Set the list of 'AdministrativeInfraction' element items. ���� �� ���������������� ���������������, ��������� ����
     * 
     * @param list
     */
    public void setAdministrativeInfractionList(
            List<AdministrativeInfractionType> list) {
        administrativeInfractionList = list;
    }

    /** 
     * Get the list of 'AddNonFormInfoAction' element items. �������������� ����������������� ���������� - ������� ����
     * 
     * @return list
     */
    public List<AddNonFormInfoActionType> getAddNonFormInfoActionList() {
        return addNonFormInfoActionList;
    }

    /** 
     * Set the list of 'AddNonFormInfoAction' element items. �������������� ����������������� ���������� - ������� ����
     * 
     * @param list
     */
    public void setAddNonFormInfoActionList(List<AddNonFormInfoActionType> list) {
        addNonFormInfoActionList = list;
    }

    /** 
     * Get the list of 'ActionResult' element items. ���������� ���������� ��� �� ����������� ������
     * 
     * @return list
     */
    public List<ActionResultType> getActionResultList() {
        return actionResultList;
    }

    /** 
     * Set the list of 'ActionResult' element items. ���������� ���������� ��� �� ����������� ������
     * 
     * @param list
     */
    public void setActionResultList(List<ActionResultType> list) {
        actionResultList = list;
    }
}
