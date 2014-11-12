
package ru.acs.fts.schemas.album.realestateexcerpt;

/** 
 * Адрес
 */
public class AddressType
        extends
            ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType
{
    private String KLADRCode;
    private String OKATO;
    private String unformalizedDescription;
    private AddressElementType district;
    private AddressElementType urbanDistrict;
    private AddressElementType ruralPlace;

    /** 
     * Get the 'KLADRCode' element value. Код адреса по КЛАДР
     * 
     * @return value
     */
    public String getKLADRCode() {
        return KLADRCode;
    }

    /** 
     * Set the 'KLADRCode' element value. Код адреса по КЛАДР
     * 
     * @param KLADRCode
     */
    public void setKLADRCode(String KLADRCode) {
        this.KLADRCode = KLADRCode;
    }

    /** 
     * Get the 'OKATO' element value. ОКАТО
     * 
     * @return value
     */
    public String getOKATO() {
        return OKATO;
    }

    /** 
     * Set the 'OKATO' element value. ОКАТО
     * 
     * @param OKATO
     */
    public void setOKATO(String OKATO) {
        this.OKATO = OKATO;
    }

    /** 
     * Get the 'UnformalizedDescription' element value. Неформализованное описание
     * 
     * @return value
     */
    public String getUnformalizedDescription() {
        return unformalizedDescription;
    }

    /** 
     * Set the 'UnformalizedDescription' element value. Неформализованное описание
     * 
     * @param unformalizedDescription
     */
    public void setUnformalizedDescription(String unformalizedDescription) {
        this.unformalizedDescription = unformalizedDescription;
    }

    /** 
     * Get the 'District' element value. Район
     * 
     * @return value
     */
    public AddressElementType getDistrict() {
        return district;
    }

    /** 
     * Set the 'District' element value. Район
     * 
     * @param district
     */
    public void setDistrict(AddressElementType district) {
        this.district = district;
    }

    /** 
     * Get the 'UrbanDistrict' element value. Городской район
     * 
     * @return value
     */
    public AddressElementType getUrbanDistrict() {
        return urbanDistrict;
    }

    /** 
     * Set the 'UrbanDistrict' element value. Городской район
     * 
     * @param urbanDistrict
     */
    public void setUrbanDistrict(AddressElementType urbanDistrict) {
        this.urbanDistrict = urbanDistrict;
    }

    /** 
     * Get the 'RuralPlace' element value. Сельсовет
     * 
     * @return value
     */
    public AddressElementType getRuralPlace() {
        return ruralPlace;
    }

    /** 
     * Set the 'RuralPlace' element value. Сельсовет
     * 
     * @param ruralPlace
     */
    public void setRuralPlace(AddressElementType ruralPlace) {
        this.ruralPlace = ruralPlace;
    }
}
