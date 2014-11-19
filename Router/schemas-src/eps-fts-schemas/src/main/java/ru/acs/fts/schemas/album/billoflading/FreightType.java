
package ru.acs.fts.schemas.album.billoflading;

/** 
 * ���������� � ��������, ������������� ����������� 
 */
public class FreightType
{
    private String frDescription;
    private String freightAmount;

    /** 
     * Get the 'FrDescription' element value. ��������, ��� ����� ������ ���� ������� �������� ��������, ���������� � ������� ��� � ������ ���������, ���� ��������, ��� ����� ��������� �������
     * 
     * @return value
     */
    public String getFrDescription() {
        return frDescription;
    }

    /** 
     * Set the 'FrDescription' element value. ��������, ��� ����� ������ ���� ������� �������� ��������, ���������� � ������� ��� � ������ ���������, ���� ��������, ��� ����� ��������� �������
     * 
     * @param frDescription
     */
    public void setFrDescription(String frDescription) {
        this.frDescription = frDescription;
    }

    /** 
     * Get the 'FreightAmount' element value. ����� ������ ��� ������ ������������� ����������� ��������
     * 
     * @return value
     */
    public String getFreightAmount() {
        return freightAmount;
    }

    /** 
     * Set the 'FreightAmount' element value. ����� ������ ��� ������ ������������� ����������� ��������
     * 
     * @param freightAmount
     */
    public void setFreightAmount(String freightAmount) {
        this.freightAmount = freightAmount;
    }
}
