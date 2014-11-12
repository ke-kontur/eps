
package ru.acs.fts.schemas.album.measuringprotocol;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Сведения о лице, присутствующем/проводившем измерения
 */
public class MeasuringPersonType extends PersonSignatureType
{
    private String personSign;

    /** 
     * Get the 'PersonSign' element value. Признак лица: 0 - проводивший измерения; 1 - присутствующий при проведении измерений
     * 
     * @return value
     */
    public String getPersonSign() {
        return personSign;
    }

    /** 
     * Set the 'PersonSign' element value. Признак лица: 0 - проводивший измерения; 1 - присутствующий при проведении измерений
     * 
     * @param personSign
     */
    public void setPersonSign(String personSign) {
        this.personSign = personSign;
    }
}
