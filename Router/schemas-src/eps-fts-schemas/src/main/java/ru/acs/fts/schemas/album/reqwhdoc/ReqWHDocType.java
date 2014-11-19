
package ru.acs.fts.schemas.album.reqwhdoc;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhPresentDocType;

/** 
 * ������ �� �������������� ����������
 */
public class ReqWHDocType extends BaseDocType
{
    private LocalDate sendDate;
    private String sendTime;
    private List<WhPresentDocType> requestedDocList = new ArrayList<WhPresentDocType>();
    private PersonBaseType SVHPerson;
    private GTDIDType regNumberConfirmDoc;
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. ���� ����������� �������
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. ���� ����������� �������
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'SendTime' element value. ����� ����������� �������
     * 
     * @return value
     */
    public String getSendTime() {
        return sendTime;
    }

    /** 
     * Set the 'SendTime' element value. ����� ����������� �������
     * 
     * @param sendTime
     */
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    /** 
     * Get the list of 'RequestedDoc' element items. ������ ������������� ����������
     * 
     * @return list
     */
    public List<WhPresentDocType> getRequestedDocList() {
        return requestedDocList;
    }

    /** 
     * Set the list of 'RequestedDoc' element items. ������ ������������� ����������
     * 
     * @param list
     */
    public void setRequestedDocList(List<WhPresentDocType> list) {
        requestedDocList = list;
    }

    /** 
     * Get the 'SVHPerson' element value. ����������� ���
     * 
     * @return value
     */
    public PersonBaseType getSVHPerson() {
        return SVHPerson;
    }

    /** 
     * Set the 'SVHPerson' element value. ����������� ���
     * 
     * @param SVHPerson
     */
    public void setSVHPerson(PersonBaseType SVHPerson) {
        this.SVHPerson = SVHPerson;
    }

    /** 
     * Get the 'RegNumberConfirmDoc' element value. ��������������� ����� ������������� ���������� ��� ��������� ������� �� ��
     * 
     * @return value
     */
    public GTDIDType getRegNumberConfirmDoc() {
        return regNumberConfirmDoc;
    }

    /** 
     * Set the 'RegNumberConfirmDoc' element value. ��������������� ����� ������������� ���������� ��� ��������� ������� �� ��
     * 
     * @param regNumberConfirmDoc
     */
    public void setRegNumberConfirmDoc(GTDIDType regNumberConfirmDoc) {
        this.regNumberConfirmDoc = regNumberConfirmDoc;
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
