
package ru.acs.fts.schemas.album.cargomanifest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AWBNumberType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AirportType;

/** 
 * Информация о грузе
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
     * Get the 'PlacesQuantity' element value. Количество мест, принятых к перевозке / Количество мест товара по накладной при полной загрузке товара
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. Количество мест, принятых к перевозке / Количество мест товара по накладной при полной загрузке товара
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'WeightUnitQualifierCode' element value. Код измерения веса товара (килограммы или фунты)
     * 
     * @return value
     */
    public String getWeightUnitQualifierCode() {
        return weightUnitQualifierCode;
    }

    /** 
     * Set the 'WeightUnitQualifierCode' element value. Код измерения веса товара (килограммы или фунты)
     * 
     * @param weightUnitQualifierCode
     */
    public void setWeightUnitQualifierCode(String weightUnitQualifierCode) {
        this.weightUnitQualifierCode = weightUnitQualifierCode;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. Вес товара, брутто
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. Вес товара, брутто
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'GoodsDescription' element value. Описание товара
     * 
     * @return value
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. Описание товара
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the 'GoodsCommodityCode' element value. Код  товара по товарной номенклатуре
     * 
     * @return value
     */
    public String getGoodsCommodityCode() {
        return goodsCommodityCode;
    }

    /** 
     * Set the 'GoodsCommodityCode' element value. Код  товара по товарной номенклатуре
     * 
     * @param goodsCommodityCode
     */
    public void setGoodsCommodityCode(String goodsCommodityCode) {
        this.goodsCommodityCode = goodsCommodityCode;
    }

    /** 
     * Get the 'OriginAirport' element value. Аэропорт погрузки  (из  накладной)
     * 
     * @return value
     */
    public AirportType getOriginAirport() {
        return originAirport;
    }

    /** 
     * Set the 'OriginAirport' element value. Аэропорт погрузки  (из  накладной)
     * 
     * @param originAirport
     */
    public void setOriginAirport(AirportType originAirport) {
        this.originAirport = originAirport;
    }

    /** 
     * Get the 'DestimationAirport' element value. Аэропорт назначения
     * 
     * @return value
     */
    public AirportType getDestimationAirport() {
        return destimationAirport;
    }

    /** 
     * Set the 'DestimationAirport' element value. Аэропорт назначения
     * 
     * @param destimationAirport
     */
    public void setDestimationAirport(AirportType destimationAirport) {
        this.destimationAirport = destimationAirport;
    }

    /** 
     * Get the 'VolumeInfo' element value. Объем товара
     * 
     * @return value
     */
    public VolumeInfoType getVolumeInfo() {
        return volumeInfo;
    }

    /** 
     * Set the 'VolumeInfo' element value. Объем товара
     * 
     * @param volumeInfo
     */
    public void setVolumeInfo(VolumeInfoType volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    /** 
     * Get the 'DensityGroup' element value. Группа объемного веса
     * 
     * @return value
     */
    public DensityGroupType getDensityGroup() {
        return densityGroup;
    }

    /** 
     * Set the 'DensityGroup' element value. Группа объемного веса
     * 
     * @param densityGroup
     */
    public void setDensityGroup(DensityGroupType densityGroup) {
        this.densityGroup = densityGroup;
    }

    /** 
     * Get the 'TotalConsigmentPieces' element value. Сведения об общем количестве товара по накладной при частичной погрузке
     * 
     * @return value
     */
    public TotalConsigmentPiecesType getTotalConsigmentPieces() {
        return totalConsigmentPieces;
    }

    /** 
     * Set the 'TotalConsigmentPieces' element value. Сведения об общем количестве товара по накладной при частичной погрузке
     * 
     * @param totalConsigmentPieces
     */
    public void setTotalConsigmentPieces(
            TotalConsigmentPiecesType totalConsigmentPieces) {
        this.totalConsigmentPieces = totalConsigmentPieces;
    }

    /** 
     * Get the list of 'HandlingRequirement' element items. Требования по обработке груза
     * 
     * @return list
     */
    public List<HandlingInfoType> getHandlingRequirementList() {
        return handlingRequirementList;
    }

    /** 
     * Set the list of 'HandlingRequirement' element items. Требования по обработке груза
     * 
     * @param list
     */
    public void setHandlingRequirementList(List<HandlingInfoType> list) {
        handlingRequirementList = list;
    }

    /** 
     * Get the list of 'DimensionsInfo' element items. Информация о габаритах  груза
     * 
     * @return list
     */
    public List<DimensionsInfoType> getDimensionsInfoList() {
        return dimensionsInfoList;
    }

    /** 
     * Set the list of 'DimensionsInfo' element items. Информация о габаритах  груза
     * 
     * @param list
     */
    public void setDimensionsInfoList(List<DimensionsInfoType> list) {
        dimensionsInfoList = list;
    }

    /** 
     * Get the 'MovementInfo' element value. Информация о последующем перемещении груза
     * 
     * @return value
     */
    public MovementInfoType getMovementInfo() {
        return movementInfo;
    }

    /** 
     * Set the 'MovementInfo' element value. Информация о последующем перемещении груза
     * 
     * @param movementInfo
     */
    public void setMovementInfo(MovementInfoType movementInfo) {
        this.movementInfo = movementInfo;
    }

    /** 
     * Get the 'OtherServiceInfo' element value. Прочая служебная информация
     * 
     * @return value
     */
    public OtherServiceInfoType getOtherServiceInfo() {
        return otherServiceInfo;
    }

    /** 
     * Set the 'OtherServiceInfo' element value. Прочая служебная информация
     * 
     * @param otherServiceInfo
     */
    public void setOtherServiceInfo(OtherServiceInfoType otherServiceInfo) {
        this.otherServiceInfo = otherServiceInfo;
    }

    /** 
     * Get the 'CustomsInfo' element value. Информация для таможни
     * 
     * @return value
     */
    public CustomsInfoType getCustomsInfo() {
        return customsInfo;
    }

    /** 
     * Set the 'CustomsInfo' element value. Информация для таможни
     * 
     * @param customsInfo
     */
    public void setCustomsInfo(CustomsInfoType customsInfo) {
        this.customsInfo = customsInfo;
    }

    /** 
     * Get the 'DTInfo' element value. Сведения о ДТ
     * 
     * @return value
     */
    public DTInfoType getDTInfo() {
        return DTInfo;
    }

    /** 
     * Set the 'DTInfo' element value. Сведения о ДТ
     * 
     * @param DTInfo
     */
    public void setDTInfo(DTInfoType DTInfo) {
        this.DTInfo = DTInfo;
    }
}
