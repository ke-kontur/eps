
package ru.acs.fts.schemas.album.guaranteecontractaddition;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о документе
 */
public class DocumentInfoType extends DocumentBaseType
{
    private String documentCode;

    /** 
     * Get the 'DocumentCode' element value. Код видa  документа в соответствии с Классификатором видов документов, используемых при таможенном декларировании
     * 
     * @return value
     */
    public String getDocumentCode() {
        return documentCode;
    }

    /** 
     * Set the 'DocumentCode' element value. Код видa  документа в соответствии с Классификатором видов документов, используемых при таможенном декларировании
     * 
     * @param documentCode
     */
    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }
}
