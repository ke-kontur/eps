
package ru.acs.fts.schemas.album.veterinarycertificate;

import org.joda.time.LocalDate;

/** 
 * Исследование в лаборатории
 */
public class ResearchLaboratoryType
{
    private String nameLaboratory;
    private String numberExamination;
    private LocalDate dateExamination;
    private String methodExamination;
    private String sickName;
    private String resultExamination;

    /** 
     * Get the 'NameLaboratory' element value. Наименование лаборатории
     * 
     * @return value
     */
    public String getNameLaboratory() {
        return nameLaboratory;
    }

    /** 
     * Set the 'NameLaboratory' element value. Наименование лаборатории
     * 
     * @param nameLaboratory
     */
    public void setNameLaboratory(String nameLaboratory) {
        this.nameLaboratory = nameLaboratory;
    }

    /** 
     * Get the 'NumberExamination' element value. Номер экспертизы
     * 
     * @return value
     */
    public String getNumberExamination() {
        return numberExamination;
    }

    /** 
     * Set the 'NumberExamination' element value. Номер экспертизы
     * 
     * @param numberExamination
     */
    public void setNumberExamination(String numberExamination) {
        this.numberExamination = numberExamination;
    }

    /** 
     * Get the 'DateExamination' element value. Дата экспертизы
     * 
     * @return value
     */
    public LocalDate getDateExamination() {
        return dateExamination;
    }

    /** 
     * Set the 'DateExamination' element value. Дата экспертизы
     * 
     * @param dateExamination
     */
    public void setDateExamination(LocalDate dateExamination) {
        this.dateExamination = dateExamination;
    }

    /** 
     * Get the 'MethodExamination' element value. Метод исследования
     * 
     * @return value
     */
    public String getMethodExamination() {
        return methodExamination;
    }

    /** 
     * Set the 'MethodExamination' element value. Метод исследования
     * 
     * @param methodExamination
     */
    public void setMethodExamination(String methodExamination) {
        this.methodExamination = methodExamination;
    }

    /** 
     * Get the 'SickName' element value. Наименование болезни
     * 
     * @return value
     */
    public String getSickName() {
        return sickName;
    }

    /** 
     * Set the 'SickName' element value. Наименование болезни
     * 
     * @param sickName
     */
    public void setSickName(String sickName) {
        this.sickName = sickName;
    }

    /** 
     * Get the 'ResultExamination' element value. Результат экспертизы
     * 
     * @return value
     */
    public String getResultExamination() {
        return resultExamination;
    }

    /** 
     * Set the 'ResultExamination' element value. Результат экспертизы
     * 
     * @param resultExamination
     */
    public void setResultExamination(String resultExamination) {
        this.resultExamination = resultExamination;
    }
}
