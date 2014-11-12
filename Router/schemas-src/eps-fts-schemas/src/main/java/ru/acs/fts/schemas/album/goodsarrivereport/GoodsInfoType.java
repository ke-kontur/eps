
package ru.acs.fts.schemas.album.goodsarrivereport;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о товарах
 */
public class GoodsInfoType
{
    private String GTDGoodsNumber;
    private String goodsTNVEDCode;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String valuePresence;
    private List<String> noteList = new ArrayList<String>();
    private List<TransportDocumentsType> transportDocumentList = new ArrayList<TransportDocumentsType>();

    /** 
     * Get the 'GTDGoodsNumber' element value. Номер товара в ДТ
     * 
     * @return value
     */
    public String getGTDGoodsNumber() {
        return GTDGoodsNumber;
    }

    /** 
     * Set the 'GTDGoodsNumber' element value. Номер товара в ДТ
     * 
     * @param GTDGoodsNumber
     */
    public void setGTDGoodsNumber(String GTDGoodsNumber) {
        this.GTDGoodsNumber = GTDGoodsNumber;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. Код ТН ВЭД ТС
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. Код ТН ВЭД ТС
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. Описание товара
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Описание товара
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'ValuePresence' element value. Признак присутствия товара на СВХ (присутствует/отсутствует)
     * 
     * @return value
     */
    public String getValuePresence() {
        return valuePresence;
    }

    /** 
     * Set the 'ValuePresence' element value. Признак присутствия товара на СВХ (присутствует/отсутствует)
     * 
     * @param valuePresence
     */
    public void setValuePresence(String valuePresence) {
        this.valuePresence = valuePresence;
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
     * Get the list of 'TransportDocuments' element items. Сведения о транспортных документах
     * 
     * @return list
     */
    public List<TransportDocumentsType> getTransportDocumentList() {
        return transportDocumentList;
    }

    /** 
     * Set the list of 'TransportDocuments' element items. Сведения о транспортных документах
     * 
     * @param list
     */
    public void setTransportDocumentList(List<TransportDocumentsType> list) {
        transportDocumentList = list;
    }
}
