
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * ����������� ��� ��� �������� ������, �� ������� ��������� ������
 */
public class WarehouseType extends WHOrganizationBaseType
{
    private String certificateNumber;
    private LocalDate certificateDate;

    /** 
     * Get the 'CertificateNumber' element value. ����� ������������� � ��������� � ������ / ����� �������� / ����� ���������� ������� �� �� / ����� ������� � �������� ���
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. ����� ������������� � ��������� � ������ / ����� �������� / ����� ���������� ������� �� �� / ����� ������� � �������� ���
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /** 
     * Get the 'CertificateDate' element value. ���� ������ ������������� � ��������� � ������ ���������� ��� / �� / ���� ������ �������� 
     * 
     * @return value
     */
    public LocalDate getCertificateDate() {
        return certificateDate;
    }

    /** 
     * Set the 'CertificateDate' element value. ���� ������ ������������� � ��������� � ������ ���������� ��� / �� / ���� ������ �������� 
     * 
     * @param certificateDate
     */
    public void setCertificateDate(LocalDate certificateDate) {
        this.certificateDate = certificateDate;
    }
}
