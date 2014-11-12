
package ru.acs.fts.schemas.album.rznmedizd;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �����������
 */
public class RegistrationType extends DocumentBaseType
{
    private LocalDate expirationDate;

    /** 
     * Get the 'ExpirationDate' element value. ���� �������� ��
     * 
     * @return value
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /** 
     * Set the 'ExpirationDate' element value. ���� �������� ��
     * 
     * @param expirationDate
     */
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
