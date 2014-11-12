
package ru.acs.fts.schemas.album.sem_oisrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.BaseServiceRequestType;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.GoodsType;

/** 
 * Запрос по наличию объектов интеллектуальной собственности
 */
public class SEMOISRequestType extends BaseServiceRequestType
{
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private String documentModeID;

    /** 
     * Get the list of 'Goods' element items. Информация о товарах
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Информация о товарах
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
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
