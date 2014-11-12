
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

/** 
 * Сведения об упаковке товаров. Код, Количество. Маркировка
 */
public class PackingInformationType
{
    private String packingCode;
    private String pakingQuantity;
    private String packingMark;

    /** 
     * Get the 'PackingCode' element value. Код вида упаковки товаров в соответствии с  классификатором видов груза, упаковки и упаковочных материалов.
     * 
     * @return value
     */
    public String getPackingCode() {
        return packingCode;
    }

    /** 
     * Set the 'PackingCode' element value. Код вида упаковки товаров в соответствии с  классификатором видов груза, упаковки и упаковочных материалов.
     * 
     * @param packingCode
     */
    public void setPackingCode(String packingCode) {
        this.packingCode = packingCode;
    }

    /** 
     * Get the 'PakingQuantity' element value. Количество упаковок.
     * 
     * @return value
     */
    public String getPakingQuantity() {
        return pakingQuantity;
    }

    /** 
     * Set the 'PakingQuantity' element value. Количество упаковок.
     * 
     * @param pakingQuantity
     */
    public void setPakingQuantity(String pakingQuantity) {
        this.pakingQuantity = pakingQuantity;
    }

    /** 
     * Get the 'PackingMark' element value. Маркировка грузовых мест
     * 
     * @return value
     */
    public String getPackingMark() {
        return packingMark;
    }

    /** 
     * Set the 'PackingMark' element value. Маркировка грузовых мест
     * 
     * @param packingMark
     */
    public void setPackingMark(String packingMark) {
        this.packingMark = packingMark;
    }
}
