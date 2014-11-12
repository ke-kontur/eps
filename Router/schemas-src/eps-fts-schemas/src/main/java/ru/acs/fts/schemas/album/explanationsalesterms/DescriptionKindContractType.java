
package ru.acs.fts.schemas.album.explanationsalesterms;

import org.joda.time.LocalDate;

/** 
 * Описание вида договора
 */
public class DescriptionKindContractType
{
    private LocalDate dateSettlement;
    private LocalDate expiryDate;
    private String applicableLaw;
    private String placeDetention;

    /** 
     * Get the 'DateSettlement' element value. Дата заключения
     * 
     * @return value
     */
    public LocalDate getDateSettlement() {
        return dateSettlement;
    }

    /** 
     * Set the 'DateSettlement' element value. Дата заключения
     * 
     * @param dateSettlement
     */
    public void setDateSettlement(LocalDate dateSettlement) {
        this.dateSettlement = dateSettlement;
    }

    /** 
     * Get the 'ExpiryDate' element value. Дата окончания действия (если определено договором)
     * 
     * @return value
     */
    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    /** 
     * Set the 'ExpiryDate' element value. Дата окончания действия (если определено договором)
     * 
     * @param expiryDate
     */
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    /** 
     * Get the 'ApplicableLaw' element value. Применяемое право
     * 
     * @return value
     */
    public String getApplicableLaw() {
        return applicableLaw;
    }

    /** 
     * Set the 'ApplicableLaw' element value. Применяемое право
     * 
     * @param applicableLaw
     */
    public void setApplicableLaw(String applicableLaw) {
        this.applicableLaw = applicableLaw;
    }

    /** 
     * Get the 'PlaceDetention' element value. Место заключения
     * 
     * @return value
     */
    public String getPlaceDetention() {
        return placeDetention;
    }

    /** 
     * Set the 'PlaceDetention' element value. Место заключения
     * 
     * @param placeDetention
     */
    public void setPlaceDetention(String placeDetention) {
        this.placeDetention = placeDetention;
    }
}
