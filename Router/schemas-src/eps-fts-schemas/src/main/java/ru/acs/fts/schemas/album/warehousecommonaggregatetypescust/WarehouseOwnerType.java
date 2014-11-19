
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ����������� ��� ��� �������� ����������� - ��������� ����� ��������
 */
public class WarehouseOwnerType extends OrganizationBaseType
{
    private WHAddressType address;
    private WarehouseCertificateType warehouseLicense;
    private PersonBaseType warehousePerson;

    /** 
     * Get the 'Address' element value. ����� ����� ��������
     * 
     * @return value
     */
    public WHAddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� ����� ��������
     * 
     * @param address
     */
    public void setAddress(WHAddressType address) {
        this.address = address;
    }

    /** 
     * Get the 'WarehouseLicense' element value. ��������, �� ��������� �������� ��������� ��������� ��������
     * 
     * @return value
     */
    public WarehouseCertificateType getWarehouseLicense() {
        return warehouseLicense;
    }

    /** 
     * Set the 'WarehouseLicense' element value. ��������, �� ��������� �������� ��������� ��������� ��������
     * 
     * @param warehouseLicense
     */
    public void setWarehouseLicense(WarehouseCertificateType warehouseLicense) {
        this.warehouseLicense = warehouseLicense;
    }

    /** 
     * Get the 'WarehousePerson' element value. ������������� ���
     * 
     * @return value
     */
    public PersonBaseType getWarehousePerson() {
        return warehousePerson;
    }

    /** 
     * Set the 'WarehousePerson' element value. ������������� ���
     * 
     * @param warehousePerson
     */
    public void setWarehousePerson(PersonBaseType warehousePerson) {
        this.warehousePerson = warehousePerson;
    }
}
