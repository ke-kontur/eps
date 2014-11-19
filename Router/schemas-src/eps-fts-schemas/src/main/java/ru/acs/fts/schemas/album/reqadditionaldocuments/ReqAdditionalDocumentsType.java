
package ru.acs.fts.schemas.album.reqadditionaldocuments;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Запрос о представлении дополнительных документов
 */
public class ReqAdditionalDocumentsType extends BaseDocType
{
    private String numberDoc;
    private LocalDate dateDoc;
    private LocalDate term;
    private CustomsPersonType customsPerson;
    private PersonSignatureType personSignature;
    private List<AddDocumtentType> listDocumentList = new ArrayList<AddDocumtentType>();
    private InfoDeclType delcarant;
    private GTDIDType GTDID;
    private String documentModeID;

    /** 
     * Get the 'NumberDoc' element value. Номер документа
     * 
     * @return value
     */
    public String getNumberDoc() {
        return numberDoc;
    }

    /** 
     * Set the 'NumberDoc' element value. Номер документа
     * 
     * @param numberDoc
     */
    public void setNumberDoc(String numberDoc) {
        this.numberDoc = numberDoc;
    }

    /** 
     * Get the 'DateDoc' element value. Дата документа
     * 
     * @return value
     */
    public LocalDate getDateDoc() {
        return dateDoc;
    }

    /** 
     * Set the 'DateDoc' element value. Дата документа
     * 
     * @param dateDoc
     */
    public void setDateDoc(LocalDate dateDoc) {
        this.dateDoc = dateDoc;
    }

    /** 
     * Get the 'Term' element value. Срок представить  дополнительные документы
     * 
     * @return value
     */
    public LocalDate getTerm() {
        return term;
    }

    /** 
     * Set the 'Term' element value. Срок представить  дополнительные документы
     * 
     * @param term
     */
    public void setTerm(LocalDate term) {
        this.term = term;
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
     * Get the 'PersonSignature' element value. Подпись
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. Подпись
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
    }

    /** 
     * Get the list of 'ListDocuments' element items. Список запрашиваемых документов
     * 
     * @return list
     */
    public List<AddDocumtentType> getListDocumentList() {
        return listDocumentList;
    }

    /** 
     * Set the list of 'ListDocuments' element items. Список запрашиваемых документов
     * 
     * @param list
     */
    public void setListDocumentList(List<AddDocumtentType> list) {
        listDocumentList = list;
    }

    /** 
     * Get the 'Delcarant' element value. Декларант
     * 
     * @return value
     */
    public InfoDeclType getDelcarant() {
        return delcarant;
    }

    /** 
     * Set the 'Delcarant' element value. Декларант
     * 
     * @param delcarant
     */
    public void setDelcarant(InfoDeclType delcarant) {
        this.delcarant = delcarant;
    }

    /** 
     * Get the 'GTDID' element value. Номер ДТ
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Номер ДТ
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
