
package ru.acs.fts.schemas.album.assignmentdecisionmaking;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Направления для принятие решений
 */
public class AssignmentDecisionMakingType extends BaseDocType
{
    private LocalDate date;
    private String time;
    private List<String> markList = new ArrayList<String>();
    private List<String> otherMarkList = new ArrayList<String>();
    private String measureCode;
    private CustomsPersonType customsPerson;
    private List<RiskType> riskTNVEDList = new ArrayList<RiskType>();
    private List<RiskType> riskCountryList = new ArrayList<RiskType>();
    private List<RiskType> riskCustomsContrilList = new ArrayList<RiskType>();
    private List<RiskType> riskDutyList = new ArrayList<RiskType>();
    private List<RiskType> riskIntellectualPropertyList = new ArrayList<RiskType>();
    private List<RiskType> riskCustomsCostList = new ArrayList<RiskType>();
    private List<RiskType> riskCurrencyList = new ArrayList<RiskType>();
    private CustomsPersonType customsChief;
    private GTDIDType GTDID;
    private List<RiskType> riskRestrictionExpControlList = new ArrayList<RiskType>();
    private List<RiskType> riskControlFissileRadioactiveMaterialList = new ArrayList<RiskType>();
    private String documentModeID;

    /** 
     * Get the 'Date' element value. Дата 
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата 
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Time' element value. Время
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' element value. Время
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** 
     * Get the list of 'Mark' element items. Отметки уполномоченных должностных лиц о принятии решения (решений)
     * 
     * @return list
     */
    public List<String> getMarkList() {
        return markList;
    }

    /** 
     * Set the list of 'Mark' element items. Отметки уполномоченных должностных лиц о принятии решения (решений)
     * 
     * @param list
     */
    public void setMarkList(List<String> list) {
        markList = list;
    }

    /** 
     * Get the list of 'OtherMark' element items. Иные служебные отметки
     * 
     * @return list
     */
    public List<String> getOtherMarkList() {
        return otherMarkList;
    }

    /** 
     * Set the list of 'OtherMark' element items. Иные служебные отметки
     * 
     * @param list
     */
    public void setOtherMarkList(List<String> list) {
        otherMarkList = list;
    }

    /** 
     * Get the 'MeasureCode' element value. Код меры
     * 
     * @return value
     */
    public String getMeasureCode() {
        return measureCode;
    }

    /** 
     * Set the 'MeasureCode' element value. Код меры
     * 
     * @param measureCode
     */
    public void setMeasureCode(String measureCode) {
        this.measureCode = measureCode;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the list of 'RiskTNVED' element items. Номер профиля риска по классификации товаров с соответствии с ТН ВЭД России
     * 
     * @return list
     */
    public List<RiskType> getRiskTNVEDList() {
        return riskTNVEDList;
    }

    /** 
     * Set the list of 'RiskTNVED' element items. Номер профиля риска по классификации товаров с соответствии с ТН ВЭД России
     * 
     * @param list
     */
    public void setRiskTNVEDList(List<RiskType> list) {
        riskTNVEDList = list;
    }

    /** 
     * Get the list of 'RiskCountry' element items. Номер профиля риска по стране происхождения
     * 
     * @return list
     */
    public List<RiskType> getRiskCountryList() {
        return riskCountryList;
    }

    /** 
     * Set the list of 'RiskCountry' element items. Номер профиля риска по стране происхождения
     * 
     * @param list
     */
    public void setRiskCountryList(List<RiskType> list) {
        riskCountryList = list;
    }

    /** 
     * Get the list of 'RiskCustomsContril' element items. Номер профиля риска по организации таможенного контроля
     * 
     * @return list
     */
    public List<RiskType> getRiskCustomsContrilList() {
        return riskCustomsContrilList;
    }

    /** 
     * Set the list of 'RiskCustomsContril' element items. Номер профиля риска по организации таможенного контроля
     * 
     * @param list
     */
    public void setRiskCustomsContrilList(List<RiskType> list) {
        riskCustomsContrilList = list;
    }

    /** 
     * Get the list of 'RiskDuty' element items. Номер профиля риска по таможенным пошлинам, налогам, а также обеспечению уплаты таможенных платежей
     * 
     * @return list
     */
    public List<RiskType> getRiskDutyList() {
        return riskDutyList;
    }

    /** 
     * Set the list of 'RiskDuty' element items. Номер профиля риска по таможенным пошлинам, налогам, а также обеспечению уплаты таможенных платежей
     * 
     * @param list
     */
    public void setRiskDutyList(List<RiskType> list) {
        riskDutyList = list;
    }

    /** 
     * Get the list of 'RiskIntellectualProperty' element items. Номер профиля риска по запретам, ограничениям и защите интеллектуальной собственности
     * 
     * @return list
     */
    public List<RiskType> getRiskIntellectualPropertyList() {
        return riskIntellectualPropertyList;
    }

    /** 
     * Set the list of 'RiskIntellectualProperty' element items. Номер профиля риска по запретам, ограничениям и защите интеллектуальной собственности
     * 
     * @param list
     */
    public void setRiskIntellectualPropertyList(List<RiskType> list) {
        riskIntellectualPropertyList = list;
    }

    /** 
     * Get the list of 'RiskCustomsCost' element items. Номер профиля риска по таможенной стоимости
     * 
     * @return list
     */
    public List<RiskType> getRiskCustomsCostList() {
        return riskCustomsCostList;
    }

    /** 
     * Set the list of 'RiskCustomsCost' element items. Номер профиля риска по таможенной стоимости
     * 
     * @param list
     */
    public void setRiskCustomsCostList(List<RiskType> list) {
        riskCustomsCostList = list;
    }

    /** 
     * Get the list of 'RiskCurrency' element items. Номер профиля риска по валюте контроля
     * 
     * @return list
     */
    public List<RiskType> getRiskCurrencyList() {
        return riskCurrencyList;
    }

    /** 
     * Set the list of 'RiskCurrency' element items. Номер профиля риска по валюте контроля
     * 
     * @param list
     */
    public void setRiskCurrencyList(List<RiskType> list) {
        riskCurrencyList = list;
    }

    /** 
     * Get the 'CustomsChief' element value. Начальник таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsChief() {
        return customsChief;
    }

    /** 
     * Set the 'CustomsChief' element value. Начальник таможенного органа
     * 
     * @param customsChief
     */
    public void setCustomsChief(CustomsPersonType customsChief) {
        this.customsChief = customsChief;
    }

    /** 
     * Get the 'GTDID' element value. Регистрационный номер  ДТ.
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Регистрационный номер  ДТ.
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the list of 'RiskRestrictionExpControl' element items. Номер риска по торговым ограничениям и экспортному контролю
     * 
     * @return list
     */
    public List<RiskType> getRiskRestrictionExpControlList() {
        return riskRestrictionExpControlList;
    }

    /** 
     * Set the list of 'RiskRestrictionExpControl' element items. Номер риска по торговым ограничениям и экспортному контролю
     * 
     * @param list
     */
    public void setRiskRestrictionExpControlList(List<RiskType> list) {
        riskRestrictionExpControlList = list;
    }

    /** 
     * Get the list of 'RiskControlFissileRadioactiveMaterial' element items. Номер риска по контролю делящихся и радиоактивных материалов
     * 
     * @return list
     */
    public List<RiskType> getRiskControlFissileRadioactiveMaterialList() {
        return riskControlFissileRadioactiveMaterialList;
    }

    /** 
     * Set the list of 'RiskControlFissileRadioactiveMaterial' element items. Номер риска по контролю делящихся и радиоактивных материалов
     * 
     * @param list
     */
    public void setRiskControlFissileRadioactiveMaterialList(List<RiskType> list) {
        riskControlFissileRadioactiveMaterialList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
