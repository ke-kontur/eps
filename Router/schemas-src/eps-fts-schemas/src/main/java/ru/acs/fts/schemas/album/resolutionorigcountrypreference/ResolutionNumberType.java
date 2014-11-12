
package ru.acs.fts.schemas.album.resolutionorigcountrypreference;

/** 
 * Номер решения
 */
public class ResolutionNumberType
{
    private String customsCode;
    private String nomenclatureNumber;
    private String serialNumber;

    /** 
     * Get the 'CustomsCode' element value. Код таможенного поста
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного поста
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'NomenclatureNumber' element value. Номер дела по номенклатуре
     * 
     * @return value
     */
    public String getNomenclatureNumber() {
        return nomenclatureNumber;
    }

    /** 
     * Set the 'NomenclatureNumber' element value. Номер дела по номенклатуре
     * 
     * @param nomenclatureNumber
     */
    public void setNomenclatureNumber(String nomenclatureNumber) {
        this.nomenclatureNumber = nomenclatureNumber;
    }

    /** 
     * Get the 'SerialNumber' element value. Порядковый номер
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. Порядковый номер
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
