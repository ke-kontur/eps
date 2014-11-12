
package ru.acs.fts.schemas.album.hemicalmeansprotectionplants;

import ru.acs.fts.schemas.album.sqcommonaggregatetypescust.AuthorizedPersonType;

/** 
 * Уполномоченное должностное лицо, подписавшее заключение
 */
public class PersonConclusionType extends AuthorizedPersonType
{
    private String stampNumber;

    /** 
     * Get the 'StampNumber' element value. Номер печати
     * 
     * @return value
     */
    public String getStampNumber() {
        return stampNumber;
    }

    /** 
     * Set the 'StampNumber' element value. Номер печати
     * 
     * @param stampNumber
     */
    public void setStampNumber(String stampNumber) {
        this.stampNumber = stampNumber;
    }
}
