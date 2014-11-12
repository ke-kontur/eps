
package ru.acs.fts.schemas.album.roskomradio;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ��������� ���������
 */
public class OwnerType extends OrganizationBaseType
{
    private String ownerId;
    private String ownerVersionId;

    /** 
     * Get the 'OwnerId' element value. ������������� ��������� � ���
     * 
     * @return value
     */
    public String getOwnerId() {
        return ownerId;
    }

    /** 
     * Set the 'OwnerId' element value. ������������� ��������� � ���
     * 
     * @param ownerId
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /** 
     * Get the 'OwnerVersionId' element value. ������������� ������ ��������� � ���
     * 
     * @return value
     */
    public String getOwnerVersionId() {
        return ownerVersionId;
    }

    /** 
     * Set the 'OwnerVersionId' element value. ������������� ������ ��������� � ���
     * 
     * @param ownerVersionId
     */
    public void setOwnerVersionId(String ownerVersionId) {
        this.ownerVersionId = ownerVersionId;
    }
}
