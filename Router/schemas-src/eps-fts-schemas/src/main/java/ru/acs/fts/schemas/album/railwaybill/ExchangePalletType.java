
package ru.acs.fts.schemas.album.railwaybill;

/** 
 * Сведения об обменных поддонах
 */
public class ExchangePalletType
{
    private String flatPalletQuantity;
    private String boxPalletQuantity;
    private String exchangeMode;

    /** 
     * Get the 'FlatPalletQuantity' element value. Количество плоских поддонов 
     * 
     * @return value
     */
    public String getFlatPalletQuantity() {
        return flatPalletQuantity;
    }

    /** 
     * Set the 'FlatPalletQuantity' element value. Количество плоских поддонов 
     * 
     * @param flatPalletQuantity
     */
    public void setFlatPalletQuantity(String flatPalletQuantity) {
        this.flatPalletQuantity = flatPalletQuantity;
    }

    /** 
     * Get the 'BoxPalletQuantity' element value. Количество поддонов ящичного типа
     * 
     * @return value
     */
    public String getBoxPalletQuantity() {
        return boxPalletQuantity;
    }

    /** 
     * Set the 'BoxPalletQuantity' element value. Количество поддонов ящичного типа
     * 
     * @param boxPalletQuantity
     */
    public void setBoxPalletQuantity(String boxPalletQuantity) {
        this.boxPalletQuantity = boxPalletQuantity;
    }

    /** 
     * Get the 'ExchangeMode' element value. Код режим обмена поддонов. 
     * 
     * @return value
     */
    public String getExchangeMode() {
        return exchangeMode;
    }

    /** 
     * Set the 'ExchangeMode' element value. Код режим обмена поддонов. 
     * 
     * @param exchangeMode
     */
    public void setExchangeMode(String exchangeMode) {
        this.exchangeMode = exchangeMode;
    }
}
