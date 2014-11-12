
package ru.acs.fts.schemas.album.actinspection;

/** 
 * ���������� �������� ��������� ���������� (�������� ������� 8704 �� �� ��� ��)
 */
public class TruckInspResultsType extends CommonParametersType
{
    private String arriveMode;
    private String duoCabPresence;
    private TruckParametersType truckParameters;
    private CargoPlaceType cargoPlace;
    private TruckDopDeviceType truckDopDevice;
    private PodveskaType podveska;
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
     * Get the 'DuoCabPresence' element value. ������� ��������� ������: "0" - ���, "1" - ��
     * 
     * @return value
     */
    public String getDuoCabPresence() {
        return duoCabPresence;
    }

    /** 
     * Set the 'DuoCabPresence' element value. ������� ��������� ������: "0" - ���, "1" - ��
     * 
     * @param duoCabPresence
     */
    public void setDuoCabPresence(String duoCabPresence) {
        this.duoCabPresence = duoCabPresence;
    }

    /** 
     * Get the 'TruckParameters' element value. ���������, �������� ������� � ����������
     * 
     * @return value
     */
    public TruckParametersType getTruckParameters() {
        return truckParameters;
    }

    /** 
     * Set the 'TruckParameters' element value. ���������, �������� ������� � ����������
     * 
     * @param truckParameters
     */
    public void setTruckParameters(TruckParametersType truckParameters) {
        this.truckParameters = truckParameters;
    }

    /** 
     * Get the 'CargoPlace' element value. �������������� ��������� �����
     * 
     * @return value
     */
    public CargoPlaceType getCargoPlace() {
        return cargoPlace;
    }

    /** 
     * Set the 'CargoPlace' element value. �������������� ��������� �����
     * 
     * @param cargoPlace
     */
    public void setCargoPlace(CargoPlaceType cargoPlace) {
        this.cargoPlace = cargoPlace;
    }

    /** 
     * Get the 'TruckDopDevice' element value. �������������� ������������ � �������� ����������
     * 
     * @return value
     */
    public TruckDopDeviceType getTruckDopDevice() {
        return truckDopDevice;
    }

    /** 
     * Set the 'TruckDopDevice' element value. �������������� ������������ � �������� ����������
     * 
     * @param truckDopDevice
     */
    public void setTruckDopDevice(TruckDopDeviceType truckDopDevice) {
        this.truckDopDevice = truckDopDevice;
    }

    /** 
     * Get the 'Podveska' element value. �������� �����
     * 
     * @return value
     */
    public PodveskaType getPodveska() {
        return podveska;
    }

    /** 
     * Set the 'Podveska' element value. �������� �����
     * 
     * @param podveska
     */
    public void setPodveska(PodveskaType podveska) {
        this.podveska = podveska;
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
