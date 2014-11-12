
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

/** 
 * Вычеты: Расходы в национальной валюте, которые включены в А. (гр. В 21-24)
 */
public class Method1DeductionType
{
    private String buildingAmount;
    private String unionTransportCharge;
    private String unionTaxPayment;
    private String totalDeductionAmount;

    /** 
     * Get the 'BuildingAmount' element value. Расходы на  строительство, возведение, сборку, монтаж, обслуживание или оказание технического содействия, производимые после ввоза товаров на таможенную территорию Таможенного союза. гр 21
     * 
     * @return value
     */
    public String getBuildingAmount() {
        return buildingAmount;
    }

    /** 
     * Set the 'BuildingAmount' element value. Расходы на  строительство, возведение, сборку, монтаж, обслуживание или оказание технического содействия, производимые после ввоза товаров на таможенную территорию Таможенного союза. гр 21
     * 
     * @param buildingAmount
     */
    public void setBuildingAmount(String buildingAmount) {
        this.buildingAmount = buildingAmount;
    }

    /** 
     * Get the 'UnionTransportCharge' element value. Расходы по перевозке (транспортировке) товаров после их прибытия на таможенную территорию Таможенного союза. гр 22
     * 
     * @return value
     */
    public String getUnionTransportCharge() {
        return unionTransportCharge;
    }

    /** 
     * Set the 'UnionTransportCharge' element value. Расходы по перевозке (транспортировке) товаров после их прибытия на таможенную территорию Таможенного союза. гр 22
     * 
     * @param unionTransportCharge
     */
    public void setUnionTransportCharge(String unionTransportCharge) {
        this.unionTransportCharge = unionTransportCharge;
    }

    /** 
     * Get the 'UnionTaxPayment' element value. Пошлины, налоги и сборы, взимаемые на таможенной территории Таможенного союза. гр 23
     * 
     * @return value
     */
    public String getUnionTaxPayment() {
        return unionTaxPayment;
    }

    /** 
     * Set the 'UnionTaxPayment' element value. Пошлины, налоги и сборы, взимаемые на таможенной территории Таможенного союза. гр 23
     * 
     * @param unionTaxPayment
     */
    public void setUnionTaxPayment(String unionTaxPayment) {
        this.unionTaxPayment = unionTaxPayment;
    }

    /** 
     * Get the 'TotalDeductionAmount' element value. Итого В в национальной валюте. гр 24
     * 
     * @return value
     */
    public String getTotalDeductionAmount() {
        return totalDeductionAmount;
    }

    /** 
     * Set the 'TotalDeductionAmount' element value. Итого В в национальной валюте. гр 24
     * 
     * @param totalDeductionAmount
     */
    public void setTotalDeductionAmount(String totalDeductionAmount) {
        this.totalDeductionAmount = totalDeductionAmount;
    }
}
