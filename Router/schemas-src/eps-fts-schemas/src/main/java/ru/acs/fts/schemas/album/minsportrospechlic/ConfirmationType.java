
package ru.acs.fts.schemas.album.minsportrospechlic;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Подтверждение
 */
public class ConfirmationType extends DocumentBaseType
{
    private LocalDate dueDate;
    private String confirmationId;
    private String lastChangeDate;
    private ConfirmationStatusType confirmationStatus;

    /** 
     * Get the 'DueDate' element value. Срок действия подтверждения
     * 
     * @return value
     */
    public LocalDate getDueDate() {
        return dueDate;
    }

    /** 
     * Set the 'DueDate' element value. Срок действия подтверждения
     * 
     * @param dueDate
     */
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /** 
     * Get the 'ConfirmationId' element value. Идентификатор подтверждения
     * 
     * @return value
     */
    public String getConfirmationId() {
        return confirmationId;
    }

    /** 
     * Set the 'ConfirmationId' element value. Идентификатор подтверждения
     * 
     * @param confirmationId
     */
    public void setConfirmationId(String confirmationId) {
        this.confirmationId = confirmationId;
    }

    /** 
     * Get the 'LastChangeDate' element value. Информация о дате и времени последнего изменения
     * 
     * @return value
     */
    public String getLastChangeDate() {
        return lastChangeDate;
    }

    /** 
     * Set the 'LastChangeDate' element value. Информация о дате и времени последнего изменения
     * 
     * @param lastChangeDate
     */
    public void setLastChangeDate(String lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }

    /** 
     * Get the 'ConfirmationStatus' element value. Информация о статусе подтверждения
     * 
     * @return value
     */
    public ConfirmationStatusType getConfirmationStatus() {
        return confirmationStatus;
    }

    /** 
     * Set the 'ConfirmationStatus' element value. Информация о статусе подтверждения
     * 
     * @param confirmationStatus
     */
    public void setConfirmationStatus(ConfirmationStatusType confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }
}
