
package ru.acs.fts.schemas.album.gtdoutcustomsmark;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ��������� ������� ��
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
     * Get the list of 'Comments' element items. �����������
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comments' element items. �����������
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }

    /** 
     * Get the 'GTDDocumentID' element value. ���������� ������������� �� � ������� ��������� ��������� ������� (GUID).
     * 
     * @return value
     */
    public String getGTDDocumentID() {
        return GTDDocumentID;
    }

    /** 
     * Set the 'GTDDocumentID' element value. ���������� ������������� �� � ������� ��������� ��������� ������� (GUID).
     * 
     * @param GTDDocumentID
     */
    public void setGTDDocumentID(String GTDDocumentID) {
        this.GTDDocumentID = GTDDocumentID;
    }

    /** 
     * Get the 'GTDOutResolution' element value. �������� ������� �� ��.
     * 
     * @return value
     */
    public GTDOutResolutionType getGTDOutResolution() {
        return GTDOutResolution;
    }

    /** 
     * Set the 'GTDOutResolution' element value. �������� ������� �� ��.
     * 
     * @param GTDOutResolution
     */
    public void setGTDOutResolution(GTDOutResolutionType GTDOutResolution) {
        this.GTDOutResolution = GTDOutResolution;
    }

    /** 
     * Get the list of 'GTDOutCommonMark' element items. ��������� ������� �� 
     * 
     * @return list
     */
    public List<GTDOutCommonMarkType> getGTDOutCommonMarkList() {
        return GTDOutCommonMarkList;
    }

    /** 
     * Set the list of 'GTDOutCommonMark' element items. ��������� ������� �� 
     * 
     * @param list
     */
    public void setGTDOutCommonMarkList(List<GTDOutCommonMarkType> list) {
        GTDOutCommonMarkList = list;
    }

    /** 
     * Get the list of 'GTDOutGoodsResolution' element items. ��������� ������� � �������� ������� �� �������.
     * 
     * @return list
     */
    public List<GTDOutGoodsResolutionType> getGTDOutGoodsResolutionList() {
        return GTDOutGoodsResolutionList;
    }

    /** 
     * Set the list of 'GTDOutGoodsResolution' element items. ��������� ������� � �������� ������� �� �������.
     * 
     * @param list
     */
    public void setGTDOutGoodsResolutionList(
            List<GTDOutGoodsResolutionType> list) {
        GTDOutGoodsResolutionList = list;
    }

    /** 
     * Get the 'GTDID' element value. ��������������� ����� ��.
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. ��������������� ����� ��.
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
