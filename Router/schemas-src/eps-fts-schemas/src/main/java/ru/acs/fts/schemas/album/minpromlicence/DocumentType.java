
package ru.acs.fts.schemas.album.minpromlicence;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Документ
 */
public class DocumentType extends DocumentBaseType
{
    private String docCode;

    /** 
     * Get the 'DocCode' element value. Код документа
     * 
     * @return value
     */
    public String getDocCode() {
        return docCode;
    }

    /** 
     * Set the 'DocCode' element value. Код документа
     * 
     * @param docCode
     */
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }
}
