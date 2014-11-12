
package ru.acs.fts.schemas.album.letterofattorney;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Доверенное лицо
 */
public class EmpoweredPersonType extends PersonBaseType
{
    private IdentityCardType passport;

    /** 
     * Get the 'Passport' element value. Паспортные данные доверенного лица
     * 
     * @return value
     */
    public IdentityCardType getPassport() {
        return passport;
    }

    /** 
     * Set the 'Passport' element value. Паспортные данные доверенного лица
     * 
     * @param passport
     */
    public void setPassport(IdentityCardType passport) {
        this.passport = passport;
    }
}
