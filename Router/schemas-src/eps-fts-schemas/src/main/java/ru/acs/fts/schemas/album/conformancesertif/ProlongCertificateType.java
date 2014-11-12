
package ru.acs.fts.schemas.album.conformancesertif;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Сведения о продлении сертификата
 */
public class ProlongCertificateType
{
    private LocalDate endDate;
    private PersonBaseType prolongSign;

    /** 
     * Get the 'EndDate' element value. Дата окончания действия сертификата
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата окончания действия сертификата
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'ProlongSign' element value. Сведения о подписи при продлении срока действия сертификата
     * 
     * @return value
     */
    public PersonBaseType getProlongSign() {
        return prolongSign;
    }

    /** 
     * Set the 'ProlongSign' element value. Сведения о подписи при продлении срока действия сертификата
     * 
     * @param prolongSign
     */
    public void setProlongSign(PersonBaseType prolongSign) {
        this.prolongSign = prolongSign;
    }
}
