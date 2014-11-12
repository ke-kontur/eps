
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

/** 
 * Информация  по сумме оплаты в валюте
 */
public class DTSCurrencyPaymentType
{
    private String positionsNumber;
    private String currencyAmount;
    private String currencyCode;
    private String currencyRate;
    private String currencyQuantity;

    /** 
     * Get the 'PositionsNumber' element value. Номер позиции (номер графы ДТС, к которой относятся такие сведения)
     * 
     * @return value
     */
    public String getPositionsNumber() {
        return positionsNumber;
    }

    /** 
     * Set the 'PositionsNumber' element value. Номер позиции (номер графы ДТС, к которой относятся такие сведения)
     * 
     * @param positionsNumber
     */
    public void setPositionsNumber(String positionsNumber) {
        this.positionsNumber = positionsNumber;
    }

    /** 
     * Get the 'CurrencyAmount' element value. Сумма в валюте счета по позиции
     * 
     * @return value
     */
    public String getCurrencyAmount() {
        return currencyAmount;
    }

    /** 
     * Set the 'CurrencyAmount' element value. Сумма в валюте счета по позиции
     * 
     * @param currencyAmount
     */
    public void setCurrencyAmount(String currencyAmount) {
        this.currencyAmount = currencyAmount;
    }

    /** 
     * Get the 'CurrencyCode' element value. Трехзначный буквенный код валюты по позиции, в соответствии с классификатором валют
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Трехзначный буквенный код валюты по позиции, в соответствии с классификатором валют
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'CurrencyRate' element value. Курс валюты по позиции
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. Курс валюты по позиции
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'CurrencyQuantity' element value. Количество единиц валюты, для которой указан курс для РБ
     * 
     * @return value
     */
    public String getCurrencyQuantity() {
        return currencyQuantity;
    }

    /** 
     * Set the 'CurrencyQuantity' element value. Количество единиц валюты, для которой указан курс для РБ
     * 
     * @param currencyQuantity
     */
    public void setCurrencyQuantity(String currencyQuantity) {
        this.currencyQuantity = currencyQuantity;
    }
}
