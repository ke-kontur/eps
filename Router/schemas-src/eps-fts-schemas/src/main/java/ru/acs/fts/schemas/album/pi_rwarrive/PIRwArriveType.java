
package ru.acs.fts.schemas.album.pi_rwarrive;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ��������������� ����������� � �������� �������, ����������� ��������������� �����������
 */
public class PIRwArriveType extends BaseDocType
{
    private String PIURN;
    private TrainType train;
    private List<GoodsShipmentType> goodsShipmentList = new ArrayList<GoodsShipmentType>();
    private String documentModeID;

    /** 
     * Get the 'PI_URN' element value. ���������� ������������� �������� ������. ������ - URN
     * 
     * @return value
     */
    public String getPIURN() {
        return PIURN;
    }

    /** 
     * Set the 'PI_URN' element value. ���������� ������������� �������� ������. ������ - URN
     * 
     * @param PIURN
     */
    public void setPIURN(String PIURN) {
        this.PIURN = PIURN;
    }

    /** 
     * Get the 'Train' element value. ��������� (�����)
     * 
     * @return value
     */
    public TrainType getTrain() {
        return train;
    }

    /** 
     * Set the 'Train' element value. ��������� (�����)
     * 
     * @param train
     */
    public void setTrain(TrainType train) {
        this.train = train;
    }

    /** 
     * Get the list of 'GoodsShipment' element items. �������� ������
     * 
     * @return list
     */
    public List<GoodsShipmentType> getGoodsShipmentList() {
        return goodsShipmentList;
    }

    /** 
     * Set the list of 'GoodsShipment' element items. �������� ������
     * 
     * @param list
     */
    public void setGoodsShipmentList(List<GoodsShipmentType> list) {
        goodsShipmentList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
