
package ru.acs.fts.schemas.admin.udcustlistupdate;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.admin.intexchcommonaggregatetypescust.BaseDocType;

/** 
 * ���������� ���������� �������
 */
public class UDCustListUpdateType extends BaseDocType
{
    private DateTime createDateTime;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> commentList = new ArrayList<String>();
    private String recID;
    private DocumentGroundType documentGroundConnect;
    private CustomsType customsOut;
    private CustomsType customsIn;
    private DocumentGroundType documentGroundDisconnect;
    private String documentModeID;

    /** 
     * Get the 'CreateDateTime' element value. ����  � �����  ��������  ��������
     * 
     * @return value
     */
    public DateTime getCreateDateTime() {
        return createDateTime;
    }

    /** 
     * Set the 'CreateDateTime' element value. ����  � �����  ��������  ��������
     * 
     * @param createDateTime
     */
    public void setCreateDateTime(DateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    /** 
     * Get the 'StartDate' element value. ���� ������ ��������
     * 
     * @return value
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** 
     * Set the 'StartDate' element value. ���� ������ ��������
     * 
     * @param startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /** 
     * Get the 'EndDate' element value. ���� ��������� ��������
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ���� ��������� ��������
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

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
     * Get the 'RecID' element value. ������������� ������
     * 
     * @return value
     */
    public String getRecID() {
        return recID;
    }

    /** 
     * Set the 'RecID' element value. ������������� ������
     * 
     * @param recID
     */
    public void setRecID(String recID) {
        this.recID = recID;
    }

    /** 
     * Get the 'DocumentGroundConnect' element value. ��������� ��� �����������
     * 
     * @return value
     */
    public DocumentGroundType getDocumentGroundConnect() {
        return documentGroundConnect;
    }

    /** 
     * Set the 'DocumentGroundConnect' element value. ��������� ��� �����������
     * 
     * @param documentGroundConnect
     */
    public void setDocumentGroundConnect(
            DocumentGroundType documentGroundConnect) {
        this.documentGroundConnect = documentGroundConnect;
    }

    /** 
     * Get the 'CustomsOut' element value. ������� ���������� ����
     * 
     * @return value
     */
    public CustomsType getCustomsOut() {
        return customsOut;
    }

    /** 
     * Set the 'CustomsOut' element value. ������� ���������� ����
     * 
     * @param customsOut
     */
    public void setCustomsOut(CustomsType customsOut) {
        this.customsOut = customsOut;
    }

    /** 
     * Get the 'CustomsIn' element value. ���������� ���������� ����
     * 
     * @return value
     */
    public CustomsType getCustomsIn() {
        return customsIn;
    }

    /** 
     * Set the 'CustomsIn' element value. ���������� ���������� ����
     * 
     * @param customsIn
     */
    public void setCustomsIn(CustomsType customsIn) {
        this.customsIn = customsIn;
    }

    /** 
     * Get the 'DocumentGroundDisconnect' element value. ��������� ���  ����������
     * 
     * @return value
     */
    public DocumentGroundType getDocumentGroundDisconnect() {
        return documentGroundDisconnect;
    }

    /** 
     * Set the 'DocumentGroundDisconnect' element value. ��������� ���  ����������
     * 
     * @param documentGroundDisconnect
     */
    public void setDocumentGroundDisconnect(
            DocumentGroundType documentGroundDisconnect) {
        this.documentGroundDisconnect = documentGroundDisconnect;
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
