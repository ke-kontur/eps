
package ru.acs.fts.schemas.album.mpo_declaration;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о документе
 */
public class DocumentInfoType extends DocumentBaseType
{
    private String documentCode;

    /** 
     * Get the 'DocumentCode' element value. Код документа (EDIFACT и UPU)
     * 
     * @return value
     */
    public String getDocumentCode() {
        return documentCode;
    }

    /** 
     * Set the 'DocumentCode' element value. Код документа (EDIFACT и UPU)
     * 
     * @param documentCode
     */
    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }
}
