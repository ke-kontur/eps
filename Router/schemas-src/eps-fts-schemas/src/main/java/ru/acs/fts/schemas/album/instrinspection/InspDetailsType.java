
package ru.acs.fts.schemas.album.instrinspection;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения об особенностях досмотра
 */
public class InspDetailsType
{
    private InspGoalType inspGoal;
    private InspEffortType inspEffort;
    private InspLavelType inspLavel;
    private List<UseTSTKType> useTSTKList = new ArrayList<UseTSTKType>();
    private UseIdentType useIdent;

    /** 
     * Get the 'InspGoal' element value. Цель досмотра
     * 
     * @return value
     */
    public InspGoalType getInspGoal() {
        return inspGoal;
    }

    /** 
     * Set the 'InspGoal' element value. Цель досмотра
     * 
     * @param inspGoal
     */
    public void setInspGoal(InspGoalType inspGoal) {
        this.inspGoal = inspGoal;
    }

    /** 
     * Get the 'InspEffort' element value. Объем досмотра
     * 
     * @return value
     */
    public InspEffortType getInspEffort() {
        return inspEffort;
    }

    /** 
     * Set the 'InspEffort' element value. Объем досмотра
     * 
     * @param inspEffort
     */
    public void setInspEffort(InspEffortType inspEffort) {
        this.inspEffort = inspEffort;
    }

    /** 
     * Get the 'InspLavel' element value. Степень досмотра
     * 
     * @return value
     */
    public InspLavelType getInspLavel() {
        return inspLavel;
    }

    /** 
     * Set the 'InspLavel' element value. Степень досмотра
     * 
     * @param inspLavel
     */
    public void setInspLavel(InspLavelType inspLavel) {
        this.inspLavel = inspLavel;
    }

    /** 
     * Get the list of 'UseTSTK' element items. Применение ТСТК
     * 
     * @return list
     */
    public List<UseTSTKType> getUseTSTKList() {
        return useTSTKList;
    }

    /** 
     * Set the list of 'UseTSTK' element items. Применение ТСТК
     * 
     * @param list
     */
    public void setUseTSTKList(List<UseTSTKType> list) {
        useTSTKList = list;
    }

    /** 
     * Get the 'UseIdent' element value. Применение средств идентификации
     * 
     * @return value
     */
    public UseIdentType getUseIdent() {
        return useIdent;
    }

    /** 
     * Set the 'UseIdent' element value. Применение средств идентификации
     * 
     * @param useIdent
     */
    public void setUseIdent(UseIdentType useIdent) {
        this.useIdent = useIdent;
    }
}
