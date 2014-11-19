
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * ДТ и ТД. Внутренний формат. Служебные отметки по товару
 */
public class ESADGoodsOfficialMarkType
{
    private String stageMarkIdentifier;
    private String noteMarkIdentifier;
    private String informationTypeCode;
    private String markDescription;
    private LocalDate dateInf;
    private String timeInf;
    private String personName;
    private String LNP;
    private LocalDate reqCompletionDate;
    private String reqCompletionTime;
    private String documentIndicator;
    private LocalDate deadline;
    private String deadlineMonth;

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
     * Get the 'InformationTypeCode' element value. Код типа информации  (SKRECC)
     * 
     * @return value
     */
    public String getInformationTypeCode() {
        return informationTypeCode;
    }

    /** 
     * Set the 'InformationTypeCode' element value. Код типа информации  (SKRECC)
     * 
     * @param informationTypeCode
     */
    public void setInformationTypeCode(String informationTypeCode) {
        this.informationTypeCode = informationTypeCode;
    }

    /** 
     * Get the 'MarkDescription' element value. Служебная запись / номер документа 
     * 
     * @return value
     */
    public String getMarkDescription() {
        return markDescription;
    }

    /** 
     * Set the 'MarkDescription' element value. Служебная запись / номер документа 
     * 
     * @param markDescription
     */
    public void setMarkDescription(String markDescription) {
        this.markDescription = markDescription;
    }

    /** 
     * Get the 'DateInf' element value. Дата / Дата принятия решения о направлении требования / приостановлении выпуска товаров 
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. Дата / Дата принятия решения о направлении требования / приостановлении выпуска товаров 
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

    /** 
     * Get the 'ReqCompletionDate' element value. Дата выполнения требований (предоставления документов) Декларантом / Дата, по которой приостановлен выпуск товаров
     * 
     * @return value
     */
    public LocalDate getReqCompletionDate() {
        return reqCompletionDate;
    }

    /** 
     * Set the 'ReqCompletionDate' element value. Дата выполнения требований (предоставления документов) Декларантом / Дата, по которой приостановлен выпуск товаров
     * 
     * @param reqCompletionDate
     */
    public void setReqCompletionDate(LocalDate reqCompletionDate) {
        this.reqCompletionDate = reqCompletionDate;
    }

    /** 
     * Get the 'ReqCompletionTime' element value. Время
     * 
     * @return value
     */
    public String getReqCompletionTime() {
        return reqCompletionTime;
    }

    /** 
     * Set the 'ReqCompletionTime' element value. Время
     * 
     * @param reqCompletionTime
     */
    public void setReqCompletionTime(String reqCompletionTime) {
        this.reqCompletionTime = reqCompletionTime;
    }

    /** 
     * Get the 'DocumentIndicator' element value. Признак документа / служебной записи. Заполняется при проставлении отметки в графе C под номером 12 (C 2 12)   ("0"-сведения о товаре совпадают; "1"-сведения о товаре не совпадают)
     * 
     * @return value
     */
    public String getDocumentIndicator() {
        return documentIndicator;
    }

    /** 
     * Set the 'DocumentIndicator' element value. Признак документа / служебной записи. Заполняется при проставлении отметки в графе C под номером 12 (C 2 12)   ("0"-сведения о товаре совпадают; "1"-сведения о товаре не совпадают)
     * 
     * @param documentIndicator
     */
    public void setDocumentIndicator(String documentIndicator) {
        this.documentIndicator = documentIndicator;
    }

    /** 
     * Get the 'Deadline' element value. Срок
     * 
     * @return value
     */
    public LocalDate getDeadline() {
        return deadline;
    }

    /** 
     * Set the 'Deadline' element value. Срок
     * 
     * @param deadline
     */
    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    /** 
     * Get the 'DeadlineMonth' element value. Срок продления / общий в месяцах
     * 
     * @return value
     */
    public String getDeadlineMonth() {
        return deadlineMonth;
    }

    /** 
     * Set the 'DeadlineMonth' element value. Срок продления / общий в месяцах
     * 
     * @param deadlineMonth
     */
    public void setDeadlineMonth(String deadlineMonth) {
        this.deadlineMonth = deadlineMonth;
    }
}
