
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;

/** 
 * Сведения о перевозке товаров. Гр. 15, 15а, 17,17а, 18, 19, 21, 25, 26, 29  -ДТ/ Гр. 15, 17, 18, 19, 21, 25, 26, 29 , 53, 55- ТД
 */
public class ESADConsigmentType
{
    private String containerIndicator;
    private String dispatchCountryCode;
    private String RBDispatchCountryCode;
    private String dispatchCountryName;
    private String destinationCountryCode;
    private String destinationCountryName;
    private String RBDestinationCountryCode;
    private CUCustomsType deliveryCustomsOffice;
    private List<CUCustomsType> borderCustomsOfficeList = new ArrayList<CUCustomsType>();

    /** 
     * Get the 'ContainerIndicator' element value. Признак контейнерных перевозок. Гр.19 
     * 
     * @return value
     */
    public String getContainerIndicator() {
        return containerIndicator;
    }

    /** 
     * Set the 'ContainerIndicator' element value. Признак контейнерных перевозок. Гр.19 
     * 
     * @param containerIndicator
     */
    public void setContainerIndicator(String containerIndicator) {
        this.containerIndicator = containerIndicator;
    }

    /** 
     * Get the 'DispatchCountryCode' element value. Страна отправления. Буквенный код по  классификатору стран мира .гр 15, подраздел a 
     * 
     * @return value
     */
    public String getDispatchCountryCode() {
        return dispatchCountryCode;
    }

    /** 
     * Set the 'DispatchCountryCode' element value. Страна отправления. Буквенный код по  классификатору стран мира .гр 15, подраздел a 
     * 
     * @param dispatchCountryCode
     */
    public void setDispatchCountryCode(String dispatchCountryCode) {
        this.dispatchCountryCode = dispatchCountryCode;
    }

    /** 
     * Get the 'RBDispatchCountryCode' element value. Код административно-территориального деления страны отправления в соответствии с классификатором административно-территориального деления стран, применяемым в Республике Беларусь. Гр.15,  подраздел b
     * 
     * @return value
     */
    public String getRBDispatchCountryCode() {
        return RBDispatchCountryCode;
    }

    /** 
     * Set the 'RBDispatchCountryCode' element value. Код административно-территориального деления страны отправления в соответствии с классификатором административно-территориального деления стран, применяемым в Республике Беларусь. Гр.15,  подраздел b
     * 
     * @param RBDispatchCountryCode
     */
    public void setRBDispatchCountryCode(String RBDispatchCountryCode) {
        this.RBDispatchCountryCode = RBDispatchCountryCode;
    }

    /** 
     * Get the 'DispatchCountryName' element value. Страна отправления. Краткое наименование. Гр.15
     * 
     * @return value
     */
    public String getDispatchCountryName() {
        return dispatchCountryName;
    }

    /** 
     * Set the 'DispatchCountryName' element value. Страна отправления. Краткое наименование. Гр.15
     * 
     * @param dispatchCountryName
     */
    public void setDispatchCountryName(String dispatchCountryName) {
        this.dispatchCountryName = dispatchCountryName;
    }

    /** 
     * Get the 'DestinationCountryCode' element value. Страна назначения. Буквенный код по классификатору стран мира / 00 (неизвестна). Гр 17, подраздел a
     * 
     * @return value
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /** 
     * Set the 'DestinationCountryCode' element value. Страна назначения. Буквенный код по классификатору стран мира / 00 (неизвестна). Гр 17, подраздел a
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    /** 
     * Get the 'DestinationCountryName' element value. Страна назначения. Гр.17 Наименование / НЕИЗВЕСТНА
     * 
     * @return value
     */
    public String getDestinationCountryName() {
        return destinationCountryName;
    }

    /** 
     * Set the 'DestinationCountryName' element value. Страна назначения. Гр.17 Наименование / НЕИЗВЕСТНА
     * 
     * @param destinationCountryName
     */
    public void setDestinationCountryName(String destinationCountryName) {
        this.destinationCountryName = destinationCountryName;
    }

    /** 
     * Get the 'RBDestinationCountryCode' element value. Код административно-территориального деления страны назначения в соответствии с классификатором административно-территориального деления стран, применяемым в Республике Беларусь. Гр.17,  подраздел b
     * 
     * @return value
     */
    public String getRBDestinationCountryCode() {
        return RBDestinationCountryCode;
    }

    /** 
     * Set the 'RBDestinationCountryCode' element value. Код административно-территориального деления страны назначения в соответствии с классификатором административно-территориального деления стран, применяемым в Республике Беларусь. Гр.17,  подраздел b
     * 
     * @param RBDestinationCountryCode
     */
    public void setRBDestinationCountryCode(String RBDestinationCountryCode) {
        this.RBDestinationCountryCode = RBDestinationCountryCode;
    }

    /** 
     * Get the 'DeliveryCustomsOffice' element value. Таможенный орган назначения при транзите.гр.53 ТД.
     * 
     * @return value
     */
    public CUCustomsType getDeliveryCustomsOffice() {
        return deliveryCustomsOffice;
    }

    /** 
     * Set the 'DeliveryCustomsOffice' element value. Таможенный орган назначения при транзите.гр.53 ТД.
     * 
     * @param deliveryCustomsOffice
     */
    public void setDeliveryCustomsOffice(CUCustomsType deliveryCustomsOffice) {
        this.deliveryCustomsOffice = deliveryCustomsOffice;
    }

    /** 
     * Get the list of 'BorderCustomsOffice' element items. Таможенный орган въезда/выезда. Гр.29
     * 
     * @return list
     */
    public List<CUCustomsType> getBorderCustomsOfficeList() {
        return borderCustomsOfficeList;
    }

    /** 
     * Set the list of 'BorderCustomsOffice' element items. Таможенный орган въезда/выезда. Гр.29
     * 
     * @param list
     */
    public void setBorderCustomsOfficeList(List<CUCustomsType> list) {
        borderCustomsOfficeList = list;
    }
}
