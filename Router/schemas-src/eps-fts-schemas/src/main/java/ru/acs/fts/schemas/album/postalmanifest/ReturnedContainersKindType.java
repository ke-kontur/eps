
package ru.acs.fts.schemas.album.postalmanifest;

/** 
 * Сведения о типе возвращаемых емкостей
 */
public class ReturnedContainersKindType
{
    private String priorityAviaKind;
    private String unpriorityLandKind;
    private String parcelKind;
    private String EMSKind;

    /** 
     * Get the 'PriorityAviaKind' element value. Признак приоритетных/авиа возвращаемых емкостей
     * 
     * @return value
     */
    public String getPriorityAviaKind() {
        return priorityAviaKind;
    }

    /** 
     * Set the 'PriorityAviaKind' element value. Признак приоритетных/авиа возвращаемых емкостей
     * 
     * @param priorityAviaKind
     */
    public void setPriorityAviaKind(String priorityAviaKind) {
        this.priorityAviaKind = priorityAviaKind;
    }

    /** 
     * Get the 'UnpriorityLandKind' element value. Признак неприоритетных/наземных возвращаемых емкостей
     * 
     * @return value
     */
    public String getUnpriorityLandKind() {
        return unpriorityLandKind;
    }

    /** 
     * Set the 'UnpriorityLandKind' element value. Признак неприоритетных/наземных возвращаемых емкостей
     * 
     * @param unpriorityLandKind
     */
    public void setUnpriorityLandKind(String unpriorityLandKind) {
        this.unpriorityLandKind = unpriorityLandKind;
    }

    /** 
     * Get the 'ParcelKind' element value. Признак возвращаемых емкостей, относящихся к посылкам
     * 
     * @return value
     */
    public String getParcelKind() {
        return parcelKind;
    }

    /** 
     * Set the 'ParcelKind' element value. Признак возвращаемых емкостей, относящихся к посылкам
     * 
     * @param parcelKind
     */
    public void setParcelKind(String parcelKind) {
        this.parcelKind = parcelKind;
    }

    /** 
     * Get the 'EMSKind' element value. Признак возвращаемых емкостей, относящихся к EMS
     * 
     * @return value
     */
    public String getEMSKind() {
        return EMSKind;
    }

    /** 
     * Set the 'EMSKind' element value. Признак возвращаемых емкостей, относящихся к EMS
     * 
     * @param EMSKind
     */
    public void setEMSKind(String EMSKind) {
        this.EMSKind = EMSKind;
    }
}
