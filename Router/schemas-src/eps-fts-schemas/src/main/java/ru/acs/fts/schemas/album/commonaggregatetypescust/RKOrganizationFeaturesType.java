
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Сведения об организации. Особенности Республики Казахстан
 */
public class RKOrganizationFeaturesType
{
    private String BIN;
    private String IIN;
    private ITNKZType ITN;

    /** 
     * Get the 'BIN' element value. Бизнес-идентификационный номер (БИН)
     * 
     * @return value
     */
    public String getBIN() {
        return BIN;
    }

    /** 
     * Set the 'BIN' element value. Бизнес-идентификационный номер (БИН)
     * 
     * @param BIN
     */
    public void setBIN(String BIN) {
        this.BIN = BIN;
    }

    /** 
     * Get the 'IIN' element value. Индивидуальный идентификационный номер (ИИН)
     * 
     * @return value
     */
    public String getIIN() {
        return IIN;
    }

    /** 
     * Set the 'IIN' element value. Индивидуальный идентификационный номер (ИИН)
     * 
     * @param IIN
     */
    public void setIIN(String IIN) {
        this.IIN = IIN;
    }

    /** 
     * Get the 'ITN' element value. Идентификационный таможенный номер (ИТН)
     * 
     * @return value
     */
    public ITNKZType getITN() {
        return ITN;
    }

    /** 
     * Set the 'ITN' element value. Идентификационный таможенный номер (ИТН)
     * 
     * @param ITN
     */
    public void setITN(ITNKZType ITN) {
        this.ITN = ITN;
    }
}
