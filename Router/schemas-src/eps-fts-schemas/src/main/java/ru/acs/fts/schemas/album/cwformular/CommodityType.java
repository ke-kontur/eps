
package ru.acs.fts.schemas.album.cwformular;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GoodsBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHSuppQuantityType;

/** 
 * ���������� � ������
 */
public class CommodityType extends GoodsBaseType
{
    private String goodsNumberInStorageQuitance;
    private String goodsNumberInGTD;
    private String countryCode;
    private String countryName;
    private LocalDate goodsShellLife;
    private String notes;
    private WHSuppQuantityType goodsValue;
    private WHSuppQuantityType goodsValue1;
    private WHSuppQuantityType goodsValue2;
    private List<CommodityOutType> commodityOutList = new ArrayList<CommodityOutType>();

    /** 
     * Get the 'GoodsNumberInStorageQuitance' element value. ���������� ����� ������ � ��������� ���������, �� ������� ����� ������� �� �����
     * 
     * @return value
     */
    public String getGoodsNumberInStorageQuitance() {
        return goodsNumberInStorageQuitance;
    }

    /** 
     * Set the 'GoodsNumberInStorageQuitance' element value. ���������� ����� ������ � ��������� ���������, �� ������� ����� ������� �� �����
     * 
     * @param goodsNumberInStorageQuitance
     */
    public void setGoodsNumberInStorageQuitance(
            String goodsNumberInStorageQuitance) {
        this.goodsNumberInStorageQuitance = goodsNumberInStorageQuitance;
    }

    /** 
     * Get the 'GoodsNumberInGTD' element value. ���������� ����� ������ � ��, �� ������� ����� ������� �� �����
     * 
     * @return value
     */
    public String getGoodsNumberInGTD() {
        return goodsNumberInGTD;
    }

    /** 
     * Set the 'GoodsNumberInGTD' element value. ���������� ����� ������ � ��, �� ������� ����� ������� �� �����
     * 
     * @param goodsNumberInGTD
     */
    public void setGoodsNumberInGTD(String goodsNumberInGTD) {
        this.goodsNumberInGTD = goodsNumberInGTD;
    }

    /** 
     * Get the 'CountryCode' element value. ��� ������ ������������� ������
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. ��� ������ ������������� ������
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'CountryName' element value. ������������ ������ ������������� ������
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. ������������ ������ ������������� ������
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /** 
     * Get the 'GoodsShellLife' element value. ���� �������� ������ �� ������
     * 
     * @return value
     */
    public LocalDate getGoodsShellLife() {
        return goodsShellLife;
    }

    /** 
     * Set the 'GoodsShellLife' element value. ���� �������� ������ �� ������
     * 
     * @param goodsShellLife
     */
    public void setGoodsShellLife(LocalDate goodsShellLife) {
        this.goodsShellLife = goodsShellLife;
    }

    /** 
     * Get the 'Notes' element value. ����������
     * 
     * @return value
     */
    public String getNotes() {
        return notes;
    }

    /** 
     * Set the 'Notes' element value. ����������
     * 
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /** 
     * Get the 'GoodsValue' element value. ���������� ������ � �������������� ������� ���������
     * 
     * @return value
     */
    public WHSuppQuantityType getGoodsValue() {
        return goodsValue;
    }

    /** 
     * Set the 'GoodsValue' element value. ���������� ������ � �������������� ������� ���������
     * 
     * @param goodsValue
     */
    public void setGoodsValue(WHSuppQuantityType goodsValue) {
        this.goodsValue = goodsValue;
    }

    /** 
     * Get the 'GoodsValue1' element value. ���������� ������ � ���������� ������� ���������
     * 
     * @return value
     */
    public WHSuppQuantityType getGoodsValue1() {
        return goodsValue1;
    }

    /** 
     * Set the 'GoodsValue1' element value. ���������� ������ � ���������� ������� ���������
     * 
     * @param goodsValue1
     */
    public void setGoodsValue1(WHSuppQuantityType goodsValue1) {
        this.goodsValue1 = goodsValue1;
    }

    /** 
     * Get the 'GoodsValue2' element value. ���������� ������ � ���������� ������� ���������
     * 
     * @return value
     */
    public WHSuppQuantityType getGoodsValue2() {
        return goodsValue2;
    }

    /** 
     * Set the 'GoodsValue2' element value. ���������� ������ � ���������� ������� ���������
     * 
     * @param goodsValue2
     */
    public void setGoodsValue2(WHSuppQuantityType goodsValue2) {
        this.goodsValue2 = goodsValue2;
    }

    /** 
     * Get the list of 'CommodityOut' element items. ���������� � ������� ������
     * 
     * @return list
     */
    public List<CommodityOutType> getCommodityOutList() {
        return commodityOutList;
    }

    /** 
     * Set the list of 'CommodityOut' element items. ���������� � ������� ������
     * 
     * @param list
     */
    public void setCommodityOutList(List<CommodityOutType> list) {
        commodityOutList = list;
    }
}
