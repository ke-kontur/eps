
package ru.acs.fts.schemas.album.quarantinecertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * ����� ���������� ������������ ��������
 */
public class AddressSearchType extends AddressType
{
    private String phone;

    /** 
     * Get the 'Phone' element value. �������
     * 
     * @return value
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * Set the 'Phone' element value. �������
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
