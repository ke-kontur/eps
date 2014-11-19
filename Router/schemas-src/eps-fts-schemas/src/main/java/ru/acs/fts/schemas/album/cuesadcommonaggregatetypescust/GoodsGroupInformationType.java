
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������������� ������� � ������
 */
public class GoodsGroupInformationType
{
    private String manufacturer;
    private String tradeMark;
    private String goodsMark;
    private String goodsModel;
    private String goodsMarking;
    private String goodsStandard;
    private String goodsSort;
    private String woodSortiment;
    private String woodKind;
    private String dimensions;
    private LocalDate dateIssue;
    private List<String> serialNumberList = new ArrayList<String>();
    private SupplementaryQuantityType goodsGroupQuantity;

    /** 
     * Get the 'Manufacturer' element value. �������� � �������������
     * 
     * @return value
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. �������� � �������������
     * 
     * @param manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /** 
     * Get the 'TradeMark' element value. ���. ����, ����� �������������, ������ ���������� �����, ������� ����, ������ � �.�.
     * 
     * @return value
     */
    public String getTradeMark() {
        return tradeMark;
    }

    /** 
     * Set the 'TradeMark' element value. ���. ����, ����� �������������, ������ ���������� �����, ������� ����, ������ � �.�.
     * 
     * @param tradeMark
     */
    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    /** 
     * Get the 'GoodsMark' element value. ����� ������
     * 
     * @return value
     */
    public String getGoodsMark() {
        return goodsMark;
    }

    /** 
     * Set the 'GoodsMark' element value. ����� ������
     * 
     * @param goodsMark
     */
    public void setGoodsMark(String goodsMark) {
        this.goodsMark = goodsMark;
    }

    /** 
     * Get the 'GoodsModel' element value. ������ ������
     * 
     * @return value
     */
    public String getGoodsModel() {
        return goodsModel;
    }

    /** 
     * Set the 'GoodsModel' element value. ������ ������
     * 
     * @param goodsModel
     */
    public void setGoodsModel(String goodsModel) {
        this.goodsModel = goodsModel;
    }

    /** 
     * Get the 'GoodsMarking' element value. ������� ������
     * 
     * @return value
     */
    public String getGoodsMarking() {
        return goodsMarking;
    }

    /** 
     * Set the 'GoodsMarking' element value. ������� ������
     * 
     * @param goodsMarking
     */
    public void setGoodsMarking(String goodsMarking) {
        this.goodsMarking = goodsMarking;
    }

    /** 
     * Get the 'GoodsStandard' element value. �������� (����, ���, ���, ���, ��)
     * 
     * @return value
     */
    public String getGoodsStandard() {
        return goodsStandard;
    }

    /** 
     * Set the 'GoodsStandard' element value. �������� (����, ���, ���, ���, ��)
     * 
     * @param goodsStandard
     */
    public void setGoodsStandard(String goodsStandard) {
        this.goodsStandard = goodsStandard;
    }

    /** 
     * Get the 'GoodsSort' element value. ���� / ���� ��� ������ ������ (��� ����- � ��������������)
     * 
     * @return value
     */
    public String getGoodsSort() {
        return goodsSort;
    }

    /** 
     * Set the 'GoodsSort' element value. ���� / ���� ��� ������ ������ (��� ����- � ��������������)
     * 
     * @param goodsSort
     */
    public void setGoodsSort(String goodsSort) {
        this.goodsSort = goodsSort;
    }

    /** 
     * Get the 'WoodSortiment' element value. ������������ ���������� (��� �������������� �������� ������� 4403)
     * 
     * @return value
     */
    public String getWoodSortiment() {
        return woodSortiment;
    }

    /** 
     * Set the 'WoodSortiment' element value. ������������ ���������� (��� �������������� �������� ������� 4403)
     * 
     * @param woodSortiment
     */
    public void setWoodSortiment(String woodSortiment) {
        this.woodSortiment = woodSortiment;
    }

    /** 
     * Get the 'WoodKind' element value. ������ ���������
     * 
     * @return value
     */
    public String getWoodKind() {
        return woodKind;
    }

    /** 
     * Set the 'WoodKind' element value. ������ ���������
     * 
     * @param woodKind
     */
    public void setWoodKind(String woodKind) {
        this.woodKind = woodKind;
    }

    /** 
     * Get the 'Dimensions' element value. �������
     * 
     * @return value
     */
    public String getDimensions() {
        return dimensions;
    }

    /** 
     * Set the 'Dimensions' element value. �������
     * 
     * @param dimensions
     */
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    /** 
     * Get the 'DateIssue' element value. ���� �������
     * 
     * @return value
     */
    public LocalDate getDateIssue() {
        return dateIssue;
    }

    /** 
     * Set the 'DateIssue' element value. ���� �������
     * 
     * @param dateIssue
     */
    public void setDateIssue(LocalDate dateIssue) {
        this.dateIssue = dateIssue;
    }

    /** 
     * Get the list of 'SerialNumber' element items. �������� �����
     * 
     * @return list
     */
    public List<String> getSerialNumberList() {
        return serialNumberList;
    }

    /** 
     * Set the list of 'SerialNumber' element items. �������� �����
     * 
     * @param list
     */
    public void setSerialNumberList(List<String> list) {
        serialNumberList = list;
    }

    /** 
     * Get the 'GoodsGroupQuantity' element value. ���������� �������. ��.31 ������ ���������
     * 
     * @return value
     */
    public SupplementaryQuantityType getGoodsGroupQuantity() {
        return goodsGroupQuantity;
    }

    /** 
     * Set the 'GoodsGroupQuantity' element value. ���������� �������. ��.31 ������ ���������
     * 
     * @param goodsGroupQuantity
     */
    public void setGoodsGroupQuantity(
            SupplementaryQuantityType goodsGroupQuantity) {
        this.goodsGroupQuantity = goodsGroupQuantity;
    }
}
