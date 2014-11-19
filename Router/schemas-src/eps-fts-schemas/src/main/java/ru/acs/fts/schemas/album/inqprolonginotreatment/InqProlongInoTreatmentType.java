
package ru.acs.fts.schemas.album.inqprolonginotreatment;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Заявление на продление сроков переработки товаров вне таможенной территории
 */
public class InqProlongInoTreatmentType extends BaseDocType
{
    private LocalDate sendDate;
    private OrganizationType applicant;
    private ChangeDateType changeDate;
    private CustomsType customs;
    private List<DocumentBaseType> documentBaseList = new ArrayList<DocumentBaseType>();
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. Дата направления
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. Дата направления
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'Applicant' element value. Сведения о заявителе
     * 
     * @return value
     */
    public OrganizationType getApplicant() {
        return applicant;
    }

    /** 
     * Set the 'Applicant' element value. Сведения о заявителе
     * 
     * @param applicant
     */
    public void setApplicant(OrganizationType applicant) {
        this.applicant = applicant;
    }

    /** 
     * Get the 'ChangeDate' element value. Описание предлагаемого срока продления
     * 
     * @return value
     */
    public ChangeDateType getChangeDate() {
        return changeDate;
    }

    /** 
     * Set the 'ChangeDate' element value. Описание предлагаемого срока продления
     * 
     * @param changeDate
     */
    public void setChangeDate(ChangeDateType changeDate) {
        this.changeDate = changeDate;
    }

    /** 
     * Get the 'Customs' element value. Код и наименование таможенного органа
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Код и наименование таможенного органа
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the list of 'DocumentBase' element items. Дополнительные документы
     * 
     * @return list
     */
    public List<DocumentBaseType> getDocumentBaseList() {
        return documentBaseList;
    }

    /** 
     * Set the list of 'DocumentBase' element items. Дополнительные документы
     * 
     * @param list
     */
    public void setDocumentBaseList(List<DocumentBaseType> list) {
        documentBaseList = list;
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
