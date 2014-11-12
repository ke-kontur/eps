
package ru.acs.fts.schemas.album.qualificationcertificate;

/** 
 * Регистрационный номер квалификационного аттестата.
 */
public class RegistrationNumberCertificateType
{
    private String numberManagement;
    private String date;
    private String serialNumber;

    /** 
     * Get the 'NumberManagement' element value. Кодов региональных таможенных управлений
     * 
     * @return value
     */
    public String getNumberManagement() {
        return numberManagement;
    }

    /** 
     * Set the 'NumberManagement' element value. Кодов региональных таможенных управлений
     * 
     * @param numberManagement
     */
    public void setNumberManagement(String numberManagement) {
        this.numberManagement = numberManagement;
    }

    /** 
     * Get the 'Date' element value. Дата проведения квалификационного экзамена
     * 
     * @return value
     */
    public String getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата проведения квалификационного экзамена
     * 
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /** 
     * Get the 'SerialNumber' element value. Порядковый номер аттестата
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. Порядковый номер аттестата
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
