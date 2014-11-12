
package ru.acs.fts.schemas.album.gtdoutcustomsmark;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Служебные отметки ДТ
 */
public class GTDOutCustomsMarkType extends BaseDocType
{
    private List<String> commentList = new ArrayList<String>();
    private String GTDDocumentID;
    private GTDOutResolutionType GTDOutResolution;
    private List<GTDOutCommonMarkType> GTDOutCommonMarkList = new ArrayList<GTDOutCommonMarkType>();
    private List<GTDOutGoodsResolutionType> GTDOutGoodsResolutionList = new ArrayList<GTDOutGoodsResolutionType>();
    private GTDIDType GTDID;
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
     * Get the 'GTDOutResolution' element value. Принятые решения по ДТ.
     * 
     * @return value
     */
    public GTDOutResolutionType getGTDOutResolution() {
        return GTDOutResolution;
    }

    /** 
     * Set the 'GTDOutResolution' element value. Принятые решения по ДТ.
     * 
     * @param GTDOutResolution
     */
    public void setGTDOutResolution(GTDOutResolutionType GTDOutResolution) {
        this.GTDOutResolution = GTDOutResolution;
    }

    /** 
     * Get the list of 'GTDOutCommonMark' element items. Служебные отметки ДТ 
     * 
     * @return list
     */
    public List<GTDOutCommonMarkType> getGTDOutCommonMarkList() {
        return GTDOutCommonMarkList;
    }

    /** 
     * Set the list of 'GTDOutCommonMark' element items. Служебные отметки ДТ 
     * 
     * @param list
     */
    public void setGTDOutCommonMarkList(List<GTDOutCommonMarkType> list) {
        GTDOutCommonMarkList = list;
    }

    /** 
     * Get the list of 'GTDOutGoodsResolution' element items. Служебные отметки и принятые решения по товарам.
     * 
     * @return list
     */
    public List<GTDOutGoodsResolutionType> getGTDOutGoodsResolutionList() {
        return GTDOutGoodsResolutionList;
    }

    /** 
     * Set the list of 'GTDOutGoodsResolution' element items. Служебные отметки и принятые решения по товарам.
     * 
     * @param list
     */
    public void setGTDOutGoodsResolutionList(
            List<GTDOutGoodsResolutionType> list) {
        GTDOutGoodsResolutionList = list;
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
