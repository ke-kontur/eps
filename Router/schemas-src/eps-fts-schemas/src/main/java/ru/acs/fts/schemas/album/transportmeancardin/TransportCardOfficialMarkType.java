
package ru.acs.fts.schemas.album.transportmeancardin;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * �������� ��. ���������� ������. ������� ����������� ������.
 */
public class TransportCardOfficialMarkType
{
    private String importCertificate;
    private LocalDate importCertificateDate;
    private String LNPImportCertificate;
    private String customsConditions;
    private String PTSNumber;
    private LocalDate PTSDate;
    private String LNP;
    private String customsMark;
    private GTDIDType GTDNumber;

    /** 
     * Get the 'ImportCertificate' element value. ������������� ����� ��
     * 
     * @return value
     */
    public String getImportCertificate() {
        return importCertificate;
    }

    /** 
     * Set the 'ImportCertificate' element value. ������������� ����� ��
     * 
     * @param importCertificate
     */
    public void setImportCertificate(String importCertificate) {
        this.importCertificate = importCertificate;
    }

    /** 
     * Get the 'ImportCertificateDate' element value. ���� ������ ������������� ����� ��.
     * 
     * @return value
     */
    public LocalDate getImportCertificateDate() {
        return importCertificateDate;
    }

    /** 
     * Set the 'ImportCertificateDate' element value. ���� ������ ������������� ����� ��.
     * 
     * @param importCertificateDate
     */
    public void setImportCertificateDate(LocalDate importCertificateDate) {
        this.importCertificateDate = importCertificateDate;
    }

    /** 
     * Get the 'LNPImportCertificate' element value. ��� ����������, ��������� ������������� �����.
     * 
     * @return value
     */
    public String getLNPImportCertificate() {
        return LNPImportCertificate;
    }

    /** 
     * Set the 'LNPImportCertificate' element value. ��� ����������, ��������� ������������� �����.
     * 
     * @param LNPImportCertificate
     */
    public void setLNPImportCertificate(String LNPImportCertificate) {
        this.LNPImportCertificate = LNPImportCertificate;
    }

    /** 
     * Get the 'CustomsConditions' element value. ���������� �����������.
     * 
     * @return value
     */
    public String getCustomsConditions() {
        return customsConditions;
    }

    /** 
     * Set the 'CustomsConditions' element value. ���������� �����������.
     * 
     * @param customsConditions
     */
    public void setCustomsConditions(String customsConditions) {
        this.customsConditions = customsConditions;
    }

    /** 
     * Get the 'PTSNumber' element value. ����� ��������
     * 
     * @return value
     */
    public String getPTSNumber() {
        return PTSNumber;
    }

    /** 
     * Set the 'PTSNumber' element value. ����� ��������
     * 
     * @param PTSNumber
     */
    public void setPTSNumber(String PTSNumber) {
        this.PTSNumber = PTSNumber;
    }

    /** 
     * Get the 'PTSDate' element value. ���� ������ ��������
     * 
     * @return value
     */
    public LocalDate getPTSDate() {
        return PTSDate;
    }

    /** 
     * Set the 'PTSDate' element value. ���� ������ ��������
     * 
     * @param PTSDate
     */
    public void setPTSDate(LocalDate PTSDate) {
        this.PTSDate = PTSDate;
    }

    /** 
     * Get the 'LNP' element value. ��� ����������, ��������� �������
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ��� ����������, ��������� �������
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }

    /** 
     * Get the 'CustomsMark' element value. ������ �������
     * 
     * @return value
     */
    public String getCustomsMark() {
        return customsMark;
    }

    /** 
     * Set the 'CustomsMark' element value. ������ �������
     * 
     * @param customsMark
     */
    public void setCustomsMark(String customsMark) {
        this.customsMark = customsMark;
    }

    /** 
     * Get the 'GTDNumber' element value. ��������������� ����� ��.
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ��������������� ����� ��.
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }
}
