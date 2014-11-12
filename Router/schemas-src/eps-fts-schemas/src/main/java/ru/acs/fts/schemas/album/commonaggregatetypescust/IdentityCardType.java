
package ru.acs.fts.schemas.album.commonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Документ, удостоверяющий личность
 */
public class IdentityCardType
{
    private String identityCardCode;
    private String identityCardName;
    private String identityCardSeries;
    private String identityCardNumber;
    private LocalDate identityCardDate;
    private String organizationName;

    /** 
     * Get the 'IdentityCardCode' element value. Код вида документа, удостоверяющего личность. Для РФ
     * 
     * @return value
     */
    public String getIdentityCardCode() {
        return identityCardCode;
    }

    /** 
     * Set the 'IdentityCardCode' element value. Код вида документа, удостоверяющего личность. Для РФ
     * 
     * @param identityCardCode
     */
    public void setIdentityCardCode(String identityCardCode) {
        this.identityCardCode = identityCardCode;
    }

    /** 
     * Get the 'IdentityCardName' element value. Краткое наименование документа, удостоверяющего личность
     * 
     * @return value
     */
    public String getIdentityCardName() {
        return identityCardName;
    }

    /** 
     * Set the 'IdentityCardName' element value. Краткое наименование документа, удостоверяющего личность
     * 
     * @param identityCardName
     */
    public void setIdentityCardName(String identityCardName) {
        this.identityCardName = identityCardName;
    }

    /** 
     * Get the 'IdentityCardSeries' element value. Серия документа, удостоверяющего личность
     * 
     * @return value
     */
    public String getIdentityCardSeries() {
        return identityCardSeries;
    }

    /** 
     * Set the 'IdentityCardSeries' element value. Серия документа, удостоверяющего личность
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
     * Get the 'IdentityCardDate' element value. Дата выдачи документа, удостоверяющего личность
     * 
     * @return value
     */
    public LocalDate getIdentityCardDate() {
        return identityCardDate;
    }

    /** 
     * Set the 'IdentityCardDate' element value. Дата выдачи документа, удостоверяющего личность
     * 
     * @param identityCardDate
     */
    public void setIdentityCardDate(LocalDate identityCardDate) {
        this.identityCardDate = identityCardDate;
    }

    /** 
     * Get the 'OrganizationName' element value. Наименование организации, выдавшей документ
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Наименование организации, выдавшей документ
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}
