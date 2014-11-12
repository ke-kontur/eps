
package ru.acs.fts.schemas.album.actinspectionin;

import java.util.ArrayList;
import java.util.List;

/** 
 * Результаты таможенного досмотра
 */
public class InspectionResultType
{
    private String seizureFlag;
    private String violationFlag;
    private String ATDAdditions;
    private List<LawDecisionType> lawDecisionList = new ArrayList<LawDecisionType>();
    private List<InspTestActType> inspTestActList = new ArrayList<InspTestActType>();

    /** 
     * Get the 'SeizureFlag' element value. Признак взятия проб и образцов 0 - пробы и образцы не отбирались 1 - пробы и образцы отбирались
     * 
     * @return value
     */
    public String getSeizureFlag() {
        return seizureFlag;
    }

    /** 
     * Set the 'SeizureFlag' element value. Признак взятия проб и образцов 0 - пробы и образцы не отбирались 1 - пробы и образцы отбирались
     * 
     * @param seizureFlag
     */
    public void setSeizureFlag(String seizureFlag) {
        this.seizureFlag = seizureFlag;
    }

    /** 
     * Get the 'ViolationFlag' element value. Признак наличия административного правонарушения, отнесенного к компетенции таможенного органа: "0" - нет признаков административного правонарушения; "1" - есть признаки административного правонарушения.
     * 
     * @return value
     */
    public String getViolationFlag() {
        return violationFlag;
    }

    /** 
     * Set the 'ViolationFlag' element value. Признак наличия административного правонарушения, отнесенного к компетенции таможенного органа: "0" - нет признаков административного правонарушения; "1" - есть признаки административного правонарушения.
     * 
     * @param violationFlag
     */
    public void setViolationFlag(String violationFlag) {
        this.violationFlag = violationFlag;
    }

    /** 
     * Get the 'ATDAdditions' element value. Описание приложений к Акту досмотра
     * 
     * @return value
     */
    public String getATDAdditions() {
        return ATDAdditions;
    }

    /** 
     * Set the 'ATDAdditions' element value. Описание приложений к Акту досмотра
     * 
     * @param ATDAdditions
     */
    public void setATDAdditions(String ATDAdditions) {
        this.ATDAdditions = ATDAdditions;
    }

    /** 
     * Get the list of 'LawDecision' element items. Статьи КОАП по которым выявлены признаки АП. Общая описательная часть акта досмотра, относящаяся ко всем товарам
     * 
     * @return list
     */
    public List<LawDecisionType> getLawDecisionList() {
        return lawDecisionList;
    }

    /** 
     * Set the list of 'LawDecision' element items. Статьи КОАП по которым выявлены признаки АП. Общая описательная часть акта досмотра, относящаяся ко всем товарам
     * 
     * @param list
     */
    public void setLawDecisionList(List<LawDecisionType> list) {
        lawDecisionList = list;
    }

    /** 
     * Get the list of 'InspTestAct' element items. Акт взятия проб и образцов
     * 
     * @return list
     */
    public List<InspTestActType> getInspTestActList() {
        return inspTestActList;
    }

    /** 
     * Set the list of 'InspTestAct' element items. Акт взятия проб и образцов
     * 
     * @param list
     */
    public void setInspTestActList(List<InspTestActType> list) {
        inspTestActList = list;
    }
}
