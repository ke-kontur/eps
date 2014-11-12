
package ru.acs.fts.schemas.album.custpaymentreq;

import ru.acs.fts.schemas.album.cardcommonaggregatetypes.BaseDocType;
import ru.acs.fts.schemas.album.cardcommonaggregatetypes.OrganizationBaseType;

/** 
 * ������ �������� � ������ �������� �������, ���������� ������ �� ���������� �� ������
 */
public class CustPaymentReqType extends BaseDocType
{
    private String processID;
    private OrganizationBaseType payer;
    private String documentModeID;

    /** 
     * Get the 'ProcessID' element value. ���������� ������������� ��������� �� (GUID)
     * 
     * @return value
     */
    public String getProcessID() {
        return processID;
    }

    /** 
     * Set the 'ProcessID' element value. ���������� ������������� ��������� �� (GUID)
     * 
     * @param processID
     */
    public void setProcessID(String processID) {
        this.processID = processID;
    }

    /** 
     * Get the 'Payer' element value. ���������� � �����������
     * 
     * @return value
     */
    public OrganizationBaseType getPayer() {
        return payer;
    }

    /** 
     * Set the 'Payer' element value. ���������� � �����������
     * 
     * @param payer
     */
    public void setPayer(OrganizationBaseType payer) {
        this.payer = payer;
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
