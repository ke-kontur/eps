
package ru.acs.fts.schemas.album.actoperationindentif;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;

/** 
 * Описание места проведения операций по изменению, удалению, уничтожению или замене средств идентификации
 */
public class OperationPlaceType extends CUCustomsType
{
    private String informationTypeCode;
    private String inspPlaceName;
    private List<String> inspPlaceDescList = new ArrayList<String>();
    private WarehousePlaceType warehousePlace;
    private AddressType address;

    /** 
     * Get the 'InformationTypeCode' element value. Тип информации: 11- СВХ;  21- ТС; 25 - Свободный склад; 31- Склад получателя; 41 - Склад хранения собственных товаров (для РК); 52 - Транспортное средство (для РК); 60 - Помещение (площадки) УЭО; 72 - ЗТК (для РБ); 91 - Адрес места хранения  (для РБ); 99 - Иное место ВХ, 80- ОЭЗ
     * 
     * @return value
     */
    public String getInformationTypeCode() {
        return informationTypeCode;
    }

    /** 
     * Set the 'InformationTypeCode' element value. Тип информации: 11- СВХ;  21- ТС; 25 - Свободный склад; 31- Склад получателя; 41 - Склад хранения собственных товаров (для РК); 52 - Транспортное средство (для РК); 60 - Помещение (площадки) УЭО; 72 - ЗТК (для РБ); 91 - Адрес места хранения  (для РБ); 99 - Иное место ВХ, 80- ОЭЗ
     * 
     * @param informationTypeCode
     */
    public void setInformationTypeCode(String informationTypeCode) {
        this.informationTypeCode = informationTypeCode;
    }

    /** 
     * Get the 'InspPlaceName' element value. Наименование места досмотра, СВХ, ж/д станции
     * 
     * @return value
     */
    public String getInspPlaceName() {
        return inspPlaceName;
    }

    /** 
     * Set the 'InspPlaceName' element value. Наименование места досмотра, СВХ, ж/д станции
     * 
     * @param inspPlaceName
     */
    public void setInspPlaceName(String inspPlaceName) {
        this.inspPlaceName = inspPlaceName;
    }

    /** 
     * Get the list of 'InspPlaceDesc' element items. Описание места проведения досмотра. Иная информация о месте досмотра
     * 
     * @return list
     */
    public List<String> getInspPlaceDescList() {
        return inspPlaceDescList;
    }

    /** 
     * Set the list of 'InspPlaceDesc' element items. Описание места проведения досмотра. Иная информация о месте досмотра
     * 
     * @param list
     */
    public void setInspPlaceDescList(List<String> list) {
        inspPlaceDescList = list;
    }

    /** 
     * Get the 'WarehousePlace' element value. Место погрузки/разгрузки. Сведения о лицензии/ свидетельстве склада.
     * 
     * @return value
     */
    public WarehousePlaceType getWarehousePlace() {
        return warehousePlace;
    }

    /** 
     * Set the 'WarehousePlace' element value. Место погрузки/разгрузки. Сведения о лицензии/ свидетельстве склада.
     * 
     * @param warehousePlace
     */
    public void setWarehousePlace(WarehousePlaceType warehousePlace) {
        this.warehousePlace = warehousePlace;
    }

    /** 
     * Get the 'Address' element value. Адрес 
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес 
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
