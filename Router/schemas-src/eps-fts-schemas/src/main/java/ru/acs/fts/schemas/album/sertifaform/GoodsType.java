
package ru.acs.fts.schemas.album.sertifaform;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.sertifcommonleaftypescust.OriginCriterionCodeType;

/** 
 * �������� � �������
 */
public class GoodsType
{
    private String goodsNumeric;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodsQuantity;
    private String supplementaryGoodsQuantity;
    private String measureUnitQualifierCode;
    private String supplementaryMeasureUnitQualifierCode;
    private String goodsPlacesQuantity;
    private String placesQuantity;
    private String placesDescription;
    private String marking;
    private String grossWeightQuantity;
    private OriginCriterionCodeType originCriterionCode;
    private String percentPart;
    private List<DocumentBaseType> goodsInvoiceList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the 'GoodsNumeric' element value. ���������� ����� ������ �������������
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ���������� ����� ������ �������������
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. �������� ������ ��������� (������������ ������������ ������, ��� ������, �����, �����������, �������, ������ ������, ����������� �������� ����������� ������������� ������ � ���������� ��� ����� ����������� ����������)
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. �������� ������ ��������� (������������ ������������ ������, ��� ������, �����, �����������, �������, ������ ������, ����������� �������� ����������� ������������� ������ � ���������� ��� ����� ����������� ����������)
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GoodsQuantity' element value. ���������� ������ ��� �������� ������� ��������� 
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. ���������� ������ ��� �������� ������� ��������� 
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. ���������� ������ ��� ����� ������� ��������� � �������������� �������� ���������
     * 
     * @return value
     */
    public String getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. ���������� ������ ��� ����� ������� ��������� � �������������� �������� ���������
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(String supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }

    /** 
     * Get the 'MeasureUnitQualifierCode' element value. �������� ������� ��������� ������
     * 
     * @return value
     */
    public String getMeasureUnitQualifierCode() {
        return measureUnitQualifierCode;
    }

    /** 
     * Set the 'MeasureUnitQualifierCode' element value. �������� ������� ��������� ������
     * 
     * @param measureUnitQualifierCode
     */
    public void setMeasureUnitQualifierCode(String measureUnitQualifierCode) {
        this.measureUnitQualifierCode = measureUnitQualifierCode;
    }

    /** 
     * Get the 'SupplementaryMeasureUnitQualifierCode' element value. �������� �������������� ������� ��������� ������
     * 
     * @return value
     */
    public String getSupplementaryMeasureUnitQualifierCode() {
        return supplementaryMeasureUnitQualifierCode;
    }

    /** 
     * Set the 'SupplementaryMeasureUnitQualifierCode' element value. �������� �������������� ������� ��������� ������
     * 
     * @param supplementaryMeasureUnitQualifierCode
     */
    public void setSupplementaryMeasureUnitQualifierCode(
            String supplementaryMeasureUnitQualifierCode) {
        this.supplementaryMeasureUnitQualifierCode = supplementaryMeasureUnitQualifierCode;
    }

    /** 
     * Get the 'GoodsPlacesQuantity' element value. ���������� ���� ������
     * 
     * @return value
     */
    public String getGoodsPlacesQuantity() {
        return goodsPlacesQuantity;
    }

    /** 
     * Set the 'GoodsPlacesQuantity' element value. ���������� ���� ������
     * 
     * @param goodsPlacesQuantity
     */
    public void setGoodsPlacesQuantity(String goodsPlacesQuantity) {
        this.goodsPlacesQuantity = goodsPlacesQuantity;
    }

    /** 
     * Get the 'PlacesQuantity' element value. ����� ���������� �������� ���� ������
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. ����� ���������� �������� ���� ������
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'PlacesDescription' element value. �������� ���� �������� ���� (�������, ��������, ������ � �.�.)
     * 
     * @return value
     */
    public String getPlacesDescription() {
        return placesDescription;
    }

    /** 
     * Set the 'PlacesDescription' element value. �������� ���� �������� ���� (�������, ��������, ������ � �.�.)
     * 
     * @param placesDescription
     */
    public void setPlacesDescription(String placesDescription) {
        this.placesDescription = placesDescription;
    }

    /** 
     * Get the 'Marking' element value. ���������� �������� ����
     * 
     * @return value
     */
    public String getMarking() {
        return marking;
    }

    /** 
     * Set the 'Marking' element value. ���������� �������� ����
     * 
     * @param marking
     */
    public void setMarking(String marking) {
        this.marking = marking;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ��� ������, ������ (��)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ��� ������, ������ (��)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'OriginCriterionCode' element value. �������� ������������� ������
     * 
     * @return value
     */
    public OriginCriterionCodeType getOriginCriterionCode() {
        return originCriterionCode;
    }

    /** 
     * Set the 'OriginCriterionCode' element value. �������� ������������� ������
     * 
     * @param originCriterionCode
     */
    public void setOriginCriterionCode(
            OriginCriterionCodeType originCriterionCode) {
        this.originCriterionCode = originCriterionCode;
    }

    /** 
     * Get the 'PercentPart' element value. ���������� ���� ��������� �������� ����������, �������������� ��� ������� �������, ������������ �� ������ ������ ��� ������������ �������������, �������������� ��� ������������ ������, � ��������� ��������������� ������, ������������ �� ���� ���� ������-����� ������������
     * 
     * @return value
     */
    public String getPercentPart() {
        return percentPart;
    }

    /** 
     * Set the 'PercentPart' element value. ���������� ���� ��������� �������� ����������, �������������� ��� ������� �������, ������������ �� ������ ������ ��� ������������ �������������, �������������� ��� ������������ ������, � ��������� ��������������� ������, ������������ �� ���� ���� ������-����� ������������
     * 
     * @param percentPart
     */
    public void setPercentPart(String percentPart) {
        this.percentPart = percentPart;
    }

    /** 
     * Get the list of 'GoodsInvoice' element items. ����� � ���� �����-������� (�������) ��� �����-�������� �� �������
     * 
     * @return list
     */
    public List<DocumentBaseType> getGoodsInvoiceList() {
        return goodsInvoiceList;
    }

    /** 
     * Set the list of 'GoodsInvoice' element items. ����� � ���� �����-������� (�������) ��� �����-�������� �� �������
     * 
     * @param list
     */
    public void setGoodsInvoiceList(List<DocumentBaseType> list) {
        goodsInvoiceList = list;
    }
}
