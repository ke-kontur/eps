
package ru.acs.fts.schemas.album.packinglist;

/** 
 * ����� ���������� ���� �� ����� ��������  ����
 */
public class PlacesQuantityType
{
    private String placesQuantity;
    private String placesDescription;
    private String packingCode;

    /** 
     * Get the 'PlacesQuantity' element value. ���������� �������� ���� ������ (��� �������� ������ ����������� ���������� ��������� ���������� ������� ����)
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. ���������� �������� ���� ������ (��� �������� ������ ����������� ���������� ��������� ���������� ������� ����)
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'PlacesDescription' element value. �������� ���� �������� ���� (�������, ��������, ������ � �.�.)
     * 
     * @return value
     */
    public String getPlacesDescription() {
        return placesDescription;
    }

    /** 
     * Set the 'PlacesDescription' element value. �������� ���� �������� ���� (�������, ��������, ������ � �.�.)
     * 
     * @param placesDescription
     */
    public void setPlacesDescription(String placesDescription) {
        this.placesDescription = placesDescription;
    }

    /** 
     * Get the 'PackingCode' element value. ��� ���� �������� ������� � ������������ �  ��������������� ����� �����, �������� � ����������� ����������.
     * 
     * @return value
     */
    public String getPackingCode() {
        return packingCode;
    }

    /** 
     * Set the 'PackingCode' element value. ��� ���� �������� ������� � ������������ �  ��������������� ����� �����, �������� � ����������� ����������.
     * 
     * @param packingCode
     */
    public void setPackingCode(String packingCode) {
        this.packingCode = packingCode;
    }
}
