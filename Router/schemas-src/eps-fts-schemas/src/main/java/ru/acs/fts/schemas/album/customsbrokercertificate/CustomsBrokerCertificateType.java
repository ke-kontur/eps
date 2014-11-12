
package ru.acs.fts.schemas.album.customsbrokercertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Свидетельство о включении в Реестр таможенных представителей (брокеров)
 */
public class CustomsBrokerCertificateType extends BaseDocType
{
    private String formNumber;
    private DocumentBaseType documentReference;
    private BrokerOrganizationType organization;
    private PaymentGuaranteeType paymentGuarantee;
    private FieldRestrictionsType fieldRestrictions;
    private PersonSignatureType personSignature;
    private String documentModeID;

    /** 
     * Get the 'FormNumber' element value. Номер бланка
     * 
     * @return value
     */
    public String getFormNumber() {
        return formNumber;
    }

    /** 
     * Set the 'FormNumber' element value. Номер бланка
     * 
     * @param formNumber
     */
    public void setFormNumber(String formNumber) {
        this.formNumber = formNumber;
    }

    /** 
     * Get the 'DocumentReference' element value. Реквизиты документа
     * 
     * @return value
     */
    public DocumentBaseType getDocumentReference() {
        return documentReference;
    }

    /** 
     * Set the 'DocumentReference' element value. Реквизиты документа
     * 
     * @param documentReference
     */
    public void setDocumentReference(DocumentBaseType documentReference) {
        this.documentReference = documentReference;
    }

    /** 
     * Get the 'Organization' element value. Сведения об организации-таможенном представителе (брокере)
     * 
     * @return value
     */
    public BrokerOrganizationType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. Сведения об организации-таможенном представителе (брокере)
     * 
     * @param organization
     */
    public void setOrganization(BrokerOrganizationType organization) {
        this.organization = organization;
    }

    /** 
     * Get the 'PaymentGuarantee' element value. Обеспечение уплаты таможенных платежей
     * 
     * @return value
     */
    public PaymentGuaranteeType getPaymentGuarantee() {
        return paymentGuarantee;
    }

    /** 
     * Set the 'PaymentGuarantee' element value. Обеспечение уплаты таможенных платежей
     * 
     * @param paymentGuarantee
     */
    public void setPaymentGuarantee(PaymentGuaranteeType paymentGuarantee) {
        this.paymentGuarantee = paymentGuarantee;
    }

    /** 
     * Get the 'FieldRestrictions' element value. Ограничения сферы деятельности
     * 
     * @return value
     */
    public FieldRestrictionsType getFieldRestrictions() {
        return fieldRestrictions;
    }

    /** 
     * Set the 'FieldRestrictions' element value. Ограничения сферы деятельности
     * 
     * @param fieldRestrictions
     */
    public void setFieldRestrictions(FieldRestrictionsType fieldRestrictions) {
        this.fieldRestrictions = fieldRestrictions;
    }

    /** 
     * Get the 'PersonSignature' element value. Подпись должностного лица (ФИО, должность, дата)
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. Подпись должностного лица (ФИО, должность, дата)
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
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
