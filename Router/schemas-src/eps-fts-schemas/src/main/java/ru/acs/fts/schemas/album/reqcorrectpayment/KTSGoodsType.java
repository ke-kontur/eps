
package ru.acs.fts.schemas.album.reqcorrectpayment;

import java.util.ArrayList;
import java.util.List;

/** 
 * Корректировка таможенной стоимости товаров
 */
public class KTSGoodsType
{
    private String numberGood;
    private List<String> rationaleList = new ArrayList<String>();

    /** 
     * Get the 'NumberGood' element value. Номер товара
     * 
     * @return value
     */
    public String getNumberGood() {
        return numberGood;
    }

    /** 
     * Set the 'NumberGood' element value. Номер товара
     * 
     * @param numberGood
     */
    public void setNumberGood(String numberGood) {
        this.numberGood = numberGood;
    }

    /** 
     * Get the list of 'Rationale' element items. Обоснование принятого решения
     * 
     * @return list
     */
    public List<String> getRationaleList() {
        return rationaleList;
    }

    /** 
     * Set the list of 'Rationale' element items. Обоснование принятого решения
     * 
     * @param list
     */
    public void setRationaleList(List<String> list) {
        rationaleList = list;
    }
}
