
package ru.acs.fts.schemas.album.liquidationactcustomsmark;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Таможенные отметки к акту об уничтожении
 */
public class LiquidationActCustomsMarkType extends BaseDocType
{
    private String customsMark;
    private String neededActions;
    private LocalDate actPresentDate;
    private ActRegNumberType actRegNumber;
    private PersonSignatureType customsPerson;
    private CUCustomsType customs;
    private String documentModeID;

    /** 
     * Get the 'CustomsMark' element value. Отметка должностного лица таможенного органа: 0 - сведения не соответствуют; 1 - товар снят с контроля
     * 
     * @return value
     */
    public String getCustomsMark() {
        return customsMark;
    }

    /** 
     * Set the 'CustomsMark' element value. Отметка должностного лица таможенного органа: 0 - сведения не соответствуют; 1 - товар снят с контроля
     * 
     * @param customsMark
     */
    public void setCustomsMark(String customsMark) {
        this.customsMark = customsMark;
    }

    /** 
     * Get the 'NeededActions' element value. Действие, которое необходимо совершить для устранения несоответствий
     * 
     * @return value
     */
    public String getNeededActions() {
        return neededActions;
    }

    /** 
     * Set the 'NeededActions' element value. Действие, которое необходимо совершить для устранения несоответствий
     * 
     * @param neededActions
     */
    public void setNeededActions(String neededActions) {
        this.neededActions = neededActions;
    }

    /** 
     * Get the 'ActPresentDate' element value. Срок представления акта об уничтожении
     * 
     * @return value
     */
    public LocalDate getActPresentDate() {
        return actPresentDate;
    }

    /** 
     * Set the 'ActPresentDate' element value. Срок представления акта об уничтожении
     * 
     * @param actPresentDate
     */
    public void setActPresentDate(LocalDate actPresentDate) {
        this.actPresentDate = actPresentDate;
    }

    /** 
     * Get the 'ActRegNumber' element value. Регистрационный номер акта об уничтожении
     * 
     * @return value
     */
    public ActRegNumberType getActRegNumber() {
        return actRegNumber;
    }

    /** 
     * Set the 'ActRegNumber' element value. Регистрационный номер акта об уничтожении
     * 
     * @param actRegNumber
     */
    public void setActRegNumber(ActRegNumberType actRegNumber) {
        this.actRegNumber = actRegNumber;
    }

    /** 
     * Get the 'CustomsPerson' element value. Подпись уполномоченного лица таможенного органа
     * 
     * @return value
     */
    public PersonSignatureType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Подпись уполномоченного лица таможенного органа
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
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
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
