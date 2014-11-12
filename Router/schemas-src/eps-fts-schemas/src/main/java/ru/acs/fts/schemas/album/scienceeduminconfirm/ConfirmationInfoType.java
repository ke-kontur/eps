
package ru.acs.fts.schemas.album.scienceeduminconfirm;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о подтверждении
 */
public class ConfirmationInfoType extends DocumentBaseType
{
    private String modificationDateTime;
    private String status;
    private LocalDate expirationDate;

    /** 
     * Get the 'ModificationDateTime' element value. Дата и время последнего изменения
     * 
     * @return value
     */
    public String getModificationDateTime() {
        return modificationDateTime;
    }

    /** 
     * Set the 'ModificationDateTime' element value. Дата и время последнего изменения
     * 
     * @param modificationDateTime
     */
    public void setModificationDateTime(String modificationDateTime) {
        this.modificationDateTime = modificationDateTime;
    }

    /** 
     * Get the 'Status' element value. Признак того, что документ в статусе "не подтвержден"
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. Признак того, что документ в статусе "не подтвержден"
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'ExpirationDate' element value. Срок действия
     * 
     * @return value
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /** 
     * Set the 'ExpirationDate' element value. Срок действия
     * 
     * @param expirationDate
     */
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
