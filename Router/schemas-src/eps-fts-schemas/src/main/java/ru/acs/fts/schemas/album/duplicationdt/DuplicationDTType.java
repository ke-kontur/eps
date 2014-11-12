
package ru.acs.fts.schemas.album.duplicationdt;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Уведомление о дублировании ДТ/Обязательства о подаче ДТ в таможенный  орган
 */
public class DuplicationDTType extends BaseDocType
{
    private String procedureID;
    private String declarationID;
    private String dubleDateTime;
    private GTDIDType DTRegNumber;
    private CustomsPersonType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'ProcedureID' element value. Идентификатор процедуры, в которой найдена ранее зарегистрированная ДТ/Обязательство о подаче ДТ в таможенный  орган
     * 
     * @return value
     */
    public String getProcedureID() {
        return procedureID;
    }

    /** 
     * Set the 'ProcedureID' element value. Идентификатор процедуры, в которой найдена ранее зарегистрированная ДТ/Обязательство о подаче ДТ в таможенный  орган
     * 
     * @param procedureID
     */
    public void setProcedureID(String procedureID) {
        this.procedureID = procedureID;
    }

    /** 
     * Get the 'DeclarationID' element value. Уникальный идентификатор ДТ/Обязательства о подаче ДТ в таможенный  орган (DocumentID), которая(ое) была(о) ранее зарегистрирована(о)
     * 
     * @return value
     */
    public String getDeclarationID() {
        return declarationID;
    }

    /** 
     * Set the 'DeclarationID' element value. Уникальный идентификатор ДТ/Обязательства о подаче ДТ в таможенный  орган (DocumentID), которая(ое) была(о) ранее зарегистрирована(о)
     * 
     * @param declarationID
     */
    public void setDeclarationID(String declarationID) {
        this.declarationID = declarationID;
    }

    /** 
     * Get the 'DubleDateTime' element value. Дата и время выявления информации о дублировании
     * 
     * @return value
     */
    public String getDubleDateTime() {
        return dubleDateTime;
    }

    /** 
     * Set the 'DubleDateTime' element value. Дата и время выявления информации о дублировании
     * 
     * @param dubleDateTime
     */
    public void setDubleDateTime(String dubleDateTime) {
        this.dubleDateTime = dubleDateTime;
    }

    /** 
     * Get the 'DTRegNumber' element value. Регистрационный номер ДТ/Обязательства о подаче ДТ, зарегистрированной(ого) ранее в ТО
     * 
     * @return value
     */
    public GTDIDType getDTRegNumber() {
        return DTRegNumber;
    }

    /** 
     * Set the 'DTRegNumber' element value. Регистрационный номер ДТ/Обязательства о подаче ДТ, зарегистрированной(ого) ранее в ТО
     * 
     * @param DTRegNumber
     */
    public void setDTRegNumber(GTDIDType DTRegNumber) {
        this.DTRegNumber = DTRegNumber;
    }

    /** 
     * Get the 'CustomsPerson' element value. Сведения о должностном лице.
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Сведения о должностном лице.
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
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
