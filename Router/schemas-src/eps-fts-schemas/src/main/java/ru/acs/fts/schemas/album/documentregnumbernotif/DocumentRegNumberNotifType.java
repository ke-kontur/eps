
package ru.acs.fts.schemas.album.documentregnumbernotif;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ����������� � ����������� ��������� (������ ����������)
 */
public class DocumentRegNumberNotifType extends BaseDocType
{
    private String documentRegNumber;
    private String documentModeID;

    /** 
     * Get the 'DocumentRegNumber' element value. ���������� ����� ��������� (������ ����������)
     * 
     * @return value
     */
    public String getDocumentRegNumber() {
        return documentRegNumber;
    }

    /** 
     * Set the 'DocumentRegNumber' element value. ���������� ����� ��������� (������ ����������)
     * 
     * @param documentRegNumber
     */
    public void setDocumentRegNumber(String documentRegNumber) {
        this.documentRegNumber = documentRegNumber;
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
