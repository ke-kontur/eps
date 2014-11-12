
package ru.acs.fts.schemas.album.inventoryin;

import org.joda.time.LocalDate;

/** 
 * Описание решения о проведении дополнительной проверки, по которому предоставляется документ.
 */
public class AddControlDescriptionType
{
    private String addControlNumber;
    private LocalDate addControlDate;

    /** 
     * Get the 'AddControlNumber' element value. Порядковый номер решения о проведении дополнительной проверки 
     * 
     * @return value
     */
    public String getAddControlNumber() {
        return addControlNumber;
    }

    /** 
     * Set the 'AddControlNumber' element value. Порядковый номер решения о проведении дополнительной проверки 
     * 
     * @param addControlNumber
     */
    public void setAddControlNumber(String addControlNumber) {
        this.addControlNumber = addControlNumber;
    }

    /** 
     * Get the 'AddControlDate' element value. Дата решения о проведении дополнительной проверки
     * 
     * @return value
     */
    public LocalDate getAddControlDate() {
        return addControlDate;
    }

    /** 
     * Set the 'AddControlDate' element value. Дата решения о проведении дополнительной проверки
     * 
     * @param addControlDate
     */
    public void setAddControlDate(LocalDate addControlDate) {
        this.addControlDate = addControlDate;
    }
}
