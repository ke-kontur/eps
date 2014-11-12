
package ru.acs.fts.schemas.album.atdclosecontrol;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDID6Type;

/** 
 * Протокол завершения контроля  АТД
 */
public class ATDCloseControlType extends BaseDocType
{
    private LocalDate checkDate;
    private String checkTime;
    private LocalDate endCheckDate;
    private String DBVersion;
    private String errorCount;
    private String reasonCode;
    private String explanation;
    private LocalDate explanationDate;
    private String ATDGlobalID;
    private DocumentType document;
    private PSCheckType PSCheck;
    private List<PZKErrorsType> PZKErrorList = new ArrayList<PZKErrorsType>();
    private GTDID6Type ATDRegNumder;
    private String documentModeID;

    /** 
     * Get the 'CheckDate' element value. Дата проведения проверки
     * 
     * @return value
     */
    public LocalDate getCheckDate() {
        return checkDate;
    }

    /** 
     * Set the 'CheckDate' element value. Дата проведения проверки
     * 
     * @param checkDate
     */
    public void setCheckDate(LocalDate checkDate) {
        this.checkDate = checkDate;
    }

    /** 
     * Get the 'CheckTime' element value. Время проведения проверки
     * 
     * @return value
     */
    public String getCheckTime() {
        return checkTime;
    }

    /** 
     * Set the 'CheckTime' element value. Время проведения проверки
     * 
     * @param checkTime
     */
    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    /** 
     * Get the 'EndCheckDate' element value. Дата, на которую выполнена проверка. Указывается, если отлична от даты составления документа или даты проверки
     * 
     * @return value
     */
    public LocalDate getEndCheckDate() {
        return endCheckDate;
    }

    /** 
     * Set the 'EndCheckDate' element value. Дата, на которую выполнена проверка. Указывается, если отлична от даты составления документа или даты проверки
     * 
     * @param endCheckDate
     */
    public void setEndCheckDate(LocalDate endCheckDate) {
        this.endCheckDate = endCheckDate;
    }

    /** 
     * Get the 'DBVersion' element value. Версия структуры внутреннего формата электронной копии АТД 
     * 
     * @return value
     */
    public String getDBVersion() {
        return DBVersion;
    }

    /** 
     * Set the 'DBVersion' element value. Версия структуры внутреннего формата электронной копии АТД 
     * 
     * @param DBVersion
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /** 
     * Get the 'ErrorCount' element value. Общее количество ошибок ПЗК
     * 
     * @return value
     */
    public String getErrorCount() {
        return errorCount;
    }

    /** 
     * Set the 'ErrorCount' element value. Общее количество ошибок ПЗК
     * 
     * @param errorCount
     */
    public void setErrorCount(String errorCount) {
        this.errorCount = errorCount;
    }

    /** 
     * Get the 'ReasonCode' element value. Код причины повторной передачи электронной копии ДТ после ее возврата с вышестоящего уровня системы
     * 
     * @return value
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /** 
     * Set the 'ReasonCode' element value. Код причины повторной передачи электронной копии ДТ после ее возврата с вышестоящего уровня системы
     * 
     * @param reasonCode
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /** 
     * Get the 'Explanation' element value. Объяснение инспектора о несвоевременности или неполноте представления информации по результатам ФЛК
     * 
     * @return value
     */
    public String getExplanation() {
        return explanation;
    }

    /** 
     * Set the 'Explanation' element value. Объяснение инспектора о несвоевременности или неполноте представления информации по результатам ФЛК
     * 
     * @param explanation
     */
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    /** 
     * Get the 'ExplanationDate' element value. Дата внесения объяснения инспектором о несвоевременности или неполноте представления информации по результатам ФЛК
     * 
     * @return value
     */
    public LocalDate getExplanationDate() {
        return explanationDate;
    }

    /** 
     * Set the 'ExplanationDate' element value. Дата внесения объяснения инспектором о несвоевременности или неполноте представления информации по результатам ФЛК
     * 
     * @param explanationDate
     */
    public void setExplanationDate(LocalDate explanationDate) {
        this.explanationDate = explanationDate;
    }

    /** 
     * Get the 'ATDGlobalID' element value. Уникальный идентификатор акта таможенного досмотра
     * 
     * @return value
     */
    public String getATDGlobalID() {
        return ATDGlobalID;
    }

    /** 
     * Set the 'ATDGlobalID' element value. Уникальный идентификатор акта таможенного досмотра
     * 
     * @param ATDGlobalID
     */
    public void setATDGlobalID(String ATDGlobalID) {
        this.ATDGlobalID = ATDGlobalID;
    }

    /** 
     * Get the 'Document' element value. Проверенный электронный таможенный документ
     * 
     * @return value
     */
    public DocumentType getDocument() {
        return document;
    }

    /** 
     * Set the 'Document' element value. Проверенный электронный таможенный документ
     * 
     * @param document
     */
    public void setDocument(DocumentType document) {
        this.document = document;
    }

    /** 
     * Get the 'PSCheck' element value. программное средство, выполнившее проверку
     * 
     * @return value
     */
    public PSCheckType getPSCheck() {
        return PSCheck;
    }

    /** 
     * Set the 'PSCheck' element value. программное средство, выполнившее проверку
     * 
     * @param PSCheck
     */
    public void setPSCheck(PSCheckType PSCheck) {
        this.PSCheck = PSCheck;
    }

    /** 
     * Get the list of 'PZKErrors' element items. Ошибки
     * 
     * @return list
     */
    public List<PZKErrorsType> getPZKErrorList() {
        return PZKErrorList;
    }

    /** 
     * Set the list of 'PZKErrors' element items. Ошибки
     * 
     * @param list
     */
    public void setPZKErrorList(List<PZKErrorsType> list) {
        PZKErrorList = list;
    }

    /** 
     * Get the 'ATDRegNumder' element value. Регистрационный номер АТД
     * 
     * @return value
     */
    public GTDID6Type getATDRegNumder() {
        return ATDRegNumder;
    }

    /** 
     * Set the 'ATDRegNumder' element value. Регистрационный номер АТД
     * 
     * @param ATDRegNumder
     */
    public void setATDRegNumder(GTDID6Type ATDRegNumder) {
        this.ATDRegNumder = ATDRegNumder;
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
