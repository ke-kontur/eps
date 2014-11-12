
package ru.acs.fts.schemas.album.foivrequest;

/** 
 * Сведения об упаковке товаров
 */
public class PackingInfoType
{
    private String UUID;
    private String packingCode;
    private String pakingQuantity;

    /** 
     * Get the 'UUID' element value. Идентификатор упаковки
     * 
     * @return value
     */
    public String getUUID() {
        return UUID;
    }

    /** 
     * Set the 'UUID' element value. Идентификатор упаковки
     * 
     * @param UUID
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /** 
     * Get the 'PackingCode' element value. Код вида упаковки товаров в соответствии с  Классификатором видов груза, упаковки и упаковочных материалов.
     * 
     * @return value
     */
    public String getPackingCode() {
        return packingCode;
    }

    /** 
     * Set the 'PackingCode' element value. Код вида упаковки товаров в соответствии с  Классификатором видов груза, упаковки и упаковочных материалов.
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
}
