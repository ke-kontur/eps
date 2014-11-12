
package ru.acs.fts.schemas.album.customsbrokercertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ������������� � ��������� � ������ ���������� �������������� (��������)
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
     * Get the 'FormNumber' element value. ����� ������
     * 
     * @return value
     */
    public String getFormNumber() {
        return formNumber;
    }

    /** 
     * Set the 'FormNumber' element value. ����� ������
     * 
     * @param formNumber
     */
    public void setFormNumber(String formNumber) {
        this.formNumber = formNumber;
    }

    /** 
     * Get the 'DocumentReference' element value. ��������� ���������
     * 
     * @return value
     */
    public DocumentBaseType getDocumentReference() {
        return documentReference;
    }

    /** 
     * Set the 'DocumentReference' element value. ��������� ���������
     * 
     * @param documentReference
     */
    public void setDocumentReference(DocumentBaseType documentReference) {
        this.documentReference = documentReference;
    }

    /** 
     * Get the 'Organization' element value. �������� �� �����������-���������� ������������� (�������)
     * 
     * @return value
     */
    public BrokerOrganizationType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. �������� �� �����������-���������� ������������� (�������)
     * 
     * @param organization
     */
    public void setOrganization(BrokerOrganizationType organization) {
        this.organization = organization;
    }

    /** 
     * Get the 'PaymentGuarantee' element value. ����������� ������ ���������� ��������
     * 
     * @return value
     */
    public PaymentGuaranteeType getPaymentGuarantee() {
        return paymentGuarantee;
    }

    /** 
     * Set the 'PaymentGuarantee' element value. ����������� ������ ���������� ��������
     * 
     * @param paymentGuarantee
     */
    public void setPaymentGuarantee(PaymentGuaranteeType paymentGuarantee) {
        this.paymentGuarantee = paymentGuarantee;
    }

    /** 
     * Get the 'FieldRestrictions' element value. ����������� ����� ������������
     * 
     * @return value
     */
    public FieldRestrictionsType getFieldRestrictions() {
        return fieldRestrictions;
    }

    /** 
     * Set the 'FieldRestrictions' element value. ����������� ����� ������������
     * 
     * @param fieldRestrictions
     */
    public void setFieldRestrictions(FieldRestrictionsType fieldRestrictions) {
        this.fieldRestrictions = fieldRestrictions;
    }

    /** 
     * Get the 'PersonSignature' element value. ������� ������������ ���� (���, ���������, ����)
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. ������� ������������ ���� (���, ���������, ����)
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
