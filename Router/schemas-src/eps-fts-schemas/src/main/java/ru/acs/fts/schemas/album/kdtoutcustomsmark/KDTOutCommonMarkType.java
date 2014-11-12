
package ru.acs.fts.schemas.album.kdtoutcustomsmark;

import org.joda.time.LocalDate;

/** 
 * Общие служебные отметки КДТ
 */
public class KDTOutCommonMarkType
{
    private String GRNumber;
    private String stageMarkIdentifier;
    private String noteMarkIdentifier;
    private String markDescription;
    private LocalDate dateInf;
    private String timeInf;
    private String personName;
    private String LNP;

    /** 
     * Get the 'GRNumber' element value. Обозначение графы (подраздела графы)
     * 
     * @return value
     */
    public String getGRNumber() {
        return GRNumber;
    }

    /** 
     * Set the 'GRNumber' element value. Обозначение графы (подраздела графы)
     * 
     * @param GRNumber
     */
    public void setGRNumber(String GRNumber) {
        this.GRNumber = GRNumber;
    }

    /** 
     * Get the 'StageMarkIdentifier' element value. Идентификатор проставленной технологической отметки - 1 (номер этапа)
     * 
     * @return value
     */
    public String getStageMarkIdentifier() {
        return stageMarkIdentifier;
    }

    /** 
     * Set the 'StageMarkIdentifier' element value. Идентификатор проставленной технологической отметки - 1 (номер этапа)
     * 
     * @param stageMarkIdentifier
     */
    public void setStageMarkIdentifier(String stageMarkIdentifier) {
        this.stageMarkIdentifier = stageMarkIdentifier;
    }

    /** 
     * Get the 'NoteMarkIdentifier' element value. Идентификатор проставленной технологической отметки  -  2 (тип примечания)
     * 
     * @return value
     */
    public String getNoteMarkIdentifier() {
        return noteMarkIdentifier;
    }

    /** 
     * Set the 'NoteMarkIdentifier' element value. Идентификатор проставленной технологической отметки  -  2 (тип примечания)
     * 
     * @param noteMarkIdentifier
     */
    public void setNoteMarkIdentifier(String noteMarkIdentifier) {
        this.noteMarkIdentifier = noteMarkIdentifier;
    }

    /** 
     * Get the 'MarkDescription' element value. Служебная запись
     * 
     * @return value
     */
    public String getMarkDescription() {
        return markDescription;
    }

    /** 
     * Set the 'MarkDescription' element value. Служебная запись
     * 
     * @param markDescription
     */
    public void setMarkDescription(String markDescription) {
        this.markDescription = markDescription;
    }

    /** 
     * Get the 'DateInf' element value. Дата проставления отметки
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. Дата проставления отметки
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

    /** 
     * Get the 'TimeInf' element value. Время
     * 
     * @return value
     */
    public String getTimeInf() {
        return timeInf;
    }

    /** 
     * Set the 'TimeInf' element value. Время
     * 
     * @param timeInf
     */
    public void setTimeInf(String timeInf) {
        this.timeInf = timeInf;
    }

    /** 
     * Get the 'PersonName' element value. ФИО инспектора, заверившего запись
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ФИО инспектора, заверившего запись
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'LNP' element value. Номер ЛНП инспектора, заверившего запись
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. Номер ЛНП инспектора, заверившего запись
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }
}
