
package ru.acs.fts.schemas.album.actinspectionin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.ATDCustomPersonType;

/** 
 * Присутствующие лица
 */
public class InspPersonType
{
    private String personFlag;
    private List<ATDCustomPersonType> ATDCustomPersonList = new ArrayList<ATDCustomPersonType>();
    private List<InspectionParticipantType> inspectionParticipantList = new ArrayList<InspectionParticipantType>();

    /** 
     * Get the 'PersonFlag' element value. Признак присутствия заинтересованных лиц при проведении досмотра
     * 
     * @return value
     */
    public String getPersonFlag() {
        return personFlag;
    }

    /** 
     * Set the 'PersonFlag' element value. Признак присутствия заинтересованных лиц при проведении досмотра
     * 
     * @param personFlag
     */
    public void setPersonFlag(String personFlag) {
        this.personFlag = personFlag;
    }

    /** 
     * Get the list of 'ATDCustomPerson' element items. Должностное лицо  ТО, присутствовавшее при досмотре
     * 
     * @return list
     */
    public List<ATDCustomPersonType> getATDCustomPersonList() {
        return ATDCustomPersonList;
    }

    /** 
     * Set the list of 'ATDCustomPerson' element items. Должностное лицо  ТО, присутствовавшее при досмотре
     * 
     * @param list
     */
    public void setATDCustomPersonList(List<ATDCustomPersonType> list) {
        ATDCustomPersonList = list;
    }

    /** 
     * Get the list of 'InspectionParticipant' element items. Лицо, присутствующее при досмотре (осмотре)
     * 
     * @return list
     */
    public List<InspectionParticipantType> getInspectionParticipantList() {
        return inspectionParticipantList;
    }

    /** 
     * Set the list of 'InspectionParticipant' element items. Лицо, присутствующее при досмотре (осмотре)
     * 
     * @param list
     */
    public void setInspectionParticipantList(
            List<InspectionParticipantType> list) {
        inspectionParticipantList = list;
    }
}
