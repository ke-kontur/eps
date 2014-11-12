
package ru.acs.fts.schemas.album.goodsclassificationdecision;

/** 
 * Регистрационный номер решения
 */
public class RegistryNumberType
{
    private String GTDId;
    private String GTDPosition;
    private String position;

    /** 
     * Get the 'GTDId' element value. Порядковый номер ДТ
     * 
     * @return value
     */
    public String getGTDId() {
        return GTDId;
    }

    /** 
     * Set the 'GTDId' element value. Порядковый номер ДТ
     * 
     * @param GTDId
     */
    public void setGTDId(String GTDId) {
        this.GTDId = GTDId;
    }

    /** 
     * Get the 'GTDPosition' element value. Порядковый номер товара по ДТ
     * 
     * @return value
     */
    public String getGTDPosition() {
        return GTDPosition;
    }

    /** 
     * Set the 'GTDPosition' element value. Порядковый номер товара по ДТ
     * 
     * @param GTDPosition
     */
    public void setGTDPosition(String GTDPosition) {
        this.GTDPosition = GTDPosition;
    }

    /** 
     * Get the 'Position' element value. Порядковый номер товара. "0", если по указанному "номеру товара по ДТ" задекларирован один товар. "1" и т.д., если по указанному "номеру товара по ДТ" задекларировано несколько товаров.
     * 
     * @return value
     */
    public String getPosition() {
        return position;
    }

    /** 
     * Set the 'Position' element value. Порядковый номер товара. "0", если по указанному "номеру товара по ДТ" задекларирован один товар. "1" и т.д., если по указанному "номеру товара по ДТ" задекларировано несколько товаров.
     * 
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }
}
