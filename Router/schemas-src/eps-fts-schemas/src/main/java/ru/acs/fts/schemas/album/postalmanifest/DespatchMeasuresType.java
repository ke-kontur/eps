
package ru.acs.fts.schemas.album.postalmanifest;

/** 
 * ������ � �������������� ��������������� ��������� �����������
 */
public class DespatchMeasuresType
{
    private String quantity;
    private String weight;
    private String factWeight;

    /** 
     * Get the 'Quantity' element value. ���������� 
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ���������� 
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'Weight' element value. ���
     * 
     * @return value
     */
    public String getWeight() {
        return weight;
    }

    /** 
     * Set the 'Weight' element value. ���
     * 
     * @param weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /** 
     * Get the 'FactWeight' element value. ����������� ���
     * 
     * @return value
     */
    public String getFactWeight() {
        return factWeight;
    }

    /** 
     * Set the 'FactWeight' element value. ����������� ���
     * 
     * @param factWeight
     */
    public void setFactWeight(String factWeight) {
        this.factWeight = factWeight;
    }
}
