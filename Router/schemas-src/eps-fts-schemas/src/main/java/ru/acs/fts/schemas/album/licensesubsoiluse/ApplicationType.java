
package ru.acs.fts.schemas.album.licensesubsoiluse;

/** 
 * Сведения о приложениях, в которых копии документов и описание границ земельного участка/границ участка недр
 */
public class ApplicationType
{
    private String KIndApplication;
    private String numberApplication;
    private String sheetApplication;

    /** 
     * Get the 'KIndApplication' element value. Тип приложения: true - приложение, описывающее границы земельного участка; false- приложение, описывающее границы участка недр 
     * 
     * @return value
     */
    public String getKIndApplication() {
        return KIndApplication;
    }

    /** 
     * Set the 'KIndApplication' element value. Тип приложения: true - приложение, описывающее границы земельного участка; false- приложение, описывающее границы участка недр 
     * 
     * @param KIndApplication
     */
    public void setKIndApplication(String KIndApplication) {
        this.KIndApplication = KIndApplication;
    }

    /** 
     * Get the 'NumberApplication' element value. Номер приложения 
     * 
     * @return value
     */
    public String getNumberApplication() {
        return numberApplication;
    }

    /** 
     * Set the 'NumberApplication' element value. Номер приложения 
     * 
     * @param numberApplication
     */
    public void setNumberApplication(String numberApplication) {
        this.numberApplication = numberApplication;
    }

    /** 
     * Get the 'SheetApplication' element value. Количество листов в приложении
     * 
     * @return value
     */
    public String getSheetApplication() {
        return sheetApplication;
    }

    /** 
     * Set the 'SheetApplication' element value. Количество листов в приложении
     * 
     * @param sheetApplication
     */
    public void setSheetApplication(String sheetApplication) {
        this.sheetApplication = sheetApplication;
    }
}
