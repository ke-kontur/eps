
package ru.acs.fts.schemas.album.rosprirodtempoutredbook;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ����� �� ������ �������� �� ���������� (����������) � ����������� ���������� ������ ����� �������� � ������������ ��������, ����������� � �����, ���������� � ������� ����� ���������� ���������
 */
public class RosPrirodTempOutRedBookType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private String documentId;
    private String removalTime;
    private String authorizedPerson;
    private DocumentBaseType conclusion;
    private CUOrganizationType person;
    private CUOrganizationType recipient;
    private List<ObjectType> objectList = new ArrayList<ObjectType>();
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
     * Get the 'AuthorizedPerson' element value. �������������� ����������� ����, ����������� ����������
     * 
     * @return value
     */
    public String getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. �������������� ����������� ����, ����������� ����������
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(String authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }

    /** 
     * Get the 'Conclusion' element value. �������� � ����������
     * 
     * @return value
     */
    public DocumentBaseType getConclusion() {
        return conclusion;
    }

    /** 
     * Set the 'Conclusion' element value. �������� � ����������
     * 
     * @param conclusion
     */
    public void setConclusion(DocumentBaseType conclusion) {
        this.conclusion = conclusion;
    }

    /** 
     * Get the 'Person' element value. ��������� ���������� ����������
     * 
     * @return value
     */
    public CUOrganizationType getPerson() {
        return person;
    }

    /** 
     * Set the 'Person' element value. ��������� ���������� ����������
     * 
     * @param person
     */
    public void setPerson(CUOrganizationType person) {
        this.person = person;
    }

    /** 
     * Get the 'Recipient' element value. ���������� ����� �������� � ������������ ��������, ����������� � �����, ���������� � ������� �����
     * 
     * @return value
     */
    public CUOrganizationType getRecipient() {
        return recipient;
    }

    /** 
     * Set the 'Recipient' element value. ���������� ����� �������� � ������������ ��������, ����������� � �����, ���������� � ������� �����
     * 
     * @param recipient
     */
    public void setRecipient(CUOrganizationType recipient) {
        this.recipient = recipient;
    }

    /** 
     * Get the list of 'Object' element items. �������� ��� ��������, ��������� � ������� �����
     * 
     * @return list
     */
    public List<ObjectType> getObjectList() {
        return objectList;
    }

    /** 
     * Set the list of 'Object' element items. �������� ��� ��������, ��������� � ������� �����
     * 
     * @param list
     */
    public void setObjectList(List<ObjectType> list) {
        objectList = list;
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
