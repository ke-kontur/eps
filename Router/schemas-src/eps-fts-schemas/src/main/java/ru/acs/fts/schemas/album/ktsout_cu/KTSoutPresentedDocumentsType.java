
package ru.acs.fts.schemas.album.ktsout_cu;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADPresentedDocumentsType;

/** 
 * КТС. Представленные документы
 */
public class KTSoutPresentedDocumentsType extends CUESADPresentedDocumentsType
{
    private String regNumberDocument;

    /** 
     * Get the 'RegNumberDocument' element value. Регистрационный номер таможенного документа, с которым он был первоначально предоставлен. Для РБ  
     * 
     * @return value
     */
    public String getRegNumberDocument() {
        return regNumberDocument;
    }

    /** 
     * Set the 'RegNumberDocument' element value. Регистрационный номер таможенного документа, с которым он был первоначально предоставлен. Для РБ  
     * 
     * @param regNumberDocument
     */
    public void setRegNumberDocument(String regNumberDocument) {
        this.regNumberDocument = regNumberDocument;
    }
}
