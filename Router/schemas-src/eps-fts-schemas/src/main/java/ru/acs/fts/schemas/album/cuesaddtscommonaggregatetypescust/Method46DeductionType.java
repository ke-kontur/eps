
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

/** 
 * Вычеты сумм, которые вошли в раздел А гр. Б (12-16)
 */
public class Method46DeductionType
{
    private String agentCharge;
    private String unionTransportCharge;
    private String unionTaxPayment;
    private String processingAddedCost;
    private String totalDeductionAmount;

    /** 
     * Get the 'AgentCharge' element value. Вознаграждения посреднику (агенту) либо надбавки к цене, обычно производимых для получения прибыли и покрытия коммерческих и управленческих расходов гр 12
     * 
     * @return value
     */
    public String getAgentCharge() {
        return agentCharge;
    }

    /** 
     * Set the 'AgentCharge' element value. Вознаграждения посреднику (агенту) либо надбавки к цене, обычно производимых для получения прибыли и покрытия коммерческих и управленческих расходов гр 12
     * 
     * @param agentCharge
     */
    public void setAgentCharge(String agentCharge) {
        this.agentCharge = agentCharge;
    }

    /** 
     * Get the 'UnionTransportCharge' element value. Расходы на перевозку (транспортировку), страхование и иные связанные с такими операциями расходы, осуществленные на таможенной территории Таможенного союза. гр 13
     * 
     * @return value
     */
    public String getUnionTransportCharge() {
        return unionTransportCharge;
    }

    /** 
     * Set the 'UnionTransportCharge' element value. Расходы на перевозку (транспортировку), страхование и иные связанные с такими операциями расходы, осуществленные на таможенной территории Таможенного союза. гр 13
     * 
     * @param unionTransportCharge
     */
    public void setUnionTransportCharge(String unionTransportCharge) {
        this.unionTransportCharge = unionTransportCharge;
    }

    /** 
     * Get the 'UnionTaxPayment' element value. Таможенные пошлины, налоги, сборы, подлежащие уплате в связи с ввозом товаров на таможенную территорию Таможенного союза или с их продажей на территории государства - члена Таможенного союза, включая налоги и сборы субъектов государства - члена Таможенного союза и местные налоги и сборы. гр 14
     * 
     * @return value
     */
    public String getUnionTaxPayment() {
        return unionTaxPayment;
    }

    /** 
     * Set the 'UnionTaxPayment' element value. Таможенные пошлины, налоги, сборы, подлежащие уплате в связи с ввозом товаров на таможенную территорию Таможенного союза или с их продажей на территории государства - члена Таможенного союза, включая налоги и сборы субъектов государства - члена Таможенного союза и местные налоги и сборы. гр 14
     * 
     * @param unionTaxPayment
     */
    public void setUnionTaxPayment(String unionTaxPayment) {
        this.unionTaxPayment = unionTaxPayment;
    }

    /** 
     * Get the 'ProcessingAddedCost' element value. Стоимость, добавленная в результате переработки (обработки). гр 15
     * 
     * @return value
     */
    public String getProcessingAddedCost() {
        return processingAddedCost;
    }

    /** 
     * Set the 'ProcessingAddedCost' element value. Стоимость, добавленная в результате переработки (обработки). гр 15
     * 
     * @param processingAddedCost
     */
    public void setProcessingAddedCost(String processingAddedCost) {
        this.processingAddedCost = processingAddedCost;
    }

    /** 
     * Get the 'TotalDeductionAmount' element value. Итого Б в национальной валюте (по графам с 12 по 15)  гр 16
     * 
     * @return value
     */
    public String getTotalDeductionAmount() {
        return totalDeductionAmount;
    }

    /** 
     * Set the 'TotalDeductionAmount' element value. Итого Б в национальной валюте (по графам с 12 по 15)  гр 16
     * 
     * @param totalDeductionAmount
     */
    public void setTotalDeductionAmount(String totalDeductionAmount) {
        this.totalDeductionAmount = totalDeductionAmount;
    }
}
