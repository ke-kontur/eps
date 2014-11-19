
package ru.acs.fts.schemas.album.minsportrospechlic;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������������
 */
public class ConfirmationType extends DocumentBaseType
{
    private LocalDate dueDate;
    private String confirmationId;
    private String lastChangeDate;
    private ConfirmationStatusType confirmationStatus;

    /** 
     * Get the 'DueDate' element value. ���� �������� �������������
     * 
     * @return value
     */
    public LocalDate getDueDate() {
        return dueDate;
    }

    /** 
     * Set the 'DueDate' element value. ���� �������� �������������
     * 
     * @param dueDate
     */
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /** 
     * Get the 'ConfirmationId' element value. ������������� �������������
     * 
     * @return value
     */
    public String getConfirmationId() {
        return confirmationId;
    }

    /** 
     * Set the 'ConfirmationId' element value. ������������� �������������
     * 
     * @param confirmationId
     */
    public void setConfirmationId(String confirmationId) {
        this.confirmationId = confirmationId;
    }

    /** 
     * Get the 'LastChangeDate' element value. ���������� � ���� � ������� ���������� ���������
     * 
     * @return value
     */
    public String getLastChangeDate() {
        return lastChangeDate;
    }

    /** 
     * Set the 'LastChangeDate' element value. ���������� � ���� � ������� ���������� ���������
     * 
     * @param lastChangeDate
     */
    public void setLastChangeDate(String lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }

    /** 
     * Get the 'ConfirmationStatus' element value. ���������� � ������� �������������
     * 
     * @return value
     */
    public ConfirmationStatusType getConfirmationStatus() {
        return confirmationStatus;
    }

    /** 
     * Set the 'ConfirmationStatus' element value. ���������� � ������� �������������
     * 
     * @param confirmationStatus
     */
    public void setConfirmationStatus(ConfirmationStatusType confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }
}
