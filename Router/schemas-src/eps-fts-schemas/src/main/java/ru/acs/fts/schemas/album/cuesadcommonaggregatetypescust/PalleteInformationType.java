
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * Сведения о поддонах и паллетах
 */
public class PalleteInformationType
{
    private String palleteQuantity;
    private String palleteDescription;
    private String palleteCode;

    /** 
     * Get the 'PalleteQuantity' element value. Количество поддонов
     * 
     * @return value
     */
    public String getPalleteQuantity() {
        return palleteQuantity;
    }

    /** 
     * Set the 'PalleteQuantity' element value. Количество поддонов
     * 
     * @param palleteQuantity
     */
    public void setPalleteQuantity(String palleteQuantity) {
        this.palleteQuantity = palleteQuantity;
    }

    /** 
     * Get the 'PalleteDescription' element value. Описание поддонов
     * 
     * @return value
     */
    public String getPalleteDescription() {
        return palleteDescription;
    }

    /** 
     * Set the 'PalleteDescription' element value. Описание поддонов
     * 
     * @param palleteDescription
     */
    public void setPalleteDescription(String palleteDescription) {
        this.palleteDescription = palleteDescription;
    }

    /** 
     * Get the 'PalleteCode' element value. Код вида поддона в соответствии с классификатором видов груза, упаковки и упаковочных материалов 
     * 
     * @return value
     */
    public String getPalleteCode() {
        return palleteCode;
    }

    /** 
     * Set the 'PalleteCode' element value. Код вида поддона в соответствии с классификатором видов груза, упаковки и упаковочных материалов 
     * 
     * @param palleteCode
     */
    public void setPalleteCode(String palleteCode) {
        this.palleteCode = palleteCode;
    }
}
