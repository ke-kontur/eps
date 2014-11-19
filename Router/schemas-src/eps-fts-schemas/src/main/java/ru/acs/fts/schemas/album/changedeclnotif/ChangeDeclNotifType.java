
package ru.acs.fts.schemas.album.changedeclnotif;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ����������� �� ��������� ��
 */
public class ChangeDeclNotifType extends BaseDocType
{
    private String changeDeclType;
    private GTDIDType DTID;
    private GTDIDType newDTID;
    private String documentModeID;

    /** 
     * Get the 'ChangeDeclType' element value. �������� ��������� ���������
     * 
     * @return value
     */
    public String getChangeDeclType() {
        return changeDeclType;
    }

    /** 
     * Set the 'ChangeDeclType' element value. �������� ��������� ���������
     * 
     * @param changeDeclType
     */
    public void setChangeDeclType(String changeDeclType) {
        this.changeDeclType = changeDeclType;
    }

    /** 
     * Get the 'DTID' element value. ��������������� ����� ��.
     * 
     * @return value
     */
    public GTDIDType getDTID() {
        return DTID;
    }

    /** 
     * Set the 'DTID' element value. ��������������� ����� ��.
     * 
     * @param DTID
     */
    public void setDTID(GTDIDType DTID) {
        this.DTID = DTID;
    }

    /** 
     * Get the 'NewDTID' element value. ������������ ��������������� ����� ��.
     * 
     * @return value
     */
    public GTDIDType getNewDTID() {
        return newDTID;
    }

    /** 
     * Set the 'NewDTID' element value. ������������ ��������������� ����� ��.
     * 
     * @param newDTID
     */
    public void setNewDTID(GTDIDType newDTID) {
        this.newDTID = newDTID;
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
