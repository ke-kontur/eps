
package ru.acs.fts.schemas.album.reqacceptpayment;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ���������� � �������������� �������� � ����������� �������� ������� �� ���� ����������� ������
 */
public class ReqAcceptPaymentType extends BaseDocType
{
    private LocalDate sendDate;
    private OrganizationType requestor;
    private GTDIDType GTDNumber;
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. ���� �����������
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. ���� �����������
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'Requestor' element value. ���������� � ����, ������������ ����������
     * 
     * @return value
     */
    public OrganizationType getRequestor() {
        return requestor;
    }

    /** 
     * Set the 'Requestor' element value. ���������� � ����, ������������ ����������
     * 
     * @param requestor
     */
    public void setRequestor(OrganizationType requestor) {
        this.requestor = requestor;
    }

    /** 
     * Get the 'GTDNumber' element value. ���������� ����� ��
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ���������� ����� ��
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
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
