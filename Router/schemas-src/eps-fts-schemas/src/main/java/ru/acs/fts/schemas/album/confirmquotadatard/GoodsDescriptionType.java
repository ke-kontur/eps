
package ru.acs.fts.schemas.album.confirmquotadatard;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.LicenseGoodsType;

/** 
 * Сведения о товарах
 */
public class GoodsDescriptionType
{
    private String goodsNumber;
    private List<SupplementaryQuantityType> supplementaryQuantityList = new ArrayList<SupplementaryQuantityType>();
    private LicenseGoodsType licenseGoods;

    /** 
     * Get the 'GoodsNumber' element value. Номер товара
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. Номер товара
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the list of 'SupplementaryQuantity' element items. Количество и единицы измерения
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getSupplementaryQuantityList() {
        return supplementaryQuantityList;
    }

    /** 
     * Set the list of 'SupplementaryQuantity' element items. Количество и единицы измерения
     * 
     * @param list
     */
    public void setSupplementaryQuantityList(
            List<SupplementaryQuantityType> list) {
        supplementaryQuantityList = list;
    }

    /** 
     * Get the 'LicenseGoods' element value. Сведения о товаре по приложению разрешительного документа
     * 
     * @return value
     */
    public LicenseGoodsType getLicenseGoods() {
        return licenseGoods;
    }

    /** 
     * Set the 'LicenseGoods' element value. Сведения о товаре по приложению разрешительного документа
     * 
     * @param licenseGoods
     */
    public void setLicenseGoods(LicenseGoodsType licenseGoods) {
        this.licenseGoods = licenseGoods;
    }
}
