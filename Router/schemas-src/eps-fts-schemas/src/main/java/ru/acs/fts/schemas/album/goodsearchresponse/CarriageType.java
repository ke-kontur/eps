
package ru.acs.fts.schemas.album.goodsearchresponse;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * �������� � ������������ ��������
 */
public class CarriageType extends TransportMeansBaseType
{
    private LocalDate arrivalDate;
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();

    /** 
     * Get the 'ArrivalDate' element value. ���� ��������
     * 
     * @return value
     */
    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    /** 
     * Set the 'ArrivalDate' element value. ���� ��������
     * 
     * @param arrivalDate
     */
    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. �������� ������
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. �������� ������
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
    }
}
