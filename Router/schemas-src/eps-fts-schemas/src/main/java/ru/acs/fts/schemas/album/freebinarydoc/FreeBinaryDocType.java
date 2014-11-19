
package ru.acs.fts.schemas.album.freebinarydoc;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� ������
 */
public class FreeBinaryDocType extends BaseDocType
{
    private DocumentBaseType documentInfo;
    private DocumentBaseType mainDocumentInfo;
    private DocBodyType documentBody;
    private String documentModeID;

    /** 
     * Get the 'DocumentInfo' element value. ���������� � ���������
     * 
     * @return value
     */
    public DocumentBaseType getDocumentInfo() {
        return documentInfo;
    }

    /** 
     * Set the 'DocumentInfo' element value. ���������� � ���������
     * 
     * @param documentInfo
     */
    public void setDocumentInfo(DocumentBaseType documentInfo) {
        this.documentInfo = documentInfo;
    }

    /** 
     * Get the 'MainDocumentInfo' element value. ���������� �� �������� ��������� (����������� � ������, ���� ������ �������� ����������� � ������� ���������)
     * 
     * @return value
     */
    public DocumentBaseType getMainDocumentInfo() {
        return mainDocumentInfo;
    }

    /** 
     * Set the 'MainDocumentInfo' element value. ���������� �� �������� ��������� (����������� � ������, ���� ������ �������� ����������� � ������� ���������)
     * 
     * @param mainDocumentInfo
     */
    public void setMainDocumentInfo(DocumentBaseType mainDocumentInfo) {
        this.mainDocumentInfo = mainDocumentInfo;
    }

    /** 
     * Get the 'DocumentBody' element value. ����  ���������
     * 
     * @return value
     */
    public DocBodyType getDocumentBody() {
        return documentBody;
    }

    /** 
     * Set the 'DocumentBody' element value. ����  ���������
     * 
     * @param documentBody
     */
    public void setDocumentBody(DocBodyType documentBody) {
        this.documentBody = documentBody;
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
