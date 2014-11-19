
package ru.acs.fts.schemas.album.liquidationact;

/** 
 * �������� �� ��������
 */
public class PackingInformationType
{
    private String packingCode;
    private String packingDescription;

    /** 
     * Get the 'PackingCode' element value. ��� ���� �������� ������� � ������������ �  ��������������� ����� �����, �������� � ����������� ����������
     * 
     * @return value
     */
    public String getPackingCode() {
        return packingCode;
    }

    /** 
     * Set the 'PackingCode' element value. ��� ���� �������� ������� � ������������ �  ��������������� ����� �����, �������� � ����������� ����������
     * 
     * @param packingCode
     */
    public void setPackingCode(String packingCode) {
        this.packingCode = packingCode;
    }

    /** 
     * Get the 'PackingDescription' element value. ������������ �������� ������� � ������������ �  ��������������� ����� �����, �������� � ����������� ����������
     * 
     * @return value
     */
    public String getPackingDescription() {
        return packingDescription;
    }

    /** 
     * Set the 'PackingDescription' element value. ������������ �������� ������� � ������������ �  ��������������� ����� �����, �������� � ����������� ����������
     * 
     * @param packingDescription
     */
    public void setPackingDescription(String packingDescription) {
        this.packingDescription = packingDescription;
    }
}
