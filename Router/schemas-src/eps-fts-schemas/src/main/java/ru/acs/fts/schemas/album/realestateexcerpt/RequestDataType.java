
package ru.acs.fts.schemas.album.realestateexcerpt;

import java.util.ArrayList;
import java.util.List;

/** 
 * Запрашиваемые сведения
 */
public class RequestDataType
{
    private String requestSign;
    private EstateObjectType estateObject;
    private OwnerType owner;
    private TerritoryType territory;
    private RequestPeriodType requestPeriod;
    private List<DocRequestType> docRequestList = new ArrayList<DocRequestType>();

    /** 
     * Get the 'RequestSign' element value. Выписка из Единого государственного реестра: 1 - об объекте недвижимости; 2 -  о правах отдельного лица на имеющиеся у него объекты недвижимого имущества; 3 - сведения по документу; 4 - о признании правообладателя недееспособным или ограниченно дееспособным
     * 
     * @return value
     */
    public String getRequestSign() {
        return requestSign;
    }

    /** 
     * Set the 'RequestSign' element value. Выписка из Единого государственного реестра: 1 - об объекте недвижимости; 2 -  о правах отдельного лица на имеющиеся у него объекты недвижимого имущества; 3 - сведения по документу; 4 - о признании правообладателя недееспособным или ограниченно дееспособным
     * 
     * @param requestSign
     */
    public void setRequestSign(String requestSign) {
        this.requestSign = requestSign;
    }

    /** 
     * Get the 'EstateObject' element value. Объект недвижимости
     * 
     * @return value
     */
    public EstateObjectType getEstateObject() {
        return estateObject;
    }

    /** 
     * Set the 'EstateObject' element value. Объект недвижимости
     * 
     * @param estateObject
     */
    public void setEstateObject(EstateObjectType estateObject) {
        this.estateObject = estateObject;
    }

    /** 
     * Get the 'Owner' element value. Владелец объекта недвижимого имущества
     * 
     * @return value
     */
    public OwnerType getOwner() {
        return owner;
    }

    /** 
     * Set the 'Owner' element value. Владелец объекта недвижимого имущества
     * 
     * @param owner
     */
    public void setOwner(OwnerType owner) {
        this.owner = owner;
    }

    /** 
     * Get the 'Territory' element value. Территория РФ
     * 
     * @return value
     */
    public TerritoryType getTerritory() {
        return territory;
    }

    /** 
     * Set the 'Territory' element value. Территория РФ
     * 
     * @param territory
     */
    public void setTerritory(TerritoryType territory) {
        this.territory = territory;
    }

    /** 
     * Get the 'RequestPeriod' element value. Период времени, за который необходимо предоставить сведения
     * 
     * @return value
     */
    public RequestPeriodType getRequestPeriod() {
        return requestPeriod;
    }

    /** 
     * Set the 'RequestPeriod' element value. Период времени, за который необходимо предоставить сведения
     * 
     * @param requestPeriod
     */
    public void setRequestPeriod(RequestPeriodType requestPeriod) {
        this.requestPeriod = requestPeriod;
    }

    /** 
     * Get the list of 'DocRequest' element items. Запрос документа
     * 
     * @return list
     */
    public List<DocRequestType> getDocRequestList() {
        return docRequestList;
    }

    /** 
     * Set the list of 'DocRequest' element items. Запрос документа
     * 
     * @param list
     */
    public void setDocRequestList(List<DocRequestType> list) {
        docRequestList = list;
    }
}
