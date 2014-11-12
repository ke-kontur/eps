
package ru.acs.fts.schemas.album.rzndesignatedpurpose;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ������������� �������� ���������� ����������, �������� � ������ ���������� � ����� ���������� ����������������, �������� � ����������� ��������� �� 22 ������ 1950 �./�������� � ������� ���������� ��� ��������/�������� � ������������� �������� ���������� ��������� ������ (��������)/�������� � ������������� �������� ���������� ��������� ������ (�����������)
 */
public class RZNDesignatedPurposeType extends BaseDocType
{
    private String BDRDID;
    private String docSign;
    private ConfirmationType confirmation;
    private OrganizationType holder;
    private CUOrganizationType consignee;
    private DocumentBaseType contract;
    private GoodsDescriptionType goodsDescription;
    private List<CUOrganizationType> targetMedOrgList = new ArrayList<CUOrganizationType>();
    private DocumentBaseType confirmationLetter;
    private String documentModeID;

    /** 
     * Get the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'DocSign' element value. ������� ���������: 1 - ������������� �������� ���������� ����������, �������� � ������ ���������� � ����� ���������� ����������������, �������� � ����������� ��������� �� 22 ������ 1950 �.; 2 - �������� � ������� ���������� ��� ��������; 3 - �������� � ������������� �������� ���������� ��������� ������ (��������); 4 - �������� � ������������� �������� ���������� ��������� ������ (�����������)
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ���������: 1 - ������������� �������� ���������� ����������, �������� � ������ ���������� � ����� ���������� ����������������, �������� � ����������� ��������� �� 22 ������ 1950 �.; 2 - �������� � ������� ���������� ��� ��������; 3 - �������� � ������������� �������� ���������� ��������� ������ (��������); 4 - �������� � ������������� �������� ���������� ��������� ������ (�����������)
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'Confirmation' element value. ������������� (�������������)
     * 
     * @return value
     */
    public ConfirmationType getConfirmation() {
        return confirmation;
    }

    /** 
     * Set the 'Confirmation' element value. ������������� (�������������)
     * 
     * @param confirmation
     */
    public void setConfirmation(ConfirmationType confirmation) {
        this.confirmation = confirmation;
    }

    /** 
     * Get the 'Holder' element value. ��������� ������������� (���������� ��������������� ������)
     * 
     * @return value
     */
    public OrganizationType getHolder() {
        return holder;
    }

    /** 
     * Set the 'Holder' element value. ��������� ������������� (���������� ��������������� ������)
     * 
     * @param holder
     */
    public void setHolder(OrganizationType holder) {
        this.holder = holder;
    }

    /** 
     * Get the 'Consignee' element value. ���������������
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ���������������
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Contract' element value. ��������
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. ��������
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the 'GoodsDescription' element value. �������� ������
     * 
     * @return value
     */
    public GoodsDescriptionType getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. �������� ������
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(GoodsDescriptionType goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the list of 'TargetMedOrg' element items. ����������� ����������� (������), ��� ������� ������������ �������� �����
     * 
     * @return list
     */
    public List<CUOrganizationType> getTargetMedOrgList() {
        return targetMedOrgList;
    }

    /** 
     * Set the list of 'TargetMedOrg' element items. ����������� ����������� (������), ��� ������� ������������ �������� �����
     * 
     * @param list
     */
    public void setTargetMedOrgList(List<CUOrganizationType> list) {
        targetMedOrgList = list;
    }

    /** 
     * Get the 'ConfirmationLetter' element value. ������ � ������������� �������� ���������� ������ ��� ����������� �����
     * 
     * @return value
     */
    public DocumentBaseType getConfirmationLetter() {
        return confirmationLetter;
    }

    /** 
     * Set the 'ConfirmationLetter' element value. ������ � ������������� �������� ���������� ������ ��� ����������� �����
     * 
     * @param confirmationLetter
     */
    public void setConfirmationLetter(DocumentBaseType confirmationLetter) {
        this.confirmationLetter = confirmationLetter;
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
