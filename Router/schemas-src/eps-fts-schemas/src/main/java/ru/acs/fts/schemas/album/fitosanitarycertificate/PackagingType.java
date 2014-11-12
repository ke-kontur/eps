
package ru.acs.fts.schemas.album.fitosanitarycertificate;

/** 
 * �������� � ���������� ���� � �������� ��������
 */
public class PackagingType
{
    private String placesQiantity;
    private String packingCode;
    private String pakingQuantity;

    /** 
     * Get the 'PlacesQiantity' element value. ���������� ����
     * 
     * @return value
     */
    public String getPlacesQiantity() {
        return placesQiantity;
    }

    /** 
     * Set the 'PlacesQiantity' element value. ���������� ����
     * 
     * @param placesQiantity
     */
    public void setPlacesQiantity(String placesQiantity) {
        this.placesQiantity = placesQiantity;
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

    /** 
     * Get the 'PakingQuantity' element value. ���������� ��������.
     * 
     * @return value
     */
    public String getPakingQuantity() {
        return pakingQuantity;
    }

    /** 
     * Set the 'PakingQuantity' element value. ���������� ��������.
     * 
     * @param pakingQuantity
     */
    public void setPakingQuantity(String pakingQuantity) {
        this.pakingQuantity = pakingQuantity;
    }
}
