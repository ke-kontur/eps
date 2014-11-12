
package ru.acs.fts.schemas.album.automobileinsurancepolicy;

/** 
 * Сведения о лицах допущенных к управлению транспортного средства
 */
public class AllowedPersonsType
{
    private String persNumeric;
    private String name;
    private String drivingLicenceSeriesCode;
    private String drivingLicenceNumeric;
    private String restrictionIndicator;

    /** 
     * Get the 'PersNumeric' element value. Порядковый номер лица
     * 
     * @return value
     */
    public String getPersNumeric() {
        return persNumeric;
    }

    /** 
     * Set the 'PersNumeric' element value. Порядковый номер лица
     * 
     * @param persNumeric
     */
    public void setPersNumeric(String persNumeric) {
        this.persNumeric = persNumeric;
    }

    /** 
     * Get the 'Name' element value. ФИО лица, допущенного к управлению транспортным средством
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ФИО лица, допущенного к управлению транспортным средством
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'DrivingLicenceSeriesCode' element value. Серия водительского удостоверения
     * 
     * @return value
     */
    public String getDrivingLicenceSeriesCode() {
        return drivingLicenceSeriesCode;
    }

    /** 
     * Set the 'DrivingLicenceSeriesCode' element value. Серия водительского удостоверения
     * 
     * @param drivingLicenceSeriesCode
     */
    public void setDrivingLicenceSeriesCode(String drivingLicenceSeriesCode) {
        this.drivingLicenceSeriesCode = drivingLicenceSeriesCode;
    }

    /** 
     * Get the 'DrivingLicenceNumeric' element value. Номер водительского удостоверения
     * 
     * @return value
     */
    public String getDrivingLicenceNumeric() {
        return drivingLicenceNumeric;
    }

    /** 
     * Set the 'DrivingLicenceNumeric' element value. Номер водительского удостоверения
     * 
     * @param drivingLicenceNumeric
     */
    public void setDrivingLicenceNumeric(String drivingLicenceNumeric) {
        this.drivingLicenceNumeric = drivingLicenceNumeric;
    }

    /** 
     * Get the 'RestrictionIndicator' element value. Резерв.  Индикатор ограничений (да /нет)
     * 
     * @return value
     */
    public String getRestrictionIndicator() {
        return restrictionIndicator;
    }

    /** 
     * Set the 'RestrictionIndicator' element value. Резерв.  Индикатор ограничений (да /нет)
     * 
     * @param restrictionIndicator
     */
    public void setRestrictionIndicator(String restrictionIndicator) {
        this.restrictionIndicator = restrictionIndicator;
    }
}
