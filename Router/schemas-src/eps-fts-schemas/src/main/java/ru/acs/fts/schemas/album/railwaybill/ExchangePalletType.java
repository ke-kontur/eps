
package ru.acs.fts.schemas.album.railwaybill;

/** 
 * �������� �� �������� ��������
 */
public class ExchangePalletType
{
    private String flatPalletQuantity;
    private String boxPalletQuantity;
    private String exchangeMode;

    /** 
     * Get the 'FlatPalletQuantity' element value. ���������� ������� �������� 
     * 
     * @return value
     */
    public String getFlatPalletQuantity() {
        return flatPalletQuantity;
    }

    /** 
     * Set the 'FlatPalletQuantity' element value. ���������� ������� �������� 
     * 
     * @param flatPalletQuantity
     */
    public void setFlatPalletQuantity(String flatPalletQuantity) {
        this.flatPalletQuantity = flatPalletQuantity;
    }

    /** 
     * Get the 'BoxPalletQuantity' element value. ���������� �������� �������� ����
     * 
     * @return value
     */
    public String getBoxPalletQuantity() {
        return boxPalletQuantity;
    }

    /** 
     * Set the 'BoxPalletQuantity' element value. ���������� �������� �������� ����
     * 
     * @param boxPalletQuantity
     */
    public void setBoxPalletQuantity(String boxPalletQuantity) {
        this.boxPalletQuantity = boxPalletQuantity;
    }

    /** 
     * Get the 'ExchangeMode' element value. ��� ����� ������ ��������. 
     * 
     * @return value
     */
    public String getExchangeMode() {
        return exchangeMode;
    }

    /** 
     * Set the 'ExchangeMode' element value. ��� ����� ������ ��������. 
     * 
     * @param exchangeMode
     */
    public void setExchangeMode(String exchangeMode) {
        this.exchangeMode = exchangeMode;
    }
}
