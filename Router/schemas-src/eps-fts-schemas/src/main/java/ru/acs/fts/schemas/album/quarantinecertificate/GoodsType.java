
package ru.acs.fts.schemas.album.quarantinecertificate;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Сведения о товаре
 */
public class GoodsType
{
    private List<String> goodsNameList = new ArrayList<String>();
    private String totalWeigh;
    private String measureUnitWeigh;
    private String packagesQuantity;
    private String mark;
    private String methodTransportation;
    private String senderStation;
    private String recipientStation;
    private String volume;
    private String measureUnitVolume;
    private AddressType origin;

    /** 
     * Get the list of 'GoodsName' element items. Наименование  ввозимого товара
     * 
     * @return list
     */
    public List<String> getGoodsNameList() {
        return goodsNameList;
    }

    /** 
     * Set the list of 'GoodsName' element items. Наименование  ввозимого товара
     * 
     * @param list
     */
    public void setGoodsNameList(List<String> list) {
        goodsNameList = list;
    }

    /** 
     * Get the 'TotalWeigh' element value. Общий вес товара
     * 
     * @return value
     */
    public String getTotalWeigh() {
        return totalWeigh;
    }

    /** 
     * Set the 'TotalWeigh' element value. Общий вес товара
     * 
     * @param totalWeigh
     */
    public void setTotalWeigh(String totalWeigh) {
        this.totalWeigh = totalWeigh;
    }

    /** 
     * Get the 'MeasureUnitWeigh' element value. Единица измерения вес 
     * 
     * @return value
     */
    public String getMeasureUnitWeigh() {
        return measureUnitWeigh;
    }

    /** 
     * Set the 'MeasureUnitWeigh' element value. Единица измерения вес 
     * 
     * @param measureUnitWeigh
     */
    public void setMeasureUnitWeigh(String measureUnitWeigh) {
        this.measureUnitWeigh = measureUnitWeigh;
    }

    /** 
     * Get the 'PackagesQuantity' element value. Количество мест. 
     * 
     * @return value
     */
    public String getPackagesQuantity() {
        return packagesQuantity;
    }

    /** 
     * Set the 'PackagesQuantity' element value. Количество мест. 
     * 
     * @param packagesQuantity
     */
    public void setPackagesQuantity(String packagesQuantity) {
        this.packagesQuantity = packagesQuantity;
    }

    /** 
     * Get the 'Mark' element value. Маркировка товара
     * 
     * @return value
     */
    public String getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. Маркировка товара
     * 
     * @param mark
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /** 
     * Get the 'MethodTransportation' element value. Способ транспортироки
     * 
     * @return value
     */
    public String getMethodTransportation() {
        return methodTransportation;
    }

    /** 
     * Set the 'MethodTransportation' element value. Способ транспортироки
     * 
     * @param methodTransportation
     */
    public void setMethodTransportation(String methodTransportation) {
        this.methodTransportation = methodTransportation;
    }

    /** 
     * Get the 'SenderStation' element value. Станция отправления
     * 
     * @return value
     */
    public String getSenderStation() {
        return senderStation;
    }

    /** 
     * Set the 'SenderStation' element value. Станция отправления
     * 
     * @param senderStation
     */
    public void setSenderStation(String senderStation) {
        this.senderStation = senderStation;
    }

    /** 
     * Get the 'RecipientStation' element value. Станция прибытия
     * 
     * @return value
     */
    public String getRecipientStation() {
        return recipientStation;
    }

    /** 
     * Set the 'RecipientStation' element value. Станция прибытия
     * 
     * @param recipientStation
     */
    public void setRecipientStation(String recipientStation) {
        this.recipientStation = recipientStation;
    }

    /** 
     * Get the 'Volume' element value. Объем
     * 
     * @return value
     */
    public String getVolume() {
        return volume;
    }

    /** 
     * Set the 'Volume' element value. Объем
     * 
     * @param volume
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /** 
     * Get the 'MeasureUnitVolume' element value. Единица измерения объема
     * 
     * @return value
     */
    public String getMeasureUnitVolume() {
        return measureUnitVolume;
    }

    /** 
     * Set the 'MeasureUnitVolume' element value. Единица измерения объема
     * 
     * @param measureUnitVolume
     */
    public void setMeasureUnitVolume(String measureUnitVolume) {
        this.measureUnitVolume = measureUnitVolume;
    }

    /** 
     * Get the 'Origin' element value. Происхождение товара
     * 
     * @return value
     */
    public AddressType getOrigin() {
        return origin;
    }

    /** 
     * Set the 'Origin' element value. Происхождение товара
     * 
     * @param origin
     */
    public void setOrigin(AddressType origin) {
        this.origin = origin;
    }
}
