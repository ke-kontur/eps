
package ru.acs.fts.schemas.album.tsdecision;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * –ешение по таможенной стоимости
 */
public class TSDecisionType extends BaseDocType
{
    private String decisionIndicator;
    private String decisionText;
    private String decisionDateTime;
    private CustomsPersonType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'DecisionIndicator' element value. ѕризнак прин€ти€ таможенной стоимости
     * 
     * @return value
     */
    public String getDecisionIndicator() {
        return decisionIndicator;
    }

    /** 
     * Set the 'DecisionIndicator' element value. ѕризнак прин€ти€ таможенной стоимости
     * 
     * @param decisionIndicator
     */
    public void setDecisionIndicator(String decisionIndicator) {
        this.decisionIndicator = decisionIndicator;
    }

    /** 
     * Get the 'DecisionText' element value. “екстовое описание решени€ по таможенной стоимости
     * 
     * @return value
     */
    public String getDecisionText() {
        return decisionText;
    }

    /** 
     * Set the 'DecisionText' element value. “екстовое описание решени€ по таможенной стоимости
     * 
     * @param decisionText
     */
    public void setDecisionText(String decisionText) {
        this.decisionText = decisionText;
    }

    /** 
     * Get the 'DecisionDateTime' element value. ƒата и врем€ прин€ти€ решени€ по таможенной стоимости
     * 
     * @return value
     */
    public String getDecisionDateTime() {
        return decisionDateTime;
    }

    /** 
     * Set the 'DecisionDateTime' element value. ƒата и врем€ прин€ти€ решени€ по таможенной стоимости
     * 
     * @param decisionDateTime
     */
    public void setDecisionDateTime(String decisionDateTime) {
        this.decisionDateTime = decisionDateTime;
    }

    /** 
     * Get the 'CustomsPerson' element value. ƒолжностное лицо таможенного органа, прин€вшего решение по таможенной стоимости
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ƒолжностное лицо таможенного органа, прин€вшего решение по таможенной стоимости
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. »дентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. »дентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
