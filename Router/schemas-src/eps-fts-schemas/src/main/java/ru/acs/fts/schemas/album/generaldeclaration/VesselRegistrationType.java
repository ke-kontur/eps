
package ru.acs.fts.schemas.album.generaldeclaration;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.VesselType;

/** 
 * Реквизиты и характеристики судна, сведения о регистрации судна
 */
public class VesselRegistrationType extends VesselType
{
    private LocalDate registrationDate;
    private String registrationID;
    private String registrationPort;
    private String grossTonnage;
    private String netTonnage;
    private String IMO;
    private String flag;
    private String vesselType1;

    /** 
     * Get the 'RegistrationDate' element value. Дата регистрации судна
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. Дата регистрации судна
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'RegistrationID' element value. Номер регистрации
     * 
     * @return value
     */
    public String getRegistrationID() {
        return registrationID;
    }

    /** 
     * Set the 'RegistrationID' element value. Номер регистрации
     * 
     * @param registrationID
     */
    public void setRegistrationID(String registrationID) {
        this.registrationID = registrationID;
    }

    /** 
     * Get the 'RegistrationPort' element value. Порт регистрации судна
     * 
     * @return value
     */
    public String getRegistrationPort() {
        return registrationPort;
    }

    /** 
     * Set the 'RegistrationPort' element value. Порт регистрации судна
     * 
     * @param registrationPort
     */
    public void setRegistrationPort(String registrationPort) {
        this.registrationPort = registrationPort;
    }

    /** 
     * Get the 'GrossTonnage' element value. Валовая вместимость (тоннаж)
     * 
     * @return value
     */
    public String getGrossTonnage() {
        return grossTonnage;
    }

    /** 
     * Set the 'GrossTonnage' element value. Валовая вместимость (тоннаж)
     * 
     * @param grossTonnage
     */
    public void setGrossTonnage(String grossTonnage) {
        this.grossTonnage = grossTonnage;
    }

    /** 
     * Get the 'NetTonnage' element value. Чистая вместимость (тоннаж)
     * 
     * @return value
     */
    public String getNetTonnage() {
        return netTonnage;
    }

    /** 
     * Set the 'NetTonnage' element value. Чистая вместимость (тоннаж)
     * 
     * @param netTonnage
     */
    public void setNetTonnage(String netTonnage) {
        this.netTonnage = netTonnage;
    }

    /** 
     * Get the 'IMO' element value. ИМО судна
     * 
     * @return value
     */
    public String getIMO() {
        return IMO;
    }

    /** 
     * Set the 'IMO' element value. ИМО судна
     * 
     * @param IMO
     */
    public void setIMO(String IMO) {
        this.IMO = IMO;
    }

    /** 
     * Get the 'Flag' element value. Флаг судна
     * 
     * @return value
     */
    public String getFlag() {
        return flag;
    }

    /** 
     * Set the 'Flag' element value. Флаг судна
     * 
     * @param flag
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /** 
     * Get the 'VesselType' element value. Тип судна
     * 
     * @return value
     */
    public String getVesselType1() {
        return vesselType1;
    }

    /** 
     * Set the 'VesselType' element value. Тип судна
     * 
     * @param vesselType1
     */
    public void setVesselType1(String vesselType1) {
        this.vesselType1 = vesselType1;
    }
}
