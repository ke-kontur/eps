
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * ƒокументы, подтверждающие наличие льгот  или особенностей по уплате таможенных платежей. √р. 44 п.7.1, 7.ј
 */
public class PaymentPrivilegeDocumentType extends PresentedDocumentType
{
    private String presentedDocumentModeCode;
    private String customsPaymentModeCodeType;

    /** 
     * Get the 'PresentedDocumentModeCode' element value.  од вида представл€емого документа. «аполн€етс€ в соответствии с классификатором видов документов, используемых при за€влении сведений в графе 44.
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value.  од вида представл€емого документа. «аполн€етс€ в соответствии с классификатором видов документов, используемых при за€влении сведений в графе 44.
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }

    /** 
     * Get the 'CustomsPaymentModeCodeType' element value.  од вида таможенного платежа по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы.
     * 
     * @return value
     */
    public String getCustomsPaymentModeCodeType() {
        return customsPaymentModeCodeType;
    }

    /** 
     * Set the 'CustomsPaymentModeCodeType' element value.  од вида таможенного платежа по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы.
     * 
     * @param customsPaymentModeCodeType
     */
    public void setCustomsPaymentModeCodeType(String customsPaymentModeCodeType) {
        this.customsPaymentModeCodeType = customsPaymentModeCodeType;
    }
}
