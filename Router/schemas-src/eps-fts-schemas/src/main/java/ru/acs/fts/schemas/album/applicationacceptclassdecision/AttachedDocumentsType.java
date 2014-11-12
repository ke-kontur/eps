
package ru.acs.fts.schemas.album.applicationacceptclassdecision;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Информация о дополнительном направлении документов, указанных в заявлении
 */
public class AttachedDocumentsType extends DocumentBaseType
{
    private String docForm;
    private LocalDate presentationDate;
    private String sheetsNumber;

    /** 
     * Get the 'DocForm' element value. Признак электронной формы документа, представляемого с заявлением о принятии предварительного решения
     * 
     * @return value
     */
    public String getDocForm() {
        return docForm;
    }

    /** 
     * Set the 'DocForm' element value. Признак электронной формы документа, представляемого с заявлением о принятии предварительного решения
     * 
     * @param docForm
     */
    public void setDocForm(String docForm) {
        this.docForm = docForm;
    }

    /** 
     * Get the 'PresentationDate' element value. Срок представления документа
     * 
     * @return value
     */
    public LocalDate getPresentationDate() {
        return presentationDate;
    }

    /** 
     * Set the 'PresentationDate' element value. Срок представления документа
     * 
     * @param presentationDate
     */
    public void setPresentationDate(LocalDate presentationDate) {
        this.presentationDate = presentationDate;
    }

    /** 
     * Get the 'SheetsNumber' element value. Количество листов приложения (кроме сброшюрованных приложений)
     * 
     * @return value
     */
    public String getSheetsNumber() {
        return sheetsNumber;
    }

    /** 
     * Set the 'SheetsNumber' element value. Количество листов приложения (кроме сброшюрованных приложений)
     * 
     * @param sheetsNumber
     */
    public void setSheetsNumber(String sheetsNumber) {
        this.sheetsNumber = sheetsNumber;
    }
}
