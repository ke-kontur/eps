
package ru.acs.fts.schemas.album.esadinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADContainerType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsPackagingType;

/** 
 * �������� � ������
 */
public class GoodsListType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodsTNVEDCode;
    private String grossWeightQuantity;
    private ESADGoodsPackagingType goodsPackaging;
    private SupplementaryQuantityType supplementaryQuantity;
    private ESADContainerType container;

    /** 
     * Get the list of 'GoodsDescription' element items. ������������ (��������, ������������ ��� ���� ������������ ������������) �������.
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. ������������ (��������, ������������ ��� ���� ������������ ������������) �������.
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��.
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��.
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ��� ������, ������ (��). 
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ��� ������, ������ (��). 
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'GoodsPackaging' element value. �������� � �������� ������, �������� � �������� �������.
     * 
     * @return value
     */
    public ESADGoodsPackagingType getGoodsPackaging() {
        return goodsPackaging;
    }

    /** 
     * Set the 'GoodsPackaging' element value. �������� � �������� ������, �������� � �������� �������.
     * 
     * @param goodsPackaging
     */
    public void setGoodsPackaging(ESADGoodsPackagingType goodsPackaging) {
        this.goodsPackaging = goodsPackaging;
    }

    /** 
     * Get the 'SupplementaryQuantity' element value. ���������� � �������������� ������� ���������
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value. ���������� � �������������� ������� ���������
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
    }

    /** 
     * Get the 'Container' element value. �������� � �����������.
     * 
     * @return value
     */
    public ESADContainerType getContainer() {
        return container;
    }

    /** 
     * Set the 'Container' element value. �������� � �����������.
     * 
     * @param container
     */
    public void setContainer(ESADContainerType container) {
        this.container = container;
    }
}
