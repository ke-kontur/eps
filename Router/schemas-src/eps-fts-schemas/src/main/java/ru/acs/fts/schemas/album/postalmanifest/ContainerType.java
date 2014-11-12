
package ru.acs.fts.schemas.album.postalmanifest;

/** 
 * Сведения об используемых контейнерах
 */
public class ContainerType
{
    private String containerNumber;
    private String stampNumber;

    /** 
     * Get the 'ContainerNumber' element value. Номер контейнера
     * 
     * @return value
     */
    public String getContainerNumber() {
        return containerNumber;
    }

    /** 
     * Set the 'ContainerNumber' element value. Номер контейнера
     * 
     * @param containerNumber
     */
    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }

    /** 
     * Get the 'StampNumber' element value. Номер печати
     * 
     * @return value
     */
    public String getStampNumber() {
        return stampNumber;
    }

    /** 
     * Set the 'StampNumber' element value. Номер печати
     * 
     * @param stampNumber
     */
    public void setStampNumber(String stampNumber) {
        this.stampNumber = stampNumber;
    }
}
