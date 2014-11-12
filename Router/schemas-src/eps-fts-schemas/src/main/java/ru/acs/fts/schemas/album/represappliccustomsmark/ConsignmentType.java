
package ru.acs.fts.schemas.album.represappliccustomsmark;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * �������� � ������
 */
public class ConsignmentType
{
    private String decision;
    private LocalDate decisionDate;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private List<WayBillType> wayBillList = new ArrayList<WayBillType>();

    /** 
     * Get the 'Decision' element value. �������� �������: 1 - ������ � ������� ���������� ��������; 2 - ������ � ������������� �� ������ ���������� ��������; 3 - ����� � �������; 4 - ���������� �� �������������� � �������� ����
     * 
     * @return value
     */
    public String getDecision() {
        return decision;
    }

    /** 
     * Set the 'Decision' element value. �������� �������: 1 - ������ � ������� ���������� ��������; 2 - ������ � ������������� �� ������ ���������� ��������; 3 - ����� � �������; 4 - ���������� �� �������������� � �������� ����
     * 
     * @param decision
     */
    public void setDecision(String decision) {
        this.decision = decision;
    }

    /** 
     * Get the 'DecisionDate' element value. ���� �������� �������
     * 
     * @return value
     */
    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    /** 
     * Set the 'DecisionDate' element value. ���� �������� �������
     * 
     * @param decisionDate
     */
    public void setDecisionDate(LocalDate decisionDate) {
        this.decisionDate = decisionDate;
    }

    /** 
     * Get the list of 'Goods' element items. �������� � �������
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� � �������
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the list of 'WayBill' element items. �������� � ���������
     * 
     * @return list
     */
    public List<WayBillType> getWayBillList() {
        return wayBillList;
    }

    /** 
     * Set the list of 'WayBill' element items. �������� � ���������
     * 
     * @param list
     */
    public void setWayBillList(List<WayBillType> list) {
        wayBillList = list;
    }
}
