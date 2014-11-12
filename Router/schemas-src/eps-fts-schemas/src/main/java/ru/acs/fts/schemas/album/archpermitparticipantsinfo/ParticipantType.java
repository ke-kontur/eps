
package ru.acs.fts.schemas.album.archpermitparticipantsinfo;

import java.util.ArrayList;
import java.util.List;

/** 
 * ��������, ������� ������ � ��������� ���������� ������
 */
public class ParticipantType
{
    private String participantID;
    private List<ArchiveType> archiveList = new ArrayList<ArchiveType>();

    /** 
     * Get the 'ParticipantID' element value. ������������� ���������
     * 
     * @return value
     */
    public String getParticipantID() {
        return participantID;
    }

    /** 
     * Set the 'ParticipantID' element value. ������������� ���������
     * 
     * @param participantID
     */
    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    /** 
     * Get the list of 'Archive' element items. �����, ��������� ��� ���������
     * 
     * @return list
     */
    public List<ArchiveType> getArchiveList() {
        return archiveList;
    }

    /** 
     * Set the list of 'Archive' element items. �����, ��������� ��� ���������
     * 
     * @param list
     */
    public void setArchiveList(List<ArchiveType> list) {
        archiveList = list;
    }
}
