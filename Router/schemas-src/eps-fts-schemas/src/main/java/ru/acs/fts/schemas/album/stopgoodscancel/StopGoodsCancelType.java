
package ru.acs.fts.schemas.album.stopgoodscancel;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ������ ������� � ��������������� ������� �������
 */
public class StopGoodsCancelType extends BaseDocType
{
    private LocalDate sendDate;
    private LocalDate cancelIssueDate;
    private String comments;
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private GTDIDType declarationNumber;
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. ���� �����������
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. ���� �����������
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'CancelIssueDate' element value. ���� �������� ������� �� ������
     * 
     * @return value
     */
    public LocalDate getCancelIssueDate() {
        return cancelIssueDate;
    }

    /** 
     * Set the 'CancelIssueDate' element value. ���� �������� ������� �� ������
     * 
     * @param cancelIssueDate
     */
    public void setCancelIssueDate(LocalDate cancelIssueDate) {
        this.cancelIssueDate = cancelIssueDate;
    }

    /** 
     * Get the 'Comments' element value. �����������
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. �����������
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'Customs' element value. ���������� �����
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ���������� �����
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
     * Get the 'DeclarationNumber' element value. ����� ��
     * 
     * @return value
     */
    public GTDIDType getDeclarationNumber() {
        return declarationNumber;
    }

    /** 
     * Set the 'DeclarationNumber' element value. ����� ��
     * 
     * @param declarationNumber
     */
    public void setDeclarationNumber(GTDIDType declarationNumber) {
        this.declarationNumber = declarationNumber;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. �������� � ������
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. �������� � ������
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
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
