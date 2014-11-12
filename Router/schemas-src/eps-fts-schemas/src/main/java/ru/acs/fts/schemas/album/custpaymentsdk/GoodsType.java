
package ru.acs.fts.schemas.album.custpaymentsdk;

import java.util.ArrayList;
import java.util.List;

/** 
 * Добавочные листы
 */
public class GoodsType
{
    private String goodsNumeric;
    private List<PaymentCalculationType> paymentCalculationList = new ArrayList<PaymentCalculationType>();
    private CustomsMarcType customsMark;

    /** 
     * Get the 'GoodsNumeric' element value. Номер товара по документу / списку / номер товара по ДТ ( для КТС, ДТС)
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Номер товара по документу / списку / номер товара по ДТ ( для КТС, ДТС)
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the list of 'PaymentCalculation' element items. Исчисление платежей
     * 
     * @return list
     */
    public List<PaymentCalculationType> getPaymentCalculationList() {
        return paymentCalculationList;
    }

    /** 
     * Set the list of 'PaymentCalculation' element items. Исчисление платежей
     * 
     * @param list
     */
    public void setPaymentCalculationList(List<PaymentCalculationType> list) {
        paymentCalculationList = list;
    }

    /** 
     * Get the 'CustomsMark' element value. Добавочные листы
     * 
     * @return value
     */
    public CustomsMarcType getCustomsMark() {
        return customsMark;
    }

    /** 
     * Set the 'CustomsMark' element value. Добавочные листы
     * 
     * @param customsMark
     */
    public void setCustomsMark(CustomsMarcType customsMark) {
        this.customsMark = customsMark;
    }
}
