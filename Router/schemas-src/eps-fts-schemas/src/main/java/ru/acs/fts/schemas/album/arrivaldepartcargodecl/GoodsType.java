
package ru.acs.fts.schemas.album.arrivaldepartcargodecl;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportGoodsBaseType;
import ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust.TRPackingInfoType;

/** 
 * �������� �������
 */
public class GoodsType extends TransportGoodsBaseType
{
    private String goodsTNVEDCode;
    private String placesQuantity;
    private String grossWeightQuantity;
    private String dimensions;
    private SupplementaryQuantityType supplementaryGoodsQuantity;
    private BillofLadingType billofLading;
    private List<TRPackingInfoType> placesInfoList = new ArrayList<TRPackingInfoType>();
    private List<TRPackingInfoType> packingInfoList = new ArrayList<TRPackingInfoType>();

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
     * Get the 'Dimensions' element value. ������� �����
     * 
     * @return value
     */
    public String getDimensions() {
        return dimensions;
    }

    /** 
     * Set the 'Dimensions' element value. ������� �����
     * 
     * @param dimensions
     */
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. ���-�� ������ (� �������������� ������� ���������)
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. ���-�� ������ (� �������������� ������� ���������)
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(
            SupplementaryQuantityType supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }

    /** 
     * Get the 'BillofLading' element value. ��������� ����������� �� ���� (�����), ���������� �������� � ����� �������
     * 
     * @return value
     */
    public BillofLadingType getBillofLading() {
        return billofLading;
    }

    /** 
     * Set the 'BillofLading' element value. ��������� ����������� �� ���� (�����), ���������� �������� � ����� �������
     * 
     * @param billofLading
     */
    public void setBillofLading(BillofLadingType billofLading) {
        this.billofLading = billofLading;
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
     * Get the list of 'PackingInfo' element items. �������� �� �������� �������
     * 
     * @return list
     */
    public List<TRPackingInfoType> getPackingInfoList() {
        return packingInfoList;
    }

    /** 
     * Set the list of 'PackingInfo' element items. �������� �� �������� �������
     * 
     * @param list
     */
    public void setPackingInfoList(List<TRPackingInfoType> list) {
        packingInfoList = list;
    }
}
