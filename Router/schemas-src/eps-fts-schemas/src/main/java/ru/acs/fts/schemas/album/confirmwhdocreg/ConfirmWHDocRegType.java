
package ru.acs.fts.schemas.album.confirmwhdocreg;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHCustomInspectorType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WarehouseCertificateType;

/** 
 * Подтверждение о регистрации представленных документов
 */
public class ConfirmWHDocRegType extends BaseDocType
{
    private LocalDate regDate;
    private String regTime;
    private LocalDate presentDate;
    private String presentTime;
    private LocalDate deadline;
    private String measuresEnsure;
    private CustomsType customs;
    private OrganizationBaseType organization;
    private WHCustomInspectorType customsPerson;
    private GTDIDType regNumberDoc;
    private WarehouseCertificateType warehouseLicense;
    private String documentModeID;

    /** 
     * Get the 'RegDate' element value. Дата регистрации документа
     * 
     * @return value
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /** 
     * Set the 'RegDate' element value. Дата регистрации документа
     * 
     * @param regDate
     */
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    /** 
     * Get the 'RegTime' element value. Время регистрации документа
     * 
     * @return value
     */
    public String getRegTime() {
        return regTime;
    }

    /** 
     * Set the 'RegTime' element value. Время регистрации документа
     * 
     * @param regTime
     */
    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    /** 
     * Get the 'PresentDate' element value. Дата представления документа
     * 
     * @return value
     */
    public LocalDate getPresentDate() {
        return presentDate;
    }

    /** 
     * Set the 'PresentDate' element value. Дата представления документа
     * 
     * @param presentDate
     */
    public void setPresentDate(LocalDate presentDate) {
        this.presentDate = presentDate;
    }

    /** 
     * Get the 'PresentTime' element value. Время представления документа
     * 
     * @return value
     */
    public String getPresentTime() {
        return presentTime;
    }

    /** 
     * Set the 'PresentTime' element value. Время представления документа
     * 
     * @param presentTime
     */
    public void setPresentTime(String presentTime) {
        this.presentTime = presentTime;
    }

    /** 
     * Get the 'Deadline' element value. Срок подачи ДО
     * 
     * @return value
     */
    public LocalDate getDeadline() {
        return deadline;
    }

    /** 
     * Set the 'Deadline' element value. Срок подачи ДО
     * 
     * @param deadline
     */
    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    /** 
     * Get the 'MeasuresEnsure' element value. Мера обеспечения
     * 
     * @return value
     */
    public String getMeasuresEnsure() {
        return measuresEnsure;
    }

    /** 
     * Set the 'MeasuresEnsure' element value. Мера обеспечения
     * 
     * @param measuresEnsure
     */
    public void setMeasuresEnsure(String measuresEnsure) {
        this.measuresEnsure = measuresEnsure;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Organization' element value. Сведения об организации, представившая документы
     * 
     * @return value
     */
    public OrganizationBaseType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. Сведения об организации, представившая документы
     * 
     * @param organization
     */
    public void setOrganization(OrganizationBaseType organization) {
        this.organization = organization;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public WHCustomInspectorType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(WHCustomInspectorType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'RegNumberDoc' element value. Регистрационный номер документа
     * 
     * @return value
     */
    public GTDIDType getRegNumberDoc() {
        return regNumberDoc;
    }

    /** 
     * Set the 'RegNumberDoc' element value. Регистрационный номер документа
     * 
     * @param regNumberDoc
     */
    public void setRegNumberDoc(GTDIDType regNumberDoc) {
        this.regNumberDoc = regNumberDoc;
    }

    /** 
     * Get the 'WarehouseLicense' element value. Разрешительный документ (свидетельство, разрешение) склада, на который помещаются товары
     * 
     * @return value
     */
    public WarehouseCertificateType getWarehouseLicense() {
        return warehouseLicense;
    }

    /** 
     * Set the 'WarehouseLicense' element value. Разрешительный документ (свидетельство, разрешение) склада, на который помещаются товары
     * 
     * @param warehouseLicense
     */
    public void setWarehouseLicense(WarehouseCertificateType warehouseLicense) {
        this.warehouseLicense = warehouseLicense;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
