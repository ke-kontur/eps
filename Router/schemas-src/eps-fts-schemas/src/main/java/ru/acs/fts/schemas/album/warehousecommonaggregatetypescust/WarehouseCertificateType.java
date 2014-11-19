
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.warehousecommonleaftypescust.WareHouseCertificateKind;

/** 
 * ����������� ��� ��� �������� ���������, �� ��������� �������� ������������ ���� ������������ �������� ������
 */
public class WarehouseCertificateType
{
    private WareHouseCertificateKind certificateKind;
    private String certificateNumber;
    private LocalDate certificateDate;

    /** 
     * Get the 'CertificateKind' element value. ��� ���������, �� ��������� �������� ������������ ���� ������������ �������� ������
     * 
     * @return value
     */
    public WareHouseCertificateKind getCertificateKind() {
        return certificateKind;
    }

    /** 
     * Set the 'CertificateKind' element value. ��� ���������, �� ��������� �������� ������������ ���� ������������ �������� ������
     * 
     * @param certificateKind
     */
    public void setCertificateKind(WareHouseCertificateKind certificateKind) {
        this.certificateKind = certificateKind;
    }

    /** 
     * Get the 'CertificateNumber' element value. ����� ������������� � ��������� � ������ / ����� �������� / ����� ������� � �������� ���
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. ����� ������������� � ��������� � ������ / ����� �������� / ����� ������� � �������� ���
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /** 
     * Get the 'CertificateDate' element value. ���� ���������, �� ��������� �������� ��������� ��������
     * 
     * @return value
     */
    public LocalDate getCertificateDate() {
        return certificateDate;
    }

    /** 
     * Set the 'CertificateDate' element value. ���� ���������, �� ��������� �������� ��������� ��������
     * 
     * @param certificateDate
     */
    public void setCertificateDate(LocalDate certificateDate) {
        this.certificateDate = certificateDate;
    }
}
