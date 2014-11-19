
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportGoodsBaseType;

/** 
 * �������� ����� (�������) - ��������/�������� � �����
 */
public class PortGoodsType extends TransportGoodsBaseType
{
    private String placesQuantity;
    private String grossWeightQuantity;
    private String dimensions;

    /** 
     * Get the 'PlacesQuantity' element value. ����� ���������� �������� ���� ������
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. ����� ���������� �������� ���� ������
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ��� ������, ������ (��)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ��� ������, ������ (��)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'Dimensions' element value. ������� �����
     * 
     * @return value
     */
    public String getDimensions() {
        return dimensions;
    }

    /** 
     * Set the 'Dimensions' element value. ������� �����
     * 
     * @param dimensions
     */
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
