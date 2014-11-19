
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * �� ������� �����
 */
public class RiskProfileRegNumberType
{
    private String divisionCode;
    private String documentSignCode;
    private LocalDate registryDate;
    private String sequenceNumber;
    private String versionNumber;

    /** 
     * Get the 'DivisionCode' element value. ��� ����������� ������, �������������� ��/���
     * 
     * @return value
     */
    public String getDivisionCode() {
        return divisionCode;
    }

    /** 
     * Set the 'DivisionCode' element value. ��� ����������� ������, �������������� ��/���
     * 
     * @param divisionCode
     */
    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    /** 
     * Get the 'DocumentSignCode' element value. ��� �������� ���������. ��������� ��������: 11 - �������������� ������� �����, 12 - ������������ ������� �����, 13 - ��������� ������� �����, 55 - ������� �����, ������������ � ����������, 20 - ������� ������� �����
     * 
     * @return value
     */
    public String getDocumentSignCode() {
        return documentSignCode;
    }

    /** 
     * Set the 'DocumentSignCode' element value. ��� �������� ���������. ��������� ��������: 11 - �������������� ������� �����, 12 - ������������ ������� �����, 13 - ��������� ������� �����, 55 - ������� �����, ������������ � ����������, 20 - ������� ������� �����
     * 
     * @param documentSignCode
     */
    public void setDocumentSignCode(String documentSignCode) {
        this.documentSignCode = documentSignCode;
    }

    /** 
     * Get the 'RegistryDate' element value. ���� ����������� ��/���
     * 
     * @return value
     */
    public LocalDate getRegistryDate() {
        return registryDate;
    }

    /** 
     * Set the 'RegistryDate' element value. ���� ����������� ��/���
     * 
     * @param registryDate
     */
    public void setRegistryDate(LocalDate registryDate) {
        this.registryDate = registryDate;
    }

    /** 
     * Get the 'SequenceNumber' element value. ���������� ����� ��/���
     * 
     * @return value
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /** 
     * Set the 'SequenceNumber' element value. ���������� ����� ��/���
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /** 
     * Get the 'VersionNumber' element value. ���������� ����� ������ ��/���
     * 
     * @return value
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /** 
     * Set the 'VersionNumber' element value. ���������� ����� ������ ��/���
     * 
     * @param versionNumber
     */
    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }
}
