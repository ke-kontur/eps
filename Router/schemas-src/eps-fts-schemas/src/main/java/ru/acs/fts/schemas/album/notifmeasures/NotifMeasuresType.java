
package ru.acs.fts.schemas.album.notifmeasures;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Уведомление о применении меры по минимизации риска
 */
public class NotifMeasuresType extends BaseDocType
{
    private String docSign;
    private String PIRegID;
    private String procedureSign;
    private String measuresSign;
    private LocalDate measuresApplyDate;
    private String measuresApplyTime;
    private List<String> commentList = new ArrayList<String>();
    private CustomsPersonType customsPerson;
    private GTDIDType regNumberDT;
    private CustomsType customs;
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. Признак документа: 1 - уведомление о применении/неприменении меры по минимизации риска; 2 - уведомление о необходимости применения меры; 3 - уведомление об отсутствии необходимости проведения сверки сведений
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак документа: 1 - уведомление о применении/неприменении меры по минимизации риска; 2 - уведомление о необходимости применения меры; 3 - уведомление об отсутствии необходимости проведения сверки сведений
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'PI_RegID' element value. Идентификатор предварительной информации
     * 
     * @return value
     */
    public String getPIRegID() {
        return PIRegID;
    }

    /** 
     * Set the 'PI_RegID' element value. Идентификатор предварительной информации
     * 
     * @param PIRegID
     */
    public void setPIRegID(String PIRegID) {
        this.PIRegID = PIRegID;
    }

    /** 
     * Get the 'ProcedureSign' element value. Таможенная процедура, при которой было принято решение должностным лицом: 0 - декларирование; 1 - таможенный транзит
     * 
     * @return value
     */
    public String getProcedureSign() {
        return procedureSign;
    }

    /** 
     * Set the 'ProcedureSign' element value. Таможенная процедура, при которой было принято решение должностным лицом: 0 - декларирование; 1 - таможенный транзит
     * 
     * @param procedureSign
     */
    public void setProcedureSign(String procedureSign) {
        this.procedureSign = procedureSign;
    }

    /** 
     * Get the 'MeasuresSign' element value. Признак применения мер
     * 
     * @return value
     */
    public String getMeasuresSign() {
        return measuresSign;
    }

    /** 
     * Set the 'MeasuresSign' element value. Признак применения мер
     * 
     * @param measuresSign
     */
    public void setMeasuresSign(String measuresSign) {
        this.measuresSign = measuresSign;
    }

    /** 
     * Get the 'MeasuresApplyDate' element value. Дата применения мер
     * 
     * @return value
     */
    public LocalDate getMeasuresApplyDate() {
        return measuresApplyDate;
    }

    /** 
     * Set the 'MeasuresApplyDate' element value. Дата применения мер
     * 
     * @param measuresApplyDate
     */
    public void setMeasuresApplyDate(LocalDate measuresApplyDate) {
        this.measuresApplyDate = measuresApplyDate;
    }

    /** 
     * Get the 'MeasuresApplyTime' element value. Время применения мер
     * 
     * @return value
     */
    public String getMeasuresApplyTime() {
        return measuresApplyTime;
    }

    /** 
     * Set the 'MeasuresApplyTime' element value. Время применения мер
     * 
     * @param measuresApplyTime
     */
    public void setMeasuresApplyTime(String measuresApplyTime) {
        this.measuresApplyTime = measuresApplyTime;
    }

    /** 
     * Get the list of 'Comments' element items. Комментарии
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comments' element items. Комментарии
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'RegNumberDT' element value. Регистрационный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getRegNumberDT() {
        return regNumberDT;
    }

    /** 
     * Set the 'RegNumberDT' element value. Регистрационный номер ДТ
     * 
     * @param regNumberDT
     */
    public void setRegNumberDT(GTDIDType regNumberDT) {
        this.regNumberDT = regNumberDT;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
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
