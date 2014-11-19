
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * �������� � �������� � ��������
 */
public class PalleteInformationType
{
    private String palleteQuantity;
    private String palleteDescription;
    private String palleteCode;

    /** 
     * Get the 'PalleteQuantity' element value. ���������� ��������
     * 
     * @return value
     */
    public String getPalleteQuantity() {
        return palleteQuantity;
    }

    /** 
     * Set the 'PalleteQuantity' element value. ���������� ��������
     * 
     * @param palleteQuantity
     */
    public void setPalleteQuantity(String palleteQuantity) {
        this.palleteQuantity = palleteQuantity;
    }

    /** 
     * Get the 'PalleteDescription' element value. �������� ��������
     * 
     * @return value
     */
    public String getPalleteDescription() {
        return palleteDescription;
    }

    /** 
     * Set the 'PalleteDescription' element value. �������� ��������
     * 
     * @param palleteDescription
     */
    public void setPalleteDescription(String palleteDescription) {
        this.palleteDescription = palleteDescription;
    }

    /** 
     * Get the 'PalleteCode' element value. ��� ���� ������� � ������������ � ��������������� ����� �����, �������� � ����������� ���������� 
     * 
     * @return value
     */
    public String getPalleteCode() {
        return palleteCode;
    }

    /** 
     * Set the 'PalleteCode' element value. ��� ���� ������� � ������������ � ��������������� ����� �����, �������� � ����������� ���������� 
     * 
     * @param palleteCode
     */
    public void setPalleteCode(String palleteCode) {
        this.palleteCode = palleteCode;
    }
}
