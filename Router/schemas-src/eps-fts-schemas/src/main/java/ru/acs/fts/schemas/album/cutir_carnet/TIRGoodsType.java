
package ru.acs.fts.schemas.album.cutir_carnet;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust.TRPackingInfoType;

/** 
 * ������ � ������ ���
 */
public class TIRGoodsType
{
    private String goodsNumeric;
    private String goodsTNVEDCode;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String supplementaryGoodsQuantity;
    private String grossWeightQuantity;
    private String netWeightQuantity;
    private String supplementaryMeasureUnitCode;
    private String invoicedCost;
    private String invoicedCostCurrencyCode;
    private String documentKind;
    private String precedingDocumentNumber;
    private String TTNNumber;
    private String language;
    private List<TRPackingInfoType> placesInfoList = new ArrayList<TRPackingInfoType>();
    private List<TRPackingInfoType> packingInfoList = new ArrayList<TRPackingInfoType>();

    /** 
     * Get the 'GoodsNumeric' element value. ����� ������ �� ������
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ����� ������ �� ������
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
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
     * Get the list of 'GoodsDescription' element items. ������������ �����
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. ������������ �����
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. ���-�� ������ (� �������������� ������� ���������)
     * 
     * @return value
     */
    public String getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. ���-�� ������ (� �������������� ������� ���������)
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(String supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
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
     * Get the 'NetWeightQuantity' element value. ��� ������, ����� (��)
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. ��� ������, ����� (��)
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'SupplementaryMeasureUnitCode' element value. ��� �������������� ������� ���������
     * 
     * @return value
     */
    public String getSupplementaryMeasureUnitCode() {
        return supplementaryMeasureUnitCode;
    }

    /** 
     * Set the 'SupplementaryMeasureUnitCode' element value. ��� �������������� ������� ���������
     * 
     * @param supplementaryMeasureUnitCode
     */
    public void setSupplementaryMeasureUnitCode(
            String supplementaryMeasureUnitCode) {
        this.supplementaryMeasureUnitCode = supplementaryMeasureUnitCode;
    }

    /** 
     * Get the 'InvoicedCost' element value. ��������� ���������
     * 
     * @return value
     */
    public String getInvoicedCost() {
        return invoicedCost;
    }

    /** 
     * Set the 'InvoicedCost' element value. ��������� ���������
     * 
     * @param invoicedCost
     */
    public void setInvoicedCost(String invoicedCost) {
        this.invoicedCost = invoicedCost;
    }

    /** 
     * Get the 'InvoicedCostCurrencyCode' element value. ��������� ��� ������ ��������� ��������� � ������������ � ��������������� �����
     * 
     * @return value
     */
    public String getInvoicedCostCurrencyCode() {
        return invoicedCostCurrencyCode;
    }

    /** 
     * Set the 'InvoicedCostCurrencyCode' element value. ��������� ��� ������ ��������� ��������� � ������������ � ��������������� �����
     * 
     * @param invoicedCostCurrencyCode
     */
    public void setInvoicedCostCurrencyCode(String invoicedCostCurrencyCode) {
        this.invoicedCostCurrencyCode = invoicedCostCurrencyCode;
    }

    /** 
     * Get the 'DocumentKind' element value. ��� ���������
     * 
     * @return value
     */
    public String getDocumentKind() {
        return documentKind;
    }

    /** 
     * Set the 'DocumentKind' element value. ��� ���������
     * 
     * @param documentKind
     */
    public void setDocumentKind(String documentKind) {
        this.documentKind = documentKind;
    }

    /** 
     * Get the 'PrecedingDocumentNumber' element value. ����� ��������������� ���������
     * 
     * @return value
     */
    public String getPrecedingDocumentNumber() {
        return precedingDocumentNumber;
    }

    /** 
     * Set the 'PrecedingDocumentNumber' element value. ����� ��������������� ���������
     * 
     * @param precedingDocumentNumber
     */
    public void setPrecedingDocumentNumber(String precedingDocumentNumber) {
        this.precedingDocumentNumber = precedingDocumentNumber;
    }

    /** 
     * Get the 'TTNNumber' element value. ����� �������-������������ ���������
     * 
     * @return value
     */
    public String getTTNNumber() {
        return TTNNumber;
    }

    /** 
     * Set the 'TTNNumber' element value. ����� �������-������������ ���������
     * 
     * @param TTNNumber
     */
    public void setTTNNumber(String TTNNumber) {
        this.TTNNumber = TTNNumber;
    }

    /** 
     * Get the 'Language' element value. ��� ����� �������� ������
     * 
     * @return value
     */
    public String getLanguage() {
        return language;
    }

    /** 
     * Set the 'Language' element value. ��� ����� �������� ������
     * 
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /** 
     * Get the list of 'PlacesInfo' element items. �������� � �������� ������
     * 
     * @return list
     */
    public List<TRPackingInfoType> getPlacesInfoList() {
        return placesInfoList;
    }

    /** 
     * Set the list of 'PlacesInfo' element items. �������� � �������� ������
     * 
     * @param list
     */
    public void setPlacesInfoList(List<TRPackingInfoType> list) {
        placesInfoList = list;
    }

    /** 
     * Get the list of 'PackingInfo' element items. �������� �� �������� ������
     * 
     * @return list
     */
    public List<TRPackingInfoType> getPackingInfoList() {
        return packingInfoList;
    }

    /** 
     * Set the list of 'PackingInfo' element items. �������� �� �������� ������
     * 
     * @param list
     */
    public void setPackingInfoList(List<TRPackingInfoType> list) {
        packingInfoList = list;
    }
}
