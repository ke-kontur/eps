
package ru.acs.fts.schemas.album.reswhgoodsprolong;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Решение продления срока по каждому товару
 */
public class GoodsDecisionType
{
    private String goodsNumeric;
    private LocalDate reqPeriod;
    private List<String> reasonList = new ArrayList<String>();

    /** 
     * Get the 'GoodsNumeric' element value. Номер товара по ДО1
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Номер товара по ДО1
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'ReqPeriod' element value. Запрашиваемый срок
     * 
     * @return value
     */
    public LocalDate getReqPeriod() {
        return reqPeriod;
    }

    /** 
     * Set the 'ReqPeriod' element value. Запрашиваемый срок
     * 
     * @param reqPeriod
     */
    public void setReqPeriod(LocalDate reqPeriod) {
        this.reqPeriod = reqPeriod;
    }

    /** 
     * Get the list of 'Reason' element items. Обоснование
     * 
     * @return list
     */
    public List<String> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reason' element items. Обоснование
     * 
     * @param list
     */
    public void setReasonList(List<String> list) {
        reasonList = list;
    }
}
