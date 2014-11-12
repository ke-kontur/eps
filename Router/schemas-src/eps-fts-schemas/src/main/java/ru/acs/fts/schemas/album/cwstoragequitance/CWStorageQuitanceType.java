
package ru.acs.fts.schemas.album.cwstoragequitance;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.CWDocType;

/** 
 * Складская квитанция
 */
public class CWStorageQuitanceType extends CWDocType
{
    private StorageQuitanceHeadType header;
    private List<CommodityType> commodityList = new ArrayList<CommodityType>();
    private String documentModeID;

    /** 
     * Get the 'Header' element value.
     * 
     * @return value
     */
    public StorageQuitanceHeadType getHeader() {
        return header;
    }

    /** 
     * Set the 'Header' element value.
     * 
     * @param header
     */
    public void setHeader(StorageQuitanceHeadType header) {
        this.header = header;
    }

    /** 
     * Get the list of 'Commodity' element items. Информация о товаре
     * 
     * @return list
     */
    public List<CommodityType> getCommodityList() {
        return commodityList;
    }

    /** 
     * Set the list of 'Commodity' element items. Информация о товаре
     * 
     * @param list
     */
    public void setCommodityList(List<CommodityType> list) {
        commodityList = list;
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
