
package ru.acs.fts.schemas.album.veterinarycertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ������������� ���������
 */
public class ManufacturerType extends OrganizationType
{
    private String ownersManufacturer;

    /** 
     * Get the 'OwnersManufacturer' element value. �.�.�. ��������� ����������� ���������
     * 
     * @return value
     */
    public String getOwnersManufacturer() {
        return ownersManufacturer;
    }

    /** 
     * Set the 'OwnersManufacturer' element value. �.�.�. ��������� ����������� ���������
     * 
     * @param ownersManufacturer
     */
    public void setOwnersManufacturer(String ownersManufacturer) {
        this.ownersManufacturer = ownersManufacturer;
    }
}
