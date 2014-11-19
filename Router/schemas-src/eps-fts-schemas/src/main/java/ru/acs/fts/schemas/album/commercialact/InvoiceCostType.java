
package ru.acs.fts.schemas.album.commercialact;

/** 
 * ќписание несоответстви€ фактурной стоимости товара сведени€м, за€вленным в товаросопроводительных документах
 */
public class InvoiceCostType
{
    private InvoiceCostDataType invoiceCostByDocs;
    private InvoiceCostDataType invoiceCostByFact;

    /** 
     * Get the 'InvoiceCostByDocs' element value. ‘актурна€ стоимость cогласно товаросопроводительным документам
     * 
     * @return value
     */
    public InvoiceCostDataType getInvoiceCostByDocs() {
        return invoiceCostByDocs;
    }

    /** 
     * Set the 'InvoiceCostByDocs' element value. ‘актурна€ стоимость cогласно товаросопроводительным документам
     * 
     * @param invoiceCostByDocs
     */
    public void setInvoiceCostByDocs(InvoiceCostDataType invoiceCostByDocs) {
        this.invoiceCostByDocs = invoiceCostByDocs;
    }

    /** 
     * Get the 'InvoiceCostByFact' element value. ‘актурна€ стоимость фактическа€
     * 
     * @return value
     */
    public InvoiceCostDataType getInvoiceCostByFact() {
        return invoiceCostByFact;
    }

    /** 
     * Set the 'InvoiceCostByFact' element value. ‘актурна€ стоимость фактическа€
     * 
     * @param invoiceCostByFact
     */
    public void setInvoiceCostByFact(InvoiceCostDataType invoiceCostByFact) {
        this.invoiceCostByFact = invoiceCostByFact;
    }
}
