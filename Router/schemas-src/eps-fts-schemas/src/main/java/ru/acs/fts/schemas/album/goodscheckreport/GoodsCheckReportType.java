
package ru.acs.fts.schemas.album.goodscheckreport;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Отчёт о результатах сверки
 */
public class GoodsCheckReportType extends BaseDocType
{
    private List<String> noteList = new ArrayList<String>();
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private List<GoodsCheckTableType> goodsCheckTableList = new ArrayList<GoodsCheckTableType>();
    private String documentModeID;

    /** 
     * Get the list of 'Note' element items. Примечание, комментарий
     * 
     * @return list
     */
    public List<String> getNoteList() {
        return noteList;
    }

    /** 
     * Set the list of 'Note' element items. Примечание, комментарий
     * 
     * @param list
     */
    public void setNoteList(List<String> list) {
        noteList = list;
    }

    /** 
     * Get the 'Customs' element value. Таможенный орган, проводивший сверку
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Таможенный орган, проводивший сверку
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо, проводившее сверку
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо, проводившее сверку
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the list of 'GoodsCheckTable' element items. Таблица сверки
     * 
     * @return list
     */
    public List<GoodsCheckTableType> getGoodsCheckTableList() {
        return goodsCheckTableList;
    }

    /** 
     * Set the list of 'GoodsCheckTable' element items. Таблица сверки
     * 
     * @param list
     */
    public void setGoodsCheckTableList(List<GoodsCheckTableType> list) {
        goodsCheckTableList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
