
package ru.acs.fts.schemas.album.roskomradio;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * �������� �� ���������� (��������������� ���������) �� ���� ���������������� ������� � ��������������� ���������, � ��� ����� ���������� ���� �������� � ������ ������ �������
 */
public class RosKomRadioType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private LocalDate outDate;
    private String importObjective;
    private String requesterName;
    private String permissionOrganName;
    private DocInfoType documentInfo;
    private OwnerType owner;
    private List<ResItemType> resItemList = new ArrayList<ResItemType>();
    private List<DocumentBaseType> contractList = new ArrayList<DocumentBaseType>();
    private OrganizationBaseType organizationName;
    private PersonSignatureType signer;
    private String documentModeID;

    /** 
     * Get the 'IsCanceled' element value. ������� ����������� �������� ���������
     * 
     * @return value
     */
    public String getIsCanceled() {
        return isCanceled;
    }

    /** 
     * Set the 'IsCanceled' element value. ������� ����������� �������� ���������
     * 
     * @param isCanceled
     */
    public void setIsCanceled(String isCanceled) {
        this.isCanceled = isCanceled;
    }

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
     * Get the 'OutDate' element value. ���� ������ ������������
     * 
     * @return value
     */
    public LocalDate getOutDate() {
        return outDate;
    }

    /** 
     * Set the 'OutDate' element value. ���� ������ ������������
     * 
     * @param outDate
     */
    public void setOutDate(LocalDate outDate) {
        this.outDate = outDate;
    }

    /** 
     * Get the 'ImportObjective' element value. ���� �����
     * 
     * @return value
     */
    public String getImportObjective() {
        return importObjective;
    }

    /** 
     * Set the 'ImportObjective' element value. ���� �����
     * 
     * @param importObjective
     */
    public void setImportObjective(String importObjective) {
        this.importObjective = importObjective;
    }

    /** 
     * Get the 'RequesterName' element value. ������������ ������ �������� ���������� ��� ������������ ������ �������������� ������, ������������� �� ���������� ���������� �� ���� ���
     * 
     * @return value
     */
    public String getRequesterName() {
        return requesterName;
    }

    /** 
     * Set the 'RequesterName' element value. ������������ ������ �������� ���������� ��� ������������ ������ �������������� ������, ������������� �� ���������� ���������� �� ���� ���
     * 
     * @param requesterName
     */
    public void setRequesterName(String requesterName) {
        this.requesterName = requesterName;
    }

    /** 
     * Get the 'PermissionOrganName' element value. ������������ ������ �������� ���������� ��� ������������ ������ �������������� ������, �������� ����������� ���� ���
     * 
     * @return value
     */
    public String getPermissionOrganName() {
        return permissionOrganName;
    }

    /** 
     * Set the 'PermissionOrganName' element value. ������������ ������ �������� ���������� ��� ������������ ������ �������������� ������, �������� ����������� ���� ���
     * 
     * @param permissionOrganName
     */
    public void setPermissionOrganName(String permissionOrganName) {
        this.permissionOrganName = permissionOrganName;
    }

    /** 
     * Get the 'DocumentInfo' element value. �������� � ���������
     * 
     * @return value
     */
    public DocInfoType getDocumentInfo() {
        return documentInfo;
    }

    /** 
     * Set the 'DocumentInfo' element value. �������� � ���������
     * 
     * @param documentInfo
     */
    public void setDocumentInfo(DocInfoType documentInfo) {
        this.documentInfo = documentInfo;
    }

    /** 
     * Get the 'Owner' element value. ��������� ���������
     * 
     * @return value
     */
    public OwnerType getOwner() {
        return owner;
    }

    /** 
     * Set the 'Owner' element value. ��������� ���������
     * 
     * @param owner
     */
    public void setOwner(OwnerType owner) {
        this.owner = owner;
    }

    /** 
     * Get the list of 'ResItem' element items. ������������ (��� ���, ��� ������������)
     * 
     * @return list
     */
    public List<ResItemType> getResItemList() {
        return resItemList;
    }

    /** 
     * Set the list of 'ResItem' element items. ������������ (��� ���, ��� ������������)
     * 
     * @param list
     */
    public void setResItemList(List<ResItemType> list) {
        resItemList = list;
    }

    /** 
     * Get the list of 'Contract' element items. ������� (��������) �� �������� ���
     * 
     * @return list
     */
    public List<DocumentBaseType> getContractList() {
        return contractList;
    }

    /** 
     * Set the list of 'Contract' element items. ������� (��������) �� �������� ���
     * 
     * @param list
     */
    public void setContractList(List<DocumentBaseType> list) {
        contractList = list;
    }

    /** 
     * Get the 'OrganizationName' element value. ������������ �����������, ������������ ���
     * 
     * @return value
     */
    public OrganizationBaseType getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ �����������, ������������ ���
     * 
     * @param organizationName
     */
    public void setOrganizationName(OrganizationBaseType organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'Signer' element value. ����, ����������� ��������
     * 
     * @return value
     */
    public PersonSignatureType getSigner() {
        return signer;
    }

    /** 
     * Set the 'Signer' element value. ����, ����������� ��������
     * 
     * @param signer
     */
    public void setSigner(PersonSignatureType signer) {
        this.signer = signer;
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
