
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

/** 
 * Срок оплаты по инвойсу
 */
public class InvoiceSaleTermsType
{
    private String saleTermsCode;
    private String saleTermsDescription;

    /** 
     * Get the 'SaleTermsCode' element value. Код срока оплаты по инвойсу
     * 
     * @return value
     */
    public String getSaleTermsCode() {
        return saleTermsCode;
    }

    /** 
     * Set the 'SaleTermsCode' element value. Код срока оплаты по инвойсу
     * 
     * @param saleTermsCode
     */
    public void setSaleTermsCode(String saleTermsCode) {
        this.saleTermsCode = saleTermsCode;
    }

    /** 
     * Get the 'SaleTermsDescription' element value. Описание срока оплаты по инвойсу
     * 
     * @return value
     */
    public String getSaleTermsDescription() {
        return saleTermsDescription;
    }

    /** 
     * Set the 'SaleTermsDescription' element value. Описание срока оплаты по инвойсу
     * 
     * @param saleTermsDescription
     */
    public void setSaleTermsDescription(String saleTermsDescription) {
        this.saleTermsDescription = saleTermsDescription;
    }
}
