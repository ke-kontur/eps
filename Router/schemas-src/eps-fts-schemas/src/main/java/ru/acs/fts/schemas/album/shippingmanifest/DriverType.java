
package ru.acs.fts.schemas.album.shippingmanifest;

/** 
 * Сведения о водителе 
 */
public class DriverType
{
    private String name;
    private String drivingLicenceSeries;
    private String drivingLicenceNumber;
    private DriverLicensingCardType driverLicensingCard;
    private MedCheckType preMedCheck;
    private MedCheckType postMedCheck;

    /** 
     * Get the 'Name' element value. ФИО водителя 
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ФИО водителя 
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'DrivingLicenceSeries' element value. Серия водительского удостоверения 
     * 
     * @return value
     */
    public String getDrivingLicenceSeries() {
        return drivingLicenceSeries;
    }

    /** 
     * Set the 'DrivingLicenceSeries' element value. Серия водительского удостоверения 
     * 
     * @param drivingLicenceSeries
     */
    public void setDrivingLicenceSeries(String drivingLicenceSeries) {
        this.drivingLicenceSeries = drivingLicenceSeries;
    }

    /** 
     * Get the 'DrivingLicenceNumber' element value. Номер водительского удостоверения 
     * 
     * @return value
     */
    public String getDrivingLicenceNumber() {
        return drivingLicenceNumber;
    }

    /** 
     * Set the 'DrivingLicenceNumber' element value. Номер водительского удостоверения 
     * 
     * @param drivingLicenceNumber
     */
    public void setDrivingLicenceNumber(String drivingLicenceNumber) {
        this.drivingLicenceNumber = drivingLicenceNumber;
    }

    /** 
     * Get the 'DriverLicensingCard' element value. Лицензионная карточка водителя 
     * 
     * @return value
     */
    public DriverLicensingCardType getDriverLicensingCard() {
        return driverLicensingCard;
    }

    /** 
     * Set the 'DriverLicensingCard' element value. Лицензионная карточка водителя 
     * 
     * @param driverLicensingCard
     */
    public void setDriverLicensingCard(
            DriverLicensingCardType driverLicensingCard) {
        this.driverLicensingCard = driverLicensingCard;
    }

    /** 
     * Get the 'PreMedCheck' element value. Дата и время проведения предрейсового медицинского осмотра водителя
     * 
     * @return value
     */
    public MedCheckType getPreMedCheck() {
        return preMedCheck;
    }

    /** 
     * Set the 'PreMedCheck' element value. Дата и время проведения предрейсового медицинского осмотра водителя
     * 
     * @param preMedCheck
     */
    public void setPreMedCheck(MedCheckType preMedCheck) {
        this.preMedCheck = preMedCheck;
    }

    /** 
     * Get the 'PostMedCheck' element value. Дата и время проведения послерейсового медицинского осмотра водителя
     * 
     * @return value
     */
    public MedCheckType getPostMedCheck() {
        return postMedCheck;
    }

    /** 
     * Set the 'PostMedCheck' element value. Дата и время проведения послерейсового медицинского осмотра водителя
     * 
     * @param postMedCheck
     */
    public void setPostMedCheck(MedCheckType postMedCheck) {
        this.postMedCheck = postMedCheck;
    }
}
