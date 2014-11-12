
package ru.acs.fts.schemas.album.dtsoutcustomsmark;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Служебные отметки ДТС
 */
public class DTSOutCustomsMarkType extends BaseDocType
{
    private String DTSDocumentID;
    private List<String> commentList = new ArrayList<String>();
    private String GTDDocumentID;
    private DTSOuDecisionType DTSOutCostDecision;
    private DTSOuDecisionType DTSOutRecallDecision;
    private List<DTSOutMarksType> DTSOutMarkList = new ArrayList<DTSOutMarksType>();
    private List<DTSOutGoodsResultType> DTSOutGoodsMarkList = new ArrayList<DTSOutGoodsResultType>();
    private String documentModeID;

    /** 
     * Get the 'DTSDocumentID' element value. Уникальный идентификатор ДТС, к которой относятся служебные отметки.
     * 
     * @return value
     */
    public String getDTSDocumentID() {
        return DTSDocumentID;
    }

    /** 
     * Set the 'DTSDocumentID' element value. Уникальный идентификатор ДТС, к которой относятся служебные отметки.
     * 
     * @param DTSDocumentID
     */
    public void setDTSDocumentID(String DTSDocumentID) {
        this.DTSDocumentID = DTSDocumentID;
    }

    /** 
     * Get the list of 'Comments' element items. Коментарий.
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comments' element items. Коментарий.
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }

    /** 
     * Get the 'GTDDocumentID' element value. Уникальный идентификатор ДТ, к которой относятся служебные отметки ДТС.
     * 
     * @return value
     */
    public String getGTDDocumentID() {
        return GTDDocumentID;
    }

    /** 
     * Set the 'GTDDocumentID' element value. Уникальный идентификатор ДТ, к которой относятся служебные отметки ДТС.
     * 
     * @param GTDDocumentID
     */
    public void setGTDDocumentID(String GTDDocumentID) {
        this.GTDDocumentID = GTDDocumentID;
    }

    /** 
     * Get the 'DTSOutCostDecision' element value. Решение по таможенной стоимости ДТС
     * 
     * @return value
     */
    public DTSOuDecisionType getDTSOutCostDecision() {
        return DTSOutCostDecision;
    }

    /** 
     * Set the 'DTSOutCostDecision' element value. Решение по таможенной стоимости ДТС
     * 
     * @param DTSOutCostDecision
     */
    public void setDTSOutCostDecision(DTSOuDecisionType DTSOutCostDecision) {
        this.DTSOutCostDecision = DTSOutCostDecision;
    }

    /** 
     * Get the 'DTSOutRecallDecision' element value. Решение об аннулировании или отзыве ДТС
     * 
     * @return value
     */
    public DTSOuDecisionType getDTSOutRecallDecision() {
        return DTSOutRecallDecision;
    }

    /** 
     * Set the 'DTSOutRecallDecision' element value. Решение об аннулировании или отзыве ДТС
     * 
     * @param DTSOutRecallDecision
     */
    public void setDTSOutRecallDecision(DTSOuDecisionType DTSOutRecallDecision) {
        this.DTSOutRecallDecision = DTSOutRecallDecision;
    }

    /** 
     * Get the list of 'DTSOutMarks' element items. Отметки инспектора
     * 
     * @return list
     */
    public List<DTSOutMarksType> getDTSOutMarkList() {
        return DTSOutMarkList;
    }

    /** 
     * Set the list of 'DTSOutMarks' element items. Отметки инспектора
     * 
     * @param list
     */
    public void setDTSOutMarkList(List<DTSOutMarksType> list) {
        DTSOutMarkList = list;
    }

    /** 
     * Get the list of 'DTSOutGoodsMark' element items. Решение о таможенной стоимости и служебные отметки по товарам
     * 
     * @return list
     */
    public List<DTSOutGoodsResultType> getDTSOutGoodsMarkList() {
        return DTSOutGoodsMarkList;
    }

    /** 
     * Set the list of 'DTSOutGoodsMark' element items. Решение о таможенной стоимости и служебные отметки по товарам
     * 
     * @param list
     */
    public void setDTSOutGoodsMarkList(List<DTSOutGoodsResultType> list) {
        DTSOutGoodsMarkList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
