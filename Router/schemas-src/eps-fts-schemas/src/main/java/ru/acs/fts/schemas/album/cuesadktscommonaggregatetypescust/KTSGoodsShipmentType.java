
package ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust;

/** 
 * КТС. Общие сведения о товарной партии
 */
public class KTSGoodsShipmentType
{
    private String totalGoodsNumber;
    private String totalSheetNumber;
    private String totalCustomsAmount;
    private String previousTotalCustomsAmount;
    private String debtReturnSumm;

    /** 
     * Get the 'TotalGoodsNumber' element value. Общее количество товаров КТС. гр. 5
     * 
     * @return value
     */
    public String getTotalGoodsNumber() {
        return totalGoodsNumber;
    }

    /** 
     * Set the 'TotalGoodsNumber' element value. Общее количество товаров КТС. гр. 5
     * 
     * @param totalGoodsNumber
     */
    public void setTotalGoodsNumber(String totalGoodsNumber) {
        this.totalGoodsNumber = totalGoodsNumber;
    }

    /** 
     * Get the 'TotalSheetNumber' element value. Общее количество комплектов КТС-1 и КТС-2. гр 3
     * 
     * @return value
     */
    public String getTotalSheetNumber() {
        return totalSheetNumber;
    }

    /** 
     * Set the 'TotalSheetNumber' element value. Общее количество комплектов КТС-1 и КТС-2. гр 3
     * 
     * @param totalSheetNumber
     */
    public void setTotalSheetNumber(String totalSheetNumber) {
        this.totalSheetNumber = totalSheetNumber;
    }

    /** 
     * Get the 'TotalCustomsAmount' element value. Сведения о стоимости/общая таможенная стоимость.гр 12 левый подраздел
     * 
     * @return value
     */
    public String getTotalCustomsAmount() {
        return totalCustomsAmount;
    }

    /** 
     * Set the 'TotalCustomsAmount' element value. Сведения о стоимости/общая таможенная стоимость.гр 12 левый подраздел
     * 
     * @param totalCustomsAmount
     */
    public void setTotalCustomsAmount(String totalCustomsAmount) {
        this.totalCustomsAmount = totalCustomsAmount;
    }

    /** 
     * Get the 'PreviousTotalCustomsAmount' element value. Предыдущее значение  общей таможенной стоимости
     * 
     * @return value
     */
    public String getPreviousTotalCustomsAmount() {
        return previousTotalCustomsAmount;
    }

    /** 
     * Set the 'PreviousTotalCustomsAmount' element value. Предыдущее значение  общей таможенной стоимости
     * 
     * @param previousTotalCustomsAmount
     */
    public void setPreviousTotalCustomsAmount(String previousTotalCustomsAmount) {
        this.previousTotalCustomsAmount = previousTotalCustomsAmount;
    }

    /** 
     * Get the 'DebtReturnSumm' element value. Общая сумма, подлежащая возврату (взысканию)
     * 
     * @return value
     */
    public String getDebtReturnSumm() {
        return debtReturnSumm;
    }

    /** 
     * Set the 'DebtReturnSumm' element value. Общая сумма, подлежащая возврату (взысканию)
     * 
     * @param debtReturnSumm
     */
    public void setDebtReturnSumm(String debtReturnSumm) {
        this.debtReturnSumm = debtReturnSumm;
    }
}
