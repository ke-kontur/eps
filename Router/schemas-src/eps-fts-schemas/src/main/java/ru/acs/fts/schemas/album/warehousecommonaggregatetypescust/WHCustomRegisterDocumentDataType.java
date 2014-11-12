
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.warehousecommonleaftypescust.CustomDocumentState;

/** 
 * Комплексный тип для данных о регистрации документа в таможенном органе
 */
public class WHCustomRegisterDocumentDataType
{
    private CustomDocumentState customState;
    private String registerTime;
    private WHCustomInspectorType inspector;
    private WHDocumentCancelationType cancelation;
    private WHDocumentRegisterNumberType registerNumber;

    /** 
     * Get the 'CustomState' element value. Таможенный статус отчета
     * 
     * @return value
     */
    public CustomDocumentState getCustomState() {
        return customState;
    }

    /** 
     * Set the 'CustomState' element value. Таможенный статус отчета
     * 
     * @param customState
     */
    public void setCustomState(CustomDocumentState customState) {
        this.customState = customState;
    }

    /** 
     * Get the 'RegisterTime' element value. Время регистрации отчета в журнале регистрации ДО таможенного органа
     * 
     * @return value
     */
    public String getRegisterTime() {
        return registerTime;
    }

    /** 
     * Set the 'RegisterTime' element value. Время регистрации отчета в журнале регистрации ДО таможенного органа
     * 
     * @param registerTime
     */
    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    /** 
     * Get the 'Inspector' element value. Сотрудник таможенного органа, зарегистрировавший отчет
     * 
     * @return value
     */
    public WHCustomInspectorType getInspector() {
        return inspector;
    }

    /** 
     * Set the 'Inspector' element value. Сотрудник таможенного органа, зарегистрировавший отчет
     * 
     * @param inspector
     */
    public void setInspector(WHCustomInspectorType inspector) {
        this.inspector = inspector;
    }

    /** 
     * Get the 'Cancelation' element value. Данные об аннулировании отчета
     * 
     * @return value
     */
    public WHDocumentCancelationType getCancelation() {
        return cancelation;
    }

    /** 
     * Set the 'Cancelation' element value. Данные об аннулировании отчета
     * 
     * @param cancelation
     */
    public void setCancelation(WHDocumentCancelationType cancelation) {
        this.cancelation = cancelation;
    }

    /** 
     * Get the 'RegisterNumber' element value. Регистрационный номер отчета по журналу регистрации ДО таможенного органа
     * 
     * @return value
     */
    public WHDocumentRegisterNumberType getRegisterNumber() {
        return registerNumber;
    }

    /** 
     * Set the 'RegisterNumber' element value. Регистрационный номер отчета по журналу регистрации ДО таможенного органа
     * 
     * @param registerNumber
     */
    public void setRegisterNumber(WHDocumentRegisterNumberType registerNumber) {
        this.registerNumber = registerNumber;
    }
}
