
package ru.acs.fts.schemas.album.cwquitance;

import java.util.ArrayList;
import java.util.List;

/** 
 * Квитанция
 */
public class QuitanceType
{
    private String documentModeID;
    private List<CommonDocumentType> correctDocumentList = new ArrayList<CommonDocumentType>();

    /** 
     * Get the 'DocumentModeID' element value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' element value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }

    /** 
     * Get the list of 'CorrectDocument' element items. Подтверждаемый документ
     * 
     * @return list
     */
    public List<CommonDocumentType> getCorrectDocumentList() {
        return correctDocumentList;
    }

    /** 
     * Set the list of 'CorrectDocument' element items. Подтверждаемый документ
     * 
     * @param list
     */
    public void setCorrectDocumentList(List<CommonDocumentType> list) {
        correctDocumentList = list;
    }
}
