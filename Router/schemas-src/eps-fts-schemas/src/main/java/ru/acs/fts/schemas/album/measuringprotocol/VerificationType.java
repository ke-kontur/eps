
package ru.acs.fts.schemas.album.measuringprotocol;

import org.joda.time.LocalDate;

/** 
 * �������� � ������� �������� ���������
 */
public class VerificationType
{
    private LocalDate verificationDate;
    private String verificationOrg;
    private String verificationCertificate;

    /** 
     * Get the 'VerificationDate' element value. ���� �������
     * 
     * @return value
     */
    public LocalDate getVerificationDate() {
        return verificationDate;
    }

    /** 
     * Set the 'VerificationDate' element value. ���� �������
     * 
     * @param verificationDate
     */
    public void setVerificationDate(LocalDate verificationDate) {
        this.verificationDate = verificationDate;
    }

    /** 
     * Get the 'VerificationOrg' element value. ������������ ����������� ������
     * 
     * @return value
     */
    public String getVerificationOrg() {
        return verificationOrg;
    }

    /** 
     * Set the 'VerificationOrg' element value. ������������ ����������� ������
     * 
     * @param verificationOrg
     */
    public void setVerificationOrg(String verificationOrg) {
        this.verificationOrg = verificationOrg;
    }

    /** 
     * Get the 'VerificationCertificate' element value. ����� ������������� � �������
     * 
     * @return value
     */
    public String getVerificationCertificate() {
        return verificationCertificate;
    }

    /** 
     * Set the 'VerificationCertificate' element value. ����� ������������� � �������
     * 
     * @param verificationCertificate
     */
    public void setVerificationCertificate(String verificationCertificate) {
        this.verificationCertificate = verificationCertificate;
    }
}
