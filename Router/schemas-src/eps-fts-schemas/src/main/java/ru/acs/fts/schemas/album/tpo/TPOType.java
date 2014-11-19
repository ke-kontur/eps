
package ru.acs.fts.schemas.album.tpo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Таможенный приходный ордер (ТПО)
 */
public class TPOType extends BaseDocType
{
    private String additionalSheetNumber;
    private String totalWeight;
    private String totalCost;
    private String dollarTotalCost;
    private String euroTotalCost;
    private String amount;
    private String amountLetter;
    private TPOTypeCodeType TPOTypeCode;
    private TPORegNumberType TPORegNumber;
    private CUOrganizationType payer;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private PersonBaseType receiverPerson;
    private CustomsPersonType customsPerson;
    private PaymentCurrencyType paymentCurrency;
    private List<PresentedDocumentType> presentedDocumentList = new ArrayList<PresentedDocumentType>();
    private String documentModeID;

    /** 
     * Get the 'AdditionalSheetNumber' element value. Количество добавочных листов
     * 
     * @return value
     */
    public String getAdditionalSheetNumber() {
        return additionalSheetNumber;
    }

    /** 
     * Set the 'AdditionalSheetNumber' element value. Количество добавочных листов
     * 
     * @param additionalSheetNumber
     */
    public void setAdditionalSheetNumber(String additionalSheetNumber) {
        this.additionalSheetNumber = additionalSheetNumber;
    }

    /** 
     * Get the 'TotalWeight' element value. Общий вес всех перемещаемых товаров, кг
     * 
     * @return value
     */
    public String getTotalWeight() {
        return totalWeight;
    }

    /** 
     * Set the 'TotalWeight' element value. Общий вес всех перемещаемых товаров, кг
     * 
     * @param totalWeight
     */
    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }

    /** 
     * Get the 'TotalCost' element value. Общая стоимость в валюте платежа
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. Общая стоимость в валюте платежа
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /** 
     * Get the 'DollarTotalCost' element value. Общая стоимость в долларах США
     * 
     * @return value
     */
    public String getDollarTotalCost() {
        return dollarTotalCost;
    }

    /** 
     * Set the 'DollarTotalCost' element value. Общая стоимость в долларах США
     * 
     * @param dollarTotalCost
     */
    public void setDollarTotalCost(String dollarTotalCost) {
        this.dollarTotalCost = dollarTotalCost;
    }

    /** 
     * Get the 'EuroTotalCost' element value. Общая стоимость в евро
     * 
     * @return value
     */
    public String getEuroTotalCost() {
        return euroTotalCost;
    }

    /** 
     * Set the 'EuroTotalCost' element value. Общая стоимость в евро
     * 
     * @param euroTotalCost
     */
    public void setEuroTotalCost(String euroTotalCost) {
        this.euroTotalCost = euroTotalCost;
    }

    /** 
     * Get the 'Amount' element value. Общая сумма подлежащих уплате платежей
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Общая сумма подлежащих уплате платежей
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'AmountLetter' element value. Общая сумма подлежащих уплате платежей (прописью)
     * 
     * @return value
     */
    public String getAmountLetter() {
        return amountLetter;
    }

    /** 
     * Set the 'AmountLetter' element value. Общая сумма подлежащих уплате платежей (прописью)
     * 
     * @param amountLetter
     */
    public void setAmountLetter(String amountLetter) {
        this.amountLetter = amountLetter;
    }

    /** 
     * Get the 'TPOTypeCode' element value. Тип ордера
     * 
     * @return value
     */
    public TPOTypeCodeType getTPOTypeCode() {
        return TPOTypeCode;
    }

    /** 
     * Set the 'TPOTypeCode' element value. Тип ордера
     * 
     * @param TPOTypeCode
     */
    public void setTPOTypeCode(TPOTypeCodeType TPOTypeCode) {
        this.TPOTypeCode = TPOTypeCode;
    }

    /** 
     * Get the 'TPORegNumber' element value. Справочный номер ТПО
     * 
     * @return value
     */
    public TPORegNumberType getTPORegNumber() {
        return TPORegNumber;
    }

    /** 
     * Set the 'TPORegNumber' element value. Справочный номер ТПО
     * 
     * @param TPORegNumber
     */
    public void setTPORegNumber(TPORegNumberType TPORegNumber) {
        this.TPORegNumber = TPORegNumber;
    }

    /** 
     * Get the 'Payer' element value. Плательщик
     * 
     * @return value
     */
    public CUOrganizationType getPayer() {
        return payer;
    }

    /** 
     * Set the 'Payer' element value. Плательщик
     * 
     * @param payer
     */
    public void setPayer(CUOrganizationType payer) {
        this.payer = payer;
    }

    /** 
     * Get the list of 'Goods' element items. Описание товара
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Описание товара
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'ReceiverPerson' element value. Лицо, принявшее платеж
     * 
     * @return value
     */
    public PersonBaseType getReceiverPerson() {
        return receiverPerson;
    }

    /** 
     * Set the 'ReceiverPerson' element value. Лицо, принявшее платеж
     * 
     * @param receiverPerson
     */
    public void setReceiverPerson(PersonBaseType receiverPerson) {
        this.receiverPerson = receiverPerson;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'PaymentCurrency' element value. Валюта платежа
     * 
     * @return value
     */
    public PaymentCurrencyType getPaymentCurrency() {
        return paymentCurrency;
    }

    /** 
     * Set the 'PaymentCurrency' element value. Валюта платежа
     * 
     * @param paymentCurrency
     */
    public void setPaymentCurrency(PaymentCurrencyType paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }

    /** 
     * Get the list of 'PresentedDocument' element items. Представляемые документы/Дополнительная информация
     * 
     * @return list
     */
    public List<PresentedDocumentType> getPresentedDocumentList() {
        return presentedDocumentList;
    }

    /** 
     * Set the list of 'PresentedDocument' element items. Представляемые документы/Дополнительная информация
     * 
     * @param list
     */
    public void setPresentedDocumentList(List<PresentedDocumentType> list) {
        presentedDocumentList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
