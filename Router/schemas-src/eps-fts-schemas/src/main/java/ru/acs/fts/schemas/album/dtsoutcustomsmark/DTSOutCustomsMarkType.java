
package ru.acs.fts.schemas.album.dtsoutcustomsmark;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ��������� ������� ���
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
     * Get the 'DTSDocumentID' element value. ���������� ������������� ���, � ������� ��������� ��������� �������.
     * 
     * @return value
     */
    public String getDTSDocumentID() {
        return DTSDocumentID;
    }

    /** 
     * Set the 'DTSDocumentID' element value. ���������� ������������� ���, � ������� ��������� ��������� �������.
     * 
     * @param DTSDocumentID
     */
    public void setDTSDocumentID(String DTSDocumentID) {
        this.DTSDocumentID = DTSDocumentID;
    }

    /** 
     * Get the list of 'Comments' element items. ����������.
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comments' element items. ����������.
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }

    /** 
     * Get the 'GTDDocumentID' element value. ���������� ������������� ��, � ������� ��������� ��������� ������� ���.
     * 
     * @return value
     */
    public String getGTDDocumentID() {
        return GTDDocumentID;
    }

    /** 
     * Set the 'GTDDocumentID' element value. ���������� ������������� ��, � ������� ��������� ��������� ������� ���.
     * 
     * @param GTDDocumentID
     */
    public void setGTDDocumentID(String GTDDocumentID) {
        this.GTDDocumentID = GTDDocumentID;
    }

    /** 
     * Get the 'DTSOutCostDecision' element value. ������� �� ���������� ��������� ���
     * 
     * @return value
     */
    public DTSOuDecisionType getDTSOutCostDecision() {
        return DTSOutCostDecision;
    }

    /** 
     * Set the 'DTSOutCostDecision' element value. ������� �� ���������� ��������� ���
     * 
     * @param DTSOutCostDecision
     */
    public void setDTSOutCostDecision(DTSOuDecisionType DTSOutCostDecision) {
        this.DTSOutCostDecision = DTSOutCostDecision;
    }

    /** 
     * Get the 'DTSOutRecallDecision' element value. ������� �� ������������� ��� ������ ���
     * 
     * @return value
     */
    public DTSOuDecisionType getDTSOutRecallDecision() {
        return DTSOutRecallDecision;
    }

    /** 
     * Set the 'DTSOutRecallDecision' element value. ������� �� ������������� ��� ������ ���
     * 
     * @param DTSOutRecallDecision
     */
    public void setDTSOutRecallDecision(DTSOuDecisionType DTSOutRecallDecision) {
        this.DTSOutRecallDecision = DTSOutRecallDecision;
    }

    /** 
     * Get the list of 'DTSOutMarks' element items. ������� ����������
     * 
     * @return list
     */
    public List<DTSOutMarksType> getDTSOutMarkList() {
        return DTSOutMarkList;
    }

    /** 
     * Set the list of 'DTSOutMarks' element items. ������� ����������
     * 
     * @param list
     */
    public void setDTSOutMarkList(List<DTSOutMarksType> list) {
        DTSOutMarkList = list;
    }

    /** 
     * Get the list of 'DTSOutGoodsMark' element items. ������� � ���������� ��������� � ��������� ������� �� �������
     * 
     * @return list
     */
    public List<DTSOutGoodsResultType> getDTSOutGoodsMarkList() {
        return DTSOutGoodsMarkList;
    }

    /** 
     * Set the list of 'DTSOutGoodsMark' element items. ������� � ���������� ��������� � ��������� ������� �� �������
     * 
     * @param list
     */
    public void setDTSOutGoodsMarkList(List<DTSOutGoodsResultType> list) {
        DTSOutGoodsMarkList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
