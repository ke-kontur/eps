
package ru.acs.fts.schemas.album.applicationstore;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * ������ ������ �������
 */
public class StrListGoodsType
{
    private String nameGoods;
    private String numberGoods;
    private String priceUnit;
    private String totalCostGoods;
    private String currency;
    private String unitName;
    private String unitCode;
    private String goodsNomenclatureCode;
    private String customsCostGoods;
    private String norm;
    private String additionalInfo;
    private SupplementaryQuantityType supplementaryQuantity;
    private List<SupplementaryQuantityType> supplementaryQuantity1List = new ArrayList<SupplementaryQuantityType>();

    /** 
     * Get the 'NameGoods' element value. ������������ ��������
     * 
     * @return value
     */
    public String getNameGoods() {
        return nameGoods;
    }

    /** 
     * Set the 'NameGoods' element value. ������������ ��������
     * 
     * @param nameGoods
     */
    public void setNameGoods(String nameGoods) {
        this.nameGoods = nameGoods;
    }

    /** 
     * Get the 'NumberGoods' element value. ���������� ��������
     * 
     * @return value
     */
    public String getNumberGoods() {
        return numberGoods;
    }

    /** 
     * Set the 'NumberGoods' element value. ���������� ��������
     * 
     * @param numberGoods
     */
    public void setNumberGoods(String numberGoods) {
        this.numberGoods = numberGoods;
    }

    /** 
     * Get the 'PriceUnit' element value. ��������� �� ������� ������
     * 
     * @return value
     */
    public String getPriceUnit() {
        return priceUnit;
    }

    /** 
     * Set the 'PriceUnit' element value. ��������� �� ������� ������
     * 
     * @param priceUnit
     */
    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }

    /** 
     * Get the 'TotalCostGoods' element value. ��������� ������.
     * 
     * @return value
     */
    public String getTotalCostGoods() {
        return totalCostGoods;
    }

    /** 
     * Set the 'TotalCostGoods' element value. ��������� ������.
     * 
     * @param totalCostGoods
     */
    public void setTotalCostGoods(String totalCostGoods) {
        this.totalCostGoods = totalCostGoods;
    }

    /** 
     * Get the 'Currency' element value. ������ 
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. ������ 
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'UnitName' element value. ������������ ������� ���������
     * 
     * @return value
     */
    public String getUnitName() {
        return unitName;
    }

    /** 
     * Set the 'UnitName' element value. ������������ ������� ���������
     * 
     * @param unitName
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /** 
     * Get the 'UnitCode' element value. ��� ������� ���������
     * 
     * @return value
     */
    public String getUnitCode() {
        return unitCode;
    }

    /** 
     * Set the 'UnitCode' element value. ��� ������� ���������
     * 
     * @param unitCode
     */
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    /** 
     * Get the 'GoodsNomenclatureCode' element value. ��� �� ��� ��
     * 
     * @return value
     */
    public String getGoodsNomenclatureCode() {
        return goodsNomenclatureCode;
    }

    /** 
     * Set the 'GoodsNomenclatureCode' element value. ��� �� ��� ��
     * 
     * @param goodsNomenclatureCode
     */
    public void setGoodsNomenclatureCode(String goodsNomenclatureCode) {
        this.goodsNomenclatureCode = goodsNomenclatureCode;
    }

    /** 
     * Get the 'CustomsCostGoods' element value. ���������� ��������� ������
     * 
     * @return value
     */
    public String getCustomsCostGoods() {
        return customsCostGoods;
    }

    /** 
     * Set the 'CustomsCostGoods' element value. ���������� ��������� ������
     * 
     * @param customsCostGoods
     */
    public void setCustomsCostGoods(String customsCostGoods) {
        this.customsCostGoods = customsCostGoods;
    }

    /** 
     * Get the 'Norm' element value. ����� ��������
     * 
     * @return value
     */
    public String getNorm() {
        return norm;
    }

    /** 
     * Set the 'Norm' element value. ����� ��������
     * 
     * @param norm
     */
    public void setNorm(String norm) {
        this.norm = norm;
    }

    /** 
     * Get the 'AdditionalInfo' element value. �������������� ��������
     * 
     * @return value
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /** 
     * Set the 'AdditionalInfo' element value. �������������� ��������
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
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
     * Get the list of 'SupplementaryQuantity1' element items. ���������� ������ � ������� ���������, �������� �� �������� � ��������������
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getSupplementaryQuantity1List() {
        return supplementaryQuantity1List;
    }

    /** 
     * Set the list of 'SupplementaryQuantity1' element items. ���������� ������ � ������� ���������, �������� �� �������� � ��������������
     * 
     * @param list
     */
    public void setSupplementaryQuantity1List(
            List<SupplementaryQuantityType> list) {
        supplementaryQuantity1List = list;
    }
}
