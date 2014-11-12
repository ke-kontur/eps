
package ru.acs.fts.schemas.album.indulgencestatement;

import org.joda.time.LocalDate;

/** 
 * �������� � ��������������� ����������� ������������ ����
 */
public class JuridicalPersonRegistrationType
{
    private String registrationOrganization;
    private LocalDate dateInf;
    private String place;
    private String certificateNumber;
    private String certificateSeriesCode;

    /** 
     * Get the 'RegistrationOrganization' element value. ������������ ��������������� ������
     * 
     * @return value
     */
    public String getRegistrationOrganization() {
        return registrationOrganization;
    }

    /** 
     * Set the 'RegistrationOrganization' element value. ������������ ��������������� ������
     * 
     * @param registrationOrganization
     */
    public void setRegistrationOrganization(String registrationOrganization) {
        this.registrationOrganization = registrationOrganization;
    }

    /** 
     * Get the 'DateInf' element value. ���� �����������
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. ���� �����������
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

    /** 
     * Get the 'Place' element value. ����� �����������
     * 
     * @return value
     */
    public String getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. ����� �����������
     * 
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /** 
     * Get the 'CertificateNumber' element value. ����� ������������� � ��������������� ����������� 
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. ����� ������������� � ��������������� ����������� 
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /** 
     * Get the 'CertificateSeriesCode' element value. ����� ������������� � ��������������� ����������� 
     * 
     * @return value
     */
    public String getCertificateSeriesCode() {
        return certificateSeriesCode;
    }

    /** 
     * Set the 'CertificateSeriesCode' element value. ����� ������������� � ��������������� ����������� 
     * 
     * @param certificateSeriesCode
     */
    public void setCertificateSeriesCode(String certificateSeriesCode) {
        this.certificateSeriesCode = certificateSeriesCode;
    }
}
