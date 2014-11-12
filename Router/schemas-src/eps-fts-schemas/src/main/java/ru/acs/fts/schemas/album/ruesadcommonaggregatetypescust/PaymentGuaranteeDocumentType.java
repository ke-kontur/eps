
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * Документы по которым внесено обеспечение уплаты таможенных платежей. Гр. 44. п.7.2
 */
public class PaymentGuaranteeDocumentType extends PresentedDocumentType
{
    private String presentedDocumentModeCode;
    private String customsPaymentModeCodeType;

    /** 
     * Get the 'PresentedDocumentModeCode' element value. Код вида представляемого документа. Заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44.
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value. Код вида представляемого документа. Заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44.
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }

    /** 
     * Get the 'CustomsPaymentModeCodeType' element value. Код вида таможенного платежа по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы.
     * 
     * @return value
     */
    public String getCustomsPaymentModeCodeType() {
        return customsPaymentModeCodeType;
    }

    /** 
     * Set the 'CustomsPaymentModeCodeType' element value. Код вида таможенного платежа по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы.
     * 
     * @param customsPaymentModeCodeType
     */
    public void setCustomsPaymentModeCodeType(String customsPaymentModeCodeType) {
        this.customsPaymentModeCodeType = customsPaymentModeCodeType;
    }
}
