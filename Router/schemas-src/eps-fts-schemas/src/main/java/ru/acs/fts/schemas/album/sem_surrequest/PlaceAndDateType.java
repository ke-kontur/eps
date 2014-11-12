
package ru.acs.fts.schemas.album.sem_surrequest;

import org.joda.time.LocalDate;

/** 
 * ����� � ���� ��.54
 */
public class PlaceAndDateType
{
    private String documentModeCode;
    private String certificateNumber;
    private LocalDate issueCertificateDate;
    private String agreemenNumber;
    private LocalDate conclusionAgreemenDate;
    private String INNID;
    private String KPPCode;

    /** 
     * Get the 'DocumentModeCode' element value. ��� ���������: 1 - ��������, 2 - �������������
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. ��� ���������: 1 - ��������, 2 - �������������
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }

    /** 
     * Get the 'CertificateNumber' element value. ����� ������������� � ��������� � ������ ���������� �������������� (��������)
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. ����� ������������� � ��������� � ������ ���������� �������������� (��������)
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /** 
     * Get the 'IssueCertificateDate' element value. ���� ������ ������������� � ��������� � ������ ���������� �������������� (��������)
     * 
     * @return value
     */
    public LocalDate getIssueCertificateDate() {
        return issueCertificateDate;
    }

    /** 
     * Set the 'IssueCertificateDate' element value. ���� ������ ������������� � ��������� � ������ ���������� �������������� (��������)
     * 
     * @param issueCertificateDate
     */
    public void setIssueCertificateDate(LocalDate issueCertificateDate) {
        this.issueCertificateDate = issueCertificateDate;
    }

    /** 
     * Get the 'AgreemenNumber' element value. ����� �������� ����������� ������������� (�������) � �����������
     * 
     * @return value
     */
    public String getAgreemenNumber() {
        return agreemenNumber;
    }

    /** 
     * Set the 'AgreemenNumber' element value. ����� �������� ����������� ������������� (�������) � �����������
     * 
     * @param agreemenNumber
     */
    public void setAgreemenNumber(String agreemenNumber) {
        this.agreemenNumber = agreemenNumber;
    }

    /** 
     * Get the 'ConclusionAgreemenDate' element value. ���� ���������� �������� ����������� ������������� (�������) � �����������
     * 
     * @return value
     */
    public LocalDate getConclusionAgreemenDate() {
        return conclusionAgreemenDate;
    }

    /** 
     * Set the 'ConclusionAgreemenDate' element value. ���� ���������� �������� ����������� ������������� (�������) � �����������
     * 
     * @param conclusionAgreemenDate
     */
    public void setConclusionAgreemenDate(LocalDate conclusionAgreemenDate) {
        this.conclusionAgreemenDate = conclusionAgreemenDate;
    }

    /** 
     * Get the 'INNID' element value. ��� ����������� ������������� (�������) 
     * 
     * @return value
     */
    public String getINNID() {
        return INNID;
    }

    /** 
     * Set the 'INNID' element value. ��� ����������� ������������� (�������) 
     * 
     * @param INNID
     */
    public void setINNID(String INNID) {
        this.INNID = INNID;
    }

    /** 
     * Get the 'KPPCode' element value. ��� ����������� ������������� (�������)
     * 
     * @return value
     */
    public String getKPPCode() {
        return KPPCode;
    }

    /** 
     * Set the 'KPPCode' element value. ��� ����������� ������������� (�������)
     * 
     * @param KPPCode
     */
    public void setKPPCode(String KPPCode) {
        this.KPPCode = KPPCode;
    }
}
