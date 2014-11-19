
package ru.acs.fts.schemas.album.cardcommonaggregatetypes;

/** 
 * ������� ��� ��� ������������ ���������
 */
public class BaseDocType
{
    private String documentID;
    private String refDocumentID;

    /** 
     * Get the 'DocumentID' element value. ���������� ������������� ���������
     * 
     * @return value
     */
    public String getDocumentID() {
        return documentID;
    }

    /** 
     * Set the 'DocumentID' element value. ���������� ������������� ���������
     * 
     * @param documentID
     */
    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    /** 
     * Get the 'RefDocumentID' element value. ���������� ������������� ��������� ���������
     * 
     * @return value
     */
    public String getRefDocumentID() {
        return refDocumentID;
    }

    /** 
     * Set the 'RefDocumentID' element value. ���������� ������������� ��������� ���������
     * 
     * @param refDocumentID
     */
    public void setRefDocumentID(String refDocumentID) {
        this.refDocumentID = refDocumentID;
    }
}
