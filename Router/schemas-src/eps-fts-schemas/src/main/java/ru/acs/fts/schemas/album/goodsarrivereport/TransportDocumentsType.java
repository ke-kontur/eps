
package ru.acs.fts.schemas.album.goodsarrivereport;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о транспортных документах
 */
public class TransportDocumentsType extends DocumentBaseType
{
    private String documentModeCode;

    /** 
     * Get the 'DocumentModeCode' element value. Код вида документа в соответствии с Классификатором видов документов.
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. Код вида документа в соответствии с Классификатором видов документов.
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }
}
