
package ru.acs.fts.schemas.album.actinspection;

/** 
 * ���������� �������� �������, ����������� (�������� ������� 8716 �� �� ��� ��)
 */
public class TrailerInspResultsType extends CommonParametersType
{
    private String arriveMode;
    private String skatnost;
    private PodveskaType podveska;
    private CargoPlaceType cargoPlace;
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
     * Get the 'Skatnost' element value. ������ ������ ����: "1" - �����������, "2" - ����������
     * 
     * @return value
     */
    public String getSkatnost() {
        return skatnost;
    }

    /** 
     * Set the 'Skatnost' element value. ������ ������ ����: "1" - �����������, "2" - ����������
     * 
     * @param skatnost
     */
    public void setSkatnost(String skatnost) {
        this.skatnost = skatnost;
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
