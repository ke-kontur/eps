
package ru.acs.fts.schemas.album.inventoryin;

import org.joda.time.LocalDate;

/** 
 * Описание запроса, по которому предоставляется документ.
 */
public class RequestDescriptionType
{
    private String requestNumber;
    private LocalDate requestDate;

    /** 
     * Get the 'RequestNumber' element value. Порядковый номер запроса по ДТ о предоставлении дополнительных документов
     * 
     * @return value
     */
    public String getRequestNumber() {
        return requestNumber;
    }

    /** 
     * Set the 'RequestNumber' element value. Порядковый номер запроса по ДТ о предоставлении дополнительных документов
     * 
     * @param requestNumber
     */
    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    /** 
     * Get the 'RequestDate' element value. Дата формирования запроса
     * 
     * @return value
     */
    public LocalDate getRequestDate() {
        return requestDate;
    }

    /** 
     * Set the 'RequestDate' element value. Дата формирования запроса
     * 
     * @param requestDate
     */
    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }
}
