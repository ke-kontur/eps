
package ru.acs.fts.schemas.album.roskomradio;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Параметры владельца
 */
public class OwnerType extends OrganizationBaseType
{
    private String ownerId;
    private String ownerVersionId;

    /** 
     * Get the 'OwnerId' element value. Идентификатор владельца в ЕИС
     * 
     * @return value
     */
    public String getOwnerId() {
        return ownerId;
    }

    /** 
     * Set the 'OwnerId' element value. Идентификатор владельца в ЕИС
     * 
     * @param ownerId
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /** 
     * Get the 'OwnerVersionId' element value. Идентификатор версии владельца в ЕИС
     * 
     * @return value
     */
    public String getOwnerVersionId() {
        return ownerVersionId;
    }

    /** 
     * Set the 'OwnerVersionId' element value. Идентификатор версии владельца в ЕИС
     * 
     * @param ownerVersionId
     */
    public void setOwnerVersionId(String ownerVersionId) {
        this.ownerVersionId = ownerVersionId;
    }
}
