
package ru.acs.fts.schemas.album.representativeapplication;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� � �������
 */
public class GoodsType
{
    private String goodsNumeric;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodsTNVEDCode;
    private String goodsCost;
    private String grossWeight;
    private String goodsCostEuro;
    private String goodsCostRuble;
    private List<SupplementaryQuantityType> goodsQuantityList = new ArrayList<SupplementaryQuantityType>();
    private List<PresentedDocumentsType> presentedDocumentList = new ArrayList<PresentedDocumentsType>();
    private CustomsDutiesType customsDuties;

    /** 
     * Get the 'GoodsNumeric' element value. ���������� ����� ������
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ���������� ����� ������
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. ������������ ������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. ������������ ������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� 
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� 
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'GoodsCost' element value. ��������� ������ � ������ ����� (������)
     * 
     * @return value
     */
    public String getGoodsCost() {
        return goodsCost;
    }

    /** 
     * Set the 'GoodsCost' element value. ��������� ������ � ������ ����� (������)
     * 
     * @param goodsCost
     */
    public void setGoodsCost(String goodsCost) {
        this.goodsCost = goodsCost;
    }

    /** 
     * Get the 'GrossWeight' element value. ��� ������, ������, ��
     * 
     * @return value
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. ��� ������, ������, ��
     * 
     * @param grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the 'GoodsCostEuro' element value. ��������� ������ � ����
     * 
     * @return value
     */
    public String getGoodsCostEuro() {
        return goodsCostEuro;
    }

    /** 
     * Set the 'GoodsCostEuro' element value. ��������� ������ � ����
     * 
     * @param goodsCostEuro
     */
    public void setGoodsCostEuro(String goodsCostEuro) {
        this.goodsCostEuro = goodsCostEuro;
    }

    /** 
     * Get the 'GoodsCostRuble' element value. ��������� ������ � ������
     * 
     * @return value
     */
    public String getGoodsCostRuble() {
        return goodsCostRuble;
    }

    /** 
     * Set the 'GoodsCostRuble' element value. ��������� ������ � ������
     * 
     * @param goodsCostRuble
     */
    public void setGoodsCostRuble(String goodsCostRuble) {
        this.goodsCostRuble = goodsCostRuble;
    }

    /** 
     * Get the list of 'GoodsQuantity' element items. ���������� ������ � �������� (��������������) ������� ���������
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getGoodsQuantityList() {
        return goodsQuantityList;
    }

    /** 
     * Set the list of 'GoodsQuantity' element items. ���������� ������ � �������� (��������������) ������� ���������
     * 
     * @param list
     */
    public void setGoodsQuantityList(List<SupplementaryQuantityType> list) {
        goodsQuantityList = list;
    }

    /** 
     * Get the list of 'PresentedDocuments' element items. �������� � �������������� ����������
     * 
     * @return list
     */
    public List<PresentedDocumentsType> getPresentedDocumentList() {
        return presentedDocumentList;
    }

    /** 
     * Set the list of 'PresentedDocuments' element items. �������� � �������������� ����������
     * 
     * @param list
     */
    public void setPresentedDocumentList(List<PresentedDocumentsType> list) {
        presentedDocumentList = list;
    }

    /** 
     * Get the 'CustomsDuties' element value. ���������� �������, ���������� ������
     * 
     * @return value
     */
    public CustomsDutiesType getCustomsDuties() {
        return customsDuties;
    }

    /** 
     * Set the 'CustomsDuties' element value. ���������� �������, ���������� ������
     * 
     * @param customsDuties
     */
    public void setCustomsDuties(CustomsDutiesType customsDuties) {
        this.customsDuties = customsDuties;
    }
}
