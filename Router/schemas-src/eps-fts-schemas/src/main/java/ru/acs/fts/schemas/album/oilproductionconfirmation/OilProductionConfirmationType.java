
package ru.acs.fts.schemas.album.oilproductionconfirmation;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * ��������� ��������� ������� �� ������ �� �������� ��������� ������ � �����, �������������� ���� ������ ����� � ������������� ������-����������� ���������������� � ������������ �������������
 */
public class OilProductionConfirmationType extends BaseDocType
{
    private String statusCode;
    private String statusComment;
    private CUOrganizationType receiver;
    private ConsignmentInfoType consignmentInfo;
    private String documentModeID;

    /** 
     * Get the 'StatusCode' element value. ��� �������
     * 
     * @return value
     */
    public String getStatusCode() {
        return statusCode;
    }

    /** 
     * Set the 'StatusCode' element value. ��� �������
     * 
     * @param statusCode
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /** 
     * Get the 'StatusComment' element value. ����������� �������
     * 
     * @return value
     */
    public String getStatusComment() {
        return statusComment;
    }

    /** 
     * Set the 'StatusComment' element value. ����������� �������
     * 
     * @param statusComment
     */
    public void setStatusComment(String statusComment) {
        this.statusComment = statusComment;
    }

    /** 
     * Get the 'Receiver' element value. ����������
     * 
     * @return value
     */
    public CUOrganizationType getReceiver() {
        return receiver;
    }

    /** 
     * Set the 'Receiver' element value. ����������
     * 
     * @param receiver
     */
    public void setReceiver(CUOrganizationType receiver) {
        this.receiver = receiver;
    }

    /** 
     * Get the 'ConsignmentInfo' element value. �������� � ��������
     * 
     * @return value
     */
    public ConsignmentInfoType getConsignmentInfo() {
        return consignmentInfo;
    }

    /** 
     * Set the 'ConsignmentInfo' element value. �������� � ��������
     * 
     * @param consignmentInfo
     */
    public void setConsignmentInfo(ConsignmentInfoType consignmentInfo) {
        this.consignmentInfo = consignmentInfo;
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
