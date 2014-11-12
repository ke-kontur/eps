
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * ESAD.Представленные документы
 */
public class CUPresentedDocumentsType extends CUESADPresentedDocumentsType
{
    private String TIRPageNumber;
    private String TIRHolderID;
    private String regNumberDocument;

    /** 
     * Get the 'TIRPageNumber' element value. Порядковый номер листа книжки МДП
     * 
     * @return value
     */
    public String getTIRPageNumber() {
        return TIRPageNumber;
    }

    /** 
     * Set the 'TIRPageNumber' element value. Порядковый номер листа книжки МДП
     * 
     * @param TIRPageNumber
     */
    public void setTIRPageNumber(String TIRPageNumber) {
        this.TIRPageNumber = TIRPageNumber;
    }

    /** 
     * Get the 'TIRHolderID' element value. Идентификационный номер держателя книжки МДП
     * 
     * @return value
     */
    public String getTIRHolderID() {
        return TIRHolderID;
    }

    /** 
     * Set the 'TIRHolderID' element value. Идентификационный номер держателя книжки МДП
     * 
     * @param TIRHolderID
     */
    public void setTIRHolderID(String TIRHolderID) {
        this.TIRHolderID = TIRHolderID;
    }

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
