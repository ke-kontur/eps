
package ru.acs.fts.schemas.album.archpermitparticipantsinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Сведения об иных участниках, имеющих доступ к просмотру документов архива
 */
public class ArchPermitParticipantsInfoType extends BaseDocType
{
    private String archDeclID;
    private List<ParticipantType> participantList = new ArrayList<ParticipantType>();
    private String documentModeID;

    /** 
     * Get the 'ArchDeclID' element value. Идентификатор декларанта в архиве
     * 
     * @return value
     */
    public String getArchDeclID() {
        return archDeclID;
    }

    /** 
     * Set the 'ArchDeclID' element value. Идентификатор декларанта в архиве
     * 
     * @param archDeclID
     */
    public void setArchDeclID(String archDeclID) {
        this.archDeclID = archDeclID;
    }

    /** 
     * Get the list of 'Participant' element items. Участник, имеющий допуск к просмотру документов архива
     * 
     * @return list
     */
    public List<ParticipantType> getParticipantList() {
        return participantList;
    }

    /** 
     * Set the list of 'Participant' element items. Участник, имеющий допуск к просмотру документов архива
     * 
     * @param list
     */
    public void setParticipantList(List<ParticipantType> list) {
        participantList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
