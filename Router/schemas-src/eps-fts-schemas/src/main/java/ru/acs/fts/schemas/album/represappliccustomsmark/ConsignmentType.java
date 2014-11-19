
package ru.acs.fts.schemas.album.represappliccustomsmark;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о партии
 */
public class ConsignmentType
{
    private String listNumeric;
    private DocumentBaseType individualWayBill;
    private String decision;
    private LocalDate decisionDate;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private CustomsDutiesType customsDuties;
    private DocumentBaseType TPOInfo;

    /** 
     * Get the 'ListNumeric' element value. Номер партии товаров по порядку
     * 
     * @return value
     */
    public String getListNumeric() {
        return listNumeric;
    }

    /** 
     * Set the 'ListNumeric' element value. Номер партии товаров по порядку
     * 
     * @param listNumeric
     */
    public void setListNumeric(String listNumeric) {
        this.listNumeric = listNumeric;
    }

    /** 
     * Get the 'IndividualWayBill' element value. Сведения об индивидуальной накладной
     * 
     * @return value
     */
    public DocumentBaseType getIndividualWayBill() {
        return individualWayBill;
    }

    /** 
     * Set the 'IndividualWayBill' element value. Сведения об индивидуальной накладной
     * 
     * @param individualWayBill
     */
    public void setIndividualWayBill(DocumentBaseType individualWayBill) {
        this.individualWayBill = individualWayBill;
    }

    /** 
     * Get the 'Decision' element value. Принятое решение: 1 - отказ в выпуске товаров (требуется уплата таможенных платежей), 2 - выпуск товаров без уплаты таможенных платежей, 3 - выпуск товаров с уплатой таможенных платежей, 4 - отказ в выпуске товаров, 5 - выпуск возвращаемых товаров.
     * 
     * @return value
     */
    public String getDecision() {
        return decision;
    }

    /** 
     * Set the 'Decision' element value. Принятое решение: 1 - отказ в выпуске товаров (требуется уплата таможенных платежей), 2 - выпуск товаров без уплаты таможенных платежей, 3 - выпуск товаров с уплатой таможенных платежей, 4 - отказ в выпуске товаров, 5 - выпуск возвращаемых товаров.
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
     * Get the 'CustomsDuties' element value. Таможенные платежи, подлежащие уплате
     * 
     * @return value
     */
    public CustomsDutiesType getCustomsDuties() {
        return customsDuties;
    }

    /** 
     * Set the 'CustomsDuties' element value. Таможенные платежи, подлежащие уплате
     * 
     * @param customsDuties
     */
    public void setCustomsDuties(CustomsDutiesType customsDuties) {
        this.customsDuties = customsDuties;
    }

    /** 
     * Get the 'TPOInfo' element value. Сведения о ТПО
     * 
     * @return value
     */
    public DocumentBaseType getTPOInfo() {
        return TPOInfo;
    }

    /** 
     * Set the 'TPOInfo' element value. Сведения о ТПО
     * 
     * @param TPOInfo
     */
    public void setTPOInfo(DocumentBaseType TPOInfo) {
        this.TPOInfo = TPOInfo;
    }
}
