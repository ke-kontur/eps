
package ru.acs.fts.schemas.album.instrinspection;

import java.util.ArrayList;
import java.util.List;

/** 
 * Цель досмотра
 */
public class InspGoalType
{
    private String goodsIdent;
    private String spotCheck;
    private String otherGoals;
    private List<String> goalsDescList = new ArrayList<String>();

    /** 
     * Get the 'GoodsIdent' element value. Идентификация товаров
     * 
     * @return value
     */
    public String getGoodsIdent() {
        return goodsIdent;
    }

    /** 
     * Set the 'GoodsIdent' element value. Идентификация товаров
     * 
     * @param goodsIdent
     */
    public void setGoodsIdent(String goodsIdent) {
        this.goodsIdent = goodsIdent;
    }

    /** 
     * Get the 'SpotCheck' element value. Выборочная проверка
     * 
     * @return value
     */
    public String getSpotCheck() {
        return spotCheck;
    }

    /** 
     * Set the 'SpotCheck' element value. Выборочная проверка
     * 
     * @param spotCheck
     */
    public void setSpotCheck(String spotCheck) {
        this.spotCheck = spotCheck;
    }

    /** 
     * Get the 'OtherGoals' element value. Прочее
     * 
     * @return value
     */
    public String getOtherGoals() {
        return otherGoals;
    }

    /** 
     * Set the 'OtherGoals' element value. Прочее
     * 
     * @param otherGoals
     */
    public void setOtherGoals(String otherGoals) {
        this.otherGoals = otherGoals;
    }

    /** 
     * Get the list of 'GoalsDesc' element items. Дополнительная информация
     * 
     * @return list
     */
    public List<String> getGoalsDescList() {
        return goalsDescList;
    }

    /** 
     * Set the list of 'GoalsDesc' element items. Дополнительная информация
     * 
     * @param list
     */
    public void setGoalsDescList(List<String> list) {
        goalsDescList = list;
    }
}
