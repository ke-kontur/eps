
package ru.acs.fts.schemas.album.revealedrisks;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Обоснование применения мер по минимизации рисков
 */
public class RiskInfType
{
    private String goodsNumeric;
    private String terrActionCode;
    private LocalDate riskProfileRegDate;
    private String riskProfileNumber;
    private String riskProfileNumberVersion;
    private String informationCode;
    private String lineNumber;
    private List<String> typicalNameList = new ArrayList<String>();
    private String pointCode;
    private String customsActionCode;

    /** 
     * Get the 'GoodsNumeric' element value. Номер товара по документу, по которому выявлен риск. 0 - 0 - если выявленный риск распространяется на все товары
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Номер товара по документу, по которому выявлен риск. 0 - 0 - если выявленный риск распространяется на все товары
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
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
     * Get the 'InformationCode' element value. Код информации: 4 - применение мер по минимизации рисков на основании "рамочных" профилей риска, по собственному решению; 7 -  применение мер на основании профилей риска по информации правоохранительных подразделений
     * 
     * @return value
     */
    public String getInformationCode() {
        return informationCode;
    }

    /** 
     * Set the 'InformationCode' element value. Код информации: 4 - применение мер по минимизации рисков на основании "рамочных" профилей риска, по собственному решению; 7 -  применение мер на основании профилей риска по информации правоохранительных подразделений
     * 
     * @param informationCode
     */
    public void setInformationCode(String informationCode) {
        this.informationCode = informationCode;
    }

    /** 
     * Get the 'LineNumber' element value. Порядковый номер строки информации
     * 
     * @return value
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /** 
     * Set the 'LineNumber' element value. Порядковый номер строки информации
     * 
     * @param lineNumber
     */
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    /** 
     * Get the list of 'TypicalName' element items. Обоснование применения мер:
     * 
     * @return list
     */
    public List<String> getTypicalNameList() {
        return typicalNameList;
    }

    /** 
     * Set the list of 'TypicalName' element items. Обоснование применения мер:
     * 
     * @param list
     */
    public void setTypicalNameList(List<String> list) {
        typicalNameList = list;
    }

    /** 
     * Get the 'PointCode' element value. Этап проведения проверки на соответствие профилям риска  (заполняется системой таможенного оформления автоматически).
     * 
     * @return value
     */
    public String getPointCode() {
        return pointCode;
    }

    /** 
     * Set the 'PointCode' element value. Этап проведения проверки на соответствие профилям риска  (заполняется системой таможенного оформления автоматически).
     * 
     * @param pointCode
     */
    public void setPointCode(String pointCode) {
        this.pointCode = pointCode;
    }

    /** 
     * Get the 'CustomsActionCode' element value. Первые пять цифр кода таможенного органа,  утвердившего профиль риска (ориентировку)
     * 
     * @return value
     */
    public String getCustomsActionCode() {
        return customsActionCode;
    }

    /** 
     * Set the 'CustomsActionCode' element value. Первые пять цифр кода таможенного органа,  утвердившего профиль риска (ориентировку)
     * 
     * @param customsActionCode
     */
    public void setCustomsActionCode(String customsActionCode) {
        this.customsActionCode = customsActionCode;
    }
}
