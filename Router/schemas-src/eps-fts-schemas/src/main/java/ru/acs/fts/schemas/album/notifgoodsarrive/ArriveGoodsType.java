
package ru.acs.fts.schemas.album.notifgoodsarrive;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GoodsBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHSuppQuantityType;

/** 
 * Описание товаров
 */
public class ArriveGoodsType extends GoodsBaseType
{
    private String invoicedCost;
    private String contractCurrencyCode;
    private WHSuppQuantityType volume;
    private List<WHSuppQuantityType> supplementaryQuantityList = new ArrayList<WHSuppQuantityType>();
    private ArrivePackingInformationType arrivePackingInformation;

    /** 
     * Get the 'InvoicedCost' element value. Фактурная стоимость / Цена товара
     * 
     * @return value
     */
    public String getInvoicedCost() {
        return invoicedCost;
    }

    /** 
     * Set the 'InvoicedCost' element value. Фактурная стоимость / Цена товара
     * 
     * @param invoicedCost
     */
    public void setInvoicedCost(String invoicedCost) {
        this.invoicedCost = invoicedCost;
    }

    /** 
     * Get the 'ContractCurrencyCode' element value. Трехзначный буквенный код валюты фактурной стоимости / цены. 
     * 
     * @return value
     */
    public String getContractCurrencyCode() {
        return contractCurrencyCode;
    }

    /** 
     * Set the 'ContractCurrencyCode' element value. Трехзначный буквенный код валюты фактурной стоимости / цены. 
     * 
     * @param contractCurrencyCode
     */
    public void setContractCurrencyCode(String contractCurrencyCode) {
        this.contractCurrencyCode = contractCurrencyCode;
    }

    /** 
     * Get the 'Volume' element value. Объем товара
     * 
     * @return value
     */
    public WHSuppQuantityType getVolume() {
        return volume;
    }

    /** 
     * Set the 'Volume' element value. Объем товара
     * 
     * @param volume
     */
    public void setVolume(WHSuppQuantityType volume) {
        this.volume = volume;
    }

    /** 
     * Get the list of 'SupplementaryQuantity' element items. Кол-во товара в дополнительных единицах  измерения
     * 
     * @return list
     */
    public List<WHSuppQuantityType> getSupplementaryQuantityList() {
        return supplementaryQuantityList;
    }

    /** 
     * Set the list of 'SupplementaryQuantity' element items. Кол-во товара в дополнительных единицах  измерения
     * 
     * @param list
     */
    public void setSupplementaryQuantityList(List<WHSuppQuantityType> list) {
        supplementaryQuantityList = list;
    }

    /** 
     * Get the 'ArrivePackingInformation' element value. Информация об упаковках
     * 
     * @return value
     */
    public ArrivePackingInformationType getArrivePackingInformation() {
        return arrivePackingInformation;
    }

    /** 
     * Set the 'ArrivePackingInformation' element value. Информация об упаковках
     * 
     * @param arrivePackingInformation
     */
    public void setArrivePackingInformation(
            ArrivePackingInformationType arrivePackingInformation) {
        this.arrivePackingInformation = arrivePackingInformation;
    }
}
