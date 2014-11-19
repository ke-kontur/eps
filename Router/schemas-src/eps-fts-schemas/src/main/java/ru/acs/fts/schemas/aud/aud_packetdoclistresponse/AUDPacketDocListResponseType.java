
package ru.acs.fts.schemas.aud.aud_packetdoclistresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * ������ ����������, �����������  � ������
 */
public class AUDPacketDocListResponseType extends AUDBaseEnvelopeType
{
    private String packetAppliedID;
    private String archivePacketID;
    private List<ArchiveDocInfoType> archiveDocInfoList = new ArrayList<ArchiveDocInfoType>();
    private String documentModeID;

    /** 
     * Get the 'PacketAppliedID' element value. ����������  ������������� ������
     * 
     * @return value
     */
    public String getPacketAppliedID() {
        return packetAppliedID;
    }

    /** 
     * Set the 'PacketAppliedID' element value. ����������  ������������� ������
     * 
     * @param packetAppliedID
     */
    public void setPacketAppliedID(String packetAppliedID) {
        this.packetAppliedID = packetAppliedID;
    }

    /** 
     * Get the 'ArchivePacketID' element value. ��������  ������������� ������
     * 
     * @return value
     */
    public String getArchivePacketID() {
        return archivePacketID;
    }

    /** 
     * Set the 'ArchivePacketID' element value. ��������  ������������� ������
     * 
     * @param archivePacketID
     */
    public void setArchivePacketID(String archivePacketID) {
        this.archivePacketID = archivePacketID;
    }

    /** 
     * Get the list of 'ArchiveDocInfo' element items. ���������� � ��������� ������
     * 
     * @return list
     */
    public List<ArchiveDocInfoType> getArchiveDocInfoList() {
        return archiveDocInfoList;
    }

    /** 
     * Set the list of 'ArchiveDocInfo' element items. ���������� � ��������� ������
     * 
     * @param list
     */
    public void setArchiveDocInfoList(List<ArchiveDocInfoType> list) {
        archiveDocInfoList = list;
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
