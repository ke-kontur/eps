
package ru.acs.fts.schemas.album.woodshipingspecification;

/** 
 * Информация о стандартах
 */
public class StandartsInfoType
{
    private String govermentStandart;
    private String woodSpecies;
    private String wetness;
    private String conversRate;
    private String tonnage;

    /** 
     * Get the 'GovermentStandart' element value. Номер ГОСТа
     * 
     * @return value
     */
    public String getGovermentStandart() {
        return govermentStandart;
    }

    /** 
     * Set the 'GovermentStandart' element value. Номер ГОСТа
     * 
     * @param govermentStandart
     */
    public void setGovermentStandart(String govermentStandart) {
        this.govermentStandart = govermentStandart;
    }

    /** 
     * Get the 'WoodSpecies' element value. Порода
     * 
     * @return value
     */
    public String getWoodSpecies() {
        return woodSpecies;
    }

    /** 
     * Set the 'WoodSpecies' element value. Порода
     * 
     * @param woodSpecies
     */
    public void setWoodSpecies(String woodSpecies) {
        this.woodSpecies = woodSpecies;
    }

    /** 
     * Get the 'Wetness' element value. Влажность
     * 
     * @return value
     */
    public String getWetness() {
        return wetness;
    }

    /** 
     * Set the 'Wetness' element value. Влажность
     * 
     * @param wetness
     */
    public void setWetness(String wetness) {
        this.wetness = wetness;
    }

    /** 
     * Get the 'ConversRate' element value. Переводной коэффициент
     * 
     * @return value
     */
    public String getConversRate() {
        return conversRate;
    }

    /** 
     * Set the 'ConversRate' element value. Переводной коэффициент
     * 
     * @param conversRate
     */
    public void setConversRate(String conversRate) {
        this.conversRate = conversRate;
    }

    /** 
     * Get the 'Tonnage' element value. Масса груза в тоннах
     * 
     * @return value
     */
    public String getTonnage() {
        return tonnage;
    }

    /** 
     * Set the 'Tonnage' element value. Масса груза в тоннах
     * 
     * @param tonnage
     */
    public void setTonnage(String tonnage) {
        this.tonnage = tonnage;
    }
}
