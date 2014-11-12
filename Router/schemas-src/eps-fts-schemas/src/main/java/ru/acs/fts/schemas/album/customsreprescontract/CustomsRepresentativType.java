
package ru.acs.fts.schemas.album.customsreprescontract;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Информация о таможенном представителе
 */
public class CustomsRepresentativType extends CUOrganizationType
{
    private DocumentBaseType customsRepresCertificate;

    /** 
     * Get the 'CustomsRepresCertificate' element value. Свидетельство о включении в реестр таможенных представителей
     * 
     * @return value
     */
    public DocumentBaseType getCustomsRepresCertificate() {
        return customsRepresCertificate;
    }

    /** 
     * Set the 'CustomsRepresCertificate' element value. Свидетельство о включении в реестр таможенных представителей
     * 
     * @param customsRepresCertificate
     */
    public void setCustomsRepresCertificate(
            DocumentBaseType customsRepresCertificate) {
        this.customsRepresCertificate = customsRepresCertificate;
    }
}
