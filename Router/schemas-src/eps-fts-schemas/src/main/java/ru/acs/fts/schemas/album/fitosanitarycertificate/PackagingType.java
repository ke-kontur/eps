
package ru.acs.fts.schemas.album.fitosanitarycertificate;

/** 
 * Сведения о количестве мест и описание упаковки
 */
public class PackagingType
{
    private String placesQiantity;
    private String packingCode;
    private String pakingQuantity;

    /** 
     * Get the 'PlacesQiantity' element value. Количество мест
     * 
     * @return value
     */
    public String getPlacesQiantity() {
        return placesQiantity;
    }

    /** 
     * Set the 'PlacesQiantity' element value. Количество мест
     * 
     * @param placesQiantity
     */
    public void setPlacesQiantity(String placesQiantity) {
        this.placesQiantity = placesQiantity;
    }

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
}
