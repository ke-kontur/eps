
package ru.acs.fts.schemas.album.commercialact;

/** 
 * �������� �������������� ��������� ��������� ������ ���������, ���������� � ���������������������� ����������
 */
public class InvoiceCostType
{
    private InvoiceCostDataType invoiceCostByDocs;
    private InvoiceCostDataType invoiceCostByFact;

    /** 
     * Get the 'InvoiceCostByDocs' element value. ��������� ��������� c������� ���������������������� ����������
     * 
     * @return value
     */
    public InvoiceCostDataType getInvoiceCostByDocs() {
        return invoiceCostByDocs;
    }

    /** 
     * Set the 'InvoiceCostByDocs' element value. ��������� ��������� c������� ���������������������� ����������
     * 
     * @param invoiceCostByDocs
     */
    public void setInvoiceCostByDocs(InvoiceCostDataType invoiceCostByDocs) {
        this.invoiceCostByDocs = invoiceCostByDocs;
    }

    /** 
     * Get the 'InvoiceCostByFact' element value. ��������� ��������� �����������
     * 
     * @return value
     */
    public InvoiceCostDataType getInvoiceCostByFact() {
        return invoiceCostByFact;
    }

    /** 
     * Set the 'InvoiceCostByFact' element value. ��������� ��������� �����������
     * 
     * @param invoiceCostByFact
     */
    public void setInvoiceCostByFact(InvoiceCostDataType invoiceCostByFact) {
        this.invoiceCostByFact = invoiceCostByFact;
    }
}
