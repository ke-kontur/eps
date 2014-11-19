
package ru.acs.fts.schemas.album.represappliccustomsmark;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ������
 */
public class ConsignmentType
{
    private String listNumeric;
    private DocumentBaseType individualWayBill;
    private String decision;
    private LocalDate decisionDate;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private CustomsDutiesType customsDuties;
    private DocumentBaseType TPOInfo;

    /** 
     * Get the 'ListNumeric' element value. ����� ������ ������� �� �������
     * 
     * @return value
     */
    public String getListNumeric() {
        return listNumeric;
    }

    /** 
     * Set the 'ListNumeric' element value. ����� ������ ������� �� �������
     * 
     * @param listNumeric
     */
    public void setListNumeric(String listNumeric) {
        this.listNumeric = listNumeric;
    }

    /** 
     * Get the 'IndividualWayBill' element value. �������� �� �������������� ���������
     * 
     * @return value
     */
    public DocumentBaseType getIndividualWayBill() {
        return individualWayBill;
    }

    /** 
     * Set the 'IndividualWayBill' element value. �������� �� �������������� ���������
     * 
     * @param individualWayBill
     */
    public void setIndividualWayBill(DocumentBaseType individualWayBill) {
        this.individualWayBill = individualWayBill;
    }

    /** 
     * Get the 'Decision' element value. �������� �������: 1 - ����� � ������� ������� (��������� ������ ���������� ��������), 2 - ������ ������� ��� ������ ���������� ��������, 3 - ������ ������� � ������� ���������� ��������, 4 - ����� � ������� �������, 5 - ������ ������������ �������.
     * 
     * @return value
     */
    public String getDecision() {
        return decision;
    }

    /** 
     * Set the 'Decision' element value. �������� �������: 1 - ����� � ������� ������� (��������� ������ ���������� ��������), 2 - ������ ������� ��� ������ ���������� ��������, 3 - ������ ������� � ������� ���������� ��������, 4 - ����� � ������� �������, 5 - ������ ������������ �������.
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
     * Get the 'CustomsDuties' element value. ���������� �������, ���������� ������
     * 
     * @return value
     */
    public CustomsDutiesType getCustomsDuties() {
        return customsDuties;
    }

    /** 
     * Set the 'CustomsDuties' element value. ���������� �������, ���������� ������
     * 
     * @param customsDuties
     */
    public void setCustomsDuties(CustomsDutiesType customsDuties) {
        this.customsDuties = customsDuties;
    }

    /** 
     * Get the 'TPOInfo' element value. �������� � ���
     * 
     * @return value
     */
    public DocumentBaseType getTPOInfo() {
        return TPOInfo;
    }

    /** 
     * Set the 'TPOInfo' element value. �������� � ���
     * 
     * @param TPOInfo
     */
    public void setTPOInfo(DocumentBaseType TPOInfo) {
        this.TPOInfo = TPOInfo;
    }
}
