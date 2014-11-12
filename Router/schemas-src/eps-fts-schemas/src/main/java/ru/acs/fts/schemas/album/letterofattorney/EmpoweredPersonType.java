
package ru.acs.fts.schemas.album.letterofattorney;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ���������� ����
 */
public class EmpoweredPersonType extends PersonBaseType
{
    private IdentityCardType passport;

    /** 
     * Get the 'Passport' element value. ���������� ������ ����������� ����
     * 
     * @return value
     */
    public IdentityCardType getPassport() {
        return passport;
    }

    /** 
     * Set the 'Passport' element value. ���������� ������ ����������� ����
     * 
     * @param passport
     */
    public void setPassport(IdentityCardType passport) {
        this.passport = passport;
    }
}
