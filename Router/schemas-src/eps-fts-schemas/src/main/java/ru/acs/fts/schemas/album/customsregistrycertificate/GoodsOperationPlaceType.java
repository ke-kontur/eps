
package ru.acs.fts.schemas.album.customsregistrycertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * �������������� ��������������� ���������, �������� ��������, ���� ����������
 */
public class GoodsOperationPlaceType
{
    private String placeSign;
    private String placeDescription;
    private String placeVolume;
    private String placeSquare;
    private AddressType address;

    /** 
     * Get the 'PlaceSign' element value. ������� �����: 1 - �������� ��� (���); 2 - ����� (���); 3 - �������� ��������; 4 - ���������
     * 
     * @return value
     */
    public String getPlaceSign() {
        return placeSign;
    }

    /** 
     * Set the 'PlaceSign' element value. ������� �����: 1 - �������� ��� (���); 2 - ����� (���); 3 - �������� ��������; 4 - ���������
     * 
     * @param placeSign
     */
    public void setPlaceSign(String placeSign) {
        this.placeSign = placeSign;
    }

    /** 
     * Get the 'PlaceDescription' element value. �������� �����
     * 
     * @return value
     */
    public String getPlaceDescription() {
        return placeDescription;
    }

    /** 
     * Set the 'PlaceDescription' element value. �������� �����
     * 
     * @param placeDescription
     */
    public void setPlaceDescription(String placeDescription) {
        this.placeDescription = placeDescription;
    }

    /** 
     * Get the 'PlaceVolume' element value. ����� ��������� (��������), ���. �
     * 
     * @return value
     */
    public String getPlaceVolume() {
        return placeVolume;
    }

    /** 
     * Set the 'PlaceVolume' element value. ����� ��������� (��������), ���. �
     * 
     * @param placeVolume
     */
    public void setPlaceVolume(String placeVolume) {
        this.placeVolume = placeVolume;
    }

    /** 
     * Get the 'PlaceSquare' element value. ������� �������� �������� (��������), ��. �
     * 
     * @return value
     */
    public String getPlaceSquare() {
        return placeSquare;
    }

    /** 
     * Set the 'PlaceSquare' element value. ������� �������� �������� (��������), ��. �
     * 
     * @param placeSquare
     */
    public void setPlaceSquare(String placeSquare) {
        this.placeSquare = placeSquare;
    }

    /** 
     * Get the 'Address' element value. ��������������� ���������, �������� ��������, ���� ����������
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ��������������� ���������, �������� ��������, ���� ����������
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
