
package ru.acs.fts.schemas.album.railwaybill;

import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.TransportGoodsType;

/** 
 * Сведения о товарах накладной
 */
public class RWBGoodsType extends TransportGoodsType
{
    private String containerIndicator;
    private String workToolDescription;
    private String conductorDescription;
    private String placeGoodsQuantity;
    private String placesQuantity;
    private String grossWeightQuantity;
    private String placesDescription;
    private String harmonizedRangeGoods;
    private String packing;
    private String marking;
    private String carriageNumber;
    private String containerNumber;
    private DTInfoType DTInfo;

    /** 
     * Get the 'ContainerIndicator' element value. Отметка перевозки грузов в контейнерах 
     * 
     * @return value
     */
    public String getContainerIndicator() {
        return containerIndicator;
    }

    /** 
     * Set the 'ContainerIndicator' element value. Отметка перевозки грузов в контейнерах 
     * 
     * @param containerIndicator
     */
    public void setContainerIndicator(String containerIndicator) {
        this.containerIndicator = containerIndicator;
    }

    /** 
     * Get the 'WorkToolDescription' element value. В случае осуществления перевозки с применением перевозочных приспособлений указывается наименование применяемых перевозочных приспособлений
     * 
     * @return value
     */
    public String getWorkToolDescription() {
        return workToolDescription;
    }

    /** 
     * Set the 'WorkToolDescription' element value. В случае осуществления перевозки с применением перевозочных приспособлений указывается наименование применяемых перевозочных приспособлений
     * 
     * @param workToolDescription
     */
    public void setWorkToolDescription(String workToolDescription) {
        this.workToolDescription = workToolDescription;
    }

    /** 
     * Get the 'ConductorDescription' element value. Заполняется при перевозках грузов с проводниками. Указываются сведения о проводниках и в соответствующих случаях — название пограничной станции, на которой производится замена проводников. 
     * 
     * @return value
     */
    public String getConductorDescription() {
        return conductorDescription;
    }

    /** 
     * Set the 'ConductorDescription' element value. Заполняется при перевозках грузов с проводниками. Указываются сведения о проводниках и в соответствующих случаях — название пограничной станции, на которой производится замена проводников. 
     * 
     * @param conductorDescription
     */
    public void setConductorDescription(String conductorDescription) {
        this.conductorDescription = conductorDescription;
    }

    /** 
     * Get the 'PlaceGoodsQuantity' element value. Количество товара в грузовом месте
     * 
     * @return value
     */
    public String getPlaceGoodsQuantity() {
        return placeGoodsQuantity;
    }

    /** 
     * Set the 'PlaceGoodsQuantity' element value. Количество товара в грузовом месте
     * 
     * @param placeGoodsQuantity
     */
    public void setPlaceGoodsQuantity(String placeGoodsQuantity) {
        this.placeGoodsQuantity = placeGoodsQuantity;
    }

    /** 
     * Get the 'PlacesQuantity' element value. Общее количество грузовых мест товара, если "навал" или налив" то не заполняется
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. Общее количество грузовых мест товара, если "навал" или налив" то не заполняется
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. Вес товара определенный отправителем, брутто (кг)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. Вес товара определенный отправителем, брутто (кг)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'PlacesDescription' element value. Описание грузовых мест (коробок, упаковок, паллет и т.д.)
     * 
     * @return value
     */
    public String getPlacesDescription() {
        return placesDescription;
    }

    /** 
     * Set the 'PlacesDescription' element value. Описание грузовых мест (коробок, упаковок, паллет и т.д.)
     * 
     * @param placesDescription
     */
    public void setPlacesDescription(String placesDescription) {
        this.placesDescription = placesDescription;
    }

    /** 
     * Get the 'HarmonizedRangeGoods' element value. Код товара по ГНГ
     * 
     * @return value
     */
    public String getHarmonizedRangeGoods() {
        return harmonizedRangeGoods;
    }

    /** 
     * Set the 'HarmonizedRangeGoods' element value. Код товара по ГНГ
     * 
     * @param harmonizedRangeGoods
     */
    public void setHarmonizedRangeGoods(String harmonizedRangeGoods) {
        this.harmonizedRangeGoods = harmonizedRangeGoods;
    }

    /** 
     * Get the 'Packing' element value. Упаковка
     * 
     * @return value
     */
    public String getPacking() {
        return packing;
    }

    /** 
     * Set the 'Packing' element value. Упаковка
     * 
     * @param packing
     */
    public void setPacking(String packing) {
        this.packing = packing;
    }

    /** 
     * Get the 'Marking' element value. Маркировка
     * 
     * @return value
     */
    public String getMarking() {
        return marking;
    }

    /** 
     * Set the 'Marking' element value. Маркировка
     * 
     * @param marking
     */
    public void setMarking(String marking) {
        this.marking = marking;
    }

    /** 
     * Get the 'CarriageNumber' element value. Номер вагона
     * 
     * @return value
     */
    public String getCarriageNumber() {
        return carriageNumber;
    }

    /** 
     * Set the 'CarriageNumber' element value. Номер вагона
     * 
     * @param carriageNumber
     */
    public void setCarriageNumber(String carriageNumber) {
        this.carriageNumber = carriageNumber;
    }

    /** 
     * Get the 'ContainerNumber' element value. Номер контейнера
     * 
     * @return value
     */
    public String getContainerNumber() {
        return containerNumber;
    }

    /** 
     * Set the 'ContainerNumber' element value. Номер контейнера
     * 
     * @param containerNumber
     */
    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
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
