
package ru.acs.fts.schemas.album.actquarantinefitosancontrol;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Описание груза
 */
public class DescriptionConsignmentType
{
    private String goodsDescription;
    private String quantityPlace;
    private String goodsQuantity;
    private String goodsWeightQuantity;
    private ArrivalOriginInfoType arrival;
    private ArrivalOriginInfoType origin;
    private AddressType locationPlace;
    private DesinfestationType desinfestationInfo;

    /** 
     * Get the 'GoodsDescription' element value. Описание продукции, грузов, материалов, транспортных средств.
     * 
     * @return value
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. Описание продукции, грузов, материалов, транспортных средств.
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the 'QuantityPlace' element value. Общее количество мест
     * 
     * @return value
     */
    public String getQuantityPlace() {
        return quantityPlace;
    }

    /** 
     * Set the 'QuantityPlace' element value. Общее количество мест
     * 
     * @param quantityPlace
     */
    public void setQuantityPlace(String quantityPlace) {
        this.quantityPlace = quantityPlace;
    }

    /** 
     * Get the 'GoodsQuantity' element value. Количество продукции
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. Количество продукции
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'GoodsWeightQuantity' element value. Вес продукции (кг)
     * 
     * @return value
     */
    public String getGoodsWeightQuantity() {
        return goodsWeightQuantity;
    }

    /** 
     * Set the 'GoodsWeightQuantity' element value. Вес продукции (кг)
     * 
     * @param goodsWeightQuantity
     */
    public void setGoodsWeightQuantity(String goodsWeightQuantity) {
        this.goodsWeightQuantity = goodsWeightQuantity;
    }

    /** 
     * Get the 'Arrival' element value. Прибытие груза
     * 
     * @return value
     */
    public ArrivalOriginInfoType getArrival() {
        return arrival;
    }

    /** 
     * Set the 'Arrival' element value. Прибытие груза
     * 
     * @param arrival
     */
    public void setArrival(ArrivalOriginInfoType arrival) {
        this.arrival = arrival;
    }

    /** 
     * Get the 'Origin' element value. Происхождение груза
     * 
     * @return value
     */
    public ArrivalOriginInfoType getOrigin() {
        return origin;
    }

    /** 
     * Set the 'Origin' element value. Происхождение груза
     * 
     * @param origin
     */
    public void setOrigin(ArrivalOriginInfoType origin) {
        this.origin = origin;
    }

    /** 
     * Get the 'LocationPlace' element value. Место нахождения продукции
     * 
     * @return value
     */
    public AddressType getLocationPlace() {
        return locationPlace;
    }

    /** 
     * Set the 'LocationPlace' element value. Место нахождения продукции
     * 
     * @param locationPlace
     */
    public void setLocationPlace(AddressType locationPlace) {
        this.locationPlace = locationPlace;
    }

    /** 
     * Get the 'DesinfestationInfo' element value. Сведения об обеззараживании
     * 
     * @return value
     */
    public DesinfestationType getDesinfestationInfo() {
        return desinfestationInfo;
    }

    /** 
     * Set the 'DesinfestationInfo' element value. Сведения об обеззараживании
     * 
     * @param desinfestationInfo
     */
    public void setDesinfestationInfo(DesinfestationType desinfestationInfo) {
        this.desinfestationInfo = desinfestationInfo;
    }
}
