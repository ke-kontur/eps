
package ru.acs.fts.schemas.album.mistakenlysentdt;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Уведомление об ошибочно направленной(ом) ДТ/Обязательстве на подачу ДТ
 */
public class MistakenlySentDTType extends BaseDocType
{
    private String procedureID;
    private String declarationID;
    private LocalDate createDate;
    private String createTime;
    private DecisionType decision;
    private CustomsType decisionCustoms;
    private String documentModeID;

    /** 
     * Get the 'ProcedureID' element value. Идентификатор процедуры, в которой зарегистрирована ДТ/Обязательство на подачу ДТ
     * 
     * @return value
     */
    public String getProcedureID() {
        return procedureID;
    }

    /** 
     * Set the 'ProcedureID' element value. Идентификатор процедуры, в которой зарегистрирована ДТ/Обязательство на подачу ДТ
     * 
     * @param procedureID
     */
    public void setProcedureID(String procedureID) {
        this.procedureID = procedureID;
    }

    /** 
     * Get the 'DeclarationID' element value. Уникальный идентификатор ДТ/Обязательства на подачу ДТ (DocumentID)
     * 
     * @return value
     */
    public String getDeclarationID() {
        return declarationID;
    }

    /** 
     * Set the 'DeclarationID' element value. Уникальный идентификатор ДТ/Обязательства на подачу ДТ (DocumentID)
     * 
     * @param declarationID
     */
    public void setDeclarationID(String declarationID) {
        this.declarationID = declarationID;
    }

    /** 
     * Get the 'CreateDate' element value. Дата создания сообщения
     * 
     * @return value
     */
    public LocalDate getCreateDate() {
        return createDate;
    }

    /** 
     * Set the 'CreateDate' element value. Дата создания сообщения
     * 
     * @param createDate
     */
    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    /** 
     * Get the 'CreateTime' element value. Время создания сообщения
     * 
     * @return value
     */
    public String getCreateTime() {
        return createTime;
    }

    /** 
     * Set the 'CreateTime' element value. Время создания сообщения
     * 
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /** 
     * Get the 'Decision' element value. Решение
     * 
     * @return value
     */
    public DecisionType getDecision() {
        return decision;
    }

    /** 
     * Set the 'Decision' element value. Решение
     * 
     * @param decision
     */
    public void setDecision(DecisionType decision) {
        this.decision = decision;
    }

    /** 
     * Get the 'DecisionCustoms' element value. Сведения о таможенном органе, принявшего решение
     * 
     * @return value
     */
    public CustomsType getDecisionCustoms() {
        return decisionCustoms;
    }

    /** 
     * Set the 'DecisionCustoms' element value. Сведения о таможенном органе, принявшего решение
     * 
     * @param decisionCustoms
     */
    public void setDecisionCustoms(CustomsType decisionCustoms) {
        this.decisionCustoms = decisionCustoms;
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
