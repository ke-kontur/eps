
package ru.acs.fts.schemas.album.rosstandartvehicleapproval;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ��������� ������������� ��������
 */
public class RosstandartVehicleApprovalType extends BaseDocType
{
    private String TCtypeApprovalsAddition;
    private String TCtypeResult;
    private TransportMeanType transportMean;
    private DocumentBaseType approval;
    private String documentModeID;

    /** 
     * Get the 'TCtypeApprovalsAddition' element value. ����������
     * 
     * @return value
     */
    public String getTCtypeApprovalsAddition() {
        return TCtypeApprovalsAddition;
    }

    /** 
     * Set the 'TCtypeApprovalsAddition' element value. ����������
     * 
     * @param TCtypeApprovalsAddition
     */
    public void setTCtypeApprovalsAddition(String TCtypeApprovalsAddition) {
        this.TCtypeApprovalsAddition = TCtypeApprovalsAddition;
    }

    /** 
     * Get the 'TCtypeResult' element value. ������� �������������� ������
     * 
     * @return value
     */
    public String getTCtypeResult() {
        return TCtypeResult;
    }

    /** 
     * Set the 'TCtypeResult' element value. ������� �������������� ������
     * 
     * @param TCtypeResult
     */
    public void setTCtypeResult(String TCtypeResult) {
        this.TCtypeResult = TCtypeResult;
    }

    /** 
     * Get the 'TransportMean' element value. ������������ ��������
     * 
     * @return value
     */
    public TransportMeanType getTransportMean() {
        return transportMean;
    }

    /** 
     * Set the 'TransportMean' element value. ������������ ��������
     * 
     * @param transportMean
     */
    public void setTransportMean(TransportMeanType transportMean) {
        this.transportMean = transportMean;
    }

    /** 
     * Get the 'Approval' element value. ��������� ���� ������������� ��������
     * 
     * @return value
     */
    public DocumentBaseType getApproval() {
        return approval;
    }

    /** 
     * Set the 'Approval' element value. ��������� ���� ������������� ��������
     * 
     * @param approval
     */
    public void setApproval(DocumentBaseType approval) {
        this.approval = approval;
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
