
package ru.acs.fts.schemas.album.freedoc;

import org.joda.time.LocalDate;

/** 
 * Заголовок документа
 */
public class DocumentHeadType
{
    private String documentName;
    private LocalDate documentDate;
    private String documentNumber;
    private String organizationName;
    private String visibleFlag;

    /** 
     * Get the 'DocumentName' element value. Наименование документа
     * 
     * @return value
     */
    public String getDocumentName() {
        return documentName;
    }

    /** 
     * Set the 'DocumentName' element value. Наименование документа
     * 
     * @param documentName
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /** 
     * Get the 'DocumentDate' element value. Дата документа
     * 
     * @return value
     */
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    /** 
     * Set the 'DocumentDate' element value. Дата документа
     * 
     * @param documentDate
     */
    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    /** 
     * Get the 'DocumentNumber' element value. Номер документа. В случае, если номера нет, указывается "Б/Н"
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Номер документа. В случае, если номера нет, указывается "Б/Н"
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'OrganizationName' element value. Наименование организации,  выдавшей документ
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Наименование организации,  выдавшей документ
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'VisibleFlag' attribute value.
     * 
     * @return value
     */
    public String getVisibleFlag() {
        return visibleFlag;
    }

    /** 
     * Set the 'VisibleFlag' attribute value.
     * 
     * @param visibleFlag
     */
    public void setVisibleFlag(String visibleFlag) {
        this.visibleFlag = visibleFlag;
    }
}
