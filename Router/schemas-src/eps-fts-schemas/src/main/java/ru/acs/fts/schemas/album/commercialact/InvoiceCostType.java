
package ru.acs.fts.schemas.album.commercialact;

/** 
 * Описание несоответствия фактурной стоимости товара сведениям, заявленным в товаросопроводительных документах
 */
public class InvoiceCostType
{
    private InvoiceCostDataType invoiceCostByDocs;
    private InvoiceCostDataType invoiceCostByFact;

    /** 
     * Get the 'InvoiceCostByDocs' element value. Фактурная стоимость cогласно товаросопроводительным документам
     * 
     * @return value
     */
    public InvoiceCostDataType getInvoiceCostByDocs() {
        return invoiceCostByDocs;
    }

    /** 
     * Set the 'InvoiceCostByDocs' element value. Фактурная стоимость cогласно товаросопроводительным документам
     * 
     * @param invoiceCostByDocs
     */
    public void setInvoiceCostByDocs(InvoiceCostDataType invoiceCostByDocs) {
        this.invoiceCostByDocs = invoiceCostByDocs;
    }

    /** 
     * Get the 'InvoiceCostByFact' element value. Фактурная стоимость фактическая
     * 
     * @return value
     */
    public InvoiceCostDataType getInvoiceCostByFact() {
        return invoiceCostByFact;
    }

    /** 
     * Set the 'InvoiceCostByFact' element value. Фактурная стоимость фактическая
     * 
     * @param invoiceCostByFact
     */
    public void setInvoiceCostByFact(InvoiceCostDataType invoiceCostByFact) {
        this.invoiceCostByFact = invoiceCostByFact;
    }
}
