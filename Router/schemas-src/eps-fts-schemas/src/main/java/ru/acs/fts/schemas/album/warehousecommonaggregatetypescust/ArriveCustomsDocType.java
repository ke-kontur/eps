
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Таможенные документы
 */
public class ArriveCustomsDocType extends DocumentBaseType
{
    private String documentCode;

    /** 
     * Get the 'DocumentCode' element value. Код таможенного документа
     * 
     * @return value
     */
    public String getDocumentCode() {
        return documentCode;
    }

    /** 
     * Set the 'DocumentCode' element value. Код таможенного документа
     * 
     * @param documentCode
     */
    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }
}
