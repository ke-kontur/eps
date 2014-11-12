
package ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust;

/** 
 * Сведения о грузовых  местах  и упаковке товаров
 */
public class TRPackingInfoType
{
    private String packingCode;
    private String pakingQuantity;
    private String packingDescription;
    private String pakagePartQuantity;

    /** 
     * Get the 'PackingCode' element value. Код вида упаковки/грузового места товаров в соответствии с  классификатором видов груза, упаковки и упаковочных материалов
     * 
     * @return value
     */
    public String getPackingCode() {
        return packingCode;
    }

    /** 
     * Set the 'PackingCode' element value. Код вида упаковки/грузового места товаров в соответствии с  классификатором видов груза, упаковки и упаковочных материалов
     * 
     * @param packingCode
     */
    public void setPackingCode(String packingCode) {
        this.packingCode = packingCode;
    }

    /** 
     * Get the 'PakingQuantity' element value. Количество грузовых мест/упаковок
     * 
     * @return value
     */
    public String getPakingQuantity() {
        return pakingQuantity;
    }

    /** 
     * Set the 'PakingQuantity' element value. Количество грузовых мест/упаковок
     * 
     * @param pakingQuantity
     */
    public void setPakingQuantity(String pakingQuantity) {
        this.pakingQuantity = pakingQuantity;
    }

    /** 
     * Get the 'PackingDescription' element value. Описание грузовых  мест/упаковки
     * 
     * @return value
     */
    public String getPackingDescription() {
        return packingDescription;
    }

    /** 
     * Set the 'PackingDescription' element value. Описание грузовых  мест/упаковки
     * 
     * @param packingDescription
     */
    public void setPackingDescription(String packingDescription) {
        this.packingDescription = packingDescription;
    }

    /** 
     * Get the 'PakagePartQuantity' element value. Количество упаковки/грузовых мест, частично занятых товаром
     * 
     * @return value
     */
    public String getPakagePartQuantity() {
        return pakagePartQuantity;
    }

    /** 
     * Set the 'PakagePartQuantity' element value. Количество упаковки/грузовых мест, частично занятых товаром
     * 
     * @param pakagePartQuantity
     */
    public void setPakagePartQuantity(String pakagePartQuantity) {
        this.pakagePartQuantity = pakagePartQuantity;
    }
}
