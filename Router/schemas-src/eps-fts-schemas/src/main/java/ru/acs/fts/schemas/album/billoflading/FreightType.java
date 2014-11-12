
package ru.acs.fts.schemas.album.billoflading;

/** 
 * Информация о платежах, причитающихся перевозчику 
 */
public class FreightType
{
    private String frDescription;
    private String freightAmount;

    /** 
     * Get the 'FrDescription' element value. Указание, что фрахт должен быть уплачен согласно условиям, изложенным в чартере или в другом документе, либо указание, что фрахт полностью уплачен
     * 
     * @return value
     */
    public String getFrDescription() {
        return frDescription;
    }

    /** 
     * Set the 'FrDescription' element value. Указание, что фрахт должен быть уплачен согласно условиям, изложенным в чартере или в другом документе, либо указание, что фрахт полностью уплачен
     * 
     * @param frDescription
     */
    public void setFrDescription(String frDescription) {
        this.frDescription = frDescription;
    }

    /** 
     * Get the 'FreightAmount' element value. Сумма фрахта или других причитающихся перевозчику платежей
     * 
     * @return value
     */
    public String getFreightAmount() {
        return freightAmount;
    }

    /** 
     * Set the 'FreightAmount' element value. Сумма фрахта или других причитающихся перевозчику платежей
     * 
     * @param freightAmount
     */
    public void setFreightAmount(String freightAmount) {
        this.freightAmount = freightAmount;
    }
}
