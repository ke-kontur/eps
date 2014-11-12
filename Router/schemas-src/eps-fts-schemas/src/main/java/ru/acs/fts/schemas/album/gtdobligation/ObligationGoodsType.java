
package ru.acs.fts.schemas.album.gtdobligation;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADGoodsItemType;

/** 
 * “овары, выпуск которых просит осуществить декларант
 */
public class ObligationGoodsType extends CUESADGoodsItemType
{
    private String militaryProductCategoryCode;
    private String originCountrySign;
    private SupplementaryQuantityType supplementaryQuantity;
    private List<SupplementaryQuantityType> supplementaryQuantity12List = new ArrayList<SupplementaryQuantityType>();

    /** 
     * Get the 'MilitaryProductCategoryCode' element value.  атегори€ продукции военного назначени€
     * 
     * @return value
     */
    public String getMilitaryProductCategoryCode() {
        return militaryProductCategoryCode;
    }

    /** 
     * Set the 'MilitaryProductCategoryCode' element value.  атегори€ продукции военного назначени€
     * 
     * @param militaryProductCategoryCode
     */
    public void setMilitaryProductCategoryCode(
            String militaryProductCategoryCode) {
        this.militaryProductCategoryCode = militaryProductCategoryCode;
    }

    /** 
     * Get the 'OriginCountrySign' element value. ѕризнак кода страны происхождени€: 0 - буквенный код alpha-2 по классификатору OKSMT; 1 - буквенный код EU
     * 
     * @return value
     */
    public String getOriginCountrySign() {
        return originCountrySign;
    }

    /** 
     * Set the 'OriginCountrySign' element value. ѕризнак кода страны происхождени€: 0 - буквенный код alpha-2 по классификатору OKSMT; 1 - буквенный код EU
     * 
     * @param originCountrySign
     */
    public void setOriginCountrySign(String originCountrySign) {
        this.originCountrySign = originCountrySign;
    }

    /** 
     * Get the 'SupplementaryQuantity' element value.  оличество товара в дополнительной единице измерени€
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value.  оличество товара в дополнительной единице измерени€
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
    }

    /** 
     * Get the list of 'SupplementaryQuantity12' element items.  оличество товара в дополнительной единице измерени€ (1,2)
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getSupplementaryQuantity12List() {
        return supplementaryQuantity12List;
    }

    /** 
     * Set the list of 'SupplementaryQuantity12' element items.  оличество товара в дополнительной единице измерени€ (1,2)
     * 
     * @param list
     */
    public void setSupplementaryQuantity12List(
            List<SupplementaryQuantityType> list) {
        supplementaryQuantity12List = list;
    }
}
