
package ru.acs.fts.schemas.album.sem_nirequest;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.RiskProfilesType;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.SettingsType;

/** 
 * ������ �� ������� NI
 */
public class SEMNIRequestType extends BaseDocType
{
    private String connectionId;
    private LocalDate dateStart;
    private LocalDate dateStop;
    private List<SettingsType> calculationSettingList = new ArrayList<SettingsType>();
    private RiskProfilesType SURProfile;
    private String documentModeID;

    /** 
     * Get the 'ConnectionId' element value. ������ ����������� � ��
     * 
     * @return value
     */
    public String getConnectionId() {
        return connectionId;
    }

    /** 
     * Set the 'ConnectionId' element value. ������ ����������� � ��
     * 
     * @param connectionId
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /** 
     * Get the 'DateStart' element value. ���� ������
     * 
     * @return value
     */
    public LocalDate getDateStart() {
        return dateStart;
    }

    /** 
     * Set the 'DateStart' element value. ���� ������
     * 
     * @param dateStart
     */
    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    /** 
     * Get the 'DateStop' element value. ���� ���������
     * 
     * @return value
     */
    public LocalDate getDateStop() {
        return dateStop;
    }

    /** 
     * Set the 'DateStop' element value. ���� ���������
     * 
     * @param dateStop
     */
    public void setDateStop(LocalDate dateStop) {
        this.dateStop = dateStop;
    }

    /** 
     * Get the list of 'CalculationSettings' element items. ��������������� ������������. �� ������������ ��� ������� �� ������� ����������� ����������
     * 
     * @return list
     */
    public List<SettingsType> getCalculationSettingList() {
        return calculationSettingList;
    }

    /** 
     * Set the list of 'CalculationSettings' element items. ��������������� ������������. �� ������������ ��� ������� �� ������� ����������� ����������
     * 
     * @param list
     */
    public void setCalculationSettingList(List<SettingsType> list) {
        calculationSettingList = list;
    }

    /** 
     * Get the 'SURProfile' element value. ������� �����
     * 
     * @return value
     */
    public RiskProfilesType getSURProfile() {
        return SURProfile;
    }

    /** 
     * Set the 'SURProfile' element value. ������� �����
     * 
     * @param SURProfile
     */
    public void setSURProfile(RiskProfilesType SURProfile) {
        this.SURProfile = SURProfile;
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
