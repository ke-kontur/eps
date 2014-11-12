
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Сведения об организации. Особенности Республики Беларусь
 */
public class RBOrganizationFeaturesType
{
    private String UNP;
    private String RBIdentificationNumber;

    /** 
     * Get the 'UNP' element value. Учетный номер плательщика (УНП)
     * 
     * @return value
     */
    public String getUNP() {
        return UNP;
    }

    /** 
     * Set the 'UNP' element value. Учетный номер плательщика (УНП)
     * 
     * @param UNP
     */
    public void setUNP(String UNP) {
        this.UNP = UNP;
    }

    /** 
     * Get the 'RBIdentificationNumber' element value. Идентификационный номер физического лица
     * 
     * @return value
     */
    public String getRBIdentificationNumber() {
        return RBIdentificationNumber;
    }

    /** 
     * Set the 'RBIdentificationNumber' element value. Идентификационный номер физического лица
     * 
     * @param RBIdentificationNumber
     */
    public void setRBIdentificationNumber(String RBIdentificationNumber) {
        this.RBIdentificationNumber = RBIdentificationNumber;
    }
}
