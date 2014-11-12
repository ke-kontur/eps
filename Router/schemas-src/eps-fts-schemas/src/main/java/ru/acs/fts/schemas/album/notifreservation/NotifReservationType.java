
package ru.acs.fts.schemas.album.notifreservation;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ����������� � ��������������/� ������������� �������������� ����� �����������
 */
public class NotifReservationType extends BaseDocType
{
    private String documentDateTime;
    private String docSign;
    private String reservedAmount;
    private String requiredAmount;
    private String currencyCode;
    private List<String> commentList = new ArrayList<String>();
    private CustomsPersonType customsPerson;
    private GTDIDType declRegNumber;
    private CustomsType customs;
    private List<ReasonsType> reasonList = new ArrayList<ReasonsType>();
    private String documentModeID;

    /** 
     * Get the 'DocumentDateTime' element value. ���� � ����� ������������ ������������ ���������
     * 
     * @return value
     */
    public String getDocumentDateTime() {
        return documentDateTime;
    }

    /** 
     * Set the 'DocumentDateTime' element value. ���� � ����� ������������ ������������ ���������
     * 
     * @param documentDateTime
     */
    public void setDocumentDateTime(String documentDateTime) {
        this.documentDateTime = documentDateTime;
    }

    /** 
     * Get the 'DocSign' element value. ������� ���������: 0 - ����������� �� �������� ��������������; 1 - ����������� � ��������� ��������������; 2 - ����������� � ������������� ��������������
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ���������: 0 - ����������� �� �������� ��������������; 1 - ����������� � ��������� ��������������; 2 - ����������� � ������������� ��������������
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'ReservedAmount' element value. ����������������� ����� ����������� ������ ���������� ������, �������
     * 
     * @return value
     */
    public String getReservedAmount() {
        return reservedAmount;
    }

    /** 
     * Set the 'ReservedAmount' element value. ����������������� ����� ����������� ������ ���������� ������, �������
     * 
     * @param reservedAmount
     */
    public void setReservedAmount(String reservedAmount) {
        this.reservedAmount = reservedAmount;
    }

    /** 
     * Get the 'RequiredAmount' element value. ����� �����������, ������� �� ����� ���� ��������������� ��-�� ���������� ����������������� (����������) �������
     * 
     * @return value
     */
    public String getRequiredAmount() {
        return requiredAmount;
    }

    /** 
     * Set the 'RequiredAmount' element value. ����� �����������, ������� �� ����� ���� ��������������� ��-�� ���������� ����������������� (����������) �������
     * 
     * @param requiredAmount
     */
    public void setRequiredAmount(String requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��������� ��� ������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��������� ��� ������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the list of 'Comment' element items. ����������
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comment' element items. ����������
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
     * Get the 'DeclRegNumber' element value. ��������������� ����� ���������� ����������
     * 
     * @return value
     */
    public GTDIDType getDeclRegNumber() {
        return declRegNumber;
    }

    /** 
     * Set the 'DeclRegNumber' element value. ��������������� ����� ���������� ����������
     * 
     * @param declRegNumber
     */
    public void setDeclRegNumber(GTDIDType declRegNumber) {
        this.declRegNumber = declRegNumber;
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
     * Get the list of 'Reasons' element items. �������� �������������, ����������� �������� ������������� �������������� ����� �����������
     * 
     * @return list
     */
    public List<ReasonsType> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reasons' element items. �������� �������������, ����������� �������� ������������� �������������� ����� �����������
     * 
     * @param list
     */
    public void setReasonList(List<ReasonsType> list) {
        reasonList = list;
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
