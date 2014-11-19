
package ru.acs.fts.schemas.album.rosprirodcollectionmaterial;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.sqcommonaggregatetypescust.ConclusionType;

/** 
 * ����� �� ������ �������� �� ���������� (��������������� ���������) � ����������� ������������� ������ ������������� ���������� �� �����������, �������������, ������ ���������� ��������
 */
public class RosPrirodCollectionMaterialType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private String documentId;
    private String countryDestionation;
    private String purposeExport;
    private String removalTime;
    private String authorizedPerson;
    private ConclusionType conclusion;
    private CUOrganizationType receiver;
    private List<ItemType> itemList = new ArrayList<ItemType>();
    private DocumentBaseType documentBase;
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
     * Get the 'DocumentId' element value. Id ���������
     * 
     * @return value
     */
    public String getDocumentId() {
        return documentId;
    }

    /** 
     * Set the 'DocumentId' element value. Id ���������
     * 
     * @param documentId
     */
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /** 
     * Get the 'CountryDestionation' element value. ������ ����������
     * 
     * @return value
     */
    public String getCountryDestionation() {
        return countryDestionation;
    }

    /** 
     * Set the 'CountryDestionation' element value. ������ ����������
     * 
     * @param countryDestionation
     */
    public void setCountryDestionation(String countryDestionation) {
        this.countryDestionation = countryDestionation;
    }

    /** 
     * Get the 'PurposeExport' element value. ���� ������
     * 
     * @return value
     */
    public String getPurposeExport() {
        return purposeExport;
    }

    /** 
     * Set the 'PurposeExport' element value. ���� ������
     * 
     * @param purposeExport
     */
    public void setPurposeExport(String purposeExport) {
        this.purposeExport = purposeExport;
    }

    /** 
     * Get the 'RemovalTime' element value. ���� ������
     * 
     * @return value
     */
    public String getRemovalTime() {
        return removalTime;
    }

    /** 
     * Set the 'RemovalTime' element value. ���� ������
     * 
     * @param removalTime
     */
    public void setRemovalTime(String removalTime) {
        this.removalTime = removalTime;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. �������������� ����������� ����
     * 
     * @return value
     */
    public String getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. �������������� ����������� ����
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(String authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }

    /** 
     * Get the 'Conclusion' element value. ����������
     * 
     * @return value
     */
    public ConclusionType getConclusion() {
        return conclusion;
    }

    /** 
     * Set the 'Conclusion' element value. ����������
     * 
     * @param conclusion
     */
    public void setConclusion(ConclusionType conclusion) {
        this.conclusion = conclusion;
    }

    /** 
     * Get the 'Receiver' element value. ��������� ���������� ����������
     * 
     * @return value
     */
    public CUOrganizationType getReceiver() {
        return receiver;
    }

    /** 
     * Set the 'Receiver' element value. ��������� ���������� ����������
     * 
     * @param receiver
     */
    public void setReceiver(CUOrganizationType receiver) {
        this.receiver = receiver;
    }

    /** 
     * Get the list of 'Items' element items. ������ ��������� � �� ����������
     * 
     * @return list
     */
    public List<ItemType> getItemList() {
        return itemList;
    }

    /** 
     * Set the list of 'Items' element items. ������ ��������� � �� ����������
     * 
     * @param list
     */
    public void setItemList(List<ItemType> list) {
        itemList = list;
    }

    /** 
     * Get the 'DocumentBase' element value. ���������
     * 
     * @return value
     */
    public DocumentBaseType getDocumentBase() {
        return documentBase;
    }

    /** 
     * Set the 'DocumentBase' element value. ���������
     * 
     * @param documentBase
     */
    public void setDocumentBase(DocumentBaseType documentBase) {
        this.documentBase = documentBase;
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
