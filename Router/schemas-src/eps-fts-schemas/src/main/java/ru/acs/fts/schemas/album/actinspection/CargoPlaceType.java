
package ru.acs.fts.schemas.album.actinspection;

/** 
 * �������������� ��������� �����
 */
public class CargoPlaceType
{
    private String cargoPlaceKind;
    private String lengthm;
    private String widthm;
    private String heightm;

    /** 
     * Get the 'CargoPlaceKind' element value. ��� ��������� �����: "1" - ���������, "2" - �������� ��������� � ������, "3" - �������� - ������������� ���������, "4" - �������� - ������������� ���������, "5" - �������� - ������������� ���������, "6" - ��������, "7" - �����-��������, "8" - ������ ������, "9" - �������������� ������, "10" - ��������������� ������, "11" - ������������ ����, "12" - ����������������� ������ �������� ����������, "13" - ������
     * 
     * @return value
     */
    public String getCargoPlaceKind() {
        return cargoPlaceKind;
    }

    /** 
     * Set the 'CargoPlaceKind' element value. ��� ��������� �����: "1" - ���������, "2" - �������� ��������� � ������, "3" - �������� - ������������� ���������, "4" - �������� - ������������� ���������, "5" - �������� - ������������� ���������, "6" - ��������, "7" - �����-��������, "8" - ������ ������, "9" - �������������� ������, "10" - ��������������� ������, "11" - ������������ ����, "12" - ����������������� ������ �������� ����������, "13" - ������
     * 
     * @param cargoPlaceKind
     */
    public void setCargoPlaceKind(String cargoPlaceKind) {
        this.cargoPlaceKind = cargoPlaceKind;
    }

    /** 
     * Get the 'Lengthm' element value. ����� �������� �������� ���������, �
     * 
     * @return value
     */
    public String getLengthm() {
        return lengthm;
    }

    /** 
     * Set the 'Lengthm' element value. ����� �������� �������� ���������, �
     * 
     * @param lengthm
     */
    public void setLengthm(String lengthm) {
        this.lengthm = lengthm;
    }

    /** 
     * Get the 'Widthm' element value. ������ �������� �������� ���������, �
     * 
     * @return value
     */
    public String getWidthm() {
        return widthm;
    }

    /** 
     * Set the 'Widthm' element value. ������ �������� �������� ���������, �
     * 
     * @param widthm
     */
    public void setWidthm(String widthm) {
        this.widthm = widthm;
    }

    /** 
     * Get the 'Heightm' element value. ������ ��������� ������ �������, �
     * 
     * @return value
     */
    public String getHeightm() {
        return heightm;
    }

    /** 
     * Set the 'Heightm' element value. ������ ��������� ������ �������, �
     * 
     * @param heightm
     */
    public void setHeightm(String heightm) {
        this.heightm = heightm;
    }
}
