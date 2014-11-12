
package ru.acs.fts.schemas.album.do1closereq;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHCustomInspectorType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHDocumentRegisterNumberType;

/** 
 * Уведомление о полной выдаче товаров по отчетности ДО1
 */
public class DO1CloseReqType extends BaseDocType
{
    private LocalDate formationMSGDate;
    private String formationMSGTime;
    private WHCustomInspectorType customInspector;
    private WHDocumentRegisterNumberType regNumberDO1;
    private String documentModeID;

    /** 
     * Get the 'FormationMSGDate' element value. Дата формирования сообщения
     * 
     * @return value
     */
    public LocalDate getFormationMSGDate() {
        return formationMSGDate;
    }

    /** 
     * Set the 'FormationMSGDate' element value. Дата формирования сообщения
     * 
     * @param formationMSGDate
     */
    public void setFormationMSGDate(LocalDate formationMSGDate) {
        this.formationMSGDate = formationMSGDate;
    }

    /** 
     * Get the 'FormationMSGTime' element value. Время формирования сообщения
     * 
     * @return value
     */
    public String getFormationMSGTime() {
        return formationMSGTime;
    }

    /** 
     * Set the 'FormationMSGTime' element value. Время формирования сообщения
     * 
     * @param formationMSGTime
     */
    public void setFormationMSGTime(String formationMSGTime) {
        this.formationMSGTime = formationMSGTime;
    }

    /** 
     * Get the 'CustomInspector' element value. Должностного лица таможенного органа
     * 
     * @return value
     */
    public WHCustomInspectorType getCustomInspector() {
        return customInspector;
    }

    /** 
     * Set the 'CustomInspector' element value. Должностного лица таможенного органа
     * 
     * @param customInspector
     */
    public void setCustomInspector(WHCustomInspectorType customInspector) {
        this.customInspector = customInspector;
    }

    /** 
     * Get the 'RegNumberDO1' element value. Номер отчетности ДО-1
     * 
     * @return value
     */
    public WHDocumentRegisterNumberType getRegNumberDO1() {
        return regNumberDO1;
    }

    /** 
     * Set the 'RegNumberDO1' element value. Номер отчетности ДО-1
     * 
     * @param regNumberDO1
     */
    public void setRegNumberDO1(WHDocumentRegisterNumberType regNumberDO1) {
        this.regNumberDO1 = regNumberDO1;
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
