
package ru.acs.fts.schemas.album.mpocustomsmark;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Решение по МПО
 */
public class MPOCustomsMarkType extends BaseDocType
{
    private LocalDate decisionDate;
    private String decisionTime;
    private String decision;
    private String decisionDescription;
    private String comments;
    private MPORegistrationType MPORegistration;
    private PersonSignatureType customsPerson;
    private CustomsType customs;
    private String documentModeID;

    /** 
     * Get the 'DecisionDate' element value. Дата решения 
     * 
     * @return value
     */
    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    /** 
     * Set the 'DecisionDate' element value. Дата решения 
     * 
     * @param decisionDate
     */
    public void setDecisionDate(LocalDate decisionDate) {
        this.decisionDate = decisionDate;
    }

    /** 
     * Get the 'DecisionTime' element value. Время решения 
     * 
     * @return value
     */
    public String getDecisionTime() {
        return decisionTime;
    }

    /** 
     * Set the 'DecisionTime' element value. Время решения 
     * 
     * @param decisionTime
     */
    public void setDecisionTime(String decisionTime) {
        this.decisionTime = decisionTime;
    }

    /** 
     * Get the 'Decision' element value. Решение: 1 - выпуск запрещен; 2 - выпуск разрешен; 3 - выпуск разрешен с обязательной уплатой таможенных платежей; 4 - иное
     * 
     * @return value
     */
    public String getDecision() {
        return decision;
    }

    /** 
     * Set the 'Decision' element value. Решение: 1 - выпуск запрещен; 2 - выпуск разрешен; 3 - выпуск разрешен с обязательной уплатой таможенных платежей; 4 - иное
     * 
     * @param decision
     */
    public void setDecision(String decision) {
        this.decision = decision;
    }

    /** 
     * Get the 'DecisionDescription' element value. Описание принятого решения
     * 
     * @return value
     */
    public String getDecisionDescription() {
        return decisionDescription;
    }

    /** 
     * Set the 'DecisionDescription' element value. Описание принятого решения
     * 
     * @param decisionDescription
     */
    public void setDecisionDescription(String decisionDescription) {
        this.decisionDescription = decisionDescription;
    }

    /** 
     * Get the 'Comments' element value. Комментарии
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарии
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'MPO_Registration' element value. Сведения о регистрационном номере МПО
     * 
     * @return value
     */
    public MPORegistrationType getMPORegistration() {
        return MPORegistration;
    }

    /** 
     * Set the 'MPO_Registration' element value. Сведения о регистрационном номере МПО
     * 
     * @param MPORegistration
     */
    public void setMPORegistration(MPORegistrationType MPORegistration) {
        this.MPORegistration = MPORegistration;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public PersonSignatureType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(PersonSignatureType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
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
