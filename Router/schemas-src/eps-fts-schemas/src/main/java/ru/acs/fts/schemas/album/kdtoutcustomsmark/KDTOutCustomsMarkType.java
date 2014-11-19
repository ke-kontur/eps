
package ru.acs.fts.schemas.album.kdtoutcustomsmark;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ��������� ������� ���
 */
public class KDTOutCustomsMarkType extends BaseDocType
{
    private List<String> commentList = new ArrayList<String>();
    private String GTDDocumentID;
    private String KTDNumber;
    private List<KDTOutCommonMarkType> KDTOutCommonMarkList = new ArrayList<KDTOutCommonMarkType>();
    private List<KDTOutGoodsResolutionType> KDTOutGoodsResolutionList = new ArrayList<KDTOutGoodsResolutionType>();
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
     * Get the 'GTDDocumentID' element value. ���������� ������������� ��� � ������� ��������� ��������� ������� (GUID)
     * 
     * @return value
     */
    public String getGTDDocumentID() {
        return GTDDocumentID;
    }

    /** 
     * Set the 'GTDDocumentID' element value. ���������� ������������� ��� � ������� ��������� ��������� ������� (GUID)
     * 
     * @param GTDDocumentID
     */
    public void setGTDDocumentID(String GTDDocumentID) {
        this.GTDDocumentID = GTDDocumentID;
    }

    /** 
     * Get the 'KTDNumber' element value. ���������� ����� ���
     * 
     * @return value
     */
    public String getKTDNumber() {
        return KTDNumber;
    }

    /** 
     * Set the 'KTDNumber' element value. ���������� ����� ���
     * 
     * @param KTDNumber
     */
    public void setKTDNumber(String KTDNumber) {
        this.KTDNumber = KTDNumber;
    }

    /** 
     * Get the list of 'KDTOutCommonMark' element items. ����� ������� ���
     * 
     * @return list
     */
    public List<KDTOutCommonMarkType> getKDTOutCommonMarkList() {
        return KDTOutCommonMarkList;
    }

    /** 
     * Set the list of 'KDTOutCommonMark' element items. ����� ������� ���
     * 
     * @param list
     */
    public void setKDTOutCommonMarkList(List<KDTOutCommonMarkType> list) {
        KDTOutCommonMarkList = list;
    }

    /** 
     * Get the list of 'KDTOutGoodsResolution' element items. ��������� ������� ��� �� �������
     * 
     * @return list
     */
    public List<KDTOutGoodsResolutionType> getKDTOutGoodsResolutionList() {
        return KDTOutGoodsResolutionList;
    }

    /** 
     * Set the list of 'KDTOutGoodsResolution' element items. ��������� ������� ��� �� �������
     * 
     * @param list
     */
    public void setKDTOutGoodsResolutionList(
            List<KDTOutGoodsResolutionType> list) {
        KDTOutGoodsResolutionList = list;
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
