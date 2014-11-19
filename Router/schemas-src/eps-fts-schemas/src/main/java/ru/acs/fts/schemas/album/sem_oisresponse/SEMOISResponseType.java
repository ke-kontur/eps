
package ru.acs.fts.schemas.album.sem_oisresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Объекты интеллектуальной собственности
 */
public class SEMOISResponseType extends BaseDocType
{
    private String status;
    private List<ResultOISGoodsType> goodList = new ArrayList<ResultOISGoodsType>();
    private String documentModeID;

    /** 
     * Get the 'Status' element value. Состояние отработки
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. Состояние отработки
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the list of 'Goods' element items. Информация о товарах
     * 
     * @return list
     */
    public List<ResultOISGoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Информация о товарах
     * 
     * @param list
     */
    public void setGoodList(List<ResultOISGoodsType> list) {
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
