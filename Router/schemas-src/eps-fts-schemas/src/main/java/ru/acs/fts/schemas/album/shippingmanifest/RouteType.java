
package ru.acs.fts.schemas.album.shippingmanifest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Участок маршрута 
 */
public class RouteType
{
    private String from;
    private String to;
    private String goodsDescription;
    private List<String> TTNNumberList = new ArrayList<String>();
    private OrganizationBaseType client;

    /** 
     * Get the 'From' element value. Где взять 
     * 
     * @return value
     */
    public String getFrom() {
        return from;
    }

    /** 
     * Set the 'From' element value. Где взять 
     * 
     * @param from
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /** 
     * Get the 'To' element value. Куда доставить 
     * 
     * @return value
     */
    public String getTo() {
        return to;
    }

    /** 
     * Set the 'To' element value. Куда доставить 
     * 
     * @param to
     */
    public void setTo(String to) {
        this.to = to;
    }

    /** 
     * Get the 'GoodsDescription' element value. Наименование груза 
     * 
     * @return value
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. Наименование груза 
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the list of 'TTNNumber' element items. Номер приложенной товарно-транспортной накладной 
     * 
     * @return list
     */
    public List<String> getTTNNumberList() {
        return TTNNumberList;
    }

    /** 
     * Set the list of 'TTNNumber' element items. Номер приложенной товарно-транспортной накладной 
     * 
     * @param list
     */
    public void setTTNNumberList(List<String> list) {
        TTNNumberList = list;
    }

    /** 
     * Get the 'Client' element value. Заказчик 
     * 
     * @return value
     */
    public OrganizationBaseType getClient() {
        return client;
    }

    /** 
     * Set the 'Client' element value. Заказчик 
     * 
     * @param client
     */
    public void setClient(OrganizationBaseType client) {
        this.client = client;
    }
}
