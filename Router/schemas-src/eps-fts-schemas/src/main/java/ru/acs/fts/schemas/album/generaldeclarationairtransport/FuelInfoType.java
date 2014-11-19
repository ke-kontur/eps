
package ru.acs.fts.schemas.album.generaldeclarationairtransport;

/** 
 * ���������� � �������
 */
public class FuelInfoType
{
    private String fuelQuantity;
    private String fuelQualifierName;
    private String maxFuelQuantity;

    /** 
     * Get the 'FuelQuantity' element value. ���������� �������
     * 
     * @return value
     */
    public String getFuelQuantity() {
        return fuelQuantity;
    }

    /** 
     * Set the 'FuelQuantity' element value. ���������� �������
     * 
     * @param fuelQuantity
     */
    public void setFuelQuantity(String fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    /** 
     * Get the 'FuelQualifierName' element value. ������������ ������� ��������� �������
     * 
     * @return value
     */
    public String getFuelQualifierName() {
        return fuelQualifierName;
    }

    /** 
     * Set the 'FuelQualifierName' element value. ������������ ������� ��������� �������
     * 
     * @param fuelQualifierName
     */
    public void setFuelQualifierName(String fuelQualifierName) {
        this.fuelQualifierName = fuelQualifierName;
    }

    /** 
     * Get the 'MaxFuelQuantity' element value. ������������ ����������� �������
     * 
     * @return value
     */
    public String getMaxFuelQuantity() {
        return maxFuelQuantity;
    }

    /** 
     * Set the 'MaxFuelQuantity' element value. ������������ ����������� �������
     * 
     * @param maxFuelQuantity
     */
    public void setMaxFuelQuantity(String maxFuelQuantity) {
        this.maxFuelQuantity = maxFuelQuantity;
    }
}
