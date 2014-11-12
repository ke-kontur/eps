
package ru.acs.fts.schemas.album.inffromactinspection;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.CarInformationType;

/** 
 * �������� �� ���� ����������� �������� (�������) 
 */
public class InfFromActInspectionType extends BaseDocType
{
    private VEDParticipantShortInfType VEDParticipantShortInf;
    private List<CarInformationType> carInformationList = new ArrayList<CarInformationType>();
    private String documentModeID;

    /** 
     * Get the 'VEDParticipantShortInf' element value. ������� ���������� �� ��������� ���
     * 
     * @return value
     */
    public VEDParticipantShortInfType getVEDParticipantShortInf() {
        return VEDParticipantShortInf;
    }

    /** 
     * Set the 'VEDParticipantShortInf' element value. ������� ���������� �� ��������� ���
     * 
     * @param VEDParticipantShortInf
     */
    public void setVEDParticipantShortInf(
            VEDParticipantShortInfType VEDParticipantShortInf) {
        this.VEDParticipantShortInf = VEDParticipantShortInf;
    }

    /** 
     * Get the list of 'CarInformation' element items. �������� � ������������ ����������
     * 
     * @return list
     */
    public List<CarInformationType> getCarInformationList() {
        return carInformationList;
    }

    /** 
     * Set the list of 'CarInformation' element items. �������� � ������������ ����������
     * 
     * @param list
     */
    public void setCarInformationList(List<CarInformationType> list) {
        carInformationList = list;
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
