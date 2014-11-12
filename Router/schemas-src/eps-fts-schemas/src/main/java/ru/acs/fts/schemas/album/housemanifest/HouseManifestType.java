
package ru.acs.fts.schemas.album.housemanifest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Консолидированный манифест
 */
public class HouseManifestType extends BaseDocType
{
    private String linesNumberTotal;
    private String totalNumberOfPieces;
    private SupplementaryQuantityType totalGrossWeight;
    private HeaderType header;
    private List<ItemDetailsType> itemDetailList = new ArrayList<ItemDetailsType>();
    private String documentModeID;

    /** 
     * Get the 'LinesNumberTotal' element value. Общее количество наименований товаров
     * 
     * @return value
     */
    public String getLinesNumberTotal() {
        return linesNumberTotal;
    }

    /** 
     * Set the 'LinesNumberTotal' element value. Общее количество наименований товаров
     * 
     * @param linesNumberTotal
     */
    public void setLinesNumberTotal(String linesNumberTotal) {
        this.linesNumberTotal = linesNumberTotal;
    }

    /** 
     * Get the 'TotalNumberOfPieces' element value. Общее количество товаров
     * 
     * @return value
     */
    public String getTotalNumberOfPieces() {
        return totalNumberOfPieces;
    }

    /** 
     * Set the 'TotalNumberOfPieces' element value. Общее количество товаров
     * 
     * @param totalNumberOfPieces
     */
    public void setTotalNumberOfPieces(String totalNumberOfPieces) {
        this.totalNumberOfPieces = totalNumberOfPieces;
    }

    /** 
     * Get the 'TotalGrossWeight' element value. Общий вес товаров
     * 
     * @return value
     */
    public SupplementaryQuantityType getTotalGrossWeight() {
        return totalGrossWeight;
    }

    /** 
     * Set the 'TotalGrossWeight' element value. Общий вес товаров
     * 
     * @param totalGrossWeight
     */
    public void setTotalGrossWeight(SupplementaryQuantityType totalGrossWeight) {
        this.totalGrossWeight = totalGrossWeight;
    }

    /** 
     * Get the 'Header' element value. Заголовок документа
     * 
     * @return value
     */
    public HeaderType getHeader() {
        return header;
    }

    /** 
     * Set the 'Header' element value. Заголовок документа
     * 
     * @param header
     */
    public void setHeader(HeaderType header) {
        this.header = header;
    }

    /** 
     * Get the list of 'ItemDetails' element items. Описание товара
     * 
     * @return list
     */
    public List<ItemDetailsType> getItemDetailList() {
        return itemDetailList;
    }

    /** 
     * Set the list of 'ItemDetails' element items. Описание товара
     * 
     * @param list
     */
    public void setItemDetailList(List<ItemDetailsType> list) {
        itemDetailList = list;
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
