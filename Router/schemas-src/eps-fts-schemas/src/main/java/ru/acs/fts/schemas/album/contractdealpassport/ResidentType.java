
package ru.acs.fts.schemas.album.contractdealpassport;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Сведения о резиденте
 */
public class ResidentType extends CUOrganizationType
{
    private String affiliateName;

    /** 
     * Get the 'AffiliateName' element value. Наименование филиала, осуществляющего валютные операции
     * 
     * @return value
     */
    public String getAffiliateName() {
        return affiliateName;
    }

    /** 
     * Set the 'AffiliateName' element value. Наименование филиала, осуществляющего валютные операции
     * 
     * @param affiliateName
     */
    public void setAffiliateName(String affiliateName) {
        this.affiliateName = affiliateName;
    }
}
