
package ru.acs.fts.schemas.album.notifaddcontrol;

import org.joda.time.LocalDate;

/** 
 * Сведения о подписи
 */
public class SignatureInfType
{
    private String personName;
    private LocalDate date;

    /** 
     * Get the 'PersonName' element value. Ф.И.О. представителя лица, декларирующего товары, получившего решение/ должностного лица таможенного органа, направившего решение
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. Ф.И.О. представителя лица, декларирующего товары, получившего решение/ должностного лица таможенного органа, направившего решение
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'Date' element value. Дата получения решения/дата направления решения
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата получения решения/дата направления решения
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
