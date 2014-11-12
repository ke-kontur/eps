
package ru.acs.fts.schemas.album.reqgoodsarrive;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � �������
 */
public class GoodsInfoType
{
    private String GTDGoodsNumber;
    private String goodsTNVEDCode;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private List<TransportDocumentsType> transportDocumentList = new ArrayList<TransportDocumentsType>();

    /** 
     * Get the 'GTDGoodsNumber' element value. ����� ������ � ��
     * 
     * @return value
     */
    public String getGTDGoodsNumber() {
        return GTDGoodsNumber;
    }

    /** 
     * Set the 'GTDGoodsNumber' element value. ����� ������ � ��
     * 
     * @param GTDGoodsNumber
     */
    public void setGTDGoodsNumber(String GTDGoodsNumber) {
        this.GTDGoodsNumber = GTDGoodsNumber;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. ��� �� ��� ��
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. ��� �� ��� ��
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. �������� ������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. �������� ������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the list of 'TransportDocuments' element items. �������� � ������������ ����������
     * 
     * @return list
     */
    public List<TransportDocumentsType> getTransportDocumentList() {
        return transportDocumentList;
    }

    /** 
     * Set the list of 'TransportDocuments' element items. �������� � ������������ ����������
     * 
     * @param list
     */
    public void setTransportDocumentList(List<TransportDocumentsType> list) {
        transportDocumentList = list;
    }
}
