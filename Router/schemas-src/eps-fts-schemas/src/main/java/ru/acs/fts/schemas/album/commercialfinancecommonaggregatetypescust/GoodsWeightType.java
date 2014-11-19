
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

/** 
 * ��� �����,������ ������ � ��.
 */
public class GoodsWeightType
{
    private String netWeightQuantity;
    private String grossWeightQuantity;

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
}
