
package ru.acs.fts.schemas.album.ruesadktscommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADFilledPersonType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.CustomsBrokerType;

/** 
 * Сведения об организации и лице, заполнившем КТС.
 */
public class KTSFillType
{
    private LocalDate KTSFilledDate;
    private ESADFilledPersonType KTSFilledPerson;
    private CustomsBrokerType KTSFilledBroker;

    /** 
     * Get the 'KTSFilledDate' element value. Дата составления КТС.
     * 
     * @return value
     */
    public LocalDate getKTSFilledDate() {
        return KTSFilledDate;
    }

    /** 
     * Set the 'KTSFilledDate' element value. Дата составления КТС.
     * 
     * @param KTSFilledDate
     */
    public void setKTSFilledDate(LocalDate KTSFilledDate) {
        this.KTSFilledDate = KTSFilledDate;
    }

    /** 
     * Get the 'KTSFilledPerson' element value. Сведения о лице, заполнившем КТС.
     * 
     * @return value
     */
    public ESADFilledPersonType getKTSFilledPerson() {
        return KTSFilledPerson;
    }

    /** 
     * Set the 'KTSFilledPerson' element value. Сведения о лице, заполнившем КТС.
     * 
     * @param KTSFilledPerson
     */
    public void setKTSFilledPerson(ESADFilledPersonType KTSFilledPerson) {
        this.KTSFilledPerson = KTSFilledPerson;
    }

    /** 
     * Get the 'KTSFilledBroker' element value. Сведения о таможенном представителе (брокере).
     * 
     * @return value
     */
    public CustomsBrokerType getKTSFilledBroker() {
        return KTSFilledBroker;
    }

    /** 
     * Set the 'KTSFilledBroker' element value. Сведения о таможенном представителе (брокере).
     * 
     * @param KTSFilledBroker
     */
    public void setKTSFilledBroker(CustomsBrokerType KTSFilledBroker) {
        this.KTSFilledBroker = KTSFilledBroker;
    }
}
