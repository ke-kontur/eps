
package ru.acs.fts.schemas.album.actinspection;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Описание места проведения досмотра. 
 */
public class InspectionPlaceType extends CustomsType
{
    private String informationTypeCode;
    private String inspPlaceName;
    private List<String> inspPlaceDescList = new ArrayList<String>();
    private AddressType inspAddress;
    private WarehousePlaceType warehousePlace;

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
     * Get the 'InspAddress' element value. Адрес места досмотра (заполняется, в случае досмотра вне СВХ)
     * 
     * @return value
     */
    public AddressType getInspAddress() {
        return inspAddress;
    }

    /** 
     * Set the 'InspAddress' element value. Адрес места досмотра (заполняется, в случае досмотра вне СВХ)
     * 
     * @param inspAddress
     */
    public void setInspAddress(AddressType inspAddress) {
        this.inspAddress = inspAddress;
    }

    /** 
     * Get the 'WarehousePlace' element value. Сведения об СВХ/ЗТК
     * 
     * @return value
     */
    public WarehousePlaceType getWarehousePlace() {
        return warehousePlace;
    }

    /** 
     * Set the 'WarehousePlace' element value. Сведения об СВХ/ЗТК
     * 
     * @param warehousePlace
     */
    public void setWarehousePlace(WarehousePlaceType warehousePlace) {
        this.warehousePlace = warehousePlace;
    }
}
