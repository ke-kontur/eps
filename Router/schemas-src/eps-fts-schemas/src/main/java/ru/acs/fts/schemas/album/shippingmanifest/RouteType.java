
package ru.acs.fts.schemas.album.shippingmanifest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ������� �������� 
 */
public class RouteType
{
    private String from;
    private String to;
    private String goodsDescription;
    private List<String> TTNNumberList = new ArrayList<String>();
    private OrganizationBaseType client;

    /** 
     * Get the 'From' element value. ��� ����� 
     * 
     * @return value
     */
    public String getFrom() {
        return from;
    }

    /** 
     * Set the 'From' element value. ��� ����� 
     * 
     * @param from
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /** 
     * Get the 'To' element value. ���� ��������� 
     * 
     * @return value
     */
    public String getTo() {
        return to;
    }

    /** 
     * Set the 'To' element value. ���� ��������� 
     * 
     * @param to
     */
    public void setTo(String to) {
        this.to = to;
    }

    /** 
     * Get the 'GoodsDescription' element value. ������������ ����� 
     * 
     * @return value
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. ������������ ����� 
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the list of 'TTNNumber' element items. ����� ����������� �������-������������ ��������� 
     * 
     * @return list
     */
    public List<String> getTTNNumberList() {
        return TTNNumberList;
    }

    /** 
     * Set the list of 'TTNNumber' element items. ����� ����������� �������-������������ ��������� 
     * 
     * @param list
     */
    public void setTTNNumberList(List<String> list) {
        TTNNumberList = list;
    }

    /** 
     * Get the 'Client' element value. �������� 
     * 
     * @return value
     */
    public OrganizationBaseType getClient() {
        return client;
    }

    /** 
     * Set the 'Client' element value. �������� 
     * 
     * @param client
     */
    public void setClient(OrganizationBaseType client) {
        this.client = client;
    }
}
