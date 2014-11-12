
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * Место погрузки /разгрузки. Код ТО если владельцем склада является ТО /  код ТО, если хранение осуществляется на складе получателя.
 */
public class LoadingPlaseConsigneeType
{
    private String customsOfficeID;

    /** 
     * Get the 'CustomsOfficeID' element value. Код таможенного органа, владельца СВХ/ТС/ код таможенного органа, в регионе деятельности которого находится место  разгрузки товаров. 
     * 
     * @return value
     */
    public String getCustomsOfficeID() {
        return customsOfficeID;
    }

    /** 
     * Set the 'CustomsOfficeID' element value. Код таможенного органа, владельца СВХ/ТС/ код таможенного органа, в регионе деятельности которого находится место  разгрузки товаров. 
     * 
     * @param customsOfficeID
     */
    public void setCustomsOfficeID(String customsOfficeID) {
        this.customsOfficeID = customsOfficeID;
    }
}
