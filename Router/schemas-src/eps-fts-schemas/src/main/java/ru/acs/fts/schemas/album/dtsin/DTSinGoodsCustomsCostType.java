
package ru.acs.fts.schemas.album.dtsin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.AdditionalDataType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSCurrencyPaymentType;
import ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust.CustomsCostDecisionType;

/** 
 * ���������� ������ ���. ������ ���������� ��������� �� ������.
 */
public class DTSinGoodsCustomsCostType
{
    private String sheetNumber;
    private String sheetGoodsSerialNumber;
    private String methodNumberCode;
    private String baseMethodNumberCode;
    private String GTDGoodsNumber;
    private String goodsTNVEDCode;
    private String nationalDeclaredCustomsCost;
    private String dollarDeclaredCustomsCost;
    private String goodsAddTNVEDCode;
    private List<CustomsCostDecisionType> goodsCancelingDecisionList = new ArrayList<CustomsCostDecisionType>();
    private IntermediateCustomsCostDecisionType intermediateCustomsCostDecision;
    private CustomsCostDecisionType finalCustomsCostDecision;
    private CustomsCostCalculationType customsCostCalculation;
    private List<DTSCurrencyPaymentType> DTSinCurrencyPaymentList = new ArrayList<DTSCurrencyPaymentType>();
    private List<AdditionalDataType> additionalDataList = new ArrayList<AdditionalDataType>();

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
     * Get the 'SheetGoodsSerialNumber' element value. ���������� ����� ������ �� �����
     * 
     * @return value
     */
    public String getSheetGoodsSerialNumber() {
        return sheetGoodsSerialNumber;
    }

    /** 
     * Set the 'SheetGoodsSerialNumber' element value. ���������� ����� ������ �� �����
     * 
     * @param sheetGoodsSerialNumber
     */
    public void setSheetGoodsSerialNumber(String sheetGoodsSerialNumber) {
        this.sheetGoodsSerialNumber = sheetGoodsSerialNumber;
    }

    /** 
     * Get the 'MethodNumberCode' element value. ����� ������. (����������� � ������������ � ��������������� ������� ����������� ���������� ��������� �������, ���������� ��� ���������� ������, ���������� � �������� �������.)
     * 
     * @return value
     */
    public String getMethodNumberCode() {
        return methodNumberCode;
    }

    /** 
     * Set the 'MethodNumberCode' element value. ����� ������. (����������� � ������������ � ��������������� ������� ����������� ���������� ��������� �������, ���������� ��� ���������� ������, ���������� � �������� �������.)
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
     * Get the 'GoodsAddTNVEDCode' element value. ��� ������ �� �������������� �������������� ���������� ����������
     * 
     * @return value
     */
    public String getGoodsAddTNVEDCode() {
        return goodsAddTNVEDCode;
    }

    /** 
     * Set the 'GoodsAddTNVEDCode' element value. ��� ������ �� �������������� �������������� ���������� ����������
     * 
     * @param goodsAddTNVEDCode
     */
    public void setGoodsAddTNVEDCode(String goodsAddTNVEDCode) {
        this.goodsAddTNVEDCode = goodsAddTNVEDCode;
    }

    /** 
     * Get the list of 'GoodsCancelingDecision' element items. ������� �� ������������� ��� ������ ��� �� ������.
     * 
     * @return list
     */
    public List<CustomsCostDecisionType> getGoodsCancelingDecisionList() {
        return goodsCancelingDecisionList;
    }

    /** 
     * Set the list of 'GoodsCancelingDecision' element items. ������� �� ������������� ��� ������ ��� �� ������.
     * 
     * @param list
     */
    public void setGoodsCancelingDecisionList(List<CustomsCostDecisionType> list) {
        goodsCancelingDecisionList = list;
    }

    /** 
     * Get the 'IntermediateCustomsCostDecision' element value. �������� �������������� ������� �� ��.
     * 
     * @return value
     */
    public IntermediateCustomsCostDecisionType getIntermediateCustomsCostDecision() {
        return intermediateCustomsCostDecision;
    }

    /** 
     * Set the 'IntermediateCustomsCostDecision' element value. �������� �������������� ������� �� ��.
     * 
     * @param intermediateCustomsCostDecision
     */
    public void setIntermediateCustomsCostDecision(
            IntermediateCustomsCostDecisionType intermediateCustomsCostDecision) {
        this.intermediateCustomsCostDecision = intermediateCustomsCostDecision;
    }

    /** 
     * Get the 'FinalCustomsCostDecision' element value. �������� �������������� ������� �� ��.
     * 
     * @return value
     */
    public CustomsCostDecisionType getFinalCustomsCostDecision() {
        return finalCustomsCostDecision;
    }

    /** 
     * Set the 'FinalCustomsCostDecision' element value. �������� �������������� ������� �� ��.
     * 
     * @param finalCustomsCostDecision
     */
    public void setFinalCustomsCostDecision(
            CustomsCostDecisionType finalCustomsCostDecision) {
        this.finalCustomsCostDecision = finalCustomsCostDecision;
    }

    /** 
     * Get the 'CustomsCostCalculation' element value. ������ ���������� ���������
     * 
     * @return value
     */
    public CustomsCostCalculationType getCustomsCostCalculation() {
        return customsCostCalculation;
    }

    /** 
     * Set the 'CustomsCostCalculation' element value. ������ ���������� ���������
     * 
     * @param customsCostCalculation
     */
    public void setCustomsCostCalculation(
            CustomsCostCalculationType customsCostCalculation) {
        this.customsCostCalculation = customsCostCalculation;
    }

    /** 
     * Get the list of 'DTSinCurrencyPayment' element items. ����������  �� ����� ������ � ������.
     * 
     * @return list
     */
    public List<DTSCurrencyPaymentType> getDTSinCurrencyPaymentList() {
        return DTSinCurrencyPaymentList;
    }

    /** 
     * Set the list of 'DTSinCurrencyPayment' element items. ����������  �� ����� ������ � ������.
     * 
     * @param list
     */
    public void setDTSinCurrencyPaymentList(List<DTSCurrencyPaymentType> list) {
        DTSinCurrencyPaymentList = list;
    }

    /** 
     * Get the list of 'AdditionalData' element items. �������������� ����������, ��� ������� �� ������������� ����������� ���������.
     * 
     * @return list
     */
    public List<AdditionalDataType> getAdditionalDataList() {
        return additionalDataList;
    }

    /** 
     * Set the list of 'AdditionalData' element items. �������������� ����������, ��� ������� �� ������������� ����������� ���������.
     * 
     * @param list
     */
    public void setAdditionalDataList(List<AdditionalDataType> list) {
        additionalDataList = list;
    }
}
