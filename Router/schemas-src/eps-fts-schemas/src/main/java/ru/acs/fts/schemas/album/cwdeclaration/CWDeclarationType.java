
package ru.acs.fts.schemas.album.cwdeclaration;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.CWDocType;

/** 
 * Заявление на проведение операций над товарами 
 */
public class CWDeclarationType extends CWDocType
{
    private DeclarationHeaderType header;
    private List<CommodityType> commodityList = new ArrayList<CommodityType>();
    private String documentModeID;

    /** 
     * Get the 'Header' element value. Информация о реквизитах документа
     * 
     * @return value
     */
    public DeclarationHeaderType getHeader() {
        return header;
    }

    /** 
     * Set the 'Header' element value. Информация о реквизитах документа
     * 
     * @param header
     */
    public void setHeader(DeclarationHeaderType header) {
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
