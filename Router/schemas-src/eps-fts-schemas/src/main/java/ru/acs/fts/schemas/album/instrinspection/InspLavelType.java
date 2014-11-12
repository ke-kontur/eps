
package ru.acs.fts.schemas.album.instrinspection;

import java.util.ArrayList;
import java.util.List;

/** 
 * —тепень досмотра
 */
public class InspLavelType
{
    private String withdrWeight;
    private String otherLevel;
    private List<String> levelDescriptionList = new ArrayList<String>();
    private ReCountPackType reCountPack;
    private ReCountItemType reCountItem;
    private FeatureFindingType featureFinding;

    /** 
     * Get the 'WithdrWeight' element value. ¬звешивание (полное/выборочное/без взвешивани€).≈сли значение пол€: 1 - полное; 2 - выборочное; 3 - без взвешивани€.
     * 
     * @return value
     */
    public String getWithdrWeight() {
        return withdrWeight;
    }

    /** 
     * Set the 'WithdrWeight' element value. ¬звешивание (полное/выборочное/без взвешивани€).≈сли значение пол€: 1 - полное; 2 - выборочное; 3 - без взвешивани€.
     * 
     * @param withdrWeight
     */
    public void setWithdrWeight(String withdrWeight) {
        this.withdrWeight = withdrWeight;
    }

    /** 
     * Get the 'OtherLevel' element value. ѕрочее
     * 
     * @return value
     */
    public String getOtherLevel() {
        return otherLevel;
    }

    /** 
     * Set the 'OtherLevel' element value. ѕрочее
     * 
     * @param otherLevel
     */
    public void setOtherLevel(String otherLevel) {
        this.otherLevel = otherLevel;
    }

    /** 
     * Get the list of 'LevelDescription' element items. ќписание дополнительных  условий
     * 
     * @return list
     */
    public List<String> getLevelDescriptionList() {
        return levelDescriptionList;
    }

    /** 
     * Set the list of 'LevelDescription' element items. ќписание дополнительных  условий
     * 
     * @param list
     */
    public void setLevelDescriptionList(List<String> list) {
        levelDescriptionList = list;
    }

    /** 
     * Get the 'ReCountPack' element value. ѕересчет грузовых мест
     * 
     * @return value
     */
    public ReCountPackType getReCountPack() {
        return reCountPack;
    }

    /** 
     * Set the 'ReCountPack' element value. ѕересчет грузовых мест
     * 
     * @param reCountPack
     */
    public void setReCountPack(ReCountPackType reCountPack) {
        this.reCountPack = reCountPack;
    }

    /** 
     * Get the 'ReCountItem' element value. ѕересчет количества предметов в грузовых местах
     * 
     * @return value
     */
    public ReCountItemType getReCountItem() {
        return reCountItem;
    }

    /** 
     * Set the 'ReCountItem' element value. ѕересчет количества предметов в грузовых местах
     * 
     * @param reCountItem
     */
    public void setReCountItem(ReCountItemType reCountItem) {
        this.reCountItem = reCountItem;
    }

    /** 
     * Get the 'FeatureFinding' element value. »змерение и определение характеристик товаров (с частичной разборкой/с полной разборкой)
     * 
     * @return value
     */
    public FeatureFindingType getFeatureFinding() {
        return featureFinding;
    }

    /** 
     * Set the 'FeatureFinding' element value. »змерение и определение характеристик товаров (с частичной разборкой/с полной разборкой)
     * 
     * @param featureFinding
     */
    public void setFeatureFinding(FeatureFindingType featureFinding) {
        this.featureFinding = featureFinding;
    }
}
