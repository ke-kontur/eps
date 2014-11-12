
package ru.acs.fts.schemas.album.esadin;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUPresentedDocumentsType;

/** 
 * ДТ и ТД. Внутренний формат. Представленные документы гр. 44.
 */
public class ESADinPresentedDocumentType extends CUPresentedDocumentsType
{
    private String BDRDID;

    /** 
     * Get the 'BDRDID' element value. Уникальный идентификатор разрешительного документа
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. Уникальный идентификатор разрешительного документа
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }
}
