
package ru.acs.fts.schemas.album.postalmanifest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Место проведения грузовых и иных операций
 */
public class ReloadPlaceType extends CustomsType
{
    private String reloadPlaceDescription;

    /** 
     * Get the 'ReloadPlaceDescription' element value. Место проведения грузовых и иных операций
     * 
     * @return value
     */
    public String getReloadPlaceDescription() {
        return reloadPlaceDescription;
    }

    /** 
     * Set the 'ReloadPlaceDescription' element value. Место проведения грузовых и иных операций
     * 
     * @param reloadPlaceDescription
     */
    public void setReloadPlaceDescription(String reloadPlaceDescription) {
        this.reloadPlaceDescription = reloadPlaceDescription;
    }
}
