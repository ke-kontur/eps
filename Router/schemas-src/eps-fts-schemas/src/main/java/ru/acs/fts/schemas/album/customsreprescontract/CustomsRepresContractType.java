
package ru.acs.fts.schemas.album.customsreprescontract;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ������� ����������� ������������� � �����������
 */
public class CustomsRepresContractType extends BaseDocType
{
    private String paymentFactSign;
    private String additionalInformation;
    private CustomsRepresentativType customsRepresentative;
    private CUOrganizationType declarant;
    private DocumentBaseType contractDetails;
    private String documentModeID;

    /** 
     * Get the 'PaymentFactSign' element value. ������� ����� ������ ���������� �������� ���������� �������������� �� ����������
     * 
     * @return value
     */
    public String getPaymentFactSign() {
        return paymentFactSign;
    }

    /** 
     * Set the 'PaymentFactSign' element value. ������� ����� ������ ���������� �������� ���������� �������������� �� ����������
     * 
     * @param paymentFactSign
     */
    public void setPaymentFactSign(String paymentFactSign) {
        this.paymentFactSign = paymentFactSign;
    }

    /** 
     * Get the 'AdditionalInformation' element value. �������������� ����������
     * 
     * @return value
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /** 
     * Set the 'AdditionalInformation' element value. �������������� ����������
     * 
     * @param additionalInformation
     */
    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /** 
     * Get the 'CustomsRepresentative' element value. ���������� �������������
     * 
     * @return value
     */
    public CustomsRepresentativType getCustomsRepresentative() {
        return customsRepresentative;
    }

    /** 
     * Set the 'CustomsRepresentative' element value. ���������� �������������
     * 
     * @param customsRepresentative
     */
    public void setCustomsRepresentative(
            CustomsRepresentativType customsRepresentative) {
        this.customsRepresentative = customsRepresentative;
    }

    /** 
     * Get the 'Declarant' element value. ���������
     * 
     * @return value
     */
    public CUOrganizationType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. ���������
     * 
     * @param declarant
     */
    public void setDeclarant(CUOrganizationType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'ContractDetails' element value. ��������� �������� ���������� � ���������� ��������������
     * 
     * @return value
     */
    public DocumentBaseType getContractDetails() {
        return contractDetails;
    }

    /** 
     * Set the 'ContractDetails' element value. ��������� �������� ���������� � ���������� ��������������
     * 
     * @param contractDetails
     */
    public void setContractDetails(DocumentBaseType contractDetails) {
        this.contractDetails = contractDetails;
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
