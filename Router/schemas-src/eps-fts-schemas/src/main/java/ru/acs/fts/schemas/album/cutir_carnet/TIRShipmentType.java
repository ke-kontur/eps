
package ru.acs.fts.schemas.album.cutir_carnet;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust.IdentityMarkType;
import ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust.TIRDestinationType;

/** 
 * Сведения о товарной партии
 */
public class TIRShipmentType
{
    private String containerIndicator;
    private List<String> containerIDList = new ArrayList<String>();
    private String totalPlacesQuantity;
    private CUOrganizationType TIRConsignor;
    private CUOrganizationType TIRConsignee;
    private TIRDestinationType destination;
    private List<TIRGoodsType> TIRGoodList = new ArrayList<TIRGoodsType>();
    private List<IdentityMarkType> identityMarkList = new ArrayList<IdentityMarkType>();

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
     * Get the list of 'ContainerID' element items. Номер контейнера
     * 
     * @return list
     */
    public List<String> getContainerIDList() {
        return containerIDList;
    }

    /** 
     * Set the list of 'ContainerID' element items. Номер контейнера
     * 
     * @param list
     */
    public void setContainerIDList(List<String> list) {
        containerIDList = list;
    }

    /** 
     * Get the 'TotalPlacesQuantity' element value. Общее число грузовых  мест
     * 
     * @return value
     */
    public String getTotalPlacesQuantity() {
        return totalPlacesQuantity;
    }

    /** 
     * Set the 'TotalPlacesQuantity' element value. Общее число грузовых  мест
     * 
     * @param totalPlacesQuantity
     */
    public void setTotalPlacesQuantity(String totalPlacesQuantity) {
        this.totalPlacesQuantity = totalPlacesQuantity;
    }

    /** 
     * Get the 'TIRConsignor' element value. Сведения об отправителе
     * 
     * @return value
     */
    public CUOrganizationType getTIRConsignor() {
        return TIRConsignor;
    }

    /** 
     * Set the 'TIRConsignor' element value. Сведения об отправителе
     * 
     * @param TIRConsignor
     */
    public void setTIRConsignor(CUOrganizationType TIRConsignor) {
        this.TIRConsignor = TIRConsignor;
    }

    /** 
     * Get the 'TIRConsignee' element value. Сведения о получателе
     * 
     * @return value
     */
    public CUOrganizationType getTIRConsignee() {
        return TIRConsignee;
    }

    /** 
     * Set the 'TIRConsignee' element value. Сведения о получателе
     * 
     * @param TIRConsignee
     */
    public void setTIRConsignee(CUOrganizationType TIRConsignee) {
        this.TIRConsignee = TIRConsignee;
    }

    /** 
     * Get the 'Destination' element value. Место назначения/доставки
     * 
     * @return value
     */
    public TIRDestinationType getDestination() {
        return destination;
    }

    /** 
     * Set the 'Destination' element value. Место назначения/доставки
     * 
     * @param destination
     */
    public void setDestination(TIRDestinationType destination) {
        this.destination = destination;
    }

    /** 
     * Get the list of 'TIRGoods' element items. Товары в книжке МДП
     * 
     * @return list
     */
    public List<TIRGoodsType> getTIRGoodList() {
        return TIRGoodList;
    }

    /** 
     * Set the list of 'TIRGoods' element items. Товары в книжке МДП
     * 
     * @param list
     */
    public void setTIRGoodList(List<TIRGoodsType> list) {
        TIRGoodList = list;
    }

    /** 
     * Get the list of 'IdentityMark' element items. Пломбы или опознавательные знаки (число, идентификация)
     * 
     * @return list
     */
    public List<IdentityMarkType> getIdentityMarkList() {
        return identityMarkList;
    }

    /** 
     * Set the list of 'IdentityMark' element items. Пломбы или опознавательные знаки (число, идентификация)
     * 
     * @param list
     */
    public void setIdentityMarkList(List<IdentityMarkType> list) {
        identityMarkList = list;
    }
}
