
package ru.acs.fts.schemas.album.reqcorrecteddata;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Какие сведения (документы) и в какой срок необходимо скорректировать (представить) в таможенный орган
 */
public class InstructionReqType
{
    private LocalDate dateLimit;
    private List<String> instructionDescriptionList = new ArrayList<String>();
    private List<String> instrDocumentList = new ArrayList<String>();

    /** 
     * Get the 'DateLimit' element value. Срок, в который необходимо выполнить действия
     * 
     * @return value
     */
    public LocalDate getDateLimit() {
        return dateLimit;
    }

    /** 
     * Set the 'DateLimit' element value. Срок, в который необходимо выполнить действия
     * 
     * @param dateLimit
     */
    public void setDateLimit(LocalDate dateLimit) {
        this.dateLimit = dateLimit;
    }

    /** 
     * Get the list of 'InstructionDescription' element items. Описание действий
     * 
     * @return list
     */
    public List<String> getInstructionDescriptionList() {
        return instructionDescriptionList;
    }

    /** 
     * Set the list of 'InstructionDescription' element items. Описание действий
     * 
     * @param list
     */
    public void setInstructionDescriptionList(List<String> list) {
        instructionDescriptionList = list;
    }

    /** 
     * Get the list of 'InstrDocument' element items. Документ,  в соответствии с которым требуется выполнение действий
     * 
     * @return list
     */
    public List<String> getInstrDocumentList() {
        return instrDocumentList;
    }

    /** 
     * Set the list of 'InstrDocument' element items. Документ,  в соответствии с которым требуется выполнение действий
     * 
     * @param list
     */
    public void setInstrDocumentList(List<String> list) {
        instrDocumentList = list;
    }
}
