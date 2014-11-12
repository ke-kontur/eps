
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Тип, описывающий ПР/ЦПР
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:DTRevealedRisks:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProfileInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="DocumentSignCode"/>
 *     &lt;xs:element type="xs:string" name="DivisionCode"/>
 *     &lt;xs:element type="xs:date" name="RegistryDate"/>
 *     &lt;xs:element type="xs:string" name="SequenceNumber"/>
 *     &lt;xs:element type="xs:string" name="VersionNumber"/>
 *     &lt;xs:element type="xs:string" name="CriterionCode"/>
 *     &lt;xs:element type="xs:string" name="ActivityCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="FormalizedType"/>
 *     &lt;xs:element type="xs:date" name="BeginDate"/>
 *     &lt;xs:element type="xs:string" name="PRNote" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="MinimizeMeasuresNote" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="DescriptionMeasure" minOccurs="0"/>
 *     &lt;xs:element type="ns:MinimizeInfoType" name="MinimizeMeasuresInfo" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:anySimpleType" name="ID"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProfileInfoType
{
    private String documentSignCode;
    private String divisionCode;
    private LocalDate registryDate;
    private String sequenceNumber;
    private String versionNumber;
    private String criterionCode;
    private String activityCode;
    private String formalizedType;
    private LocalDate beginDate;
    private String PRNote;
    private String minimizeMeasuresNote;
    private String descriptionMeasure;
    private List<MinimizeInfoType> minimizeMeasuresInfoList = new ArrayList<MinimizeInfoType>();
    private String ID;

    /** 
     * Get the 'DocumentSignCode' element value. Код признака документа. Возможные значения:
    11 – общероссийский профиль риска, 
    12 – региональный профиль риска, 
    13 – зональный профиль риска,
    20 – срочный профиль риска,
    32 – профиль риска на основе моделей,
    55 – профиль риска, обязательный к применению,
    77 – профиль риска для определения степени выборочности,
    88 – зависимый профиль риска.
     * 
     * @return value
     */
    public String getDocumentSignCode() {
        return documentSignCode;
    }

    /** 
     * Set the 'DocumentSignCode' element value. Код признака документа. Возможные значения:
    11 – общероссийский профиль риска, 
    12 – региональный профиль риска, 
    13 – зональный профиль риска,
    20 – срочный профиль риска,
    32 – профиль риска на основе моделей,
    55 – профиль риска, обязательный к применению,
    77 – профиль риска для определения степени выборочности,
    88 – зависимый профиль риска.
     * 
     * @param documentSignCode
     */
    public void setDocumentSignCode(String documentSignCode) {
        this.documentSignCode = documentSignCode;
    }

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
     * Get the 'CriterionCode' element value. Код типового критерия
     * 
     * @return value
     */
    public String getCriterionCode() {
        return criterionCode;
    }

    /** 
     * Set the 'CriterionCode' element value. Код типового критерия
     * 
     * @param criterionCode
     */
    public void setCriterionCode(String criterionCode) {
        this.criterionCode = criterionCode;
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
     * Get the 'FormalizedType' element value. Признак формализации. Допустимые значения (битовая маска): 0 - неформализован; 1 - формализован; 2 - формализован частично
     * 
     * @return value
     */
    public String getFormalizedType() {
        return formalizedType;
    }

    /** 
     * Set the 'FormalizedType' element value. Признак формализации. Допустимые значения (битовая маска): 0 - неформализован; 1 - формализован; 2 - формализован частично
     * 
     * @param formalizedType
     */
    public void setFormalizedType(String formalizedType) {
        this.formalizedType = formalizedType;
    }

    /** 
     * Get the 'BeginDate' element value. Дата начала действия версии ПР (Дата в формате YYYY-MM-DD. По стандарту  формат ISO 8601.)
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. Дата начала действия версии ПР (Дата в формате YYYY-MM-DD. По стандарту  формат ISO 8601.)
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'PRNote' element value. Примечание к области риска
     * 
     * @return value
     */
    public String getPRNote() {
        return PRNote;
    }

    /** 
     * Set the 'PRNote' element value. Примечание к области риска
     * 
     * @param PRNote
     */
    public void setPRNote(String PRNote) {
        this.PRNote = PRNote;
    }

    /** 
     * Get the 'MinimizeMeasuresNote' element value. Не используется. Не заполняется в СВР. Описание профиля риска (ранее использовалось для ориентировок).
     * 
     * @return value
     */
    public String getMinimizeMeasuresNote() {
        return minimizeMeasuresNote;
    }

    /** 
     * Set the 'MinimizeMeasuresNote' element value. Не используется. Не заполняется в СВР. Описание профиля риска (ранее использовалось для ориентировок).
     * 
     * @param minimizeMeasuresNote
     */
    public void setMinimizeMeasuresNote(String minimizeMeasuresNote) {
        this.minimizeMeasuresNote = minimizeMeasuresNote;
    }

    /** 
     * Get the 'DescriptionMeasure' element value. Примечание к мерам (произвольный текст)
     * 
     * @return value
     */
    public String getDescriptionMeasure() {
        return descriptionMeasure;
    }

    /** 
     * Set the 'DescriptionMeasure' element value. Примечание к мерам (произвольный текст)
     * 
     * @param descriptionMeasure
     */
    public void setDescriptionMeasure(String descriptionMeasure) {
        this.descriptionMeasure = descriptionMeasure;
    }

    /** 
     * Get the list of 'MinimizeMeasuresInfo' element items. Набор информации о каждой мере по минимизации рисков
     * 
     * @return list
     */
    public List<MinimizeInfoType> getMinimizeMeasuresInfoList() {
        return minimizeMeasuresInfoList;
    }

    /** 
     * Set the list of 'MinimizeMeasuresInfo' element items. Набор информации о каждой мере по минимизации рисков
     * 
     * @param list
     */
    public void setMinimizeMeasuresInfoList(List<MinimizeInfoType> list) {
        minimizeMeasuresInfoList = list;
    }

    /** 
     * Get the 'ID' attribute value. Уникальный идентификатор, который присваивается профилю риска в ПЗ "СВР СТО" уровня РТУ, ФТС
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' attribute value. Уникальный идентификатор, который присваивается профилю риска в ПЗ "СВР СТО" уровня РТУ, ФТС
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }
}
