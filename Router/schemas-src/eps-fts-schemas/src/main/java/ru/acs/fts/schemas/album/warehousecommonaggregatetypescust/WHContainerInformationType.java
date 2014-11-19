
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * ����������� ��� ��� �������� ����������
 */
public class WHContainerInformationType
{
    private String containerNumber;
    private String grossWeightQuantity;

    /** 
     * Get the 'ContainerNumber' element value. ����� ����������.
     * 
     * @return value
     */
    public String getContainerNumber() {
        return containerNumber;
    }

    /** 
     * Set the 'ContainerNumber' element value. ����� ����������.
     * 
     * @param containerNumber
     */
    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ��� ������ (��) ���� ������� � ����������
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ��� ������ (��) ���� ������� � ����������
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }
}
