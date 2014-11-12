
package ru.acs.fts.schemas.album.esadoutp;

import org.joda.time.LocalDate;

/** 
 * Удостоверяющий
 */
public class ConfirmingOrganizationType
{
    private LocalDate date;
    private String organizationName;
    private String organizationSign;
    private PersonInfoType senderName;

    /** 
     * Get the 'Date' element value. Дата отправления информации
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата отправления информации
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'OrganizationName' element value. Наименование организации, осуществляющей отправку информации
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Наименование организации, осуществляющей отправку информации
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'OrganizationSign' element value. Удостоверяющий: 0 - с Турецкой стороны; 1 - от экспортера товаров
     * 
     * @return value
     */
    public String getOrganizationSign() {
        return organizationSign;
    }

    /** 
     * Set the 'OrganizationSign' element value. Удостоверяющий: 0 - с Турецкой стороны; 1 - от экспортера товаров
     * 
     * @param organizationSign
     */
    public void setOrganizationSign(String organizationSign) {
        this.organizationSign = organizationSign;
    }

    /** 
     * Get the 'SenderName' element value. ФИО лица, осуществившего отправку
     * 
     * @return value
     */
    public PersonInfoType getSenderName() {
        return senderName;
    }

    /** 
     * Set the 'SenderName' element value. ФИО лица, осуществившего отправку
     * 
     * @param senderName
     */
    public void setSenderName(PersonInfoType senderName) {
        this.senderName = senderName;
    }
}
