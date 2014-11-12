
package ru.acs.fts.schemas.album.mistakeletter;

import org.joda.time.LocalDate;

/** 
 * Сведения о письме
 */
public class LetterDetailsType
{
    private String letterName;
    private String letterNumber;
    private LocalDate letterDate;
    private String letterOrderNumber;

    /** 
     * Get the 'LetterName' element value. Наименование письма (Письмо, Уведомление о выявленных ошибках и т.п.)
     * 
     * @return value
     */
    public String getLetterName() {
        return letterName;
    }

    /** 
     * Set the 'LetterName' element value. Наименование письма (Письмо, Уведомление о выявленных ошибках и т.п.)
     * 
     * @param letterName
     */
    public void setLetterName(String letterName) {
        this.letterName = letterName;
    }

    /** 
     * Get the 'LetterNumber' element value. Номер письма 
     * 
     * @return value
     */
    public String getLetterNumber() {
        return letterNumber;
    }

    /** 
     * Set the 'LetterNumber' element value. Номер письма 
     * 
     * @param letterNumber
     */
    public void setLetterNumber(String letterNumber) {
        this.letterNumber = letterNumber;
    }

    /** 
     * Get the 'LetterDate' element value. Дата письма 
     * 
     * @return value
     */
    public LocalDate getLetterDate() {
        return letterDate;
    }

    /** 
     * Set the 'LetterDate' element value. Дата письма 
     * 
     * @param letterDate
     */
    public void setLetterDate(LocalDate letterDate) {
        this.letterDate = letterDate;
    }

    /** 
     * Get the 'LetterOrderNumber' element value. Порядковый номер письма (для первого начиная с единицы), составленного в отношении товаров указанного отчета о принятии, начиная с подачи отчета
     * 
     * @return value
     */
    public String getLetterOrderNumber() {
        return letterOrderNumber;
    }

    /** 
     * Set the 'LetterOrderNumber' element value. Порядковый номер письма (для первого начиная с единицы), составленного в отношении товаров указанного отчета о принятии, начиная с подачи отчета
     * 
     * @param letterOrderNumber
     */
    public void setLetterOrderNumber(String letterOrderNumber) {
        this.letterOrderNumber = letterOrderNumber;
    }
}
