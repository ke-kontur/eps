
package ru.acs.fts.schemas.album.legalentityinfo;

import org.joda.time.LocalDate;

/** 
 * Сведения о приостановлении действия лицензии
 */
public class SuspensionType
{
    private LocalDate endDate;
    private RegOrganType regOrgan;

    /** 
     * Get the 'EndDate' element value. Дата приостановления
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата приостановления
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'RegOrgan' element value. Наименование лицензирующего органа, приостановившего действие лицензии
     * 
     * @return value
     */
    public RegOrganType getRegOrgan() {
        return regOrgan;
    }

    /** 
     * Set the 'RegOrgan' element value. Наименование лицензирующего органа, приостановившего действие лицензии
     * 
     * @param regOrgan
     */
    public void setRegOrgan(RegOrganType regOrgan) {
        this.regOrgan = regOrgan;
    }
}
