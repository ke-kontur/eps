
package ru.acs.fts.schemas.album.esadinforeq;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.scvvcommonaggregatetypescust.GTDInqType;

/** 
 * ������ ���������� �� ��/��
 */
public class ESADInfoReqType extends BaseDocType
{
    private GTDInqType DTID;
    private String documentModeID;

    /** 
     * Get the 'DTID' element value. ��������������� ����� ��.
     * 
     * @return value
     */
    public GTDInqType getDTID() {
        return DTID;
    }

    /** 
     * Set the 'DTID' element value. ��������������� ����� ��.
     * 
     * @param DTID
     */
    public void setDTID(GTDInqType DTID) {
        this.DTID = DTID;
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
