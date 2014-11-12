
package ru.acs.fts.schemas.album.transitinfo;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsItemBaseType;

/** 
 * Описание товара
 */
public class TransitGoodsType extends GoodsItemBaseType
{
    private String TNVEDCode;
    private String currencyCode;
    private SupplementaryQuantityType supplementaryGoodsQuantity;

    /** 
     * Get the 'TNVEDCode' element value. Код товара по ТН ВЭД.
     * 
     * @return value
     */
    public String getTNVEDCode() {
        return TNVEDCode;
    }

    /** 
     * Set the 'TNVEDCode' element value. Код товара по ТН ВЭД.
     * 
     * @param TNVEDCode
     */
    public void setTNVEDCode(String TNVEDCode) {
        this.TNVEDCode = TNVEDCode;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты фактурной стоимости
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты фактурной стоимости
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. Количество товара в дополнительной единице измерения.
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. Количество товара в дополнительной единице измерения.
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(
            SupplementaryQuantityType supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }
}
