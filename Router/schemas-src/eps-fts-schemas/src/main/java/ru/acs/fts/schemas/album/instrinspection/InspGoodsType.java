
package ru.acs.fts.schemas.album.instrinspection;

/** 
 * �������� � ������
 */
public class InspGoodsType
{
    private String pakageQuantity;
    private String grossWeightQuantity;
    private String netWeightQuantity;

    /** 
     * Get the 'PakageQuantity' element value. ���������� �������� ����
     * 
     * @return value
     */
    public String getPakageQuantity() {
        return pakageQuantity;
    }

    /** 
     * Set the 'PakageQuantity' element value. ���������� �������� ����
     * 
     * @param pakageQuantity
     */
    public void setPakageQuantity(String pakageQuantity) {
        this.pakageQuantity = pakageQuantity;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ��� ������ ������ (��)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ��� ������ ������ (��)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. ��� ������ ����� (��)
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. ��� ������ ����� (��)
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }
}
