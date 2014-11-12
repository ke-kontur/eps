
package ru.acs.fts.schemas.album.actinspection;

/** 
 * ���������� �������� ���������� ������ (�������� ������� 8701 �� �� ��� ��)
 */
public class AMTInspResultsType extends CommonParametersType
{
    private String arriveMode;
    private String highCeiling;
    private PodveskaType podveska;
    private TruckParametersType truckParameters;
    private AMTDopDeviceType AMTDopDevice;
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
     * Get the 'HighCeiling' element value. ������� �������� �������: "0" - ���, "1" - ����
     * 
     * @return value
     */
    public String getHighCeiling() {
        return highCeiling;
    }

    /** 
     * Set the 'HighCeiling' element value. ������� �������� �������: "0" - ���, "1" - ����
     * 
     * @param highCeiling
     */
    public void setHighCeiling(String highCeiling) {
        this.highCeiling = highCeiling;
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
     * Get the 'AMTDopDevice' element value. �������������� ������������ � ������
     * 
     * @return value
     */
    public AMTDopDeviceType getAMTDopDevice() {
        return AMTDopDevice;
    }

    /** 
     * Set the 'AMTDopDevice' element value. �������������� ������������ � ������
     * 
     * @param AMTDopDevice
     */
    public void setAMTDopDevice(AMTDopDeviceType AMTDopDevice) {
        this.AMTDopDevice = AMTDopDevice;
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
