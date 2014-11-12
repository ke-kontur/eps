
package ru.acs.fts.schemas.album.actinspection;

/** 
 * ���������� �������� �������� (�������� ������� 8702 �� �� ��� ��)
 */
public class BusInspResultsType extends CommonParametersType
{
    private String arriveMode;
    private String seatPlaceNumber;
    private String standPlaceNumber;
    private String passPlaceNumber;
    private String lengthm;
    private String widthm;
    private String heightm;
    private String solarBatPresence;
    private String luggBoxNumber;
    private String luggBoxVolume;
    private String numberOfStore;
    private String seatKind;
    private String windowKind;
    private String passDoorNumber;
    private String driverCabDividingWall;
    private PodveskaType podveska;
    private BusDopDeviceType busDopDevice;
    private DamagesType damages;

    /** 
     * Get the 'ArriveMode' element value. ������������ �������� (������������ ��������) ������� (�) � �������� ������: "1" - �� ������������ ��������, "2" - � ����������(��), "3" - ����� �����
     * 
     * @return value
     */
    public String getArriveMode() {
        return arriveMode;
    }

    /** 
     * Set the 'ArriveMode' element value. ������������ �������� (������������ ��������) ������� (�) � �������� ������: "1" - �� ������������ ��������, "2" - � ����������(��), "3" - ����� �����
     * 
     * @param arriveMode
     */
    public void setArriveMode(String arriveMode) {
        this.arriveMode = arriveMode;
    }

    /** 
     * Get the 'SeatPlaceNumber' element value. ����� ���� ��� �������
     * 
     * @return value
     */
    public String getSeatPlaceNumber() {
        return seatPlaceNumber;
    }

    /** 
     * Set the 'SeatPlaceNumber' element value. ����� ���� ��� �������
     * 
     * @param seatPlaceNumber
     */
    public void setSeatPlaceNumber(String seatPlaceNumber) {
        this.seatPlaceNumber = seatPlaceNumber;
    }

    /** 
     * Get the 'StandPlaceNumber' element value. ����� ���� ��� �������
     * 
     * @return value
     */
    public String getStandPlaceNumber() {
        return standPlaceNumber;
    }

    /** 
     * Set the 'StandPlaceNumber' element value. ����� ���� ��� �������
     * 
     * @param standPlaceNumber
     */
    public void setStandPlaceNumber(String standPlaceNumber) {
        this.standPlaceNumber = standPlaceNumber;
    }

    /** 
     * Get the 'PassPlaceNumber' element value. ����� ����� ����, ������� ��������
     * 
     * @return value
     */
    public String getPassPlaceNumber() {
        return passPlaceNumber;
    }

    /** 
     * Set the 'PassPlaceNumber' element value. ����� ����� ����, ������� ��������
     * 
     * @param passPlaceNumber
     */
    public void setPassPlaceNumber(String passPlaceNumber) {
        this.passPlaceNumber = passPlaceNumber;
    }

    /** 
     * Get the 'Lengthm' element value. �����, �
     * 
     * @return value
     */
    public String getLengthm() {
        return lengthm;
    }

    /** 
     * Set the 'Lengthm' element value. �����, �
     * 
     * @param lengthm
     */
    public void setLengthm(String lengthm) {
        this.lengthm = lengthm;
    }

    /** 
     * Get the 'Widthm' element value. ������ (��� ������ ������� ����), �
     * 
     * @return value
     */
    public String getWidthm() {
        return widthm;
    }

    /** 
     * Set the 'Widthm' element value. ������ (��� ������ ������� ����), �
     * 
     * @param widthm
     */
    public void setWidthm(String widthm) {
        this.widthm = widthm;
    }

    /** 
     * Get the 'Heightm' element value. ������ (��� ������������� ��������� ��� ��������� ����� ��� �������� �������), �
     * 
     * @return value
     */
    public String getHeightm() {
        return heightm;
    }

    /** 
     * Set the 'Heightm' element value. ������ (��� ������������� ��������� ��� ��������� ����� ��� �������� �������), �
     * 
     * @param heightm
     */
    public void setHeightm(String heightm) {
        this.heightm = heightm;
    }

    /** 
     * Get the 'SolarBatPresence' element value. ������� ��������� �������������� �������: "0" - ���, "1" - ��
     * 
     * @return value
     */
    public String getSolarBatPresence() {
        return solarBatPresence;
    }

    /** 
     * Set the 'SolarBatPresence' element value. ������� ��������� �������������� �������: "0" - ���, "1" - ��
     * 
     * @param solarBatPresence
     */
    public void setSolarBatPresence(String solarBatPresence) {
        this.solarBatPresence = solarBatPresence;
    }

    /** 
     * Get the 'LuggBoxNumber' element value. ���������� �������� (��������) �������
     * 
     * @return value
     */
    public String getLuggBoxNumber() {
        return luggBoxNumber;
    }

    /** 
     * Set the 'LuggBoxNumber' element value. ���������� �������� (��������) �������
     * 
     * @param luggBoxNumber
     */
    public void setLuggBoxNumber(String luggBoxNumber) {
        this.luggBoxNumber = luggBoxNumber;
    }

    /** 
     * Get the 'LuggBoxVolume' element value. ����� ����� �������� (��������) ������� � ���������� ������
     * 
     * @return value
     */
    public String getLuggBoxVolume() {
        return luggBoxVolume;
    }

    /** 
     * Set the 'LuggBoxVolume' element value. ����� ����� �������� (��������) ������� � ���������� ������
     * 
     * @param luggBoxVolume
     */
    public void setLuggBoxVolume(String luggBoxVolume) {
        this.luggBoxVolume = luggBoxVolume;
    }

    /** 
     * Get the 'NumberOfStore' element value. ���������
     * 
     * @return value
     */
    public String getNumberOfStore() {
        return numberOfStore;
    }

    /** 
     * Set the 'NumberOfStore' element value. ���������
     * 
     * @param numberOfStore
     */
    public void setNumberOfStore(String numberOfStore) {
        this.numberOfStore = numberOfStore;
    }

    /** 
     * Get the 'SeatKind' element value. ��� ������: "1" - ������, "2" - �������, "3" - � �������� �������
     * 
     * @return value
     */
    public String getSeatKind() {
        return seatKind;
    }

    /** 
     * Set the 'SeatKind' element value. ��� ������: "1" - ������, "2" - �������, "3" - � �������� �������
     * 
     * @param seatKind
     */
    public void setSeatKind(String seatKind) {
        this.seatKind = seatKind;
    }

    /** 
     * Get the 'WindowKind' element value. ��� ���������� ������: "0" - ��� ����������, "1" - ��������� ������, "2" - ������� �����������, "3" - ������� �����������
     * 
     * @return value
     */
    public String getWindowKind() {
        return windowKind;
    }

    /** 
     * Set the 'WindowKind' element value. ��� ���������� ������: "0" - ��� ����������, "1" - ��������� ������, "2" - ������� �����������, "3" - ������� �����������
     * 
     * @param windowKind
     */
    public void setWindowKind(String windowKind) {
        this.windowKind = windowKind;
    }

    /** 
     * Get the 'PassDoorNumber' element value. ���������� ������ ��� ����������
     * 
     * @return value
     */
    public String getPassDoorNumber() {
        return passDoorNumber;
    }

    /** 
     * Set the 'PassDoorNumber' element value. ���������� ������ ��� ����������
     * 
     * @param passDoorNumber
     */
    public void setPassDoorNumber(String passDoorNumber) {
        this.passDoorNumber = passDoorNumber;
    }

    /** 
     * Get the 'DriverCabDividingWall' element value. �����������, ���������� ����� ��������
     * 
     * @return value
     */
    public String getDriverCabDividingWall() {
        return driverCabDividingWall;
    }

    /** 
     * Set the 'DriverCabDividingWall' element value. �����������, ���������� ����� ��������
     * 
     * @param driverCabDividingWall
     */
    public void setDriverCabDividingWall(String driverCabDividingWall) {
        this.driverCabDividingWall = driverCabDividingWall;
    }

    /** 
     * Get the 'Podveska' element value. ��� ��������
     * 
     * @return value
     */
    public PodveskaType getPodveska() {
        return podveska;
    }

    /** 
     * Set the 'Podveska' element value. ��� ��������
     * 
     * @param podveska
     */
    public void setPodveska(PodveskaType podveska) {
        this.podveska = podveska;
    }

    /** 
     * Get the 'BusDopDevice' element value. �������������� ������������ � ��������
     * 
     * @return value
     */
    public BusDopDeviceType getBusDopDevice() {
        return busDopDevice;
    }

    /** 
     * Set the 'BusDopDevice' element value. �������������� ������������ � ��������
     * 
     * @param busDopDevice
     */
    public void setBusDopDevice(BusDopDeviceType busDopDevice) {
        this.busDopDevice = busDopDevice;
    }

    /** 
     * Get the 'Damages' element value.
     * 
     * @return value
     */
    public DamagesType getDamages() {
        return damages;
    }

    /** 
     * Set the 'Damages' element value.
     * 
     * @param damages
     */
    public void setDamages(DamagesType damages) {
        this.damages = damages;
    }
}
