
package ru.acs.fts.schemas.album.packinglist;

/** 
 * ���������� ���� ������ �� ����� ��������  ����
 */
public class PlacesGoodsQuantityType extends PlacesQuantityType
{
    private String placesPartQuantity;

    /** 
     * Get the 'PlacesPartQuantity' element value. ���������� �������� ����, �������� ������� �������
     * 
     * @return value
     */
    public String getPlacesPartQuantity() {
        return placesPartQuantity;
    }

    /** 
     * Set the 'PlacesPartQuantity' element value. ���������� �������� ����, �������� ������� �������
     * 
     * @param placesPartQuantity
     */
    public void setPlacesPartQuantity(String placesPartQuantity) {
        this.placesPartQuantity = placesPartQuantity;
    }
}
