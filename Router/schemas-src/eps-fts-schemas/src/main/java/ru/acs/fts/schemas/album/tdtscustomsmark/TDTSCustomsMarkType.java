
package ru.acs.fts.schemas.album.tdtscustomsmark;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ������� ����������� ������ �� ����
 */
public class TDTSCustomsMarkType extends BaseDocType
{
    private List<String> commentList = new ArrayList<String>();
    private String documentID1;
    private TDTSType TDTSRegNumber;
    private List<TDTSCommonMarkType> TDTSCommonMarkList = new ArrayList<TDTSCommonMarkType>();
    private CancellationInfoType cancellationInfo;
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
     * Get the 'DocumentID' element value. ���������� ������������� ����������, � ������� ��������� ��������� ������� (GUID).
     * 
     * @return value
     */
    public String getDocumentID1() {
        return documentID1;
    }

    /** 
     * Set the 'DocumentID' element value. ���������� ������������� ����������, � ������� ��������� ��������� ������� (GUID).
     * 
     * @param documentID1
     */
    public void setDocumentID1(String documentID1) {
        this.documentID1 = documentID1;
    }

    /** 
     * Get the 'TDTSRegNumber' element value. ��������������� ����� ����
     * 
     * @return value
     */
    public TDTSType getTDTSRegNumber() {
        return TDTSRegNumber;
    }

    /** 
     * Set the 'TDTSRegNumber' element value. ��������������� ����� ����
     * 
     * @param TDTSRegNumber
     */
    public void setTDTSRegNumber(TDTSType TDTSRegNumber) {
        this.TDTSRegNumber = TDTSRegNumber;
    }

    /** 
     * Get the list of 'TDTSCommonMark' element items. ��������� ������� ����
     * 
     * @return list
     */
    public List<TDTSCommonMarkType> getTDTSCommonMarkList() {
        return TDTSCommonMarkList;
    }

    /** 
     * Set the list of 'TDTSCommonMark' element items. ��������� ������� ����
     * 
     * @param list
     */
    public void setTDTSCommonMarkList(List<TDTSCommonMarkType> list) {
        TDTSCommonMarkList = list;
    }

    /** 
     * Get the 'CancellationInfo' element value. �������� �� ������
     * 
     * @return value
     */
    public CancellationInfoType getCancellationInfo() {
        return cancellationInfo;
    }

    /** 
     * Set the 'CancellationInfo' element value. �������� �� ������
     * 
     * @param cancellationInfo
     */
    public void setCancellationInfo(CancellationInfoType cancellationInfo) {
        this.cancellationInfo = cancellationInfo;
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
