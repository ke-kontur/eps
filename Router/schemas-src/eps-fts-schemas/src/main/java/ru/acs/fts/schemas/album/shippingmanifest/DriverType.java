
package ru.acs.fts.schemas.album.shippingmanifest;

/** 
 * �������� � �������� 
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
     * Get the 'Name' element value. ��� �������� 
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ��� �������� 
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'DrivingLicenceSeries' element value. ����� ������������� ������������� 
     * 
     * @return value
     */
    public String getDrivingLicenceSeries() {
        return drivingLicenceSeries;
    }

    /** 
     * Set the 'DrivingLicenceSeries' element value. ����� ������������� ������������� 
     * 
     * @param drivingLicenceSeries
     */
    public void setDrivingLicenceSeries(String drivingLicenceSeries) {
        this.drivingLicenceSeries = drivingLicenceSeries;
    }

    /** 
     * Get the 'DrivingLicenceNumber' element value. ����� ������������� ������������� 
     * 
     * @return value
     */
    public String getDrivingLicenceNumber() {
        return drivingLicenceNumber;
    }

    /** 
     * Set the 'DrivingLicenceNumber' element value. ����� ������������� ������������� 
     * 
     * @param drivingLicenceNumber
     */
    public void setDrivingLicenceNumber(String drivingLicenceNumber) {
        this.drivingLicenceNumber = drivingLicenceNumber;
    }

    /** 
     * Get the 'DriverLicensingCard' element value. ������������ �������� �������� 
     * 
     * @return value
     */
    public DriverLicensingCardType getDriverLicensingCard() {
        return driverLicensingCard;
    }

    /** 
     * Set the 'DriverLicensingCard' element value. ������������ �������� �������� 
     * 
     * @param driverLicensingCard
     */
    public void setDriverLicensingCard(
            DriverLicensingCardType driverLicensingCard) {
        this.driverLicensingCard = driverLicensingCard;
    }

    /** 
     * Get the 'PreMedCheck' element value. ���� � ����� ���������� ������������� ������������ ������� ��������
     * 
     * @return value
     */
    public MedCheckType getPreMedCheck() {
        return preMedCheck;
    }

    /** 
     * Set the 'PreMedCheck' element value. ���� � ����� ���������� ������������� ������������ ������� ��������
     * 
     * @param preMedCheck
     */
    public void setPreMedCheck(MedCheckType preMedCheck) {
        this.preMedCheck = preMedCheck;
    }

    /** 
     * Get the 'PostMedCheck' element value. ���� � ����� ���������� �������������� ������������ ������� ��������
     * 
     * @return value
     */
    public MedCheckType getPostMedCheck() {
        return postMedCheck;
    }

    /** 
     * Set the 'PostMedCheck' element value. ���� � ����� ���������� �������������� ������������ ������� ��������
     * 
     * @param postMedCheck
     */
    public void setPostMedCheck(MedCheckType postMedCheck) {
        this.postMedCheck = postMedCheck;
    }
}
