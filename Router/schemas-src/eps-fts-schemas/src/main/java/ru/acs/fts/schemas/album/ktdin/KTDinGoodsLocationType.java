
package ru.acs.fts.schemas.album.ktdin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUGoodsLocationPlaceType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUTransportType;

/** 
 * Местонахождение товаров. Гр. 30
 */
public class KTDinGoodsLocationType
{
    private String ITN;
    private String informationTypeCode;
    private String customsOffice;
    private String customsCountryCode;
    private String locationName;
    private CUTransportType transport;
    private CUWarehousePlaceType goodsLocationWarehouse;
    private CUGoodsLocationPlaceType goodsLocationPlace;
    private AddressType address;

    /** 
     * Get the 'ITN' element value. ИТН субъекта ВЭД
     * 
     * @return value
     */
    public String getITN() {
        return ITN;
    }

    /** 
     * Set the 'ITN' element value. ИТН субъекта ВЭД
     * 
     * @param ITN
     */
    public void setITN(String ITN) {
        this.ITN = ITN;
    }

    /** 
     * Get the 'InformationTypeCode' element value. Код места нахождения товаров в соответствии c Классификатором мест нахождения товаров
     * 
     * @return value
     */
    public String getInformationTypeCode() {
        return informationTypeCode;
    }

    /** 
     * Set the 'InformationTypeCode' element value. Код места нахождения товаров в соответствии c Классификатором мест нахождения товаров
     * 
     * @param informationTypeCode
     */
    public void setInformationTypeCode(String informationTypeCode) {
        this.informationTypeCode = informationTypeCode;
    }

    /** 
     * Get the 'CustomsOffice' element value. Код таможенного органа в соответствии с Классификаторами таможенных органов, применяемыми в государствах - членах Таможенного союза
     * 
     * @return value
     */
    public String getCustomsOffice() {
        return customsOffice;
    }

    /** 
     * Set the 'CustomsOffice' element value. Код таможенного органа в соответствии с Классификаторами таможенных органов, применяемыми в государствах - членах Таможенного союза
     * 
     * @param customsOffice
     */
    public void setCustomsOffice(String customsOffice) {
        this.customsOffice = customsOffice;
    }

    /** 
     * Get the 'CustomsCountryCode' element value. Код страны таможенного органа
     * 
     * @return value
     */
    public String getCustomsCountryCode() {
        return customsCountryCode;
    }

    /** 
     * Set the 'CustomsCountryCode' element value. Код страны таможенного органа
     * 
     * @param customsCountryCode
     */
    public void setCustomsCountryCode(String customsCountryCode) {
        this.customsCountryCode = customsCountryCode;
    }

    /** 
     * Get the 'LocationName' element value. Наименование железнодорожной станции/морского (речного) порта
     * 
     * @return value
     */
    public String getLocationName() {
        return locationName;
    }

    /** 
     * Set the 'LocationName' element value. Наименование железнодорожной станции/морского (речного) порта
     * 
     * @param locationName
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /** 
     * Get the 'Transport' element value. Сведения о местонахождении товаров - транспортное средство
     * 
     * @return value
     */
    public CUTransportType getTransport() {
        return transport;
    }

    /** 
     * Set the 'Transport' element value. Сведения о местонахождении товаров - транспортное средство
     * 
     * @param transport
     */
    public void setTransport(CUTransportType transport) {
        this.transport = transport;
    }

    /** 
     * Get the 'GoodsLocationWarehouse' element value. Сведения о местонахождении товаров: разрешение таможенного органа на временное хранение товаров, склад временного хранения, таможенный склад, свободный склад, магазин беспошлинной торговли, помещение, открытые площадки и иные территории уполномоченного экономического оператора, склад хранения собственных товаров, склад получателя товаров
     * 
     * @return value
     */
    public CUWarehousePlaceType getGoodsLocationWarehouse() {
        return goodsLocationWarehouse;
    }

    /** 
     * Set the 'GoodsLocationWarehouse' element value. Сведения о местонахождении товаров: разрешение таможенного органа на временное хранение товаров, склад временного хранения, таможенный склад, свободный склад, магазин беспошлинной торговли, помещение, открытые площадки и иные территории уполномоченного экономического оператора, склад хранения собственных товаров, склад получателя товаров
     * 
     * @param goodsLocationWarehouse
     */
    public void setGoodsLocationWarehouse(
            CUWarehousePlaceType goodsLocationWarehouse) {
        this.goodsLocationWarehouse = goodsLocationWarehouse;
    }

    /** 
     * Get the 'GoodsLocationPlace' element value. Сведения о местонахождении товара
     * 
     * @return value
     */
    public CUGoodsLocationPlaceType getGoodsLocationPlace() {
        return goodsLocationPlace;
    }

    /** 
     * Set the 'GoodsLocationPlace' element value. Сведения о местонахождении товара
     * 
     * @param goodsLocationPlace
     */
    public void setGoodsLocationPlace(
            CUGoodsLocationPlaceType goodsLocationPlace) {
        this.goodsLocationPlace = goodsLocationPlace;
    }

    /** 
     * Get the 'Address' element value. Адрес местонахождения товаров
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес местонахождения товаров
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
