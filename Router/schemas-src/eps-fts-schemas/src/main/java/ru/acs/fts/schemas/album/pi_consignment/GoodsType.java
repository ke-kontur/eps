
package ru.acs.fts.schemas.album.pi_consignment;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.GoodsPackagingType;

/** 
 * �������� � �������
 */
public class GoodsType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodMarking;
    private String goodsTNVEDCode;
    private String grossWeightQuantity;
    private String netWeightQuantity;
    private String totalCost;
    private List<DocumentsType> documentList = new ArrayList<DocumentsType>();
    private GoodsPackagingType goodsPackingInfo;

    /** 
     * Get the list of 'GoodsDescription' element items. ������������ ������ 
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. ������������ ������ 
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GoodMarking' element value. ������� (��� ������, ����� �� �������� �������������) 
     * 
     * @return value
     */
    public String getGoodMarking() {
        return goodMarking;
    }

    /** 
     * Set the 'GoodMarking' element value. ������� (��� ������, ����� �� �������� �������������) 
     * 
     * @param goodMarking
     */
    public void setGoodMarking(String goodMarking) {
        this.goodMarking = goodMarking;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ��� ������, ������ (��)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ��� ������, ������ (��)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. ��� ������, ����� (��)
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. ��� ������, ����� (��)
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'TotalCost' element value. ��������� ������� � ������������ � ������������� �����������
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. ��������� ������� � ������������ � ������������� �����������
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /** 
     * Get the list of 'Documents' element items. ���������
     * 
     * @return list
     */
    public List<DocumentsType> getDocumentList() {
        return documentList;
    }

    /** 
     * Set the list of 'Documents' element items. ���������
     * 
     * @param list
     */
    public void setDocumentList(List<DocumentsType> list) {
        documentList = list;
    }

    /** 
     * Get the 'GoodsPackingInfo' element value. �������� � �������� ������/�������� �������
     * 
     * @return value
     */
    public GoodsPackagingType getGoodsPackingInfo() {
        return goodsPackingInfo;
    }

    /** 
     * Set the 'GoodsPackingInfo' element value. �������� � �������� ������/�������� �������
     * 
     * @param goodsPackingInfo
     */
    public void setGoodsPackingInfo(GoodsPackagingType goodsPackingInfo) {
        this.goodsPackingInfo = goodsPackingInfo;
    }
}
