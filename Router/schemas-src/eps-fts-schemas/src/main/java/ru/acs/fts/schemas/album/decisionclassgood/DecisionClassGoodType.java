
package ru.acs.fts.schemas.album.decisionclassgood;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ������� � ������������� ������ � ������������ � �� ���
 */
public class DecisionClassGoodType extends BaseDocType
{
    private String TNVEDCode;
    private List<String> markList = new ArrayList<String>();
    private String classDecisionChanges;
    private List<String> departmentalControlList = new ArrayList<String>();
    private String interpretationRules;
    private CustomsType customs;
    private DeclarantType declarant;
    private RegistrationNumberType registrationNumber;
    private GoodsType goods;
    private PersonSignatureType personSignature;
    private GTDIDType regNumberDT;
    private ExpertDecisionType expertDecision;
    private String documentModeID;

    /** 
     * Get the 'TNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @return value
     */
    public String getTNVEDCode() {
        return TNVEDCode;
    }

    /** 
     * Set the 'TNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @param TNVEDCode
     */
    public void setTNVEDCode(String TNVEDCode) {
        this.TNVEDCode = TNVEDCode;
    }

    /** 
     * Get the list of 'Mark' element items. ��������� �������
     * 
     * @return list
     */
    public List<String> getMarkList() {
        return markList;
    }

    /** 
     * Set the list of 'Mark' element items. ��������� �������
     * 
     * @param list
     */
    public void setMarkList(List<String> list) {
        markList = list;
    }

    /** 
     * Get the 'ClassDecisionChanges' element value. �������� �� ������ (���������) ������� � �������������
     * 
     * @return value
     */
    public String getClassDecisionChanges() {
        return classDecisionChanges;
    }

    /** 
     * Set the 'ClassDecisionChanges' element value. �������� �� ������ (���������) ������� � �������������
     * 
     * @param classDecisionChanges
     */
    public void setClassDecisionChanges(String classDecisionChanges) {
        this.classDecisionChanges = classDecisionChanges;
    }

    /** 
     * Get the list of 'DepartmentalControl' element items. �������� �� �������������� ��������
     * 
     * @return list
     */
    public List<String> getDepartmentalControlList() {
        return departmentalControlList;
    }

    /** 
     * Set the list of 'DepartmentalControl' element items. �������� �� �������������� ��������
     * 
     * @param list
     */
    public void setDepartmentalControlList(List<String> list) {
        departmentalControlList = list;
    }

    /** 
     * Get the 'InterpretationRules' element value. ����������� �������� �������. ������� �������������
     * 
     * @return value
     */
    public String getInterpretationRules() {
        return interpretationRules;
    }

    /** 
     * Set the 'InterpretationRules' element value. ����������� �������� �������. ������� �������������
     * 
     * @param interpretationRules
     */
    public void setInterpretationRules(String interpretationRules) {
        this.interpretationRules = interpretationRules;
    }

    /** 
     * Get the 'Customs' element value. ������������ ����������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ������������ ����������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Declarant' element value. ���������
     * 
     * @return value
     */
    public DeclarantType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. ���������
     * 
     * @param declarant
     */
    public void setDeclarant(DeclarantType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'RegistrationNumber' element value. ��������������� �����
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. ��������������� �����
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(RegistrationNumberType registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'Goods' element value. �����
     * 
     * @return value
     */
    public GoodsType getGoods() {
        return goods;
    }

    /** 
     * Set the 'Goods' element value. �����
     * 
     * @param goods
     */
    public void setGoods(GoodsType goods) {
        this.goods = goods;
    }

    /** 
     * Get the 'PersonSignature' element value. ������� ������������ ���� ����������� ������
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. ������� ������������ ���� ����������� ������
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
    }

    /** 
     * Get the 'RegNumberDT' element value. ��������������� ����� ��
     * 
     * @return value
     */
    public GTDIDType getRegNumberDT() {
        return regNumberDT;
    }

    /** 
     * Set the 'RegNumberDT' element value. ��������������� ����� ��
     * 
     * @param regNumberDT
     */
    public void setRegNumberDT(GTDIDType regNumberDT) {
        this.regNumberDT = regNumberDT;
    }

    /** 
     * Get the 'ExpertDecision' element value. ����������� �������� �������. ���������� ���������� �����������
     * 
     * @return value
     */
    public ExpertDecisionType getExpertDecision() {
        return expertDecision;
    }

    /** 
     * Set the 'ExpertDecision' element value. ����������� �������� �������. ���������� ���������� �����������
     * 
     * @param expertDecision
     */
    public void setExpertDecision(ExpertDecisionType expertDecision) {
        this.expertDecision = expertDecision;
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
