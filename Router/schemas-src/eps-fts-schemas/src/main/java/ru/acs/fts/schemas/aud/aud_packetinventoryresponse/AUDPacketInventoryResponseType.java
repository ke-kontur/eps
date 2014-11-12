
package ru.acs.fts.schemas.aud.aud_packetinventoryresponse;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * ����� ���������� �� ������, ������� ��������� � ���
 */
public class AUDPacketInventoryResponseType extends AUDBaseEnvelopeType
{
    private String appliedProcessId;
    private List<String> appliedPacketIdList = new ArrayList<String>();
    private String packetType;
    private DateTime issued;
    private List<DocumentInventoryItemType> documentInventoryItemList = new ArrayList<DocumentInventoryItemType>();
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
     * Get the list of 'AppliedPacketId' element items. ���������� ������������� ������
     * 
     * @return list
     */
    public List<String> getAppliedPacketIdList() {
        return appliedPacketIdList;
    }

    /** 
     * Set the list of 'AppliedPacketId' element items. ���������� ������������� ������
     * 
     * @param list
     */
    public void setAppliedPacketIdList(List<String> list) {
        appliedPacketIdList = list;
    }

    /** 
     * Get the 'PacketType' element value. ��� ������������ ������: 01 - ���, 99 - ������
     * 
     * @return value
     */
    public String getPacketType() {
        return packetType;
    }

    /** 
     * Set the 'PacketType' element value. ��� ������������ ������: 01 - ���, 99 - ������
     * 
     * @param packetType
     */
    public void setPacketType(String packetType) {
        this.packetType = packetType;
    }

    /** 
     * Get the 'Issued' element value. ���� � ����� ����������� ������
     * 
     * @return value
     */
    public DateTime getIssued() {
        return issued;
    }

    /** 
     * Set the 'Issued' element value. ���� � ����� ����������� ������
     * 
     * @param issued
     */
    public void setIssued(DateTime issued) {
        this.issued = issued;
    }

    /** 
     * Get the list of 'DocumentInventoryItem' element items. �������� � ��������� �� �����
     * 
     * @return list
     */
    public List<DocumentInventoryItemType> getDocumentInventoryItemList() {
        return documentInventoryItemList;
    }

    /** 
     * Set the list of 'DocumentInventoryItem' element items. �������� � ��������� �� �����
     * 
     * @param list
     */
    public void setDocumentInventoryItemList(
            List<DocumentInventoryItemType> list) {
        documentInventoryItemList = list;
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
