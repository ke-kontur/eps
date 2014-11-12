
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * Процедура
 */
public class ESADCustomsProcedureType
{
    private String mainCustomsModeCode;
    private String precedingCustomsModeCode;
    private String goodsTransferFeature;

    /** 
     * Get the 'MainCustomsModeCode' element value. Код заявляемой таможенной процедуры в соответствии с классификатором видов таможенных  процедур / "00" - для припасов
     * 
     * @return value
     */
    public String getMainCustomsModeCode() {
        return mainCustomsModeCode;
    }

    /** 
     * Set the 'MainCustomsModeCode' element value. Код заявляемой таможенной процедуры в соответствии с классификатором видов таможенных  процедур / "00" - для припасов
     * 
     * @param mainCustomsModeCode
     */
    public void setMainCustomsModeCode(String mainCustomsModeCode) {
        this.mainCustomsModeCode = mainCustomsModeCode;
    }

    /** 
     * Get the 'PrecedingCustomsModeCode' element value. Код предшествующей таможенной процедуры в соответствии с классификатором видов таможенных процедур / "00" - для припасов
     * 
     * @return value
     */
    public String getPrecedingCustomsModeCode() {
        return precedingCustomsModeCode;
    }

    /** 
     * Set the 'PrecedingCustomsModeCode' element value. Код предшествующей таможенной процедуры в соответствии с классификатором видов таможенных процедур / "00" - для припасов
     * 
     * @param precedingCustomsModeCode
     */
    public void setPrecedingCustomsModeCode(String precedingCustomsModeCode) {
        this.precedingCustomsModeCode = precedingCustomsModeCode;
    }

    /** 
     * Get the 'GoodsTransferFeature' element value. Особенность перемещения товаров в соответствии с классификатором особенностей перемещения товаров
     * 
     * @return value
     */
    public String getGoodsTransferFeature() {
        return goodsTransferFeature;
    }

    /** 
     * Set the 'GoodsTransferFeature' element value. Особенность перемещения товаров в соответствии с классификатором особенностей перемещения товаров
     * 
     * @param goodsTransferFeature
     */
    public void setGoodsTransferFeature(String goodsTransferFeature) {
        this.goodsTransferFeature = goodsTransferFeature;
    }
}
