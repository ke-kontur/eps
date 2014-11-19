
package ru.acs.fts.schemas.album.transitrevealedrisks;

import org.joda.time.LocalDate;

/** 
 * Выявленные ПР/СПР
 */
public class ProfilesType
{
    private String divisionCode;
    private String documentSignCode;
    private LocalDate registryDate;
    private String sequenceNumber;
    private String versionNumber;
    private LocalDate beginDate;
    private String documentDescription;
    private String PRNote;
    private CriterionCodeInfoType criterionCodeInfo;
    private String activityCode;
    private MinimizeMeasuresType minimizeMeasures;
    private String ID;

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
     * Get the 'DocumentSignCode' element value. Код признака документа. Возможные значения: 11 - общероссийский профиль риска, 12 - региональный профиль риска, 13 - зональный профиль риска, 55 - профиль риска, обязательный к применению, 20 - срочный профиль риска.
     * 
     * @return value
     */
    public String getDocumentSignCode() {
        return documentSignCode;
    }

    /** 
     * Set the 'DocumentSignCode' element value. Код признака документа. Возможные значения: 11 - общероссийский профиль риска, 12 - региональный профиль риска, 13 - зональный профиль риска, 55 - профиль риска, обязательный к применению, 20 - срочный профиль риска.
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

    /** 
     * Get the 'BeginDate' element value. Дата начала действия версии ПР/СПР
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. Дата начала действия версии ПР/СПР
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'DocumentDescription' element value. Описание риска (заполняется только для автоматических ориентировок)
     * 
     * @return value
     */
    public String getDocumentDescription() {
        return documentDescription;
    }

    /** 
     * Set the 'DocumentDescription' element value. Описание риска (заполняется только для автоматических ориентировок)
     * 
     * @param documentDescription
     */
    public void setDocumentDescription(String documentDescription) {
        this.documentDescription = documentDescription;
    }

    /** 
     * Get the 'PRNote' element value. Примечание к ПР/СПР
     * 
     * @return value
     */
    public String getPRNote() {
        return PRNote;
    }

    /** 
     * Set the 'PRNote' element value. Примечание к ПР/СПР
     * 
     * @param PRNote
     */
    public void setPRNote(String PRNote) {
        this.PRNote = PRNote;
    }

    /** 
     * Get the 'CriterionCodeInfo' element value. Информация о типовом критерии
     * 
     * @return value
     */
    public CriterionCodeInfoType getCriterionCodeInfo() {
        return criterionCodeInfo;
    }

    /** 
     * Set the 'CriterionCodeInfo' element value. Информация о типовом критерии
     * 
     * @param criterionCodeInfo
     */
    public void setCriterionCodeInfo(CriterionCodeInfoType criterionCodeInfo) {
        this.criterionCodeInfo = criterionCodeInfo;
    }

    /** 
     * Get the 'ActivityCode' element value. Код направления деятельности подразделения, по направлению которого выявлен риск
     * 
     * @return value
     */
    public String getActivityCode() {
        return activityCode;
    }

    /** 
     * Set the 'ActivityCode' element value. Код направления деятельности подразделения, по направлению которого выявлен риск
     * 
     * @param activityCode
     */
    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    /** 
     * Get the 'MinimizeMeasures' element value. Меры по минимизации риска
     * 
     * @return value
     */
    public MinimizeMeasuresType getMinimizeMeasures() {
        return minimizeMeasures;
    }

    /** 
     * Set the 'MinimizeMeasures' element value. Меры по минимизации риска
     * 
     * @param minimizeMeasures
     */
    public void setMinimizeMeasures(MinimizeMeasuresType minimizeMeasures) {
        this.minimizeMeasures = minimizeMeasures;
    }

    /** 
     * Get the 'ID' attribute value. Уникальный идентификатор, который присваивается профилю риска в СВР "ПП"
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' attribute value. Уникальный идентификатор, который присваивается профилю риска в СВР "ПП"
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }
}
