
package ru.acs.fts.schemas.album.dtsout_cu;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.AdditionalDataType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSCUCustomsCostCalculationType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSCurrencyPaymentType;

/** 
 * ���������� ��������� �� ������
 */
public class GoodsCustomsCostType
{
    private String sheetNumber;
    private String goodsSerialNumberRB;
    private String sheetGoodsSerialNumber;
    private String GTDGoodsNumber;
    private String goodsTNVEDCode;
    private String nationalDeclaredCustomsCost;
    private String dollarDeclaredCustomsCost;
    private String goodsAddTNVEDCode;
    private String methodNumberCode;
    private String baseMethodNumberCode;
    private List<AdditionalDataType> additionalDataList = new ArrayList<AdditionalDataType>();
    private List<DTSCurrencyPaymentType> DTSCurrencyPaymentList = new ArrayList<DTSCurrencyPaymentType>();
    private DTSCUCustomsCostCalculationType DTSCUCustomsCostCalculation;

    /** 
     * Get the 'SheetNumber' element value. ����� �����
     * 
     * @return value
     */
    public String getSheetNumber() {
        return sheetNumber;
    }

    /** 
     * Set the 'SheetNumber' element value. ����� �����
     * 
     * @param sheetNumber
     */
    public void setSheetNumber(String sheetNumber) {
        this.sheetNumber = sheetNumber;
    }

    /** 
     * Get the 'GoodsSerialNumberRB' element value. ���������� ����� ������ � ��� ��� ��
     * 
     * @return value
     */
    public String getGoodsSerialNumberRB() {
        return goodsSerialNumberRB;
    }

    /** 
     * Set the 'GoodsSerialNumberRB' element value. ���������� ����� ������ � ��� ��� ��
     * 
     * @param goodsSerialNumberRB
     */
    public void setGoodsSerialNumberRB(String goodsSerialNumberRB) {
        this.goodsSerialNumberRB = goodsSerialNumberRB;
    }

    /** 
     * Get the 'SheetGoodsSerialNumber' element value. ���������� ����� ������ �� ����� ��� ��
     * 
     * @return value
     */
    public String getSheetGoodsSerialNumber() {
        return sheetGoodsSerialNumber;
    }

    /** 
     * Set the 'SheetGoodsSerialNumber' element value. ���������� ����� ������ �� ����� ��� ��
     * 
     * @param sheetGoodsSerialNumber
     */
    public void setSheetGoodsSerialNumber(String sheetGoodsSerialNumber) {
        this.sheetGoodsSerialNumber = sheetGoodsSerialNumber;
    }

    /** 
     * Get the 'GTDGoodsNumber' element value. ����� ������ �� ��/������ 
     * 
     * @return value
     */
    public String getGTDGoodsNumber() {
        return GTDGoodsNumber;
    }

    /** 
     * Set the 'GTDGoodsNumber' element value. ����� ������ �� ��/������ 
     * 
     * @param GTDGoodsNumber
     */
    public void setGTDGoodsNumber(String GTDGoodsNumber) {
        this.GTDGoodsNumber = GTDGoodsNumber;
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
     * Get the 'NationalDeclaredCustomsCost' element value. ���������� ���������� ��������� � ������������ ������ 
     * 
     * @return value
     */
    public String getNationalDeclaredCustomsCost() {
        return nationalDeclaredCustomsCost;
    }

    /** 
     * Set the 'NationalDeclaredCustomsCost' element value. ���������� ���������� ��������� � ������������ ������ 
     * 
     * @param nationalDeclaredCustomsCost
     */
    public void setNationalDeclaredCustomsCost(
            String nationalDeclaredCustomsCost) {
        this.nationalDeclaredCustomsCost = nationalDeclaredCustomsCost;
    }

    /** 
     * Get the 'DollarDeclaredCustomsCost' element value. ���������� ���������� ��������� � �������� ��� 
     * 
     * @return value
     */
    public String getDollarDeclaredCustomsCost() {
        return dollarDeclaredCustomsCost;
    }

    /** 
     * Set the 'DollarDeclaredCustomsCost' element value. ���������� ���������� ��������� � �������� ��� 
     * 
     * @param dollarDeclaredCustomsCost
     */
    public void setDollarDeclaredCustomsCost(String dollarDeclaredCustomsCost) {
        this.dollarDeclaredCustomsCost = dollarDeclaredCustomsCost;
    }

    /** 
     * Get the 'GoodsAddTNVEDCode' element value. ��� ������ �� �������������� �������������� ���������� ���������� ��� ��
     * 
     * @return value
     */
    public String getGoodsAddTNVEDCode() {
        return goodsAddTNVEDCode;
    }

    /** 
     * Set the 'GoodsAddTNVEDCode' element value. ��� ������ �� �������������� �������������� ���������� ���������� ��� ��
     * 
     * @param goodsAddTNVEDCode
     */
    public void setGoodsAddTNVEDCode(String goodsAddTNVEDCode) {
        this.goodsAddTNVEDCode = goodsAddTNVEDCode;
    }

    /** 
     * Get the 'MethodNumberCode' element value. ����� ������ (����������� � ������������ � ��������������� ������� ����������� ���������� ��������� �������, ���������� ��� ���������� ������, ���������� � �������� �������.)
     * 
     * @return value
     */
    public String getMethodNumberCode() {
        return methodNumberCode;
    }

    /** 
     * Set the 'MethodNumberCode' element value. ����� ������ (����������� � ������������ � ��������������� ������� ����������� ���������� ��������� �������, ���������� ��� ���������� ������, ���������� � �������� �������.)
     * 
     * @param methodNumberCode
     */
    public void setMethodNumberCode(String methodNumberCode) {
        this.methodNumberCode = methodNumberCode;
    }

    /** 
     * Get the 'BaseMethodNumberCode' element value. ����� �������� ������
     * 
     * @return value
     */
    public String getBaseMethodNumberCode() {
        return baseMethodNumberCode;
    }

    /** 
     * Set the 'BaseMethodNumberCode' element value. ����� �������� ������
     * 
     * @param baseMethodNumberCode
     */
    public void setBaseMethodNumberCode(String baseMethodNumberCode) {
        this.baseMethodNumberCode = baseMethodNumberCode;
    }

    /** 
     * Get the list of 'AdditionalData' element items. �������������� ���������� 
     * 
     * @return list
     */
    public List<AdditionalDataType> getAdditionalDataList() {
        return additionalDataList;
    }

    /** 
     * Set the list of 'AdditionalData' element items. �������������� ���������� 
     * 
     * @param list
     */
    public void setAdditionalDataList(List<AdditionalDataType> list) {
        additionalDataList = list;
    }

    /** 
     * Get the list of 'DTSCurrencyPayment' element items. ����������  �� ����� ������ � ������. ��. (*)
     * 
     * @return list
     */
    public List<DTSCurrencyPaymentType> getDTSCurrencyPaymentList() {
        return DTSCurrencyPaymentList;
    }

    /** 
     * Set the list of 'DTSCurrencyPayment' element items. ����������  �� ����� ������ � ������. ��. (*)
     * 
     * @param list
     */
    public void setDTSCurrencyPaymentList(List<DTSCurrencyPaymentType> list) {
        DTSCurrencyPaymentList = list;
    }

    /** 
     * Get the 'DTS_CUCustomsCostCalculation' element value. ������ ���������� ���������
     * 
     * @return value
     */
    public DTSCUCustomsCostCalculationType getDTSCUCustomsCostCalculation() {
        return DTSCUCustomsCostCalculation;
    }

    /** 
     * Set the 'DTS_CUCustomsCostCalculation' element value. ������ ���������� ���������
     * 
     * @param DTSCUCustomsCostCalculation
     */
    public void setDTSCUCustomsCostCalculation(
            DTSCUCustomsCostCalculationType DTSCUCustomsCostCalculation) {
        this.DTSCUCustomsCostCalculation = DTSCUCustomsCostCalculation;
    }
}
