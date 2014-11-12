
package ru.acs.fts.schemas.album.custpaymentsdk;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� �����
 */
public class GoodsType
{
    private String goodsNumeric;
    private List<PaymentCalculationType> paymentCalculationList = new ArrayList<PaymentCalculationType>();
    private CustomsMarcType customsMark;

    /** 
     * Get the 'GoodsNumeric' element value. ����� ������ �� ��������� / ������ / ����� ������ �� �� ( ��� ���, ���)
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ����� ������ �� ��������� / ������ / ����� ������ �� �� ( ��� ���, ���)
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the list of 'PaymentCalculation' element items. ���������� ��������
     * 
     * @return list
     */
    public List<PaymentCalculationType> getPaymentCalculationList() {
        return paymentCalculationList;
    }

    /** 
     * Set the list of 'PaymentCalculation' element items. ���������� ��������
     * 
     * @param list
     */
    public void setPaymentCalculationList(List<PaymentCalculationType> list) {
        paymentCalculationList = list;
    }

    /** 
     * Get the 'CustomsMark' element value. ���������� �����
     * 
     * @return value
     */
    public CustomsMarcType getCustomsMark() {
        return customsMark;
    }

    /** 
     * Set the 'CustomsMark' element value. ���������� �����
     * 
     * @param customsMark
     */
    public void setCustomsMark(CustomsMarcType customsMark) {
        this.customsMark = customsMark;
    }
}
