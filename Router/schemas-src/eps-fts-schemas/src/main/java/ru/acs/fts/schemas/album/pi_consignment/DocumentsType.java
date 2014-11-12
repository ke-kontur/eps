
package ru.acs.fts.schemas.album.pi_consignment;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Документ
 */
public class DocumentsType extends DocumentBaseType
{
    private String documentModeCode;

    /** 
     * Get the 'DocumentModeCode' element value. Код вида документа
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. Код вида документа
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }
}
