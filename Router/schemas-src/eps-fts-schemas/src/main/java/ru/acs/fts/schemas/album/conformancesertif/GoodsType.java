
package ru.acs.fts.schemas.album.conformancesertif;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ���������
 */
public class GoodsType extends AppendsType
{
    private String productCode;
    private String goodsTNVEDCode;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String seriesSign;
    private List<String> normDocList = new ArrayList<String>();
    private String partySize;
    private List<String> serialNumberList = new ArrayList<String>();
    private List<DocumentBaseType> shippingDocumentList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the 'ProductCode' element value. ��� ��������� �� ��005 - ��������������� �������������� ���������
     * 
     * @return value
     */
    public String getProductCode() {
        return productCode;
    }

    /** 
     * Set the 'ProductCode' element value. ��� ��������� �� ��005 - ��������������� �������������� ���������
     * 
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
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
     * Get the list of 'GoodsDescription' element items. �������� ������ ��������� (������������, ���, ���, ����� ���������, ����������� ���������, ����������� ������� ��� ����� ���������, �� �������� ��� ����������� (��� ��������� ��������� ������ �� �������� �������������. ��� ������ � ���������� ������� �������� ����� � ������ ������ ��� ����� �������, ����� � ���� ������ ���������, �������� (���������), ��������� � �������� � �.�.)
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. �������� ������ ��������� (������������, ���, ���, ����� ���������, ����������� ���������, ����������� ������� ��� ����� ���������, �� �������� ��� ����������� (��� ��������� ��������� ������ �� �������� �������������. ��� ������ � ���������� ������� �������� ����� � ������ ������ ��� ����� �������, ����� � ���� ������ ���������, �������� (���������), ��������� � �������� � �.�.)
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'SeriesSign' element value. �������: 1 - "��������� �������", 2 - "������", 3 - "�������� ������"
     * 
     * @return value
     */
    public String getSeriesSign() {
        return seriesSign;
    }

    /** 
     * Set the 'SeriesSign' element value. �������: 1 - "��������� �������", 2 - "������", 3 - "�������� ������"
     * 
     * @param seriesSign
     */
    public void setSeriesSign(String seriesSign) {
        this.seriesSign = seriesSign;
    }

    /** 
     * Get the list of 'NormDocs' element items. ����������� ����������, �� ��������� ������� ����������� ���������
     * 
     * @return list
     */
    public List<String> getNormDocList() {
        return normDocList;
    }

    /** 
     * Set the list of 'NormDocs' element items. ����������� ����������, �� ��������� ������� ����������� ���������
     * 
     * @param list
     */
    public void setNormDocList(List<String> list) {
        normDocList = list;
    }

    /** 
     * Get the 'PartySize' element value. ������ ������
     * 
     * @return value
     */
    public String getPartySize() {
        return partySize;
    }

    /** 
     * Set the 'PartySize' element value. ������ ������
     * 
     * @param partySize
     */
    public void setPartySize(String partySize) {
        this.partySize = partySize;
    }

    /** 
     * Get the list of 'SerialNumber' element items. ��������� ����� �������
     * 
     * @return list
     */
    public List<String> getSerialNumberList() {
        return serialNumberList;
    }

    /** 
     * Set the list of 'SerialNumber' element items. ��������� ����� �������
     * 
     * @param list
     */
    public void setSerialNumberList(List<String> list) {
        serialNumberList = list;
    }

    /** 
     * Get the list of 'ShippingDocuments' element items. ���������������������� ���������
     * 
     * @return list
     */
    public List<DocumentBaseType> getShippingDocumentList() {
        return shippingDocumentList;
    }

    /** 
     * Set the list of 'ShippingDocuments' element items. ���������������������� ���������
     * 
     * @param list
     */
    public void setShippingDocumentList(List<DocumentBaseType> list) {
        shippingDocumentList = list;
    }
}
