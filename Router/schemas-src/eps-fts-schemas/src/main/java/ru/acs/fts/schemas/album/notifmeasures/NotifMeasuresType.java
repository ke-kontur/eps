
package ru.acs.fts.schemas.album.notifmeasures;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ����������� � ���������� ���� �� ����������� �����
 */
public class NotifMeasuresType extends BaseDocType
{
    private String docSign;
    private String PIRegID;
    private String procedureSign;
    private String measuresSign;
    private LocalDate measuresApplyDate;
    private String measuresApplyTime;
    private List<String> commentList = new ArrayList<String>();
    private CustomsPersonType customsPerson;
    private GTDIDType regNumberDT;
    private CustomsType customs;
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. ������� ���������: 1 - ����������� � ����������/������������ ���� �� ����������� �����; 2 - ����������� � ������������� ���������� ����; 3 - ����������� �� ���������� ������������� ���������� ������ ��������
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ���������: 1 - ����������� � ����������/������������ ���� �� ����������� �����; 2 - ����������� � ������������� ���������� ����; 3 - ����������� �� ���������� ������������� ���������� ������ ��������
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'PI_RegID' element value. ������������� ��������������� ����������
     * 
     * @return value
     */
    public String getPIRegID() {
        return PIRegID;
    }

    /** 
     * Set the 'PI_RegID' element value. ������������� ��������������� ����������
     * 
     * @param PIRegID
     */
    public void setPIRegID(String PIRegID) {
        this.PIRegID = PIRegID;
    }

    /** 
     * Get the 'ProcedureSign' element value. ���������� ���������, ��� ������� ���� ������� ������� ����������� �����: 0 - ��������������; 1 - ���������� �������
     * 
     * @return value
     */
    public String getProcedureSign() {
        return procedureSign;
    }

    /** 
     * Set the 'ProcedureSign' element value. ���������� ���������, ��� ������� ���� ������� ������� ����������� �����: 0 - ��������������; 1 - ���������� �������
     * 
     * @param procedureSign
     */
    public void setProcedureSign(String procedureSign) {
        this.procedureSign = procedureSign;
    }

    /** 
     * Get the 'MeasuresSign' element value. ������� ���������� ���
     * 
     * @return value
     */
    public String getMeasuresSign() {
        return measuresSign;
    }

    /** 
     * Set the 'MeasuresSign' element value. ������� ���������� ���
     * 
     * @param measuresSign
     */
    public void setMeasuresSign(String measuresSign) {
        this.measuresSign = measuresSign;
    }

    /** 
     * Get the 'MeasuresApplyDate' element value. ���� ���������� ���
     * 
     * @return value
     */
    public LocalDate getMeasuresApplyDate() {
        return measuresApplyDate;
    }

    /** 
     * Set the 'MeasuresApplyDate' element value. ���� ���������� ���
     * 
     * @param measuresApplyDate
     */
    public void setMeasuresApplyDate(LocalDate measuresApplyDate) {
        this.measuresApplyDate = measuresApplyDate;
    }

    /** 
     * Get the 'MeasuresApplyTime' element value. ����� ���������� ���
     * 
     * @return value
     */
    public String getMeasuresApplyTime() {
        return measuresApplyTime;
    }

    /** 
     * Set the 'MeasuresApplyTime' element value. ����� ���������� ���
     * 
     * @param measuresApplyTime
     */
    public void setMeasuresApplyTime(String measuresApplyTime) {
        this.measuresApplyTime = measuresApplyTime;
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
     * Get the 'RegNumberDT' element value. ��������������� ����� ��
     * 
     * @return value
     */
    public GTDIDType getRegNumberDT() {
        return regNumberDT;
    }

    /** 
     * Set the 'RegNumberDT' element value. ��������������� ����� ��
     * 
     * @param regNumberDT
     */
    public void setRegNumberDT(GTDIDType regNumberDT) {
        this.regNumberDT = regNumberDT;
    }

    /** 
     * Get the 'Customs' element value. �������� � ���������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. �������� � ���������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
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
