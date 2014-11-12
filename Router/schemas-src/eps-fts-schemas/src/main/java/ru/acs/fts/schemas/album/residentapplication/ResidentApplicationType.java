
package ru.acs.fts.schemas.album.residentapplication;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Заявление резидента особой экономической зоны
 */
public class ResidentApplicationType extends BaseDocType
{
    private String applicationType;
    private String customsTreatmentYear;
    private String notes;
    private RegistryNumberType registryNumber;
    private CustomsType customs;
    private CustomsPersonType customsPersonSignature;
    private ResidentType resident;
    private PersonSignatureType residentPersonSignature;
    private ActivitiesAgreementType activitiesAgreement;
    private FormOneType formOne;
    private FormTwoType formTwo;
    private String documentModeID;

    /** 
     * Get the 'ApplicationType' element value. Тип документа: 0 - сведения; 1 - изменения и (или) дополнения к сведениям
     * 
     * @return value
     */
    public String getApplicationType() {
        return applicationType;
    }

    /** 
     * Set the 'ApplicationType' element value. Тип документа: 0 - сведения; 1 - изменения и (или) дополнения к сведениям
     * 
     * @param applicationType
     */
    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    /** 
     * Get the 'CustomsTreatmentYear' element value. Год таможенного режима свободной таможенной зоны
     * 
     * @return value
     */
    public String getCustomsTreatmentYear() {
        return customsTreatmentYear;
    }

    /** 
     * Set the 'CustomsTreatmentYear' element value. Год таможенного режима свободной таможенной зоны
     * 
     * @param customsTreatmentYear
     */
    public void setCustomsTreatmentYear(String customsTreatmentYear) {
        this.customsTreatmentYear = customsTreatmentYear;
    }

    /** 
     * Get the 'Notes' element value. Служебные отметки 
     * 
     * @return value
     */
    public String getNotes() {
        return notes;
    }

    /** 
     * Set the 'Notes' element value. Служебные отметки 
     * 
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /** 
     * Get the 'RegistryNumber' element value. Регистрационный номер заявления вида ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХ
     * 
     * @return value
     */
    public RegistryNumberType getRegistryNumber() {
        return registryNumber;
    }

    /** 
     * Set the 'RegistryNumber' element value. Регистрационный номер заявления вида ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХ
     * 
     * @param registryNumber
     */
    public void setRegistryNumber(RegistryNumberType registryNumber) {
        this.registryNumber = registryNumber;
    }

    /** 
     * Get the 'Customs' element value. Код и наименование таможенного органа
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Код и наименование таможенного органа
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPersonSignature' element value. ФИО и личная номерная печать таможенного инспектора 
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPersonSignature() {
        return customsPersonSignature;
    }

    /** 
     * Set the 'CustomsPersonSignature' element value. ФИО и личная номерная печать таможенного инспектора 
     * 
     * @param customsPersonSignature
     */
    public void setCustomsPersonSignature(
            CustomsPersonType customsPersonSignature) {
        this.customsPersonSignature = customsPersonSignature;
    }

    /** 
     * Get the 'Resident' element value. Сведения о резиденте ОЭЗ 
     * 
     * @return value
     */
    public ResidentType getResident() {
        return resident;
    }

    /** 
     * Set the 'Resident' element value. Сведения о резиденте ОЭЗ 
     * 
     * @param resident
     */
    public void setResident(ResidentType resident) {
        this.resident = resident;
    }

    /** 
     * Get the 'ResidentPersonSignature' element value. ФИО и подпись уполномоченного лица организации - резидента ОЭЗ 
     * 
     * @return value
     */
    public PersonSignatureType getResidentPersonSignature() {
        return residentPersonSignature;
    }

    /** 
     * Set the 'ResidentPersonSignature' element value. ФИО и подпись уполномоченного лица организации - резидента ОЭЗ 
     * 
     * @param residentPersonSignature
     */
    public void setResidentPersonSignature(
            PersonSignatureType residentPersonSignature) {
        this.residentPersonSignature = residentPersonSignature;
    }

    /** 
     * Get the 'ActivitiesAgreement' element value. Соглашение о ведении деятельности 
     * 
     * @return value
     */
    public ActivitiesAgreementType getActivitiesAgreement() {
        return activitiesAgreement;
    }

    /** 
     * Set the 'ActivitiesAgreement' element value. Соглашение о ведении деятельности 
     * 
     * @param activitiesAgreement
     */
    public void setActivitiesAgreement(
            ActivitiesAgreementType activitiesAgreement) {
        this.activitiesAgreement = activitiesAgreement;
    }

    /** 
     * Get the 'FormOne' element value. Форма №1. Сведения о товарах, предполагаемых к ввозу на территорию ОЭЗ в соответствии с таможенным режимом свободной таможенной зоны, для проведения в отношении них операций, не связанных с переработкой товаров и изготовлением продуктов их переработки. 
     * 
     * @return value
     */
    public FormOneType getFormOne() {
        return formOne;
    }

    /** 
     * Set the 'FormOne' element value. Форма №1. Сведения о товарах, предполагаемых к ввозу на территорию ОЭЗ в соответствии с таможенным режимом свободной таможенной зоны, для проведения в отношении них операций, не связанных с переработкой товаров и изготовлением продуктов их переработки. 
     * 
     * @param formOne
     */
    public void setFormOne(FormOneType formOne) {
        this.formOne = formOne;
    }

    /** 
     * Get the 'FormTwo' element value. Форма №2. Сведения о товарах, предполагаемых к ввозу на территорию ОЭЗ в соответствии с таможенным режимом свободной таможенной зоны с целью переработки товаров, о продуктах переработки и отходах 
     * 
     * @return value
     */
    public FormTwoType getFormTwo() {
        return formTwo;
    }

    /** 
     * Set the 'FormTwo' element value. Форма №2. Сведения о товарах, предполагаемых к ввозу на территорию ОЭЗ в соответствии с таможенным режимом свободной таможенной зоны с целью переработки товаров, о продуктах переработки и отходах 
     * 
     * @param formTwo
     */
    public void setFormTwo(FormTwoType formTwo) {
        this.formTwo = formTwo;
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
