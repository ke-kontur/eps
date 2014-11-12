
package ru.acs.fts.schemas.album.preliminaryorigincountry;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ������, ����������� ��� ����������� ������ ������������� 
 */
public class GoodsInfoOriginCountryType
{
    private String manufacturer;
    private String placeManufactur;
    private DocumentBaseType contract;

    /** 
     * Get the 'Manufacturer' element value. ������������� ������
     * 
     * @return value
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. ������������� ������
     * 
     * @param manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /** 
     * Get the 'PlaceManufactur' element value. ����� ������������
     * 
     * @return value
     */
    public String getPlaceManufactur() {
        return placeManufactur;
    }

    /** 
     * Set the 'PlaceManufactur' element value. ����� ������������
     * 
     * @param placeManufactur
     */
    public void setPlaceManufactur(String placeManufactur) {
        this.placeManufactur = placeManufactur;
    }

    /** 
     * Get the 'Contract' element value. ���������� ��������, �� ��������� �������� ������� �������.
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. ���������� ��������, �� ��������� �������� ������� �������.
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }
}
