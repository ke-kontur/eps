
package ru.acs.fts.schemas.album.pi_airarrive;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AWBNumberType;

/** 
 * ќписание товарных партий
 */
public class CargoManifestType
{
    private String cargoPlaceNumber;
    private String totalWeight;
    private LocalDate dateExpectedArrival;
    private String timeExpectedArrival;
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private AirportInfoType loadingPoint;
    private AirportInfoType unloadingPoint;
    private CUCustomsType borderCustoms;
    private AWBNumberType cargoManifestNumber;

    /** 
     * Get the 'CargoPlaceNumber' element value.  оличество мест по грузовой накладной
     * 
     * @return value
     */
    public String getCargoPlaceNumber() {
        return cargoPlaceNumber;
    }

    /** 
     * Set the 'CargoPlaceNumber' element value.  оличество мест по грузовой накладной
     * 
     * @param cargoPlaceNumber
     */
    public void setCargoPlaceNumber(String cargoPlaceNumber) {
        this.cargoPlaceNumber = cargoPlaceNumber;
    }

    /** 
     * Get the 'TotalWeight' element value. ќбщий вес по грузовой накладной
     * 
     * @return value
     */
    public String getTotalWeight() {
        return totalWeight;
    }

    /** 
     * Set the 'TotalWeight' element value. ќбщий вес по грузовой накладной
     * 
     * @param totalWeight
     */
    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }

    /** 
     * Get the 'DateExpectedArrival' element value. ƒата ожидаемого прибыти€ товаров и транспортных средств в пограничный пункт пропуска
     * 
     * @return value
     */
    public LocalDate getDateExpectedArrival() {
        return dateExpectedArrival;
    }

    /** 
     * Set the 'DateExpectedArrival' element value. ƒата ожидаемого прибыти€ товаров и транспортных средств в пограничный пункт пропуска
     * 
     * @param dateExpectedArrival
     */
    public void setDateExpectedArrival(LocalDate dateExpectedArrival) {
        this.dateExpectedArrival = dateExpectedArrival;
    }

    /** 
     * Get the 'TimeExpectedArrival' element value. ¬рем€ ожидаемого прибыти€ товаров и транспортных средств в пограничный пункт пропуска
     * 
     * @return value
     */
    public String getTimeExpectedArrival() {
        return timeExpectedArrival;
    }

    /** 
     * Set the 'TimeExpectedArrival' element value. ¬рем€ ожидаемого прибыти€ товаров и транспортных средств в пограничный пункт пропуска
     * 
     * @param timeExpectedArrival
     */
    public void setTimeExpectedArrival(String timeExpectedArrival) {
        this.timeExpectedArrival = timeExpectedArrival;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. —ведени€ о перевозимом грузе
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. —ведени€ о перевозимом грузе
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
    }

    /** 
     * Get the 'LoadingPoint' element value. ѕункт погрузки товаров
     * 
     * @return value
     */
    public AirportInfoType getLoadingPoint() {
        return loadingPoint;
    }

    /** 
     * Set the 'LoadingPoint' element value. ѕункт погрузки товаров
     * 
     * @param loadingPoint
     */
    public void setLoadingPoint(AirportInfoType loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    /** 
     * Get the 'UnloadingPoint' element value. ѕункт выгрузки товаров
     * 
     * @return value
     */
    public AirportInfoType getUnloadingPoint() {
        return unloadingPoint;
    }

    /** 
     * Set the 'UnloadingPoint' element value. ѕункт выгрузки товаров
     * 
     * @param unloadingPoint
     */
    public void setUnloadingPoint(AirportInfoType unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    /** 
     * Get the 'BorderCustoms' element value. “аможенный орган (пограничный пункт пропуска), в который ожидаетс€ прибытие товаров и транспортных средств.
     * 
     * @return value
     */
    public CUCustomsType getBorderCustoms() {
        return borderCustoms;
    }

    /** 
     * Set the 'BorderCustoms' element value. “аможенный орган (пограничный пункт пропуска), в который ожидаетс€ прибытие товаров и транспортных средств.
     * 
     * @param borderCustoms
     */
    public void setBorderCustoms(CUCustomsType borderCustoms) {
        this.borderCustoms = borderCustoms;
    }

    /** 
     * Get the 'CargoManifestNumber' element value. Ќомер грузовой накладной
     * 
     * @return value
     */
    public AWBNumberType getCargoManifestNumber() {
        return cargoManifestNumber;
    }

    /** 
     * Set the 'CargoManifestNumber' element value. Ќомер грузовой накладной
     * 
     * @param cargoManifestNumber
     */
    public void setCargoManifestNumber(AWBNumberType cargoManifestNumber) {
        this.cargoManifestNumber = cargoManifestNumber;
    }
}
