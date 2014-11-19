
package ru.acs.fts.schemas.album.customsreprescontract;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Договор таможенного представителя с декларантом
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
     * Get the 'PaymentFactSign' element value. Признак факта уплаты таможенных платежей таможенным представителем за декларанта
     * 
     * @return value
     */
    public String getPaymentFactSign() {
        return paymentFactSign;
    }

    /** 
     * Set the 'PaymentFactSign' element value. Признак факта уплаты таможенных платежей таможенным представителем за декларанта
     * 
     * @param paymentFactSign
     */
    public void setPaymentFactSign(String paymentFactSign) {
        this.paymentFactSign = paymentFactSign;
    }

    /** 
     * Get the 'AdditionalInformation' element value. Дополнительная информация
     * 
     * @return value
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /** 
     * Set the 'AdditionalInformation' element value. Дополнительная информация
     * 
     * @param additionalInformation
     */
    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /** 
     * Get the 'CustomsRepresentative' element value. Таможенный представитель
     * 
     * @return value
     */
    public CustomsRepresentativType getCustomsRepresentative() {
        return customsRepresentative;
    }

    /** 
     * Set the 'CustomsRepresentative' element value. Таможенный представитель
     * 
     * @param customsRepresentative
     */
    public void setCustomsRepresentative(
            CustomsRepresentativType customsRepresentative) {
        this.customsRepresentative = customsRepresentative;
    }

    /** 
     * Get the 'Declarant' element value. Декларант
     * 
     * @return value
     */
    public CUOrganizationType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Декларант
     * 
     * @param declarant
     */
    public void setDeclarant(CUOrganizationType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'ContractDetails' element value. Реквизиты договора декларанта с таможенным представителем
     * 
     * @return value
     */
    public DocumentBaseType getContractDetails() {
        return contractDetails;
    }

    /** 
     * Set the 'ContractDetails' element value. Реквизиты договора декларанта с таможенным представителем
     * 
     * @param contractDetails
     */
    public void setContractDetails(DocumentBaseType contractDetails) {
        this.contractDetails = contractDetails;
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
