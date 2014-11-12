
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * ДТ и ТД. Принятое решение
 */
public class RUESADDecisionType
{
    private String decisionCode;
    private LocalDate dateInf;
    private String timeInf;
    private String LNP;
    private List<String> foundationList = new ArrayList<String>();

    /** 
     * Get the 'DecisionCode' element value. Код решения в соответствии с классификатором решений,  принимаемых таможенными органами (**) - различно по товарам (заполняется при указании решения по декларации)
     * 
     * @return value
     */
    public String getDecisionCode() {
        return decisionCode;
    }

    /** 
     * Set the 'DecisionCode' element value. Код решения в соответствии с классификатором решений,  принимаемых таможенными органами (**) - различно по товарам (заполняется при указании решения по декларации)
     * 
     * @param decisionCode
     */
    public void setDecisionCode(String decisionCode) {
        this.decisionCode = decisionCode;
    }

    /** 
     * Get the 'DateInf' element value. Дата
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. Дата
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

    /** 
     * Get the 'TimeInf' element value. Время
     * 
     * @return value
     */
    public String getTimeInf() {
        return timeInf;
    }

    /** 
     * Set the 'TimeInf' element value. Время
     * 
     * @param timeInf
     */
    public void setTimeInf(String timeInf) {
        this.timeInf = timeInf;
    }

    /** 
     * Get the 'LNP' element value. ЛНП
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ЛНП
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }

    /** 
     * Get the list of 'Foundation' element items. Обоснование
     * 
     * @return list
     */
    public List<String> getFoundationList() {
        return foundationList;
    }

    /** 
     * Set the list of 'Foundation' element items. Обоснование
     * 
     * @param list
     */
    public void setFoundationList(List<String> list) {
        foundationList = list;
    }
}
