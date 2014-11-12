
package ru.acs.fts.schemas.album.correctiondecision;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Решения по мерам по минимизации риска, принятые инспекторами структурных или координирующего подразделений таможни
 */
public class MeasureDecisionsType
{
    private String goodsNumeric;
    private LocalDate riskProfileRegDate;
    private String riskProfileNumber;
    private String riskProfileNumberVersion;
    private String terrActionCode;
    private String customCode;
    private LocalDate riskActionDate;
    private String riskActionTime;
    private String measureCode;
    private String decisionCustomCode;
    private String decisionSign;
    private String decisionAcceptCode;
    private String decisionDeclineCode;
    private String decisionDeclineReasonCode;
    private String mandatory;
    private String pointCode;
    private int choiceSelect = -1;
    private static final int PERSON_NAME_CHOICE = 0;
    private static final int LNP_CHOICE = 1;
    private String personName;
    private String LNP;
    private List<DecisionArticlesType> decisionArticleList = new ArrayList<DecisionArticlesType>();
    private List<DecisionDescriptionType> decisionDescriptionList = new ArrayList<DecisionDescriptionType>();

    /** 
     * Get the 'GoodsNumeric' element value. Номер товара по ДТ, по которому выявлен риск.
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Номер товара по ДТ, по которому выявлен риск.
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'RiskProfileRegDate' element value. Дата регистрации профиля риска  (ориентировки)
     * 
     * @return value
     */
    public LocalDate getRiskProfileRegDate() {
        return riskProfileRegDate;
    }

    /** 
     * Set the 'RiskProfileRegDate' element value. Дата регистрации профиля риска  (ориентировки)
     * 
     * @param riskProfileRegDate
     */
    public void setRiskProfileRegDate(LocalDate riskProfileRegDate) {
        this.riskProfileRegDate = riskProfileRegDate;
    }

    /** 
     * Get the 'RiskProfileNumber' element value. Порядковый номер профиля риска (ориентировки)
     * 
     * @return value
     */
    public String getRiskProfileNumber() {
        return riskProfileNumber;
    }

    /** 
     * Set the 'RiskProfileNumber' element value. Порядковый номер профиля риска (ориентировки)
     * 
     * @param riskProfileNumber
     */
    public void setRiskProfileNumber(String riskProfileNumber) {
        this.riskProfileNumber = riskProfileNumber;
    }

    /** 
     * Get the 'RiskProfileNumberVersion' element value. Порядковый номер версии профиля риска (ориентировки)
     * 
     * @return value
     */
    public String getRiskProfileNumberVersion() {
        return riskProfileNumberVersion;
    }

    /** 
     * Set the 'RiskProfileNumberVersion' element value. Порядковый номер версии профиля риска (ориентировки)
     * 
     * @param riskProfileNumberVersion
     */
    public void setRiskProfileNumberVersion(String riskProfileNumberVersion) {
        this.riskProfileNumberVersion = riskProfileNumberVersion;
    }

    /** 
     * Get the 'TerrActionCode' element value. Код вида документа
     * 
     * @return value
     */
    public String getTerrActionCode() {
        return terrActionCode;
    }

    /** 
     * Set the 'TerrActionCode' element value. Код вида документа
     * 
     * @param terrActionCode
     */
    public void setTerrActionCode(String terrActionCode) {
        this.terrActionCode = terrActionCode;
    }

    /** 
     * Get the 'CustomCode' element value. Код ТО, в котором зарегистрирован ПР 
     * 
     * @return value
     */
    public String getCustomCode() {
        return customCode;
    }

    /** 
     * Set the 'CustomCode' element value. Код ТО, в котором зарегистрирован ПР 
     * 
     * @param customCode
     */
    public void setCustomCode(String customCode) {
        this.customCode = customCode;
    }

    /** 
     * Get the 'RiskActionDate' element value. Дата принятия решения
     * 
     * @return value
     */
    public LocalDate getRiskActionDate() {
        return riskActionDate;
    }

    /** 
     * Set the 'RiskActionDate' element value. Дата принятия решения
     * 
     * @param riskActionDate
     */
    public void setRiskActionDate(LocalDate riskActionDate) {
        this.riskActionDate = riskActionDate;
    }

    /** 
     * Get the 'RiskActionTime' element value. Время принятия решения
     * 
     * @return value
     */
    public String getRiskActionTime() {
        return riskActionTime;
    }

    /** 
     * Set the 'RiskActionTime' element value. Время принятия решения
     * 
     * @param riskActionTime
     */
    public void setRiskActionTime(String riskActionTime) {
        this.riskActionTime = riskActionTime;
    }

    /** 
     * Get the 'MeasureCode' element value. Код меры на основании, которой было сформировано направление в функциональный отдел для принятия решения
     * 
     * @return value
     */
    public String getMeasureCode() {
        return measureCode;
    }

    /** 
     * Set the 'MeasureCode' element value. Код меры на основании, которой было сформировано направление в функциональный отдел для принятия решения
     * 
     * @param measureCode
     */
    public void setMeasureCode(String measureCode) {
        this.measureCode = measureCode;
    }

    /** 
     * Get the 'DecisionCustomCode' element value. Код ТО
     * 
     * @return value
     */
    public String getDecisionCustomCode() {
        return decisionCustomCode;
    }

    /** 
     * Set the 'DecisionCustomCode' element value. Код ТО
     * 
     * @param decisionCustomCode
     */
    public void setDecisionCustomCode(String decisionCustomCode) {
        this.decisionCustomCode = decisionCustomCode;
    }

    /** 
     * Get the 'DecisionSign' element value. Признак применения мер по минимизации рисков в соответствии с профилем риска
     * 
     * @return value
     */
    public String getDecisionSign() {
        return decisionSign;
    }

    /** 
     * Set the 'DecisionSign' element value. Признак применения мер по минимизации рисков в соответствии с профилем риска
     * 
     * @param decisionSign
     */
    public void setDecisionSign(String decisionSign) {
        this.decisionSign = decisionSign;
    }

    /** 
     * Get the 'DecisionAcceptCode' element value. Код результатов применения прямых мер по минимизации рисков (RSKRMERA.DBF)
     * 
     * @return value
     */
    public String getDecisionAcceptCode() {
        return decisionAcceptCode;
    }

    /** 
     * Set the 'DecisionAcceptCode' element value. Код результатов применения прямых мер по минимизации рисков (RSKRMERA.DBF)
     * 
     * @param decisionAcceptCode
     */
    public void setDecisionAcceptCode(String decisionAcceptCode) {
        this.decisionAcceptCode = decisionAcceptCode;
    }

    /** 
     * Get the 'DecisionDeclineCode' element value. Обоснование причины неприменения меры
     * 
     * @return value
     */
    public String getDecisionDeclineCode() {
        return decisionDeclineCode;
    }

    /** 
     * Set the 'DecisionDeclineCode' element value. Обоснование причины неприменения меры
     * 
     * @param decisionDeclineCode
     */
    public void setDecisionDeclineCode(String decisionDeclineCode) {
        this.decisionDeclineCode = decisionDeclineCode;
    }

    /** 
     * Get the 'DecisionDeclineReasonCode' element value. Код причины неприменения меры. Указывается для случая обоснования наличия объективных причин неприменения меры (поле DecisionDeclineCode='04')
     * 
     * @return value
     */
    public String getDecisionDeclineReasonCode() {
        return decisionDeclineReasonCode;
    }

    /** 
     * Set the 'DecisionDeclineReasonCode' element value. Код причины неприменения меры. Указывается для случая обоснования наличия объективных причин неприменения меры (поле DecisionDeclineCode='04')
     * 
     * @param decisionDeclineReasonCode
     */
    public void setDecisionDeclineReasonCode(String decisionDeclineReasonCode) {
        this.decisionDeclineReasonCode = decisionDeclineReasonCode;
    }

    /** 
     * Get the 'Mandatory' element value. Признак обязательности применения прямых мер по минимизации рисков
     * 
     * @return value
     */
    public String getMandatory() {
        return mandatory;
    }

    /** 
     * Set the 'Mandatory' element value. Признак обязательности применения прямых мер по минимизации рисков
     * 
     * @param mandatory
     */
    public void setMandatory(String mandatory) {
        this.mandatory = mandatory;
    }

    /** 
     * Get the 'PointCode' element value. Этап проведения проверки на соответствие профилям риска
     * 
     * @return value
     */
    public String getPointCode() {
        return pointCode;
    }

    /** 
     * Set the 'PointCode' element value. Этап проведения проверки на соответствие профилям риска
     * 
     * @param pointCode
     */
    public void setPointCode(String pointCode) {
        this.pointCode = pointCode;
    }

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if PersonName is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifPersonName() {
        return choiceSelect == PERSON_NAME_CHOICE;
    }

    /** 
     * Get the 'PersonName' element value. ФИО должностного лица таможенного органа
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ФИО должностного лица таможенного органа
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        setChoiceSelect(PERSON_NAME_CHOICE);
        this.personName = personName;
    }

    /** 
     * Check if LNP is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifLNP() {
        return choiceSelect == LNP_CHOICE;
    }

    /** 
     * Get the 'LNP' element value. ЛНП должностного лица таможенного органа
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ЛНП должностного лица таможенного органа
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        setChoiceSelect(LNP_CHOICE);
        this.LNP = LNP;
    }

    /** 
     * Get the list of 'DecisionArticles' element items. Дела об административных правонарушениях, уголовные дела
     * 
     * @return list
     */
    public List<DecisionArticlesType> getDecisionArticleList() {
        return decisionArticleList;
    }

    /** 
     * Set the list of 'DecisionArticles' element items. Дела об административных правонарушениях, уголовные дела
     * 
     * @param list
     */
    public void setDecisionArticleList(List<DecisionArticlesType> list) {
        decisionArticleList = list;
    }

    /** 
     * Get the list of 'DecisionDescription' element items. Сведения о нарушении
     * 
     * @return list
     */
    public List<DecisionDescriptionType> getDecisionDescriptionList() {
        return decisionDescriptionList;
    }

    /** 
     * Set the list of 'DecisionDescription' element items. Сведения о нарушении
     * 
     * @param list
     */
    public void setDecisionDescriptionList(List<DecisionDescriptionType> list) {
        decisionDescriptionList = list;
    }
}
