
package ru.acs.fts.schemas.album.rejectdeclreqoperation;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ����� ���������� � ������������� ���������.
 */
public class RejectDeclReqOperationType extends BaseDocType
{
    private String rejectNumber;
    private LocalDate rejectDate;
    private String rejectTime;
    private String reqNumber;
    private LocalDate reqDate;
    private List<String> rejectReasonList = new ArrayList<String>();
    private OrganizationBaseType declarant;
    private PersonSignatureType personSignature;
    private String documentModeID;

    /** 
     * Get the 'RejectNumber' element value. ��������� ����� ���������
     * 
     * @return value
     */
    public String getRejectNumber() {
        return rejectNumber;
    }

    /** 
     * Set the 'RejectNumber' element value. ��������� ����� ���������
     * 
     * @param rejectNumber
     */
    public void setRejectNumber(String rejectNumber) {
        this.rejectNumber = rejectNumber;
    }

    /** 
     * Get the 'RejectDate' element value. ���� �������� ���������
     * 
     * @return value
     */
    public LocalDate getRejectDate() {
        return rejectDate;
    }

    /** 
     * Set the 'RejectDate' element value. ���� �������� ���������
     * 
     * @param rejectDate
     */
    public void setRejectDate(LocalDate rejectDate) {
        this.rejectDate = rejectDate;
    }

    /** 
     * Get the 'RejectTime' element value. ����� �������� ���������
     * 
     * @return value
     */
    public String getRejectTime() {
        return rejectTime;
    }

    /** 
     * Set the 'RejectTime' element value. ����� �������� ���������
     * 
     * @param rejectTime
     */
    public void setRejectTime(String rejectTime) {
        this.rejectTime = rejectTime;
    }

    /** 
     * Get the 'ReqNumber' element value. ����� ������� �� ����������
     * 
     * @return value
     */
    public String getReqNumber() {
        return reqNumber;
    }

    /** 
     * Set the 'ReqNumber' element value. ����� ������� �� ����������
     * 
     * @param reqNumber
     */
    public void setReqNumber(String reqNumber) {
        this.reqNumber = reqNumber;
    }

    /** 
     * Get the 'ReqDate' element value. ���� ������� �� ����������
     * 
     * @return value
     */
    public LocalDate getReqDate() {
        return reqDate;
    }

    /** 
     * Set the 'ReqDate' element value. ���� ������� �� ����������
     * 
     * @param reqDate
     */
    public void setReqDate(LocalDate reqDate) {
        this.reqDate = reqDate;
    }

    /** 
     * Get the list of 'RejectReason' element items. ����������� ������ ����������
     * 
     * @return list
     */
    public List<String> getRejectReasonList() {
        return rejectReasonList;
    }

    /** 
     * Set the list of 'RejectReason' element items. ����������� ������ ����������
     * 
     * @param list
     */
    public void setRejectReasonList(List<String> list) {
        rejectReasonList = list;
    }

    /** 
     * Get the 'Declarant' element value. ����,  ������������� ������. ������������ / ��� (��� ���������� ���)
     * 
     * @return value
     */
    public OrganizationBaseType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. ����,  ������������� ������. ������������ / ��� (��� ���������� ���)
     * 
     * @param declarant
     */
    public void setDeclarant(OrganizationBaseType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'PersonSignature' element value. ������� ������������ ���� ��������������� �����. (���, ���������, ����)
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. ������� ������������ ���� ��������������� �����. (���, ���������, ����)
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
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
