
package ru.acs.fts.schemas.album.doreginfo;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHCustomInspectorType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHDocumentRegisterNumberType;

/** 
 * Уведомление  о регистрации отчетности ДО
 */
public class DORegInfoType extends BaseDocType
{
    private LocalDate regDate;
    private String regTime;
    private String formReport;
    private WHCustomInspectorType customInspector;
    private WHDocumentRegisterNumberType registerNumberReport;
    private String documentModeID;

    /** 
     * Get the 'RegDate' element value. Дата регистрации
     * 
     * @return value
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /** 
     * Set the 'RegDate' element value. Дата регистрации
     * 
     * @param regDate
     */
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    /** 
     * Get the 'RegTime' element value. Время регистрации
     * 
     * @return value
     */
    public String getRegTime() {
        return regTime;
    }

    /** 
     * Set the 'RegTime' element value. Время регистрации
     * 
     * @param regTime
     */
    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    /** 
     * Get the 'FormReport' element value. Форма отчета: 1- ДО1; 2 - ДО2; 3 - ДО3.
     * 
     * @return value
     */
    public String getFormReport() {
        return formReport;
    }

    /** 
     * Set the 'FormReport' element value. Форма отчета: 1- ДО1; 2 - ДО2; 3 - ДО3.
     * 
     * @param formReport
     */
    public void setFormReport(String formReport) {
        this.formReport = formReport;
    }

    /** 
     * Get the 'CustomInspector' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public WHCustomInspectorType getCustomInspector() {
        return customInspector;
    }

    /** 
     * Set the 'CustomInspector' element value. Должностное лицо таможенного органа
     * 
     * @param customInspector
     */
    public void setCustomInspector(WHCustomInspectorType customInspector) {
        this.customInspector = customInspector;
    }

    /** 
     * Get the 'RegisterNumberReport' element value. Регистрационный номер отчета ДО1/ДО2/ДО3
     * 
     * @return value
     */
    public WHDocumentRegisterNumberType getRegisterNumberReport() {
        return registerNumberReport;
    }

    /** 
     * Set the 'RegisterNumberReport' element value. Регистрационный номер отчета ДО1/ДО2/ДО3
     * 
     * @param registerNumberReport
     */
    public void setRegisterNumberReport(
            WHDocumentRegisterNumberType registerNumberReport) {
        this.registerNumberReport = registerNumberReport;
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
