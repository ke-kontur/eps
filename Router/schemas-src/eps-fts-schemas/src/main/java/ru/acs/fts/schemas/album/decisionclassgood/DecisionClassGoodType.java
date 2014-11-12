
package ru.acs.fts.schemas.album.decisionclassgood;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Решение о классификации товара в соответствии с ТН ВЭД
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
     * Get the 'TNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getTNVEDCode() {
        return TNVEDCode;
    }

    /** 
     * Set the 'TNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @param TNVEDCode
     */
    public void setTNVEDCode(String TNVEDCode) {
        this.TNVEDCode = TNVEDCode;
    }

    /** 
     * Get the list of 'Mark' element items. Служебные отметки
     * 
     * @return list
     */
    public List<String> getMarkList() {
        return markList;
    }

    /** 
     * Set the list of 'Mark' element items. Служебные отметки
     * 
     * @param list
     */
    public void setMarkList(List<String> list) {
        markList = list;
    }

    /** 
     * Get the 'ClassDecisionChanges' element value. Сведение об отмене (изменении) решения о классификации
     * 
     * @return value
     */
    public String getClassDecisionChanges() {
        return classDecisionChanges;
    }

    /** 
     * Set the 'ClassDecisionChanges' element value. Сведение об отмене (изменении) решения о классификации
     * 
     * @param classDecisionChanges
     */
    public void setClassDecisionChanges(String classDecisionChanges) {
        this.classDecisionChanges = classDecisionChanges;
    }

    /** 
     * Get the list of 'DepartmentalControl' element items. Сведения по ведомственному контролю
     * 
     * @return list
     */
    public List<String> getDepartmentalControlList() {
        return departmentalControlList;
    }

    /** 
     * Set the list of 'DepartmentalControl' element items. Сведения по ведомственному контролю
     * 
     * @param list
     */
    public void setDepartmentalControlList(List<String> list) {
        departmentalControlList = list;
    }

    /** 
     * Get the 'InterpretationRules' element value. Обоснование принятия решения. Правила интерпретации
     * 
     * @return value
     */
    public String getInterpretationRules() {
        return interpretationRules;
    }

    /** 
     * Set the 'InterpretationRules' element value. Обоснование принятия решения. Правила интерпретации
     * 
     * @param interpretationRules
     */
    public void setInterpretationRules(String interpretationRules) {
        this.interpretationRules = interpretationRules;
    }

    /** 
     * Get the 'Customs' element value. Наименование таможенного органа
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Наименование таможенного органа
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Declarant' element value. Декларант
     * 
     * @return value
     */
    public DeclarantType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Декларант
     * 
     * @param declarant
     */
    public void setDeclarant(DeclarantType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'RegistrationNumber' element value. Регистрационный номер
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. Регистрационный номер
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(RegistrationNumberType registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'Goods' element value. Товар
     * 
     * @return value
     */
    public GoodsType getGoods() {
        return goods;
    }

    /** 
     * Set the 'Goods' element value. Товар
     * 
     * @param goods
     */
    public void setGoods(GoodsType goods) {
        this.goods = goods;
    }

    /** 
     * Get the 'PersonSignature' element value. Подпись должностного лица таможенного органа
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. Подпись должностного лица таможенного органа
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
    }

    /** 
     * Get the 'RegNumberDT' element value. Регистрационный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getRegNumberDT() {
        return regNumberDT;
    }

    /** 
     * Set the 'RegNumberDT' element value. Регистрационный номер ДТ
     * 
     * @param regNumberDT
     */
    public void setRegNumberDT(GTDIDType regNumberDT) {
        this.regNumberDT = regNumberDT;
    }

    /** 
     * Get the 'ExpertDecision' element value. Обоснование принятия решения. Заключение экспертной организации
     * 
     * @return value
     */
    public ExpertDecisionType getExpertDecision() {
        return expertDecision;
    }

    /** 
     * Set the 'ExpertDecision' element value. Обоснование принятия решения. Заключение экспертной организации
     * 
     * @param expertDecision
     */
    public void setExpertDecision(ExpertDecisionType expertDecision) {
        this.expertDecision = expertDecision;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
