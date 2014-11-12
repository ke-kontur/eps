
package ru.acs.fts.schemas.album.oez_report;

/** 
 * Сведения товарах с изменным статусом
 */
public class StatusDisguiseGoodsType
{
    private String OEZClosedQuantity;
    private String lostGoodsQuantity;

    /** 
     * Get the 'OEZClosedQuantity' element value. Количество товара, в отношении которых таможенная процедура СТЗ завершена при прекращении функционирования ОЭЗ
     * 
     * @return value
     */
    public String getOEZClosedQuantity() {
        return OEZClosedQuantity;
    }

    /** 
     * Set the 'OEZClosedQuantity' element value. Количество товара, в отношении которых таможенная процедура СТЗ завершена при прекращении функционирования ОЭЗ
     * 
     * @param OEZClosedQuantity
     */
    public void setOEZClosedQuantity(String OEZClosedQuantity) {
        this.OEZClosedQuantity = OEZClosedQuantity;
    }

    /** 
     * Get the 'LostGoodsQuantity' element value. Количество товара, использованное  согласно целям ввоза
     * 
     * @return value
     */
    public String getLostGoodsQuantity() {
        return lostGoodsQuantity;
    }

    /** 
     * Set the 'LostGoodsQuantity' element value. Количество товара, использованное  согласно целям ввоза
     * 
     * @param lostGoodsQuantity
     */
    public void setLostGoodsQuantity(String lostGoodsQuantity) {
        this.lostGoodsQuantity = lostGoodsQuantity;
    }
}
