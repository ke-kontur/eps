
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Комплексный тип для данных об аннулировании документа
 */
public class WHDocumentCancelationType
{
    private LocalDate cancelDate;
    private String cancelReason;
    private WHCustomInspectorType inspector;

    /** 
     * Get the 'CancelDate' element value. Дата аннулирования
     * 
     * @return value
     */
    public LocalDate getCancelDate() {
        return cancelDate;
    }

    /** 
     * Set the 'CancelDate' element value. Дата аннулирования
     * 
     * @param cancelDate
     */
    public void setCancelDate(LocalDate cancelDate) {
        this.cancelDate = cancelDate;
    }

    /** 
     * Get the 'CancelReason' element value. Причина аннулирования
     * 
     * @return value
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /** 
     * Set the 'CancelReason' element value. Причина аннулирования
     * 
     * @param cancelReason
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    /** 
     * Get the 'Inspector' element value. Сотрудник таможенного органа, аннулировавший отчет
     * 
     * @return value
     */
    public WHCustomInspectorType getInspector() {
        return inspector;
    }

    /** 
     * Set the 'Inspector' element value. Сотрудник таможенного органа, аннулировавший отчет
     * 
     * @param inspector
     */
    public void setInspector(WHCustomInspectorType inspector) {
        this.inspector = inspector;
    }
}
