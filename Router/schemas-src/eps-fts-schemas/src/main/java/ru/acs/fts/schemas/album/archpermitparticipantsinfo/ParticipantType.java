
package ru.acs.fts.schemas.album.archpermitparticipantsinfo;

import java.util.ArrayList;
import java.util.List;

/** 
 * Участник, имеющий допуск к просмотру документов архива
 */
public class ParticipantType
{
    private String participantID;
    private List<ArchiveType> archiveList = new ArrayList<ArchiveType>();

    /** 
     * Get the 'ParticipantID' element value. Идентификатор участника
     * 
     * @return value
     */
    public String getParticipantID() {
        return participantID;
    }

    /** 
     * Set the 'ParticipantID' element value. Идентификатор участника
     * 
     * @param participantID
     */
    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    /** 
     * Get the list of 'Archive' element items. Архив, доступный для просмотра
     * 
     * @return list
     */
    public List<ArchiveType> getArchiveList() {
        return archiveList;
    }

    /** 
     * Set the list of 'Archive' element items. Архив, доступный для просмотра
     * 
     * @param list
     */
    public void setArchiveList(List<ArchiveType> list) {
        archiveList = list;
    }
}
