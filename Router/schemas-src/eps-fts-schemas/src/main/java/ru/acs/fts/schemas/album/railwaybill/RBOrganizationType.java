
package ru.acs.fts.schemas.album.railwaybill;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Сведения о грузополучателе/грузоотправителе 
 */
public class RBOrganizationType extends OrganizationType
{
    private String RBCode;

    /** 
     * Get the 'RBCode' element value. Код грузополучателя/грузоотправителя
     * 
     * @return value
     */
    public String getRBCode() {
        return RBCode;
    }

    /** 
     * Set the 'RBCode' element value. Код грузополучателя/грузоотправителя
     * 
     * @param RBCode
     */
    public void setRBCode(String RBCode) {
        this.RBCode = RBCode;
    }
}
