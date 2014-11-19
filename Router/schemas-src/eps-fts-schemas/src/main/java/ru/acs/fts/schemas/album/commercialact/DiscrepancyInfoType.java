
package ru.acs.fts.schemas.album.commercialact;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHShipmentInfoType;
import ru.acs.fts.schemas.album.warehousecommonleaftypescust.GoodMismatchStageType;

/** 
 * Сведения о выявленных несоответствиях
 */
public class DiscrepancyInfoType
{
    private GoodMismatchStageType stage;
    private LocalDate date;
    private String time;
    private List<String> reasonList = new ArrayList<String>();
    private String totalPackageNumber;
    private DiscrepancyDetailsType discrepancyDetails;
    private List<ActGoodsType> missingGoodList = new ArrayList<ActGoodsType>();
    private List<DiscrepantGoodsType> discrepantGoodList = new ArrayList<DiscrepantGoodsType>();
    private List<WHShipmentInfoType> extraGoodList = new ArrayList<WHShipmentInfoType>();

    /** 
     * Get the 'Stage' element value. Этап, на котором выявлены несоответствия
     * 
     * @return value
     */
    public GoodMismatchStageType getStage() {
        return stage;
    }

    /** 
     * Set the 'Stage' element value. Этап, на котором выявлены несоответствия
     * 
     * @param stage
     */
    public void setStage(GoodMismatchStageType stage) {
        this.stage = stage;
    }

    /** 
     * Get the 'Date' element value. Дата выявления несоответствия
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата выявления несоответствия
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Time' element value. Время выявления несоответствия
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' element value. Время выявления несоответствия
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** 
     * Get the list of 'Reasons' element items. Описание причин несоответствия и обстоятельств их выявления
     * 
     * @return list
     */
    public List<String> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reasons' element items. Описание причин несоответствия и обстоятельств их выявления
     * 
     * @param list
     */
    public void setReasonList(List<String> list) {
        reasonList = list;
    }

    /** 
     * Get the 'TotalPackageNumber' element value. Общее количество грузовых мест с учетом выявленных несоответствий
     * 
     * @return value
     */
    public String getTotalPackageNumber() {
        return totalPackageNumber;
    }

    /** 
     * Set the 'TotalPackageNumber' element value. Общее количество грузовых мест с учетом выявленных несоответствий
     * 
     * @param totalPackageNumber
     */
    public void setTotalPackageNumber(String totalPackageNumber) {
        this.totalPackageNumber = totalPackageNumber;
    }

    /** 
     * Get the 'DiscrepancyDetails' element value. Описание подробностей выявленных несоответствий
     * 
     * @return value
     */
    public DiscrepancyDetailsType getDiscrepancyDetails() {
        return discrepancyDetails;
    }

    /** 
     * Set the 'DiscrepancyDetails' element value. Описание подробностей выявленных несоответствий
     * 
     * @param discrepancyDetails
     */
    public void setDiscrepancyDetails(DiscrepancyDetailsType discrepancyDetails) {
        this.discrepancyDetails = discrepancyDetails;
    }

    /** 
     * Get the list of 'MissingGoods' element items. Описание товаров, которые были заявлены в документах, но оказались отсутствующими по факту
     * 
     * @return list
     */
    public List<ActGoodsType> getMissingGoodList() {
        return missingGoodList;
    }

    /** 
     * Set the list of 'MissingGoods' element items. Описание товаров, которые были заявлены в документах, но оказались отсутствующими по факту
     * 
     * @param list
     */
    public void setMissingGoodList(List<ActGoodsType> list) {
        missingGoodList = list;
    }

    /** 
     * Get the list of 'DiscrepantGoods' element items. Описание товаров, которые были заявлены в документах, присутствуют по факту, но отличаются по своим характеристикам от сведений, заявленных в товаросопроводительных документах
     * 
     * @return list
     */
    public List<DiscrepantGoodsType> getDiscrepantGoodList() {
        return discrepantGoodList;
    }

    /** 
     * Set the list of 'DiscrepantGoods' element items. Описание товаров, которые были заявлены в документах, присутствуют по факту, но отличаются по своим характеристикам от сведений, заявленных в товаросопроводительных документах
     * 
     * @param list
     */
    public void setDiscrepantGoodList(List<DiscrepantGoodsType> list) {
        discrepantGoodList = list;
    }

    /** 
     * Get the list of 'ExtraGoods' element items. Описание товаров, которые не были заявлены в документах, но оказались в грузе по факту. Сведения о выявленных товарах, контейнерах, в которых они находятся, заполняются в рамках товарных партий, идентифицируемых товаротранспортным документом (накладной). Нумерация товаров продолжается с номера, следующего за последним, использованном в указанном отчете о принятии
     * 
     * @return list
     */
    public List<WHShipmentInfoType> getExtraGoodList() {
        return extraGoodList;
    }

    /** 
     * Set the list of 'ExtraGoods' element items. Описание товаров, которые не были заявлены в документах, но оказались в грузе по факту. Сведения о выявленных товарах, контейнерах, в которых они находятся, заполняются в рамках товарных партий, идентифицируемых товаротранспортным документом (накладной). Нумерация товаров продолжается с номера, следующего за последним, использованном в указанном отчете о принятии
     * 
     * @param list
     */
    public void setExtraGoodList(List<WHShipmentInfoType> list) {
        extraGoodList = list;
    }
}
