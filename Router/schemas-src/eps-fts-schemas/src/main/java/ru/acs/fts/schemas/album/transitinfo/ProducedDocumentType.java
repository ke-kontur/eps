
package ru.acs.fts.schemas.album.transitinfo;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Представляемые документы (сертификаты).
 */
public class ProducedDocumentType extends DocumentBaseType
{
    private String documentKind;

    /** 
     * Get the 'DocumentKind' element value. Тип представленного документа.
     * 
     * @return value
     */
    public String getDocumentKind() {
        return documentKind;
    }

    /** 
     * Set the 'DocumentKind' element value. Тип представленного документа.
     * 
     * @param documentKind
     */
    public void setDocumentKind(String documentKind) {
        this.documentKind = documentKind;
    }
}
