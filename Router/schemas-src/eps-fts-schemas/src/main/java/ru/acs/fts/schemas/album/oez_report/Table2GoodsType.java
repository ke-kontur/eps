
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * Таблица 2. Товар, помещённый под таможенный режим свободной таможенной зоны, который участвует в производстве продукции (содействует производственному процессу) и полностью или частично потребляется в процессе использования
 */
public class Table2GoodsType extends GoodsWithoutStatusBaseType
{
    private String residentsGoodsQuantity;
    private Table2CustomsDocumentType customsDocument;
    private List<Table2GoodsFlowType> inList = new ArrayList<Table2GoodsFlowType>();
    private List<Table2GoodsFlowType> usedList = new ArrayList<Table2GoodsFlowType>();
    private List<Table2GoodsFlowType> outList = new ArrayList<Table2GoodsFlowType>();

    /** 
     * Get the 'ResidentsGoodsQuantity' element value. Товары находящиеся у резидента ОЭЗ в отношении которых осуществляется хранение(складирование) на территории ОЭЗ
     * 
     * @return value
     */
    public String getResidentsGoodsQuantity() {
        return residentsGoodsQuantity;
    }

    /** 
     * Set the 'ResidentsGoodsQuantity' element value. Товары находящиеся у резидента ОЭЗ в отношении которых осуществляется хранение(складирование) на территории ОЭЗ
     * 
     * @param residentsGoodsQuantity
     */
    public void setResidentsGoodsQuantity(String residentsGoodsQuantity) {
        this.residentsGoodsQuantity = residentsGoodsQuantity;
    }

    /** 
     * Get the 'CustomsDocument' element value. Таможенный документ. Номер ДТ. Также реквизиты таможенного документа, на основании которого осуществляется таможенное оформление, когда в отношении таких товаров произошло отчуждение
     * 
     * @return value
     */
    public Table2CustomsDocumentType getCustomsDocument() {
        return customsDocument;
    }

    /** 
     * Set the 'CustomsDocument' element value. Таможенный документ. Номер ДТ. Также реквизиты таможенного документа, на основании которого осуществляется таможенное оформление, когда в отношении таких товаров произошло отчуждение
     * 
     * @param customsDocument
     */
    public void setCustomsDocument(Table2CustomsDocumentType customsDocument) {
        this.customsDocument = customsDocument;
    }

    /** 
     * Get the list of 'In' element items. Товары, поступившие в организацию
     * 
     * @return list
     */
    public List<Table2GoodsFlowType> getInList() {
        return inList;
    }

    /** 
     * Set the list of 'In' element items. Товары, поступившие в организацию
     * 
     * @param list
     */
    public void setInList(List<Table2GoodsFlowType> list) {
        inList = list;
    }

    /** 
     * Get the list of 'Used' element items. Товары, переданные в производство и фактически израсходованные
     * 
     * @return list
     */
    public List<Table2GoodsFlowType> getUsedList() {
        return usedList;
    }

    /** 
     * Set the list of 'Used' element items. Товары, переданные в производство и фактически израсходованные
     * 
     * @param list
     */
    public void setUsedList(List<Table2GoodsFlowType> list) {
        usedList = list;
    }

    /** 
     * Get the list of 'Out' element items. Товары, которые выбыли (проданы, списаны)
     * 
     * @return list
     */
    public List<Table2GoodsFlowType> getOutList() {
        return outList;
    }

    /** 
     * Set the list of 'Out' element items. Товары, которые выбыли (проданы, списаны)
     * 
     * @param list
     */
    public void setOutList(List<Table2GoodsFlowType> list) {
        outList = list;
    }
}
