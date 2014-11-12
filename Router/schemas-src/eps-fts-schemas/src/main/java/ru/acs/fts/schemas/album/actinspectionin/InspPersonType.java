
package ru.acs.fts.schemas.album.actinspectionin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.ATDCustomPersonType;

/** 
 * �������������� ����
 */
public class InspPersonType
{
    private String personFlag;
    private List<ATDCustomPersonType> ATDCustomPersonList = new ArrayList<ATDCustomPersonType>();
    private List<InspectionParticipantType> inspectionParticipantList = new ArrayList<InspectionParticipantType>();

    /** 
     * Get the 'PersonFlag' element value. ������� ����������� ���������������� ��� ��� ���������� ��������
     * 
     * @return value
     */
    public String getPersonFlag() {
        return personFlag;
    }

    /** 
     * Set the 'PersonFlag' element value. ������� ����������� ���������������� ��� ��� ���������� ��������
     * 
     * @param personFlag
     */
    public void setPersonFlag(String personFlag) {
        this.personFlag = personFlag;
    }

    /** 
     * Get the list of 'ATDCustomPerson' element items. ����������� ����  ��, ���������������� ��� ��������
     * 
     * @return list
     */
    public List<ATDCustomPersonType> getATDCustomPersonList() {
        return ATDCustomPersonList;
    }

    /** 
     * Set the list of 'ATDCustomPerson' element items. ����������� ����  ��, ���������������� ��� ��������
     * 
     * @param list
     */
    public void setATDCustomPersonList(List<ATDCustomPersonType> list) {
        ATDCustomPersonList = list;
    }

    /** 
     * Get the list of 'InspectionParticipant' element items. ����, �������������� ��� �������� (�������)
     * 
     * @return list
     */
    public List<InspectionParticipantType> getInspectionParticipantList() {
        return inspectionParticipantList;
    }

    /** 
     * Set the list of 'InspectionParticipant' element items. ����, �������������� ��� �������� (�������)
     * 
     * @param list
     */
    public void setInspectionParticipantList(
            List<InspectionParticipantType> list) {
        inspectionParticipantList = list;
    }
}
