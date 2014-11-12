
package ru.acs.fts.schemas.album.actinspection;

/** 
 * ���������, �������� ������� � ����������
 */
public class TruckParametersType
{
    private String driveCapstanNumber;
    private String compositing;
    private String sleepPlaceNumber;
    private String skatnost;

    /** 
     * Get the 'DriveCapstanNumber' element value. ����� ������� ����
     * 
     * @return value
     */
    public String getDriveCapstanNumber() {
        return driveCapstanNumber;
    }

    /** 
     * Set the 'DriveCapstanNumber' element value. ����� ������� ����
     * 
     * @param driveCapstanNumber
     */
    public void setDriveCapstanNumber(String driveCapstanNumber) {
        this.driveCapstanNumber = driveCapstanNumber;
    }

    /** 
     * Get the 'Compositing' element value. ����������: "1" - ������ �� ���������� (��������), "2" - ������ ��� ���������� (�����������)
     * 
     * @return value
     */
    public String getCompositing() {
        return compositing;
    }

    /** 
     * Set the 'Compositing' element value. ����������: "1" - ������ �� ���������� (��������), "2" - ������ ��� ���������� (�����������)
     * 
     * @param compositing
     */
    public void setCompositing(String compositing) {
        this.compositing = compositing;
    }

    /** 
     * Get the 'SleepPlaceNumber' element value. ���������� �������� ���� ("0" - � ������ ���������� �������� ����)
     * 
     * @return value
     */
    public String getSleepPlaceNumber() {
        return sleepPlaceNumber;
    }

    /** 
     * Set the 'SleepPlaceNumber' element value. ���������� �������� ���� ("0" - � ������ ���������� �������� ����)
     * 
     * @param sleepPlaceNumber
     */
    public void setSleepPlaceNumber(String sleepPlaceNumber) {
        this.sleepPlaceNumber = sleepPlaceNumber;
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
}
