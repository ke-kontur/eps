
package ru.acs.fts.schemas.album.actinspection;

/** 
 * Параметры, присущие тягачам и грузовикам
 */
public class TruckParametersType
{
    private String driveCapstanNumber;
    private String compositing;
    private String sleepPlaceNumber;
    private String skatnost;

    /** 
     * Get the 'DriveCapstanNumber' element value. Число ведущих осей
     * 
     * @return value
     */
    public String getDriveCapstanNumber() {
        return driveCapstanNumber;
    }

    /** 
     * Set the 'DriveCapstanNumber' element value. Число ведущих осей
     * 
     * @param driveCapstanNumber
     */
    public void setDriveCapstanNumber(String driveCapstanNumber) {
        this.driveCapstanNumber = driveCapstanNumber;
    }

    /** 
     * Get the 'Compositing' element value. Компоновка: "1" - кабина за двигателем (капотная), "2" - кабина над двигателем (бескапотная)
     * 
     * @return value
     */
    public String getCompositing() {
        return compositing;
    }

    /** 
     * Set the 'Compositing' element value. Компоновка: "1" - кабина за двигателем (капотная), "2" - кабина над двигателем (бескапотная)
     * 
     * @param compositing
     */
    public void setCompositing(String compositing) {
        this.compositing = compositing;
    }

    /** 
     * Get the 'SleepPlaceNumber' element value. Количество спальных мест ("0" - в случае отсутствия спальных мест)
     * 
     * @return value
     */
    public String getSleepPlaceNumber() {
        return sleepPlaceNumber;
    }

    /** 
     * Set the 'SleepPlaceNumber' element value. Количество спальных мест ("0" - в случае отсутствия спальных мест)
     * 
     * @param sleepPlaceNumber
     */
    public void setSleepPlaceNumber(String sleepPlaceNumber) {
        this.sleepPlaceNumber = sleepPlaceNumber;
    }

    /** 
     * Get the 'Skatnost' element value. Колеса задних осей: "1" - односкатные, "2" - двускатные
     * 
     * @return value
     */
    public String getSkatnost() {
        return skatnost;
    }

    /** 
     * Set the 'Skatnost' element value. Колеса задних осей: "1" - односкатные, "2" - двускатные
     * 
     * @param skatnost
     */
    public void setSkatnost(String skatnost) {
        this.skatnost = skatnost;
    }
}
