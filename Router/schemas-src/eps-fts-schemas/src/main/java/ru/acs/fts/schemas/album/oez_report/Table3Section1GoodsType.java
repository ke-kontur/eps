
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * Таблица 3. Раздел 1. Товар, помещённый под таможенный режим свободной таможенной зоны для целей переработки
 */
public class Table3Section1GoodsType extends GoodsBaseType
{
    private String quantity;
    private List<String> OEZGoodsNameList = new ArrayList<String>();
    private List<String> noteList = new ArrayList<String>();
    private String nonProcessingGoodsTail;
    private Table2CustomsDocumentType customsDocument;

    /** 
     * Get the 'Quantity' element value. Количество товара
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество товара
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the list of 'OEZGoodsName' element items. Наименование товаров, изготовленых на территории ОЭЗ
     * 
     * @return list
     */
    public List<String> getOEZGoodsNameList() {
        return OEZGoodsNameList;
    }

    /** 
     * Set the list of 'OEZGoodsName' element items. Наименование товаров, изготовленых на территории ОЭЗ
     * 
     * @param list
     */
    public void setOEZGoodsNameList(List<String> list) {
        OEZGoodsNameList = list;
    }

    /** 
     * Get the list of 'Note' element items. Примечание
     * 
     * @return list
     */
    public List<String> getNoteList() {
        return noteList;
    }

    /** 
     * Set the list of 'Note' element items. Примечание
     * 
     * @param list
     */
    public void setNoteList(List<String> list) {
        noteList = list;
    }

    /** 
     * Get the 'NonProcessingGoodsTail' element value. Остаток товаров, в отношении которых не совершены операции по переработке, находящихся у резидента оэз на отчетную дату(количество)
     * 
     * @return value
     */
    public String getNonProcessingGoodsTail() {
        return nonProcessingGoodsTail;
    }

    /** 
     * Set the 'NonProcessingGoodsTail' element value. Остаток товаров, в отношении которых не совершены операции по переработке, находящихся у резидента оэз на отчетную дату(количество)
     * 
     * @param nonProcessingGoodsTail
     */
    public void setNonProcessingGoodsTail(String nonProcessingGoodsTail) {
        this.nonProcessingGoodsTail = nonProcessingGoodsTail;
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
}
