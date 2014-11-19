
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.AdditionalDataType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSCurrencyPaymentType;

/** 
 * Таможенная стоимость по товару.
 */
public class DTSGoodsCustomsCostType
{
    private String sheetNumber;
    private String sheetGoodsSerialNumber;
    private String methodNumberCode;
    private String baseMethodNumberCode;
    private String GTDGoodsNumber;
    private String goodsTNVEDCode;
    private String nationalDeclaredCustomsCost;
    private String dollarDeclaredCustomsCost;
    private String goodsAddTNVEDCode;
    private DTSCustomsCostCalculationType customsCostCalculation;
    private List<DTSCurrencyPaymentType> DTSCurrencyPaymentList = new ArrayList<DTSCurrencyPaymentType>();
    private List<AdditionalDataType> additionalDataList = new ArrayList<AdditionalDataType>();

    /** 
     * Get the 'SheetNumber' element value. Номер листа
     * 
     * @return value
     */
    public String getSheetNumber() {
        return sheetNumber;
    }

    /** 
     * Set the 'SheetNumber' element value. Номер листа
     * 
     * @param sheetNumber
     */
    public void setSheetNumber(String sheetNumber) {
        this.sheetNumber = sheetNumber;
    }

    /** 
     * Get the 'SheetGoodsSerialNumber' element value. Порядковый номер товара на листе
     * 
     * @return value
     */
    public String getSheetGoodsSerialNumber() {
        return sheetGoodsSerialNumber;
    }

    /** 
     * Set the 'SheetGoodsSerialNumber' element value. Порядковый номер товара на листе
     * 
     * @param sheetGoodsSerialNumber
     */
    public void setSheetGoodsSerialNumber(String sheetGoodsSerialNumber) {
        this.sheetGoodsSerialNumber = sheetGoodsSerialNumber;
    }

    /** 
     * Get the 'MethodNumberCode' element value. Номер метода. (Заполняется в соответствии с классификатором методов определения таможенной стоимости товаров, помещаемых под таможенные режимы, применимые к ввозимым товарам.)
     * 
     * @return value
     */
    public String getMethodNumberCode() {
        return methodNumberCode;
    }

    /** 
     * Set the 'MethodNumberCode' element value. Номер метода. (Заполняется в соответствии с классификатором методов определения таможенной стоимости товаров, помещаемых под таможенные режимы, применимые к ввозимым товарам.)
     * 
     * @param methodNumberCode
     */
    public void setMethodNumberCode(String methodNumberCode) {
        this.methodNumberCode = methodNumberCode;
    }

    /** 
     * Get the 'BaseMethodNumberCode' element value. Номер базового метода 
     * 
     * @return value
     */
    public String getBaseMethodNumberCode() {
        return baseMethodNumberCode;
    }

    /** 
     * Set the 'BaseMethodNumberCode' element value. Номер базового метода 
     * 
     * @param baseMethodNumberCode
     */
    public void setBaseMethodNumberCode(String baseMethodNumberCode) {
        this.baseMethodNumberCode = baseMethodNumberCode;
    }

    /** 
     * Get the 'GTDGoodsNumber' element value. Номер товара по ДТ/списку 
     * 
     * @return value
     */
    public String getGTDGoodsNumber() {
        return GTDGoodsNumber;
    }

    /** 
     * Set the 'GTDGoodsNumber' element value. Номер товара по ДТ/списку 
     * 
     * @param GTDGoodsNumber
     */
    public void setGTDGoodsNumber(String GTDGoodsNumber) {
        this.GTDGoodsNumber = GTDGoodsNumber;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'NationalDeclaredCustomsCost' element value. Заявленная таможенная стоимость в национальной валюте
     * 
     * @return value
     */
    public String getNationalDeclaredCustomsCost() {
        return nationalDeclaredCustomsCost;
    }

    /** 
     * Set the 'NationalDeclaredCustomsCost' element value. Заявленная таможенная стоимость в национальной валюте
     * 
     * @param nationalDeclaredCustomsCost
     */
    public void setNationalDeclaredCustomsCost(
            String nationalDeclaredCustomsCost) {
        this.nationalDeclaredCustomsCost = nationalDeclaredCustomsCost;
    }

    /** 
     * Get the 'DollarDeclaredCustomsCost' element value. Заявленная таможенная стоимость в долларах США
     * 
     * @return value
     */
    public String getDollarDeclaredCustomsCost() {
        return dollarDeclaredCustomsCost;
    }

    /** 
     * Set the 'DollarDeclaredCustomsCost' element value. Заявленная таможенная стоимость в долларах США
     * 
     * @param dollarDeclaredCustomsCost
     */
    public void setDollarDeclaredCustomsCost(String dollarDeclaredCustomsCost) {
        this.dollarDeclaredCustomsCost = dollarDeclaredCustomsCost;
    }

    /** 
     * Get the 'GoodsAddTNVEDCode' element value. Код товара по классификатору дополнительной таможенной информации
     * 
     * @return value
     */
    public String getGoodsAddTNVEDCode() {
        return goodsAddTNVEDCode;
    }

    /** 
     * Set the 'GoodsAddTNVEDCode' element value. Код товара по классификатору дополнительной таможенной информации
     * 
     * @param goodsAddTNVEDCode
     */
    public void setGoodsAddTNVEDCode(String goodsAddTNVEDCode) {
        this.goodsAddTNVEDCode = goodsAddTNVEDCode;
    }

    /** 
     * Get the 'CustomsCostCalculation' element value. Расчет таможенной стоимости.
     * 
     * @return value
     */
    public DTSCustomsCostCalculationType getCustomsCostCalculation() {
        return customsCostCalculation;
    }

    /** 
     * Set the 'CustomsCostCalculation' element value. Расчет таможенной стоимости.
     * 
     * @param customsCostCalculation
     */
    public void setCustomsCostCalculation(
            DTSCustomsCostCalculationType customsCostCalculation) {
        this.customsCostCalculation = customsCostCalculation;
    }

    /** 
     * Get the list of 'DTSCurrencyPayment' element items. Информация  по сумме оплаты в валюте.
     * 
     * @return list
     */
    public List<DTSCurrencyPaymentType> getDTSCurrencyPaymentList() {
        return DTSCurrencyPaymentList;
    }

    /** 
     * Set the list of 'DTSCurrencyPayment' element items. Информация  по сумме оплаты в валюте.
     * 
     * @param list
     */
    public void setDTSCurrencyPaymentList(List<DTSCurrencyPaymentType> list) {
        DTSCurrencyPaymentList = list;
    }

    /** 
     * Get the list of 'AdditionalData' element items. Дополнительная информация. Кроме предусмотренной в соответствующих графах.
     * 
     * @return list
     */
    public List<AdditionalDataType> getAdditionalDataList() {
        return additionalDataList;
    }

    /** 
     * Set the list of 'AdditionalData' element items. Дополнительная информация. Кроме предусмотренной в соответствующих графах.
     * 
     * @param list
     */
    public void setAdditionalDataList(List<AdditionalDataType> list) {
        additionalDataList = list;
    }
}
