
package ru.acs.fts.schemas.album.represappliccustomsmark;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Сведения о партии
 */
public class ConsignmentType
{
    private String decision;
    private LocalDate decisionDate;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private List<WayBillType> wayBillList = new ArrayList<WayBillType>();

    /** 
     * Get the 'Decision' element value. Принятое решение: 1 - выпуск с уплатой таможенных платежей; 2 - выпуск с освобождением от уплаты таможенных платежей; 3 - отказ в выпуске; 4 - требование на предоставление в бумажном виде
     * 
     * @return value
     */
    public String getDecision() {
        return decision;
    }

    /** 
     * Set the 'Decision' element value. Принятое решение: 1 - выпуск с уплатой таможенных платежей; 2 - выпуск с освобождением от уплаты таможенных платежей; 3 - отказ в выпуске; 4 - требование на предоставление в бумажном виде
     * 
     * @param decision
     */
    public void setDecision(String decision) {
        this.decision = decision;
    }

    /** 
     * Get the 'DecisionDate' element value. Дата принятия решения
     * 
     * @return value
     */
    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    /** 
     * Set the 'DecisionDate' element value. Дата принятия решения
     * 
     * @param decisionDate
     */
    public void setDecisionDate(LocalDate decisionDate) {
        this.decisionDate = decisionDate;
    }

    /** 
     * Get the list of 'Goods' element items. Сведения о товарах
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Сведения о товарах
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the list of 'WayBill' element items. Сведения о накладной
     * 
     * @return list
     */
    public List<WayBillType> getWayBillList() {
        return wayBillList;
    }

    /** 
     * Set the list of 'WayBill' element items. Сведения о накладной
     * 
     * @param list
     */
    public void setWayBillList(List<WayBillType> list) {
        wayBillList = list;
    }
}
