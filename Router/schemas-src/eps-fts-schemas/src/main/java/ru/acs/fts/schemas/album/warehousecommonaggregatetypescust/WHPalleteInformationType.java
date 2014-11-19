
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * ����������� ��� ��� �������� ������ � ��������, �� ������� ��������� �����
 */
public class WHPalleteInformationType
{
    private String palleteQuantity;
    private String palleteDescription;

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
     * Get the 'PalleteDescription' element value. �������� ��������.
     * 
     * @return value
     */
    public String getPalleteDescription() {
        return palleteDescription;
    }

    /** 
     * Set the 'PalleteDescription' element value. �������� ��������.
     * 
     * @param palleteDescription
     */
    public void setPalleteDescription(String palleteDescription) {
        this.palleteDescription = palleteDescription;
    }
}
