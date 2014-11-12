
package ru.acs.fts.schemas.album.pi_airarrive;

/** 
 * Сведения об упаковке и грузовых местах
 */
public class PackingInfoType
{
    private String packingCode;
    private String packingQuantity;
    private String packingDescription;
    private String packagePartQuantity;

    /** 
     * Get the 'PackingCode' element value. Код вида упаковки/грузового места товаров в соответствии с классификатором видов груза, упаковки и упаковочных материалов
     * 
     * @return value
     */
    public String getPackingCode() {
        return packingCode;
    }

    /** 
     * Set the 'PackingCode' element value. Код вида упаковки/грузового места товаров в соответствии с классификатором видов груза, упаковки и упаковочных материалов
     * 
     * @param packingCode
     */
    public void setPackingCode(String packingCode) {
        this.packingCode = packingCode;
    }

    /** 
     * Get the 'PackingQuantity' element value. Количество грузовых мест/упаковок
     * 
     * @return value
     */
    public String getPackingQuantity() {
        return packingQuantity;
    }

    /** 
     * Set the 'PackingQuantity' element value. Количество грузовых мест/упаковок
     * 
     * @param packingQuantity
     */
    public void setPackingQuantity(String packingQuantity) {
        this.packingQuantity = packingQuantity;
    }

    /** 
     * Get the 'PackingDescription' element value. Описание грузовых мест/ упаковки
     * 
     * @return value
     */
    public String getPackingDescription() {
        return packingDescription;
    }

    /** 
     * Set the 'PackingDescription' element value. Описание грузовых мест/ упаковки
     * 
     * @param packingDescription
     */
    public void setPackingDescription(String packingDescription) {
        this.packingDescription = packingDescription;
    }

    /** 
     * Get the 'PackagePartQuantity' element value. Количество грузовых мест/упаковки, частично занятых товаром
     * 
     * @return value
     */
    public String getPackagePartQuantity() {
        return packagePartQuantity;
    }

    /** 
     * Set the 'PackagePartQuantity' element value. Количество грузовых мест/упаковки, частично занятых товаром
     * 
     * @param packagePartQuantity
     */
    public void setPackagePartQuantity(String packagePartQuantity) {
        this.packagePartQuantity = packagePartQuantity;
    }
}
