
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * ИД профиля риска
 */
public class RiskProfileRegNumberType
{
    private String divisionCode;
    private String documentSignCode;
    private LocalDate registryDate;
    private String sequenceNumber;
    private String versionNumber;

    /** 
     * Get the 'DivisionCode' element value. Код таможенного органа, разработавшего ПР/СПР
     * 
     * @return value
     */
    public String getDivisionCode() {
        return divisionCode;
    }

    /** 
     * Set the 'DivisionCode' element value. Код таможенного органа, разработавшего ПР/СПР
     * 
     * @param divisionCode
     */
    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    /** 
     * Get the 'DocumentSignCode' element value. Код признака документа. Возможные значения: 11 - общероссийский профиль риска, 12 - региональный профиль риска, 13 - зональный профиль риска, 55 - профиль риска, обязательный к применению, 20 - срочный профиль риска
     * 
     * @return value
     */
    public String getDocumentSignCode() {
        return documentSignCode;
    }

    /** 
     * Set the 'DocumentSignCode' element value. Код признака документа. Возможные значения: 11 - общероссийский профиль риска, 12 - региональный профиль риска, 13 - зональный профиль риска, 55 - профиль риска, обязательный к применению, 20 - срочный профиль риска
     * 
     * @param documentSignCode
     */
    public void setDocumentSignCode(String documentSignCode) {
        this.documentSignCode = documentSignCode;
    }

    /** 
     * Get the 'RegistryDate' element value. Дата регистрации ПР/СПР
     * 
     * @return value
     */
    public LocalDate getRegistryDate() {
        return registryDate;
    }

    /** 
     * Set the 'RegistryDate' element value. Дата регистрации ПР/СПР
     * 
     * @param registryDate
     */
    public void setRegistryDate(LocalDate registryDate) {
        this.registryDate = registryDate;
    }

    /** 
     * Get the 'SequenceNumber' element value. Порядковый номер ПР/СПР
     * 
     * @return value
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /** 
     * Set the 'SequenceNumber' element value. Порядковый номер ПР/СПР
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /** 
     * Get the 'VersionNumber' element value. Порядковый номер версии ПР/СПР
     * 
     * @return value
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /** 
     * Set the 'VersionNumber' element value. Порядковый номер версии ПР/СПР
     * 
     * @param versionNumber
     */
    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }
}
