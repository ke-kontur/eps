
package ru.acs.fts.schemas.album.permitopenproc;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ����������� �� �������� ��������� ��������������.
 */
public class PermitOpenProcType extends BaseDocType
{
    private String procedureID;
    private String documentModeID;

    /** 
     * Get the 'ProcedureID' element value. ID ��������� ��������������
     * 
     * @return value
     */
    public String getProcedureID() {
        return procedureID;
    }

    /** 
     * Set the 'ProcedureID' element value. ID ��������� ��������������
     * 
     * @param procedureID
     */
    public void setProcedureID(String procedureID) {
        this.procedureID = procedureID;
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
