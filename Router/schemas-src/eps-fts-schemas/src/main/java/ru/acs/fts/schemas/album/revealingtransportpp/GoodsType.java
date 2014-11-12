
package ru.acs.fts.schemas.album.revealingtransportpp;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.PackingInformationType;

/** 
 * Сведения о товаре
 */
public class GoodsType
{
    private String goodsNumber;
    private String TNVEDCode;
    private String grossWeight;
    private String invoicedAmount;
    private String contractCurrencyCode;
    private List<String> containerIdentificatorList = new ArrayList<String>();
    private String netWeightQuantity;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String originCountryCode;
    private SupplementaryQuantityType supplementaryQuantity;
    private List<PackingInformationType> packingInformationList = new ArrayList<PackingInformationType>();
    private GTDIDType regNumberDT;

    /** 
     * Get the 'GoodsNumber' element value. Порядковый номер товара
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. Порядковый номер товара
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the 'TNVEDCode' element value. Код товара по ТНВЭД
     * 
     * @return value
     */
    public String getTNVEDCode() {
        return TNVEDCode;
    }

    /** 
     * Set the 'TNVEDCode' element value. Код товара по ТНВЭД
     * 
     * @param TNVEDCode
     */
    public void setTNVEDCode(String TNVEDCode) {
        this.TNVEDCode = TNVEDCode;
    }

    /** 
     * Get the 'GrossWeight' element value. Вес брутто, кг
     * 
     * @return value
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. Вес брутто, кг
     * 
     * @param grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the 'InvoicedAmount' element value. Фактурная стоимость
     * 
     * @return value
     */
    public String getInvoicedAmount() {
        return invoicedAmount;
    }

    /** 
     * Set the 'InvoicedAmount' element value. Фактурная стоимость
     * 
     * @param invoicedAmount
     */
    public void setInvoicedAmount(String invoicedAmount) {
        this.invoicedAmount = invoicedAmount;
    }

    /** 
     * Get the 'ContractCurrencyCode' element value. Код валюты контракта
     * 
     * @return value
     */
    public String getContractCurrencyCode() {
        return contractCurrencyCode;
    }

    /** 
     * Set the 'ContractCurrencyCode' element value. Код валюты контракта
     * 
     * @param contractCurrencyCode
     */
    public void setContractCurrencyCode(String contractCurrencyCode) {
        this.contractCurrencyCode = contractCurrencyCode;
    }

    /** 
     * Get the list of 'ContainerIdentificator' element items. Номер (идентификатор) контейнера
     * 
     * @return list
     */
    public List<String> getContainerIdentificatorList() {
        return containerIdentificatorList;
    }

    /** 
     * Set the list of 'ContainerIdentificator' element items. Номер (идентификатор) контейнера
     * 
     * @param list
     */
    public void setContainerIdentificatorList(List<String> list) {
        containerIdentificatorList = list;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. Вес нетто, кг
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. Вес нетто, кг
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. Описание товара
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Описание товара
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'OriginCountryCode' element value. Буквенный код страны происхождения товара в соответствии с Классификатором стран мира.
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. Буквенный код страны происхождения товара в соответствии с Классификатором стран мира.
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    /** 
     * Get the 'SupplementaryQuantity' element value. Количество в дополнительной единице измерения
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value. Количество в дополнительной единице измерения
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
    }

    /** 
     * Get the list of 'PackingInformation' element items. Сведения об упаковке товаров
     * 
     * @return list
     */
    public List<PackingInformationType> getPackingInformationList() {
        return packingInformationList;
    }

    /** 
     * Set the list of 'PackingInformation' element items. Сведения об упаковке товаров
     * 
     * @param list
     */
    public void setPackingInformationList(List<PackingInformationType> list) {
        packingInformationList = list;
    }

    /** 
     * Get the 'RegNumberDT' element value. Номер оформленной ДТ
     * 
     * @return value
     */
    public GTDIDType getRegNumberDT() {
        return regNumberDT;
    }

    /** 
     * Set the 'RegNumberDT' element value. Номер оформленной ДТ
     * 
     * @param regNumberDT
     */
    public void setRegNumberDT(GTDIDType regNumberDT) {
        this.regNumberDT = regNumberDT;
    }
}
