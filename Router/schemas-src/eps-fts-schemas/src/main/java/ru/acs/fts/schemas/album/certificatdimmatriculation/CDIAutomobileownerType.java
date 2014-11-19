
package ru.acs.fts.schemas.album.certificatdimmatriculation;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * �������� � ������������ ������������� ��������
 */
public class CDIAutomobileownerType
{
    private String name;
    private String naturalPersonIndicator;
    private AddressType postalAdress;

    /** 
     * Get the 'Name' element value. ��� ����������� ����/������������ �����������
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ��� ����������� ����/������������ �����������
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'NaturalPersonIndicator' element value. ���������, ����������� � ������, ���� ������������ - ���������� ����
     * 
     * @return value
     */
    public String getNaturalPersonIndicator() {
        return naturalPersonIndicator;
    }

    /** 
     * Set the 'NaturalPersonIndicator' element value. ���������, ����������� � ������, ���� ������������ - ���������� ����
     * 
     * @param naturalPersonIndicator
     */
    public void setNaturalPersonIndicator(String naturalPersonIndicator) {
        this.naturalPersonIndicator = naturalPersonIndicator;
    }

    /** 
     * Get the 'PostalAdress' element value. ����� ��������� ��
     * 
     * @return value
     */
    public AddressType getPostalAdress() {
        return postalAdress;
    }

    /** 
     * Set the 'PostalAdress' element value. ����� ��������� ��
     * 
     * @param postalAdress
     */
    public void setPostalAdress(AddressType postalAdress) {
        this.postalAdress = postalAdress;
    }
}
