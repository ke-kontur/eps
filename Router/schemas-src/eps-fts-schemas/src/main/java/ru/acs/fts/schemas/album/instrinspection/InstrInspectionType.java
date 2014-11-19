
package ru.acs.fts.schemas.album.instrinspection;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Информация о проведении досмотра товаров
 */
public class InstrInspectionType extends BaseDocType
{
    private LocalDate inspectionDate;
    private String inspectionTime;
    private String basisExamination;
    private LocalDate inspDecisionDate;
    private String inspDecisionTime;
    private String shortFormSign;
    private InstrInfoType instrInfo;
    private InspectionObjectType inspectionObject;
    private GTDIDType instrNumber;
    private GTDIDType DTNumber;
    private List<CustomsPersonType> customsPersonList = new ArrayList<CustomsPersonType>();
    private String documentModeID;

    /** 
     * Get the 'InspectionDate' element value. Дата проведения досмотра
     * 
     * @return value
     */
    public LocalDate getInspectionDate() {
        return inspectionDate;
    }

    /** 
     * Set the 'InspectionDate' element value. Дата проведения досмотра
     * 
     * @param inspectionDate
     */
    public void setInspectionDate(LocalDate inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    /** 
     * Get the 'InspectionTime' element value. Время до которого должен быть проведен досмотр
     * 
     * @return value
     */
    public String getInspectionTime() {
        return inspectionTime;
    }

    /** 
     * Set the 'InspectionTime' element value. Время до которого должен быть проведен досмотр
     * 
     * @param inspectionTime
     */
    public void setInspectionTime(String inspectionTime) {
        this.inspectionTime = inspectionTime;
    }

    /** 
     * Get the 'BasisExamination' element value. Основание для проведения досмотра
     * 
     * @return value
     */
    public String getBasisExamination() {
        return basisExamination;
    }

    /** 
     * Set the 'BasisExamination' element value. Основание для проведения досмотра
     * 
     * @param basisExamination
     */
    public void setBasisExamination(String basisExamination) {
        this.basisExamination = basisExamination;
    }

    /** 
     * Get the 'InspDecisionDate' element value. Дата принятия решения о проведении досмотра
     * 
     * @return value
     */
    public LocalDate getInspDecisionDate() {
        return inspDecisionDate;
    }

    /** 
     * Set the 'InspDecisionDate' element value. Дата принятия решения о проведении досмотра
     * 
     * @param inspDecisionDate
     */
    public void setInspDecisionDate(LocalDate inspDecisionDate) {
        this.inspDecisionDate = inspDecisionDate;
    }

    /** 
     * Get the 'InspDecisionTime' element value. Время принятия решения о проведении досмотра
     * 
     * @return value
     */
    public String getInspDecisionTime() {
        return inspDecisionTime;
    }

    /** 
     * Set the 'InspDecisionTime' element value. Время принятия решения о проведении досмотра
     * 
     * @param inspDecisionTime
     */
    public void setInspDecisionTime(String inspDecisionTime) {
        this.inspDecisionTime = inspDecisionTime;
    }

    /** 
     * Get the 'ShortFormSign' element value. Признак возможности составления АТДО в сокращенной форме
     * 
     * @return value
     */
    public String getShortFormSign() {
        return shortFormSign;
    }

    /** 
     * Set the 'ShortFormSign' element value. Признак возможности составления АТДО в сокращенной форме
     * 
     * @param shortFormSign
     */
    public void setShortFormSign(String shortFormSign) {
        this.shortFormSign = shortFormSign;
    }

    /** 
     * Get the 'InstrInfo' element value. Сведения о документе
     * 
     * @return value
     */
    public InstrInfoType getInstrInfo() {
        return instrInfo;
    }

    /** 
     * Set the 'InstrInfo' element value. Сведения о документе
     * 
     * @param instrInfo
     */
    public void setInstrInfo(InstrInfoType instrInfo) {
        this.instrInfo = instrInfo;
    }

    /** 
     * Get the 'InspectionObject' element value. Сведения об объекте досмотра
     * 
     * @return value
     */
    public InspectionObjectType getInspectionObject() {
        return inspectionObject;
    }

    /** 
     * Set the 'InspectionObject' element value. Сведения об объекте досмотра
     * 
     * @param inspectionObject
     */
    public void setInspectionObject(InspectionObjectType inspectionObject) {
        this.inspectionObject = inspectionObject;
    }

    /** 
     * Get the 'InstrNumber' element value. Исходящий номер документа
     * 
     * @return value
     */
    public GTDIDType getInstrNumber() {
        return instrNumber;
    }

    /** 
     * Set the 'InstrNumber' element value. Исходящий номер документа
     * 
     * @param instrNumber
     */
    public void setInstrNumber(GTDIDType instrNumber) {
        this.instrNumber = instrNumber;
    }

    /** 
     * Get the 'DTNumber' element value. Номер декларации на товары, по которой необходимо произвести осмотр/досмотр товаров
     * 
     * @return value
     */
    public GTDIDType getDTNumber() {
        return DTNumber;
    }

    /** 
     * Set the 'DTNumber' element value. Номер декларации на товары, по которой необходимо произвести осмотр/досмотр товаров
     * 
     * @param DTNumber
     */
    public void setDTNumber(GTDIDType DTNumber) {
        this.DTNumber = DTNumber;
    }

    /** 
     * Get the list of 'CustomsPersons' element items. Уполномоченное должностное лицо таможенного органа, назначенное на проведение таможенного досмотра
     * 
     * @return list
     */
    public List<CustomsPersonType> getCustomsPersonList() {
        return customsPersonList;
    }

    /** 
     * Set the list of 'CustomsPersons' element items. Уполномоченное должностное лицо таможенного органа, назначенное на проведение таможенного досмотра
     * 
     * @param list
     */
    public void setCustomsPersonList(List<CustomsPersonType> list) {
        customsPersonList = list;
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
