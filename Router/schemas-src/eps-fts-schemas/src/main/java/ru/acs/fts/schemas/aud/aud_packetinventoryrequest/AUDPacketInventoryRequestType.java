
package ru.acs.fts.schemas.aud.aud_packetinventoryrequest;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDGTDIDType;

/** 
 * ������ ����� ���������� �� ������ (���������), ������� ��������� � ���
 */
public class AUDPacketInventoryRequestType extends AUDBaseEnvelopeType
{
    private String appliedProcessId;
    private AUDGTDIDType AUDGTDID;
    private String documentModeID;

    /** 
     * Get the 'AppliedProcessId' element value. ���������� ������������� �������� (�������� ������������� ������)
     * 
     * @return value
     */
    public String getAppliedProcessId() {
        return appliedProcessId;
    }

    /** 
     * Set the 'AppliedProcessId' element value. ���������� ������������� �������� (�������� ������������� ������)
     * 
     * @param appliedProcessId
     */
    public void setAppliedProcessId(String appliedProcessId) {
        this.appliedProcessId = appliedProcessId;
    }

    /** 
     * Get the 'AUD_GTDID' element value. ���������������  ����� ��� �����������  ���   ����������  � ��������������  ������,  ���������������� ���  �������� ���
     * 
     * @return value
     */
    public AUDGTDIDType getAUDGTDID() {
        return AUDGTDID;
    }

    /** 
     * Set the 'AUD_GTDID' element value. ���������������  ����� ��� �����������  ���   ����������  � ��������������  ������,  ���������������� ���  �������� ���
     * 
     * @param AUDGTDID
     */
    public void setAUDGTDID(AUDGTDIDType AUDGTDID) {
        this.AUDGTDID = AUDGTDID;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������������� ��������� (�������, ������)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������������� ��������� (�������, ������)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
