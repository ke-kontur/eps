
package ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADGoodsItemType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsPackagingType;

/** 
 * ���. �������� � �������������� ������
 */
public class KTSGoodsItemType extends CUESADGoodsItemType
{
    private String goodsSerialNumber;
    private String adjustment1TypeCode;
    private String adjustment3TypeCode;
    private String additionalSheetNumber;
    private String sheetPartNumeric;
    private String previousCustomsCost;
    private String totalCorrectedCost;
    private String KTSKind;
    private Adjustment2TypeCodeType adjustment2TypeCode;
    private SupplementaryQuantityType supplementaryQuantity;
    private List<SupplementaryQuantityType> supplementaryQuantity1List = new ArrayList<SupplementaryQuantityType>();
    private ESADGoodsPackagingType KTSGoodsPackaging;
    private SupplementaryQuantityType RBSupplementaryGoodsQuantity;

    /** 
     * Get the 'GoodsSerialNumber' element value. ���������� ����� ������ � ��� ��� �� � ��
     * 
     * @return value
     */
    public String getGoodsSerialNumber() {
        return goodsSerialNumber;
    }

    /** 
     * Set the 'GoodsSerialNumber' element value. ���������� ����� ������ � ��� ��� �� � ��
     * 
     * @param goodsSerialNumber
     */
    public void setGoodsSerialNumber(String goodsSerialNumber) {
        this.goodsSerialNumber = goodsSerialNumber;
    }

    /** 
     * Get the 'Adjustment1TypeCode' element value. ��� ������������� - ���� 1
     * 
     * @return value
     */
    public String getAdjustment1TypeCode() {
        return adjustment1TypeCode;
    }

    /** 
     * Set the 'Adjustment1TypeCode' element value. ��� ������������� - ���� 1
     * 
     * @param adjustment1TypeCode
     */
    public void setAdjustment1TypeCode(String adjustment1TypeCode) {
        this.adjustment1TypeCode = adjustment1TypeCode;
    }

    /** 
     * Get the 'Adjustment3TypeCode' element value. ��� ������������� - ���� 3
     * 
     * @return value
     */
    public String getAdjustment3TypeCode() {
        return adjustment3TypeCode;
    }

    /** 
     * Set the 'Adjustment3TypeCode' element value. ��� ������������� - ���� 3
     * 
     * @param adjustment3TypeCode
     */
    public void setAdjustment3TypeCode(String adjustment3TypeCode) {
        this.adjustment3TypeCode = adjustment3TypeCode;
    }

    /** 
     * Get the 'AdditionalSheetNumber' element value. ���������� ����� ����������� �����
     * 
     * @return value
     */
    public String getAdditionalSheetNumber() {
        return additionalSheetNumber;
    }

    /** 
     * Set the 'AdditionalSheetNumber' element value. ���������� ����� ����������� �����
     * 
     * @param additionalSheetNumber
     */
    public void setAdditionalSheetNumber(String additionalSheetNumber) {
        this.additionalSheetNumber = additionalSheetNumber;
    }

    /** 
     * Get the 'SheetPartNumeric' element value. ����� ����� (1-2) ��� ��
     * 
     * @return value
     */
    public String getSheetPartNumeric() {
        return sheetPartNumeric;
    }

    /** 
     * Set the 'SheetPartNumeric' element value. ����� ����� (1-2) ��� ��
     * 
     * @param sheetPartNumeric
     */
    public void setSheetPartNumeric(String sheetPartNumeric) {
        this.sheetPartNumeric = sheetPartNumeric;
    }

    /** 
     * Get the 'PreviousCustomsCost' element value. ���������� �������� ���������� ���������.�� 45 ������ ���������
     * 
     * @return value
     */
    public String getPreviousCustomsCost() {
        return previousCustomsCost;
    }

    /** 
     * Set the 'PreviousCustomsCost' element value. ���������� �������� ���������� ���������.�� 45 ������ ���������
     * 
     * @param previousCustomsCost
     */
    public void setPreviousCustomsCost(String previousCustomsCost) {
        this.previousCustomsCost = previousCustomsCost;
    }

    /** 
     * Get the 'TotalCorrectedCost' element value. ����� ����� ��, ������. ���������/�������� �� ������
     * 
     * @return value
     */
    public String getTotalCorrectedCost() {
        return totalCorrectedCost;
    }

    /** 
     * Set the 'TotalCorrectedCost' element value. ����� ����� ��, ������. ���������/�������� �� ������
     * 
     * @param totalCorrectedCost
     */
    public void setTotalCorrectedCost(String totalCorrectedCost) {
        this.totalCorrectedCost = totalCorrectedCost;
    }

    /** 
     * Get the 'KTSKind' element value. ��� ��� (1-2) ��� ��
     * 
     * @return value
     */
    public String getKTSKind() {
        return KTSKind;
    }

    /** 
     * Set the 'KTSKind' element value. ��� ��� (1-2) ��� ��
     * 
     * @param KTSKind
     */
    public void setKTSKind(String KTSKind) {
        this.KTSKind = KTSKind;
    }

    /** 
     * Get the 'Adjustment2TypeCode' element value. ��� ������������� - ���� 2
     * 
     * @return value
     */
    public Adjustment2TypeCodeType getAdjustment2TypeCode() {
        return adjustment2TypeCode;
    }

    /** 
     * Set the 'Adjustment2TypeCode' element value. ��� ������������� - ���� 2
     * 
     * @param adjustment2TypeCode
     */
    public void setAdjustment2TypeCode(
            Adjustment2TypeCodeType adjustment2TypeCode) {
        this.adjustment2TypeCode = adjustment2TypeCode;
    }

    /** 
     * Get the 'SupplementaryQuantity' element value. ���������� � �������������� ������� ���������. ����������� ������ ����������.�� 41
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value. ���������� � �������������� ������� ���������. ����������� ������ ����������.�� 41
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
    }

    /** 
     * Get the list of 'SupplementaryQuantity1' element items. ���������� � �������������� ������� ���������, �������� �� �������� � �������������� (1,2) ����������� ������ ����������.�� 31 ������� 1
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getSupplementaryQuantity1List() {
        return supplementaryQuantity1List;
    }

    /** 
     * Set the list of 'SupplementaryQuantity1' element items. ���������� � �������������� ������� ���������, �������� �� �������� � �������������� (1,2) ����������� ������ ����������.�� 31 ������� 1
     * 
     * @param list
     */
    public void setSupplementaryQuantity1List(
            List<SupplementaryQuantityType> list) {
        supplementaryQuantity1List = list;
    }

    /** 
     * Get the 'KTSGoodsPackaging' element value. �������� � �������� ������, �������� � �������� �������
     * 
     * @return value
     */
    public ESADGoodsPackagingType getKTSGoodsPackaging() {
        return KTSGoodsPackaging;
    }

    /** 
     * Set the 'KTSGoodsPackaging' element value. �������� � �������� ������, �������� � �������� �������
     * 
     * @param KTSGoodsPackaging
     */
    public void setKTSGoodsPackaging(ESADGoodsPackagingType KTSGoodsPackaging) {
        this.KTSGoodsPackaging = KTSGoodsPackaging;
    }

    /** 
     * Get the 'RBSupplementaryGoodsQuantity' element value. ���������� ������ ����������� ��� ��������� ����������� � ��������� ���������� ���� ��� ��
     * 
     * @return value
     */
    public SupplementaryQuantityType getRBSupplementaryGoodsQuantity() {
        return RBSupplementaryGoodsQuantity;
    }

    /** 
     * Set the 'RBSupplementaryGoodsQuantity' element value. ���������� ������ ����������� ��� ��������� ����������� � ��������� ���������� ���� ��� ��
     * 
     * @param RBSupplementaryGoodsQuantity
     */
    public void setRBSupplementaryGoodsQuantity(
            SupplementaryQuantityType RBSupplementaryGoodsQuantity) {
        this.RBSupplementaryGoodsQuantity = RBSupplementaryGoodsQuantity;
    }
}
