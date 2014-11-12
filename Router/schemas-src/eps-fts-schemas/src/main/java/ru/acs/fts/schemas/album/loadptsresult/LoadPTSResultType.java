
package ru.acs.fts.schemas.album.loadptsresult;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ����� � ���������� ���������
 */
public class LoadPTSResultType extends BaseDocType
{
    private ProtocolProcessingPacketType protocolProcessingPacket;
    private List<ProtocolProcessingFormType> protocolProcessingFormList = new ArrayList<ProtocolProcessingFormType>();
    private String documentModeID;

    /** 
     * Get the 'ProtocolProcessingPacket' element value. ��������� �������� / ��������� ������ 
     * 
     * @return value
     */
    public ProtocolProcessingPacketType getProtocolProcessingPacket() {
        return protocolProcessingPacket;
    }

    /** 
     * Set the 'ProtocolProcessingPacket' element value. ��������� �������� / ��������� ������ 
     * 
     * @param protocolProcessingPacket
     */
    public void setProtocolProcessingPacket(
            ProtocolProcessingPacketType protocolProcessingPacket) {
        this.protocolProcessingPacket = protocolProcessingPacket;
    }

    /** 
     * Get the list of 'ProtocolProcessingForm' element items. �������� � ����������� ���������� ���������� � ������������ �������� ������
     * 
     * @return list
     */
    public List<ProtocolProcessingFormType> getProtocolProcessingFormList() {
        return protocolProcessingFormList;
    }

    /** 
     * Set the list of 'ProtocolProcessingForm' element items. �������� � ����������� ���������� ���������� � ������������ �������� ������
     * 
     * @param list
     */
    public void setProtocolProcessingFormList(
            List<ProtocolProcessingFormType> list) {
        protocolProcessingFormList = list;
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
