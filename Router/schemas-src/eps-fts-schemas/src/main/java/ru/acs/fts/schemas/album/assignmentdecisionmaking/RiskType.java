
package ru.acs.fts.schemas.album.assignmentdecisionmaking;

import org.joda.time.LocalDate;

/** 
 * Номер профиля риска
 */
public class RiskType
{
    private String terrActionCode;
    private String customsActionCode;
    private LocalDate riskProfileRegDate;
    private String riskProfileNumber;
    private String riskProfileNumberVersion;

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
}
