
package ru.acs.fts.schemas.album.passengermanifest;

/** 
 * Список пассажиров
 */
public class PassengersListType
{
    private String passNumber;

    /** 
     * Get the 'PassNumber' element value. Количество пассажиров данного класса
     * 
     * @return value
     */
    public String getPassNumber() {
        return passNumber;
    }

    /** 
     * Set the 'PassNumber' element value. Количество пассажиров данного класса
     * 
     * @param passNumber
     */
    public void setPassNumber(String passNumber) {
        this.passNumber = passNumber;
    }
}
