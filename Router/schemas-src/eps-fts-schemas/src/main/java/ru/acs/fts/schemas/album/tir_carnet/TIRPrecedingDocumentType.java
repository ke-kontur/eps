
package ru.acs.fts.schemas.album.tir_carnet;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Предшествующий документ в МДП
 */
public class TIRPrecedingDocumentType extends DocumentBaseType
{
    private String documentKind;

    /** 
     * Get the 'DocumentKind' element value. Тип предшествующего документа
     * 
     * @return value
     */
    public String getDocumentKind() {
        return documentKind;
    }

    /** 
     * Set the 'DocumentKind' element value. Тип предшествующего документа
     * 
     * @param documentKind
     */
    public void setDocumentKind(String documentKind) {
        this.documentKind = documentKind;
    }
}
