
package ru.acs.fts.schemas.album.bdrd_request;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Запрашиваемые сведения
 */
public class RequestedDataType extends DocumentBaseType
{
    private String docCode;
    private String requestPositionID;
    private List<GoodsType> goodInfoList = new ArrayList<GoodsType>();

    /** 
     * Get the 'DocCode' element value. Код вида запрашиваемого документа
     * 
     * @return value
     */
    public String getDocCode() {
        return docCode;
    }

    /** 
     * Set the 'DocCode' element value. Код вида запрашиваемого документа
     * 
     * @param docCode
     */
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    /** 
     * Get the 'RequestPositionID' element value. Позиция РД в запросе
     * 
     * @return value
     */
    public String getRequestPositionID() {
        return requestPositionID;
    }

    /** 
     * Set the 'RequestPositionID' element value. Позиция РД в запросе
     * 
     * @param requestPositionID
     */
    public void setRequestPositionID(String requestPositionID) {
        this.requestPositionID = requestPositionID;
    }

    /** 
     * Get the list of 'GoodInfo' element items. Сведения о товаре
     * 
     * @return list
     */
    public List<GoodsType> getGoodInfoList() {
        return goodInfoList;
    }

    /** 
     * Set the list of 'GoodInfo' element items. Сведения о товаре
     * 
     * @param list
     */
    public void setGoodInfoList(List<GoodsType> list) {
        goodInfoList = list;
    }
}
