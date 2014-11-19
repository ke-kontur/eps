
package ru.acs.fts.schemas.album.reqgoodspresent;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ������ �������� � ��������������� �������/���������� ��, � ���� ������������ �������� ��������� ������/����������� � ������������� �������������� ������� � ��
 */
public class ReqGoodsPresentType extends BaseDocType
{
    private LocalDate reqDate;
    private String reqTime;
    private String docSign;
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private GTDIDType GTDID;
    private String documentModeID;

    /** 
     * Get the 'ReqDate' element value. ���� ������������ �������
     * 
     * @return value
     */
    public LocalDate getReqDate() {
        return reqDate;
    }

    /** 
     * Set the 'ReqDate' element value. ���� ������������ �������
     * 
     * @param reqDate
     */
    public void setReqDate(LocalDate reqDate) {
        this.reqDate = reqDate;
    }

    /** 
     * Get the 'ReqTime' element value. ����� ������������ �������
     * 
     * @return value
     */
    public String getReqTime() {
        return reqTime;
    }

    /** 
     * Set the 'ReqTime' element value. ����� ������������ �������
     * 
     * @param reqTime
     */
    public void setReqTime(String reqTime) {
        this.reqTime = reqTime;
    }

    /** 
     * Get the 'DocSign' element value. ������� ���������: 1 - ������ �������� � ��������������� �������; 2 - ������ �������� � ���������� ��, � ���� ������������ �������� ��������� ������; 3 - ����������� � ������������� �������������� ������� � ��
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ���������: 1 - ������ �������� � ��������������� �������; 2 - ������ �������� � ���������� ��, � ���� ������������ �������� ��������� ������; 3 - ����������� � ������������� �������������� ������� � ��
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'Customs' element value. ��� � ������������ ����������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ��� � ������������ ����������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'GTDID' element value. ����� ��
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. ����� ��
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
