
package ru.acs.fts.schemas.album.transportmeanspassport;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� �� ����� �� � �����
 */
public class GIBDDRegistrationType
{
    private LocalDate strakeOffDate;
    private CertificateRegistrationType certificateRegistration;
    private PersonBaseType registrationSign;
    private PersonBaseType strikeOffSign;
    private PersonBaseType issuingDocuments;

    /** 
     * Get the 'StrakeOffDate' element value. ���� ������ � �����
     * 
     * @return value
     */
    public LocalDate getStrakeOffDate() {
        return strakeOffDate;
    }

    /** 
     * Set the 'StrakeOffDate' element value. ���� ������ � �����
     * 
     * @param strakeOffDate
     */
    public void setStrakeOffDate(LocalDate strakeOffDate) {
        this.strakeOffDate = strakeOffDate;
    }

    /** 
     * Get the 'CertificateRegistration' element value. ������������� � ����������� ��
     * 
     * @return value
     */
    public CertificateRegistrationType getCertificateRegistration() {
        return certificateRegistration;
    }

    /** 
     * Set the 'CertificateRegistration' element value. ������������� � ����������� ��
     * 
     * @param certificateRegistration
     */
    public void setCertificateRegistration(
            CertificateRegistrationType certificateRegistration) {
        this.certificateRegistration = certificateRegistration;
    }

    /** 
     * Get the 'RegistrationSign' element value. ������� ���  ����������� ��
     * 
     * @return value
     */
    public PersonBaseType getRegistrationSign() {
        return registrationSign;
    }

    /** 
     * Set the 'RegistrationSign' element value. ������� ���  ����������� ��
     * 
     * @param registrationSign
     */
    public void setRegistrationSign(PersonBaseType registrationSign) {
        this.registrationSign = registrationSign;
    }

    /** 
     * Get the 'StrikeOffSign' element value. ������� ���� ��� ������ � �����
     * 
     * @return value
     */
    public PersonBaseType getStrikeOffSign() {
        return strikeOffSign;
    }

    /** 
     * Set the 'StrikeOffSign' element value. ������� ���� ��� ������ � �����
     * 
     * @param strikeOffSign
     */
    public void setStrikeOffSign(PersonBaseType strikeOffSign) {
        this.strikeOffSign = strikeOffSign;
    }

    /** 
     * Get the 'IssuingDocuments' element value. ������� ����, ��������� ���.
     * 
     * @return value
     */
    public PersonBaseType getIssuingDocuments() {
        return issuingDocuments;
    }

    /** 
     * Set the 'IssuingDocuments' element value. ������� ����, ��������� ���.
     * 
     * @param issuingDocuments
     */
    public void setIssuingDocuments(PersonBaseType issuingDocuments) {
        this.issuingDocuments = issuingDocuments;
    }
}
