
package ru.acs.fts.schemas.album.notifviolation;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Уведомление о несоблюдении условий выпуска товаров, информация о не соответствии заявленных сведений и нарушениях, выявленных в ходе проверки ДТ
 */
public class NotifViolationType extends BaseDocType
{
    private String violationNimber;
    private String violationTime;
    private LocalDate violationDate;
    private String notifLawArticle;
    private String comments;
    private String notificationRequest;
    private CustomsPersonType customsPerson;
    private List<ViolationInfoType> violationInfoList = new ArrayList<ViolationInfoType>();
    private List<InstructionType> instructionList = new ArrayList<InstructionType>();
    private CustomsType customs;
    private OrganizationType applicant;
    private GTDIDType GTDNUmber;
    private String documentModeID;

    /** 
     * Get the 'ViolationNimber' element value. Исходящий номер уведомления/требования
     * 
     * @return value
     */
    public String getViolationNimber() {
        return violationNimber;
    }

    /** 
     * Set the 'ViolationNimber' element value. Исходящий номер уведомления/требования
     * 
     * @param violationNimber
     */
    public void setViolationNimber(String violationNimber) {
        this.violationNimber = violationNimber;
    }

    /** 
     * Get the 'ViolationTime' element value. Время создания уведомления/требования
     * 
     * @return value
     */
    public String getViolationTime() {
        return violationTime;
    }

    /** 
     * Set the 'ViolationTime' element value. Время создания уведомления/требования
     * 
     * @param violationTime
     */
    public void setViolationTime(String violationTime) {
        this.violationTime = violationTime;
    }

    /** 
     * Get the 'ViolationDate' element value. Дата  создания уведомления/требования
     * 
     * @return value
     */
    public LocalDate getViolationDate() {
        return violationDate;
    }

    /** 
     * Set the 'ViolationDate' element value. Дата  создания уведомления/требования
     * 
     * @param violationDate
     */
    public void setViolationDate(LocalDate violationDate) {
        this.violationDate = violationDate;
    }

    /** 
     * Get the 'NotifLawArticle' element value. Статья ТК РФ, Номера нормативных актов и пунктов в них, в соответствии с которыми направляется информация о нарушении (несоответствии)
     * 
     * @return value
     */
    public String getNotifLawArticle() {
        return notifLawArticle;
    }

    /** 
     * Set the 'NotifLawArticle' element value. Статья ТК РФ, Номера нормативных актов и пунктов в них, в соответствии с которыми направляется информация о нарушении (несоответствии)
     * 
     * @param notifLawArticle
     */
    public void setNotifLawArticle(String notifLawArticle) {
        this.notifLawArticle = notifLawArticle;
    }

    /** 
     * Get the 'Comments' element value. Комментарий
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарий
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'NotificationRequest' element value. Вид документа: 0 - требование, 1 - уведомление
     * 
     * @return value
     */
    public String getNotificationRequest() {
        return notificationRequest;
    }

    /** 
     * Set the 'NotificationRequest' element value. Вид документа: 0 - требование, 1 - уведомление
     * 
     * @param notificationRequest
     */
    public void setNotificationRequest(String notificationRequest) {
        this.notificationRequest = notificationRequest;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the list of 'ViolationInfo' element items. Описание выявленных нарушений и несоответствий.
     * 
     * @return list
     */
    public List<ViolationInfoType> getViolationInfoList() {
        return violationInfoList;
    }

    /** 
     * Set the list of 'ViolationInfo' element items. Описание выявленных нарушений и несоответствий.
     * 
     * @param list
     */
    public void setViolationInfoList(List<ViolationInfoType> list) {
        violationInfoList = list;
    }

    /** 
     * Get the list of 'Instruction' element items. Описание действий, необходимых для устранения выявленных нарушений и несоответствий.Требование предоставления документов, корректировки сведений и перехода на общий порядок декларирования.
     * 
     * @return list
     */
    public List<InstructionType> getInstructionList() {
        return instructionList;
    }

    /** 
     * Set the list of 'Instruction' element items. Описание действий, необходимых для устранения выявленных нарушений и несоответствий.Требование предоставления документов, корректировки сведений и перехода на общий порядок декларирования.
     * 
     * @param list
     */
    public void setInstructionList(List<InstructionType> list) {
        instructionList = list;
    }

    /** 
     * Get the 'Customs' element value. Таможенный орган.
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Таможенный орган.
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Applicant' element value. Информация о декларанте (наименование, ФИО для физических лиц)
     * 
     * @return value
     */
    public OrganizationType getApplicant() {
        return applicant;
    }

    /** 
     * Set the 'Applicant' element value. Информация о декларанте (наименование, ФИО для физических лиц)
     * 
     * @param applicant
     */
    public void setApplicant(OrganizationType applicant) {
        this.applicant = applicant;
    }

    /** 
     * Get the 'GTDNUmber' element value. Справочный номер ДТ.
     * 
     * @return value
     */
    public GTDIDType getGTDNUmber() {
        return GTDNUmber;
    }

    /** 
     * Set the 'GTDNUmber' element value. Справочный номер ДТ.
     * 
     * @param GTDNUmber
     */
    public void setGTDNUmber(GTDIDType GTDNUmber) {
        this.GTDNUmber = GTDNUmber;
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
