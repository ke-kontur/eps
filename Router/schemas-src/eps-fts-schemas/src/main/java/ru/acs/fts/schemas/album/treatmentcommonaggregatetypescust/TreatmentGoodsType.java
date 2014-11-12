
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������ ��� �����������
 */
public class TreatmentGoodsType
{
    private List<String> treatmentsGoodsInfoList = new ArrayList<String>();
    private List<TreatProductsType> trGoodsItemList = new ArrayList<TreatProductsType>();

    /** 
     * Get the list of 'TreatmentsGoodsInfo' element items. �������������� �������� � ��. "������ ��� �����������"
     * 
     * @return list
     */
    public List<String> getTreatmentsGoodsInfoList() {
        return treatmentsGoodsInfoList;
    }

    /** 
     * Set the list of 'TreatmentsGoodsInfo' element items. �������������� �������� � ��. "������ ��� �����������"
     * 
     * @param list
     */
    public void setTreatmentsGoodsInfoList(List<String> list) {
        treatmentsGoodsInfoList = list;
    }

    /** 
     * Get the list of 'TrGoodsItem' element items. �������� ������ ��� �����������
     * 
     * @return list
     */
    public List<TreatProductsType> getTrGoodsItemList() {
        return trGoodsItemList;
    }

    /** 
     * Set the list of 'TrGoodsItem' element items. �������� ������ ��� �����������
     * 
     * @param list
     */
    public void setTrGoodsItemList(List<TreatProductsType> list) {
        trGoodsItemList = list;
    }
}
