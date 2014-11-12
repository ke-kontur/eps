
package ru.acs.fts.schemas.album.sertifaform;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * —ведени€ об удостоверении сертификата
 */
public class AuthenticationType extends DocumentBaseType
{
    private String agency;
    private String place;
    private PersonSignatureType authSign;

    /** 
     * Get the 'Agency' element value. Ќаименование органа, уполномоченного в соответствии с национальным законодательством удостовер€ть происхождение товаров
     * 
     * @return value
     */
    public String getAgency() {
        return agency;
    }

    /** 
     * Set the 'Agency' element value. Ќаименование органа, уполномоченного в соответствии с национальным законодательством удостовер€ть происхождение товаров
     * 
     * @param agency
     */
    public void setAgency(String agency) {
        this.agency = agency;
    }

    /** 
     * Get the 'Place' element value. ћесто выдачи.
     * 
     * @return value
     */
    public String getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. ћесто выдачи.
     * 
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /** 
     * Get the 'AuthSign' element value. ѕодпись должностного лица организации, удостовер€ющей происхождение товаров
     * 
     * @return value
     */
    public PersonSignatureType getAuthSign() {
        return authSign;
    }

    /** 
     * Set the 'AuthSign' element value. ѕодпись должностного лица организации, удостовер€ющей происхождение товаров
     * 
     * @param authSign
     */
    public void setAuthSign(PersonSignatureType authSign) {
        this.authSign = authSign;
    }
}
