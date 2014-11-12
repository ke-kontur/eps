
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Срок переработки
 */
public class DateLimitType
{
    private String generalTerm;
    private StartTermType startTerm;
    private List<ExtensionTermType> extensionTermList = new ArrayList<ExtensionTermType>();

    /** 
     * Get the 'GeneralTerm' element value. Общий срок
     * 
     * @return value
     */
    public String getGeneralTerm() {
        return generalTerm;
    }

    /** 
     * Set the 'GeneralTerm' element value. Общий срок
     * 
     * @param generalTerm
     */
    public void setGeneralTerm(String generalTerm) {
        this.generalTerm = generalTerm;
    }

    /** 
     * Get the 'StartTerm' element value. Начало срока переработки
     * 
     * @return value
     */
    public StartTermType getStartTerm() {
        return startTerm;
    }

    /** 
     * Set the 'StartTerm' element value. Начало срока переработки
     * 
     * @param startTerm
     */
    public void setStartTerm(StartTermType startTerm) {
        this.startTerm = startTerm;
    }

    /** 
     * Get the list of 'ExtensionTerm' element items. Продление срока переработки
     * 
     * @return list
     */
    public List<ExtensionTermType> getExtensionTermList() {
        return extensionTermList;
    }

    /** 
     * Set the list of 'ExtensionTerm' element items. Продление срока переработки
     * 
     * @param list
     */
    public void setExtensionTermList(List<ExtensionTermType> list) {
        extensionTermList = list;
    }
}
