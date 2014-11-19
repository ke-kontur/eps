
package ru.acs.fts.schemas.album.automobileinsurancepolicy;

/** 
 * �������� � ������������ ������������� ��������
 */
public class AutomobileOwnerType
{
    private String name;
    private String naturalPersonIndicator;

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
}
