
package ru.acs.fts.schemas.album.notiffinishrejectoperations;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения о декларанте/ином лице, обладающем полномочиями в отношении товаров и (или) транспортных средств, и их представителей.
 */
public class DeclarantType extends OrganizationBaseType
{
    private OrganizationBaseType representative;

    /** 
     * Get the 'Representative' element value. Представитель
     * 
     * @return value
     */
    public OrganizationBaseType getRepresentative() {
        return representative;
    }

    /** 
     * Set the 'Representative' element value. Представитель
     * 
     * @param representative
     */
    public void setRepresentative(OrganizationBaseType representative) {
        this.representative = representative;
    }
}
