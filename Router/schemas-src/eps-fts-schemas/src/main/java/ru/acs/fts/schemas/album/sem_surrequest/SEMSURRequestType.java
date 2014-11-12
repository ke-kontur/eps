
package ru.acs.fts.schemas.album.sem_surrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.BaseServiceRequestType;

/** 
 * Запрос к сервису СУР
 */
public class SEMSURRequestType extends BaseServiceRequestType
{
    private List<String> presentedDocumentModeList = new ArrayList<String>();
    private List<GoodsDescriptionType> goodList = new ArrayList<GoodsDescriptionType>();
    private PlaceAndDateType placeAndDate;
    private String documentModeID;

    /** 
     * Get the list of 'PresentedDocumentMode' element items. Дополнительная информация/представленные документы гр.44
     * 
     * @return list
     */
    public List<String> getPresentedDocumentModeList() {
        return presentedDocumentModeList;
    }

    /** 
     * Set the list of 'PresentedDocumentMode' element items. Дополнительная информация/представленные документы гр.44
     * 
     * @param list
     */
    public void setPresentedDocumentModeList(List<String> list) {
        presentedDocumentModeList = list;
    }

    /** 
     * Get the list of 'Goods' element items. Информация о товарах и неформализованных индикаторах профиля риска
     * 
     * @return list
     */
    public List<GoodsDescriptionType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Информация о товарах и неформализованных индикаторах профиля риска
     * 
     * @param list
     */
    public void setGoodList(List<GoodsDescriptionType> list) {
        goodList = list;
    }

    /** 
     * Get the 'PlaceAndDate' element value. Графа 54 Место и дата
     * 
     * @return value
     */
    public PlaceAndDateType getPlaceAndDate() {
        return placeAndDate;
    }

    /** 
     * Set the 'PlaceAndDate' element value. Графа 54 Место и дата
     * 
     * @param placeAndDate
     */
    public void setPlaceAndDate(PlaceAndDateType placeAndDate) {
        this.placeAndDate = placeAndDate;
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
