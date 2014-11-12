
package ru.acs.fts.schemas.album.chargeoffletter;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationWBankType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ������ �� �������� �������� ������� �� ������ �������
 */
public class ChargeOffLetterType extends BaseDocType
{
    private List<String> letterTextList = new ArrayList<String>();
    private DocumentBaseType documentReference;
    private OrganizationWBankType broker;
    private OrganizationWBankType declarant;
    private List<PaymentsType> paymentList = new ArrayList<PaymentsType>();
    private List<PersonBaseType> signatureList = new ArrayList<PersonBaseType>();
    private PersonBaseType customsPerson;
    private String documentModeID;

    /** 
     * Get the list of 'LetterText' element items. ����� ������ (����� ��������� ��������)
     * 
     * @return list
     */
    public List<String> getLetterTextList() {
        return letterTextList;
    }

    /** 
     * Set the list of 'LetterText' element items. ����� ������ (����� ��������� ��������)
     * 
     * @param list
     */
    public void setLetterTextList(List<String> list) {
        letterTextList = list;
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
     * Get the 'Broker' element value. ����������� ����������
     * 
     * @return value
     */
    public OrganizationWBankType getBroker() {
        return broker;
    }

    /** 
     * Set the 'Broker' element value. ����������� ����������
     * 
     * @param broker
     */
    public void setBroker(OrganizationWBankType broker) {
        this.broker = broker;
    }

    /** 
     * Get the 'Declarant' element value. �� ���� �������������� ������ (���������)
     * 
     * @return value
     */
    public OrganizationWBankType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. �� ���� �������������� ������ (���������)
     * 
     * @param declarant
     */
    public void setDeclarant(OrganizationWBankType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the list of 'Payments' element items. �������
     * 
     * @return list
     */
    public List<PaymentsType> getPaymentList() {
        return paymentList;
    }

    /** 
     * Set the list of 'Payments' element items. �������
     * 
     * @param list
     */
    public void setPaymentList(List<PaymentsType> list) {
        paymentList = list;
    }

    /** 
     * Get the list of 'Signatures' element items. ������� (����������� ���� �������)
     * 
     * @return list
     */
    public List<PersonBaseType> getSignatureList() {
        return signatureList;
    }

    /** 
     * Set the list of 'Signatures' element items. ������� (����������� ���� �������)
     * 
     * @param list
     */
    public void setSignatureList(List<PersonBaseType> list) {
        signatureList = list;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������ �� ��� �������� ����������� ������
     * 
     * @return value
     */
    public PersonBaseType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������ �� ��� �������� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(PersonBaseType customsPerson) {
        this.customsPerson = customsPerson;
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
