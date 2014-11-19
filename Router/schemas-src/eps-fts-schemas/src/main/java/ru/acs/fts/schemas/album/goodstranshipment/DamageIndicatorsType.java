
package ru.acs.fts.schemas.album.goodstranshipment;

/** 
 * Признаки наличия повреждений
 */
public class DamageIndicatorsType
{
    private String isCargoApartmentDamaged;
    private String isSealsDamaged;

    /** 
     * Get the 'IsCargoApartmentDamaged' element value. Признак повреждения грузового отделения
     * 
     * @return value
     */
    public String getIsCargoApartmentDamaged() {
        return isCargoApartmentDamaged;
    }

    /** 
     * Set the 'IsCargoApartmentDamaged' element value. Признак повреждения грузового отделения
     * 
     * @param isCargoApartmentDamaged
     */
    public void setIsCargoApartmentDamaged(String isCargoApartmentDamaged) {
        this.isCargoApartmentDamaged = isCargoApartmentDamaged;
    }

    /** 
     * Get the 'IsSealsDamaged' element value. Признак повреждения пломб
     * 
     * @return value
     */
    public String getIsSealsDamaged() {
        return isSealsDamaged;
    }

    /** 
     * Set the 'IsSealsDamaged' element value. Признак повреждения пломб
     * 
     * @param isSealsDamaged
     */
    public void setIsSealsDamaged(String isSealsDamaged) {
        this.isSealsDamaged = isSealsDamaged;
    }
}
