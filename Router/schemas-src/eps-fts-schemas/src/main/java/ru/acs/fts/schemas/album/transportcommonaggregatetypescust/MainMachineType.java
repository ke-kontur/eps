
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

/** 
 * �������� � ������� ������� �����
 */
public class MainMachineType
{
    private String type;
    private String quantity;
    private String power;

    /** 
     * Get the 'Type' element value. ��� ������
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' element value. ��� ������
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'Quantity' element value. �����
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. �����
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'Power' element value. ����� ��������
     * 
     * @return value
     */
    public String getPower() {
        return power;
    }

    /** 
     * Set the 'Power' element value. ����� ��������
     * 
     * @param power
     */
    public void setPower(String power) {
        this.power = power;
    }
}
