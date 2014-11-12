
package ru.acs.fts.schemas.album.esadoutp;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADFilledPersonType;

/** 
 * �������� � ���������� �������
 */
public class ESADoutDeclarantPType extends CUOrganizationType
{
    private ESADFilledPersonType ESADFilledPerson;

    /** 
     * Get the 'ESADFilledPerson' element value. �������� � ����, ����������� �����������
     * 
     * @return value
     */
    public ESADFilledPersonType getESADFilledPerson() {
        return ESADFilledPerson;
    }

    /** 
     * Set the 'ESADFilledPerson' element value. �������� � ����, ����������� �����������
     * 
     * @param ESADFilledPerson
     */
    public void setESADFilledPerson(ESADFilledPersonType ESADFilledPerson) {
        this.ESADFilledPerson = ESADFilledPerson;
    }
}
