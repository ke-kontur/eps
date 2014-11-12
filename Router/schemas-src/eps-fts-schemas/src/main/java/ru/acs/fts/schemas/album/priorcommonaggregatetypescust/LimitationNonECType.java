
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

/** 
 * Ограничение действия гарантии вне ЕС
 */
public class LimitationNonECType
{
    private String notValid4Country;

    /** 
     * Get the 'NotValid4Country' element value. Код страны, в которой действует ограничение.
     * 
     * @return value
     */
    public String getNotValid4Country() {
        return notValid4Country;
    }

    /** 
     * Set the 'NotValid4Country' element value. Код страны, в которой действует ограничение.
     * 
     * @param notValid4Country
     */
    public void setNotValid4Country(String notValid4Country) {
        this.notValid4Country = notValid4Country;
    }
}
