
package ru.acs.fts.schemas.album.reqopenproc;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ������ �� �������� ��������� ��������������
 */
public class ReqOpenProcType extends BaseDocType
{
    private OrganizationType declarant;
    private String documentModeID;

    /** 
     * Get the 'Declarant' element value. ���������� �� ��������� ���.
     * 
     * @return value
     */
    public OrganizationType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. ���������� �� ��������� ���.
     * 
     * @param declarant
     */
    public void setDeclarant(OrganizationType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
