
package ru.acs.fts.schemas.album.ansresolutioncustoms;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Ответ декларанта на решение таможенного органа по таможенной стоимости
 */
public class AnsResolutionCustomsType extends BaseDocType
{
    private String refinedStructure;
    private String designateTS;
    private List<String> reasonList = new ArrayList<String>();
    private String consultation;
    private LocalDate expectedConsultationDate;
    private PersonSignatureType ansDeclarantSignature;
    private AnsDeclarantType ansDeclarant;
    private GTDIDType GTDID;
    private String documentModeID;

    /** 
     * Get the 'RefinedStructure' element value. Признак согласия уточнить структуру заявленной таможенной стоимости в рамках выбранного метода
     * 
     * @return value
     */
    public String getRefinedStructure() {
        return refinedStructure;
    }

    /** 
     * Set the 'RefinedStructure' element value. Признак согласия уточнить структуру заявленной таможенной стоимости в рамках выбранного метода
     * 
     * @param refinedStructure
     */
    public void setRefinedStructure(String refinedStructure) {
        this.refinedStructure = refinedStructure;
    }

    /** 
     * Get the 'DesignateTS' element value. Признак согласия определить таможенную стоимость другим методом
     * 
     * @return value
     */
    public String getDesignateTS() {
        return designateTS;
    }

    /** 
     * Set the 'DesignateTS' element value. Признак согласия определить таможенную стоимость другим методом
     * 
     * @param designateTS
     */
    public void setDesignateTS(String designateTS) {
        this.designateTS = designateTS;
    }

    /** 
     * Get the list of 'Reason' element items. При несогласии сообщить причины.
     * 
     * @return list
     */
    public List<String> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reason' element items. При несогласии сообщить причины.
     * 
     * @param list
     */
    public void setReasonList(List<String> list) {
        reasonList = list;
    }

    /** 
     * Get the 'Consultation' element value. Признак необходимости проведения консультации по выбору метода определения таможенной стоимости
     * 
     * @return value
     */
    public String getConsultation() {
        return consultation;
    }

    /** 
     * Set the 'Consultation' element value. Признак необходимости проведения консультации по выбору метода определения таможенной стоимости
     * 
     * @param consultation
     */
    public void setConsultation(String consultation) {
        this.consultation = consultation;
    }

    /** 
     * Get the 'ExpectedConsultationDate' element value. Предполагаемая дата консультации
     * 
     * @return value
     */
    public LocalDate getExpectedConsultationDate() {
        return expectedConsultationDate;
    }

    /** 
     * Set the 'ExpectedConsultationDate' element value. Предполагаемая дата консультации
     * 
     * @param expectedConsultationDate
     */
    public void setExpectedConsultationDate(LocalDate expectedConsultationDate) {
        this.expectedConsultationDate = expectedConsultationDate;
    }

    /** 
     * Get the 'AnsDeclarantSignature' element value. Подпись декларанта.
     * 
     * @return value
     */
    public PersonSignatureType getAnsDeclarantSignature() {
        return ansDeclarantSignature;
    }

    /** 
     * Set the 'AnsDeclarantSignature' element value. Подпись декларанта.
     * 
     * @param ansDeclarantSignature
     */
    public void setAnsDeclarantSignature(
            PersonSignatureType ansDeclarantSignature) {
        this.ansDeclarantSignature = ansDeclarantSignature;
    }

    /** 
     * Get the 'AnsDeclarant' element value. Декларант
     * 
     * @return value
     */
    public AnsDeclarantType getAnsDeclarant() {
        return ansDeclarant;
    }

    /** 
     * Set the 'AnsDeclarant' element value. Декларант
     * 
     * @param ansDeclarant
     */
    public void setAnsDeclarant(AnsDeclarantType ansDeclarant) {
        this.ansDeclarant = ansDeclarant;
    }

    /** 
     * Get the 'GTDID' element value. Регистрационный номер таможенного документа. 
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Регистрационный номер таможенного документа. 
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
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
