
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * ����������� ��� ��� ������ �����������
 */
public class WHAddressType extends AddressType
{
    private String addressLine;

    /** 
     * Get the 'AddressLine' element value. ���������� �� ������ ����������� � ���� ����� ������
     * 
     * @return value
     */
    public String getAddressLine() {
        return addressLine;
    }

    /** 
     * Set the 'AddressLine' element value. ���������� �� ������ ����������� � ���� ����� ������
     * 
     * @param addressLine
     */
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }
}
