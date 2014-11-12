
package ru.acs.fts.schemas.album.noticerubykz;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Уведомление
 */
public class NotificationType
{
    private String inspectionDate;
    private int choiceSelect = -1;
    private static final int BELARUS_CONTROL_ID_CHOICE = 0;
    private static final int KAZAKH_CONTROL_ID_CHOICE = 1;
    private static final int DOCUMENTAL_CONTROL_ID_CHOICE = 2;
    private String belarusControlID;
    private String kazakhControlID;
    private String documentalControlID;
    private NotificationInfoType notificationInfo;
    private DriverType driver;
    private PersonBaseType notificationEmployee;
    private ControlPlaceType notificationOrg;
    private ControlPlaceType destOrg;
    private TransportMeansBaseType TSInfo;
    private CarrierType carrier;
    private List<ViolationType> violationList = new ArrayList<ViolationType>();

    /** 
     * Get the 'InspectionDate' element value. Дата и время  проведения контроля
     * 
     * @return value
     */
    public String getInspectionDate() {
        return inspectionDate;
    }

    /** 
     * Set the 'InspectionDate' element value. Дата и время  проведения контроля
     * 
     * @param inspectionDate
     */
    public void setInspectionDate(String inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if BelarusControlID is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifBelarusControlID() {
        return choiceSelect == BELARUS_CONTROL_ID_CHOICE;
    }

    /** 
     * Get the 'BelarusControlID' element value. Идентификатор листа контроля Республики Беларусь
     * 
     * @return value
     */
    public String getBelarusControlID() {
        return belarusControlID;
    }

    /** 
     * Set the 'BelarusControlID' element value. Идентификатор листа контроля Республики Беларусь
     * 
     * @param belarusControlID
     */
    public void setBelarusControlID(String belarusControlID) {
        setChoiceSelect(BELARUS_CONTROL_ID_CHOICE);
        this.belarusControlID = belarusControlID;
    }

    /** 
     * Check if KazakhControlID is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifKazakhControlID() {
        return choiceSelect == KAZAKH_CONTROL_ID_CHOICE;
    }

    /** 
     * Get the 'KazakhControlID' element value. Идентификатор листа контроля Республики Казахстан
     * 
     * @return value
     */
    public String getKazakhControlID() {
        return kazakhControlID;
    }

    /** 
     * Set the 'KazakhControlID' element value. Идентификатор листа контроля Республики Казахстан
     * 
     * @param kazakhControlID
     */
    public void setKazakhControlID(String kazakhControlID) {
        setChoiceSelect(KAZAKH_CONTROL_ID_CHOICE);
        this.kazakhControlID = kazakhControlID;
    }

    /** 
     * Check if DocumentalControlID is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDocumentalControlID() {
        return choiceSelect == DOCUMENTAL_CONTROL_ID_CHOICE;
    }

    /** 
     * Get the 'DocumentalControlID' element value. Идентификатор документального контроля Российской Федерации
     * 
     * @return value
     */
    public String getDocumentalControlID() {
        return documentalControlID;
    }

    /** 
     * Set the 'DocumentalControlID' element value. Идентификатор документального контроля Российской Федерации
     * 
     * @param documentalControlID
     */
    public void setDocumentalControlID(String documentalControlID) {
        setChoiceSelect(DOCUMENTAL_CONTROL_ID_CHOICE);
        this.documentalControlID = documentalControlID;
    }

    /** 
     * Get the 'NotificationInfo' element value. Уведомление
     * 
     * @return value
     */
    public NotificationInfoType getNotificationInfo() {
        return notificationInfo;
    }

    /** 
     * Set the 'NotificationInfo' element value. Уведомление
     * 
     * @param notificationInfo
     */
    public void setNotificationInfo(NotificationInfoType notificationInfo) {
        this.notificationInfo = notificationInfo;
    }

    /** 
     * Get the 'Driver' element value. Водитель
     * 
     * @return value
     */
    public DriverType getDriver() {
        return driver;
    }

    /** 
     * Set the 'Driver' element value. Водитель
     * 
     * @param driver
     */
    public void setDriver(DriverType driver) {
        this.driver = driver;
    }

    /** 
     * Get the 'NotificationEmployee' element value. Инспектор, выдавший уведомление
     * 
     * @return value
     */
    public PersonBaseType getNotificationEmployee() {
        return notificationEmployee;
    }

    /** 
     * Set the 'NotificationEmployee' element value. Инспектор, выдавший уведомление
     * 
     * @param notificationEmployee
     */
    public void setNotificationEmployee(PersonBaseType notificationEmployee) {
        this.notificationEmployee = notificationEmployee;
    }

    /** 
     * Get the 'NotificationOrg' element value. Организация, проводившая контроль
     * 
     * @return value
     */
    public ControlPlaceType getNotificationOrg() {
        return notificationOrg;
    }

    /** 
     * Set the 'NotificationOrg' element value. Организация, проводившая контроль
     * 
     * @param notificationOrg
     */
    public void setNotificationOrg(ControlPlaceType notificationOrg) {
        this.notificationOrg = notificationOrg;
    }

    /** 
     * Get the 'DestOrg' element value. Контрольный пункт для представления недостающих документов
     * 
     * @return value
     */
    public ControlPlaceType getDestOrg() {
        return destOrg;
    }

    /** 
     * Set the 'DestOrg' element value. Контрольный пункт для представления недостающих документов
     * 
     * @param destOrg
     */
    public void setDestOrg(ControlPlaceType destOrg) {
        this.destOrg = destOrg;
    }

    /** 
     * Get the 'TSInfo' element value. Сведения о транспортном средстве
     * 
     * @return value
     */
    public TransportMeansBaseType getTSInfo() {
        return TSInfo;
    }

    /** 
     * Set the 'TSInfo' element value. Сведения о транспортном средстве
     * 
     * @param TSInfo
     */
    public void setTSInfo(TransportMeansBaseType TSInfo) {
        this.TSInfo = TSInfo;
    }

    /** 
     * Get the 'Carrier' element value. Перевозчик
     * 
     * @return value
     */
    public CarrierType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Перевозчик
     * 
     * @param carrier
     */
    public void setCarrier(CarrierType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the list of 'Violation' element items. Выявленное нарушение
     * 
     * @return list
     */
    public List<ViolationType> getViolationList() {
        return violationList;
    }

    /** 
     * Set the list of 'Violation' element items. Выявленное нарушение
     * 
     * @param list
     */
    public void setViolationList(List<ViolationType> list) {
        violationList = list;
    }
}
