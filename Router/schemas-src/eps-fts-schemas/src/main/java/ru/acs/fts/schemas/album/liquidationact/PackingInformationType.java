
package ru.acs.fts.schemas.album.liquidationact;

/** 
 * Сведения об упаковке
 */
public class PackingInformationType
{
    private String packingCode;
    private String packingDescription;

    /** 
     * Get the 'PackingCode' element value. Код вида упаковки товаров в соответствии с  Классификатором видов груза, упаковки и упаковочных материалов
     * 
     * @return value
     */
    public String getPackingCode() {
        return packingCode;
    }

    /** 
     * Set the 'PackingCode' element value. Код вида упаковки товаров в соответствии с  Классификатором видов груза, упаковки и упаковочных материалов
     * 
     * @param packingCode
     */
    public void setPackingCode(String packingCode) {
        this.packingCode = packingCode;
    }

    /** 
     * Get the 'PackingDescription' element value. Наименование упаковки товаров в соответствии с  Классификатором видов груза, упаковки и упаковочных материалов
     * 
     * @return value
     */
    public String getPackingDescription() {
        return packingDescription;
    }

    /** 
     * Set the 'PackingDescription' element value. Наименование упаковки товаров в соответствии с  Классификатором видов груза, упаковки и упаковочных материалов
     * 
     * @param packingDescription
     */
    public void setPackingDescription(String packingDescription) {
        this.packingDescription = packingDescription;
    }
}
