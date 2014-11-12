
package ru.acs.fts.schemas.album.custopinion;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Заключение таможенного эксперта
 */
public class CustOpinionType extends BaseDocType
{
    private String regNumber;
    private String cityName;
    private String dateTimeStart;
    private String dateTimeEnd;
    private String FIOExpert;
    private String qualification;
    private String expertExperience;
    private List<String> questionList = new ArrayList<String>();
    private List<String> presentationList = new ArrayList<String>();
    private List<String> inspectionAccountList = new ArrayList<String>();
    private List<String> examinationList = new ArrayList<String>();
    private List<String> synthesizingPortionList = new ArrayList<String>();
    private List<String> conclusionList = new ArrayList<String>();
    private DocumentBaseType expertCertificate;
    private DocumentBaseType commission;
    private List<PersonSignatureType> expertSignatureList = new ArrayList<PersonSignatureType>();
    private String documentModeID;

    /** 
     * Get the 'RegNumber' element value. Номер заключения таможенного эксперта
     * 
     * @return value
     */
    public String getRegNumber() {
        return regNumber;
    }

    /** 
     * Set the 'RegNumber' element value. Номер заключения таможенного эксперта
     * 
     * @param regNumber
     */
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    /** 
     * Get the 'CityName' element value. Наименование города
     * 
     * @return value
     */
    public String getCityName() {
        return cityName;
    }

    /** 
     * Set the 'CityName' element value. Наименование города
     * 
     * @param cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /** 
     * Get the 'DateTimeStart' element value. Начало экспертизы
     * 
     * @return value
     */
    public String getDateTimeStart() {
        return dateTimeStart;
    }

    /** 
     * Set the 'DateTimeStart' element value. Начало экспертизы
     * 
     * @param dateTimeStart
     */
    public void setDateTimeStart(String dateTimeStart) {
        this.dateTimeStart = dateTimeStart;
    }

    /** 
     * Get the 'DateTimeEnd' element value. Окончание экспертизы
     * 
     * @return value
     */
    public String getDateTimeEnd() {
        return dateTimeEnd;
    }

    /** 
     * Set the 'DateTimeEnd' element value. Окончание экспертизы
     * 
     * @param dateTimeEnd
     */
    public void setDateTimeEnd(String dateTimeEnd) {
        this.dateTimeEnd = dateTimeEnd;
    }

    /** 
     * Get the 'FIOExpert' element value. ФИО эксперта
     * 
     * @return value
     */
    public String getFIOExpert() {
        return FIOExpert;
    }

    /** 
     * Set the 'FIOExpert' element value. ФИО эксперта
     * 
     * @param FIOExpert
     */
    public void setFIOExpert(String FIOExpert) {
        this.FIOExpert = FIOExpert;
    }

    /** 
     * Get the 'Qualification' element value. Квалификация эксперта
     * 
     * @return value
     */
    public String getQualification() {
        return qualification;
    }

    /** 
     * Set the 'Qualification' element value. Квалификация эксперта
     * 
     * @param qualification
     */
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    /** 
     * Get the 'ExpertExperience' element value. Экспертный стаж. (лет)
     * 
     * @return value
     */
    public String getExpertExperience() {
        return expertExperience;
    }

    /** 
     * Set the 'ExpertExperience' element value. Экспертный стаж. (лет)
     * 
     * @param expertExperience
     */
    public void setExpertExperience(String expertExperience) {
        this.expertExperience = expertExperience;
    }

    /** 
     * Get the list of 'Questions' element items. Вопросы, поставленные на разрешение таможенного эксперта
     * 
     * @return list
     */
    public List<String> getQuestionList() {
        return questionList;
    }

    /** 
     * Set the list of 'Questions' element items. Вопросы, поставленные на разрешение таможенного эксперта
     * 
     * @param list
     */
    public void setQuestionList(List<String> list) {
        questionList = list;
    }

    /** 
     * Get the list of 'Presentation' element items. Сведения о предоставление необходимого для таможенной экспертизы
     * 
     * @return list
     */
    public List<String> getPresentationList() {
        return presentationList;
    }

    /** 
     * Set the list of 'Presentation' element items. Сведения о предоставление необходимого для таможенной экспертизы
     * 
     * @param list
     */
    public void setPresentationList(List<String> list) {
        presentationList = list;
    }

    /** 
     * Get the list of 'InspectionAccount' element items. Внешний осмотр и оценка исходных данных
     * 
     * @return list
     */
    public List<String> getInspectionAccountList() {
        return inspectionAccountList;
    }

    /** 
     * Set the list of 'InspectionAccount' element items. Внешний осмотр и оценка исходных данных
     * 
     * @param list
     */
    public void setInspectionAccountList(List<String> list) {
        inspectionAccountList = list;
    }

    /** 
     * Get the list of 'Examination' element items. Исследование (с указанием примененных методов, материалов и документов, иллюстрирующих заключение таможенного эксперта, оценка результатов исследований)
     * 
     * @return list
     */
    public List<String> getExaminationList() {
        return examinationList;
    }

    /** 
     * Set the list of 'Examination' element items. Исследование (с указанием примененных методов, материалов и документов, иллюстрирующих заключение таможенного эксперта, оценка результатов исследований)
     * 
     * @param list
     */
    public void setExaminationList(List<String> list) {
        examinationList = list;
    }

    /** 
     * Get the list of 'SynthesizingPortion' element items. Синтезирующая часть (в комплексных экспертизах при необходимости)
     * 
     * @return list
     */
    public List<String> getSynthesizingPortionList() {
        return synthesizingPortionList;
    }

    /** 
     * Set the list of 'SynthesizingPortion' element items. Синтезирующая часть (в комплексных экспертизах при необходимости)
     * 
     * @param list
     */
    public void setSynthesizingPortionList(List<String> list) {
        synthesizingPortionList = list;
    }

    /** 
     * Get the list of 'Conclusions' element items. Выводы
     * 
     * @return list
     */
    public List<String> getConclusionList() {
        return conclusionList;
    }

    /** 
     * Set the list of 'Conclusions' element items. Выводы
     * 
     * @param list
     */
    public void setConclusionList(List<String> list) {
        conclusionList = list;
    }

    /** 
     * Get the 'ExpertCertificate' element value. Экспертное свидетельство
     * 
     * @return value
     */
    public DocumentBaseType getExpertCertificate() {
        return expertCertificate;
    }

    /** 
     * Set the 'ExpertCertificate' element value. Экспертное свидетельство
     * 
     * @param expertCertificate
     */
    public void setExpertCertificate(DocumentBaseType expertCertificate) {
        this.expertCertificate = expertCertificate;
    }

    /** 
     * Get the 'Commission' element value. Поручение
     * 
     * @return value
     */
    public DocumentBaseType getCommission() {
        return commission;
    }

    /** 
     * Set the 'Commission' element value. Поручение
     * 
     * @param commission
     */
    public void setCommission(DocumentBaseType commission) {
        this.commission = commission;
    }

    /** 
     * Get the list of 'ExpertSignature' element items. Подпись таможенного эксперта
     * 
     * @return list
     */
    public List<PersonSignatureType> getExpertSignatureList() {
        return expertSignatureList;
    }

    /** 
     * Set the list of 'ExpertSignature' element items. Подпись таможенного эксперта
     * 
     * @param list
     */
    public void setExpertSignatureList(List<PersonSignatureType> list) {
        expertSignatureList = list;
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
