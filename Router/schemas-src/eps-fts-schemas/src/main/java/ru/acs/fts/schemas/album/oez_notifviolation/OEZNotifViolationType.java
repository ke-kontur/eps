
package ru.acs.fts.schemas.album.oez_notifviolation;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ����������� �� ������ � ������ ���������� �� ���� (�����) �������
 */
public class OEZNotifViolationType extends BaseDocType
{
    private LocalDate regDate;
    private List<String> motiveProhibitionList = new ArrayList<String>();
    private List<String> necessityActivityList = new ArrayList<String>();
    private String docSign;
    private CustomsType customs;
    private List<ListDocumentInformationType> listDocumentInformationList = new ArrayList<ListDocumentInformationType>();
    private CustomsPersonType customsPerson;
    private OrganizationBaseType declarantOEZ;
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private String documentModeID;

    /** 
     * Get the 'RegDate' element value. ���� ����������� �����������. 
     * 
     * @return value
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /** 
     * Set the 'RegDate' element value. ���� ����������� �����������. 
     * 
     * @param regDate
     */
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    /** 
     * Get the list of 'MotiveProhibition' element items. �������, �� ������� ���������� �� ���� (�����) ������� �� (�) ���������� (��) ��� �� ����� ���� ������.
     * 
     * @return list
     */
    public List<String> getMotiveProhibitionList() {
        return motiveProhibitionList;
    }

    /** 
     * Set the list of 'MotiveProhibition' element items. �������, �� ������� ���������� �� ���� (�����) ������� �� (�) ���������� (��) ��� �� ����� ���� ������.
     * 
     * @param list
     */
    public void setMotiveProhibitionList(List<String> list) {
        motiveProhibitionList = list;
    }

    /** 
     * Get the list of 'NecessityActivity' element items. ����������� �������� ��� ��������� ���������� �� ���� (�����) ������.
     * 
     * @return list
     */
    public List<String> getNecessityActivityList() {
        return necessityActivityList;
    }

    /** 
     * Set the list of 'NecessityActivity' element items. ����������� �������� ��� ��������� ���������� �� ���� (�����) ������.
     * 
     * @param list
     */
    public void setNecessityActivityList(List<String> list) {
        necessityActivityList = list;
    }

    /** 
     * Get the 'DocSign' element value. ������� ����������� �� ������ � ������ ���������� �� ���� (�����) ������� �� (�) ���������� (��): 0 - ���; 1 - ����
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ����������� �� ������ � ������ ���������� �� ���� (�����) ������� �� (�) ���������� (��): 0 - ���; 1 - ����
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'Customs' element value. ������������ ����������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ������������ ����������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the list of 'ListDocumentInformation' element items. ��������� � ��������, �������������� � �������������� ���������� �����
     * 
     * @return list
     */
    public List<ListDocumentInformationType> getListDocumentInformationList() {
        return listDocumentInformationList;
    }

    /** 
     * Set the list of 'ListDocumentInformation' element items. ��������� � ��������, �������������� � �������������� ���������� �����
     * 
     * @param list
     */
    public void setListDocumentInformationList(
            List<ListDocumentInformationType> list) {
        listDocumentInformationList = list;
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
     * Get the 'Declarant_OEZ' element value. ����, ���������� ���������� �� ���� (�����) ������ ��  (�) ���������� (��) ��� 
     * 
     * @return value
     */
    public OrganizationBaseType getDeclarantOEZ() {
        return declarantOEZ;
    }

    /** 
     * Set the 'Declarant_OEZ' element value. ����, ���������� ���������� �� ���� (�����) ������ ��  (�) ���������� (��) ��� 
     * 
     * @param declarantOEZ
     */
    public void setDeclarantOEZ(OrganizationBaseType declarantOEZ) {
        this.declarantOEZ = declarantOEZ;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. �������� � �������
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. �������� � �������
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
