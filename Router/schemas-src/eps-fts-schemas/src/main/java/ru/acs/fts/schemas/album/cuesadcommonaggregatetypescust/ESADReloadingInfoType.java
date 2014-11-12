
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Информация о перегрузке товаров. Гр. 55 ТД
 */
public class ESADReloadingInfoType
{
    private String reloadCountryCode;
    private String reloadCountryName;
    private String containerIndicator;
    private List<TransportMeansBaseType> reloadingTransportMeanList = new ArrayList<TransportMeansBaseType>();
    private CustomsType reloadingCustomsOffice;
    private ESADReloadContainerType reloadContainer;

    /** 
     * Get the 'ReloadCountryCode' element value. Код страны перегрузки товара
     * 
     * @return value
     */
    public String getReloadCountryCode() {
        return reloadCountryCode;
    }

    /** 
     * Set the 'ReloadCountryCode' element value. Код страны перегрузки товара
     * 
     * @param reloadCountryCode
     */
    public void setReloadCountryCode(String reloadCountryCode) {
        this.reloadCountryCode = reloadCountryCode;
    }

    /** 
     * Get the 'ReloadCountryName' element value. Наименование страны перегрузки товара
     * 
     * @return value
     */
    public String getReloadCountryName() {
        return reloadCountryName;
    }

    /** 
     * Set the 'ReloadCountryName' element value. Наименование страны перегрузки товара
     * 
     * @param reloadCountryName
     */
    public void setReloadCountryName(String reloadCountryName) {
        this.reloadCountryName = reloadCountryName;
    }

    /** 
     * Get the 'ContainerIndicator' element value. Признак контейнерных перевозок
     * 
     * @return value
     */
    public String getContainerIndicator() {
        return containerIndicator;
    }

    /** 
     * Set the 'ContainerIndicator' element value. Признак контейнерных перевозок
     * 
     * @param containerIndicator
     */
    public void setContainerIndicator(String containerIndicator) {
        this.containerIndicator = containerIndicator;
    }

    /** 
     * Get the list of 'ReloadingTransportMeans' element items. Новое транспортное средство
     * 
     * @return list
     */
    public List<TransportMeansBaseType> getReloadingTransportMeanList() {
        return reloadingTransportMeanList;
    }

    /** 
     * Set the list of 'ReloadingTransportMeans' element items. Новое транспортное средство
     * 
     * @param list
     */
    public void setReloadingTransportMeanList(List<TransportMeansBaseType> list) {
        reloadingTransportMeanList = list;
    }

    /** 
     * Get the 'ReloadingCustomsOffice' element value. Таможенный орган перегрузки товаров
     * 
     * @return value
     */
    public CustomsType getReloadingCustomsOffice() {
        return reloadingCustomsOffice;
    }

    /** 
     * Set the 'ReloadingCustomsOffice' element value. Таможенный орган перегрузки товаров
     * 
     * @param reloadingCustomsOffice
     */
    public void setReloadingCustomsOffice(CustomsType reloadingCustomsOffice) {
        this.reloadingCustomsOffice = reloadingCustomsOffice;
    }

    /** 
     * Get the 'ReloadContainer' element value. Сведения о новых контейнерах
     * 
     * @return value
     */
    public ESADReloadContainerType getReloadContainer() {
        return reloadContainer;
    }

    /** 
     * Set the 'ReloadContainer' element value. Сведения о новых контейнерах
     * 
     * @param reloadContainer
     */
    public void setReloadContainer(ESADReloadContainerType reloadContainer) {
        this.reloadContainer = reloadContainer;
    }
}
