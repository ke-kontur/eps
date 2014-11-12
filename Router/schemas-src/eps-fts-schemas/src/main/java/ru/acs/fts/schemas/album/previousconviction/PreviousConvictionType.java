
package ru.acs.fts.schemas.album.previousconviction;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * �������� � ������� ��������� � ������������ � ����������� ������������ ����
 */
public class PreviousConvictionType extends BaseDocType
{
    private OrganizationType organization;
    private ResultInfoType resultInfo;
    private String documentModeID;

    /** 
     * Get the 'Organization' element value. �������� �� �����������/���. ���� (��. ����/��)
     * 
     * @return value
     */
    public OrganizationType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. �������� �� �����������/���. ���� (��. ����/��)
     * 
     * @param organization
     */
    public void setOrganization(OrganizationType organization) {
        this.organization = organization;
    }

    /** 
     * Get the 'ResultInfo' element value. �������� � ���������� ���� �� ����
     * 
     * @return value
     */
    public ResultInfoType getResultInfo() {
        return resultInfo;
    }

    /** 
     * Set the 'ResultInfo' element value. �������� � ���������� ���� �� ����
     * 
     * @param resultInfo
     */
    public void setResultInfo(ResultInfoType resultInfo) {
        this.resultInfo = resultInfo;
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
