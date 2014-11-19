
package ru.acs.fts.schemas.album.instrinspection;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���� ��������
 */
public class InspGoalType
{
    private String goodsIdent;
    private String spotCheck;
    private String otherGoals;
    private List<String> goalsDescList = new ArrayList<String>();

    /** 
     * Get the 'GoodsIdent' element value. ������������� �������
     * 
     * @return value
     */
    public String getGoodsIdent() {
        return goodsIdent;
    }

    /** 
     * Set the 'GoodsIdent' element value. ������������� �������
     * 
     * @param goodsIdent
     */
    public void setGoodsIdent(String goodsIdent) {
        this.goodsIdent = goodsIdent;
    }

    /** 
     * Get the 'SpotCheck' element value. ���������� ��������
     * 
     * @return value
     */
    public String getSpotCheck() {
        return spotCheck;
    }

    /** 
     * Set the 'SpotCheck' element value. ���������� ��������
     * 
     * @param spotCheck
     */
    public void setSpotCheck(String spotCheck) {
        this.spotCheck = spotCheck;
    }

    /** 
     * Get the 'OtherGoals' element value. ������
     * 
     * @return value
     */
    public String getOtherGoals() {
        return otherGoals;
    }

    /** 
     * Set the 'OtherGoals' element value. ������
     * 
     * @param otherGoals
     */
    public void setOtherGoals(String otherGoals) {
        this.otherGoals = otherGoals;
    }

    /** 
     * Get the list of 'GoalsDesc' element items. �������������� ����������
     * 
     * @return list
     */
    public List<String> getGoalsDescList() {
        return goalsDescList;
    }

    /** 
     * Set the list of 'GoalsDesc' element items. �������������� ����������
     * 
     * @param list
     */
    public void setGoalsDescList(List<String> list) {
        goalsDescList = list;
    }
}
