
package ru.acs.fts.schemas.album.notifviolation;

import java.util.ArrayList;
import java.util.List;

/** 
 * Описание сведений, которые необходимо скорректировать для устранения нарушений или соблюдения условий выпуска
 */
public class CorrectReqType
{
    private List<String> correctDescriptionList = new ArrayList<String>();
    private String correctDateLimit;

    /** 
     * Get the list of 'CorrectDescription' element items. Описание сведений, которые необходимо скорректировать
     * 
     * @return list
     */
    public List<String> getCorrectDescriptionList() {
        return correctDescriptionList;
    }

    /** 
     * Set the list of 'CorrectDescription' element items. Описание сведений, которые необходимо скорректировать
     * 
     * @param list
     */
    public void setCorrectDescriptionList(List<String> list) {
        correctDescriptionList = list;
    }

    /** 
     * Get the 'CorrectDateLimit' element value. Срок до которого необходимо скорректировать сведения
     * 
     * @return value
     */
    public String getCorrectDateLimit() {
        return correctDateLimit;
    }

    /** 
     * Set the 'CorrectDateLimit' element value. Срок до которого необходимо скорректировать сведения
     * 
     * @param correctDateLimit
     */
    public void setCorrectDateLimit(String correctDateLimit) {
        this.correctDateLimit = correctDateLimit;
    }
}
