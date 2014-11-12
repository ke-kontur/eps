
package ru.acs.fts.schemas.album.eps_docresponse;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������������� ��������� �� ������� ��
 */
public class EPSDocResponseType extends BaseDocType
{
    private ArchDocInfoType archDocumentInfo;
    private DocResponseType docResponse;
    private PersonBaseType responcePerson;
    private ArchiveInformationType archiveInformation;
    private String documentModeID;

    /** 
     * Get the 'ArchDocumentInfo' element value. ���������� ������ ����������
     * 
     * @return value
     */
    public ArchDocInfoType getArchDocumentInfo() {
        return archDocumentInfo;
    }

    /** 
     * Set the 'ArchDocumentInfo' element value. ���������� ������ ����������
     * 
     * @param archDocumentInfo
     */
    public void setArchDocumentInfo(ArchDocInfoType archDocumentInfo) {
        this.archDocumentInfo = archDocumentInfo;
    }

    /** 
     * Get the 'DocResponse' element value. ����������� ��������
     * 
     * @return value
     */
    public DocResponseType getDocResponse() {
        return docResponse;
    }

    /** 
     * Set the 'DocResponse' element value. ����������� ��������
     * 
     * @param docResponse
     */
    public void setDocResponse(DocResponseType docResponse) {
        this.docResponse = docResponse;
    }

    /** 
     * Get the 'ResponcePerson' element value. ����, ��������������� ����������� ��������.
     * 
     * @return value
     */
    public PersonBaseType getResponcePerson() {
        return responcePerson;
    }

    /** 
     * Set the 'ResponcePerson' element value. ����, ��������������� ����������� ��������.
     * 
     * @param responcePerson
     */
    public void setResponcePerson(PersonBaseType responcePerson) {
        this.responcePerson = responcePerson;
    }

    /** 
     * Get the 'ArchiveInformation' element value. ���������� �� ������
     * 
     * @return value
     */
    public ArchiveInformationType getArchiveInformation() {
        return archiveInformation;
    }

    /** 
     * Set the 'ArchiveInformation' element value. ���������� �� ������
     * 
     * @param archiveInformation
     */
    public void setArchiveInformation(ArchiveInformationType archiveInformation) {
        this.archiveInformation = archiveInformation;
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
