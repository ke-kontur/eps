
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

/** 
 * Вычеты: Расходы в национальной валюте, которые включены в А. (гр. В 18-21)
 */
public class DTS3Method1DeductionType
{
    private String unionTransportCharge;
    private String unionTaxPayment;
    private String exportCountryTaxPayment;
    private String totalDeductionAmount;

    /** 
     * Get the 'UnionTransportCharge' element value. Расходы по перевозке (транспортировке) товаров, осуществляемой для их вывоза с таможенной территории  Таможенного союза, и расходы по последующей перевозке (транспортировке). 18
     * 
     * @return value
     */
    public String getUnionTransportCharge() {
        return unionTransportCharge;
    }

    /** 
     * Set the 'UnionTransportCharge' element value. Расходы по перевозке (транспортировке) товаров, осуществляемой для их вывоза с таможенной территории  Таможенного союза, и расходы по последующей перевозке (транспортировке). 18
     * 
     * @param unionTransportCharge
     */
    public void setUnionTransportCharge(String unionTransportCharge) {
        this.unionTransportCharge = unionTransportCharge;
    }

    /** 
     * Get the 'UnionTaxPayment' element value. Пошлины, налоги и сборы, взимаемые на таможенной территории Таможенного союза в связи с вывозом товаров. 19.
     * 
     * @return value
     */
    public String getUnionTaxPayment() {
        return unionTaxPayment;
    }

    /** 
     * Set the 'UnionTaxPayment' element value. Пошлины, налоги и сборы, взимаемые на таможенной территории Таможенного союза в связи с вывозом товаров. 19.
     * 
     * @param unionTaxPayment
     */
    public void setUnionTaxPayment(String unionTaxPayment) {
        this.unionTaxPayment = unionTaxPayment;
    }

    /** 
     * Get the 'ExportCountryTaxPayment' element value. Пошлины, налоги и сборы, взимаемые в отношении оцениваемых товаров в стране, в которую ввозятся эти товары. 20.
     * 
     * @return value
     */
    public String getExportCountryTaxPayment() {
        return exportCountryTaxPayment;
    }

    /** 
     * Set the 'ExportCountryTaxPayment' element value. Пошлины, налоги и сборы, взимаемые в отношении оцениваемых товаров в стране, в которую ввозятся эти товары. 20.
     * 
     * @param exportCountryTaxPayment
     */
    public void setExportCountryTaxPayment(String exportCountryTaxPayment) {
        this.exportCountryTaxPayment = exportCountryTaxPayment;
    }

    /** 
     * Get the 'TotalDeductionAmount' element value. Итого В в национальной валюте. 21
     * 
     * @return value
     */
    public String getTotalDeductionAmount() {
        return totalDeductionAmount;
    }

    /** 
     * Set the 'TotalDeductionAmount' element value. Итого В в национальной валюте. 21
     * 
     * @param totalDeductionAmount
     */
    public void setTotalDeductionAmount(String totalDeductionAmount) {
        this.totalDeductionAmount = totalDeductionAmount;
    }
}
