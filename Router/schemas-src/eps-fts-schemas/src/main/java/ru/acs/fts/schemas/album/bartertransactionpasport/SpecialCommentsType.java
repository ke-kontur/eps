
package ru.acs.fts.schemas.album.bartertransactionpasport;

/** 
 * Особые отметки
 */
public class SpecialCommentsType
{
    private String explanations;
    private String exportAmount;
    private String importAmount;

    /** 
     * Get the 'Explanations' element value. Информация, не отраженная в других графах Паспорта, облегчающая работу контролирующих органов
     * 
     * @return value
     */
    public String getExplanations() {
        return explanations;
    }

    /** 
     * Set the 'Explanations' element value. Информация, не отраженная в других графах Паспорта, облегчающая работу контролирующих органов
     * 
     * @param explanations
     */
    public void setExplanations(String explanations) {
        this.explanations = explanations;
    }

    /** 
     * Get the 'ExportAmount' element value. Исполненная часть экспорта, тыс. ед.
     * 
     * @return value
     */
    public String getExportAmount() {
        return exportAmount;
    }

    /** 
     * Set the 'ExportAmount' element value. Исполненная часть экспорта, тыс. ед.
     * 
     * @param exportAmount
     */
    public void setExportAmount(String exportAmount) {
        this.exportAmount = exportAmount;
    }

    /** 
     * Get the 'ImportAmount' element value. Исполненная часть импорта, тыс. ед.
     * 
     * @return value
     */
    public String getImportAmount() {
        return importAmount;
    }

    /** 
     * Set the 'ImportAmount' element value. Исполненная часть импорта, тыс. ед.
     * 
     * @param importAmount
     */
    public void setImportAmount(String importAmount) {
        this.importAmount = importAmount;
    }
}
