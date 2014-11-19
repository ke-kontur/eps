
package ru.acs.fts.schemas.album.represapplicstatinfo;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * �������� � �������
 */
public class GoodsType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String grossWeight;
    private String goodsCostEuro;
    private LocalDate goodsDate;

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
     * Get the 'GrossWeight' element value. ��� ������, ������, ��
     * 
     * @return value
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. ��� ������, ������, ��
     * 
     * @param grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the 'GoodsCostEuro' element value. ��������� ������ � ����
     * 
     * @return value
     */
    public String getGoodsCostEuro() {
        return goodsCostEuro;
    }

    /** 
     * Set the 'GoodsCostEuro' element value. ��������� ������ � ����
     * 
     * @param goodsCostEuro
     */
    public void setGoodsCostEuro(String goodsCostEuro) {
        this.goodsCostEuro = goodsCostEuro;
    }

    /** 
     * Get the 'GoodsDate' element value. ���� �������� ������
     * 
     * @return value
     */
    public LocalDate getGoodsDate() {
        return goodsDate;
    }

    /** 
     * Set the 'GoodsDate' element value. ���� �������� ������
     * 
     * @param goodsDate
     */
    public void setGoodsDate(LocalDate goodsDate) {
        this.goodsDate = goodsDate;
    }
}
