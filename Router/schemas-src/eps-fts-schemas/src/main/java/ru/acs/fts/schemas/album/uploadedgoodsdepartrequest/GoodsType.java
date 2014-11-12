
package ru.acs.fts.schemas.album.uploadedgoodsdepartrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AWBNumberType;

/** 
 * Сведения о товарах
 */
public class GoodsType
{
    private String goodsDescription;
    private String goodsTNVEDCode;
    private String placesQuantity;
    private String grossWeightQuantity;
    private List<String> containerNumberList = new ArrayList<String>();
    private AWBNumberType wayBillNumber;

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
     * Get the 'GoodsTNVEDCode' element value. Код товара по товарной номенклатуре
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. Код товара по товарной номенклатуре
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
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
     * Get the 'GrossWeightQuantity' element value. Вес товара, брутто (кг)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. Вес товара, брутто (кг)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the list of 'ContainerNumber' element items. Номер контейнера
     * 
     * @return list
     */
    public List<String> getContainerNumberList() {
        return containerNumberList;
    }

    /** 
     * Set the list of 'ContainerNumber' element items. Номер контейнера
     * 
     * @param list
     */
    public void setContainerNumberList(List<String> list) {
        containerNumberList = list;
    }

    /** 
     * Get the 'WayBillNumber' element value. Номер накладной
     * 
     * @return value
     */
    public AWBNumberType getWayBillNumber() {
        return wayBillNumber;
    }

    /** 
     * Set the 'WayBillNumber' element value. Номер накладной
     * 
     * @param wayBillNumber
     */
    public void setWayBillNumber(AWBNumberType wayBillNumber) {
        this.wayBillNumber = wayBillNumber;
    }
}
