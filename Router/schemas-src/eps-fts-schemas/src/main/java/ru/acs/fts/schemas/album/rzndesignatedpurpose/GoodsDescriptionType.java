
package ru.acs.fts.schemas.album.rzndesignatedpurpose;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� ������
 */
public class GoodsDescriptionType
{
    private List<String> goodsNameList = new ArrayList<String>();
    private String originCountry;
    private String manufacturer;
    private String goodsPurpose;
    private String modelMark;
    private SupplementaryQuantityType quantity;

    /** 
     * Get the list of 'GoodsName' element items. ������������ �������
     * 
     * @return list
     */
    public List<String> getGoodsNameList() {
        return goodsNameList;
    }

    /** 
     * Set the list of 'GoodsName' element items. ������������ �������
     * 
     * @param list
     */
    public void setGoodsNameList(List<String> list) {
        goodsNameList = list;
    }

    /** 
     * Get the 'OriginCountry' element value. ������ �������������
     * 
     * @return value
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /** 
     * Set the 'OriginCountry' element value. ������ �������������
     * 
     * @param originCountry
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    /** 
     * Get the 'Manufacturer' element value. �������������
     * 
     * @return value
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. �������������
     * 
     * @param manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /** 
     * Get the 'GoodsPurpose' element value. ������� ���������� ������
     * 
     * @return value
     */
    public String getGoodsPurpose() {
        return goodsPurpose;
    }

    /** 
     * Set the 'GoodsPurpose' element value. ������� ���������� ������
     * 
     * @param goodsPurpose
     */
    public void setGoodsPurpose(String goodsPurpose) {
        this.goodsPurpose = goodsPurpose;
    }

    /** 
     * Get the 'ModelMark' element value. ������ (�����) ������
     * 
     * @return value
     */
    public String getModelMark() {
        return modelMark;
    }

    /** 
     * Set the 'ModelMark' element value. ������ (�����) ������
     * 
     * @param modelMark
     */
    public void setModelMark(String modelMark) {
        this.modelMark = modelMark;
    }

    /** 
     * Get the 'Quantity' element value. ���������� ������
     * 
     * @return value
     */
    public SupplementaryQuantityType getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ���������� ������
     * 
     * @param quantity
     */
    public void setQuantity(SupplementaryQuantityType quantity) {
        this.quantity = quantity;
    }
}
