
package ru.acs.fts.schemas.album.previousrequestinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Информация о наличии ранее поступивших запросов от таможенных органов о размещении товаров на СВХ
 */
public class PreviousRequestInfoType extends BaseDocType
{
    private String previousRequestSign;
    private List<PreviousRequestsType> previousRequestList = new ArrayList<PreviousRequestsType>();
    private String documentModeID;

    /** 
     * Get the 'PreviousRequestSign' element value. Признак наличия предыдущих запросов о размещении товаров на СВХ
     * 
     * @return value
     */
    public String getPreviousRequestSign() {
        return previousRequestSign;
    }

    /** 
     * Set the 'PreviousRequestSign' element value. Признак наличия предыдущих запросов о размещении товаров на СВХ
     * 
     * @param previousRequestSign
     */
    public void setPreviousRequestSign(String previousRequestSign) {
        this.previousRequestSign = previousRequestSign;
    }

    /** 
     * Get the list of 'PreviousRequests' element items. Сведения о ранее поступивших запросах
     * 
     * @return list
     */
    public List<PreviousRequestsType> getPreviousRequestList() {
        return previousRequestList;
    }

    /** 
     * Set the list of 'PreviousRequests' element items. Сведения о ранее поступивших запросах
     * 
     * @param list
     */
    public void setPreviousRequestList(List<PreviousRequestsType> list) {
        previousRequestList = list;
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
