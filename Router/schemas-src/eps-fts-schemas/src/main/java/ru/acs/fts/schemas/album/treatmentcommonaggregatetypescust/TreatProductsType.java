
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ������ ��� �����������.
 */
public class TreatProductsType
{
    private List<String> nameList = new ArrayList<String>();
    private String TNVED;
    private String rubCost;
    private String quantityKg;
    private String addUnit;
    private String addQuantity;
    private String goodsQuantity;
    private String measureUnitQualifierName;
    private String measureUnitQualifierCode;
    private String customsCode;
    private TreatmentCurrencyCostType currencyCost;
    private List<DocumentBaseType> contractList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the list of 'Name' element items. ������������ �������
     * 
     * @return list
     */
    public List<String> getNameList() {
        return nameList;
    }

    /** 
     * Set the list of 'Name' element items. ������������ �������
     * 
     * @param list
     */
    public void setNameList(List<String> list) {
        nameList = list;
    }

    /** 
     * Get the 'TNVED' element value. ��� �� �� ��� ��
     * 
     * @return value
     */
    public String getTNVED() {
        return TNVED;
    }

    /** 
     * Set the 'TNVED' element value. ��� �� �� ��� ��
     * 
     * @param TNVED
     */
    public void setTNVED(String TNVED) {
        this.TNVED = TNVED;
    }

    /** 
     * Get the 'RubCost' element value. ���������, ���.
     * 
     * @return value
     */
    public String getRubCost() {
        return rubCost;
    }

    /** 
     * Set the 'RubCost' element value. ���������, ���.
     * 
     * @param rubCost
     */
    public void setRubCost(String rubCost) {
        this.rubCost = rubCost;
    }

    /** 
     * Get the 'QuantityKg' element value. ���������� � �� 
     * 
     * @return value
     */
    public String getQuantityKg() {
        return quantityKg;
    }

    /** 
     * Set the 'QuantityKg' element value. ���������� � �� 
     * 
     * @param quantityKg
     */
    public void setQuantityKg(String quantityKg) {
        this.quantityKg = quantityKg;
    }

    /** 
     * Get the 'AddUnit' element value. ��� �������������� ������������� ������� ��������� (980-��������; 981-�����; 982-����; 983-��������; 984-������; 985-��������)
     * 
     * @return value
     */
    public String getAddUnit() {
        return addUnit;
    }

    /** 
     * Set the 'AddUnit' element value. ��� �������������� ������������� ������� ��������� (980-��������; 981-�����; 982-����; 983-��������; 984-������; 985-��������)
     * 
     * @param addUnit
     */
    public void setAddUnit(String addUnit) {
        this.addUnit = addUnit;
    }

    /** 
     * Get the 'AddQuantity' element value. ���������� ������ � ������������� �������������� �������� ���������
     * 
     * @return value
     */
    public String getAddQuantity() {
        return addQuantity;
    }

    /** 
     * Set the 'AddQuantity' element value. ���������� ������ � ������������� �������������� �������� ���������
     * 
     * @param addQuantity
     */
    public void setAddQuantity(String addQuantity) {
        this.addQuantity = addQuantity;
    }

    /** 
     * Get the 'GoodsQuantity' element value. ���������� ������ � ������� ���������.
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. ���������� ������ � ������� ���������.
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'MeasureUnitQualifierName' element value. ������� ������������ ������� ���������.
     * 
     * @return value
     */
    public String getMeasureUnitQualifierName() {
        return measureUnitQualifierName;
    }

    /** 
     * Set the 'MeasureUnitQualifierName' element value. ������� ������������ ������� ���������.
     * 
     * @param measureUnitQualifierName
     */
    public void setMeasureUnitQualifierName(String measureUnitQualifierName) {
        this.measureUnitQualifierName = measureUnitQualifierName;
    }

    /** 
     * Get the 'MeasureUnitQualifierCode' element value. ��� ������� ��������� � ������������ � ��������� ���������, ������������ � ���������� ������ ���������� ���������..
     * 
     * @return value
     */
    public String getMeasureUnitQualifierCode() {
        return measureUnitQualifierCode;
    }

    /** 
     * Set the 'MeasureUnitQualifierCode' element value. ��� ������� ��������� � ������������ � ��������� ���������, ������������ � ���������� ������ ���������� ���������..
     * 
     * @param measureUnitQualifierCode
     */
    public void setMeasureUnitQualifierCode(String measureUnitQualifierCode) {
        this.measureUnitQualifierCode = measureUnitQualifierCode;
    }

    /** 
     * Get the 'CustomsCode' element value. ���  ����������� ������
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ���  ����������� ������
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'CurrencyCost' element value. �������� � ��������� � ������
     * 
     * @return value
     */
    public TreatmentCurrencyCostType getCurrencyCost() {
        return currencyCost;
    }

    /** 
     * Set the 'CurrencyCost' element value. �������� � ��������� � ������
     * 
     * @param currencyCost
     */
    public void setCurrencyCost(TreatmentCurrencyCostType currencyCost) {
        this.currencyCost = currencyCost;
    }

    /** 
     * Get the list of 'Contract' element items. �������� � ���������
     * 
     * @return list
     */
    public List<DocumentBaseType> getContractList() {
        return contractList;
    }

    /** 
     * Set the list of 'Contract' element items. �������� � ���������
     * 
     * @param list
     */
    public void setContractList(List<DocumentBaseType> list) {
        contractList = list;
    }
}
