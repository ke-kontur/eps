
package ru.acs.fts.schemas.album.gtdincustomsmark;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Служебные отметки ДТ.(внутренний формат)
 */
public class GTDInCustomsMarkType extends BaseDocType
{
    private List<String> commentList = new ArrayList<String>();
    private String GTDDocumentID;
    private List<GTDInCommonMarkType> GTDInCommonMarkList = new ArrayList<GTDInCommonMarkType>();
    private GTDIDType GTDID;
    private TechMarksType techMarks;
    private String documentModeID;

    /** 
     * Get the list of 'Comments' element items. Комментарий
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comments' element items. Комментарий
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }

    /** 
     * Get the 'GTDDocumentID' element value. Уникальный идентификатор ДТ к которой относятся служебные отметки (GUID).
     * 
     * @return value
     */
    public String getGTDDocumentID() {
        return GTDDocumentID;
    }

    /** 
     * Set the 'GTDDocumentID' element value. Уникальный идентификатор ДТ к которой относятся служебные отметки (GUID).
     * 
     * @param GTDDocumentID
     */
    public void setGTDDocumentID(String GTDDocumentID) {
        this.GTDDocumentID = GTDDocumentID;
    }

    /** 
     * Get the list of 'GTDInCommonMark' element items. Служебные отметки ДТ 
     * 
     * @return list
     */
    public List<GTDInCommonMarkType> getGTDInCommonMarkList() {
        return GTDInCommonMarkList;
    }

    /** 
     * Set the list of 'GTDInCommonMark' element items. Служебные отметки ДТ 
     * 
     * @param list
     */
    public void setGTDInCommonMarkList(List<GTDInCommonMarkType> list) {
        GTDInCommonMarkList = list;
    }

    /** 
     * Get the 'GTDID' element value. Регистрационный номер ДТ.
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Регистрационный номер ДТ.
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'TechMarks' element value. Технологические отметки.
     * 
     * @return value
     */
    public TechMarksType getTechMarks() {
        return techMarks;
    }

    /** 
     * Set the 'TechMarks' element value. Технологические отметки.
     * 
     * @param techMarks
     */
    public void setTechMarks(TechMarksType techMarks) {
        this.techMarks = techMarks;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
