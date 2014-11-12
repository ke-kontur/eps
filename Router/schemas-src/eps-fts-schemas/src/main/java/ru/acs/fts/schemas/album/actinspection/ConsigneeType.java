
package ru.acs.fts.schemas.album.actinspection;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ѕолучатель товаров
 */
public class ConsigneeType extends OrganizationType
{
    private String destinCountry;
    private IdentityCardType physicalPersonIdCard;

    /** 
     * Get the 'DestinCountry' element value. —трана назначени€
     * 
     * @return value
     */
    public String getDestinCountry() {
        return destinCountry;
    }

    /** 
     * Set the 'DestinCountry' element value. —трана назначени€
     * 
     * @param destinCountry
     */
    public void setDestinCountry(String destinCountry) {
        this.destinCountry = destinCountry;
    }

    /** 
     * Get the 'PhysicalPersonIdCard' element value. ƒокумент, удостовер€ющий личность - в случае, если получатель €вл€етс€ физическим лицом
     * 
     * @return value
     */
    public IdentityCardType getPhysicalPersonIdCard() {
        return physicalPersonIdCard;
    }

    /** 
     * Set the 'PhysicalPersonIdCard' element value. ƒокумент, удостовер€ющий личность - в случае, если получатель €вл€етс€ физическим лицом
     * 
     * @param physicalPersonIdCard
     */
    public void setPhysicalPersonIdCard(IdentityCardType physicalPersonIdCard) {
        this.physicalPersonIdCard = physicalPersonIdCard;
    }
}
