
package ru.acs.fts.schemas.album.reswhgoodsprolong;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * ������� ��������� ����� �� ������� ������
 */
public class GoodsDecisionType
{
    private String goodsNumeric;
    private LocalDate reqPeriod;
    private List<String> reasonList = new ArrayList<String>();

    /** 
     * Get the 'GoodsNumeric' element value. ����� ������ �� ��1
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ����� ������ �� ��1
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'ReqPeriod' element value. ������������� ����
     * 
     * @return value
     */
    public LocalDate getReqPeriod() {
        return reqPeriod;
    }

    /** 
     * Set the 'ReqPeriod' element value. ������������� ����
     * 
     * @param reqPeriod
     */
    public void setReqPeriod(LocalDate reqPeriod) {
        this.reqPeriod = reqPeriod;
    }

    /** 
     * Get the list of 'Reason' element items. �����������
     * 
     * @return list
     */
    public List<String> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reason' element items. �����������
     * 
     * @param list
     */
    public void setReasonList(List<String> list) {
        reasonList = list;
    }
}
