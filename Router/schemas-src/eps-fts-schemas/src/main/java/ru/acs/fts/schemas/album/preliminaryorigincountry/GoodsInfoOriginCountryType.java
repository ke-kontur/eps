
package ru.acs.fts.schemas.album.preliminaryorigincountry;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о товаре, необходимые для определения страны происхождения 
 */
public class GoodsInfoOriginCountryType
{
    private String manufacturer;
    private String placeManufactur;
    private DocumentBaseType contract;

    /** 
     * Get the 'Manufacturer' element value. Производитель товара
     * 
     * @return value
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. Производитель товара
     * 
     * @param manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /** 
     * Get the 'PlaceManufactur' element value. Место производства
     * 
     * @return value
     */
    public String getPlaceManufactur() {
        return placeManufactur;
    }

    /** 
     * Set the 'PlaceManufactur' element value. Место производства
     * 
     * @param placeManufactur
     */
    public void setPlaceManufactur(String placeManufactur) {
        this.placeManufactur = placeManufactur;
    }

    /** 
     * Get the 'Contract' element value. Конкретный документ, на основании которого принято решение.
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Конкретный документ, на основании которого принято решение.
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }
}
