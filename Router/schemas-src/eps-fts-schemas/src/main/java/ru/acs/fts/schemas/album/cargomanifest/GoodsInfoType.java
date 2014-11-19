
package ru.acs.fts.schemas.album.cargomanifest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AWBNumberType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AirportType;

/** 
 * ���������� � �����
 */
public class GoodsInfoType extends AWBNumberType
{
    private String shipmentDescriptionCode;
    private String placesQuantity;
    private String weightUnitQualifierCode;
    private String grossWeightQuantity;
    private String goodsDescription;
    private String goodsCommodityCode;
    private AirportType originAirport;
    private AirportType destimationAirport;
    private VolumeInfoType volumeInfo;
    private DensityGroupType densityGroup;
    private TotalConsigmentPiecesType totalConsigmentPieces;
    private List<HandlingInfoType> handlingRequirementList = new ArrayList<HandlingInfoType>();
    private List<DimensionsInfoType> dimensionsInfoList = new ArrayList<DimensionsInfoType>();
    private MovementInfoType movementInfo;
    private OtherServiceInfoType otherServiceInfo;
    private CustomsInfoType customsInfo;
    private DTInfoType DTInfo;

    /** 
     * Get the 'ShipmentDescriptionCode' element value. ShipmentDescriptionCode
     * 
     * @return value
     */
    public String getShipmentDescriptionCode() {
        return shipmentDescriptionCode;
    }

    /** 
     * Set the 'ShipmentDescriptionCode' element value. ShipmentDescriptionCode
     * 
     * @param shipmentDescriptionCode
     */
    public void setShipmentDescriptionCode(String shipmentDescriptionCode) {
        this.shipmentDescriptionCode = shipmentDescriptionCode;
    }

    /** 
     * Get the 'PlacesQuantity' element value. ���������� ����, �������� � ��������� / ���������� ���� ������ �� ��������� ��� ������ �������� ������
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. ���������� ����, �������� � ��������� / ���������� ���� ������ �� ��������� ��� ������ �������� ������
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'WeightUnitQualifierCode' element value. ��� ��������� ���� ������ (���������� ��� �����)
     * 
     * @return value
     */
    public String getWeightUnitQualifierCode() {
        return weightUnitQualifierCode;
    }

    /** 
     * Set the 'WeightUnitQualifierCode' element value. ��� ��������� ���� ������ (���������� ��� �����)
     * 
     * @param weightUnitQualifierCode
     */
    public void setWeightUnitQualifierCode(String weightUnitQualifierCode) {
        this.weightUnitQualifierCode = weightUnitQualifierCode;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ��� ������, ������
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ��� ������, ������
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'GoodsDescription' element value. �������� ������
     * 
     * @return value
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. �������� ������
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the 'GoodsCommodityCode' element value. ���  ������ �� �������� ������������
     * 
     * @return value
     */
    public String getGoodsCommodityCode() {
        return goodsCommodityCode;
    }

    /** 
     * Set the 'GoodsCommodityCode' element value. ���  ������ �� �������� ������������
     * 
     * @param goodsCommodityCode
     */
    public void setGoodsCommodityCode(String goodsCommodityCode) {
        this.goodsCommodityCode = goodsCommodityCode;
    }

    /** 
     * Get the 'OriginAirport' element value. �������� ��������  (��  ���������)
     * 
     * @return value
     */
    public AirportType getOriginAirport() {
        return originAirport;
    }

    /** 
     * Set the 'OriginAirport' element value. �������� ��������  (��  ���������)
     * 
     * @param originAirport
     */
    public void setOriginAirport(AirportType originAirport) {
        this.originAirport = originAirport;
    }

    /** 
     * Get the 'DestimationAirport' element value. �������� ����������
     * 
     * @return value
     */
    public AirportType getDestimationAirport() {
        return destimationAirport;
    }

    /** 
     * Set the 'DestimationAirport' element value. �������� ����������
     * 
     * @param destimationAirport
     */
    public void setDestimationAirport(AirportType destimationAirport) {
        this.destimationAirport = destimationAirport;
    }

    /** 
     * Get the 'VolumeInfo' element value. ����� ������
     * 
     * @return value
     */
    public VolumeInfoType getVolumeInfo() {
        return volumeInfo;
    }

    /** 
     * Set the 'VolumeInfo' element value. ����� ������
     * 
     * @param volumeInfo
     */
    public void setVolumeInfo(VolumeInfoType volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    /** 
     * Get the 'DensityGroup' element value. ������ ��������� ����
     * 
     * @return value
     */
    public DensityGroupType getDensityGroup() {
        return densityGroup;
    }

    /** 
     * Set the 'DensityGroup' element value. ������ ��������� ����
     * 
     * @param densityGroup
     */
    public void setDensityGroup(DensityGroupType densityGroup) {
        this.densityGroup = densityGroup;
    }

    /** 
     * Get the 'TotalConsigmentPieces' element value. �������� �� ����� ���������� ������ �� ��������� ��� ��������� ��������
     * 
     * @return value
     */
    public TotalConsigmentPiecesType getTotalConsigmentPieces() {
        return totalConsigmentPieces;
    }

    /** 
     * Set the 'TotalConsigmentPieces' element value. �������� �� ����� ���������� ������ �� ��������� ��� ��������� ��������
     * 
     * @param totalConsigmentPieces
     */
    public void setTotalConsigmentPieces(
            TotalConsigmentPiecesType totalConsigmentPieces) {
        this.totalConsigmentPieces = totalConsigmentPieces;
    }

    /** 
     * Get the list of 'HandlingRequirement' element items. ���������� �� ��������� �����
     * 
     * @return list
     */
    public List<HandlingInfoType> getHandlingRequirementList() {
        return handlingRequirementList;
    }

    /** 
     * Set the list of 'HandlingRequirement' element items. ���������� �� ��������� �����
     * 
     * @param list
     */
    public void setHandlingRequirementList(List<HandlingInfoType> list) {
        handlingRequirementList = list;
    }

    /** 
     * Get the list of 'DimensionsInfo' element items. ���������� � ���������  �����
     * 
     * @return list
     */
    public List<DimensionsInfoType> getDimensionsInfoList() {
        return dimensionsInfoList;
    }

    /** 
     * Set the list of 'DimensionsInfo' element items. ���������� � ���������  �����
     * 
     * @param list
     */
    public void setDimensionsInfoList(List<DimensionsInfoType> list) {
        dimensionsInfoList = list;
    }

    /** 
     * Get the 'MovementInfo' element value. ���������� � ����������� ����������� �����
     * 
     * @return value
     */
    public MovementInfoType getMovementInfo() {
        return movementInfo;
    }

    /** 
     * Set the 'MovementInfo' element value. ���������� � ����������� ����������� �����
     * 
     * @param movementInfo
     */
    public void setMovementInfo(MovementInfoType movementInfo) {
        this.movementInfo = movementInfo;
    }

    /** 
     * Get the 'OtherServiceInfo' element value. ������ ��������� ����������
     * 
     * @return value
     */
    public OtherServiceInfoType getOtherServiceInfo() {
        return otherServiceInfo;
    }

    /** 
     * Set the 'OtherServiceInfo' element value. ������ ��������� ����������
     * 
     * @param otherServiceInfo
     */
    public void setOtherServiceInfo(OtherServiceInfoType otherServiceInfo) {
        this.otherServiceInfo = otherServiceInfo;
    }

    /** 
     * Get the 'CustomsInfo' element value. ���������� ��� �������
     * 
     * @return value
     */
    public CustomsInfoType getCustomsInfo() {
        return customsInfo;
    }

    /** 
     * Set the 'CustomsInfo' element value. ���������� ��� �������
     * 
     * @param customsInfo
     */
    public void setCustomsInfo(CustomsInfoType customsInfo) {
        this.customsInfo = customsInfo;
    }

    /** 
     * Get the 'DTInfo' element value. �������� � ��
     * 
     * @return value
     */
    public DTInfoType getDTInfo() {
        return DTInfo;
    }

    /** 
     * Set the 'DTInfo' element value. �������� � ��
     * 
     * @param DTInfo
     */
    public void setDTInfo(DTInfoType DTInfo) {
        this.DTInfo = DTInfo;
    }
}
