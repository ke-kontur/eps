
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * ����� ��������/���������. �������� � ��������/ ������������� ������.
 */
public class WarehousePlaceType
{
    private String certificateNumber;
    private String customsOfficeID;
    private LocalDate certificateDate;

    /** 
     * Get the 'CertificateNumber' element value. ����� ���������, ������������������ � ��������� � ������
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. ����� ���������, ������������������ � ��������� � ������
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /** 
     * Get the 'CustomsOfficeID' element value. ��� ����������� ������ � ���� ������������ �������� ��������� ���.
     * 
     * @return value
     */
    public String getCustomsOfficeID() {
        return customsOfficeID;
    }

    /** 
     * Set the 'CustomsOfficeID' element value. ��� ����������� ������ � ���� ������������ �������� ��������� ���.
     * 
     * @param customsOfficeID
     */
    public void setCustomsOfficeID(String customsOfficeID) {
        this.customsOfficeID = customsOfficeID;
    }

    /** 
     * Get the 'CertificateDate' element value. ���� ������ ���������, ������������������ � ��������� � ������ ���������� ��� / �� 
     * 
     * @return value
     */
    public LocalDate getCertificateDate() {
        return certificateDate;
    }

    /** 
     * Set the 'CertificateDate' element value. ���� ������ ���������, ������������������ � ��������� � ������ ���������� ��� / �� 
     * 
     * @param certificateDate
     */
    public void setCertificateDate(LocalDate certificateDate) {
        this.certificateDate = certificateDate;
    }
}
