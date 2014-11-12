
package ru.acs.fts.schemas.album.archpermitparticipantsinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * �������� �� ���� ����������, ������� ������ � ��������� ���������� ������
 */
public class ArchPermitParticipantsInfoType extends BaseDocType
{
    private String archDeclID;
    private List<ParticipantType> participantList = new ArrayList<ParticipantType>();
    private String documentModeID;

    /** 
     * Get the 'ArchDeclID' element value. ������������� ���������� � ������
     * 
     * @return value
     */
    public String getArchDeclID() {
        return archDeclID;
    }

    /** 
     * Set the 'ArchDeclID' element value. ������������� ���������� � ������
     * 
     * @param archDeclID
     */
    public void setArchDeclID(String archDeclID) {
        this.archDeclID = archDeclID;
    }

    /** 
     * Get the list of 'Participant' element items. ��������, ������� ������ � ��������� ���������� ������
     * 
     * @return list
     */
    public List<ParticipantType> getParticipantList() {
        return participantList;
    }

    /** 
     * Set the list of 'Participant' element items. ��������, ������� ������ � ��������� ���������� ������
     * 
     * @param list
     */
    public void setParticipantList(List<ParticipantType> list) {
        participantList = list;
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
