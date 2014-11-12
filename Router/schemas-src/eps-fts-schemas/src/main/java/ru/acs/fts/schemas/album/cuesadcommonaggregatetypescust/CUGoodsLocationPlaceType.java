
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * Сведения о местонахождении товаров
 */
public class CUGoodsLocationPlaceType
{
    private String numberCustomsZone;

    /** 
     * Get the 'NumberCustomsZone' element value. Номер зоны таможенного контроля
     * 
     * @return value
     */
    public String getNumberCustomsZone() {
        return numberCustomsZone;
    }

    /** 
     * Set the 'NumberCustomsZone' element value. Номер зоны таможенного контроля
     * 
     * @param numberCustomsZone
     */
    public void setNumberCustomsZone(String numberCustomsZone) {
        this.numberCustomsZone = numberCustomsZone;
    }
}
