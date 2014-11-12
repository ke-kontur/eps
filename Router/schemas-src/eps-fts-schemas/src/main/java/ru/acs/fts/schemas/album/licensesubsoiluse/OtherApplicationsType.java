
package ru.acs.fts.schemas.album.licensesubsoiluse;

/** 
 * Иные приложения 
 */
public class OtherApplicationsType
{
    private String nameDocument;
    private String numberSheets;

    /** 
     * Get the 'NameDocument' element value. Название документа
     * 
     * @return value
     */
    public String getNameDocument() {
        return nameDocument;
    }

    /** 
     * Set the 'NameDocument' element value. Название документа
     * 
     * @param nameDocument
     */
    public void setNameDocument(String nameDocument) {
        this.nameDocument = nameDocument;
    }

    /** 
     * Get the 'NumberSheets' element value. Количество страниц
     * 
     * @return value
     */
    public String getNumberSheets() {
        return numberSheets;
    }

    /** 
     * Set the 'NumberSheets' element value. Количество страниц
     * 
     * @param numberSheets
     */
    public void setNumberSheets(String numberSheets) {
        this.numberSheets = numberSheets;
    }
}
