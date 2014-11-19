
package ru.acs.fts.schemas.album.indulgencestatement;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ��������� �� �������������� �������� (���������) ������ ���������� �������� 
 */
public class IndulgenceStatementType extends BaseDocType
{
    private DocumentBaseType indulgenceStatementRegistration;
    private DocumentBaseType contractRegistration;
    private ContractTermsType contractTerms;
    private DeclarantType declarant;
    private DeclarantBankType declarantBank;
    private IndulgenceStatementContractorType indulgenceStatementContractor;
    private List<PaymentType> paymentList = new ArrayList<PaymentType>();
    private String documentModeID;

    /** 
     * Get the 'IndulgenceStatementRegistration' element value. ��������������� ������ ���������
     * 
     * @return value
     */
    public DocumentBaseType getIndulgenceStatementRegistration() {
        return indulgenceStatementRegistration;
    }

    /** 
     * Set the 'IndulgenceStatementRegistration' element value. ��������������� ������ ���������
     * 
     * @param indulgenceStatementRegistration
     */
    public void setIndulgenceStatementRegistration(
            DocumentBaseType indulgenceStatementRegistration) {
        this.indulgenceStatementRegistration = indulgenceStatementRegistration;
    }

    /** 
     * Get the 'ContractRegistration' element value. ��������������� ������ ���������
     * 
     * @return value
     */
    public DocumentBaseType getContractRegistration() {
        return contractRegistration;
    }

    /** 
     * Set the 'ContractRegistration' element value. ��������������� ������ ���������
     * 
     * @param contractRegistration
     */
    public void setContractRegistration(DocumentBaseType contractRegistration) {
        this.contractRegistration = contractRegistration;
    }

    /** 
     * Get the 'ContractTerms' element value. ������� ���������
     * 
     * @return value
     */
    public ContractTermsType getContractTerms() {
        return contractTerms;
    }

    /** 
     * Set the 'ContractTerms' element value. ������� ���������
     * 
     * @param contractTerms
     */
    public void setContractTerms(ContractTermsType contractTerms) {
        this.contractTerms = contractTerms;
    }

    /** 
     * Get the 'Declarant' element value. �������� � ���������
     * 
     * @return value
     */
    public DeclarantType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. �������� � ���������
     * 
     * @param declarant
     */
    public void setDeclarant(DeclarantType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'DeclarantBank' element value. �������� � ����� ��������� 
     * 
     * @return value
     */
    public DeclarantBankType getDeclarantBank() {
        return declarantBank;
    }

    /** 
     * Set the 'DeclarantBank' element value. �������� � ����� ��������� 
     * 
     * @param declarantBank
     */
    public void setDeclarantBank(DeclarantBankType declarantBank) {
        this.declarantBank = declarantBank;
    }

    /** 
     * Get the 'IndulgenceStatementContractor' element value. �������� � �����������
     * 
     * @return value
     */
    public IndulgenceStatementContractorType getIndulgenceStatementContractor() {
        return indulgenceStatementContractor;
    }

    /** 
     * Set the 'IndulgenceStatementContractor' element value. �������� � �����������
     * 
     * @param indulgenceStatementContractor
     */
    public void setIndulgenceStatementContractor(
            IndulgenceStatementContractorType indulgenceStatementContractor) {
        this.indulgenceStatementContractor = indulgenceStatementContractor;
    }

    /** 
     * Get the list of 'Payment' element items. �������� � ��������
     * 
     * @return list
     */
    public List<PaymentType> getPaymentList() {
        return paymentList;
    }

    /** 
     * Set the list of 'Payment' element items. �������� � ��������
     * 
     * @param list
     */
    public void setPaymentList(List<PaymentType> list) {
        paymentList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
