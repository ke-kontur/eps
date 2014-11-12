
package ru.acs.fts.schemas.album.revealedrisks;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Принятые меры по выявленным рискам
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
     * Get the 'RiskActionDate' element value. Дата принятия мер по риску
     * 
     * @return value
     */
    public LocalDate getRiskActionDate() {
        return riskActionDate;
    }

    /** 
     * Set the 'RiskActionDate' element value. Дата принятия мер по риску
     * 
     * @param riskActionDate
     */
    public void setRiskActionDate(LocalDate riskActionDate) {
        this.riskActionDate = riskActionDate;
    }

    /** 
     * Get the 'RiskActionTime' element value. Время принятия мер по риску
     * 
     * @return value
     */
    public String getRiskActionTime() {
        return riskActionTime;
    }

    /** 
     * Set the 'RiskActionTime' element value. Время принятия мер по риску
     * 
     * @param riskActionTime
     */
    public void setRiskActionTime(String riskActionTime) {
        this.riskActionTime = riskActionTime;
    }

    /** 
     * Get the 'LNPID' element value. ЛНП должностного лица таможенного органа, применившего меру по минимизации риска
     * 
     * @return value
     */
    public String getLNPID() {
        return LNPID;
    }

    /** 
     * Set the 'LNPID' element value. ЛНП должностного лица таможенного органа, применившего меру по минимизации риска
     * 
     * @param LNPID
     */
    public void setLNPID(String LNPID) {
        this.LNPID = LNPID;
    }

    /** 
     * Get the 'CustomsPersonName' element value. ФИО должностного лица таможенного органа, применившего меру по минимизации риска
     * 
     * @return value
     */
    public String getCustomsPersonName() {
        return customsPersonName;
    }

    /** 
     * Set the 'CustomsPersonName' element value. ФИО должностного лица таможенного органа, применившего меру по минимизации риска
     * 
     * @param customsPersonName
     */
    public void setCustomsPersonName(String customsPersonName) {
        this.customsPersonName = customsPersonName;
    }

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа, применившего меру по минимизации риска
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа, применившего меру по минимизации риска
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'ActionCode' element value. Код мер по минимизации рисков (значение указывается в соответствии с классификатором "Прямых мер по минимизации рисков" rsk_mera.dbf )
     * 
     * @return value
     */
    public String getActionCode() {
        return actionCode;
    }

    /** 
     * Set the 'ActionCode' element value. Код мер по минимизации рисков (значение указывается в соответствии с классификатором "Прямых мер по минимизации рисков" rsk_mera.dbf )
     * 
     * @param actionCode
     */
    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    /** 
     * Get the 'MandatoryAction' element value. Признак обязательности применения мер по минимизации рисков: 0 - необязательное применение меры; 1 - обязательное применение меры.
     * 
     * @return value
     */
    public String getMandatoryAction() {
        return mandatoryAction;
    }

    /** 
     * Set the 'MandatoryAction' element value. Признак обязательности применения мер по минимизации рисков: 0 - необязательное применение меры; 1 - обязательное применение меры.
     * 
     * @param mandatoryAction
     */
    public void setMandatoryAction(String mandatoryAction) {
        this.mandatoryAction = mandatoryAction;
    }

    /** 
     * Get the 'MandatoryActionCount' element value. Порядковый номер меры по минимизации рисков (Резерв)
     * 
     * @return value
     */
    public String getMandatoryActionCount() {
        return mandatoryActionCount;
    }

    /** 
     * Set the 'MandatoryActionCount' element value. Порядковый номер меры по минимизации рисков (Резерв)
     * 
     * @param mandatoryActionCount
     */
    public void setMandatoryActionCount(String mandatoryActionCount) {
        this.mandatoryActionCount = mandatoryActionCount;
    }

    /** 
     * Get the 'SystemActionIndicator' element value. Признак применения мер по минимизации рисков (уровень системы): " " - поле не заполняется, если тип выявленного риска (поле DCLVRSK.GR010 =  "1" (самостоятельно выявленный); "0"  - мера не применяется согласно результатам случайной выборки; "1" - мера должна быть применена согласно профилю риска; "2" - мера не применялась из-за несоответствия этапа, на котором была проведена проверка на наличие рисков, и этапа, на котором мера по минимизации рисков должна применяться согласно условиям профиля риска; "3" - резерв; "4" - мера не применяется в связи с включением субъекта ВЭД в Перечень лиц, в отношении которых принято решение об определении степени выборочности применения мер по минимизации рисков; 5 - мера не применяется в связи с неприменением главной меры; 6 - мера не применялась по причине упрощенного контроля таможенной стоимости идентичных товаров
     * 
     * @return value
     */
    public String getSystemActionIndicator() {
        return systemActionIndicator;
    }

    /** 
     * Set the 'SystemActionIndicator' element value. Признак применения мер по минимизации рисков (уровень системы): " " - поле не заполняется, если тип выявленного риска (поле DCLVRSK.GR010 =  "1" (самостоятельно выявленный); "0"  - мера не применяется согласно результатам случайной выборки; "1" - мера должна быть применена согласно профилю риска; "2" - мера не применялась из-за несоответствия этапа, на котором была проведена проверка на наличие рисков, и этапа, на котором мера по минимизации рисков должна применяться согласно условиям профиля риска; "3" - резерв; "4" - мера не применяется в связи с включением субъекта ВЭД в Перечень лиц, в отношении которых принято решение об определении степени выборочности применения мер по минимизации рисков; 5 - мера не применяется в связи с неприменением главной меры; 6 - мера не применялась по причине упрощенного контроля таможенной стоимости идентичных товаров
     * 
     * @param systemActionIndicator
     */
    public void setSystemActionIndicator(String systemActionIndicator) {
        this.systemActionIndicator = systemActionIndicator;
    }

    /** 
     * Get the 'PersonActionIndicator' element value. Признак применения мер по минимизации рисков (уровень пользователя): "0" - мера не была применена "1" -  приняты меры в соответствии с профилем риска или по самостоятельному решению должностного лица; "2" - мера применялась не в соответствии с характеристиками, определенными в профиле риска, либо не в полном объеме в силу объективных причин.
     * 
     * @return value
     */
    public String getPersonActionIndicator() {
        return personActionIndicator;
    }

    /** 
     * Set the 'PersonActionIndicator' element value. Признак применения мер по минимизации рисков (уровень пользователя): "0" - мера не была применена "1" -  приняты меры в соответствии с профилем риска или по самостоятельному решению должностного лица; "2" - мера применялась не в соответствии с характеристиками, определенными в профиле риска, либо не в полном объеме в силу объективных причин.
     * 
     * @param personActionIndicator
     */
    public void setPersonActionIndicator(String personActionIndicator) {
        this.personActionIndicator = personActionIndicator;
    }

    /** 
     * Get the 'ActionFoundation' element value. Обоснование причин неприменения меры, либо применения не в соответствии с характеристиками, определенными в профиле риска, либо не в полном объеме: "00" - мера применялась (значение по умолчанию); "02" -  профиль риска не применяется согласно п. 36 Инструкции (резерв); "03" - мера по минимизации рисков не применялась по условиям профиля риска; "04" - профиль риска выявлен, но мера по минимизации рисков не применялась в силу объективных причин, либо применялась не в соответствии с характеристиками, определенными в профиле риска, либо не в полном объеме; "05" - мера не применялась согласно результатам случайной выборки.
     * 
     * @return value
     */
    public String getActionFoundation() {
        return actionFoundation;
    }

    /** 
     * Set the 'ActionFoundation' element value. Обоснование причин неприменения меры, либо применения не в соответствии с характеристиками, определенными в профиле риска, либо не в полном объеме: "00" - мера применялась (значение по умолчанию); "02" -  профиль риска не применяется согласно п. 36 Инструкции (резерв); "03" - мера по минимизации рисков не применялась по условиям профиля риска; "04" - профиль риска выявлен, но мера по минимизации рисков не применялась в силу объективных причин, либо применялась не в соответствии с характеристиками, определенными в профиле риска, либо не в полном объеме; "05" - мера не применялась согласно результатам случайной выборки.
     * 
     * @param actionFoundation
     */
    public void setActionFoundation(String actionFoundation) {
        this.actionFoundation = actionFoundation;
    }

    /** 
     * Get the 'NonActionCode' element value. Код причины неприменения меры, либо применения не в соответствии с характеристиками, определенными в профиле риска, либо не в полном объеме (указывается для случая обоснования наличия объективных причин неприменения меры (поле GR054='04')) (RSK_NPM.DBF)
     * 
     * @return value
     */
    public String getNonActionCode() {
        return nonActionCode;
    }

    /** 
     * Set the 'NonActionCode' element value. Код причины неприменения меры, либо применения не в соответствии с характеристиками, определенными в профиле риска, либо не в полном объеме (указывается для случая обоснования наличия объективных причин неприменения меры (поле GR054='04')) (RSK_NPM.DBF)
     * 
     * @param nonActionCode
     */
    public void setNonActionCode(String nonActionCode) {
        this.nonActionCode = nonActionCode;
    }

    /** 
     * Get the 'MainActionCode' element value. Код главной меры по минимизации рисков (значение указывается в соответствии с классификатором "Прямых мер по минимизации рисков" rsk_mera.dbf)
     * 
     * @return value
     */
    public String getMainActionCode() {
        return mainActionCode;
    }

    /** 
     * Set the 'MainActionCode' element value. Код главной меры по минимизации рисков (значение указывается в соответствии с классификатором "Прямых мер по минимизации рисков" rsk_mera.dbf)
     * 
     * @param mainActionCode
     */
    public void setMainActionCode(String mainActionCode) {
        this.mainActionCode = mainActionCode;
    }

    /** 
     * Get the list of 'InspectionCharacter' element items. Характеристики досмотра/осмотра
     * 
     * @return list
     */
    public List<InspectionCharacterType> getInspectionCharacterList() {
        return inspectionCharacterList;
    }

    /** 
     * Set the list of 'InspectionCharacter' element items. Характеристики досмотра/осмотра
     * 
     * @param list
     */
    public void setInspectionCharacterList(List<InspectionCharacterType> list) {
        inspectionCharacterList = list;
    }

    /** 
     * Get the 'NumberDefinitions' element value. Номер определения о возбуждении дела об АП (УД) по журналу учета в соответствии с приказом ФТС России от 24.04.2007 №524 
     * 
     * @return value
     */
    public NumberDefinitionsType getNumberDefinitions() {
        return numberDefinitions;
    }

    /** 
     * Set the 'NumberDefinitions' element value. Номер определения о возбуждении дела об АП (УД) по журналу учета в соответствии с приказом ФТС России от 24.04.2007 №524 
     * 
     * @param numberDefinitions
     */
    public void setNumberDefinitions(NumberDefinitionsType numberDefinitions) {
        this.numberDefinitions = numberDefinitions;
    }

    /** 
     * Get the list of 'AdministrativeInfraction' element items. Дела об административных правонарушениях, уголовные дела
     * 
     * @return list
     */
    public List<AdministrativeInfractionType> getAdministrativeInfractionList() {
        return administrativeInfractionList;
    }

    /** 
     * Set the list of 'AdministrativeInfraction' element items. Дела об административных правонарушениях, уголовные дела
     * 
     * @param list
     */
    public void setAdministrativeInfractionList(
            List<AdministrativeInfractionType> list) {
        administrativeInfractionList = list;
    }

    /** 
     * Get the list of 'AddNonFormInfoAction' element items. Дополнительная неформализованная информация - уровень меры
     * 
     * @return list
     */
    public List<AddNonFormInfoActionType> getAddNonFormInfoActionList() {
        return addNonFormInfoActionList;
    }

    /** 
     * Set the list of 'AddNonFormInfoAction' element items. Дополнительная неформализованная информация - уровень меры
     * 
     * @param list
     */
    public void setAddNonFormInfoActionList(List<AddNonFormInfoActionType> list) {
        addNonFormInfoActionList = list;
    }

    /** 
     * Get the list of 'ActionResult' element items. Результаты применения мер по минимизации рисков
     * 
     * @return list
     */
    public List<ActionResultType> getActionResultList() {
        return actionResultList;
    }

    /** 
     * Set the list of 'ActionResult' element items. Результаты применения мер по минимизации рисков
     * 
     * @param list
     */
    public void setActionResultList(List<ActionResultType> list) {
        actionResultList = list;
    }
}
