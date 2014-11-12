
package ru.acs.fts.schemas.album.applicationacceptclassdecision;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Заявление о принятии классификационного решения
 */
public class ApplicationAcceptClassDecisionType extends BaseDocType
{
    private String decisionSign;
    private String numberApplication;
    private LocalDate dateApplication;
    private DeclarantType declarant;
    private List<GoodInfoType> goodInfoList = new ArrayList<GoodInfoType>();
    private PersonSignatureType personSignature;
    private List<AttachedDocumentsType> attachedDocumentList = new ArrayList<AttachedDocumentsType>();
    private String documentModeID;

    /** 
     * Get the 'DecisionSign' element value. Признак заявления о принятии решения по классификации товара (1- заявление о принятии решения, 0 - заявление о принятии предварительного решения)
     * 
     * @return value
     */
    public String getDecisionSign() {
        return decisionSign;
    }

    /** 
     * Set the 'DecisionSign' element value. Признак заявления о принятии решения по классификации товара (1- заявление о принятии решения, 0 - заявление о принятии предварительного решения)
     * 
     * @param decisionSign
     */
    public void setDecisionSign(String decisionSign) {
        this.decisionSign = decisionSign;
    }

    /** 
     * Get the 'NumberApplication' element value. Номер заявления
     * 
     * @return value
     */
    public String getNumberApplication() {
        return numberApplication;
    }

    /** 
     * Set the 'NumberApplication' element value. Номер заявления
     * 
     * @param numberApplication
     */
    public void setNumberApplication(String numberApplication) {
        this.numberApplication = numberApplication;
    }

    /** 
     * Get the 'DateApplication' element value. Дата заявления
     * 
     * @return value
     */
    public LocalDate getDateApplication() {
        return dateApplication;
    }

    /** 
     * Set the 'DateApplication' element value. Дата заявления
     * 
     * @param dateApplication
     */
    public void setDateApplication(LocalDate dateApplication) {
        this.dateApplication = dateApplication;
    }

    /** 
     * Get the 'Declarant' element value. Информация о заявителе
     * 
     * @return value
     */
    public DeclarantType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Информация о заявителе
     * 
     * @param declarant
     */
    public void setDeclarant(DeclarantType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the list of 'GoodInfo' element items. Информация о товаре
     * 
     * @return list
     */
    public List<GoodInfoType> getGoodInfoList() {
        return goodInfoList;
    }

    /** 
     * Set the list of 'GoodInfo' element items. Информация о товаре
     * 
     * @param list
     */
    public void setGoodInfoList(List<GoodInfoType> list) {
        goodInfoList = list;
    }

    /** 
     * Get the 'PersonSignature' element value. Подпись заявителя
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. Подпись заявителя
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
    }

    /** 
     * Get the list of 'AttachedDocuments' element items. Опись прилагаемых документов
     * 
     * @return list
     */
    public List<AttachedDocumentsType> getAttachedDocumentList() {
        return attachedDocumentList;
    }

    /** 
     * Set the list of 'AttachedDocuments' element items. Опись прилагаемых документов
     * 
     * @param list
     */
    public void setAttachedDocumentList(List<AttachedDocumentsType> list) {
        attachedDocumentList = list;
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
