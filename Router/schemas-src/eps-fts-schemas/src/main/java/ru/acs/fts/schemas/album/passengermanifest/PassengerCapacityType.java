
package ru.acs.fts.schemas.album.passengermanifest;

/** 
 * Пассажировместимость судна
 */
public class PassengerCapacityType
{
    private String FClassNumber;
    private String JClassNumber;
    private String YClassNumber;

    /** 
     * Get the 'FClassNumber' element value. Число  мест для пассажиров первого класса
     * 
     * @return value
     */
    public String getFClassNumber() {
        return FClassNumber;
    }

    /** 
     * Set the 'FClassNumber' element value. Число  мест для пассажиров первого класса
     * 
     * @param FClassNumber
     */
    public void setFClassNumber(String FClassNumber) {
        this.FClassNumber = FClassNumber;
    }

    /** 
     * Get the 'JClassNumber' element value. Число  мест для пассажиров бизнес-класса
     * 
     * @return value
     */
    public String getJClassNumber() {
        return JClassNumber;
    }

    /** 
     * Set the 'JClassNumber' element value. Число  мест для пассажиров бизнес-класса
     * 
     * @param JClassNumber
     */
    public void setJClassNumber(String JClassNumber) {
        this.JClassNumber = JClassNumber;
    }

    /** 
     * Get the 'YClassNumber' element value. Число  мест для пассажиров эконом-класса
     * 
     * @return value
     */
    public String getYClassNumber() {
        return YClassNumber;
    }

    /** 
     * Set the 'YClassNumber' element value. Число  мест для пассажиров эконом-класса
     * 
     * @param YClassNumber
     */
    public void setYClassNumber(String YClassNumber) {
        this.YClassNumber = YClassNumber;
    }
}
