
package ru.acs.fts.schemas.admin.int_dtrequest;

/** 
 * Лицо, запросившее ДТ
 */
public class CustomsPersonType
{
    private String personName;
    private String LNP;

    /** 
     * Get the 'PersonName' element value. ФИО лица, запросившего ДТ
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ФИО лица, запросившего ДТ
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'LNP' element value. ЛНП
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ЛНП
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }
}
