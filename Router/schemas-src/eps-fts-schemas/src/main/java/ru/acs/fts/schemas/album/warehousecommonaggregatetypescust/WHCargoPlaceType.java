
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * ����������� ��� ��� �������� �������� ���� ������
 */
public class WHCargoPlaceType
{
    private String placeNumber;
    private String packageCode;
    private String placeDescription;

    /** 
     * Get the 'PlaceNumber' element value. ���������� �������� ����
     * 
     * @return value
     */
    public String getPlaceNumber() {
        return placeNumber;
    }

    /** 
     * Set the 'PlaceNumber' element value. ���������� �������� ����
     * 
     * @param placeNumber
     */
    public void setPlaceNumber(String placeNumber) {
        this.placeNumber = placeNumber;
    }

    /** 
     * Get the 'PackageCode' element value. ��� ���� �������� (�����)
     * 
     * @return value
     */
    public String getPackageCode() {
        return packageCode;
    }

    /** 
     * Set the 'PackageCode' element value. ��� ���� �������� (�����)
     * 
     * @param packageCode
     */
    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    /** 
     * Get the 'PlaceDescription' element value. ���  ��������  ���� - ��������
     * 
     * @return value
     */
    public String getPlaceDescription() {
        return placeDescription;
    }

    /** 
     * Set the 'PlaceDescription' element value. ���  ��������  ���� - ��������
     * 
     * @param placeDescription
     */
    public void setPlaceDescription(String placeDescription) {
        this.placeDescription = placeDescription;
    }
}
