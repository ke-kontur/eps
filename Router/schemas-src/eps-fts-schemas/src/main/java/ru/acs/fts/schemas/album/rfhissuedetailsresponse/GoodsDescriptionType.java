
package ru.acs.fts.schemas.album.rfhissuedetailsresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Описание товара
 */
public class GoodsDescriptionType
{
    private List<String> fishNameList = new ArrayList<String>();
    private String samples;
    private String countryOrigin;
    private String countryOriginName;
    private SupplementaryQuantityType quantity;
    private SupplementaryQuantityType addQuantity;

    /** 
     * Get the list of 'FishName' element items. Русское и латинское название осетровых видов рыб
     * 
     * @return list
     */
    public List<String> getFishNameList() {
        return fishNameList;
    }

    /** 
     * Set the list of 'FishName' element items. Русское и латинское название осетровых видов рыб
     * 
     * @param list
     */
    public void setFishNameList(List<String> list) {
        fishNameList = list;
    }

    /** 
     * Get the 'Samples' element value. Описание образцов, включая метки
     * 
     * @return value
     */
    public String getSamples() {
        return samples;
    }

    /** 
     * Set the 'Samples' element value. Описание образцов, включая метки
     * 
     * @param samples
     */
    public void setSamples(String samples) {
        this.samples = samples;
    }

    /** 
     * Get the 'CountryOrigin' element value. Страна происхождения
     * 
     * @return value
     */
    public String getCountryOrigin() {
        return countryOrigin;
    }

    /** 
     * Set the 'CountryOrigin' element value. Страна происхождения
     * 
     * @param countryOrigin
     */
    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    /** 
     * Get the 'CountryOriginName' element value. Полное наименование страны происхождения
     * 
     * @return value
     */
    public String getCountryOriginName() {
        return countryOriginName;
    }

    /** 
     * Set the 'CountryOriginName' element value. Полное наименование страны происхождения
     * 
     * @param countryOriginName
     */
    public void setCountryOriginName(String countryOriginName) {
        this.countryOriginName = countryOriginName;
    }

    /** 
     * Get the 'Quantity' element value. Количество
     * 
     * @return value
     */
    public SupplementaryQuantityType getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество
     * 
     * @param quantity
     */
    public void setQuantity(SupplementaryQuantityType quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'AddQuantity' element value. Количество в дополнительной единице измерения
     * 
     * @return value
     */
    public SupplementaryQuantityType getAddQuantity() {
        return addQuantity;
    }

    /** 
     * Set the 'AddQuantity' element value. Количество в дополнительной единице измерения
     * 
     * @param addQuantity
     */
    public void setAddQuantity(SupplementaryQuantityType addQuantity) {
        this.addQuantity = addQuantity;
    }
}
