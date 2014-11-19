
package ru.acs.fts.schemas.album.instrinspection;

import org.joda.time.LocalDate;

/** 
 * Номер профиля риска
 */
public class RiskProfileType
{
    private String riskProfileKind;
    private String customsCode;
    private LocalDate registryDate;
    private String sequenceNumber;
    private String riskProfileNumberVersion;

    /** 
     * Get the 'RiskProfileKind' element value. Код вида профиля риска в соответствии с Классификатором видов профилей рисков
     * 
     * @return value
     */
    public String getRiskProfileKind() {
        return riskProfileKind;
    }

    /** 
     * Set the 'RiskProfileKind' element value. Код вида профиля риска в соответствии с Классификатором видов профилей рисков
     * 
     * @param riskProfileKind
     */
    public void setRiskProfileKind(String riskProfileKind) {
        this.riskProfileKind = riskProfileKind;
    }

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа, должностное лицо которого утвердило профиль риска
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа, должностное лицо которого утвердило профиль риска
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'RegistryDate' element value. Дата регистрации ПР
     * 
     * @return value
     */
    public LocalDate getRegistryDate() {
        return registryDate;
    }

    /** 
     * Set the 'RegistryDate' element value. Дата регистрации ПР
     * 
     * @param registryDate
     */
    public void setRegistryDate(LocalDate registryDate) {
        this.registryDate = registryDate;
    }

    /** 
     * Get the 'SequenceNumber' element value. Порядковый номер ПР
     * 
     * @return value
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /** 
     * Set the 'SequenceNumber' element value. Порядковый номер ПР
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /** 
     * Get the 'RiskProfileNumberVersion' element value. Порядковый номер версии профиля риска
     * 
     * @return value
     */
    public String getRiskProfileNumberVersion() {
        return riskProfileNumberVersion;
    }

    /** 
     * Set the 'RiskProfileNumberVersion' element value. Порядковый номер версии профиля риска
     * 
     * @param riskProfileNumberVersion
     */
    public void setRiskProfileNumberVersion(String riskProfileNumberVersion) {
        this.riskProfileNumberVersion = riskProfileNumberVersion;
    }
}
