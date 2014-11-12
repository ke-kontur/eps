
package ru.acs.fts.schemas.album.revealedrisks;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * ДТ - выявленные риски
 */
public class RevealledRisksType
{
    private String goodsNumeric;
    private String riskProfileType;
    private String terrActionCode;
    private LocalDate riskProfileRegDate;
    private String riskProfileNumber;
    private String riskProfileNumberVersion;
    private String criteriionCode;
    private String pointCode;
    private LocalDate pointDate;
    private String pointTime;
    private String customsActionCode;
    private String softKind;
    private String softVersion;
    private LocalDate firstPointDate;
    private List<RiskActionType> riskActionList = new ArrayList<RiskActionType>();
    private NumberOrientationType numberOrientation;
    private List<AddNonFormInfoRiskProfileType> addNonFormInfoRiskProfileList = new ArrayList<AddNonFormInfoRiskProfileType>();

    /** 
     * Get the 'GoodsNumeric' element value. Номер товара по ДТ, по которому выявлен риск. 0 - если выявленный риск распространяется на все товары
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Номер товара по ДТ, по которому выявлен риск. 0 - если выявленный риск распространяется на все товары
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'RiskProfileType' element value. Тип выявленного профиля риска: 0 - автоматически выявленный риск, проставляется программным средством в автоматическом режиме; 1 - самостоятельно выявленный риск, проставляется программным средством в автоматическом режиме при внесении должностным лицом таможенного поста новой записи (в том числе, при применении "рамочных" ПР  и ПР по информации правоохранительных подразделений); 2 – риск, выявленный в автоматизированном режиме, требует принятия окончательного решения должностным лицом таможенного поста (значение является промежуточным, наличие значения "2" в отчете блокирует переход к следующему этапу проверки на риски либо выпуск ДТ); 3 – риск, выявленный в автоматизированном режиме, по которому должностным лицом таможенного поста на основании проверки неформализованных индикаторов риска принято решение - "Риск выявлен"; 4 - риск, выявленный в автоматизированном режиме, по которому должностным лицом таможенного поста на основании проверки неформализованных индикаторов риска принято решение - "Риск не выявлен"; 5 - резерв; 6 - профиль риска не применяется по причине упрощенного контроля таможенной стоимости идентичных товаров
     * 
     * @return value
     */
    public String getRiskProfileType() {
        return riskProfileType;
    }

    /** 
     * Set the 'RiskProfileType' element value. Тип выявленного профиля риска: 0 - автоматически выявленный риск, проставляется программным средством в автоматическом режиме; 1 - самостоятельно выявленный риск, проставляется программным средством в автоматическом режиме при внесении должностным лицом таможенного поста новой записи (в том числе, при применении "рамочных" ПР  и ПР по информации правоохранительных подразделений); 2 – риск, выявленный в автоматизированном режиме, требует принятия окончательного решения должностным лицом таможенного поста (значение является промежуточным, наличие значения "2" в отчете блокирует переход к следующему этапу проверки на риски либо выпуск ДТ); 3 – риск, выявленный в автоматизированном режиме, по которому должностным лицом таможенного поста на основании проверки неформализованных индикаторов риска принято решение - "Риск выявлен"; 4 - риск, выявленный в автоматизированном режиме, по которому должностным лицом таможенного поста на основании проверки неформализованных индикаторов риска принято решение - "Риск не выявлен"; 5 - резерв; 6 - профиль риска не применяется по причине упрощенного контроля таможенной стоимости идентичных товаров
     * 
     * @param riskProfileType
     */
    public void setRiskProfileType(String riskProfileType) {
        this.riskProfileType = riskProfileType;
    }

    /** 
     * Get the 'TerrActionCode' element value. Код вида профиля риска. Возможные значения: 11 - общероссийский профиль риска, 12 - региональный профиль риска, 13 - зональный профиль риска, 20 - срочный профиль риска, 32 - профиль риска на основе моделей, 55 - профиль риска, обязательный к применению, 77 - профиль риска для определения степени выборочности, 88 - зависимый профиль риска
     * 
     * @return value
     */
    public String getTerrActionCode() {
        return terrActionCode;
    }

    /** 
     * Set the 'TerrActionCode' element value. Код вида профиля риска. Возможные значения: 11 - общероссийский профиль риска, 12 - региональный профиль риска, 13 - зональный профиль риска, 20 - срочный профиль риска, 32 - профиль риска на основе моделей, 55 - профиль риска, обязательный к применению, 77 - профиль риска для определения степени выборочности, 88 - зависимый профиль риска
     * 
     * @param terrActionCode
     */
    public void setTerrActionCode(String terrActionCode) {
        this.terrActionCode = terrActionCode;
    }

    /** 
     * Get the 'RiskProfileRegDate' element value. Дата регистрации профиля риска
     * 
     * @return value
     */
    public LocalDate getRiskProfileRegDate() {
        return riskProfileRegDate;
    }

    /** 
     * Set the 'RiskProfileRegDate' element value. Дата регистрации профиля риска
     * 
     * @param riskProfileRegDate
     */
    public void setRiskProfileRegDate(LocalDate riskProfileRegDate) {
        this.riskProfileRegDate = riskProfileRegDate;
    }

    /** 
     * Get the 'RiskProfileNumber' element value. Порядковый номер профиля риска
     * 
     * @return value
     */
    public String getRiskProfileNumber() {
        return riskProfileNumber;
    }

    /** 
     * Set the 'RiskProfileNumber' element value. Порядковый номер профиля риска
     * 
     * @param riskProfileNumber
     */
    public void setRiskProfileNumber(String riskProfileNumber) {
        this.riskProfileNumber = riskProfileNumber;
    }

    /** 
     * Get the 'RiskProfileNumberVersion' element value. Порядковый номер версии профиля риска.
     * 
     * @return value
     */
    public String getRiskProfileNumberVersion() {
        return riskProfileNumberVersion;
    }

    /** 
     * Set the 'RiskProfileNumberVersion' element value. Порядковый номер версии профиля риска.
     * 
     * @param riskProfileNumberVersion
     */
    public void setRiskProfileNumberVersion(String riskProfileNumberVersion) {
        this.riskProfileNumberVersion = riskProfileNumberVersion;
    }

    /** 
     * Get the 'CriteriionCode' element value. Код критерия отнесения товаров, внешнеэкономических операций и лиц к группам риска
     * 
     * @return value
     */
    public String getCriteriionCode() {
        return criteriionCode;
    }

    /** 
     * Set the 'CriteriionCode' element value. Код критерия отнесения товаров, внешнеэкономических операций и лиц к группам риска
     * 
     * @param criteriionCode
     */
    public void setCriteriionCode(String criteriionCode) {
        this.criteriionCode = criteriionCode;
    }

    /** 
     * Get the 'PointCode' element value. Этап проведения проверки на соответствие профилям риска  (заполняется программным средством в автоматическом режиме).
     * 
     * @return value
     */
    public String getPointCode() {
        return pointCode;
    }

    /** 
     * Set the 'PointCode' element value. Этап проведения проверки на соответствие профилям риска  (заполняется программным средством в автоматическом режиме).
     * 
     * @param pointCode
     */
    public void setPointCode(String pointCode) {
        this.pointCode = pointCode;
    }

    /** 
     * Get the 'PointDate' element value. Дата завершения проведения проверки на соответствие профилям риска. Заполняется программным средством в автоматическом режиме
     * 
     * @return value
     */
    public LocalDate getPointDate() {
        return pointDate;
    }

    /** 
     * Set the 'PointDate' element value. Дата завершения проведения проверки на соответствие профилям риска. Заполняется программным средством в автоматическом режиме
     * 
     * @param pointDate
     */
    public void setPointDate(LocalDate pointDate) {
        this.pointDate = pointDate;
    }

    /** 
     * Get the 'PointTime' element value. Время завершения проведения проверки на соответствие профилям риска  в формате (ЧЧ:ММ:СС). Заполняется программным средством в автоматическом режиме
     * 
     * @return value
     */
    public String getPointTime() {
        return pointTime;
    }

    /** 
     * Set the 'PointTime' element value. Время завершения проведения проверки на соответствие профилям риска  в формате (ЧЧ:ММ:СС). Заполняется программным средством в автоматическом режиме
     * 
     * @param pointTime
     */
    public void setPointTime(String pointTime) {
        this.pointTime = pointTime;
    }

    /** 
     * Get the 'CustomsActionCode' element value. Первые пять цифр кода таможенного органа,  утвердившего профиль риска
     * 
     * @return value
     */
    public String getCustomsActionCode() {
        return customsActionCode;
    }

    /** 
     * Set the 'CustomsActionCode' element value. Первые пять цифр кода таможенного органа,  утвердившего профиль риска
     * 
     * @param customsActionCode
     */
    public void setCustomsActionCode(String customsActionCode) {
        this.customsActionCode = customsActionCode;
    }

    /** 
     * Get the 'SoftKind' element value. Отметка о применяемой для оценки уровня риска версии программных средств. Тип программного обеспечения (Резерв): 0 - ПЗ "Сервис выявления рисков СТО"; 1 - КАСТО "АИСТ-РТ21"; 2 - АПС "Выявление и оценка рисков"
     * 
     * @return value
     */
    public String getSoftKind() {
        return softKind;
    }

    /** 
     * Set the 'SoftKind' element value. Отметка о применяемой для оценки уровня риска версии программных средств. Тип программного обеспечения (Резерв): 0 - ПЗ "Сервис выявления рисков СТО"; 1 - КАСТО "АИСТ-РТ21"; 2 - АПС "Выявление и оценка рисков"
     * 
     * @param softKind
     */
    public void setSoftKind(String softKind) {
        this.softKind = softKind;
    }

    /** 
     * Get the 'SoftVersion' element value. Отметка о применяемой для оценки уровня риска версии программных средств. Версия программного обеспечения
     * 
     * @return value
     */
    public String getSoftVersion() {
        return softVersion;
    }

    /** 
     * Set the 'SoftVersion' element value. Отметка о применяемой для оценки уровня риска версии программных средств. Версия программного обеспечения
     * 
     * @param softVersion
     */
    public void setSoftVersion(String softVersion) {
        this.softVersion = softVersion;
    }

    /** 
     * Get the 'FirstPointDate' element value. Дата начала действия версии профиля риска
     * 
     * @return value
     */
    public LocalDate getFirstPointDate() {
        return firstPointDate;
    }

    /** 
     * Set the 'FirstPointDate' element value. Дата начала действия версии профиля риска
     * 
     * @param firstPointDate
     */
    public void setFirstPointDate(LocalDate firstPointDate) {
        this.firstPointDate = firstPointDate;
    }

    /** 
     * Get the list of 'RiskAction' element items. Принятые меры по выявленным рискам
     * 
     * @return list
     */
    public List<RiskActionType> getRiskActionList() {
        return riskActionList;
    }

    /** 
     * Set the list of 'RiskAction' element items. Принятые меры по выявленным рискам
     * 
     * @param list
     */
    public void setRiskActionList(List<RiskActionType> list) {
        riskActionList = list;
    }

    /** 
     * Get the 'NumberOrientation' element value. Номер ориентировки (Резерв)
     * 
     * @return value
     */
    public NumberOrientationType getNumberOrientation() {
        return numberOrientation;
    }

    /** 
     * Set the 'NumberOrientation' element value. Номер ориентировки (Резерв)
     * 
     * @param numberOrientation
     */
    public void setNumberOrientation(NumberOrientationType numberOrientation) {
        this.numberOrientation = numberOrientation;
    }

    /** 
     * Get the list of 'AddNonFormInfoRiskProfile' element items. Дополнительная неформализованная информация - уровень профиля риска
     * 
     * @return list
     */
    public List<AddNonFormInfoRiskProfileType> getAddNonFormInfoRiskProfileList() {
        return addNonFormInfoRiskProfileList;
    }

    /** 
     * Set the list of 'AddNonFormInfoRiskProfile' element items. Дополнительная неформализованная информация - уровень профиля риска
     * 
     * @param list
     */
    public void setAddNonFormInfoRiskProfileList(
            List<AddNonFormInfoRiskProfileType> list) {
        addNonFormInfoRiskProfileList = list;
    }
}
