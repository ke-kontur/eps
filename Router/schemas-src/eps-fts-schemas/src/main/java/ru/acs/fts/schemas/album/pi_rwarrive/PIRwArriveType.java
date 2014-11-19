
package ru.acs.fts.schemas.album.pi_rwarrive;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Предварительное уведомление о прибытии товаров, перевозимых железнодорожным транспортом
 */
public class PIRwArriveType extends BaseDocType
{
    private String PIURN;
    private TrainType train;
    private List<GoodsShipmentType> goodsShipmentList = new ArrayList<GoodsShipmentType>();
    private String documentModeID;

    /** 
     * Get the 'PI_URN' element value. Уникальный идентификатор товарной партии. Формат - URN
     * 
     * @return value
     */
    public String getPIURN() {
        return PIURN;
    }

    /** 
     * Set the 'PI_URN' element value. Уникальный идентификатор товарной партии. Формат - URN
     * 
     * @param PIURN
     */
    public void setPIURN(String PIURN) {
        this.PIURN = PIURN;
    }

    /** 
     * Get the 'Train' element value. Транспорт (поезд)
     * 
     * @return value
     */
    public TrainType getTrain() {
        return train;
    }

    /** 
     * Set the 'Train' element value. Транспорт (поезд)
     * 
     * @param train
     */
    public void setTrain(TrainType train) {
        this.train = train;
    }

    /** 
     * Get the list of 'GoodsShipment' element items. Товарная партия
     * 
     * @return list
     */
    public List<GoodsShipmentType> getGoodsShipmentList() {
        return goodsShipmentList;
    }

    /** 
     * Set the list of 'GoodsShipment' element items. Товарная партия
     * 
     * @param list
     */
    public void setGoodsShipmentList(List<GoodsShipmentType> list) {
        goodsShipmentList = list;
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
