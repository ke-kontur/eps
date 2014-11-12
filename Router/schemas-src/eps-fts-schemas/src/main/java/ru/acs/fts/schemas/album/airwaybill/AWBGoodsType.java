
package ru.acs.fts.schemas.album.airwaybill;

import java.util.ArrayList;
import java.util.List;

/** 
 * Груз
 */
public class AWBGoodsType
{
    private String placesQuantity;
    private String weightUnitQualifierCode;
    private String grossWeightQuantity;
    private String rateMixCode;
    private String serviceCode;
    private String tariffClassCode;
    private String commodityItemNum;
    private String goodsVolume;
    private String volumeUnitQualifierCode;
    private String paidWeightQuantity;
    private String goodsCommodityCode;
    private String factPlacesQuantity;
    private String totalSum;
    private String rateCharge;
    private List<GoodsDescrType> goodsDescrList = new ArrayList<GoodsDescrType>();
    private DimensionInfoType dimensions;
    private List<ContainerInfoType> containerInfoList = new ArrayList<ContainerInfoType>();
    private DTInfoType DTInfo;

    /** 
     * Get the 'PlacesQuantity' element value. Количество мест товара одного наименования
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. Количество мест товара одного наименования
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
     * Get the 'RateMixCode' element value. Трехзначный  буквенно-цифровой код  комбинации тарифов
     * 
     * @return value
     */
    public String getRateMixCode() {
        return rateMixCode;
    }

    /** 
     * Set the 'RateMixCode' element value. Трехзначный  буквенно-цифровой код  комбинации тарифов
     * 
     * @param rateMixCode
     */
    public void setRateMixCode(String rateMixCode) {
        this.rateMixCode = rateMixCode;
    }

    /** 
     * Get the 'ServiceCode' element value. Служебный код, заполняемый выпускающим перевозчиком
     * 
     * @return value
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /** 
     * Set the 'ServiceCode' element value. Служебный код, заполняемый выпускающим перевозчиком
     * 
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /** 
     * Get the 'TariffClassCode' element value. Класс тарифа
     * 
     * @return value
     */
    public String getTariffClassCode() {
        return tariffClassCode;
    }

    /** 
     * Set the 'TariffClassCode' element value. Класс тарифа
     * 
     * @param tariffClassCode
     */
    public void setTariffClassCode(String tariffClassCode) {
        this.tariffClassCode = tariffClassCode;
    }

    /** 
     * Get the 'CommodityItemNum' element value. товарный номер / процент скидки, надбавки / тип тарифа для пакетированного груза
     * 
     * @return value
     */
    public String getCommodityItemNum() {
        return commodityItemNum;
    }

    /** 
     * Set the 'CommodityItemNum' element value. товарный номер / процент скидки, надбавки / тип тарифа для пакетированного груза
     * 
     * @param commodityItemNum
     */
    public void setCommodityItemNum(String commodityItemNum) {
        this.commodityItemNum = commodityItemNum;
    }

    /** 
     * Get the 'GoodsVolume' element value. Общий объем, занимаемый перевозимым товаром без указания единиц измерения
     * 
     * @return value
     */
    public String getGoodsVolume() {
        return goodsVolume;
    }

    /** 
     * Set the 'GoodsVolume' element value. Общий объем, занимаемый перевозимым товаром без указания единиц измерения
     * 
     * @param goodsVolume
     */
    public void setGoodsVolume(String goodsVolume) {
        this.goodsVolume = goodsVolume;
    }

    /** 
     * Get the 'VolumeUnitQualifierCode' element value. Код единицы измерения объема
     * 
     * @return value
     */
    public String getVolumeUnitQualifierCode() {
        return volumeUnitQualifierCode;
    }

    /** 
     * Set the 'VolumeUnitQualifierCode' element value. Код единицы измерения объема
     * 
     * @param volumeUnitQualifierCode
     */
    public void setVolumeUnitQualifierCode(String volumeUnitQualifierCode) {
        this.volumeUnitQualifierCode = volumeUnitQualifierCode;
    }

    /** 
     * Get the 'PaidWeightQuantity' element value. Платный вес товара 
     * 
     * @return value
     */
    public String getPaidWeightQuantity() {
        return paidWeightQuantity;
    }

    /** 
     * Set the 'PaidWeightQuantity' element value. Платный вес товара 
     * 
     * @param paidWeightQuantity
     */
    public void setPaidWeightQuantity(String paidWeightQuantity) {
        this.paidWeightQuantity = paidWeightQuantity;
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
     * Get the 'FactPlacesQuantity' element value. Фактическое количество мест товара
     * 
     * @return value
     */
    public String getFactPlacesQuantity() {
        return factPlacesQuantity;
    }

    /** 
     * Set the 'FactPlacesQuantity' element value. Фактическое количество мест товара
     * 
     * @param factPlacesQuantity
     */
    public void setFactPlacesQuantity(String factPlacesQuantity) {
        this.factPlacesQuantity = factPlacesQuantity;
    }

    /** 
     * Get the 'TotalSum' element value. Сумма (22H)
     * 
     * @return value
     */
    public String getTotalSum() {
        return totalSum;
    }

    /** 
     * Set the 'TotalSum' element value. Сумма (22H)
     * 
     * @param totalSum
     */
    public void setTotalSum(String totalSum) {
        this.totalSum = totalSum;
    }

    /** 
     * Get the 'RateCharge' element value. Ставка (22G)
     * 
     * @return value
     */
    public String getRateCharge() {
        return rateCharge;
    }

    /** 
     * Set the 'RateCharge' element value. Ставка (22G)
     * 
     * @param rateCharge
     */
    public void setRateCharge(String rateCharge) {
        this.rateCharge = rateCharge;
    }

    /** 
     * Get the list of 'GoodsDescr' element items. Описание груза / дополнительная информация
     * 
     * @return list
     */
    public List<GoodsDescrType> getGoodsDescrList() {
        return goodsDescrList;
    }

    /** 
     * Set the list of 'GoodsDescr' element items. Описание груза / дополнительная информация
     * 
     * @param list
     */
    public void setGoodsDescrList(List<GoodsDescrType> list) {
        goodsDescrList = list;
    }

    /** 
     * Get the 'Dimensions' element value. Габариты
     * 
     * @return value
     */
    public DimensionInfoType getDimensions() {
        return dimensions;
    }

    /** 
     * Set the 'Dimensions' element value. Габариты
     * 
     * @param dimensions
     */
    public void setDimensions(DimensionInfoType dimensions) {
        this.dimensions = dimensions;
    }

    /** 
     * Get the list of 'ContainerInfo' element items. Информация о контейнерах
     * 
     * @return list
     */
    public List<ContainerInfoType> getContainerInfoList() {
        return containerInfoList;
    }

    /** 
     * Set the list of 'ContainerInfo' element items. Информация о контейнерах
     * 
     * @param list
     */
    public void setContainerInfoList(List<ContainerInfoType> list) {
        containerInfoList = list;
    }

    /** 
     * Get the 'DTInfo' element value. Сведения из декларации на товары
     * 
     * @return value
     */
    public DTInfoType getDTInfo() {
        return DTInfo;
    }

    /** 
     * Set the 'DTInfo' element value. Сведения из декларации на товары
     * 
     * @param DTInfo
     */
    public void setDTInfo(DTInfoType DTInfo) {
        this.DTInfo = DTInfo;
    }
}
