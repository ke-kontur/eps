
package ru.acs.fts.schemas.album.rospriroddangerouswaste;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.sqcommonaggregatetypescust.DocumentType;

/** 
 * ����� �� ������ ��������  �� ���������� �� �������  ������� ������� �� ���������� ���������� ����������� �����
 */
public class RosPrirodDangerousWasteType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private String documentId;
    private String authorizedPerson;
    private DocumentType conclusion;
    private CUOrganizationType receiver;
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
    public DocumentType getConclusion() {
        return conclusion;
    }

    /** 
     * Set the 'Conclusion' element value. �������� � ����������
     * 
     * @param conclusion
     */
    public void setConclusion(DocumentType conclusion) {
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
     * Get the list of 'Object' element items. ������� �����, �� ������� �������� ������ ����������
     * 
     * @return list
     */
    public List<ObjectType> getObjectList() {
        return objectList;
    }

    /** 
     * Set the list of 'Object' element items. ������� �����, �� ������� �������� ������ ����������
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
