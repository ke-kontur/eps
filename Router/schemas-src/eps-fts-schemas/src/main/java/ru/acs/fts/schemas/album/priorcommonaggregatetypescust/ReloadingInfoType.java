
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Информация о планируемых перегрузках товаров или иных грузовых операциях в пути
 */
public class ReloadingInfoType
{
    private String reloadCountryCode;
    private String reloadCountryName;
    private String reloadCustomsCode;
    private String reloadCustomsName;
    private String containerIndicator;
    private List<String> containerIDList = new ArrayList<String>();
    private List<TransportMeansType> reloadTransportMeanList = new ArrayList<TransportMeansType>();

    /** 
     * Get the 'ReloadCountryCode' element value. Код страны перегрузки товаров
     * 
     * @return value
     */
    public String getReloadCountryCode() {
        return reloadCountryCode;
    }

    /** 
     * Set the 'ReloadCountryCode' element value. Код страны перегрузки товаров
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
     * Get the 'ReloadCustomsCode' element value. Код таможенного органа перегрузки товаров
     * 
     * @return value
     */
    public String getReloadCustomsCode() {
        return reloadCustomsCode;
    }

    /** 
     * Set the 'ReloadCustomsCode' element value. Код таможенного органа перегрузки товаров
     * 
     * @param reloadCustomsCode
     */
    public void setReloadCustomsCode(String reloadCustomsCode) {
        this.reloadCustomsCode = reloadCustomsCode;
    }

    /** 
     * Get the 'ReloadCustomsName' element value. Наименование таможенного органа перегрузки товаров
     * 
     * @return value
     */
    public String getReloadCustomsName() {
        return reloadCustomsName;
    }

    /** 
     * Set the 'ReloadCustomsName' element value. Наименование таможенного органа перегрузки товаров
     * 
     * @param reloadCustomsName
     */
    public void setReloadCustomsName(String reloadCustomsName) {
        this.reloadCustomsName = reloadCustomsName;
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
     * Get the list of 'ContainerID' element items. Номер нового контейнера
     * 
     * @return list
     */
    public List<String> getContainerIDList() {
        return containerIDList;
    }

    /** 
     * Set the list of 'ContainerID' element items. Номер нового контейнера
     * 
     * @param list
     */
    public void setContainerIDList(List<String> list) {
        containerIDList = list;
    }

    /** 
     * Get the list of 'ReloadTransportMeans' element items. Новое транспортное средство
     * 
     * @return list
     */
    public List<TransportMeansType> getReloadTransportMeanList() {
        return reloadTransportMeanList;
    }

    /** 
     * Set the list of 'ReloadTransportMeans' element items. Новое транспортное средство
     * 
     * @param list
     */
    public void setReloadTransportMeanList(List<TransportMeansType> list) {
        reloadTransportMeanList = list;
    }
}
