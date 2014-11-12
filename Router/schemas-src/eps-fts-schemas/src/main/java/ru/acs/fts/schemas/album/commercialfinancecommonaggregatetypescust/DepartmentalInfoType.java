
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

/** 
 * Ведомственная информация
 */
public class DepartmentalInfoType
{
    private String drawerStatus;
    private String CBC;
    private String OKATO;
    private String paymentReason;
    private String taxPeriod;
    private String docNo;
    private String docDate;
    private String taxPaymentKind;
    private String customsCode;

    /** 
     * Get the 'DrawerStatus' element value. Статус составителя расчетного документа
     * 
     * @return value
     */
    public String getDrawerStatus() {
        return drawerStatus;
    }

    /** 
     * Set the 'DrawerStatus' element value. Статус составителя расчетного документа
     * 
     * @param drawerStatus
     */
    public void setDrawerStatus(String drawerStatus) {
        this.drawerStatus = drawerStatus;
    }

    /** 
     * Get the 'CBC' element value. Код бюджетной классификации (КБК), по которому учитывается налог (сбор)
     * 
     * @return value
     */
    public String getCBC() {
        return CBC;
    }

    /** 
     * Set the 'CBC' element value. Код бюджетной классификации (КБК), по которому учитывается налог (сбор)
     * 
     * @param CBC
     */
    public void setCBC(String CBC) {
        this.CBC = CBC;
    }

    /** 
     * Get the 'OKATO' element value. Код муниципального образования ОКАТО
     * 
     * @return value
     */
    public String getOKATO() {
        return OKATO;
    }

    /** 
     * Set the 'OKATO' element value. Код муниципального образования ОКАТО
     * 
     * @param OKATO
     */
    public void setOKATO(String OKATO) {
        this.OKATO = OKATO;
    }

    /** 
     * Get the 'PaymentReason' element value. Основание налогового платежа
     * 
     * @return value
     */
    public String getPaymentReason() {
        return paymentReason;
    }

    /** 
     * Set the 'PaymentReason' element value. Основание налогового платежа
     * 
     * @param paymentReason
     */
    public void setPaymentReason(String paymentReason) {
        this.paymentReason = paymentReason;
    }

    /** 
     * Get the 'TaxPeriod' element value. Налоговый период
     * 
     * @return value
     */
    public String getTaxPeriod() {
        return taxPeriod;
    }

    /** 
     * Set the 'TaxPeriod' element value. Налоговый период
     * 
     * @param taxPeriod
     */
    public void setTaxPeriod(String taxPeriod) {
        this.taxPeriod = taxPeriod;
    }

    /** 
     * Get the 'DocNo' element value. Номер налогового документа/Идентификатор сведений о физическом лице
     * 
     * @return value
     */
    public String getDocNo() {
        return docNo;
    }

    /** 
     * Set the 'DocNo' element value. Номер налогового документа/Идентификатор сведений о физическом лице
     * 
     * @param docNo
     */
    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    /** 
     * Get the 'DocDate' element value. Дата налогового документа
     * 
     * @return value
     */
    public String getDocDate() {
        return docDate;
    }

    /** 
     * Set the 'DocDate' element value. Дата налогового документа
     * 
     * @param docDate
     */
    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    /** 
     * Get the 'TaxPaymentKind' element value. Тип налогового платежа
     * 
     * @return value
     */
    public String getTaxPaymentKind() {
        return taxPaymentKind;
    }

    /** 
     * Set the 'TaxPaymentKind' element value. Тип налогового платежа
     * 
     * @param taxPaymentKind
     */
    public void setTaxPaymentKind(String taxPaymentKind) {
        this.taxPaymentKind = taxPaymentKind;
    }

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }
}
