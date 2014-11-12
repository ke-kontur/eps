
package ru.acs.fts.schemas.album.cwformular;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.CWDocType;

/** 
 * Формуляр контроля товаров 
 */
public class CWFormularType extends CWDocType
{
    private List<DocumentType> documentList = new ArrayList<DocumentType>();
    private List<CommodityType> commodityList = new ArrayList<CommodityType>();
    private FormularHeadType header;
    private String documentModeID;

    /** 
     * Get the list of 'Document' element items. Информация о представленных документах
     * 
     * @return list
     */
    public List<DocumentType> getDocumentList() {
        return documentList;
    }

    /** 
     * Set the list of 'Document' element items. Информация о представленных документах
     * 
     * @param list
     */
    public void setDocumentList(List<DocumentType> list) {
        documentList = list;
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
     * Get the 'Header' element value. Информация о реквизитах документа
     * 
     * @return value
     */
    public FormularHeadType getHeader() {
        return header;
    }

    /** 
     * Set the 'Header' element value. Информация о реквизитах документа
     * 
     * @param header
     */
    public void setHeader(FormularHeadType header) {
        this.header = header;
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
