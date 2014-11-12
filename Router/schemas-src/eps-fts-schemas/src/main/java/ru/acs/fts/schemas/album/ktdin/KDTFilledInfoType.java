
package ru.acs.fts.schemas.album.ktdin;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADCustomsRepresentativeType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADFilledPersonType;

/** 
 * Сведения о заполнении КДТ
 */
public class KDTFilledInfoType
{
    private ESADFilledPersonType filledPerson;
    private CUESADCustomsRepresentativeType customsRepresentative;

    /** 
     * Get the 'FilledPerson' element value. Сведения о лице, заполнившем КДТ
     * 
     * @return value
     */
    public ESADFilledPersonType getFilledPerson() {
        return filledPerson;
    }

    /** 
     * Set the 'FilledPerson' element value. Сведения о лице, заполнившем КДТ
     * 
     * @param filledPerson
     */
    public void setFilledPerson(ESADFilledPersonType filledPerson) {
        this.filledPerson = filledPerson;
    }

    /** 
     * Get the 'CustomsRepresentative' element value. Таможенный представитель
     * 
     * @return value
     */
    public CUESADCustomsRepresentativeType getCustomsRepresentative() {
        return customsRepresentative;
    }

    /** 
     * Set the 'CustomsRepresentative' element value. Таможенный представитель
     * 
     * @param customsRepresentative
     */
    public void setCustomsRepresentative(
            CUESADCustomsRepresentativeType customsRepresentative) {
        this.customsRepresentative = customsRepresentative;
    }
}
