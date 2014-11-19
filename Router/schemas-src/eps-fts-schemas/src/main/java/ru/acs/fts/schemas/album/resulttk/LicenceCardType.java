
package ru.acs.fts.schemas.album.resulttk;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ������ �������� �������/������������ ��������
 */
public class LicenceCardType
{
    private String passKind;
    private String number;
    private String controlStatusName;
    private String duration;
    private String licenceStatusName;
    private DocumentBaseType certificate;

    /** 
     * Get the 'PassKind' element value. ��� ��������������
     * 
     * @return value
     */
    public String getPassKind() {
        return passKind;
    }

    /** 
     * Set the 'PassKind' element value. ��� ��������������
     * 
     * @param passKind
     */
    public void setPassKind(String passKind) {
        this.passKind = passKind;
    }

    /** 
     * Get the 'Number' element value. ����� �������� �������/������������ ��������
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. ����� �������� �������/������������ ��������
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'ControlStatusName' element value. ������ �������� �������� �������/������������ �������� (YES - ��; NO - ���; NOTREQUIRED - �� ���������; NOTVERIFIED - �� �����������)
     * 
     * @return value
     */
    public String getControlStatusName() {
        return controlStatusName;
    }

    /** 
     * Set the 'ControlStatusName' element value. ������ �������� �������� �������/������������ �������� (YES - ��; NO - ���; NOTREQUIRED - �� ���������; NOTVERIFIED - �� �����������)
     * 
     * @param controlStatusName
     */
    public void setControlStatusName(String controlStatusName) {
        this.controlStatusName = controlStatusName;
    }

    /** 
     * Get the 'Duration' element value. ���� �������� �������� �������/������������ ��������
     * 
     * @return value
     */
    public String getDuration() {
        return duration;
    }

    /** 
     * Set the 'Duration' element value. ���� �������� �������� �������/������������ ��������
     * 
     * @param duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /** 
     * Get the 'LicenceStatusName' element value. ������ �������� �������/������������ �������� (����� ���� �������� / �������������� / ������������)
     * 
     * @return value
     */
    public String getLicenceStatusName() {
        return licenceStatusName;
    }

    /** 
     * Set the 'LicenceStatusName' element value. ������ �������� �������/������������ �������� (����� ���� �������� / �������������� / ������������)
     * 
     * @param licenceStatusName
     */
    public void setLicenceStatusName(String licenceStatusName) {
        this.licenceStatusName = licenceStatusName;
    }

    /** 
     * Get the 'Certificate' element value. ����� ����������� �� �������� �������/������������ ��������
     * 
     * @return value
     */
    public DocumentBaseType getCertificate() {
        return certificate;
    }

    /** 
     * Set the 'Certificate' element value. ����� ����������� �� �������� �������/������������ ��������
     * 
     * @param certificate
     */
    public void setCertificate(DocumentBaseType certificate) {
        this.certificate = certificate;
    }
}
