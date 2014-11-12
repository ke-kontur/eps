
package ru.acs.fts.schemas.album.liquidationactin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Лицо, присутствующее при уничтожении
 */
public class ParticipatedPersonType extends PersonSignatureType
{
    private String personSign;

    /** 
     * Get the 'PersonSign' element value. Признак лица: 0 - от уполномоченного таможенного органа; 1 - от заявителя (резидента ОЭЗ/декларанта/таможенного представителя); 2 - от организации, осуществляющей уничтожение
     * 
     * @return value
     */
    public String getPersonSign() {
        return personSign;
    }

    /** 
     * Set the 'PersonSign' element value. Признак лица: 0 - от уполномоченного таможенного органа; 1 - от заявителя (резидента ОЭЗ/декларанта/таможенного представителя); 2 - от организации, осуществляющей уничтожение
     * 
     * @param personSign
     */
    public void setPersonSign(String personSign) {
        this.personSign = personSign;
    }
}
