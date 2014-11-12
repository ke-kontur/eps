
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

/** 
 * �������� �������� ����
 */
public class GoodsPlaceType
{
    private String placeKind;
    private String placesQuantity;
    private String placeWeightQuantity;

    /** 
     * Get the 'PlaceKind' element value. ��� ���� ��������� ����� �� ����������� ���
     * 
     * @return value
     */
    public String getPlaceKind() {
        return placeKind;
    }

    /** 
     * Set the 'PlaceKind' element value. ��� ���� ��������� ����� �� ����������� ���
     * 
     * @param placeKind
     */
    public void setPlaceKind(String placeKind) {
        this.placeKind = placeKind;
    }

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
     * Get the 'PlaceWeightQuantity' element value. ��� ����� (��)
     * 
     * @return value
     */
    public String getPlaceWeightQuantity() {
        return placeWeightQuantity;
    }

    /** 
     * Set the 'PlaceWeightQuantity' element value. ��� ����� (��)
     * 
     * @param placeWeightQuantity
     */
    public void setPlaceWeightQuantity(String placeWeightQuantity) {
        this.placeWeightQuantity = placeWeightQuantity;
    }
}
