
package ru.acs.fts.schemas.album.stopgoodsdec;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ������� � ��������������� ������� �������
 */
public class StopGoodsDecType extends BaseDocType
{
    private LocalDate sendDate;
    private LocalDate decIssueDate;
    private LocalDate decEndDate;
    private String goodsLocation;
    private List<RightPersonType> rightPersonList = new ArrayList<RightPersonType>();
    private CustomsInfoType customs;
    private GTDIDType declarationNumber;
    private List<RestrictionGoodsInfoType> restrictionGoodsInfoList = new ArrayList<RestrictionGoodsInfoType>();
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
     * Get the 'DecIssueDate' element value. ���� �������� �������
     * 
     * @return value
     */
    public LocalDate getDecIssueDate() {
        return decIssueDate;
    }

    /** 
     * Set the 'DecIssueDate' element value. ���� �������� �������
     * 
     * @param decIssueDate
     */
    public void setDecIssueDate(LocalDate decIssueDate) {
        this.decIssueDate = decIssueDate;
    }

    /** 
     * Get the 'DecEndDate' element value. ���� ��������� ��������������� ������� �������
     * 
     * @return value
     */
    public LocalDate getDecEndDate() {
        return decEndDate;
    }

    /** 
     * Set the 'DecEndDate' element value. ���� ��������� ��������������� ������� �������
     * 
     * @param decEndDate
     */
    public void setDecEndDate(LocalDate decEndDate) {
        this.decEndDate = decEndDate;
    }

    /** 
     * Get the 'GoodsLocation' element value. ��������������� �������, ������ ������� �������������
     * 
     * @return value
     */
    public String getGoodsLocation() {
        return goodsLocation;
    }

    /** 
     * Set the 'GoodsLocation' element value. ��������������� �������, ������ ������� �������������
     * 
     * @param goodsLocation
     */
    public void setGoodsLocation(String goodsLocation) {
        this.goodsLocation = goodsLocation;
    }

    /** 
     * Get the list of 'RightPerson' element items. ��������������� (���������, �������������)
     * 
     * @return list
     */
    public List<RightPersonType> getRightPersonList() {
        return rightPersonList;
    }

    /** 
     * Set the list of 'RightPerson' element items. ��������������� (���������, �������������)
     * 
     * @param list
     */
    public void setRightPersonList(List<RightPersonType> list) {
        rightPersonList = list;
    }

    /** 
     * Get the 'Customs' element value. ���������� �����
     * 
     * @return value
     */
    public CustomsInfoType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ���������� �����
     * 
     * @param customs
     */
    public void setCustoms(CustomsInfoType customs) {
        this.customs = customs;
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
     * Get the list of 'RestrictionGoodsInfo' element items. �������� � ������, �� ������� �������� �����������
     * 
     * @return list
     */
    public List<RestrictionGoodsInfoType> getRestrictionGoodsInfoList() {
        return restrictionGoodsInfoList;
    }

    /** 
     * Set the list of 'RestrictionGoodsInfo' element items. �������� � ������, �� ������� �������� �����������
     * 
     * @param list
     */
    public void setRestrictionGoodsInfoList(List<RestrictionGoodsInfoType> list) {
        restrictionGoodsInfoList = list;
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
