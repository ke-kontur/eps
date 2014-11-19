
package ru.acs.fts.schemas.album.rznmedizd;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Регистрация
 */
public class RegistrationType extends DocumentBaseType
{
    private LocalDate expirationDate;

    /** 
     * Get the 'ExpirationDate' element value. Срок действия до
     * 
     * @return value
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /** 
     * Set the 'ExpirationDate' element value. Срок действия до
     * 
     * @param expirationDate
     */
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
