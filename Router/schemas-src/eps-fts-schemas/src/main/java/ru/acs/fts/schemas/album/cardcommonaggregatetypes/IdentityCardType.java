
package ru.acs.fts.schemas.album.cardcommonaggregatetypes;

import org.joda.time.LocalDate;

/** 
 * Документ, удостоверяющий личность
 */
public class IdentityCardType
{
    private String identityCardCode;
    private String identityCardSeries;
    private String identityCardNumber;
    private LocalDate identityCardDate;

    /** 
     * Get the 'IdentityCardCode' element value. Код вида документа, удостоверяющего личность. 
     * 
     * @return value
     */
    public String getIdentityCardCode() {
        return identityCardCode;
    }

    /** 
     * Set the 'IdentityCardCode' element value. Код вида документа, удостоверяющего личность. 
     * 
     * @param identityCardCode
     */
    public void setIdentityCardCode(String identityCardCode) {
        this.identityCardCode = identityCardCode;
    }

    /** 
     * Get the 'IdentityCardSeries' element value. Серия документа, удостоверяющего личность.
     * 
     * @return value
     */
    public String getIdentityCardSeries() {
        return identityCardSeries;
    }

    /** 
     * Set the 'IdentityCardSeries' element value. Серия документа, удостоверяющего личность.
     * 
     * @param identityCardSeries
     */
    public void setIdentityCardSeries(String identityCardSeries) {
        this.identityCardSeries = identityCardSeries;
    }

    /** 
     * Get the 'IdentityCardNumber' element value. Номер документа, удостоверяющего личность
     * 
     * @return value
     */
    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    /** 
     * Set the 'IdentityCardNumber' element value. Номер документа, удостоверяющего личность
     * 
     * @param identityCardNumber
     */
    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    /** 
     * Get the 'IdentityCardDate' element value. Дата выдачи документа, удостоверяющего личность.
     * 
     * @return value
     */
    public LocalDate getIdentityCardDate() {
        return identityCardDate;
    }

    /** 
     * Set the 'IdentityCardDate' element value. Дата выдачи документа, удостоверяющего личность.
     * 
     * @param identityCardDate
     */
    public void setIdentityCardDate(LocalDate identityCardDate) {
        this.identityCardDate = identityCardDate;
    }
}
