
package ru.acs.fts.schemas.album.decisionclassgood;

/** 
 * Сведения о номере товара по ДТ и заявленном коде товара по ТН ВЭД ТС
 */
public class NumericTNVEDCodeType
{
    private String TNVEDCode;
    private String goodsNumeric;

    /** 
     * Get the 'TNVEDCode' element value. Код товара по ТН ВЭД ТС, заявленный в ДТ
     * 
     * @return value
     */
    public String getTNVEDCode() {
        return TNVEDCode;
    }

    /** 
     * Set the 'TNVEDCode' element value. Код товара по ТН ВЭД ТС, заявленный в ДТ
     * 
     * @param TNVEDCode
     */
    public void setTNVEDCode(String TNVEDCode) {
        this.TNVEDCode = TNVEDCode;
    }

    /** 
     * Get the 'GoodsNumeric' element value. Номер товара по ДТ
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Номер товара по ДТ
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }
}
