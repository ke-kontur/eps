
package ru.acs.fts.schemas.album.cardcommonaggregatetypes;

/** 
 * Должностное лицо таможенного органа
 */
public class CustomsPersonType
{
    private String personName;
    private String LNP;

    /** 
     * Get the 'PersonName' element value. ФИО должностного лица таможенного органа
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ФИО должностного лица таможенного органа
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'LNP' element value. ЛНП должностного лица таможенного органа
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ЛНП должностного лица таможенного органа
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }
}
