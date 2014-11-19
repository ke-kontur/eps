
package ru.acs.fts.schemas.album.generaldeclaration;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.VesselType;

/** 
 * ��������� � �������������� �����, �������� � ����������� �����
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
     * Get the 'RegistrationDate' element value. ���� ����������� �����
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. ���� ����������� �����
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'RegistrationID' element value. ����� �����������
     * 
     * @return value
     */
    public String getRegistrationID() {
        return registrationID;
    }

    /** 
     * Set the 'RegistrationID' element value. ����� �����������
     * 
     * @param registrationID
     */
    public void setRegistrationID(String registrationID) {
        this.registrationID = registrationID;
    }

    /** 
     * Get the 'RegistrationPort' element value. ���� ����������� �����
     * 
     * @return value
     */
    public String getRegistrationPort() {
        return registrationPort;
    }

    /** 
     * Set the 'RegistrationPort' element value. ���� ����������� �����
     * 
     * @param registrationPort
     */
    public void setRegistrationPort(String registrationPort) {
        this.registrationPort = registrationPort;
    }

    /** 
     * Get the 'GrossTonnage' element value. ������� ����������� (������)
     * 
     * @return value
     */
    public String getGrossTonnage() {
        return grossTonnage;
    }

    /** 
     * Set the 'GrossTonnage' element value. ������� ����������� (������)
     * 
     * @param grossTonnage
     */
    public void setGrossTonnage(String grossTonnage) {
        this.grossTonnage = grossTonnage;
    }

    /** 
     * Get the 'NetTonnage' element value. ������ ����������� (������)
     * 
     * @return value
     */
    public String getNetTonnage() {
        return netTonnage;
    }

    /** 
     * Set the 'NetTonnage' element value. ������ ����������� (������)
     * 
     * @param netTonnage
     */
    public void setNetTonnage(String netTonnage) {
        this.netTonnage = netTonnage;
    }

    /** 
     * Get the 'IMO' element value. ��� �����
     * 
     * @return value
     */
    public String getIMO() {
        return IMO;
    }

    /** 
     * Set the 'IMO' element value. ��� �����
     * 
     * @param IMO
     */
    public void setIMO(String IMO) {
        this.IMO = IMO;
    }

    /** 
     * Get the 'Flag' element value. ���� �����
     * 
     * @return value
     */
    public String getFlag() {
        return flag;
    }

    /** 
     * Set the 'Flag' element value. ���� �����
     * 
     * @param flag
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /** 
     * Get the 'VesselType' element value. ��� �����
     * 
     * @return value
     */
    public String getVesselType1() {
        return vesselType1;
    }

    /** 
     * Set the 'VesselType' element value. ��� �����
     * 
     * @param vesselType1
     */
    public void setVesselType1(String vesselType1) {
        this.vesselType1 = vesselType1;
    }
}
