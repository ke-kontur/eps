
package ru.acs.fts.schemas.album.cwformular;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Информация о документе
 */
public class DocumentType extends DocumentBaseType
{
    private String docNN;
    private String docType;

    /** 
     * Get the 'DocNN' element value. Порядковый номер документа
     * 
     * @return value
     */
    public String getDocNN() {
        return docNN;
    }

    /** 
     * Set the 'DocNN' element value. Порядковый номер документа
     * 
     * @param docNN
     */
    public void setDocNN(String docNN) {
        this.docNN = docNN;
    }

    /** 
     * Get the 'DocType' element value. Тип документа
     * 
     * @return value
     */
    public String getDocType() {
        return docType;
    }

    /** 
     * Set the 'DocType' element value. Тип документа
     * 
     * @param docType
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }
}
