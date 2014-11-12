
package ru.acs.fts.schemas.album.declchangedecision;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Сведения о направлении/получении решения
 */
public class SignatureInfoType
{
    private String personName;
    private LocalDate date;
    private AddressType sendAddress;

    /** 
     * Get the 'PersonName' element value. Ф.И.О. представителя лица, декларирующего товары, получившего решение/должностного лица таможенного органа, направившего решение
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. Ф.И.О. представителя лица, декларирующего товары, получившего решение/должностного лица таможенного органа, направившего решение
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

    /** 
     * Get the 'SendAddress' element value. Адрес направления решения
     * 
     * @return value
     */
    public AddressType getSendAddress() {
        return sendAddress;
    }

    /** 
     * Set the 'SendAddress' element value. Адрес направления решения
     * 
     * @param sendAddress
     */
    public void setSendAddress(AddressType sendAddress) {
        this.sendAddress = sendAddress;
    }
}
